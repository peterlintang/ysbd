package org.jsoup.select;

import org.jsoup.nodes.Element;

public class Collector
{
  public static Elements collect(Evaluator paramEvaluator, Element paramElement)
  {
    Elements localElements = new Elements();
    new NodeTraversor(new Collector.Accumulator(paramElement, localElements, paramEvaluator)).traverse(paramElement);
    return localElements;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\select\Collector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */