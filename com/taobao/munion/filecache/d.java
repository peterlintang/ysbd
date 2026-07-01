package com.taobao.munion.filecache;

import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class d
{
  private static int a = 10485760;
  private static int b = 5242880;
  private static int c = 256;
  private RandomAccessFile d;
  private FileInputStream e;
  private FileChannel f;
  private boolean g = false;
  private String h;
  private boolean i;
  private int j;
  private int k;
  private d.a l;
  private HashMap<String, c> m;
  private ReentrantReadWriteLock n;
  
  protected d(String paramString, Boolean paramBoolean)
  {
    this.h = paramString;
    this.i = paramBoolean.booleanValue();
    this.n = new ReentrantReadWriteLock();
  }
  
  protected c a(int paramInt)
  {
    if (this.g)
    {
      if (paramInt > this.j) {
        return null;
      }
      int i2 = paramInt / this.k;
      int i1 = i2;
      if (paramInt % this.k != 0) {
        i1 = i2 + 1;
      }
      int[] arrayOfInt = new int[i1];
      int i3 = this.l.a();
      i1 = 0;
      for (paramInt = 0;; paramInt = i2)
      {
        i2 = paramInt;
        if (i1 >= i3) {
          break;
        }
        i2 = paramInt;
        if (this.l.a(i1))
        {
          arrayOfInt[paramInt] = (this.k * i1);
          paramInt += 1;
          i2 = paramInt;
          if (paramInt == arrayOfInt.length) {
            break;
          }
          i2 = paramInt;
        }
        i1 += 1;
      }
      if (i2 == arrayOfInt.length)
      {
        paramInt = 0;
        while (paramInt < arrayOfInt.length)
        {
          this.l.a(false, arrayOfInt[paramInt] / this.k);
          paramInt += 1;
        }
        return new c(arrayOfInt, this.k, this.f);
      }
    }
    return null;
  }
  
  protected void a(c paramc)
  {
    if ((!this.g) || (paramc.e() != this.f) || (paramc.d() != this.k)) {
      return;
    }
    int[] arrayOfInt = paramc.c();
    int i1 = 0;
    while (i1 < arrayOfInt.length)
    {
      this.l.a(true, arrayOfInt[i1] / this.k);
      i1 += 1;
    }
    paramc.f();
  }
  
  public boolean a()
  {
    return this.i;
  }
  
  /* Error */
  public boolean a(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 45	com/taobao/munion/filecache/d:g	Z
    //   8: ifne +141 -> 149
    //   11: new 103	java/io/File
    //   14: dup
    //   15: aload_0
    //   16: getfield 47	com/taobao/munion/filecache/d:h	Ljava/lang/String;
    //   19: invokespecial 106	java/io/File:<init>	(Ljava/lang/String;)V
    //   22: astore 5
    //   24: aload 5
    //   26: invokevirtual 110	java/io/File:getParentFile	()Ljava/io/File;
    //   29: invokevirtual 113	java/io/File:mkdirs	()Z
    //   32: pop
    //   33: aload_0
    //   34: new 115	java/util/HashMap
    //   37: dup
    //   38: invokespecial 116	java/util/HashMap:<init>	()V
    //   41: putfield 118	com/taobao/munion/filecache/d:m	Ljava/util/HashMap;
    //   44: aload 5
    //   46: invokevirtual 121	java/io/File:exists	()Z
    //   49: istore 4
    //   51: iload 4
    //   53: ifne +9 -> 62
    //   56: aload 5
    //   58: invokevirtual 124	java/io/File:createNewFile	()Z
    //   61: pop
    //   62: aload_0
    //   63: new 126	java/io/RandomAccessFile
    //   66: dup
    //   67: aload 5
    //   69: invokevirtual 130	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   72: ldc -124
    //   74: invokespecial 135	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: putfield 137	com/taobao/munion/filecache/d:d	Ljava/io/RandomAccessFile;
    //   80: aload_0
    //   81: aload_0
    //   82: getfield 137	com/taobao/munion/filecache/d:d	Ljava/io/RandomAccessFile;
    //   85: invokevirtual 140	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   88: putfield 82	com/taobao/munion/filecache/d:f	Ljava/nio/channels/FileChannel;
    //   91: aload_0
    //   92: getfield 82	com/taobao/munion/filecache/d:f	Ljava/nio/channels/FileChannel;
    //   95: lconst_0
    //   96: invokevirtual 146	java/nio/channels/FileChannel:truncate	(J)Ljava/nio/channels/FileChannel;
    //   99: pop
    //   100: iload_1
    //   101: ifne +101 -> 202
    //   104: aload_0
    //   105: getfield 55	com/taobao/munion/filecache/d:i	Z
    //   108: ifeq +84 -> 192
    //   111: aload_0
    //   112: getstatic 33	com/taobao/munion/filecache/d:a	I
    //   115: putfield 63	com/taobao/munion/filecache/d:j	I
    //   118: iload_2
    //   119: ifne +91 -> 210
    //   122: aload_0
    //   123: getstatic 38	com/taobao/munion/filecache/d:c	I
    //   126: putfield 65	com/taobao/munion/filecache/d:k	I
    //   129: aload_0
    //   130: new 69	com/taobao/munion/filecache/d$a
    //   133: dup
    //   134: aload_0
    //   135: iload_1
    //   136: iload_2
    //   137: idiv
    //   138: invokespecial 149	com/taobao/munion/filecache/d$a:<init>	(Lcom/taobao/munion/filecache/d;I)V
    //   141: putfield 67	com/taobao/munion/filecache/d:l	Lcom/taobao/munion/filecache/d$a;
    //   144: aload_0
    //   145: iconst_1
    //   146: putfield 45	com/taobao/munion/filecache/d:g	Z
    //   149: iconst_1
    //   150: istore_3
    //   151: aload_0
    //   152: monitorexit
    //   153: iload_3
    //   154: ireturn
    //   155: astore 5
    //   157: aload 5
    //   159: invokevirtual 152	java/io/IOException:printStackTrace	()V
    //   162: goto -11 -> 151
    //   165: astore 5
    //   167: aload_0
    //   168: monitorexit
    //   169: aload 5
    //   171: athrow
    //   172: astore 5
    //   174: aload 5
    //   176: invokevirtual 153	java/io/FileNotFoundException:printStackTrace	()V
    //   179: goto -28 -> 151
    //   182: astore 5
    //   184: aload 5
    //   186: invokevirtual 152	java/io/IOException:printStackTrace	()V
    //   189: goto -89 -> 100
    //   192: aload_0
    //   193: getstatic 36	com/taobao/munion/filecache/d:b	I
    //   196: putfield 63	com/taobao/munion/filecache/d:j	I
    //   199: goto -81 -> 118
    //   202: aload_0
    //   203: iload_1
    //   204: putfield 63	com/taobao/munion/filecache/d:j	I
    //   207: goto -89 -> 118
    //   210: aload_0
    //   211: iload_2
    //   212: putfield 65	com/taobao/munion/filecache/d:k	I
    //   215: goto -86 -> 129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	this	d
    //   0	218	1	paramInt1	int
    //   0	218	2	paramInt2	int
    //   1	153	3	bool1	boolean
    //   49	3	4	bool2	boolean
    //   22	46	5	localFile	java.io.File
    //   155	3	5	localIOException1	java.io.IOException
    //   165	5	5	localObject	Object
    //   172	3	5	localFileNotFoundException	java.io.FileNotFoundException
    //   182	3	5	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   56	62	155	java/io/IOException
    //   4	51	165	finally
    //   56	62	165	finally
    //   62	100	165	finally
    //   104	118	165	finally
    //   122	129	165	finally
    //   129	149	165	finally
    //   157	162	165	finally
    //   174	179	165	finally
    //   184	189	165	finally
    //   192	199	165	finally
    //   202	207	165	finally
    //   210	215	165	finally
    //   62	100	172	java/io/FileNotFoundException
    //   62	100	182	java/io/IOException
  }
  
  public boolean a(String paramString, byte[] paramArrayOfByte)
  {
    if (this.g) {
      this.n.writeLock().lock();
    }
    try
    {
      if (this.m.containsKey(paramString))
      {
        localc1 = (c)this.m.get(paramString);
        if (localc1.a() >= paramArrayOfByte.length)
        {
          boolean bool = localc1.a(paramArrayOfByte);
          return bool;
        }
        c localc2 = a(paramArrayOfByte.length);
        if (localc2 != null)
        {
          if (localc2.a(paramArrayOfByte))
          {
            a(localc1);
            this.m.put(paramString, localc2);
            return true;
          }
          a(localc2);
          return false;
        }
        return false;
      }
      c localc1 = a(paramArrayOfByte.length);
      if (localc1 != null)
      {
        if (localc1.a(paramArrayOfByte))
        {
          this.m.put(paramString, localc1);
          return true;
        }
        a(localc1);
        return false;
      }
      return false;
    }
    catch (c.a paramString)
    {
      paramString.printStackTrace();
      return false;
    }
    finally
    {
      this.n.writeLock().unlock();
    }
  }
  
  public byte[] a(String paramString)
  {
    byte[] arrayOfByte = null;
    if (this.g) {
      this.n.readLock().lock();
    }
    try
    {
      if (this.m.containsKey(paramString))
      {
        arrayOfByte = ((c)this.m.get(paramString)).b();
        return arrayOfByte;
      }
      return null;
    }
    finally
    {
      this.n.readLock().unlock();
    }
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 45	com/taobao/munion/filecache/d:g	Z
    //   4: ifeq +77 -> 81
    //   7: aload_0
    //   8: getfield 60	com/taobao/munion/filecache/d:n	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   11: invokevirtual 160	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   14: invokevirtual 165	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:lock	()V
    //   17: aload_0
    //   18: getfield 118	com/taobao/munion/filecache/d:m	Ljava/util/HashMap;
    //   21: invokevirtual 205	java/util/HashMap:values	()Ljava/util/Collection;
    //   24: invokeinterface 211 1 0
    //   29: astore_2
    //   30: iconst_0
    //   31: istore_1
    //   32: iload_1
    //   33: aload_2
    //   34: arraylength
    //   35: if_icmpge +20 -> 55
    //   38: aload_0
    //   39: aload_2
    //   40: iload_1
    //   41: aaload
    //   42: checkcast 80	com/taobao/munion/filecache/c
    //   45: invokevirtual 184	com/taobao/munion/filecache/d:a	(Lcom/taobao/munion/filecache/c;)V
    //   48: iload_1
    //   49: iconst_1
    //   50: iadd
    //   51: istore_1
    //   52: goto -20 -> 32
    //   55: aload_0
    //   56: getfield 118	com/taobao/munion/filecache/d:m	Ljava/util/HashMap;
    //   59: invokevirtual 214	java/util/HashMap:clear	()V
    //   62: aload_0
    //   63: getfield 82	com/taobao/munion/filecache/d:f	Ljava/nio/channels/FileChannel;
    //   66: lconst_0
    //   67: invokevirtual 146	java/nio/channels/FileChannel:truncate	(J)Ljava/nio/channels/FileChannel;
    //   70: pop
    //   71: aload_0
    //   72: getfield 60	com/taobao/munion/filecache/d:n	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   75: invokevirtual 160	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   78: invokevirtual 180	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   81: return
    //   82: astore_2
    //   83: aload_2
    //   84: invokevirtual 152	java/io/IOException:printStackTrace	()V
    //   87: goto -16 -> 71
    //   90: astore_2
    //   91: aload_0
    //   92: getfield 60	com/taobao/munion/filecache/d:n	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   95: invokevirtual 160	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   98: invokevirtual 180	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   101: aload_2
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	d
    //   31	21	1	i1	int
    //   29	11	2	arrayOfObject	Object[]
    //   82	2	2	localIOException	java.io.IOException
    //   90	12	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   62	71	82	java/io/IOException
    //   17	30	90	finally
    //   32	48	90	finally
    //   55	62	90	finally
    //   62	71	90	finally
    //   83	87	90	finally
  }
  
  public boolean b(String paramString)
  {
    boolean bool = false;
    if (this.g) {
      this.n.writeLock().lock();
    }
    try
    {
      if (this.m.containsKey(paramString))
      {
        c localc = (c)this.m.get(paramString);
        this.m.remove(paramString);
        a(localc);
        this.n.writeLock().unlock();
        bool = true;
        return bool;
      }
      return false;
    }
    finally
    {
      this.n.writeLock().unlock();
    }
  }
  
  protected void finalize()
  {
    if (this.d != null) {}
    try
    {
      this.d.close();
      if (this.f == null) {}
    }
    catch (Exception localException2)
    {
      try
      {
        this.f.close();
        if (this.e == null) {}
      }
      catch (Exception localException2)
      {
        try
        {
          for (;;)
          {
            this.e.close();
            super.finalize();
            return;
            localException1 = localException1;
            localException1.printStackTrace();
          }
          localException2 = localException2;
          localException2.printStackTrace();
        }
        catch (Exception localException3)
        {
          for (;;)
          {
            localException3.printStackTrace();
          }
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\filecache\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */