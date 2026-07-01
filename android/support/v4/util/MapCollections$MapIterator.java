package android.support.v4.util;

import java.util.Iterator;
import java.util.Map.Entry;

final class MapCollections$MapIterator
  implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
{
  int mEnd;
  boolean mEntryValid = false;
  int mIndex;
  
  MapCollections$MapIterator(MapCollections paramMapCollections)
  {
    this.mEnd = (paramMapCollections.colGetSize() - 1);
    this.mIndex = -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!this.mEntryValid) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    if (!(paramObject instanceof Map.Entry)) {}
    do
    {
      return false;
      paramObject = (Map.Entry)paramObject;
    } while ((!ContainerHelpers.equal(((Map.Entry)paramObject).getKey(), this.this$0.colGetEntry(this.mIndex, 0))) || (!ContainerHelpers.equal(((Map.Entry)paramObject).getValue(), this.this$0.colGetEntry(this.mIndex, 1))));
    return true;
  }
  
  public final K getKey()
  {
    if (!this.mEntryValid) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    return (K)this.this$0.colGetEntry(this.mIndex, 0);
  }
  
  public final V getValue()
  {
    if (!this.mEntryValid) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    return (V)this.this$0.colGetEntry(this.mIndex, 1);
  }
  
  public final boolean hasNext()
  {
    return this.mIndex < this.mEnd;
  }
  
  public final int hashCode()
  {
    int j = 0;
    if (!this.mEntryValid) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    Object localObject1 = this.this$0.colGetEntry(this.mIndex, 0);
    Object localObject2 = this.this$0.colGetEntry(this.mIndex, 1);
    int i;
    if (localObject1 == null)
    {
      i = 0;
      if (localObject2 != null) {
        break label69;
      }
    }
    for (;;)
    {
      return j ^ i;
      i = localObject1.hashCode();
      break;
      label69:
      j = localObject2.hashCode();
    }
  }
  
  public final Map.Entry<K, V> next()
  {
    this.mIndex += 1;
    this.mEntryValid = true;
    return this;
  }
  
  public final void remove()
  {
    if (!this.mEntryValid) {
      throw new IllegalStateException();
    }
    this.mIndex -= 1;
    this.mEnd -= 1;
    this.mEntryValid = false;
    this.this$0.colRemoveAt(this.mIndex);
  }
  
  public final V setValue(V paramV)
  {
    if (!this.mEntryValid) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    return (V)this.this$0.colSetValue(this.mIndex, paramV);
  }
  
  public final String toString()
  {
    return getKey() + "=" + getValue();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\util\MapCollections$MapIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */