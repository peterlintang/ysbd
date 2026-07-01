package org.jsoup.parser;

 enum TokeniserState$51
{
  TokeniserState$51()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    switch (paramCharacterReader.consume())
    {
    default: 
      paramTokeniser.error(this);
      paramTokeniser.transition(BeforeDoctypeName);
      return;
    case '\t': 
    case '\n': 
    case '\f': 
    case '\r': 
    case ' ': 
      paramTokeniser.transition(BeforeDoctypeName);
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.createDoctypePending();
    paramTokeniser.doctypePending.forceQuirks = true;
    paramTokeniser.emitDoctypePending();
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */