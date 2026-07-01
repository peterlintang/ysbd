package org.jsoup.parser;

 enum TokeniserState$66
{
  TokeniserState$66()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    switch (paramCharacterReader.consume())
    {
    default: 
      return;
    case '>': 
      paramTokeniser.emitDoctypePending();
      paramTokeniser.transition(Data);
      return;
    }
    paramTokeniser.emitDoctypePending();
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$66.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */