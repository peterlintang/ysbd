package org.jsoup.helper;

import java.util.Iterator;
import java.util.ListIterator;

class DescendableLinkedList$DescendingIterator<E>
  implements Iterator<E>
{
  private final ListIterator<E> iter;
  
  private DescendableLinkedList$DescendingIterator(DescendableLinkedList paramDescendableLinkedList, int paramInt)
  {
    this.iter = paramDescendableLinkedList.listIterator(paramInt);
  }
  
  public boolean hasNext()
  {
    return this.iter.hasPrevious();
  }
  
  public E next()
  {
    return (E)this.iter.previous();
  }
  
  public void remove()
  {
    this.iter.remove();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\helper\DescendableLinkedList$DescendingIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */