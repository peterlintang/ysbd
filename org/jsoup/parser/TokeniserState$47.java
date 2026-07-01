package org.jsoup.parser;

 enum TokeniserState$47
{
  TokeniserState$47()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    switch (paramCharacterReader.current())
    {
    default: 
      paramTokeniser.commentPending.data.append(paramCharacterReader.consumeToAny(new char[] { 45, 0 }));
      return;
    case '-': 
      paramTokeniser.advanceTransition(CommentEndDash);
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramCharacterReader.advance();
      paramTokeniser.commentPending.data.append(65533);
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.emitCommentPending();
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$47.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */