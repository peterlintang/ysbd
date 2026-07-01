package com.umeng.newxp.view.handler.utils;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a
  implements Closeable
{
  static final String a = "journal";
  static final String b = "journal.tmp";
  static final String c = "libcore.io.DiskLruCache";
  static final String d = "1";
  static final long e = -1L;
  private static final String f = "CLEAN";
  private static final String g = "DIRTY";
  private static final String h = "REMOVE";
  private static final String i = "READ";
  private static final Charset j = Charset.forName("UTF-8");
  private static final int k = 8192;
  private final File l;
  private final File m;
  private final File n;
  private final int o;
  private final long p;
  private final int q;
  private long r = 0L;
  private Writer s;
  private final LinkedHashMap<String, a.b> t = new LinkedHashMap(0, 0.75F, true);
  private int u;
  private long v = 0L;
  private final ExecutorService w = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  private final Callable<Void> x = new a.1(this);
  
  private a(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    this.l = paramFile;
    this.o = paramInt1;
    this.m = new File(paramFile, "journal");
    this.n = new File(paramFile, "journal.tmp");
    this.q = paramInt2;
    this.p = paramLong;
  }
  
  private a.a a(String paramString, long paramLong)
  {
    for (;;)
    {
      a.a locala;
      try
      {
        l();
        e(paramString);
        a.b localb = (a.b)this.t.get(paramString);
        if (paramLong != -1L) {
          if (localb != null)
          {
            long l1 = a.b.e(localb);
            if (l1 == paramLong) {}
          }
          else
          {
            paramString = null;
            return paramString;
          }
        }
        if (localb == null)
        {
          localb = new a.b(this, paramString, null);
          this.t.put(paramString, localb);
          locala = new a.a(this, localb, null);
          a.b.a(localb, locala);
          this.s.write("DIRTY " + paramString + '\n');
          this.s.flush();
          paramString = locala;
          continue;
        }
        locala = a.b.a(localb);
      }
      finally {}
      if (locala != null) {
        paramString = null;
      }
    }
  }
  
  public static a a(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    if (paramLong <= 0L) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    if (paramInt2 <= 0) {
      throw new IllegalArgumentException("valueCount <= 0");
    }
    a locala = new a(paramFile, paramInt1, paramInt2, paramLong);
    if (locala.m.exists()) {
      try
      {
        locala.h();
        locala.i();
        locala.s = new BufferedWriter(new FileWriter(locala.m, true), 8192);
        return locala;
      }
      catch (IOException localIOException)
      {
        locala.f();
      }
    }
    paramFile.mkdirs();
    paramFile = new a(paramFile, paramInt1, paramInt2, paramLong);
    paramFile.j();
    return paramFile;
  }
  
  public static String a(InputStream paramInputStream)
  {
    StringBuilder localStringBuilder = new StringBuilder(80);
    for (;;)
    {
      i1 = paramInputStream.read();
      if (i1 == -1) {
        throw new EOFException();
      }
      if (i1 == 10) {
        break;
      }
      localStringBuilder.append((char)i1);
    }
    int i1 = localStringBuilder.length();
    if ((i1 > 0) && (localStringBuilder.charAt(i1 - 1) == '\r')) {
      localStringBuilder.setLength(i1 - 1);
    }
    return localStringBuilder.toString();
  }
  
  public static String a(Reader paramReader)
  {
    try
    {
      StringWriter localStringWriter = new StringWriter();
      char[] arrayOfChar = new char['Ѐ'];
      for (;;)
      {
        int i1 = paramReader.read(arrayOfChar);
        if (i1 == -1) {
          break;
        }
        localStringWriter.write(arrayOfChar, 0, i1);
      }
      str = ((StringWriter)localObject).toString();
    }
    finally
    {
      paramReader.close();
    }
    String str;
    paramReader.close();
    return str;
  }
  
  private void a(a.a parama, boolean paramBoolean)
  {
    int i3 = 0;
    a.b localb;
    try
    {
      localb = a.a.a(parama);
      if (a.b.a(localb) != parama) {
        throw new IllegalStateException();
      }
    }
    finally {}
    int i2 = i3;
    int i1;
    if (paramBoolean)
    {
      i2 = i3;
      if (!a.b.d(localb))
      {
        i1 = 0;
        i2 = i3;
        if (i1 < this.q)
        {
          if (localb.b(i1).exists()) {
            break label389;
          }
          parama.b();
          throw new IllegalStateException("edit didn't create file " + i1);
        }
      }
    }
    for (;;)
    {
      long l1;
      if (i2 < this.q)
      {
        parama = localb.b(i2);
        if (paramBoolean)
        {
          if (parama.exists())
          {
            File localFile = localb.a(i2);
            parama.renameTo(localFile);
            l1 = a.b.b(localb)[i2];
            long l2 = localFile.length();
            a.b.b(localb)[i2] = l2;
            this.r = (this.r - l1 + l2);
          }
        }
        else {
          b(parama);
        }
      }
      else
      {
        this.u += 1;
        a.b.a(localb, null);
        if ((a.b.d(localb) | paramBoolean))
        {
          a.b.a(localb, true);
          this.s.write("CLEAN " + a.b.c(localb) + localb.a() + '\n');
          if (paramBoolean)
          {
            l1 = this.v;
            this.v = (1L + l1);
            a.b.a(localb, l1);
          }
        }
        for (;;)
        {
          if ((this.r > this.p) || (k())) {
            this.w.submit(this.x);
          }
          return;
          this.t.remove(a.b.c(localb));
          this.s.write("REMOVE " + a.b.c(localb) + '\n');
        }
        label389:
        i1 += 1;
        break;
      }
      i2 += 1;
    }
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (RuntimeException paramCloseable)
    {
      throw paramCloseable;
    }
    catch (Exception paramCloseable) {}
  }
  
  public static void a(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null) {
      throw new IllegalArgumentException("not a directory: " + paramFile);
    }
    int i2 = arrayOfFile.length;
    int i1 = 0;
    while (i1 < i2)
    {
      paramFile = arrayOfFile[i1];
      if (paramFile.isDirectory()) {
        a(paramFile);
      }
      if (!paramFile.delete()) {
        throw new IOException("failed to delete file: " + paramFile);
      }
      i1 += 1;
    }
  }
  
  private static <T> T[] a(T[] paramArrayOfT, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayOfT.length;
    if (paramInt1 > paramInt2) {
      throw new IllegalArgumentException();
    }
    if ((paramInt1 < 0) || (paramInt1 > i1)) {
      throw new ArrayIndexOutOfBoundsException();
    }
    paramInt2 -= paramInt1;
    i1 = Math.min(paramInt2, i1 - paramInt1);
    Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), paramInt2);
    System.arraycopy(paramArrayOfT, paramInt1, arrayOfObject, 0, i1);
    return arrayOfObject;
  }
  
  private static void b(File paramFile)
  {
    if ((paramFile.exists()) && (!paramFile.delete())) {
      throw new IOException();
    }
  }
  
  private static String c(InputStream paramInputStream)
  {
    return a(new InputStreamReader(paramInputStream, j));
  }
  
  private void d(String paramString)
  {
    String[] arrayOfString = paramString.split(" ");
    if (arrayOfString.length < 2) {
      throw new IOException("unexpected journal line: " + paramString);
    }
    String str = arrayOfString[1];
    if ((arrayOfString[0].equals("REMOVE")) && (arrayOfString.length == 2))
    {
      this.t.remove(str);
      return;
    }
    a.b localb = (a.b)this.t.get(str);
    if (localb == null)
    {
      localb = new a.b(this, str, null);
      this.t.put(str, localb);
    }
    for (;;)
    {
      if ((arrayOfString[0].equals("CLEAN")) && (arrayOfString.length == this.q + 2))
      {
        a.b.a(localb, true);
        a.b.a(localb, null);
        a.b.a(localb, (String[])a(arrayOfString, 2, arrayOfString.length));
        return;
      }
      if ((arrayOfString[0].equals("DIRTY")) && (arrayOfString.length == 2))
      {
        a.b.a(localb, new a.a(this, localb, null));
        return;
      }
      if ((arrayOfString[0].equals("READ")) && (arrayOfString.length == 2)) {
        break;
      }
      throw new IOException("unexpected journal line: " + paramString);
    }
  }
  
  private void e(String paramString)
  {
    if ((paramString.contains(" ")) || (paramString.contains("\n")) || (paramString.contains("\r"))) {
      throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + paramString + "\"");
    }
  }
  
  private void h()
  {
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(new FileInputStream(this.m), 8192);
    try
    {
      String str1 = a(localBufferedInputStream);
      String str2 = a(localBufferedInputStream);
      String str3 = a(localBufferedInputStream);
      String str4 = a(localBufferedInputStream);
      String str5 = a(localBufferedInputStream);
      if ((!"libcore.io.DiskLruCache".equals(str1)) || (!"1".equals(str2)) || (!Integer.toString(this.o).equals(str3)) || (!Integer.toString(this.q).equals(str4)) || (!"".equals(str5))) {
        throw new IOException("unexpected journal header: [" + str1 + ", " + str2 + ", " + str4 + ", " + str5 + "]");
      }
    }
    finally
    {
      a(localBufferedInputStream);
    }
  }
  
  private void i()
  {
    b(this.n);
    Iterator localIterator = this.t.values().iterator();
    while (localIterator.hasNext())
    {
      a.b localb = (a.b)localIterator.next();
      int i1;
      if (a.b.a(localb) == null)
      {
        i1 = 0;
        while (i1 < this.q)
        {
          this.r += a.b.b(localb)[i1];
          i1 += 1;
        }
      }
      else
      {
        a.b.a(localb, null);
        i1 = 0;
        while (i1 < this.q)
        {
          b(localb.a(i1));
          b(localb.b(i1));
          i1 += 1;
        }
        localIterator.remove();
      }
    }
  }
  
  private void j()
  {
    for (;;)
    {
      try
      {
        if (this.s != null) {
          this.s.close();
        }
        BufferedWriter localBufferedWriter = new BufferedWriter(new FileWriter(this.n), 8192);
        localBufferedWriter.write("libcore.io.DiskLruCache");
        localBufferedWriter.write("\n");
        localBufferedWriter.write("1");
        localBufferedWriter.write("\n");
        localBufferedWriter.write(Integer.toString(this.o));
        localBufferedWriter.write("\n");
        localBufferedWriter.write(Integer.toString(this.q));
        localBufferedWriter.write("\n");
        localBufferedWriter.write("\n");
        Iterator localIterator = this.t.values().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        a.b localb = (a.b)localIterator.next();
        if (a.b.a(localb) != null) {
          localBufferedWriter.write("DIRTY " + a.b.c(localb) + '\n');
        } else {
          ((Writer)localObject).write("CLEAN " + a.b.c(localb) + localb.a() + '\n');
        }
      }
      finally {}
    }
    ((Writer)localObject).close();
    this.n.renameTo(this.m);
    this.s = new BufferedWriter(new FileWriter(this.m, true), 8192);
  }
  
  private boolean k()
  {
    return (this.u >= 2000) && (this.u >= this.t.size());
  }
  
  private void l()
  {
    if (this.s == null) {
      throw new IllegalStateException("cache is closed");
    }
  }
  
  private void m()
  {
    while (this.r > this.p) {
      c((String)((Map.Entry)this.t.entrySet().iterator().next()).getKey());
    }
  }
  
  /* Error */
  public final a.c a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 140	com/umeng/newxp/view/handler/utils/a:l	()V
    //   6: aload_0
    //   7: aload_1
    //   8: invokespecial 143	com/umeng/newxp/view/handler/utils/a:e	(Ljava/lang/String;)V
    //   11: aload_0
    //   12: getfield 87	com/umeng/newxp/view/handler/utils/a:t	Ljava/util/LinkedHashMap;
    //   15: aload_1
    //   16: invokevirtual 147	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   19: checkcast 149	com/umeng/newxp/view/handler/utils/a$b
    //   22: astore_3
    //   23: aload_3
    //   24: ifnonnull +9 -> 33
    //   27: aconst_null
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: aload_3
    //   34: invokestatic 284	com/umeng/newxp/view/handler/utils/a$b:d	(Lcom/umeng/newxp/view/handler/utils/a$b;)Z
    //   37: ifne +8 -> 45
    //   40: aconst_null
    //   41: astore_1
    //   42: goto -13 -> 29
    //   45: aload_0
    //   46: getfield 129	com/umeng/newxp/view/handler/utils/a:q	I
    //   49: anewarray 241	java/io/InputStream
    //   52: astore 4
    //   54: iconst_0
    //   55: istore_2
    //   56: iload_2
    //   57: aload_0
    //   58: getfield 129	com/umeng/newxp/view/handler/utils/a:q	I
    //   61: if_icmpge +32 -> 93
    //   64: aload 4
    //   66: iload_2
    //   67: new 454	java/io/FileInputStream
    //   70: dup
    //   71: aload_3
    //   72: iload_2
    //   73: invokevirtual 297	com/umeng/newxp/view/handler/utils/a$b:a	(I)Ljava/io/File;
    //   76: invokespecial 456	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   79: aastore
    //   80: iload_2
    //   81: iconst_1
    //   82: iadd
    //   83: istore_2
    //   84: goto -28 -> 56
    //   87: astore_1
    //   88: aconst_null
    //   89: astore_1
    //   90: goto -61 -> 29
    //   93: aload_0
    //   94: aload_0
    //   95: getfield 134	com/umeng/newxp/view/handler/utils/a:u	I
    //   98: iconst_1
    //   99: iadd
    //   100: putfield 134	com/umeng/newxp/view/handler/utils/a:u	I
    //   103: aload_0
    //   104: getfield 169	com/umeng/newxp/view/handler/utils/a:s	Ljava/io/Writer;
    //   107: new 171	java/lang/StringBuilder
    //   110: dup
    //   111: ldc_w 526
    //   114: invokespecial 175	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   117: aload_1
    //   118: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: bipush 10
    //   123: invokevirtual 182	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   126: invokevirtual 186	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: invokevirtual 529	java/io/Writer:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   132: pop
    //   133: aload_0
    //   134: invokespecial 325	com/umeng/newxp/view/handler/utils/a:k	()Z
    //   137: ifeq +17 -> 154
    //   140: aload_0
    //   141: getfield 107	com/umeng/newxp/view/handler/utils/a:w	Ljava/util/concurrent/ExecutorService;
    //   144: aload_0
    //   145: getfield 114	com/umeng/newxp/view/handler/utils/a:x	Ljava/util/concurrent/Callable;
    //   148: invokeinterface 331 2 0
    //   153: pop
    //   154: new 531	com/umeng/newxp/view/handler/utils/a$c
    //   157: dup
    //   158: aload_0
    //   159: aload_1
    //   160: aload_3
    //   161: invokestatic 152	com/umeng/newxp/view/handler/utils/a$b:e	(Lcom/umeng/newxp/view/handler/utils/a$b;)J
    //   164: aload 4
    //   166: aconst_null
    //   167: invokespecial 534	com/umeng/newxp/view/handler/utils/a$c:<init>	(Lcom/umeng/newxp/view/handler/utils/a;Ljava/lang/String;J[Ljava/io/InputStream;Lcom/umeng/newxp/view/handler/utils/a$1;)V
    //   170: astore_1
    //   171: goto -142 -> 29
    //   174: astore_1
    //   175: aload_0
    //   176: monitorexit
    //   177: aload_1
    //   178: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	179	0	this	a
    //   0	179	1	paramString	String
    //   55	29	2	i1	int
    //   22	139	3	localb	a.b
    //   52	113	4	arrayOfInputStream	InputStream[]
    // Exception table:
    //   from	to	target	type
    //   56	80	87	java/io/FileNotFoundException
    //   2	23	174	finally
    //   33	40	174	finally
    //   45	54	174	finally
    //   56	80	174	finally
    //   93	154	174	finally
    //   154	171	174	finally
  }
  
  public final File a()
  {
    return this.l;
  }
  
  public final long b()
  {
    return this.p;
  }
  
  public final a.a b(String paramString)
  {
    return a(paramString, -1L);
  }
  
  public final long c()
  {
    try
    {
      long l1 = this.r;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean c(String paramString)
  {
    int i1 = 0;
    for (;;)
    {
      try
      {
        l();
        e(paramString);
        a.b localb = (a.b)this.t.get(paramString);
        Object localObject;
        if (localb != null)
        {
          localObject = a.b.a(localb);
          if (localObject == null) {}
        }
        else
        {
          bool = false;
          return bool;
          this.r -= a.b.b(localb)[i1];
          a.b.b(localb)[i1] = 0L;
          i1 += 1;
        }
        if (i1 < this.q)
        {
          localObject = localb.a(i1);
          if (((File)localObject).delete()) {
            continue;
          }
          throw new IOException("failed to delete " + localObject);
        }
      }
      finally {}
      this.u += 1;
      this.s.append("REMOVE " + paramString + '\n');
      this.t.remove(paramString);
      if (k()) {
        this.w.submit(this.x);
      }
      boolean bool = true;
    }
  }
  
  public final void close()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = this.s;
        if (localObject1 == null) {
          return;
        }
        localObject1 = new ArrayList(this.t.values()).iterator();
        if (((Iterator)localObject1).hasNext())
        {
          a.b localb = (a.b)((Iterator)localObject1).next();
          if (a.b.a(localb) == null) {
            continue;
          }
          a.b.a(localb).b();
          continue;
        }
        m();
      }
      finally {}
      this.s.close();
      this.s = null;
    }
  }
  
  public final boolean d()
  {
    return this.s == null;
  }
  
  public final void e()
  {
    try
    {
      l();
      m();
      this.s.flush();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void f()
  {
    close();
    a(this.l);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */