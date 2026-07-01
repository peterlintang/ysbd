package org.jsoup.parser;

 enum TokeniserState$64
{
  TokeniserState$64()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    char c = paramCharacterReader.consume();
    switch (c)
    {
    default: 
      paramTokeniser.doctypePending.systemIdentifier.append(c);
      return;
    case '\'': 
      paramTokeniser.transition(AfterDoctypeSystemIdentifier);
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramTokeniser.doctypePending.systemIdentifier.append(65533);
      return;
    case '>': 
      paramTokeniser.error(this);
      paramTokeniser.doctypePending.forceQuirks = true;
      paramTokeniser.emitDoctypePending();
      paramTokeniser.transition(Data);
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.doctypePending.forceQuirks = true;
    paramTokeniser.emitDoctypePending();
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$64.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */