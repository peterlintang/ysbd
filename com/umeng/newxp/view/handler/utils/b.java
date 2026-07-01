package com.umeng.newxp.view.handler.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.LruCache;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;

public class b
{
  static b a;
  private static final String b = "ImageCache";
  private static final int c = 5120;
  private static final int d = 10485760;
  private static final Bitmap.CompressFormat e = Bitmap.CompressFormat.PNG;
  private static final int f = 70;
  private static final int g = 0;
  private static final boolean h = true;
  private static final boolean i = true;
  private static final boolean j = false;
  private a k;
  private LruCache<String, BitmapDrawable> l;
  private b.a m;
  private final Object n = new Object();
  private boolean o = true;
  private HashSet<SoftReference<Bitmap>> p;
  
  private b(b.a parama)
  {
    b(parama);
  }
  
  public static int a(BitmapDrawable paramBitmapDrawable)
  {
    paramBitmapDrawable = paramBitmapDrawable.getBitmap();
    if (f.e()) {
      return paramBitmapDrawable.getByteCount();
    }
    int i1 = paramBitmapDrawable.getRowBytes();
    return paramBitmapDrawable.getHeight() * i1;
  }
  
  public static long a(File paramFile)
  {
    if (f.c()) {
      return paramFile.getUsableSpace();
    }
    paramFile = new StatFs(paramFile.getPath());
    return paramFile.getBlockSize() * paramFile.getAvailableBlocks();
  }
  
  private static b.b a(FragmentManager paramFragmentManager)
  {
    b.b localb2 = (b.b)paramFragmentManager.findFragmentByTag("ImageCache");
    b.b localb1 = localb2;
    if (localb2 == null)
    {
      localb1 = new b.b();
      paramFragmentManager.beginTransaction().add(localb1, "ImageCache").commitAllowingStateLoss();
    }
    return localb1;
  }
  
  public static b a(FragmentManager paramFragmentManager, b.a parama)
  {
    b.b localb1 = a(paramFragmentManager);
    b localb = (b)localb1.a();
    paramFragmentManager = localb;
    if (localb == null)
    {
      paramFragmentManager = new b(parama);
      localb1.a(paramFragmentManager);
    }
    return paramFragmentManager;
  }
  
  public static b a(b.a parama)
  {
    if (a == null) {
      a = new b(parama);
    }
    return a;
  }
  
  public static File a(Context paramContext)
  {
    if (f.b()) {
      return paramContext.getExternalCacheDir();
    }
    paramContext = "/Android/data/" + paramContext.getPackageName() + "/cache/";
    return new File(Environment.getExternalStorageDirectory().getPath() + paramContext);
  }
  
  public static File a(Context paramContext, String paramString)
  {
    try
    {
      if (("mounted".equals(Environment.getExternalStorageState())) || (!e())) {}
      for (String str = a(paramContext).getPath();; str = paramContext.getCacheDir().getPath()) {
        return new File(str + File.separator + paramString);
      }
      return new File(paramContext.getCacheDir().getPath() + File.separator + paramString);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private static String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i1 = 0;
    while (i1 < paramArrayOfByte.length)
    {
      String str = Integer.toHexString(paramArrayOfByte[i1] & 0xFF);
      if (str.length() == 1) {
        localStringBuilder.append('0');
      }
      localStringBuilder.append(str);
      i1 += 1;
    }
    return localStringBuilder.toString();
  }
  
  private static boolean a(Bitmap paramBitmap, BitmapFactory.Options paramOptions)
  {
    int i1 = paramOptions.outWidth / paramOptions.inSampleSize;
    int i2 = paramOptions.outHeight / paramOptions.inSampleSize;
    return (paramBitmap.getWidth() == i1) && (paramBitmap.getHeight() == i2);
  }
  
  private void b(b.a parama)
  {
    this.m = parama;
    if (this.m.f)
    {
      if (f.d()) {
        this.p = new HashSet();
      }
      this.l = new b.1(this, this.m.a);
    }
    if (parama.h) {
      a();
    }
  }
  
  public static String c(String paramString)
  {
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString.getBytes());
      localObject = a(((MessageDigest)localObject).digest());
      return (String)localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}
    return String.valueOf(paramString.hashCode());
  }
  
  public static boolean e()
  {
    if (f.c()) {
      return Environment.isExternalStorageRemovable();
    }
    return true;
  }
  
  protected Bitmap a(BitmapFactory.Options paramOptions)
  {
    if ((this.p != null) && (!this.p.isEmpty()))
    {
      Iterator localIterator = this.p.iterator();
      while (localIterator.hasNext())
      {
        Bitmap localBitmap = (Bitmap)((SoftReference)localIterator.next()).get();
        if ((localBitmap != null) && (localBitmap.isMutable()))
        {
          if (a(localBitmap, paramOptions))
          {
            localIterator.remove();
            return localBitmap;
          }
        }
        else {
          localIterator.remove();
        }
      }
    }
    return null;
  }
  
  public BitmapDrawable a(String paramString)
  {
    BitmapDrawable localBitmapDrawable = null;
    if (this.l != null) {
      localBitmapDrawable = (BitmapDrawable)this.l.get(paramString);
    }
    return localBitmapDrawable;
  }
  
  public void a()
  {
    synchronized (this.n)
    {
      File localFile;
      if ((this.k == null) || (this.k.d()))
      {
        localFile = this.m.c;
        if ((this.m.g) && (localFile != null))
        {
          if (!localFile.exists()) {
            localFile.mkdirs();
          }
          long l1 = a(localFile);
          int i1 = this.m.b;
          if (l1 <= i1) {}
        }
      }
      try
      {
        this.k = a.a(localFile, 1, 1, this.m.b);
        this.o = false;
        this.n.notifyAll();
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          this.m.c = null;
          new StringBuilder("initDiskCache - ").append(localIOException).toString();
        }
      }
    }
  }
  
  /* Error */
  public void a(String paramString, BitmapDrawable paramBitmapDrawable)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +7 -> 8
    //   4: aload_2
    //   5: ifnonnull +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: getfield 254	com/umeng/newxp/view/handler/utils/b:l	Landroid/support/v4/util/LruCache;
    //   13: ifnull +31 -> 44
    //   16: ldc_w 363
    //   19: aload_2
    //   20: invokevirtual 368	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   23: ifeq +11 -> 34
    //   26: aload_2
    //   27: checkcast 363	com/umeng/newxp/view/widget/RecyclingBitmapDrawable
    //   30: iconst_1
    //   31: invokevirtual 371	com/umeng/newxp/view/widget/RecyclingBitmapDrawable:b	(Z)V
    //   34: aload_0
    //   35: getfield 254	com/umeng/newxp/view/handler/utils/b:l	Landroid/support/v4/util/LruCache;
    //   38: aload_1
    //   39: aload_2
    //   40: invokevirtual 375	android/support/v4/util/LruCache:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   43: pop
    //   44: aload_0
    //   45: getfield 55	com/umeng/newxp/view/handler/utils/b:n	Ljava/lang/Object;
    //   48: astore 4
    //   50: aload 4
    //   52: monitorenter
    //   53: aload_0
    //   54: getfield 331	com/umeng/newxp/view/handler/utils/b:k	Lcom/umeng/newxp/view/handler/utils/a;
    //   57: ifnull +83 -> 140
    //   60: aload_1
    //   61: invokestatic 377	com/umeng/newxp/view/handler/utils/b:c	(Ljava/lang/String;)Ljava/lang/String;
    //   64: astore_3
    //   65: aconst_null
    //   66: astore_1
    //   67: aload_0
    //   68: getfield 331	com/umeng/newxp/view/handler/utils/b:k	Lcom/umeng/newxp/view/handler/utils/a;
    //   71: aload_3
    //   72: invokevirtual 380	com/umeng/newxp/view/handler/utils/a:a	(Ljava/lang/String;)Lcom/umeng/newxp/view/handler/utils/a$c;
    //   75: astore 5
    //   77: aload 5
    //   79: ifnonnull +71 -> 150
    //   82: aload_0
    //   83: getfield 331	com/umeng/newxp/view/handler/utils/b:k	Lcom/umeng/newxp/view/handler/utils/a;
    //   86: aload_3
    //   87: invokevirtual 383	com/umeng/newxp/view/handler/utils/a:b	(Ljava/lang/String;)Lcom/umeng/newxp/view/handler/utils/a$a;
    //   90: astore_3
    //   91: aload_3
    //   92: ifnull +40 -> 132
    //   95: aload_3
    //   96: iconst_0
    //   97: invokevirtual 388	com/umeng/newxp/view/handler/utils/a$a:c	(I)Ljava/io/OutputStream;
    //   100: astore_1
    //   101: aload_2
    //   102: invokevirtual 66	android/graphics/drawable/BitmapDrawable:getBitmap	()Landroid/graphics/Bitmap;
    //   105: aload_0
    //   106: getfield 236	com/umeng/newxp/view/handler/utils/b:m	Lcom/umeng/newxp/view/handler/utils/b$a;
    //   109: getfield 390	com/umeng/newxp/view/handler/utils/b$a:d	Landroid/graphics/Bitmap$CompressFormat;
    //   112: aload_0
    //   113: getfield 236	com/umeng/newxp/view/handler/utils/b:m	Lcom/umeng/newxp/view/handler/utils/b$a;
    //   116: getfield 392	com/umeng/newxp/view/handler/utils/b$a:e	I
    //   119: aload_1
    //   120: invokevirtual 396	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   123: pop
    //   124: aload_3
    //   125: invokevirtual 397	com/umeng/newxp/view/handler/utils/a$a:a	()V
    //   128: aload_1
    //   129: invokevirtual 402	java/io/OutputStream:close	()V
    //   132: aload_1
    //   133: ifnull +7 -> 140
    //   136: aload_1
    //   137: invokevirtual 402	java/io/OutputStream:close	()V
    //   140: aload 4
    //   142: monitorexit
    //   143: return
    //   144: astore_1
    //   145: aload 4
    //   147: monitorexit
    //   148: aload_1
    //   149: athrow
    //   150: aload 5
    //   152: iconst_0
    //   153: invokevirtual 407	com/umeng/newxp/view/handler/utils/a$c:a	(I)Ljava/io/InputStream;
    //   156: invokevirtual 410	java/io/InputStream:close	()V
    //   159: goto -27 -> 132
    //   162: astore_3
    //   163: aconst_null
    //   164: astore_2
    //   165: aload_2
    //   166: astore_1
    //   167: new 155	java/lang/StringBuilder
    //   170: dup
    //   171: ldc_w 412
    //   174: invokespecial 158	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   177: aload_3
    //   178: invokevirtual 360	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: pop
    //   185: aload_2
    //   186: ifnull -46 -> 140
    //   189: aload_2
    //   190: invokevirtual 402	java/io/OutputStream:close	()V
    //   193: goto -53 -> 140
    //   196: astore_1
    //   197: goto -57 -> 140
    //   200: astore_3
    //   201: aconst_null
    //   202: astore_2
    //   203: aload_2
    //   204: astore_1
    //   205: new 155	java/lang/StringBuilder
    //   208: dup
    //   209: ldc_w 412
    //   212: invokespecial 158	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   215: aload_3
    //   216: invokevirtual 360	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   219: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   222: pop
    //   223: aload_2
    //   224: ifnull -84 -> 140
    //   227: aload_2
    //   228: invokevirtual 402	java/io/OutputStream:close	()V
    //   231: goto -91 -> 140
    //   234: astore_1
    //   235: goto -95 -> 140
    //   238: astore_2
    //   239: aconst_null
    //   240: astore_1
    //   241: aload_1
    //   242: ifnull +7 -> 249
    //   245: aload_1
    //   246: invokevirtual 402	java/io/OutputStream:close	()V
    //   249: aload_2
    //   250: athrow
    //   251: astore_1
    //   252: goto -112 -> 140
    //   255: astore_1
    //   256: goto -7 -> 249
    //   259: astore_2
    //   260: goto -19 -> 241
    //   263: astore_2
    //   264: goto -23 -> 241
    //   267: astore_3
    //   268: aload_1
    //   269: astore_2
    //   270: goto -67 -> 203
    //   273: astore_3
    //   274: aload_1
    //   275: astore_2
    //   276: goto -111 -> 165
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	279	0	this	b
    //   0	279	1	paramString	String
    //   0	279	2	paramBitmapDrawable	BitmapDrawable
    //   64	61	3	localObject1	Object
    //   162	16	3	localIOException1	IOException
    //   200	16	3	localException1	Exception
    //   267	1	3	localException2	Exception
    //   273	1	3	localIOException2	IOException
    //   48	98	4	localObject2	Object
    //   75	76	5	localc	a.c
    // Exception table:
    //   from	to	target	type
    //   53	65	144	finally
    //   136	140	144	finally
    //   140	143	144	finally
    //   189	193	144	finally
    //   227	231	144	finally
    //   245	249	144	finally
    //   249	251	144	finally
    //   67	77	162	java/io/IOException
    //   82	91	162	java/io/IOException
    //   95	101	162	java/io/IOException
    //   150	159	162	java/io/IOException
    //   189	193	196	java/io/IOException
    //   67	77	200	java/lang/Exception
    //   82	91	200	java/lang/Exception
    //   95	101	200	java/lang/Exception
    //   150	159	200	java/lang/Exception
    //   227	231	234	java/io/IOException
    //   67	77	238	finally
    //   82	91	238	finally
    //   95	101	238	finally
    //   150	159	238	finally
    //   136	140	251	java/io/IOException
    //   245	249	255	java/io/IOException
    //   101	132	259	finally
    //   167	185	263	finally
    //   205	223	263	finally
    //   101	132	267	java/lang/Exception
    //   101	132	273	java/io/IOException
  }
  
  /* Error */
  public Bitmap b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore_3
    //   5: aload_1
    //   6: invokestatic 377	com/umeng/newxp/view/handler/utils/b:c	(Ljava/lang/String;)Ljava/lang/String;
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 55	com/umeng/newxp/view/handler/utils/b:n	Ljava/lang/Object;
    //   14: astore 7
    //   16: aload 7
    //   18: monitorenter
    //   19: aload_0
    //   20: getfield 57	com/umeng/newxp/view/handler/utils/b:o	Z
    //   23: istore_2
    //   24: iload_2
    //   25: ifeq +18 -> 43
    //   28: aload_0
    //   29: getfield 55	com/umeng/newxp/view/handler/utils/b:n	Ljava/lang/Object;
    //   32: invokevirtual 418	java/lang/Object:wait	()V
    //   35: goto -16 -> 19
    //   38: astore 4
    //   40: goto -21 -> 19
    //   43: aload_0
    //   44: getfield 331	com/umeng/newxp/view/handler/utils/b:k	Lcom/umeng/newxp/view/handler/utils/a;
    //   47: astore 5
    //   49: aload 6
    //   51: astore 4
    //   53: aload 5
    //   55: ifnull +72 -> 127
    //   58: aload_0
    //   59: getfield 331	com/umeng/newxp/view/handler/utils/b:k	Lcom/umeng/newxp/view/handler/utils/a;
    //   62: aload_1
    //   63: invokevirtual 380	com/umeng/newxp/view/handler/utils/a:a	(Ljava/lang/String;)Lcom/umeng/newxp/view/handler/utils/a$c;
    //   66: astore_1
    //   67: aload_1
    //   68: ifnull +156 -> 224
    //   71: aload_1
    //   72: iconst_0
    //   73: invokevirtual 407	com/umeng/newxp/view/handler/utils/a$c:a	(I)Ljava/io/InputStream;
    //   76: astore_1
    //   77: aload_1
    //   78: astore 5
    //   80: aload_1
    //   81: ifnull +30 -> 111
    //   84: aload_1
    //   85: astore_3
    //   86: aload_1
    //   87: checkcast 420	java/io/FileInputStream
    //   90: invokevirtual 424	java/io/FileInputStream:getFD	()Ljava/io/FileDescriptor;
    //   93: ldc_w 425
    //   96: ldc_w 425
    //   99: aload_0
    //   100: invokestatic 430	com/umeng/newxp/view/handler/utils/d:a	(Ljava/io/FileDescriptor;IILcom/umeng/newxp/view/handler/utils/b;)Landroid/graphics/Bitmap;
    //   103: astore 4
    //   105: aload 4
    //   107: astore_3
    //   108: aload_1
    //   109: astore 5
    //   111: aload_3
    //   112: astore 4
    //   114: aload 5
    //   116: ifnull +11 -> 127
    //   119: aload 5
    //   121: invokevirtual 410	java/io/InputStream:close	()V
    //   124: aload_3
    //   125: astore 4
    //   127: aload 7
    //   129: monitorexit
    //   130: aload 4
    //   132: areturn
    //   133: astore 4
    //   135: aconst_null
    //   136: astore_1
    //   137: aload_1
    //   138: astore_3
    //   139: new 155	java/lang/StringBuilder
    //   142: dup
    //   143: ldc_w 432
    //   146: invokespecial 158	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   149: aload 4
    //   151: invokevirtual 360	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: pop
    //   158: aload 6
    //   160: astore 4
    //   162: aload_1
    //   163: ifnull -36 -> 127
    //   166: aload_1
    //   167: invokevirtual 410	java/io/InputStream:close	()V
    //   170: aload 6
    //   172: astore 4
    //   174: goto -47 -> 127
    //   177: astore_1
    //   178: aload 6
    //   180: astore 4
    //   182: goto -55 -> 127
    //   185: astore_1
    //   186: aconst_null
    //   187: astore_3
    //   188: aload_3
    //   189: ifnull +7 -> 196
    //   192: aload_3
    //   193: invokevirtual 410	java/io/InputStream:close	()V
    //   196: aload_1
    //   197: athrow
    //   198: astore_1
    //   199: aload 7
    //   201: monitorexit
    //   202: aload_1
    //   203: athrow
    //   204: astore_1
    //   205: aload_3
    //   206: astore 4
    //   208: goto -81 -> 127
    //   211: astore_3
    //   212: goto -16 -> 196
    //   215: astore_1
    //   216: goto -28 -> 188
    //   219: astore 4
    //   221: goto -84 -> 137
    //   224: aconst_null
    //   225: astore 5
    //   227: goto -116 -> 111
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	230	0	this	b
    //   0	230	1	paramString	String
    //   23	2	2	bool	boolean
    //   4	202	3	localObject1	Object
    //   211	1	3	localIOException1	IOException
    //   38	1	4	localInterruptedException	InterruptedException
    //   51	80	4	localObject2	Object
    //   133	17	4	localIOException2	IOException
    //   160	47	4	localObject3	Object
    //   219	1	4	localIOException3	IOException
    //   47	179	5	localObject4	Object
    //   1	178	6	localObject5	Object
    //   14	186	7	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   28	35	38	java/lang/InterruptedException
    //   58	67	133	java/io/IOException
    //   71	77	133	java/io/IOException
    //   166	170	177	java/io/IOException
    //   58	67	185	finally
    //   71	77	185	finally
    //   19	24	198	finally
    //   28	35	198	finally
    //   43	49	198	finally
    //   119	124	198	finally
    //   127	130	198	finally
    //   166	170	198	finally
    //   192	196	198	finally
    //   196	198	198	finally
    //   119	124	204	java/io/IOException
    //   192	196	211	java/io/IOException
    //   86	105	215	finally
    //   139	158	215	finally
    //   86	105	219	java/io/IOException
  }
  
  public void b()
  {
    if (this.l != null) {
      this.l.evictAll();
    }
    synchronized (this.n)
    {
      this.o = true;
      if (this.k != null)
      {
        boolean bool = this.k.d();
        if (bool) {}
      }
      try
      {
        this.k.f();
        this.k = null;
        a();
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          new StringBuilder("clearCache - ").append(localIOException).toString();
        }
      }
    }
  }
  
  public void c()
  {
    synchronized (this.n)
    {
      a locala = this.k;
      if (locala != null) {}
      try
      {
        this.k.e();
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          new StringBuilder("flush - ").append(localIOException).toString();
        }
      }
    }
  }
  
  public void d()
  {
    synchronized (this.n)
    {
      a locala = this.k;
      if (locala != null) {}
      try
      {
        if (!this.k.d())
        {
          this.k.close();
          this.k = null;
        }
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          new StringBuilder("close - ").append(localIOException).toString();
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */