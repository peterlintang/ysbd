package org.a.b.a.a;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

public final class h
  implements HttpEntity
{
  private static final char[] a = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  private final c b;
  private final Header c;
  private long d;
  private volatile boolean e;
  
  public h()
  {
    this(e.a);
  }
  
  private h(e parame)
  {
    String str = a();
    e locale = parame;
    if (parame == null) {
      locale = e.a;
    }
    this.b = new c("form-data", str, locale);
    parame = new StringBuilder();
    parame.append("multipart/form-data; boundary=");
    parame.append(str);
    this.c = new BasicHeader("Content-Type", parame.toString());
    this.e = true;
  }
  
  private static String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Random localRandom = new Random();
    int j = localRandom.nextInt(11);
    int i = 0;
    while (i < j + 30)
    {
      localStringBuilder.append(a[localRandom.nextInt(a.length)]);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public final void a(String paramString, org.a.b.a.a.a.c paramc)
  {
    paramString = new a(paramString, paramc);
    this.b.a(paramString);
    this.e = true;
  }
  
  public final void consumeContent()
  {
    if (isStreaming()) {
      throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
    }
  }
  
  public final InputStream getContent()
  {
    throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
  }
  
  public final Header getContentEncoding()
  {
    return null;
  }
  
  public final long getContentLength()
  {
    if (this.e)
    {
      this.d = this.b.b();
      this.e = false;
    }
    return this.d;
  }
  
  public final Header getContentType()
  {
    return this.c;
  }
  
  public final boolean isChunked()
  {
    return !isRepeatable();
  }
  
  public final boolean isRepeatable()
  {
    Iterator localIterator = this.b.a().iterator();
    while (localIterator.hasNext()) {
      if (((a)localIterator.next()).a().e() < 0L) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean isStreaming()
  {
    return !isRepeatable();
  }
  
  public final void writeTo(OutputStream paramOutputStream)
  {
    this.b.a(paramOutputStream);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\a\b\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */