package android.support.v4.util;

import java.util.Iterator;

final class MapCollections$ArrayIterator<T>
  implements Iterator<T>
{
  boolean mCanRemove = false;
  int mIndex;
  final int mOffset;
  int mSize;
  
  MapCollections$ArrayIterator(MapCollections paramMapCollections, int paramInt)
  {
    this.mOffset = paramInt;
    this.mSize = paramMapCollections.colGetSize();
  }
  
  public final boolean hasNext()
  {
    return this.mIndex < this.mSize;
  }
  
  public final T next()
  {
    Object localObject = this.this$0.colGetEntry(this.mIndex, this.mOffset);
    this.mIndex += 1;
    this.mCanRemove = true;
    return (T)localObject;
  }
  
  public final void remove()
  {
    if (!this.mCanRemove) {
      throw new IllegalStateException();
    }
    this.mIndex -= 1;
    this.mSize -= 1;
    this.mCanRemove = false;
    this.this$0.colRemoveAt(this.mIndex);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\util\MapCollections$ArrayIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */