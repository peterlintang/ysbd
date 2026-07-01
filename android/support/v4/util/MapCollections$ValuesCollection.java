package android.support.v4.util;

import java.util.Collection;
import java.util.Iterator;

final class MapCollections$ValuesCollection
  implements Collection<V>
{
  MapCollections$ValuesCollection(MapCollections paramMapCollections) {}
  
  public final boolean add(V paramV)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection<? extends V> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    this.this$0.colClear();
  }
  
  public final boolean contains(Object paramObject)
  {
    return this.this$0.colIndexOfValue(paramObject) >= 0;
  }
  
  public final boolean containsAll(Collection<?> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!contains(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean isEmpty()
  {
    return this.this$0.colGetSize() == 0;
  }
  
  public final Iterator<V> iterator()
  {
    return new MapCollections.ArrayIterator(this.this$0, 1);
  }
  
  public final boolean remove(Object paramObject)
  {
    int i = this.this$0.colIndexOfValue(paramObject);
    if (i >= 0)
    {
      this.this$0.colRemoveAt(i);
      return true;
    }
    return false;
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    int i = 0;
    int j = this.this$0.colGetSize();
    boolean bool = false;
    while (i < j)
    {
      int m = i;
      int k = j;
      if (paramCollection.contains(this.this$0.colGetEntry(i, 1)))
      {
        this.this$0.colRemoveAt(i);
        m = i - 1;
        k = j - 1;
        bool = true;
      }
      i = m + 1;
      j = k;
    }
    return bool;
  }
  
  public final boolean retainAll(Collection<?> paramCollection)
  {
    int i = 0;
    int j = this.this$0.colGetSize();
    boolean bool = false;
    while (i < j)
    {
      int m = i;
      int k = j;
      if (!paramCollection.contains(this.this$0.colGetEntry(i, 1)))
      {
        this.this$0.colRemoveAt(i);
        m = i - 1;
        k = j - 1;
        bool = true;
      }
      i = m + 1;
      j = k;
    }
    return bool;
  }
  
  public final int size()
  {
    return this.this$0.colGetSize();
  }
  
  public final Object[] toArray()
  {
    return this.this$0.toArrayHelper(1);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    return this.this$0.toArrayHelper(paramArrayOfT, 1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\util\MapCollections$ValuesCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */