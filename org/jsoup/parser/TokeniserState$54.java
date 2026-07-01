package org.jsoup.parser;

 enum TokeniserState$54
{
  TokeniserState$54()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.isEmpty())
    {
      paramTokeniser.eofError(this);
      paramTokeniser.doctypePending.forceQuirks = true;
      paramTokeniser.emitDoctypePending();
      paramTokeniser.transition(Data);
      return;
    }
    if (paramCharacterReader.matchesAny(new char[] { 9, 10, 13, 12, 32 }))
    {
      paramCharacterReader.advance();
      return;
    }
    if (paramCharacterReader.matches('>'))
    {
      paramTokeniser.emitDoctypePending();
      paramTokeniser.advanceTransition(Data);
      return;
    }
    if (paramCharacterReader.matchConsumeIgnoreCase("PUBLIC"))
    {
      paramTokeniser.transition(AfterDoctypePublicKeyword);
      return;
    }
    if (paramCharacterReader.matchConsumeIgnoreCase("SYSTEM"))
    {
      paramTokeniser.transition(AfterDoctypeSystemKeyword);
      return;
    }
    paramTokeniser.error(this);
    paramTokeniser.doctypePending.forceQuirks = true;
    paramTokeniser.advanceTransition(BogusDoctype);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$54.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */