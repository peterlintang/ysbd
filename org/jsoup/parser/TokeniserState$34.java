package org.jsoup.parser;

 enum TokeniserState$34
{
  TokeniserState$34()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    char c = paramCharacterReader.consume();
    switch (c)
    {
    default: 
    case '\t': 
    case '\n': 
    case '\f': 
    case '\r': 
    case ' ': 
    case '/': 
    case '>': 
    case '\000': 
      for (;;)
      {
        paramTokeniser.tagPending.newAttribute();
        paramCharacterReader.unconsume();
        paramTokeniser.transition(AttributeName);
        return;
        paramTokeniser.transition(SelfClosingStartTag);
        return;
        paramTokeniser.emitTagPending();
        paramTokeniser.transition(Data);
        return;
        paramTokeniser.error(this);
      }
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$34.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */