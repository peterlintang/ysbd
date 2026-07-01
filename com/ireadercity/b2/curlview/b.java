package com.ireadercity.b2.curlview;

final class b<T>
{
  private Object[] b;
  private int c;
  private int d;
  
  public b(a parama, int paramInt)
  {
    this.d = paramInt;
    this.b = new Object[paramInt];
  }
  
  public final T a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c)) {
      throw new IndexOutOfBoundsException();
    }
    return (T)this.b[paramInt];
  }
  
  public final void a()
  {
    this.c = 0;
  }
  
  public final void a(int paramInt, T paramT)
  {
    if ((paramInt < 0) || (paramInt > this.c) || (this.c >= this.d)) {
      throw new IndexOutOfBoundsException();
    }
    int i = this.c;
    while (i > paramInt)
    {
      this.b[i] = this.b[(i - 1)];
      i -= 1;
    }
    this.b[paramInt] = paramT;
    this.c += 1;
  }
  
  public final void a(b<T> paramb)
  {
    if (this.c + paramb.c > this.d) {
      throw new IndexOutOfBoundsException();
    }
    int i = 0;
    while (i < paramb.c)
    {
      Object[] arrayOfObject = this.b;
      int j = this.c;
      this.c = (j + 1);
      arrayOfObject[j] = paramb.a(i);
      i += 1;
    }
  }
  
  public final void a(T paramT)
  {
    if (this.c >= this.d) {
      throw new IndexOutOfBoundsException();
    }
    Object[] arrayOfObject = this.b;
    int i = this.c;
    this.c = (i + 1);
    arrayOfObject[i] = paramT;
  }
  
  public final T b()
  {
    int i = 0;
    if (this.c <= 0) {
      throw new IndexOutOfBoundsException();
    }
    Object localObject = this.b[0];
    while (i < this.c - 1)
    {
      this.b[i] = this.b[(i + 1)];
      i += 1;
    }
    this.c -= 1;
    return (T)localObject;
  }
  
  public final int c()
  {
    return this.c;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\curlview\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */