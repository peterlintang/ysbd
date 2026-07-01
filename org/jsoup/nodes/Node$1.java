package org.jsoup.nodes;

import org.jsoup.select.NodeVisitor;

class Node$1
  implements NodeVisitor
{
  Node$1(Node paramNode, String paramString) {}
  
  public void head(Node paramNode, int paramInt)
  {
    paramNode.baseUri = this.val$baseUri;
  }
  
  public void tail(Node paramNode, int paramInt) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\nodes\Node$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */