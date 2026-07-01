package org.jsoup.parser;

 enum TokeniserState$37
{
  TokeniserState$37()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    char c = paramCharacterReader.consume();
    switch (c)
    {
    default: 
      paramCharacterReader.unconsume();
      paramTokeniser.transition(AttributeValue_unquoted);
    case '\t': 
    case '\n': 
    case '\f': 
    case '\r': 
    case ' ': 
      return;
    case '"': 
      paramTokeniser.transition(AttributeValue_doubleQuoted);
      return;
    case '&': 
      paramCharacterReader.unconsume();
      paramTokeniser.transition(AttributeValue_unquoted);
      return;
    case '\'': 
      paramTokeniser.transition(AttributeValue_singleQuoted);
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramTokeniser.tagPending.appendAttributeValue(65533);
      paramTokeniser.transition(AttributeValue_unquoted);
      return;
    case '￿': 
      paramTokeniser.eofError(this);
      paramTokeniser.transition(Data);
      return;
    case '>': 
      paramTokeniser.error(this);
      paramTokeniser.emitTagPending();
      paramTokeniser.transition(Data);
      return;
    }
    paramTokeniser.error(this);
    paramTokeniser.tagPending.appendAttributeValue(c);
    paramTokeniser.transition(AttributeValue_unquoted);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$37.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */