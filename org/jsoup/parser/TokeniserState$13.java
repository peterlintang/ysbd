package org.jsoup.parser;

 enum TokeniserState$13
{
  TokeniserState$13()
  {
    super(paramString, paramInt, null);
  }
  
  private void anythingElse(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    paramTokeniser.emit("</" + paramTokeniser.dataBuffer.toString());
    paramTokeniser.transition(Rcdata);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matchesLetter())
    {
      paramCharacterReader = paramCharacterReader.consumeLetterSequence();
      paramTokeniser.tagPending.appendTagName(paramCharacterReader.toLowerCase());
      paramTokeniser.dataBuffer.append(paramCharacterReader);
      return;
    }
    switch (paramCharacterReader.consume())
    {
    default: 
      anythingElse(paramTokeniser, paramCharacterReader);
      return;
    case '\t': 
    case '\n': 
    case '\f': 
    case '\r': 
    case ' ': 
      if (paramTokeniser.isAppropriateEndTagToken())
      {
        paramTokeniser.transition(BeforeAttributeName);
        return;
      }
      anythingElse(paramTokeniser, paramCharacterReader);
      return;
    case '/': 
      if (paramTokeniser.isAppropriateEndTagToken())
      {
        paramTokeniser.transition(SelfClosingStartTag);
        return;
      }
      anythingElse(paramTokeniser, paramCharacterReader);
      return;
    }
    if (paramTokeniser.isAppropriateEndTagToken())
    {
      paramTokeniser.emitTagPending();
      paramTokeniser.transition(Data);
      return;
    }
    anythingElse(paramTokeniser, paramCharacterReader);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$13.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */