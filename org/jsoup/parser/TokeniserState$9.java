package org.jsoup.parser;

 enum TokeniserState$9
{
  TokeniserState$9()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.isEmpty())
    {
      paramTokeniser.eofError(this);
      paramTokeniser.emit("</");
      paramTokeniser.transition(Data);
      return;
    }
    if (paramCharacterReader.matchesLetter())
    {
      paramTokeniser.createTagPending(false);
      paramTokeniser.transition(TagName);
      return;
    }
    if (paramCharacterReader.matches('>'))
    {
      paramTokeniser.error(this);
      paramTokeniser.advanceTransition(Data);
      return;
    }
    paramTokeniser.error(this);
    paramTokeniser.advanceTransition(BogusComment);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */