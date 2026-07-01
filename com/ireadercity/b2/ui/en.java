package com.ireadercity.b2.ui;

import android.os.AsyncTask;

final class en
  extends AsyncTask<Void, Integer, Boolean>
{
  en(PDFViewerActivity paramPDFViewerActivity) {}
  
  /* Error */
  private Boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   4: getfield 27	com/ireadercity/b2/ui/PDFViewerActivity:a	Lcom/ireadercity/b2/c/a;
    //   7: aload_0
    //   8: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   11: invokestatic 31	com/ireadercity/b2/ui/PDFViewerActivity:l	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)Lcom/ireadercity/b2/bean/b;
    //   14: invokevirtual 37	com/ireadercity/b2/bean/b:j	()Ljava/lang/String;
    //   17: invokevirtual 43	com/ireadercity/b2/c/a:c	(Ljava/lang/String;)Z
    //   20: pop
    //   21: new 45	java/lang/StringBuilder
    //   24: dup
    //   25: ldc 47
    //   27: invokespecial 50	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   30: aload_0
    //   31: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   34: invokestatic 31	com/ireadercity/b2/ui/PDFViewerActivity:l	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)Lcom/ireadercity/b2/bean/b;
    //   37: invokevirtual 52	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   40: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: pop
    //   47: aload_0
    //   48: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   51: astore_3
    //   52: aload_0
    //   53: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   56: astore 4
    //   58: aload_3
    //   59: aload_0
    //   60: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   63: invokestatic 31	com/ireadercity/b2/ui/PDFViewerActivity:l	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)Lcom/ireadercity/b2/bean/b;
    //   66: invokestatic 62	com/ireadercity/b2/ui/PDFViewerActivity:a	(Lcom/ireadercity/b2/bean/b;)Ljava/lang/String;
    //   69: invokestatic 65	com/ireadercity/b2/ui/PDFViewerActivity:a	(Lcom/ireadercity/b2/ui/PDFViewerActivity;Ljava/lang/String;)Ljava/lang/String;
    //   72: pop
    //   73: aload_0
    //   74: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   77: invokestatic 69	com/ireadercity/b2/ui/PDFViewerActivity:m	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)Ljava/lang/String;
    //   80: ifnonnull +8 -> 88
    //   83: iconst_0
    //   84: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   87: areturn
    //   88: aload_0
    //   89: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   92: aload_0
    //   93: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   96: invokestatic 78	com/ireadercity/b2/ui/PDFViewerActivity:j	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)Lcom/ireadercity/b2/b/n;
    //   99: aload_0
    //   100: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   103: invokestatic 31	com/ireadercity/b2/ui/PDFViewerActivity:l	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)Lcom/ireadercity/b2/bean/b;
    //   106: invokevirtual 84	com/ireadercity/b2/b/n:b	(Lcom/ireadercity/b2/bean/b;)Ljava/util/List;
    //   109: invokestatic 87	com/ireadercity/b2/ui/PDFViewerActivity:a	(Lcom/ireadercity/b2/ui/PDFViewerActivity;Ljava/util/List;)Ljava/util/List;
    //   112: pop
    //   113: aload_0
    //   114: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   117: invokestatic 91	com/ireadercity/b2/ui/PDFViewerActivity:i	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)Ljava/util/List;
    //   120: invokeinterface 97 1 0
    //   125: astore 4
    //   127: iconst_m1
    //   128: istore_1
    //   129: aload 4
    //   131: invokeinterface 103 1 0
    //   136: ifeq +281 -> 417
    //   139: aload 4
    //   141: invokeinterface 107 1 0
    //   146: checkcast 109	java/lang/String
    //   149: astore 5
    //   151: iload_1
    //   152: iconst_1
    //   153: iadd
    //   154: istore_1
    //   155: new 111	java/io/File
    //   158: dup
    //   159: new 45	java/lang/StringBuilder
    //   162: dup
    //   163: invokespecial 112	java/lang/StringBuilder:<init>	()V
    //   166: aload 5
    //   168: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: ldc 114
    //   173: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   179: invokespecial 115	java/io/File:<init>	(Ljava/lang/String;)V
    //   182: astore_3
    //   183: aload_3
    //   184: invokevirtual 118	java/io/File:exists	()Z
    //   187: ifeq +61 -> 248
    //   190: aload_3
    //   191: invokevirtual 121	java/io/File:isFile	()Z
    //   194: ifeq +54 -> 248
    //   197: aload_3
    //   198: invokevirtual 125	java/io/File:length	()J
    //   201: lconst_0
    //   202: lcmp
    //   203: ifle +45 -> 248
    //   206: iload_1
    //   207: aload_0
    //   208: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   211: invokestatic 129	com/ireadercity/b2/ui/PDFViewerActivity:n	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)I
    //   214: if_icmpeq +16 -> 230
    //   217: iload_1
    //   218: aload_0
    //   219: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   222: invokestatic 129	com/ireadercity/b2/ui/PDFViewerActivity:n	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)I
    //   225: iconst_1
    //   226: iadd
    //   227: if_icmpne +203 -> 430
    //   230: aload_0
    //   231: iconst_1
    //   232: anewarray 131	java/lang/Integer
    //   235: dup
    //   236: iconst_0
    //   237: iload_1
    //   238: invokestatic 134	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   241: aastore
    //   242: invokevirtual 138	com/ireadercity/b2/ui/en:publishProgress	([Ljava/lang/Object;)V
    //   245: goto -116 -> 129
    //   248: new 140	java/io/FileInputStream
    //   251: dup
    //   252: aload 5
    //   254: invokespecial 141	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   257: astore_3
    //   258: aload_3
    //   259: invokevirtual 145	java/io/FileInputStream:available	()I
    //   262: istore_2
    //   263: iload_2
    //   264: newarray <illegal type>
    //   266: astore 6
    //   268: aload_3
    //   269: aload 6
    //   271: iconst_0
    //   272: iload_2
    //   273: invokevirtual 149	java/io/FileInputStream:read	([BII)I
    //   276: pop
    //   277: aload 6
    //   279: aload_0
    //   280: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   283: invokestatic 69	com/ireadercity/b2/ui/PDFViewerActivity:m	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)Ljava/lang/String;
    //   286: iconst_0
    //   287: bipush 16
    //   289: invokevirtual 153	java/lang/String:substring	(II)Ljava/lang/String;
    //   292: invokestatic 158	com/ireadercity/b2/b/t:b	([BLjava/lang/String;)V
    //   295: new 160	java/io/FileOutputStream
    //   298: dup
    //   299: new 45	java/lang/StringBuilder
    //   302: dup
    //   303: invokespecial 112	java/lang/StringBuilder:<init>	()V
    //   306: aload 5
    //   308: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: ldc 114
    //   313: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   319: invokespecial 161	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   322: aload 6
    //   324: invokevirtual 165	java/io/FileOutputStream:write	([B)V
    //   327: iload_1
    //   328: aload_0
    //   329: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   332: invokestatic 129	com/ireadercity/b2/ui/PDFViewerActivity:n	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)I
    //   335: if_icmpeq +16 -> 351
    //   338: iload_1
    //   339: aload_0
    //   340: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   343: invokestatic 129	com/ireadercity/b2/ui/PDFViewerActivity:n	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)I
    //   346: iconst_1
    //   347: iadd
    //   348: if_icmpne +85 -> 433
    //   351: aload_0
    //   352: iconst_1
    //   353: anewarray 131	java/lang/Integer
    //   356: dup
    //   357: iconst_0
    //   358: iload_1
    //   359: invokestatic 134	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   362: aastore
    //   363: invokevirtual 138	com/ireadercity/b2/ui/en:publishProgress	([Ljava/lang/Object;)V
    //   366: goto +67 -> 433
    //   369: astore_3
    //   370: aload_3
    //   371: invokevirtual 168	java/io/FileNotFoundException:printStackTrace	()V
    //   374: aconst_null
    //   375: astore_3
    //   376: goto -118 -> 258
    //   379: astore 6
    //   381: aload 6
    //   383: invokevirtual 169	java/io/IOException:printStackTrace	()V
    //   386: iconst_0
    //   387: istore_2
    //   388: goto -125 -> 263
    //   391: astore_3
    //   392: aload_3
    //   393: invokevirtual 169	java/io/IOException:printStackTrace	()V
    //   396: goto -69 -> 327
    //   399: astore_3
    //   400: aload_3
    //   401: invokevirtual 170	java/lang/Exception:printStackTrace	()V
    //   404: iconst_0
    //   405: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   408: areturn
    //   409: astore_3
    //   410: aload_3
    //   411: invokevirtual 170	java/lang/Exception:printStackTrace	()V
    //   414: goto -87 -> 327
    //   417: aload_0
    //   418: getfield 11	com/ireadercity/b2/ui/en:a	Lcom/ireadercity/b2/ui/PDFViewerActivity;
    //   421: invokestatic 174	com/ireadercity/b2/ui/PDFViewerActivity:o	(Lcom/ireadercity/b2/ui/PDFViewerActivity;)Z
    //   424: pop
    //   425: iconst_1
    //   426: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   429: areturn
    //   430: goto -301 -> 129
    //   433: goto -304 -> 129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	436	0	this	en
    //   128	231	1	i	int
    //   262	126	2	j	int
    //   51	218	3	localObject1	Object
    //   369	2	3	localFileNotFoundException	java.io.FileNotFoundException
    //   375	1	3	localObject2	Object
    //   391	2	3	localIOException1	java.io.IOException
    //   399	2	3	localException1	Exception
    //   409	2	3	localException2	Exception
    //   56	84	4	localObject3	Object
    //   149	158	5	str	String
    //   266	57	6	arrayOfByte	byte[]
    //   379	3	6	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   248	258	369	java/io/FileNotFoundException
    //   258	263	379	java/io/IOException
    //   268	327	391	java/io/IOException
    //   0	88	399	java/lang/Exception
    //   88	127	399	java/lang/Exception
    //   129	151	399	java/lang/Exception
    //   155	230	399	java/lang/Exception
    //   230	245	399	java/lang/Exception
    //   248	258	399	java/lang/Exception
    //   258	263	399	java/lang/Exception
    //   263	268	399	java/lang/Exception
    //   327	351	399	java/lang/Exception
    //   351	366	399	java/lang/Exception
    //   370	374	399	java/lang/Exception
    //   381	386	399	java/lang/Exception
    //   392	396	399	java/lang/Exception
    //   410	414	399	java/lang/Exception
    //   417	425	399	java/lang/Exception
    //   268	327	409	java/lang/Exception
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\en.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */