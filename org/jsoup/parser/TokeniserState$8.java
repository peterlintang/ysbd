package org.jsoup.parser;

 enum TokeniserState$8
{
  TokeniserState$8()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    switch (paramCharacterReader.current())
    {
    default: 
      if (paramCharacterReader.matchesLetter())
      {
        paramTokeniser.createTagPending(true);
        paramTokeniser.transition(TagName);
        return;
      }
      break;
    case '!': 
      paramTokeniser.advanceTransition(MarkupDeclarationOpen);
      return;
    case '/': 
      paramTokeniser.advanceTransition(EndTagOpen);
      return;
    case '?': 
      paramTokeniser.advanceTransition(BogusComment);
      return;
    }
    paramTokeniser.error(this);
    paramTokeniser.emit('<');
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */