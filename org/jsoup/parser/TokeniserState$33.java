package org.jsoup.parser;

 enum TokeniserState$33
{
  TokeniserState$33()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matchesLetter())
    {
      paramCharacterReader = paramCharacterReader.consumeLetterSequence();
      paramTokeniser.dataBuffer.append(paramCharacterReader.toLowerCase());
      paramTokeniser.emit(paramCharacterReader);
      return;
    }
    char c = paramCharacterReader.consume();
    switch (c)
    {
    default: 
      paramCharacterReader.unconsume();
      paramTokeniser.transition(ScriptDataDoubleEscaped);
      return;
    }
    if (paramTokeniser.dataBuffer.toString().equals("script")) {
      paramTokeniser.transition(ScriptDataEscaped);
    }
    for (;;)
    {
      paramTokeniser.emit(c);
      return;
      paramTokeniser.transition(ScriptDataDoubleEscaped);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$33.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */