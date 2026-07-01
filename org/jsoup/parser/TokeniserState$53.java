package org.jsoup.parser;

 enum TokeniserState$53
{
  TokeniserState$53()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matchesLetter())
    {
      paramCharacterReader = paramCharacterReader.consumeLetterSequence();
      paramTokeniser.doctypePending.name.append(paramCharacterReader.toLowerCase());
      return;
    }
    char c = paramCharacterReader.consume();
    switch (c)
    {
    default: 
      paramTokeniser.doctypePending.name.append(c);
      return;
    case '>': 
      paramTokeniser.emitDoctypePending();
      paramTokeniser.transition(Data);
      return;
    case '\t': 
    case '\n': 
    case '\f': 
    case '\r': 
    case ' ': 
      paramTokeniser.transition(AfterDoctypeName);
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramTokeniser.doctypePending.name.append(65533);
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.doctypePending.forceQuirks = true;
    paramTokeniser.emitDoctypePending();
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$53.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */