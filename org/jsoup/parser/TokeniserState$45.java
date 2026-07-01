package org.jsoup.parser;

 enum TokeniserState$45
{
  TokeniserState$45()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    char c = paramCharacterReader.consume();
    switch (c)
    {
    default: 
      paramTokeniser.commentPending.data.append(c);
      paramTokeniser.transition(Comment);
      return;
    case '-': 
      paramTokeniser.transition(CommentStartDash);
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramTokeniser.commentPending.data.append(65533);
      paramTokeniser.transition(Comment);
      return;
    case '>': 
      paramTokeniser.error(this);
      paramTokeniser.emitCommentPending();
      paramTokeniser.transition(Data);
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.emitCommentPending();
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$45.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */