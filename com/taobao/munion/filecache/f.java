package com.taobao.munion.filecache;

import android.os.Looper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class f
{
  public static String a = "tbsdk_android_finfo.dat";
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = 4;
  private boolean f;
  private String g;
  private boolean h;
  private PriorityBlockingQueue<h> i;
  private HashMap<String, h> j;
  private RandomAccessFile k;
  private FileChannel l;
  private g m;
  private j n;
  private ReentrantLock o;
  private boolean p = false;
  private int q = 100;
  private FileLock r;
  private long s;
  private long t;
  
  protected f(String paramString, Boolean paramBoolean)
  {
    this.f = paramBoolean.booleanValue();
    this.g = paramString;
    this.h = false;
    this.t = Looper.getMainLooper().getThread().getId();
  }
  
  private void a(long paramLong)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(Long.toString(paramLong).getBytes());
    try
    {
      localByteBuffer.position(0);
      this.l.write(localByteBuffer, 0L);
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  private void a(h paramh)
  {
    byte[] arrayOfByte = paramh.c();
    if (arrayOfByte == null) {
      return;
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(arrayOfByte.length + 1);
    localByteBuffer.put(arrayOfByte);
    localByteBuffer.put((byte)10);
    try
    {
      localByteBuffer.position(0);
      this.l.write(localByteBuffer, paramh.b());
      return;
    }
    catch (IOException paramh)
    {
      paramh.printStackTrace();
    }
  }
  
  private void a(PriorityBlockingQueue<h> paramPriorityBlockingQueue)
  {
    int i2 = 0;
    Object localObject = new ArrayList();
    int i1;
    h localh;
    if (this.m == null)
    {
      this.o.lock();
      try
      {
        i1 = paramPriorityBlockingQueue.size() - (this.q - 1);
        if (i1 > 0)
        {
          localh = (h)paramPriorityBlockingQueue.poll();
          if (localh != null) {
            ((ArrayList)localObject).add(localh);
          }
        }
        else
        {
          paramPriorityBlockingQueue.addAll((Collection)localObject);
          this.o.unlock();
          paramPriorityBlockingQueue = (h[])((ArrayList)localObject).toArray(new h[((ArrayList)localObject).size()]);
          i1 = i2;
          while (i1 < paramPriorityBlockingQueue.length)
          {
            e(paramPriorityBlockingQueue[i1].a());
            i1 += 1;
          }
        }
      }
      finally
      {
        this.o.unlock();
      }
    }
    for (;;)
    {
      try
      {
        i1 = paramPriorityBlockingQueue.size() - (this.q - 1);
        if (i1 > 0)
        {
          localh = (h)paramPriorityBlockingQueue.poll();
          if (localh == null) {
            break label373;
          }
          ((ArrayList)localObject).add(localh);
          break label373;
        }
        paramPriorityBlockingQueue.addAll((Collection)localObject);
        this.o.unlock();
        localObject = (h[])((ArrayList)localObject).toArray(new h[((ArrayList)localObject).size()]);
        i1 = 0;
        if (i1 < localObject.length) {
          if (!this.m.a(localObject[i1].a()))
          {
            e(localObject[i1].a());
            i1 += 1;
            continue;
          }
        }
      }
      finally
      {
        this.o.unlock();
      }
      try
      {
        this.j.remove(localObject[i1].a());
        paramPriorityBlockingQueue.remove(localObject[i1]);
        localObject[i1] = this.n.a(localObject[i1].a(), localObject[i1], 3, 0L);
        a(localObject[i1]);
        this.o.unlock();
      }
      finally
      {
        this.o.unlock();
      }
      i1 -= 1;
      break;
      label373:
      i1 -= 1;
    }
  }
  
  private boolean e(String paramString)
  {
    File localFile2 = new File(paramString);
    boolean bool = b.c(paramString);
    if (bool)
    {
      Object localObject = localFile2.getParentFile();
      if (!((File)localObject).getAbsolutePath().equals(this.g))
      {
        File localFile1;
        do
        {
          if (!((File)localObject).delete()) {
            break;
          }
          localFile1 = ((File)localObject).getParentFile();
          localObject = localFile1;
        } while (!localFile1.getAbsolutePath().equals(this.g));
      }
    }
    this.o.lock();
    try
    {
      if ((this.j.containsKey(paramString)) && ((bool) || (!localFile2.exists())))
      {
        paramString = (h)this.j.get(paramString);
        this.j.remove(localFile2.getAbsolutePath());
        this.i.remove(paramString);
        a(this.n.a(paramString.a(), paramString, 3, 0L));
        return true;
      }
      return bool;
    }
    finally
    {
      this.o.unlock();
    }
  }
  
  private boolean f(String paramString)
  {
    int i1 = 14;
    int i3 = 0;
    for (;;)
    {
      ByteArrayOutputStream localByteArrayOutputStream;
      try
      {
        paramString = ByteBuffer.allocate((int)this.l.size());
        this.l.read(paramString);
        paramString = paramString.array();
        if (paramString != null)
        {
          localByteArrayOutputStream = new ByteArrayOutputStream();
          if ((paramString.length > 13) && (paramString[13] == 10)) {
            localObject = new String(paramString, 0, 13);
          }
        }
      }
      catch (Exception paramString)
      {
        try
        {
          Object localObject;
          this.s = Long.parseLong((String)localObject);
          localByteArrayOutputStream.write(paramString, 0, 14);
          int i2 = this.n.a();
          try
          {
            i4 = this.g.getBytes("utf-8").length;
            i2 += i4;
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
            int i4;
            int i5;
            int i6;
            int i7;
            long l1;
            localUnsupportedEncodingException.printStackTrace();
            continue;
            i1 = 1;
            continue;
            i1 = 1;
            continue;
            if (i4 == 0) {
              break label460;
            }
            try
            {
              this.l.truncate(0L);
              this.l.position(0L);
              paramString = ByteBuffer.wrap(localByteArrayOutputStream.toByteArray());
              paramString.position(0);
              this.l.write(paramString);
            }
            catch (IOException paramString)
            {
              for (;;)
              {
                try
                {
                  localByteArrayOutputStream.close();
                  return true;
                }
                catch (IOException paramString)
                {
                  paramString.printStackTrace();
                  return true;
                }
                paramString = paramString;
                paramString.printStackTrace();
              }
            }
          }
          i4 = i3;
          i3 = i2;
          i5 = i1;
          if (i3 >= paramString.length) {
            break label408;
          }
          i6 = i5;
          i7 = i3;
          i1 = i4;
          if (paramString[i3] == 10)
          {
            localObject = this.n.a(paramString, i5, i3 - i5);
            if (localObject == null) {
              break label403;
            }
            l1 = ((h)localObject).b(this.s);
            if (l1 > this.s) {
              this.s = l1;
            }
            if (this.j.containsKey(((h)localObject).a())) {
              break label398;
            }
            ((h)localObject).a(localByteArrayOutputStream.size());
            this.i.add(localObject);
            this.j.put(((h)localObject).a(), localObject);
            localByteArrayOutputStream.write(paramString, i5, i3 - i5 + 1);
            i1 = i4;
            i6 = i3 + 1;
            i7 = i3 + i2;
          }
          i3 = i7 + 1;
          i5 = i6;
          i4 = i1;
          continue;
          paramString = paramString;
          paramString.printStackTrace();
          paramString = null;
        }
        catch (Exception localException)
        {
          this.s = 2000000000000L;
          localException.printStackTrace();
          continue;
        }
        this.s = 2000000000000L;
        try
        {
          localByteArrayOutputStream.write("2000000000000".getBytes());
          localByteArrayOutputStream.write(10);
          if (paramString.length != 0) {
            break label479;
          }
          i1 = 0;
          i3 = 1;
        }
        catch (IOException localIOException)
        {
          localIOException.printStackTrace();
          continue;
        }
      }
      label398:
      label403:
      label408:
      label460:
      return false;
      label479:
      i1 = 0;
    }
  }
  
  public void a(int paramInt)
  {
    if (!this.h) {}
    do
    {
      return;
      this.q = paramInt;
    } while (this.i.size() <= paramInt);
    a(this.i);
  }
  
  public void a(g paramg)
  {
    this.m = paramg;
  }
  
  public void a(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  public boolean a()
  {
    if (!this.h) {}
    while (this.i.size() == 0) {
      return true;
    }
    return false;
  }
  
  /* Error */
  public boolean a(String paramString, ByteBuffer paramByteBuffer)
  {
    // Byte code:
    //   0: invokestatic 330	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   3: invokevirtual 85	java/lang/Thread:getId	()J
    //   6: pop2
    //   7: aload_0
    //   8: getfield 87	com/taobao/munion/filecache/f:t	J
    //   11: lstore_3
    //   12: aload_0
    //   13: getfield 69	com/taobao/munion/filecache/f:h	Z
    //   16: ifeq +374 -> 390
    //   19: new 214	java/io/File
    //   22: dup
    //   23: aload_0
    //   24: getfield 67	com/taobao/munion/filecache/f:g	Ljava/lang/String;
    //   27: aload_1
    //   28: invokespecial 333	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   31: astore_1
    //   32: aload_1
    //   33: invokevirtual 228	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   36: aload_2
    //   37: invokestatic 335	com/taobao/munion/filecache/b:a	(Ljava/lang/String;Ljava/nio/ByteBuffer;)Z
    //   40: istore 5
    //   42: iload 5
    //   44: ifeq +346 -> 390
    //   47: aload_0
    //   48: getfield 148	com/taobao/munion/filecache/f:o	Ljava/util/concurrent/locks/ReentrantLock;
    //   51: invokevirtual 153	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   54: aload_0
    //   55: getfield 193	com/taobao/munion/filecache/f:j	Ljava/util/HashMap;
    //   58: aload_1
    //   59: invokevirtual 228	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   62: invokevirtual 237	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   65: ifeq +174 -> 239
    //   68: aload_0
    //   69: getfield 193	com/taobao/munion/filecache/f:j	Ljava/util/HashMap;
    //   72: aload_1
    //   73: invokevirtual 228	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   76: invokevirtual 243	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   79: checkcast 126	com/taobao/munion/filecache/h
    //   82: astore_1
    //   83: aload_0
    //   84: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   87: aload_1
    //   88: invokevirtual 201	java/util/concurrent/PriorityBlockingQueue:remove	(Ljava/lang/Object;)Z
    //   91: pop
    //   92: aload_0
    //   93: getfield 203	com/taobao/munion/filecache/f:n	Lcom/taobao/munion/filecache/j;
    //   96: astore_2
    //   97: aload_1
    //   98: invokeinterface 184 1 0
    //   103: astore 6
    //   105: aload_0
    //   106: getfield 270	com/taobao/munion/filecache/f:s	J
    //   109: lstore_3
    //   110: aload_0
    //   111: lload_3
    //   112: lconst_1
    //   113: ladd
    //   114: putfield 270	com/taobao/munion/filecache/f:s	J
    //   117: aload_2
    //   118: aload 6
    //   120: aload_1
    //   121: iconst_2
    //   122: lload_3
    //   123: invokeinterface 208 6 0
    //   128: astore_1
    //   129: aload_0
    //   130: aload_0
    //   131: getfield 270	com/taobao/munion/filecache/f:s	J
    //   134: invokespecial 336	com/taobao/munion/filecache/f:a	(J)V
    //   137: aload_0
    //   138: getfield 193	com/taobao/munion/filecache/f:j	Ljava/util/HashMap;
    //   141: aload_1
    //   142: invokeinterface 184 1 0
    //   147: aload_1
    //   148: invokevirtual 292	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   151: pop
    //   152: aload_0
    //   153: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   156: aload_1
    //   157: invokevirtual 339	java/util/concurrent/PriorityBlockingQueue:put	(Ljava/lang/Object;)V
    //   160: aload_0
    //   161: aload_1
    //   162: invokespecial 210	com/taobao/munion/filecache/f:a	(Lcom/taobao/munion/filecache/h;)V
    //   165: aload_0
    //   166: getfield 148	com/taobao/munion/filecache/f:o	Ljava/util/concurrent/locks/ReentrantLock;
    //   169: invokevirtual 174	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   172: aload_0
    //   173: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   176: invokevirtual 159	java/util/concurrent/PriorityBlockingQueue:size	()I
    //   179: aload_0
    //   180: getfield 57	com/taobao/munion/filecache/f:q	I
    //   183: if_icmplt +11 -> 194
    //   186: aload_0
    //   187: aload_0
    //   188: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   191: invokespecial 320	com/taobao/munion/filecache/f:a	(Ljava/util/concurrent/PriorityBlockingQueue;)V
    //   194: iconst_1
    //   195: ireturn
    //   196: astore 6
    //   198: aload 6
    //   200: invokevirtual 340	com/taobao/munion/filecache/l:printStackTrace	()V
    //   203: aload_0
    //   204: getfield 55	com/taobao/munion/filecache/f:p	Z
    //   207: ifeq +26 -> 233
    //   210: aload_0
    //   211: invokevirtual 342	com/taobao/munion/filecache/f:e	()Z
    //   214: pop
    //   215: aload_1
    //   216: invokevirtual 228	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   219: aload_2
    //   220: invokestatic 335	com/taobao/munion/filecache/b:a	(Ljava/lang/String;Ljava/nio/ByteBuffer;)Z
    //   223: istore 5
    //   225: goto -183 -> 42
    //   228: astore_2
    //   229: aload_2
    //   230: invokevirtual 340	com/taobao/munion/filecache/l:printStackTrace	()V
    //   233: iconst_0
    //   234: istore 5
    //   236: goto -194 -> 42
    //   239: aload_0
    //   240: getfield 203	com/taobao/munion/filecache/f:n	Lcom/taobao/munion/filecache/j;
    //   243: astore_2
    //   244: aload_1
    //   245: invokevirtual 228	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   248: astore_1
    //   249: aload_0
    //   250: getfield 270	com/taobao/munion/filecache/f:s	J
    //   253: lstore_3
    //   254: aload_0
    //   255: lconst_1
    //   256: lload_3
    //   257: ladd
    //   258: putfield 270	com/taobao/munion/filecache/f:s	J
    //   261: aload_2
    //   262: aload_1
    //   263: aconst_null
    //   264: iconst_4
    //   265: lload_3
    //   266: invokeinterface 208 6 0
    //   271: astore_1
    //   272: aload_0
    //   273: aload_0
    //   274: getfield 270	com/taobao/munion/filecache/f:s	J
    //   277: invokespecial 336	com/taobao/munion/filecache/f:a	(J)V
    //   280: aload_1
    //   281: aload_0
    //   282: getfield 114	com/taobao/munion/filecache/f:l	Ljava/nio/channels/FileChannel;
    //   285: invokevirtual 251	java/nio/channels/FileChannel:size	()J
    //   288: invokeinterface 288 3 0
    //   293: aload_0
    //   294: getfield 193	com/taobao/munion/filecache/f:j	Ljava/util/HashMap;
    //   297: aload_1
    //   298: invokeinterface 184 1 0
    //   303: aload_1
    //   304: invokevirtual 292	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   307: pop
    //   308: aload_1
    //   309: ifnull +11 -> 320
    //   312: aload_0
    //   313: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   316: aload_1
    //   317: invokevirtual 339	java/util/concurrent/PriorityBlockingQueue:put	(Ljava/lang/Object;)V
    //   320: aload_0
    //   321: aload_1
    //   322: invokespecial 210	com/taobao/munion/filecache/f:a	(Lcom/taobao/munion/filecache/h;)V
    //   325: aload_0
    //   326: getfield 148	com/taobao/munion/filecache/f:o	Ljava/util/concurrent/locks/ReentrantLock;
    //   329: invokevirtual 174	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   332: aload_0
    //   333: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   336: invokevirtual 159	java/util/concurrent/PriorityBlockingQueue:size	()I
    //   339: aload_0
    //   340: getfield 57	com/taobao/munion/filecache/f:q	I
    //   343: if_icmplt +11 -> 354
    //   346: aload_0
    //   347: aload_0
    //   348: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   351: invokespecial 320	com/taobao/munion/filecache/f:a	(Ljava/util/concurrent/PriorityBlockingQueue;)V
    //   354: iconst_1
    //   355: ireturn
    //   356: astore_1
    //   357: aload_1
    //   358: invokevirtual 123	java/io/IOException:printStackTrace	()V
    //   361: aload_0
    //   362: getfield 148	com/taobao/munion/filecache/f:o	Ljava/util/concurrent/locks/ReentrantLock;
    //   365: invokevirtual 174	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   368: aload_0
    //   369: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   372: invokevirtual 159	java/util/concurrent/PriorityBlockingQueue:size	()I
    //   375: aload_0
    //   376: getfield 57	com/taobao/munion/filecache/f:q	I
    //   379: if_icmplt +11 -> 390
    //   382: aload_0
    //   383: aload_0
    //   384: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   387: invokespecial 320	com/taobao/munion/filecache/f:a	(Ljava/util/concurrent/PriorityBlockingQueue;)V
    //   390: iconst_0
    //   391: ireturn
    //   392: astore_1
    //   393: aload_1
    //   394: invokevirtual 343	java/lang/NullPointerException:printStackTrace	()V
    //   397: goto -36 -> 361
    //   400: astore_1
    //   401: aload_0
    //   402: getfield 148	com/taobao/munion/filecache/f:o	Ljava/util/concurrent/locks/ReentrantLock;
    //   405: invokevirtual 174	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   408: aload_0
    //   409: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   412: invokevirtual 159	java/util/concurrent/PriorityBlockingQueue:size	()I
    //   415: aload_0
    //   416: getfield 57	com/taobao/munion/filecache/f:q	I
    //   419: if_icmplt +11 -> 430
    //   422: aload_0
    //   423: aload_0
    //   424: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   427: invokespecial 320	com/taobao/munion/filecache/f:a	(Ljava/util/concurrent/PriorityBlockingQueue;)V
    //   430: aload_1
    //   431: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	432	0	this	f
    //   0	432	1	paramString	String
    //   0	432	2	paramByteBuffer	ByteBuffer
    //   11	255	3	l1	long
    //   40	195	5	bool	boolean
    //   103	16	6	str	String
    //   196	3	6	locall	l
    // Exception table:
    //   from	to	target	type
    //   32	42	196	com/taobao/munion/filecache/l
    //   215	225	228	com/taobao/munion/filecache/l
    //   280	308	356	java/io/IOException
    //   312	320	356	java/io/IOException
    //   320	325	356	java/io/IOException
    //   280	308	392	java/lang/NullPointerException
    //   312	320	392	java/lang/NullPointerException
    //   320	325	392	java/lang/NullPointerException
    //   54	165	400	finally
    //   239	280	400	finally
    //   280	308	400	finally
    //   312	320	400	finally
    //   320	325	400	finally
    //   357	361	400	finally
    //   393	397	400	finally
  }
  
  public boolean a(Comparator<h> paramComparator, j paramj)
  {
    boolean bool2 = false;
    for (;;)
    {
      File localFile;
      try
      {
        if (this.h) {
          break label292;
        }
        localFile = new File(this.g, a);
        new File(this.g).mkdirs();
        bool1 = localFile.exists();
        if (!bool1) {}
        try
        {
          localFile.createNewFile();
        }
        catch (IOException paramComparator)
        {
          FileLock localFileLock;
          paramComparator.printStackTrace();
          bool1 = bool2;
          continue;
        }
      }
      finally {}
      try
      {
        if (this.k == null) {
          this.k = new RandomAccessFile(localFile.getAbsolutePath(), "rw");
        }
        if (this.l == null) {
          this.l = this.k.getChannel();
        }
        this.r = this.l.tryLock();
        localFileLock = this.r;
        if (localFileLock != null) {
          break label159;
        }
        bool1 = bool2;
      }
      catch (Exception paramComparator)
      {
        paramComparator.printStackTrace();
        bool1 = bool2;
        continue;
        label159:
        if (paramComparator == null) {
          break label234;
        }
        this.i = new PriorityBlockingQueue(100, paramComparator);
        this.j = new HashMap();
        if (paramj != null) {
          break label248;
        }
        label234:
        label248:
        for (this.n = new a();; this.n = paramj)
        {
          if (!f(localFile.getAbsolutePath())) {
            break label256;
          }
          this.o = new ReentrantLock();
          this.h = true;
          break label292;
          this.i = new PriorityBlockingQueue();
          break;
        }
        label256:
        paramComparator = this.r;
        bool1 = bool2;
        if (paramComparator == null) {
          continue;
        }
        try
        {
          this.r.release();
          bool1 = bool2;
        }
        catch (IOException paramComparator)
        {
          paramComparator.printStackTrace();
          bool1 = bool2;
        }
        continue;
      }
      return bool1;
      label292:
      boolean bool1 = true;
    }
  }
  
  public String[] a(String paramString)
  {
    if (this.h) {
      this.o.lock();
    }
    for (;;)
    {
      int i1;
      try
      {
        ArrayList localArrayList = new ArrayList();
        Object[] arrayOfObject = this.j.keySet().toArray();
        i1 = 0;
        if (i1 < arrayOfObject.length)
        {
          String str = (String)arrayOfObject[i1];
          if (str.length() > this.g.length() + 1)
          {
            str = str.substring(this.g.length() + 1);
            if ((str != null) && (str.startsWith(paramString))) {
              localArrayList.add(str);
            }
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
        this.o.unlock();
      }
      i1 += 1;
    }
  }
  
  public h b(String paramString)
  {
    if (this.h)
    {
      this.o.lock();
      try
      {
        paramString = new File(this.g, paramString);
        if (this.j.containsKey(paramString.getAbsolutePath()))
        {
          if (!paramString.exists())
          {
            h localh = (h)this.j.get(paramString.getAbsolutePath());
            this.j.remove(paramString.getAbsolutePath());
            this.i.remove(localh);
            return null;
          }
          paramString = (h)this.j.get(paramString.getAbsolutePath());
          return paramString;
        }
        return null;
      }
      finally
      {
        this.o.unlock();
      }
    }
    return null;
  }
  
  public boolean b()
  {
    return this.f;
  }
  
  public String c()
  {
    return this.g;
  }
  
  public byte[] c(String paramString)
  {
    Object localObject2 = null;
    Thread.currentThread().getId();
    long l1 = this.t;
    Object localObject1 = localObject2;
    if (this.h) {
      this.o.lock();
    }
    for (;;)
    {
      try
      {
        paramString = new File(this.g, paramString);
        if (this.j.containsKey(paramString.getAbsolutePath()))
        {
          paramString = (h)this.j.get(paramString.getAbsolutePath());
          this.i.remove(paramString);
          localObject1 = this.n;
          String str = paramString.a();
          l1 = this.s;
          this.s = (1L + l1);
          paramString = ((j)localObject1).a(str, paramString, 1, l1);
          a(this.s);
          this.j.put(paramString.a(), paramString);
          this.i.put(paramString);
          a(paramString);
          this.o.unlock();
          localObject1 = localObject2;
          if (paramString != null) {
            localObject1 = b.b(paramString.a());
          }
          return (byte[])localObject1;
        }
      }
      finally
      {
        this.o.unlock();
      }
      paramString = null;
    }
  }
  
  public void d()
  {
    File localFile = new File(this.g, ".nomedia");
    try
    {
      localFile.createNewFile();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  public boolean d(String paramString)
  {
    Thread.currentThread().getId();
    long l1 = this.t;
    if (this.h) {
      return e(new File(this.g, paramString).getAbsolutePath());
    }
    return false;
  }
  
  /* Error */
  public boolean e()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: invokestatic 330	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   5: invokevirtual 85	java/lang/Thread:getId	()J
    //   8: pop2
    //   9: aload_0
    //   10: getfield 87	com/taobao/munion/filecache/f:t	J
    //   13: lstore_2
    //   14: aload_0
    //   15: getfield 69	com/taobao/munion/filecache/f:h	Z
    //   18: ifeq +98 -> 116
    //   21: iconst_1
    //   22: istore 4
    //   24: iconst_1
    //   25: istore 5
    //   27: aload_0
    //   28: getfield 148	com/taobao/munion/filecache/f:o	Ljava/util/concurrent/locks/ReentrantLock;
    //   31: invokevirtual 153	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   34: aload_0
    //   35: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   38: aload_0
    //   39: getfield 245	com/taobao/munion/filecache/f:i	Ljava/util/concurrent/PriorityBlockingQueue;
    //   42: invokevirtual 159	java/util/concurrent/PriorityBlockingQueue:size	()I
    //   45: anewarray 126	com/taobao/munion/filecache/h
    //   48: invokevirtual 417	java/util/concurrent/PriorityBlockingQueue:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   51: checkcast 181	[Lcom/taobao/munion/filecache/h;
    //   54: astore 6
    //   56: aload_0
    //   57: getfield 148	com/taobao/munion/filecache/f:o	Ljava/util/concurrent/locks/ReentrantLock;
    //   60: invokevirtual 174	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   63: aload 6
    //   65: ifnull +54 -> 119
    //   68: iload 5
    //   70: istore 4
    //   72: iload_1
    //   73: aload 6
    //   75: arraylength
    //   76: if_icmpge +43 -> 119
    //   79: iload 5
    //   81: aload_0
    //   82: aload 6
    //   84: iload_1
    //   85: aaload
    //   86: invokeinterface 184 1 0
    //   91: invokespecial 187	com/taobao/munion/filecache/f:e	(Ljava/lang/String;)Z
    //   94: iand
    //   95: istore 5
    //   97: iload_1
    //   98: iconst_1
    //   99: iadd
    //   100: istore_1
    //   101: goto -33 -> 68
    //   104: astore 6
    //   106: aload_0
    //   107: getfield 148	com/taobao/munion/filecache/f:o	Ljava/util/concurrent/locks/ReentrantLock;
    //   110: invokevirtual 174	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   113: aload 6
    //   115: athrow
    //   116: iconst_0
    //   117: istore 4
    //   119: iload 4
    //   121: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	f
    //   1	100	1	i1	int
    //   13	1	2	l1	long
    //   22	98	4	bool1	boolean
    //   25	71	5	bool2	boolean
    //   54	29	6	arrayOfh	h[]
    //   104	10	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   34	56	104	finally
  }
  
  protected void finalize()
  {
    if (this.r != null) {
      this.r.release();
    }
    if (this.k != null) {}
    try
    {
      this.k.close();
      if (this.l == null) {}
    }
    catch (Exception localException1)
    {
      try
      {
        this.l.close();
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\filecache\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */