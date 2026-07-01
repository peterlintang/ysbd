package org.jsoup.parser;

 enum TokeniserState$7
{
  TokeniserState$7()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    switch (paramCharacterReader.current())
    {
    default: 
      paramTokeniser.emit(paramCharacterReader.consumeTo('\000'));
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramCharacterReader.advance();
      paramTokeniser.emit(65533);
      return;
    }
    paramTokeniser.emit(new Token.EOF());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */