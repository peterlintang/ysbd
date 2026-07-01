package org.jsoup.parser;

 enum TokeniserState$32
{
  TokeniserState$32()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matches('/'))
    {
      paramTokeniser.emit('/');
      paramTokeniser.createTempBuffer();
      paramTokeniser.advanceTransition(ScriptDataDoubleEscapeEnd);
      return;
    }
    paramTokeniser.transition(ScriptDataDoubleEscaped);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */