package org.a.b.a.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.util.ByteArrayBuffer;

public final class c
{
  private static final ByteArrayBuffer a = a(f.a, ": ");
  private static final ByteArrayBuffer b = a(f.a, "\r\n");
  private static final ByteArrayBuffer c = a(f.a, "--");
  private final String d;
  private final Charset e;
  private final String f;
  private final List<a> g;
  private final e h;
  
  public c(String paramString1, String paramString2, e parame)
  {
    if (paramString1 == null) {
      throw new IllegalArgumentException("Multipart subtype may not be null");
    }
    if (paramString2 == null) {
      throw new IllegalArgumentException("Multipart boundary may not be null");
    }
    this.d = paramString1;
    this.e = f.a;
    this.f = paramString2;
    this.g = new ArrayList();
    this.h = parame;
  }
  
  private static ByteArrayBuffer a(Charset paramCharset, String paramString)
  {
    paramCharset = paramCharset.encode(CharBuffer.wrap(paramString));
    paramString = new ByteArrayBuffer(paramCharset.remaining());
    paramString.append(paramCharset.array(), paramCharset.position(), paramCharset.remaining());
    return paramString;
  }
  
  private static void a(String paramString, OutputStream paramOutputStream)
  {
    a(a(f.a, paramString), paramOutputStream);
  }
  
  private static void a(String paramString, Charset paramCharset, OutputStream paramOutputStream)
  {
    a(a(paramCharset, paramString), paramOutputStream);
  }
  
  private void a(e parame, OutputStream paramOutputStream, boolean paramBoolean)
  {
    ByteArrayBuffer localByteArrayBuffer = a(this.e, this.f);
    Iterator localIterator = this.g.iterator();
    if (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      a(c, paramOutputStream);
      a(localByteArrayBuffer, paramOutputStream);
      a(b, paramOutputStream);
      Object localObject = locala.b();
      switch (d.a[parame.ordinal()])
      {
      }
      for (;;)
      {
        a(b, paramOutputStream);
        if (paramBoolean) {
          locala.a().a(paramOutputStream);
        }
        a(b, paramOutputStream);
        break;
        localObject = ((b)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          g localg = (g)((Iterator)localObject).next();
          a(localg.a(), paramOutputStream);
          a(a, paramOutputStream);
          a(localg.b(), paramOutputStream);
          a(b, paramOutputStream);
        }
        a(locala.b().a("Content-Disposition"), this.e, paramOutputStream);
        if (locala.a().b() != null) {
          a(locala.b().a("Content-Type"), this.e, paramOutputStream);
        }
      }
    }
    a(c, paramOutputStream);
    a(localByteArrayBuffer, paramOutputStream);
    a(c, paramOutputStream);
    a(b, paramOutputStream);
  }
  
  private static void a(g paramg, Charset paramCharset, OutputStream paramOutputStream)
  {
    a(paramg.a(), paramCharset, paramOutputStream);
    a(a, paramOutputStream);
    a(paramg.b(), paramCharset, paramOutputStream);
    a(b, paramOutputStream);
  }
  
  private static void a(ByteArrayBuffer paramByteArrayBuffer, OutputStream paramOutputStream)
  {
    paramOutputStream.write(paramByteArrayBuffer.buffer(), 0, paramByteArrayBuffer.length());
  }
  
  public final List<a> a()
  {
    return this.g;
  }
  
  public final void a(OutputStream paramOutputStream)
  {
    a(this.h, paramOutputStream, true);
  }
  
  public final void a(a parama)
  {
    if (parama == null) {
      return;
    }
    this.g.add(parama);
  }
  
  public final long b()
  {
    Object localObject = this.g.iterator();
    long l1 = 0L;
    while (((Iterator)localObject).hasNext())
    {
      long l2 = ((a)((Iterator)localObject).next()).a().e();
      if (l2 >= 0L) {
        l1 += l2;
      } else {
        return -1L;
      }
    }
    localObject = new ByteArrayOutputStream();
    try
    {
      a(this.h, (OutputStream)localObject, false);
      int i = ((ByteArrayOutputStream)localObject).toByteArray().length;
      return l1 + i;
    }
    catch (IOException localIOException) {}
    return -1L;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\a\b\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */