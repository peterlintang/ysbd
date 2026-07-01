package org.jsoup.parser;

 enum TokeniserState$31
{
  TokeniserState$31()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    char c = paramCharacterReader.consume();
    switch (c)
    {
    default: 
      paramTokeniser.emit(c);
      paramTokeniser.transition(ScriptDataDoubleEscaped);
      return;
    case '-': 
      paramTokeniser.emit(c);
      return;
    case '<': 
      paramTokeniser.emit(c);
      paramTokeniser.transition(ScriptDataDoubleEscapedLessthanSign);
      return;
    case '>': 
      paramTokeniser.emit(c);
      paramTokeniser.transition(ScriptData);
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramTokeniser.emit(65533);
      paramTokeniser.transition(ScriptDataDoubleEscaped);
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */