package org.jsoup.parser;

 enum TokeniserState$67
{
  TokeniserState$67()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    paramTokeniser.emit(paramCharacterReader.consumeTo("]]>"));
    paramCharacterReader.matchConsume("]]>");
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$67.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */