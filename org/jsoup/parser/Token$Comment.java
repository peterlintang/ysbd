package org.jsoup.parser;

class Token$Comment
  extends Token
{
  final StringBuilder data = new StringBuilder();
  
  Token$Comment()
  {
    super(null);
    this.type = Token.TokenType.Comment;
  }
  
  String getData()
  {
    return this.data.toString();
  }
  
  public String toString()
  {
    return "<!--" + getData() + "-->";
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\Token$Comment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */