package org.jsoup.parser;

 enum TokeniserState$35
{
  TokeniserState$35()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    String str = paramCharacterReader.consumeToAny(new char[] { 9, 10, 13, 12, 32, 47, 61, 62, 0, 34, 39, 60 });
    paramTokeniser.tagPending.appendAttributeName(str.toLowerCase());
    char c = paramCharacterReader.consume();
    switch (c)
    {
    default: 
      return;
    case '\t': 
    case '\n': 
    case '\f': 
    case '\r': 
    case ' ': 
      paramTokeniser.transition(AfterAttributeName);
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
      return;
    case '￿': 
      paramTokeniser.eofError(this);
      paramTokeniser.transition(Data);
      return;
    }
    paramTokeniser.error(this);
    paramTokeniser.tagPending.appendAttributeName(c);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$35.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */