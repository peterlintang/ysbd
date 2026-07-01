package org.jsoup.parser;

 enum TokeniserState$14
{
  TokeniserState$14()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matches('/'))
    {
      paramTokeniser.createTempBuffer();
      paramTokeniser.advanceTransition(RawtextEndTagOpen);
      return;
    }
    paramTokeniser.emit('<');
    paramTokeniser.transition(Rawtext);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$14.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */