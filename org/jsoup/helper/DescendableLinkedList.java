package org.jsoup.helper;

import java.util.Iterator;
import java.util.LinkedList;

public class DescendableLinkedList<E>
  extends LinkedList<E>
{
  public Iterator<E> descendingIterator()
  {
    return new DescendableLinkedList.DescendingIterator(this, size(), null);
  }
  
  public E peekLast()
  {
    if (size() == 0) {
      return null;
    }
    return (E)getLast();
  }
  
  public E pollLast()
  {
    if (size() == 0) {
      return null;
    }
    return (E)removeLast();
  }
  
  public void push(E paramE)
  {
    addFirst(paramE);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\helper\DescendableLinkedList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */