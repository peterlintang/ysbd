package com.umeng.newxp.view.handler.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;

public class c
  extends d
{
  private static final String e = "ImageFetcher";
  private static final int f = 10485760;
  private static final String g = "http";
  private static final int h = 8192;
  private static final int m = 0;
  private a i;
  private File j;
  private boolean k = true;
  private final Object l = new Object();
  
  public c(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    a(paramContext);
  }
  
  public c(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, paramInt1, paramInt2);
    a(paramContext);
  }
  
  /* Error */
  private Bitmap a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_1
    //   4: invokestatic 60	com/umeng/newxp/view/handler/utils/b:c	(Ljava/lang/String;)Ljava/lang/String;
    //   7: astore 7
    //   9: aload_0
    //   10: getfield 39	com/umeng/newxp/view/handler/utils/c:l	Ljava/lang/Object;
    //   13: astore 6
    //   15: aload 6
    //   17: monitorenter
    //   18: aload_0
    //   19: getfield 32	com/umeng/newxp/view/handler/utils/c:k	Z
    //   22: istore_2
    //   23: iload_2
    //   24: ifeq +17 -> 41
    //   27: aload_0
    //   28: getfield 39	com/umeng/newxp/view/handler/utils/c:l	Ljava/lang/Object;
    //   31: invokevirtual 63	java/lang/Object:wait	()V
    //   34: goto -16 -> 18
    //   37: astore_3
    //   38: goto -20 -> 18
    //   41: aload_0
    //   42: getfield 65	com/umeng/newxp/view/handler/utils/c:i	Lcom/umeng/newxp/view/handler/utils/a;
    //   45: astore_3
    //   46: aload_3
    //   47: ifnull +297 -> 344
    //   50: aload_0
    //   51: getfield 65	com/umeng/newxp/view/handler/utils/c:i	Lcom/umeng/newxp/view/handler/utils/a;
    //   54: aload 7
    //   56: invokevirtual 70	com/umeng/newxp/view/handler/utils/a:a	(Ljava/lang/String;)Lcom/umeng/newxp/view/handler/utils/a$c;
    //   59: astore 4
    //   61: aload 4
    //   63: astore_3
    //   64: aload 4
    //   66: ifnonnull +44 -> 110
    //   69: aload_0
    //   70: getfield 65	com/umeng/newxp/view/handler/utils/c:i	Lcom/umeng/newxp/view/handler/utils/a;
    //   73: aload 7
    //   75: invokevirtual 74	com/umeng/newxp/view/handler/utils/a:b	(Ljava/lang/String;)Lcom/umeng/newxp/view/handler/utils/a$a;
    //   78: astore_3
    //   79: aload_3
    //   80: ifnull +20 -> 100
    //   83: aload_0
    //   84: aload_1
    //   85: aload_3
    //   86: iconst_0
    //   87: invokevirtual 79	com/umeng/newxp/view/handler/utils/a$a:c	(I)Ljava/io/OutputStream;
    //   90: invokevirtual 82	com/umeng/newxp/view/handler/utils/c:a	(Ljava/lang/String;Ljava/io/OutputStream;)Z
    //   93: ifeq +87 -> 180
    //   96: aload_3
    //   97: invokevirtual 84	com/umeng/newxp/view/handler/utils/a$a:a	()V
    //   100: aload_0
    //   101: getfield 65	com/umeng/newxp/view/handler/utils/c:i	Lcom/umeng/newxp/view/handler/utils/a;
    //   104: aload 7
    //   106: invokevirtual 70	com/umeng/newxp/view/handler/utils/a:a	(Ljava/lang/String;)Lcom/umeng/newxp/view/handler/utils/a$c;
    //   109: astore_3
    //   110: aload_3
    //   111: ifnull +226 -> 337
    //   114: aload_3
    //   115: iconst_0
    //   116: invokevirtual 89	com/umeng/newxp/view/handler/utils/a$c:a	(I)Ljava/io/InputStream;
    //   119: checkcast 91	java/io/FileInputStream
    //   122: astore_1
    //   123: aload_1
    //   124: invokevirtual 95	java/io/FileInputStream:getFD	()Ljava/io/FileDescriptor;
    //   127: astore_3
    //   128: aload_3
    //   129: ifnonnull +11 -> 140
    //   132: aload_1
    //   133: ifnull +7 -> 140
    //   136: aload_1
    //   137: invokevirtual 98	java/io/FileInputStream:close	()V
    //   140: aload 6
    //   142: monitorexit
    //   143: aload 5
    //   145: astore 4
    //   147: aload_3
    //   148: ifnull +21 -> 169
    //   151: aload_3
    //   152: aload_0
    //   153: getfield 100	com/umeng/newxp/view/handler/utils/c:a	I
    //   156: aload_0
    //   157: getfield 102	com/umeng/newxp/view/handler/utils/c:b	I
    //   160: aload_0
    //   161: invokevirtual 105	com/umeng/newxp/view/handler/utils/c:f	()Lcom/umeng/newxp/view/handler/utils/b;
    //   164: invokestatic 108	com/umeng/newxp/view/handler/utils/c:a	(Ljava/io/FileDescriptor;IILcom/umeng/newxp/view/handler/utils/b;)Landroid/graphics/Bitmap;
    //   167: astore 4
    //   169: aload_1
    //   170: ifnull +7 -> 177
    //   173: aload_1
    //   174: invokevirtual 98	java/io/FileInputStream:close	()V
    //   177: aload 4
    //   179: areturn
    //   180: aload_3
    //   181: invokevirtual 110	com/umeng/newxp/view/handler/utils/a$a:b	()V
    //   184: goto -84 -> 100
    //   187: astore 4
    //   189: aconst_null
    //   190: astore_1
    //   191: aload_1
    //   192: astore_3
    //   193: new 112	java/lang/StringBuilder
    //   196: dup
    //   197: ldc 114
    //   199: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   202: aload 4
    //   204: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   207: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   210: pop
    //   211: iconst_0
    //   212: ifne +11 -> 223
    //   215: aload_1
    //   216: ifnull +7 -> 223
    //   219: aload_1
    //   220: invokevirtual 98	java/io/FileInputStream:close	()V
    //   223: aconst_null
    //   224: astore_3
    //   225: goto -85 -> 140
    //   228: astore 4
    //   230: aconst_null
    //   231: astore_1
    //   232: aload_1
    //   233: astore_3
    //   234: new 112	java/lang/StringBuilder
    //   237: dup
    //   238: ldc 114
    //   240: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   243: aload 4
    //   245: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   248: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   251: pop
    //   252: iconst_0
    //   253: ifne +11 -> 264
    //   256: aload_1
    //   257: ifnull +7 -> 264
    //   260: aload_1
    //   261: invokevirtual 98	java/io/FileInputStream:close	()V
    //   264: aconst_null
    //   265: astore_3
    //   266: goto -126 -> 140
    //   269: astore_1
    //   270: aconst_null
    //   271: astore_3
    //   272: iconst_0
    //   273: ifne +11 -> 284
    //   276: aload_3
    //   277: ifnull +7 -> 284
    //   280: aload_3
    //   281: invokevirtual 98	java/io/FileInputStream:close	()V
    //   284: aload_1
    //   285: athrow
    //   286: astore_1
    //   287: aload 6
    //   289: monitorexit
    //   290: aload_1
    //   291: athrow
    //   292: astore_1
    //   293: aload 4
    //   295: areturn
    //   296: astore_3
    //   297: goto -13 -> 284
    //   300: astore_3
    //   301: goto -78 -> 223
    //   304: astore_3
    //   305: goto -41 -> 264
    //   308: astore 4
    //   310: goto -170 -> 140
    //   313: astore 4
    //   315: aload_1
    //   316: astore_3
    //   317: aload 4
    //   319: astore_1
    //   320: goto -48 -> 272
    //   323: astore_1
    //   324: goto -52 -> 272
    //   327: astore 4
    //   329: goto -97 -> 232
    //   332: astore 4
    //   334: goto -143 -> 191
    //   337: aconst_null
    //   338: astore_1
    //   339: aconst_null
    //   340: astore_3
    //   341: goto -213 -> 128
    //   344: aconst_null
    //   345: astore_1
    //   346: aconst_null
    //   347: astore_3
    //   348: goto -208 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	351	0	this	c
    //   0	351	1	paramString	String
    //   22	2	2	bool	boolean
    //   37	1	3	localInterruptedException	InterruptedException
    //   45	236	3	localObject1	Object
    //   296	1	3	localIOException1	IOException
    //   300	1	3	localIOException2	IOException
    //   304	1	3	localIOException3	IOException
    //   316	32	3	str1	String
    //   59	119	4	localObject2	Object
    //   187	16	4	localIOException4	IOException
    //   228	66	4	localIllegalStateException1	IllegalStateException
    //   308	1	4	localIOException5	IOException
    //   313	5	4	localObject3	Object
    //   327	1	4	localIllegalStateException2	IllegalStateException
    //   332	1	4	localIOException6	IOException
    //   1	143	5	localObject4	Object
    //   13	275	6	localObject5	Object
    //   7	98	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   27	34	37	java/lang/InterruptedException
    //   50	61	187	java/io/IOException
    //   69	79	187	java/io/IOException
    //   83	100	187	java/io/IOException
    //   100	110	187	java/io/IOException
    //   114	123	187	java/io/IOException
    //   180	184	187	java/io/IOException
    //   50	61	228	java/lang/IllegalStateException
    //   69	79	228	java/lang/IllegalStateException
    //   83	100	228	java/lang/IllegalStateException
    //   100	110	228	java/lang/IllegalStateException
    //   114	123	228	java/lang/IllegalStateException
    //   180	184	228	java/lang/IllegalStateException
    //   50	61	269	finally
    //   69	79	269	finally
    //   83	100	269	finally
    //   100	110	269	finally
    //   114	123	269	finally
    //   180	184	269	finally
    //   18	23	286	finally
    //   27	34	286	finally
    //   41	46	286	finally
    //   136	140	286	finally
    //   140	143	286	finally
    //   219	223	286	finally
    //   260	264	286	finally
    //   280	284	286	finally
    //   284	286	286	finally
    //   173	177	292	java/io/IOException
    //   280	284	296	java/io/IOException
    //   219	223	300	java/io/IOException
    //   260	264	304	java/io/IOException
    //   136	140	308	java/io/IOException
    //   123	128	313	finally
    //   193	211	323	finally
    //   234	252	323	finally
    //   123	128	327	java/lang/IllegalStateException
    //   123	128	332	java/io/IOException
  }
  
  private void a(Context paramContext)
  {
    b(paramContext);
    this.j = b.a(paramContext, "http");
  }
  
  private void b(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnectedOrConnecting())) {
      Toast.makeText(paramContext, "网络连接失败", 1).show();
    }
  }
  
  public static void e()
  {
    if (Build.VERSION.SDK_INT < 8) {
      System.setProperty("http.keepAlive", "false");
    }
  }
  
  private void j()
  {
    if (!this.j.exists()) {
      this.j.mkdirs();
    }
    synchronized (this.l)
    {
      long l1 = b.a(this.j);
      if (l1 > 10485760L) {}
      try
      {
        this.i = a.a(this.j, 1, 1, 10485760L);
        this.k = false;
        this.l.notifyAll();
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          this.i = null;
        }
      }
    }
  }
  
  protected Bitmap a(Object paramObject)
  {
    return a(String.valueOf(paramObject));
  }
  
  protected void a()
  {
    super.a();
    j();
  }
  
  /* Error */
  public boolean a(String paramString, java.io.OutputStream paramOutputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 7
    //   6: invokestatic 211	com/umeng/newxp/view/handler/utils/c:e	()V
    //   9: new 213	java/net/URL
    //   12: dup
    //   13: aload_1
    //   14: invokespecial 214	java/net/URL:<init>	(Ljava/lang/String;)V
    //   17: invokevirtual 218	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   20: checkcast 220	java/net/HttpURLConnection
    //   23: astore_1
    //   24: new 222	java/io/BufferedInputStream
    //   27: dup
    //   28: aload_1
    //   29: invokevirtual 226	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   32: sipush 8192
    //   35: invokespecial 229	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   38: astore 4
    //   40: new 231	java/io/BufferedOutputStream
    //   43: dup
    //   44: aload_2
    //   45: sipush 8192
    //   48: invokespecial 234	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   51: astore 6
    //   53: aload 4
    //   55: invokevirtual 238	java/io/BufferedInputStream:read	()I
    //   58: istore_3
    //   59: iload_3
    //   60: iconst_m1
    //   61: if_icmpeq +75 -> 136
    //   64: aload 6
    //   66: iload_3
    //   67: invokevirtual 242	java/io/BufferedOutputStream:write	(I)V
    //   70: goto -17 -> 53
    //   73: astore_2
    //   74: aload 6
    //   76: astore 5
    //   78: aload_2
    //   79: astore 6
    //   81: aload_1
    //   82: astore_2
    //   83: aload 4
    //   85: astore_1
    //   86: aload 6
    //   88: astore 4
    //   90: new 112	java/lang/StringBuilder
    //   93: dup
    //   94: ldc -12
    //   96: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   99: aload 4
    //   101: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   104: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: pop
    //   108: aload_2
    //   109: ifnull +7 -> 116
    //   112: aload_2
    //   113: invokevirtual 247	java/net/HttpURLConnection:disconnect	()V
    //   116: aload 5
    //   118: ifnull +8 -> 126
    //   121: aload 5
    //   123: invokevirtual 248	java/io/BufferedOutputStream:close	()V
    //   126: aload_1
    //   127: ifnull +7 -> 134
    //   130: aload_1
    //   131: invokevirtual 249	java/io/BufferedInputStream:close	()V
    //   134: iconst_0
    //   135: ireturn
    //   136: aload_1
    //   137: ifnull +7 -> 144
    //   140: aload_1
    //   141: invokevirtual 247	java/net/HttpURLConnection:disconnect	()V
    //   144: aload 6
    //   146: ifnull +8 -> 154
    //   149: aload 6
    //   151: invokevirtual 248	java/io/BufferedOutputStream:close	()V
    //   154: aload 4
    //   156: ifnull +8 -> 164
    //   159: aload 4
    //   161: invokevirtual 249	java/io/BufferedInputStream:close	()V
    //   164: iconst_1
    //   165: ireturn
    //   166: astore_1
    //   167: aconst_null
    //   168: astore 4
    //   170: aconst_null
    //   171: astore_2
    //   172: aload_2
    //   173: ifnull +7 -> 180
    //   176: aload_2
    //   177: invokevirtual 247	java/net/HttpURLConnection:disconnect	()V
    //   180: aload 4
    //   182: ifnull +8 -> 190
    //   185: aload 4
    //   187: invokevirtual 248	java/io/BufferedOutputStream:close	()V
    //   190: aload 5
    //   192: ifnull +8 -> 200
    //   195: aload 5
    //   197: invokevirtual 249	java/io/BufferedInputStream:close	()V
    //   200: aload_1
    //   201: athrow
    //   202: astore_1
    //   203: goto -39 -> 164
    //   206: astore_1
    //   207: goto -73 -> 134
    //   210: astore_2
    //   211: goto -11 -> 200
    //   214: astore 6
    //   216: aconst_null
    //   217: astore 4
    //   219: aload_1
    //   220: astore_2
    //   221: aload 6
    //   223: astore_1
    //   224: goto -52 -> 172
    //   227: astore 5
    //   229: aconst_null
    //   230: astore 6
    //   232: aload_1
    //   233: astore_2
    //   234: aload 5
    //   236: astore_1
    //   237: aload 4
    //   239: astore 5
    //   241: aload 6
    //   243: astore 4
    //   245: goto -73 -> 172
    //   248: astore 5
    //   250: aload_1
    //   251: astore_2
    //   252: aload 5
    //   254: astore_1
    //   255: aload 4
    //   257: astore 5
    //   259: aload 6
    //   261: astore 4
    //   263: goto -91 -> 172
    //   266: astore 6
    //   268: aload 5
    //   270: astore 4
    //   272: aload_1
    //   273: astore 5
    //   275: aload 6
    //   277: astore_1
    //   278: goto -106 -> 172
    //   281: astore 4
    //   283: aconst_null
    //   284: astore_1
    //   285: aconst_null
    //   286: astore_2
    //   287: aload 7
    //   289: astore 5
    //   291: goto -201 -> 90
    //   294: astore 4
    //   296: aload_1
    //   297: astore_2
    //   298: aconst_null
    //   299: astore_1
    //   300: aload 7
    //   302: astore 5
    //   304: goto -214 -> 90
    //   307: astore 6
    //   309: aload 4
    //   311: astore_2
    //   312: aload_1
    //   313: astore 5
    //   315: aload 6
    //   317: astore 4
    //   319: aload_2
    //   320: astore_1
    //   321: aload 5
    //   323: astore_2
    //   324: aload 7
    //   326: astore 5
    //   328: goto -238 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	331	0	this	c
    //   0	331	1	paramString	String
    //   0	331	2	paramOutputStream	java.io.OutputStream
    //   58	9	3	n	int
    //   38	233	4	localObject1	Object
    //   281	1	4	localIOException1	IOException
    //   294	16	4	localIOException2	IOException
    //   317	1	4	localObject2	Object
    //   1	195	5	localObject3	Object
    //   227	8	5	localObject4	Object
    //   239	1	5	localObject5	Object
    //   248	5	5	localObject6	Object
    //   257	70	5	localObject7	Object
    //   51	99	6	localObject8	Object
    //   214	8	6	localObject9	Object
    //   230	30	6	localObject10	Object
    //   266	10	6	localObject11	Object
    //   307	9	6	localIOException3	IOException
    //   4	321	7	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   53	59	73	java/io/IOException
    //   64	70	73	java/io/IOException
    //   9	24	166	finally
    //   149	154	202	java/io/IOException
    //   159	164	202	java/io/IOException
    //   121	126	206	java/io/IOException
    //   130	134	206	java/io/IOException
    //   185	190	210	java/io/IOException
    //   195	200	210	java/io/IOException
    //   24	40	214	finally
    //   40	53	227	finally
    //   53	59	248	finally
    //   64	70	248	finally
    //   90	108	266	finally
    //   9	24	281	java/io/IOException
    //   24	40	294	java/io/IOException
    //   40	53	307	java/io/IOException
  }
  
  protected void b()
  {
    super.b();
    synchronized (this.l)
    {
      if (this.i != null)
      {
        boolean bool = this.i.d();
        if (bool) {}
      }
      try
      {
        this.i.f();
        this.i = null;
        this.k = true;
        j();
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          new StringBuilder("clearCacheInternal - ").append(localIOException).toString();
        }
      }
    }
  }
  
  protected void c()
  {
    super.c();
    synchronized (this.l)
    {
      a locala = this.i;
      if (locala != null) {}
      try
      {
        this.i.e();
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
  
  protected void d()
  {
    super.d();
    synchronized (this.l)
    {
      a locala = this.i;
      if (locala != null) {}
      try
      {
        if (!this.i.d())
        {
          this.i.close();
          this.i = null;
        }
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          new StringBuilder("closeCacheInternal - ").append(localIOException).toString();
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */