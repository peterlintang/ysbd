package org.jsoup.parser;

 enum TokeniserState$49
{
  TokeniserState$49()
  {
    super(paramString, paramInt, null);
  }
  
  final void read(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    char c = paramCharacterReader.consume();
    switch (c)
    {
    default: 
      paramTokeniser.error(this);
      paramTokeniser.commentPending.data.append("--").append(c);
      paramTokeniser.transition(Comment);
      return;
    case '>': 
      paramTokeniser.emitCommentPending();
      paramTokeniser.transition(Data);
      return;
    case '\000': 
      paramTokeniser.error(this);
      paramTokeniser.commentPending.data.append("--�");
      paramTokeniser.transition(Comment);
      return;
    case '!': 
      paramTokeniser.error(this);
      paramTokeniser.transition(CommentEndBang);
      return;
    case '-': 
      paramTokeniser.error(this);
      paramTokeniser.commentPending.data.append('-');
      return;
    }
    paramTokeniser.eofError(this);
    paramTokeniser.emitCommentPending();
    paramTokeniser.transition(Data);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\TokeniserState$49.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */