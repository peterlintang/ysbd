package org.jsoup.parser;

 enum TokeniserState$41
{
  TokeniserState$41()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    switch (paramCharacterReader.consume())
    {
    default: 
      paramTokeniser.error(this);
      paramCharacterReader.unconsume();
      paramTokeniser.transition(BeforeAttributeName);
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
    }
    paramTokeniser.eofError(this);
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$41.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */