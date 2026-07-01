package org.jsoup.parser;

 enum TokeniserState$52
{
  TokeniserState$52()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matchesLetter())
    {
      paramTokeniser.createDoctypePending();
      paramTokeniser.transition(DoctypeName);
      return;
    }
    char c = paramCharacterReader.consume();
    switch (c)
    {
    case '\t': 
    case '\n': 
    case '\f': 
    case '\r': 
    case ' ': 
    default: 
      paramTokeniser.createDoctypePending();
      paramTokeniser.doctypePending.name.append(c);
      paramTokeniser.transition(DoctypeName);
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramTokeniser.doctypePending.name.append(65533);
      paramTokeniser.transition(DoctypeName);
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.createDoctypePending();
    paramTokeniser.doctypePending.forceQuirks = true;
    paramTokeniser.emitDoctypePending();
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */