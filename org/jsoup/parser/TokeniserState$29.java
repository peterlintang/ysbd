package org.jsoup.parser;

 enum TokeniserState$29
{
  TokeniserState$29()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    char c = paramCharacterReader.current();
    switch (c)
    {
    default: 
      paramTokeniser.emit(paramCharacterReader.consumeToAny(new char[] { 45, 60, 0 }));
      return;
    case '-': 
      paramTokeniser.emit(c);
      paramTokeniser.advanceTransition(ScriptDataDoubleEscapedDash);
      return;
    case '<': 
      paramTokeniser.emit(c);
      paramTokeniser.advanceTransition(ScriptDataDoubleEscapedLessthanSign);
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramCharacterReader.advance();
      paramTokeniser.emit(65533);
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$29.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */