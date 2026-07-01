package org.jsoup.parser;

 enum TokeniserState$24
{
  TokeniserState$24()
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
    char c = paramCharacterReader.consume();
    switch (c)
    {
    default: 
      paramTokeniser.emit(c);
      paramTokeniser.transition(ScriptDataEscaped);
      return;
    case '-': 
      paramTokeniser.emit(c);
      return;
    case '<': 
      paramTokeniser.transition(ScriptDataEscapedLessthanSign);
      return;
    case '>': 
      paramTokeniser.emit(c);
      paramTokeniser.transition(ScriptData);
      return;
    }
    paramTokeniser.error(this);
    paramTokeniser.emit(65533);
    paramTokeniser.transition(ScriptDataEscaped);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$24.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */