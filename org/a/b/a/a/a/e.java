package org.a.b.a.a.a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class e
  extends a
{
  private final byte[] a;
  private final Charset b;
  
  private e(String paramString1, String paramString2, Charset paramCharset)
  {
    super(paramString2);
    if (paramString1 == null) {
      throw new IllegalArgumentException("Text may not be null");
    }
    paramString2 = paramCharset;
    if (paramCharset == null) {
      paramString2 = Charset.forName("US-ASCII");
    }
    this.a = paramString1.getBytes(paramString2.name());
    this.b = paramString2;
  }
  
  public e(String paramString, Charset paramCharset)
  {
    this(paramString, "text/plain", paramCharset);
  }
  
  public final void a(OutputStream paramOutputStream)
  {
    if (paramOutputStream == null) {
      throw new IllegalArgumentException("Output stream may not be null");
    }
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(this.a);
    byte[] arrayOfByte = new byte['က'];
    for (;;)
    {
      int i = localByteArrayInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
    paramOutputStream.flush();
  }
  
  public final String b()
  {
    return null;
  }
  
  public final String c()
  {
    return this.b.name();
  }
  
  public final String d()
  {
    return "8bit";
  }
  
  public final long e()
  {
    return this.a.length;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\a\b\a\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */