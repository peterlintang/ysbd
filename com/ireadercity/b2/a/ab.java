package com.ireadercity.b2.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import com.ireadercity.b2.bean.b;

final class ab
  extends AsyncTask<Object, Integer, Boolean>
{
  ProgressDialog a;
  Context b;
  b c;
  volatile boolean d = false;
  
  public ab(r paramr, Context paramContext, b paramb)
  {
    this.b = paramContext;
    this.c = paramb;
  }
  
  /* Error */
  private Boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 28	com/ireadercity/b2/a/ab:c	Lcom/ireadercity/b2/bean/b;
    //   4: invokevirtual 40	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   7: astore_3
    //   8: new 42	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   15: getstatic 49	com/ireadercity/b2/a:n	Ljava/lang/String;
    //   18: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: ldc 55
    //   23: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: aload_0
    //   27: getfield 28	com/ireadercity/b2/a/ab:c	Lcom/ireadercity/b2/bean/b;
    //   30: invokevirtual 58	com/ireadercity/b2/bean/b:j	()Ljava/lang/String;
    //   33: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: astore_2
    //   40: new 42	java/lang/StringBuilder
    //   43: dup
    //   44: ldc 63
    //   46: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: getfield 28	com/ireadercity/b2/a/ab:c	Lcom/ireadercity/b2/bean/b;
    //   53: invokevirtual 58	com/ireadercity/b2/bean/b:j	()Ljava/lang/String;
    //   56: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: pop
    //   63: new 68	java/io/File
    //   66: dup
    //   67: aload_2
    //   68: invokespecial 69	java/io/File:<init>	(Ljava/lang/String;)V
    //   71: astore 4
    //   73: aload 4
    //   75: invokevirtual 73	java/io/File:exists	()Z
    //   78: ifeq +22 -> 100
    //   81: aload 4
    //   83: invokevirtual 76	java/io/File:isDirectory	()Z
    //   86: ifeq +14 -> 100
    //   89: aload 4
    //   91: invokevirtual 80	java/io/File:listFiles	()[Ljava/io/File;
    //   94: arraylength
    //   95: istore_1
    //   96: iload_1
    //   97: ifgt +8 -> 105
    //   100: aload_3
    //   101: aload_2
    //   102: invokestatic 85	com/ireadercity/b2/h/x:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: new 42	java/lang/StringBuilder
    //   108: dup
    //   109: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   112: aload_2
    //   113: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: ldc 87
    //   118: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: astore 4
    //   126: new 89	com/ireadercity/b2/b/a
    //   129: dup
    //   130: invokespecial 90	com/ireadercity/b2/b/a:<init>	()V
    //   133: pop
    //   134: aload 4
    //   136: aload_0
    //   137: getfield 28	com/ireadercity/b2/a/ab:c	Lcom/ireadercity/b2/bean/b;
    //   140: invokestatic 95	com/ireadercity/b2/b/t:a	(Lcom/ireadercity/b2/bean/b;)Ljava/lang/String;
    //   143: invokestatic 98	com/ireadercity/b2/b/a:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   146: astore 4
    //   148: aload 4
    //   150: ifnonnull +123 -> 273
    //   153: new 32	java/lang/Exception
    //   156: dup
    //   157: ldc 100
    //   159: invokespecial 101	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   162: athrow
    //   163: astore 4
    //   165: aload 4
    //   167: invokevirtual 104	java/lang/Exception:printStackTrace	()V
    //   170: invokestatic 109	com/ireadercity/b2/a/r:g	()Ljava/lang/String;
    //   173: pop
    //   174: aload_3
    //   175: aload_2
    //   176: invokestatic 85	com/ireadercity/b2/h/x:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   179: new 42	java/lang/StringBuilder
    //   182: dup
    //   183: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   186: aload_2
    //   187: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: ldc 87
    //   192: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   198: astore_3
    //   199: new 89	com/ireadercity/b2/b/a
    //   202: dup
    //   203: invokespecial 90	com/ireadercity/b2/b/a:<init>	()V
    //   206: pop
    //   207: aload_3
    //   208: aload_0
    //   209: getfield 28	com/ireadercity/b2/a/ab:c	Lcom/ireadercity/b2/bean/b;
    //   212: invokestatic 95	com/ireadercity/b2/b/t:a	(Lcom/ireadercity/b2/bean/b;)Ljava/lang/String;
    //   215: invokestatic 98	com/ireadercity/b2/b/a:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   218: astore_3
    //   219: aload_3
    //   220: ifnonnull +184 -> 404
    //   223: new 32	java/lang/Exception
    //   226: dup
    //   227: ldc 100
    //   229: invokespecial 101	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   232: athrow
    //   233: astore_2
    //   234: aload 4
    //   236: invokevirtual 104	java/lang/Exception:printStackTrace	()V
    //   239: iconst_0
    //   240: invokestatic 115	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   243: areturn
    //   244: astore 4
    //   246: aload 4
    //   248: invokevirtual 116	com/ireadercity/b2/d/a:printStackTrace	()V
    //   251: new 68	java/io/File
    //   254: dup
    //   255: aload_2
    //   256: invokespecial 69	java/io/File:<init>	(Ljava/lang/String;)V
    //   259: invokestatic 121	com/ireadercity/b2/h/s:a	(Ljava/io/File;)Z
    //   262: pop
    //   263: new 32	java/lang/Exception
    //   266: dup
    //   267: ldc 123
    //   269: invokespecial 101	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   272: athrow
    //   273: new 42	java/lang/StringBuilder
    //   276: dup
    //   277: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   280: aload_2
    //   281: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   284: ldc 55
    //   286: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   289: aload 4
    //   291: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   297: astore 4
    //   299: aload 4
    //   301: aload_0
    //   302: getfield 28	com/ireadercity/b2/a/ab:c	Lcom/ireadercity/b2/bean/b;
    //   305: invokevirtual 58	com/ireadercity/b2/bean/b:j	()Ljava/lang/String;
    //   308: aload_0
    //   309: getfield 26	com/ireadercity/b2/a/ab:b	Landroid/content/Context;
    //   312: invokevirtual 129	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   315: getstatic 133	com/ireadercity/b2/a:V	F
    //   318: getstatic 136	com/ireadercity/b2/a:W	F
    //   321: aload_0
    //   322: getfield 28	com/ireadercity/b2/a/ab:c	Lcom/ireadercity/b2/bean/b;
    //   325: invokestatic 139	com/ireadercity/b2/b/a:a	(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;FFLcom/ireadercity/b2/bean/b;)Lcom/ireadercity/b2/bean/b;
    //   328: astore 4
    //   330: aload 4
    //   332: ifnonnull +30 -> 362
    //   335: new 32	java/lang/Exception
    //   338: dup
    //   339: ldc -115
    //   341: invokespecial 101	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   344: athrow
    //   345: astore 4
    //   347: aload 4
    //   349: invokevirtual 104	java/lang/Exception:printStackTrace	()V
    //   352: new 32	java/lang/Exception
    //   355: dup
    //   356: ldc -113
    //   358: invokespecial 101	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   361: athrow
    //   362: aload_0
    //   363: aload 4
    //   365: putfield 28	com/ireadercity/b2/a/ab:c	Lcom/ireadercity/b2/bean/b;
    //   368: invokestatic 109	com/ireadercity/b2/a/r:g	()Ljava/lang/String;
    //   371: pop
    //   372: iconst_1
    //   373: invokestatic 115	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   376: areturn
    //   377: astore_3
    //   378: aload_3
    //   379: invokevirtual 116	com/ireadercity/b2/d/a:printStackTrace	()V
    //   382: new 68	java/io/File
    //   385: dup
    //   386: aload_2
    //   387: invokespecial 69	java/io/File:<init>	(Ljava/lang/String;)V
    //   390: invokestatic 121	com/ireadercity/b2/h/s:a	(Ljava/io/File;)Z
    //   393: pop
    //   394: new 32	java/lang/Exception
    //   397: dup
    //   398: ldc 123
    //   400: invokespecial 101	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   403: athrow
    //   404: new 42	java/lang/StringBuilder
    //   407: dup
    //   408: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   411: aload_2
    //   412: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: ldc 55
    //   417: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   420: aload_3
    //   421: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   427: astore_2
    //   428: aload_0
    //   429: aload_2
    //   430: aload_0
    //   431: getfield 28	com/ireadercity/b2/a/ab:c	Lcom/ireadercity/b2/bean/b;
    //   434: invokevirtual 58	com/ireadercity/b2/bean/b:j	()Ljava/lang/String;
    //   437: aload_0
    //   438: getfield 26	com/ireadercity/b2/a/ab:b	Landroid/content/Context;
    //   441: invokevirtual 129	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   444: getstatic 133	com/ireadercity/b2/a:V	F
    //   447: getstatic 136	com/ireadercity/b2/a:W	F
    //   450: aload_0
    //   451: getfield 28	com/ireadercity/b2/a/ab:c	Lcom/ireadercity/b2/bean/b;
    //   454: invokestatic 139	com/ireadercity/b2/b/a:a	(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;FFLcom/ireadercity/b2/bean/b;)Lcom/ireadercity/b2/bean/b;
    //   457: putfield 28	com/ireadercity/b2/a/ab:c	Lcom/ireadercity/b2/bean/b;
    //   460: aload_0
    //   461: getfield 28	com/ireadercity/b2/a/ab:c	Lcom/ireadercity/b2/bean/b;
    //   464: ifnonnull +28 -> 492
    //   467: new 32	java/lang/Exception
    //   470: dup
    //   471: ldc -115
    //   473: invokespecial 101	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   476: athrow
    //   477: astore_2
    //   478: aload_2
    //   479: invokevirtual 104	java/lang/Exception:printStackTrace	()V
    //   482: new 32	java/lang/Exception
    //   485: dup
    //   486: ldc -113
    //   488: invokespecial 101	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   491: athrow
    //   492: invokestatic 109	com/ireadercity/b2/a/r:g	()Ljava/lang/String;
    //   495: pop
    //   496: iconst_1
    //   497: invokestatic 115	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   500: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	501	0	this	ab
    //   95	2	1	i	int
    //   39	148	2	str1	String
    //   233	179	2	localException1	Exception
    //   427	3	2	str2	String
    //   477	2	2	localException2	Exception
    //   7	213	3	str3	String
    //   377	44	3	locala1	com.ireadercity.b2.d.a
    //   71	78	4	localObject1	Object
    //   163	72	4	localException3	Exception
    //   244	46	4	locala2	com.ireadercity.b2.d.a
    //   297	34	4	localObject2	Object
    //   345	19	4	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   73	96	163	java/lang/Exception
    //   100	105	163	java/lang/Exception
    //   105	148	163	java/lang/Exception
    //   153	163	163	java/lang/Exception
    //   246	273	163	java/lang/Exception
    //   273	299	163	java/lang/Exception
    //   335	345	163	java/lang/Exception
    //   347	362	163	java/lang/Exception
    //   362	372	163	java/lang/Exception
    //   174	179	233	java/lang/Exception
    //   179	219	233	java/lang/Exception
    //   223	233	233	java/lang/Exception
    //   378	404	233	java/lang/Exception
    //   404	428	233	java/lang/Exception
    //   460	477	233	java/lang/Exception
    //   478	492	233	java/lang/Exception
    //   492	496	233	java/lang/Exception
    //   100	105	244	com/ireadercity/b2/d/a
    //   299	330	345	java/lang/Exception
    //   174	179	377	com/ireadercity/b2/d/a
    //   428	460	477	java/lang/Exception
  }
  
  protected final void onPreExecute()
  {
    this.a = new ProgressDialog(r.b(this.e));
    this.a.setTitle(2131230798);
    this.a.setMessage("请耐心等待...");
    this.a.setCancelable(false);
    this.a.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */