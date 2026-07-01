package org.jsoup.parser;

 enum TokeniserState$12
{
  TokeniserState$12()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matchesLetter())
    {
      paramTokeniser.createTagPending(false);
      paramTokeniser.tagPending.appendTagName(Character.toLowerCase(paramCharacterReader.current()));
      paramTokeniser.dataBuffer.append(Character.toLowerCase(paramCharacterReader.current()));
      paramTokeniser.advanceTransition(RCDATAEndTagName);
      return;
    }
    paramTokeniser.emit("</");
    paramTokeniser.transition(Rcdata);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */