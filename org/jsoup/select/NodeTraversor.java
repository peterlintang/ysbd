package org.jsoup.select;

import java.util.List;
import org.jsoup.nodes.Node;

public class NodeTraversor
{
  private NodeVisitor visitor;
  
  public NodeTraversor(NodeVisitor paramNodeVisitor)
  {
    this.visitor = paramNodeVisitor;
  }
  
  public void traverse(Node paramNode)
  {
    int i = 0;
    Node localNode1 = paramNode;
    while (localNode1 != null)
    {
      this.visitor.head(localNode1, i);
      int j = i;
      Node localNode2 = localNode1;
      if (localNode1.childNodes().size() > 0)
      {
        localNode1 = localNode1.childNode(0);
        i += 1;
      }
      else
      {
        while ((localNode2.nextSibling() == null) && (j > 0))
        {
          this.visitor.tail(localNode2, j);
          localNode2 = localNode2.parent();
          j -= 1;
        }
        this.visitor.tail(localNode2, j);
        if (localNode2 == paramNode) {
          break;
        }
        localNode1 = localNode2.nextSibling();
        i = j;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\select\NodeTraversor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */