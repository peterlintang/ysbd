package com.taobao.munion.filecache;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class k
{
  private boolean a;
  private String b;
  private boolean c;
  private RandomAccessFile d;
  private FileChannel e;
  private HashMap<String, k.a> f;
  private ReentrantReadWriteLock g;
  private FileLock h;
  
  protected k(String paramString, Boolean paramBoolean)
  {
    this.b = paramString;
    this.c = paramBoolean.booleanValue();
    this.a = false;
  }
  
  /* Error */
  public boolean a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 37	com/taobao/munion/filecache/k:a	Z
    //   8: ifne +151 -> 159
    //   11: new 44	java/io/File
    //   14: dup
    //   15: aload_0
    //   16: getfield 27	com/taobao/munion/filecache/k:b	Ljava/lang/String;
    //   19: invokespecial 47	java/io/File:<init>	(Ljava/lang/String;)V
    //   22: astore_3
    //   23: aload_3
    //   24: invokevirtual 51	java/io/File:getParentFile	()Ljava/io/File;
    //   27: invokevirtual 54	java/io/File:mkdirs	()Z
    //   30: pop
    //   31: aload_3
    //   32: invokevirtual 57	java/io/File:exists	()Z
    //   35: istore_2
    //   36: iload_2
    //   37: ifne +8 -> 45
    //   40: aload_3
    //   41: invokevirtual 60	java/io/File:createNewFile	()Z
    //   44: pop
    //   45: aload_0
    //   46: new 62	java/util/HashMap
    //   49: dup
    //   50: invokespecial 63	java/util/HashMap:<init>	()V
    //   53: putfield 65	com/taobao/munion/filecache/k:f	Ljava/util/HashMap;
    //   56: aload_0
    //   57: getfield 67	com/taobao/munion/filecache/k:d	Ljava/io/RandomAccessFile;
    //   60: ifnonnull +20 -> 80
    //   63: aload_0
    //   64: new 69	java/io/RandomAccessFile
    //   67: dup
    //   68: aload_3
    //   69: invokevirtual 73	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   72: ldc 75
    //   74: invokespecial 78	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: putfield 67	com/taobao/munion/filecache/k:d	Ljava/io/RandomAccessFile;
    //   80: aload_0
    //   81: getfield 80	com/taobao/munion/filecache/k:e	Ljava/nio/channels/FileChannel;
    //   84: ifnonnull +14 -> 98
    //   87: aload_0
    //   88: aload_0
    //   89: getfield 67	com/taobao/munion/filecache/k:d	Ljava/io/RandomAccessFile;
    //   92: invokevirtual 84	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   95: putfield 80	com/taobao/munion/filecache/k:e	Ljava/nio/channels/FileChannel;
    //   98: aload_0
    //   99: aload_0
    //   100: getfield 80	com/taobao/munion/filecache/k:e	Ljava/nio/channels/FileChannel;
    //   103: invokevirtual 90	java/nio/channels/FileChannel:tryLock	()Ljava/nio/channels/FileLock;
    //   106: putfield 92	com/taobao/munion/filecache/k:h	Ljava/nio/channels/FileLock;
    //   109: aload_0
    //   110: getfield 92	com/taobao/munion/filecache/k:h	Ljava/nio/channels/FileLock;
    //   113: astore_3
    //   114: aload_3
    //   115: ifnonnull +28 -> 143
    //   118: aload_0
    //   119: monitorexit
    //   120: iload_1
    //   121: ireturn
    //   122: astore_3
    //   123: aload_3
    //   124: invokevirtual 95	java/io/IOException:printStackTrace	()V
    //   127: goto -9 -> 118
    //   130: astore_3
    //   131: aload_0
    //   132: monitorexit
    //   133: aload_3
    //   134: athrow
    //   135: astore_3
    //   136: aload_3
    //   137: invokevirtual 96	java/lang/Exception:printStackTrace	()V
    //   140: goto -22 -> 118
    //   143: aload_0
    //   144: new 98	java/util/concurrent/locks/ReentrantReadWriteLock
    //   147: dup
    //   148: invokespecial 99	java/util/concurrent/locks/ReentrantReadWriteLock:<init>	()V
    //   151: putfield 101	com/taobao/munion/filecache/k:g	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   154: aload_0
    //   155: iconst_1
    //   156: putfield 37	com/taobao/munion/filecache/k:a	Z
    //   159: iconst_1
    //   160: istore_1
    //   161: goto -43 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	this	k
    //   1	160	1	bool1	boolean
    //   35	2	2	bool2	boolean
    //   22	93	3	localObject1	Object
    //   122	2	3	localIOException	IOException
    //   130	4	3	localObject2	Object
    //   135	2	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   40	45	122	java/io/IOException
    //   4	36	130	finally
    //   40	45	130	finally
    //   45	56	130	finally
    //   56	80	130	finally
    //   80	98	130	finally
    //   98	114	130	finally
    //   123	127	130	finally
    //   136	140	130	finally
    //   143	159	130	finally
    //   56	80	135	java/lang/Exception
    //   80	98	135	java/lang/Exception
    //   98	114	135	java/lang/Exception
  }
  
  /* Error */
  public boolean a(String paramString, ByteBuffer paramByteBuffer)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 37	com/taobao/munion/filecache/k:a	Z
    //   6: ifeq +83 -> 89
    //   9: aload_0
    //   10: getfield 101	com/taobao/munion/filecache/k:g	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   13: invokevirtual 106	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   16: invokevirtual 111	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:lock	()V
    //   19: new 113	com/taobao/munion/filecache/k$a
    //   22: dup
    //   23: aload_0
    //   24: invokespecial 116	com/taobao/munion/filecache/k$a:<init>	(Lcom/taobao/munion/filecache/k;)V
    //   27: astore 4
    //   29: aload_2
    //   30: iconst_0
    //   31: invokevirtual 122	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   34: pop
    //   35: aload 4
    //   37: aload_0
    //   38: getfield 80	com/taobao/munion/filecache/k:e	Ljava/nio/channels/FileChannel;
    //   41: invokevirtual 125	java/nio/channels/FileChannel:position	()J
    //   44: putfield 128	com/taobao/munion/filecache/k$a:a	J
    //   47: aload 4
    //   49: aload_2
    //   50: invokevirtual 132	java/nio/ByteBuffer:capacity	()I
    //   53: i2l
    //   54: putfield 134	com/taobao/munion/filecache/k$a:b	J
    //   57: aload_0
    //   58: getfield 80	com/taobao/munion/filecache/k:e	Ljava/nio/channels/FileChannel;
    //   61: aload_2
    //   62: invokevirtual 138	java/nio/channels/FileChannel:write	(Ljava/nio/ByteBuffer;)I
    //   65: pop
    //   66: aload_0
    //   67: getfield 65	com/taobao/munion/filecache/k:f	Ljava/util/HashMap;
    //   70: aload_1
    //   71: aload 4
    //   73: invokevirtual 142	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   76: pop
    //   77: aload_0
    //   78: getfield 101	com/taobao/munion/filecache/k:g	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   81: invokevirtual 106	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   84: invokevirtual 145	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   87: iconst_1
    //   88: istore_3
    //   89: iload_3
    //   90: ireturn
    //   91: astore_1
    //   92: aload_1
    //   93: invokevirtual 95	java/io/IOException:printStackTrace	()V
    //   96: aload_0
    //   97: getfield 101	com/taobao/munion/filecache/k:g	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   100: invokevirtual 106	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   103: invokevirtual 145	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   106: iconst_0
    //   107: ireturn
    //   108: astore_1
    //   109: aload_0
    //   110: getfield 101	com/taobao/munion/filecache/k:g	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   113: invokevirtual 106	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   116: invokevirtual 145	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   119: aload_1
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	k
    //   0	121	1	paramString	String
    //   0	121	2	paramByteBuffer	ByteBuffer
    //   1	89	3	bool	boolean
    //   27	45	4	locala	k.a
    // Exception table:
    //   from	to	target	type
    //   29	66	91	java/io/IOException
    //   19	29	108	finally
    //   29	66	108	finally
    //   66	77	108	finally
    //   92	96	108	finally
  }
  
  public String[] a(String paramString)
  {
    if (this.a) {
      this.g.readLock().lock();
    }
    for (;;)
    {
      int i;
      try
      {
        ArrayList localArrayList = new ArrayList();
        Object[] arrayOfObject = this.f.keySet().toArray();
        i = 0;
        if (i < arrayOfObject.length)
        {
          String str = (String)arrayOfObject[i];
          if ((str != null) && (str.startsWith(paramString))) {
            localArrayList.add(str);
          }
        }
        else
        {
          if (localArrayList.size() > 0)
          {
            paramString = (String[])localArrayList.toArray(new String[localArrayList.size()]);
            return paramString;
          }
          return null;
        }
      }
      finally
      {
        this.g.readLock().unlock();
      }
      i += 1;
    }
  }
  
  public boolean b()
  {
    boolean bool = false;
    if (this.a) {
      this.g.writeLock().lock();
    }
    try
    {
      this.e.truncate(0L);
      this.f.clear();
      this.g.writeLock().unlock();
      bool = true;
      return bool;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
      return false;
    }
    finally
    {
      this.g.writeLock().unlock();
    }
  }
  
  public boolean b(String paramString)
  {
    if (this.a) {
      this.g.writeLock().lock();
    }
    try
    {
      if (this.f.containsKey(paramString))
      {
        this.f.remove(paramString);
        return true;
      }
      return false;
    }
    finally
    {
      this.g.writeLock().unlock();
    }
  }
  
  public boolean c()
  {
    return this.c;
  }
  
  public byte[] c(String paramString)
  {
    if (this.a)
    {
      this.g.readLock().lock();
      try
      {
        if (this.f.containsKey(paramString))
        {
          paramString = (k.a)this.f.get(paramString);
          ByteBuffer localByteBuffer = ByteBuffer.allocate((int)paramString.b);
          try
          {
            this.e.read(localByteBuffer, paramString.a);
            paramString = localByteBuffer.array();
            return paramString;
          }
          catch (IOException paramString)
          {
            paramString.printStackTrace();
            return null;
          }
        }
        return null;
      }
      finally
      {
        this.g.readLock().unlock();
      }
    }
    return null;
  }
  
  protected void finalize()
  {
    if (this.h != null) {
      this.h.release();
    }
    if (this.d != null) {}
    try
    {
      this.d.close();
      if (this.e == null) {}
    }
    catch (Exception localException1)
    {
      try
      {
        this.e.close();
        super.finalize();
        return;
        localException1 = localException1;
        localException1.printStackTrace();
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          localException2.printStackTrace();
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\filecache\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */