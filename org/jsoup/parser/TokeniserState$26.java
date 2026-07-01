package org.jsoup.parser;

 enum TokeniserState$26
{
  TokeniserState$26()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matchesLetter())
    {
      paramTokeniser.createTagPending(false);
      paramTokeniser.tagPending.appendTagName(Character.toLowerCase(paramCharacterReader.current()));
      paramTokeniser.dataBuffer.append(paramCharacterReader.current());
      paramTokeniser.advanceTransition(ScriptDataEscapedEndTagName);
      return;
    }
    paramTokeniser.emit("</");
    paramTokeniser.transition(ScriptDataEscaped);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$26.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */