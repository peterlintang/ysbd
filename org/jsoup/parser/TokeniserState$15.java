package org.jsoup.parser;

 enum TokeniserState$15
{
  TokeniserState$15()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matchesLetter())
    {
      paramTokeniser.createTagPending(false);
      paramTokeniser.transition(RawtextEndTagName);
      return;
    }
    paramTokeniser.emit("</");
    paramTokeniser.transition(Rawtext);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$15.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */