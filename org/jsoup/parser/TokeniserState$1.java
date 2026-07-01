package org.jsoup.parser;

 enum TokeniserState$1
{
  TokeniserState$1()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    switch (paramCharacterReader.current())
    {
    default: 
      paramTokeniser.emit(paramCharacterReader.consumeToAny(new char[] { 38, 60, 0 }));
      return;
    case '&': 
      paramTokeniser.advanceTransition(CharacterReferenceInData);
      return;
    case '<': 
      paramTokeniser.advanceTransition(TagOpen);
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramTokeniser.emit(paramCharacterReader.consume());
      return;
    }
    paramTokeniser.emit(new Token.EOF());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */