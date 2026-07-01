package org.jsoup.parser;

 enum TokeniserState$16
{
  TokeniserState$16()
  {
    super(paramString, paramInt, null);
  }
  
  private void anythingElse(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    paramTokeniser.emit("</" + paramTokeniser.dataBuffer.toString());
    paramTokeniser.transition(Rawtext);
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
    if ((paramTokeniser.isAppropriateEndTagToken()) && (!paramCharacterReader.isEmpty()))
    {
      char c = paramCharacterReader.consume();
      switch (c)
      {
      default: 
        paramTokeniser.dataBuffer.append(c);
        anythingElse(paramTokeniser, paramCharacterReader);
        return;
      case '\t': 
      case '\n': 
      case '\f': 
      case '\r': 
      case ' ': 
        paramTokeniser.transition(BeforeAttributeName);
        return;
      case '/': 
        paramTokeniser.transition(SelfClosingStartTag);
        return;
      }
      paramTokeniser.emitTagPending();
      paramTokeniser.transition(Data);
      return;
    }
    anythingElse(paramTokeniser, paramCharacterReader);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */