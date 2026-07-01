package org.jsoup.parser;

 enum TokeniserState$22
{
  TokeniserState$22()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.isEmpty())
    {
      paramTokeniser.eofError(this);
      paramTokeniser.transition(Data);
      return;
    }
    switch (paramCharacterReader.current())
    {
    default: 
      paramTokeniser.emit(paramCharacterReader.consumeToAny(new char[] { 45, 60, 0 }));
      return;
    case '-': 
      paramTokeniser.emit('-');
      paramTokeniser.advanceTransition(ScriptDataEscapedDash);
      return;
    case '<': 
      paramTokeniser.advanceTransition(ScriptDataEscapedLessthanSign);
      return;
    }
    paramTokeniser.error(this);
    paramCharacterReader.advance();
    paramTokeniser.emit(65533);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */