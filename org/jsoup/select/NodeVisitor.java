package org.jsoup.select;

import org.jsoup.nodes.Node;

public abstract interface NodeVisitor
{
  public abstract void head(Node paramNode, int paramInt);
  
  public abstract void tail(Node paramNode, int paramInt);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\select\NodeVisitor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */