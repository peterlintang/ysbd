package org.jsoup.parser;

 enum TokeniserState$36
{
  TokeniserState$36()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    char c = paramCharacterReader.consume();
    switch (c)
    {
    default: 
      paramTokeniser.tagPending.newAttribute();
      paramCharacterReader.unconsume();
      paramTokeniser.transition(AttributeName);
    case '\t': 
    case '\n': 
    case '\f': 
    case '\r': 
    case ' ': 
      return;
    case '/': 
      paramTokeniser.transition(SelfClosingStartTag);
      return;
    case '=': 
      paramTokeniser.transition(BeforeAttributeValue);
      return;
    case '>': 
      paramTokeniser.emitTagPending();
      paramTokeniser.transition(Data);
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramTokeniser.tagPending.appendAttributeName(65533);
      paramTokeniser.transition(AttributeName);
      return;
    case '￿': 
      paramTokeniser.eofError(this);
      paramTokeniser.transition(Data);
      return;
    }
    paramTokeniser.error(this);
    paramTokeniser.tagPending.newAttribute();
    paramTokeniser.tagPending.appendAttributeName(c);
    paramTokeniser.transition(AttributeName);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$36.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */