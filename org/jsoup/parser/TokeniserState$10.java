package org.jsoup.parser;

 enum TokeniserState$10
{
  TokeniserState$10()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    String str = paramCharacterReader.consumeToAny(new char[] { 9, 10, 13, 12, 32, 47, 62, 0 }).toLowerCase();
    paramTokeniser.tagPending.appendTagName(str);
    switch (paramCharacterReader.consume())
    {
    default: 
      return;
    case '\t': 
    case '\n': 
    case '\f': 
    case '\r': 
    case ' ': 
      paramTokeniser.transition(BeforeAttributeName);
      return;
    case '/': 
      paramTokeniser.transition(SelfClosingStartTag);
      return;
    case '>': 
      paramTokeniser.emitTagPending();
      paramTokeniser.transition(Data);
      return;
    case '\000': 
      paramTokeniser.tagPending.appendTagName(TokeniserState.access$100());
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */