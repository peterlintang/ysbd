package org.jsoup.select;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.TokenQueue;

class QueryParser
{
  private static final String[] combinators = { ",", ">", "+", "~", " " };
  private List<Evaluator> evals = new ArrayList();
  private String query;
  private TokenQueue tq;
  
  private QueryParser(String paramString)
  {
    this.query = paramString;
    this.tq = new TokenQueue(paramString);
  }
  
  private void allElements()
  {
    this.evals.add(new Evaluator.AllElements());
  }
  
  private void byAttribute()
  {
    TokenQueue localTokenQueue = new TokenQueue(this.tq.chompBalanced('[', ']'));
    String str = localTokenQueue.consumeToAny(new String[] { "=", "!=", "^=", "$=", "*=", "~=" });
    Validate.notEmpty(str);
    localTokenQueue.consumeWhitespace();
    if (localTokenQueue.isEmpty())
    {
      if (str.startsWith("^"))
      {
        this.evals.add(new Evaluator.AttributeStarting(str.substring(1)));
        return;
      }
      this.evals.add(new Evaluator.Attribute(str));
      return;
    }
    if (localTokenQueue.matchChomp("="))
    {
      this.evals.add(new Evaluator.AttributeWithValue(str, localTokenQueue.remainder()));
      return;
    }
    if (localTokenQueue.matchChomp("!="))
    {
      this.evals.add(new Evaluator.AttributeWithValueNot(str, localTokenQueue.remainder()));
      return;
    }
    if (localTokenQueue.matchChomp("^="))
    {
      this.evals.add(new Evaluator.AttributeWithValueStarting(str, localTokenQueue.remainder()));
      return;
    }
    if (localTokenQueue.matchChomp("$="))
    {
      this.evals.add(new Evaluator.AttributeWithValueEnding(str, localTokenQueue.remainder()));
      return;
    }
    if (localTokenQueue.matchChomp("*="))
    {
      this.evals.add(new Evaluator.AttributeWithValueContaining(str, localTokenQueue.remainder()));
      return;
    }
    if (localTokenQueue.matchChomp("~="))
    {
      this.evals.add(new Evaluator.AttributeWithValueMatching(str, Pattern.compile(localTokenQueue.remainder())));
      return;
    }
    throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", new Object[] { this.query, localTokenQueue.remainder() });
  }
  
  private void byClass()
  {
    String str = this.tq.consumeCssIdentifier();
    Validate.notEmpty(str);
    this.evals.add(new Evaluator.Class(str.trim().toLowerCase()));
  }
  
  private void byId()
  {
    String str = this.tq.consumeCssIdentifier();
    Validate.notEmpty(str);
    this.evals.add(new Evaluator.Id(str));
  }
  
  private void byTag()
  {
    String str2 = this.tq.consumeElementSelector();
    Validate.notEmpty(str2);
    String str1 = str2;
    if (str2.contains("|")) {
      str1 = str2.replace("|", ":");
    }
    this.evals.add(new Evaluator.Tag(str1.trim().toLowerCase()));
  }
  
  private void combinator(char paramChar)
  {
    this.tq.consumeWhitespace();
    Evaluator localEvaluator = parse(consumeSubQuery());
    Object localObject1;
    Object localObject3;
    int i;
    Object localObject2;
    if (this.evals.size() == 1)
    {
      localObject1 = (Evaluator)this.evals.get(0);
      if ((!(localObject1 instanceof CombiningEvaluator.Or)) || (paramChar == ',')) {
        break label363;
      }
      localObject3 = ((CombiningEvaluator.Or)localObject1).rightMostEvaluator();
      i = 1;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
    for (;;)
    {
      this.evals.clear();
      if (paramChar == '>')
      {
        localObject1 = new CombiningEvaluator.And(new Evaluator[] { localEvaluator, new StructuralEvaluator.ImmediateParent((Evaluator)localObject1) });
        label117:
        if (i == 0) {
          break label357;
        }
        ((CombiningEvaluator.Or)localObject2).replaceRightMostEvaluator((Evaluator)localObject1);
      }
      for (;;)
      {
        this.evals.add(localObject2);
        return;
        localObject1 = new CombiningEvaluator.And(this.evals);
        i = 0;
        localObject2 = localObject1;
        break;
        if (paramChar == ' ')
        {
          localObject1 = new CombiningEvaluator.And(new Evaluator[] { localEvaluator, new StructuralEvaluator.Parent((Evaluator)localObject1) });
          break label117;
        }
        if (paramChar == '+')
        {
          localObject1 = new CombiningEvaluator.And(new Evaluator[] { localEvaluator, new StructuralEvaluator.ImmediatePreviousSibling((Evaluator)localObject1) });
          break label117;
        }
        if (paramChar == '~')
        {
          localObject1 = new CombiningEvaluator.And(new Evaluator[] { localEvaluator, new StructuralEvaluator.PreviousSibling((Evaluator)localObject1) });
          break label117;
        }
        if (paramChar == ',')
        {
          if ((localObject1 instanceof CombiningEvaluator.Or))
          {
            localObject1 = (CombiningEvaluator.Or)localObject1;
            ((CombiningEvaluator.Or)localObject1).add(localEvaluator);
          }
          for (;;)
          {
            break;
            localObject3 = new CombiningEvaluator.Or();
            ((CombiningEvaluator.Or)localObject3).add((Evaluator)localObject1);
            ((CombiningEvaluator.Or)localObject3).add(localEvaluator);
            localObject1 = localObject3;
          }
        }
        throw new Selector.SelectorParseException("Unknown combinator: " + paramChar, new Object[0]);
        label357:
        localObject2 = localObject1;
      }
      label363:
      i = 0;
      localObject2 = localObject1;
    }
  }
  
  private int consumeIndex()
  {
    String str = this.tq.chompTo(")").trim();
    Validate.isTrue(StringUtil.isNumeric(str), "Index must be numeric");
    return Integer.parseInt(str);
  }
  
  private String consumeSubQuery()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    while (!this.tq.isEmpty()) {
      if (this.tq.matches("("))
      {
        localStringBuilder.append("(").append(this.tq.chompBalanced('(', ')')).append(")");
      }
      else if (this.tq.matches("["))
      {
        localStringBuilder.append("[").append(this.tq.chompBalanced('[', ']')).append("]");
      }
      else
      {
        if (this.tq.matchesAny(combinators)) {
          break;
        }
        localStringBuilder.append(this.tq.consume());
      }
    }
    return localStringBuilder.toString();
  }
  
  private void contains(boolean paramBoolean)
  {
    TokenQueue localTokenQueue = this.tq;
    if (paramBoolean) {}
    for (String str = ":containsOwn";; str = ":contains")
    {
      localTokenQueue.consume(str);
      str = TokenQueue.unescape(this.tq.chompBalanced('(', ')'));
      Validate.notEmpty(str, ":contains(text) query must not be empty");
      if (!paramBoolean) {
        break;
      }
      this.evals.add(new Evaluator.ContainsOwnText(str));
      return;
    }
    this.evals.add(new Evaluator.ContainsText(str));
  }
  
  private void findElements()
  {
    if (this.tq.matchChomp("#"))
    {
      byId();
      return;
    }
    if (this.tq.matchChomp("."))
    {
      byClass();
      return;
    }
    if (this.tq.matchesWord())
    {
      byTag();
      return;
    }
    if (this.tq.matches("["))
    {
      byAttribute();
      return;
    }
    if (this.tq.matchChomp("*"))
    {
      allElements();
      return;
    }
    if (this.tq.matchChomp(":lt("))
    {
      indexLessThan();
      return;
    }
    if (this.tq.matchChomp(":gt("))
    {
      indexGreaterThan();
      return;
    }
    if (this.tq.matchChomp(":eq("))
    {
      indexEquals();
      return;
    }
    if (this.tq.matches(":has("))
    {
      has();
      return;
    }
    if (this.tq.matches(":contains("))
    {
      contains(false);
      return;
    }
    if (this.tq.matches(":containsOwn("))
    {
      contains(true);
      return;
    }
    if (this.tq.matches(":matches("))
    {
      matches(false);
      return;
    }
    if (this.tq.matches(":matchesOwn("))
    {
      matches(true);
      return;
    }
    if (this.tq.matches(":not("))
    {
      not();
      return;
    }
    throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", new Object[] { this.query, this.tq.remainder() });
  }
  
  private void has()
  {
    this.tq.consume(":has");
    String str = this.tq.chompBalanced('(', ')');
    Validate.notEmpty(str, ":has(el) subselect must not be empty");
    this.evals.add(new StructuralEvaluator.Has(parse(str)));
  }
  
  private void indexEquals()
  {
    this.evals.add(new Evaluator.IndexEquals(consumeIndex()));
  }
  
  private void indexGreaterThan()
  {
    this.evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
  }
  
  private void indexLessThan()
  {
    this.evals.add(new Evaluator.IndexLessThan(consumeIndex()));
  }
  
  private void matches(boolean paramBoolean)
  {
    TokenQueue localTokenQueue = this.tq;
    if (paramBoolean) {}
    for (String str = ":matchesOwn";; str = ":matches")
    {
      localTokenQueue.consume(str);
      str = this.tq.chompBalanced('(', ')');
      Validate.notEmpty(str, ":matches(regex) query must not be empty");
      if (!paramBoolean) {
        break;
      }
      this.evals.add(new Evaluator.MatchesOwn(Pattern.compile(str)));
      return;
    }
    this.evals.add(new Evaluator.Matches(Pattern.compile(str)));
  }
  
  private void not()
  {
    this.tq.consume(":not");
    String str = this.tq.chompBalanced('(', ')');
    Validate.notEmpty(str, ":not(selector) subselect must not be empty");
    this.evals.add(new StructuralEvaluator.Not(parse(str)));
  }
  
  public static Evaluator parse(String paramString)
  {
    return new QueryParser(paramString).parse();
  }
  
  Evaluator parse()
  {
    this.tq.consumeWhitespace();
    if (this.tq.matchesAny(combinators))
    {
      this.evals.add(new StructuralEvaluator.Root());
      combinator(this.tq.consume());
    }
    while (!this.tq.isEmpty())
    {
      boolean bool = this.tq.consumeWhitespace();
      if (this.tq.matchesAny(combinators))
      {
        combinator(this.tq.consume());
        continue;
        findElements();
      }
      else if (bool)
      {
        combinator(' ');
      }
      else
      {
        findElements();
      }
    }
    if (this.evals.size() == 1) {
      return (Evaluator)this.evals.get(0);
    }
    return new CombiningEvaluator.And(this.evals);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\select\QueryParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */