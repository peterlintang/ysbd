package org.jsoup.parser;

 enum TokeniserState$38
{
  TokeniserState$38()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    String str = paramCharacterReader.consumeToAny(new char[] { 34, 38, 0 });
    if (str.length() > 0) {
      paramTokeniser.tagPending.appendAttributeValue(str);
    }
    switch (paramCharacterReader.consume())
    {
    default: 
      return;
    case '"': 
      paramTokeniser.transition(AfterAttributeValue_quoted);
      return;
    case '&': 
      paramCharacterReader = paramTokeniser.consumeCharacterReference(Character.valueOf('"'), true);
      if (paramCharacterReader != null)
      {
        paramTokeniser.tagPending.appendAttributeValue(paramCharacterReader.charValue());
        return;
      }
      paramTokeniser.tagPending.appendAttributeValue('&');
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramTokeniser.tagPending.appendAttributeValue(65533);
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$38.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */