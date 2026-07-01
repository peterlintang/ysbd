package org.jsoup.parser;

 enum TokeniserState$61
{
  TokeniserState$61()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    switch (paramCharacterReader.consume())
    {
    default: 
      paramTokeniser.error(this);
      paramTokeniser.doctypePending.forceQuirks = true;
      paramTokeniser.emitDoctypePending();
      return;
    case '\t': 
    case '\n': 
    case '\f': 
    case '\r': 
    case ' ': 
      paramTokeniser.transition(BeforeDoctypeSystemIdentifier);
      return;
    case '>': 
      paramTokeniser.error(this);
      paramTokeniser.doctypePending.forceQuirks = true;
      paramTokeniser.emitDoctypePending();
      paramTokeniser.transition(Data);
      return;
    case '"': 
      paramTokeniser.error(this);
      paramTokeniser.transition(DoctypeSystemIdentifier_doubleQuoted);
      return;
    case '\'': 
      paramTokeniser.error(this);
      paramTokeniser.transition(DoctypeSystemIdentifier_singleQuoted);
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.doctypePending.forceQuirks = true;
    paramTokeniser.emitDoctypePending();
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */