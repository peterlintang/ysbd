package org.jsoup.parser;

 enum TokeniserState$40
{
  TokeniserState$40()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    String str = paramCharacterReader.consumeToAny(new char[] { 9, 10, 13, 12, 32, 38, 62, 0, 34, 39, 60, 61, 96 });
    if (str.length() > 0) {
      paramTokeniser.tagPending.appendAttributeValue(str);
    }
    char c = paramCharacterReader.consume();
    switch (c)
    {
    default: 
      return;
    case '\t': 
    case '\n': 
    case '\f': 
    case '\r': 
    case ' ': 
      paramTokeniser.transition(BeforeAttributeName);
      return;
    case '&': 
      paramCharacterReader = paramTokeniser.consumeCharacterReference(Character.valueOf('>'), true);
      if (paramCharacterReader != null)
      {
        paramTokeniser.tagPending.appendAttributeValue(paramCharacterReader.charValue());
        return;
      }
      paramTokeniser.tagPending.appendAttributeValue('&');
      return;
    case '>': 
      paramTokeniser.emitTagPending();
      paramTokeniser.transition(Data);
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramTokeniser.tagPending.appendAttributeValue(65533);
      return;
    case '￿': 
      paramTokeniser.eofError(this);
      paramTokeniser.transition(Data);
      return;
    }
    paramTokeniser.error(this);
    paramTokeniser.tagPending.appendAttributeValue(c);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */