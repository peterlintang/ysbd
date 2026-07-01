package org.jsoup.parser;

 enum TokeniserState$44
{
  TokeniserState$44()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    if (paramCharacterReader.matchConsume("--"))
    {
      paramTokeniser.createCommentPending();
      paramTokeniser.transition(CommentStart);
      return;
    }
    if (paramCharacterReader.matchConsumeIgnoreCase("DOCTYPE"))
    {
      paramTokeniser.transition(Doctype);
      return;
    }
    if (paramCharacterReader.matchConsume("[CDATA["))
    {
      paramTokeniser.transition(CdataSection);
      return;
    }
    paramTokeniser.error(this);
    paramTokeniser.advanceTransition(BogusComment);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$44.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */