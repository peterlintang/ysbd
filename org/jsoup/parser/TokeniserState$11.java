package org.jsoup.parser;

 enum TokeniserState$11
{
  TokeniserState$11()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matches('/'))
    {
      paramTokeniser.createTempBuffer();
      paramTokeniser.advanceTransition(RCDATAEndTagOpen);
      return;
    }
    if ((paramCharacterReader.matchesLetter()) && (!paramCharacterReader.containsIgnoreCase("</" + paramTokeniser.appropriateEndTagName())))
    {
      paramTokeniser.tagPending = new Token.EndTag(paramTokeniser.appropriateEndTagName());
      paramTokeniser.emitTagPending();
      paramCharacterReader.unconsume();
      paramTokeniser.transition(Data);
      return;
    }
    paramTokeniser.emit("<");
    paramTokeniser.transition(Rcdata);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */