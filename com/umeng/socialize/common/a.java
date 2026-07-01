package com.umeng.socialize.common;

public class a
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = 4;
  public static final int f = 5;
  public static final int g = 6;
  public static final int h = 7;
  public static final int i = 8;
  public static final int j = 9;
  public static final int k = 10;
  public static final int l = 11;
  public static final String[] m = { "jpeg", "gif", "png", "bmp", "pcx", "iff", "ras", "pbm", "pgm", "ppm", "psd", "swf" };
  
  /* Error */
  public static String a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 72	java/io/ByteArrayInputStream
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 75	java/io/ByteArrayInputStream:<init>	([B)V
    //   10: astore_0
    //   11: aload_0
    //   12: invokevirtual 81	java/io/InputStream:read	()I
    //   15: istore_1
    //   16: aload_0
    //   17: invokevirtual 81	java/io/InputStream:read	()I
    //   20: istore_2
    //   21: iload_1
    //   22: bipush 71
    //   24: if_icmpne +28 -> 52
    //   27: iload_2
    //   28: bipush 73
    //   30: if_icmpne +22 -> 52
    //   33: getstatic 61	com/umeng/socialize/common/a:m	[Ljava/lang/String;
    //   36: iconst_1
    //   37: aaload
    //   38: astore_3
    //   39: aload_0
    //   40: invokevirtual 84	java/io/InputStream:close	()V
    //   43: aload_3
    //   44: areturn
    //   45: astore_0
    //   46: aload_0
    //   47: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   50: aload_3
    //   51: areturn
    //   52: iload_1
    //   53: sipush 137
    //   56: if_icmpne +28 -> 84
    //   59: iload_2
    //   60: bipush 80
    //   62: if_icmpne +22 -> 84
    //   65: getstatic 61	com/umeng/socialize/common/a:m	[Ljava/lang/String;
    //   68: iconst_2
    //   69: aaload
    //   70: astore_3
    //   71: aload_0
    //   72: invokevirtual 84	java/io/InputStream:close	()V
    //   75: aload_3
    //   76: areturn
    //   77: astore_0
    //   78: aload_0
    //   79: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   82: aload_3
    //   83: areturn
    //   84: iload_1
    //   85: sipush 255
    //   88: if_icmpne +29 -> 117
    //   91: iload_2
    //   92: sipush 216
    //   95: if_icmpne +22 -> 117
    //   98: getstatic 61	com/umeng/socialize/common/a:m	[Ljava/lang/String;
    //   101: iconst_0
    //   102: aaload
    //   103: astore_3
    //   104: aload_0
    //   105: invokevirtual 84	java/io/InputStream:close	()V
    //   108: aload_3
    //   109: areturn
    //   110: astore_0
    //   111: aload_0
    //   112: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   115: aload_3
    //   116: areturn
    //   117: iload_1
    //   118: bipush 66
    //   120: if_icmpne +28 -> 148
    //   123: iload_2
    //   124: bipush 77
    //   126: if_icmpne +22 -> 148
    //   129: getstatic 61	com/umeng/socialize/common/a:m	[Ljava/lang/String;
    //   132: iconst_3
    //   133: aaload
    //   134: astore_3
    //   135: aload_0
    //   136: invokevirtual 84	java/io/InputStream:close	()V
    //   139: aload_3
    //   140: areturn
    //   141: astore_0
    //   142: aload_0
    //   143: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   146: aload_3
    //   147: areturn
    //   148: iload_1
    //   149: bipush 10
    //   151: if_icmpne +28 -> 179
    //   154: iload_2
    //   155: bipush 6
    //   157: if_icmpge +22 -> 179
    //   160: getstatic 61	com/umeng/socialize/common/a:m	[Ljava/lang/String;
    //   163: iconst_4
    //   164: aaload
    //   165: astore_3
    //   166: aload_0
    //   167: invokevirtual 84	java/io/InputStream:close	()V
    //   170: aload_3
    //   171: areturn
    //   172: astore_0
    //   173: aload_0
    //   174: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   177: aload_3
    //   178: areturn
    //   179: iload_1
    //   180: bipush 70
    //   182: if_icmpne +28 -> 210
    //   185: iload_2
    //   186: bipush 79
    //   188: if_icmpne +22 -> 210
    //   191: getstatic 61	com/umeng/socialize/common/a:m	[Ljava/lang/String;
    //   194: iconst_5
    //   195: aaload
    //   196: astore_3
    //   197: aload_0
    //   198: invokevirtual 84	java/io/InputStream:close	()V
    //   201: aload_3
    //   202: areturn
    //   203: astore_0
    //   204: aload_0
    //   205: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   208: aload_3
    //   209: areturn
    //   210: iload_1
    //   211: bipush 89
    //   213: if_icmpne +30 -> 243
    //   216: iload_2
    //   217: sipush 166
    //   220: if_icmpne +23 -> 243
    //   223: getstatic 61	com/umeng/socialize/common/a:m	[Ljava/lang/String;
    //   226: bipush 6
    //   228: aaload
    //   229: astore_3
    //   230: aload_0
    //   231: invokevirtual 84	java/io/InputStream:close	()V
    //   234: aload_3
    //   235: areturn
    //   236: astore_0
    //   237: aload_0
    //   238: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   241: aload_3
    //   242: areturn
    //   243: iload_1
    //   244: bipush 80
    //   246: if_icmpne +89 -> 335
    //   249: iload_2
    //   250: bipush 49
    //   252: if_icmplt +83 -> 335
    //   255: iload_2
    //   256: bipush 54
    //   258: if_icmpgt +77 -> 335
    //   261: iload_2
    //   262: bipush 48
    //   264: isub
    //   265: istore_1
    //   266: iload_1
    //   267: ifle +9 -> 276
    //   270: iload_1
    //   271: bipush 6
    //   273: if_icmple +18 -> 291
    //   276: aload_0
    //   277: invokevirtual 84	java/io/InputStream:close	()V
    //   280: ldc 89
    //   282: areturn
    //   283: astore_0
    //   284: aload_0
    //   285: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   288: goto -8 -> 280
    //   291: iconst_3
    //   292: newarray <illegal type>
    //   294: dup
    //   295: iconst_0
    //   296: bipush 7
    //   298: iastore
    //   299: dup
    //   300: iconst_1
    //   301: bipush 8
    //   303: iastore
    //   304: dup
    //   305: iconst_2
    //   306: bipush 9
    //   308: iastore
    //   309: iload_1
    //   310: iconst_1
    //   311: isub
    //   312: iconst_3
    //   313: irem
    //   314: iaload
    //   315: istore_1
    //   316: getstatic 61	com/umeng/socialize/common/a:m	[Ljava/lang/String;
    //   319: iload_1
    //   320: aaload
    //   321: astore_3
    //   322: aload_0
    //   323: invokevirtual 84	java/io/InputStream:close	()V
    //   326: aload_3
    //   327: areturn
    //   328: astore_0
    //   329: aload_0
    //   330: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   333: aload_3
    //   334: areturn
    //   335: iload_1
    //   336: bipush 56
    //   338: if_icmpne +29 -> 367
    //   341: iload_2
    //   342: bipush 66
    //   344: if_icmpne +23 -> 367
    //   347: getstatic 61	com/umeng/socialize/common/a:m	[Ljava/lang/String;
    //   350: bipush 10
    //   352: aaload
    //   353: astore_3
    //   354: aload_0
    //   355: invokevirtual 84	java/io/InputStream:close	()V
    //   358: aload_3
    //   359: areturn
    //   360: astore_0
    //   361: aload_0
    //   362: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   365: aload_3
    //   366: areturn
    //   367: iload_1
    //   368: bipush 70
    //   370: if_icmpne +29 -> 399
    //   373: iload_2
    //   374: bipush 87
    //   376: if_icmpne +23 -> 399
    //   379: getstatic 61	com/umeng/socialize/common/a:m	[Ljava/lang/String;
    //   382: bipush 11
    //   384: aaload
    //   385: astore_3
    //   386: aload_0
    //   387: invokevirtual 84	java/io/InputStream:close	()V
    //   390: aload_3
    //   391: areturn
    //   392: astore_0
    //   393: aload_0
    //   394: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   397: aload_3
    //   398: areturn
    //   399: aload_0
    //   400: invokevirtual 84	java/io/InputStream:close	()V
    //   403: ldc 89
    //   405: areturn
    //   406: astore_0
    //   407: aload_0
    //   408: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   411: goto -8 -> 403
    //   414: astore_0
    //   415: aload_3
    //   416: astore_0
    //   417: aload_0
    //   418: ifnull +7 -> 425
    //   421: aload_0
    //   422: invokevirtual 84	java/io/InputStream:close	()V
    //   425: ldc 89
    //   427: areturn
    //   428: astore_0
    //   429: aload_0
    //   430: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   433: goto -8 -> 425
    //   436: astore_3
    //   437: aconst_null
    //   438: astore_0
    //   439: aload_0
    //   440: ifnull +7 -> 447
    //   443: aload_0
    //   444: invokevirtual 84	java/io/InputStream:close	()V
    //   447: aload_3
    //   448: athrow
    //   449: astore_0
    //   450: aload_0
    //   451: invokevirtual 87	java/io/IOException:printStackTrace	()V
    //   454: goto -7 -> 447
    //   457: astore_3
    //   458: goto -19 -> 439
    //   461: astore_3
    //   462: goto -45 -> 417
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	465	0	paramArrayOfByte	byte[]
    //   15	356	1	n	int
    //   20	357	2	i1	int
    //   1	415	3	str	String
    //   436	12	3	localObject1	Object
    //   457	1	3	localObject2	Object
    //   461	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   39	43	45	java/io/IOException
    //   71	75	77	java/io/IOException
    //   104	108	110	java/io/IOException
    //   135	139	141	java/io/IOException
    //   166	170	172	java/io/IOException
    //   197	201	203	java/io/IOException
    //   230	234	236	java/io/IOException
    //   276	280	283	java/io/IOException
    //   322	326	328	java/io/IOException
    //   354	358	360	java/io/IOException
    //   386	390	392	java/io/IOException
    //   399	403	406	java/io/IOException
    //   2	11	414	java/lang/Exception
    //   421	425	428	java/io/IOException
    //   2	11	436	finally
    //   443	447	449	java/io/IOException
    //   11	21	457	finally
    //   33	39	457	finally
    //   65	71	457	finally
    //   98	104	457	finally
    //   129	135	457	finally
    //   160	166	457	finally
    //   191	197	457	finally
    //   223	230	457	finally
    //   291	322	457	finally
    //   347	354	457	finally
    //   379	386	457	finally
    //   11	21	461	java/lang/Exception
    //   33	39	461	java/lang/Exception
    //   65	71	461	java/lang/Exception
    //   98	104	461	java/lang/Exception
    //   129	135	461	java/lang/Exception
    //   160	166	461	java/lang/Exception
    //   191	197	461	java/lang/Exception
    //   223	230	461	java/lang/Exception
    //   291	322	461	java/lang/Exception
    //   347	354	461	java/lang/Exception
    //   379	386	461	java/lang/Exception
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\common\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */