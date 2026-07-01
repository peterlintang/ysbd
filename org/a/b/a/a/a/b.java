package org.a.b.a.a.a;

import java.io.OutputStream;

public final class b
  extends a
{
  private final byte[] a;
  private final String b;
  
  public b(byte[] paramArrayOfByte, String paramString)
  {
    this(paramArrayOfByte, "application/octet-stream", paramString);
  }
  
  private b(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    super(paramString1);
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("byte[] may not be null");
    }
    this.a = paramArrayOfByte;
    this.b = paramString2;
  }
  
  public final void a(OutputStream paramOutputStream)
  {
    paramOutputStream.write(this.a);
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final String c()
  {
    return null;
  }
  
  public final String d()
  {
    return "binary";
  }
  
  public final long e()
  {
    return this.a.length;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\a\b\a\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */