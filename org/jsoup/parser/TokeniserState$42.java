package org.jsoup.parser;

 enum TokeniserState$42
{
  TokeniserState$42()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    switch (paramCharacterReader.consume())
    {
    default: 
      paramTokeniser.error(this);
      paramTokeniser.transition(BeforeAttributeName);
      return;
    case '>': 
      paramTokeniser.tagPending.selfClosing = true;
      paramTokeniser.emitTagPending();
      paramTokeniser.transition(Data);
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */