package org.jsoup.parser;

 enum TokeniserState$17
{
  TokeniserState$17()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    switch (paramCharacterReader.consume())
    {
    default: 
      paramTokeniser.emit("<");
      paramCharacterReader.unconsume();
      paramTokeniser.transition(ScriptData);
      return;
    case '/': 
      paramTokeniser.createTempBuffer();
      paramTokeniser.transition(ScriptDataEndTagOpen);
      return;
    }
    paramTokeniser.emit("<!");
    paramTokeniser.transition(ScriptDataEscapeStart);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$17.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */