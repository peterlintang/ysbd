package org.jsoup.parser;

 enum TokeniserState$4
{
  TokeniserState$4()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    paramCharacterReader = paramTokeniser.consumeCharacterReference(null, false);
    if (paramCharacterReader == null) {
      paramTokeniser.emit('&');
    }
    for (;;)
    {
      paramTokeniser.transition(Rcdata);
      return;
      paramTokeniser.emit(paramCharacterReader.charValue());
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */