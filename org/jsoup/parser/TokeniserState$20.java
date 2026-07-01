package org.jsoup.parser;

 enum TokeniserState$20
{
  TokeniserState$20()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matches('-'))
    {
      paramTokeniser.emit('-');
      paramTokeniser.advanceTransition(ScriptDataEscapeStartDash);
      return;
    }
    paramTokeniser.transition(ScriptData);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */