package org.jsoup.parser;

 enum TokeniserState$25
{
  TokeniserState$25()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matchesLetter())
    {
      paramTokeniser.createTempBuffer();
      paramTokeniser.dataBuffer.append(Character.toLowerCase(paramCharacterReader.current()));
      paramTokeniser.emit("<" + paramCharacterReader.current());
      paramTokeniser.advanceTransition(ScriptDataDoubleEscapeStart);
      return;
    }
    if (paramCharacterReader.matches('/'))
    {
      paramTokeniser.createTempBuffer();
      paramTokeniser.advanceTransition(ScriptDataEscapedEndTagOpen);
      return;
    }
    paramTokeniser.emit('<');
    paramTokeniser.transition(ScriptDataEscaped);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$25.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */