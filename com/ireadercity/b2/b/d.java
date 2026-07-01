package com.ireadercity.b2.b;

import android.content.Context;
import com.ireadercity.b2.a;
import com.ireadercity.b2.bean.b;
import java.io.File;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public final class d
{
  private static String j = null;
  private String a = "";
  private String b;
  private String c = "";
  private int d = 0;
  private int e = 0;
  private int f = 0;
  private String g;
  private Context h;
  private String[] i;
  
  public d()
  {
    this.b = "";
  }
  
  public d(Context paramContext)
  {
    this.h = paramContext;
    this.b = "";
    this.i = new String[2];
  }
  
  public static String a(int paramInt, b paramb)
  {
    return a(paramb, paramInt);
  }
  
  /* Error */
  public static String a(b paramb)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: invokevirtual 60	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   6: invokevirtual 63	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   9: ldc 65
    //   11: invokevirtual 69	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   14: ifeq +8 -> 22
    //   17: aload_0
    //   18: invokevirtual 60	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   21: areturn
    //   22: new 71	java/io/File
    //   25: dup
    //   26: new 73	java/lang/StringBuilder
    //   29: dup
    //   30: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   33: aload_0
    //   34: invokevirtual 60	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   37: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: ldc 80
    //   42: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokespecial 86	java/io/File:<init>	(Ljava/lang/String;)V
    //   51: astore 6
    //   53: aload 6
    //   55: invokevirtual 90	java/io/File:exists	()Z
    //   58: ifne +549 -> 607
    //   61: new 71	java/io/File
    //   64: dup
    //   65: aload_0
    //   66: invokevirtual 60	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   69: invokespecial 86	java/io/File:<init>	(Ljava/lang/String;)V
    //   72: astore 6
    //   74: aload_0
    //   75: invokevirtual 92	com/ireadercity/b2/bean/b:g	()Ljava/lang/String;
    //   78: ifnonnull +299 -> 377
    //   81: aload_0
    //   82: invokestatic 96	com/ireadercity/b2/b/t:a	(Lcom/ireadercity/b2/bean/b;)Ljava/lang/String;
    //   85: astore 5
    //   87: aload_0
    //   88: aload 5
    //   90: invokevirtual 98	com/ireadercity/b2/bean/b:b	(Ljava/lang/String;)V
    //   93: new 73	java/lang/StringBuilder
    //   96: dup
    //   97: ldc 100
    //   99: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   102: aload 5
    //   104: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: pop
    //   111: aload 5
    //   113: ifnull +497 -> 610
    //   116: aload 6
    //   118: invokevirtual 105	java/io/File:length	()J
    //   121: lstore_3
    //   122: lload_3
    //   123: invokestatic 108	com/ireadercity/b2/b/t:a	(J)I
    //   126: istore_2
    //   127: aload_0
    //   128: invokevirtual 60	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   131: invokevirtual 63	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   134: ldc 110
    //   136: ldc 112
    //   138: invokevirtual 116	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   141: astore 11
    //   143: new 73	java/lang/StringBuilder
    //   146: dup
    //   147: ldc 118
    //   149: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   152: aload 11
    //   154: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: ldc 120
    //   159: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: lload_3
    //   163: invokevirtual 123	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   166: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: pop
    //   170: new 125	java/io/FileInputStream
    //   173: dup
    //   174: aload 6
    //   176: invokespecial 128	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   179: astore 7
    //   181: new 130	java/io/FileOutputStream
    //   184: dup
    //   185: aload 11
    //   187: invokespecial 131	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   190: astore 6
    //   192: new 133	java/io/BufferedOutputStream
    //   195: dup
    //   196: aload 6
    //   198: invokespecial 136	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   201: astore_0
    //   202: aload_0
    //   203: astore 10
    //   205: aload 6
    //   207: astore 9
    //   209: aload 7
    //   211: astore 8
    //   213: iload_2
    //   214: newarray <illegal type>
    //   216: astore 12
    //   218: aload_0
    //   219: astore 10
    //   221: aload 6
    //   223: astore 9
    //   225: aload 7
    //   227: astore 8
    //   229: aload 7
    //   231: aload 12
    //   233: invokevirtual 140	java/io/FileInputStream:read	([B)I
    //   236: istore_2
    //   237: iload_2
    //   238: iconst_m1
    //   239: if_icmpeq +147 -> 386
    //   242: aload_0
    //   243: astore 10
    //   245: aload 6
    //   247: astore 9
    //   249: aload 7
    //   251: astore 8
    //   253: iload_2
    //   254: invokestatic 143	com/ireadercity/b2/b/t:a	()I
    //   257: if_icmplt +27 -> 284
    //   260: aload_0
    //   261: astore 10
    //   263: aload 6
    //   265: astore 9
    //   267: aload 7
    //   269: astore 8
    //   271: aload 12
    //   273: aload 5
    //   275: iconst_0
    //   276: bipush 16
    //   278: invokevirtual 147	java/lang/String:substring	(II)Ljava/lang/String;
    //   281: invokestatic 150	com/ireadercity/b2/b/t:a	([BLjava/lang/String;)V
    //   284: aload_0
    //   285: astore 10
    //   287: aload 6
    //   289: astore 9
    //   291: aload 7
    //   293: astore 8
    //   295: aload_0
    //   296: aload 12
    //   298: iconst_0
    //   299: iload_2
    //   300: invokevirtual 154	java/io/BufferedOutputStream:write	([BII)V
    //   303: aload_0
    //   304: astore 10
    //   306: aload 6
    //   308: astore 9
    //   310: aload 7
    //   312: astore 8
    //   314: new 73	java/lang/StringBuilder
    //   317: dup
    //   318: ldc -100
    //   320: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   323: aload 12
    //   325: arraylength
    //   326: invokevirtual 159	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   329: ldc -95
    //   331: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: iload_2
    //   335: invokevirtual 159	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   338: ldc -93
    //   340: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: iload_1
    //   344: invokevirtual 159	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   347: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   350: pop
    //   351: aload_0
    //   352: astore 10
    //   354: aload 6
    //   356: astore 9
    //   358: aload 7
    //   360: astore 8
    //   362: aload 7
    //   364: aload 12
    //   366: invokevirtual 140	java/io/FileInputStream:read	([B)I
    //   369: istore_2
    //   370: iload_1
    //   371: iconst_1
    //   372: iadd
    //   373: istore_1
    //   374: goto -137 -> 237
    //   377: aload_0
    //   378: invokevirtual 92	com/ireadercity/b2/bean/b:g	()Ljava/lang/String;
    //   381: astore 5
    //   383: goto -272 -> 111
    //   386: aload_0
    //   387: astore 10
    //   389: aload 6
    //   391: astore 9
    //   393: aload 7
    //   395: astore 8
    //   397: aload_0
    //   398: invokevirtual 166	java/io/BufferedOutputStream:flush	()V
    //   401: aload_0
    //   402: astore 10
    //   404: aload 6
    //   406: astore 9
    //   408: aload 7
    //   410: astore 8
    //   412: new 73	java/lang/StringBuilder
    //   415: dup
    //   416: ldc 118
    //   418: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   421: aload 11
    //   423: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   429: pop
    //   430: aload 7
    //   432: invokevirtual 169	java/io/FileInputStream:close	()V
    //   435: aload_0
    //   436: invokevirtual 170	java/io/BufferedOutputStream:close	()V
    //   439: aload 6
    //   441: invokevirtual 171	java/io/FileOutputStream:close	()V
    //   444: aload 11
    //   446: areturn
    //   447: astore 5
    //   449: aconst_null
    //   450: astore_0
    //   451: aconst_null
    //   452: astore 6
    //   454: aconst_null
    //   455: astore 7
    //   457: aload_0
    //   458: astore 10
    //   460: aload 6
    //   462: astore 9
    //   464: aload 7
    //   466: astore 8
    //   468: aload 5
    //   470: invokevirtual 174	java/lang/Exception:printStackTrace	()V
    //   473: aload 7
    //   475: ifnull +8 -> 483
    //   478: aload 7
    //   480: invokevirtual 169	java/io/FileInputStream:close	()V
    //   483: aload_0
    //   484: ifnull +7 -> 491
    //   487: aload_0
    //   488: invokevirtual 170	java/io/BufferedOutputStream:close	()V
    //   491: aload 6
    //   493: ifnull +117 -> 610
    //   496: aload 6
    //   498: invokevirtual 171	java/io/FileOutputStream:close	()V
    //   501: aconst_null
    //   502: areturn
    //   503: astore_0
    //   504: aload_0
    //   505: invokevirtual 174	java/lang/Exception:printStackTrace	()V
    //   508: aconst_null
    //   509: areturn
    //   510: astore_0
    //   511: aconst_null
    //   512: astore 5
    //   514: aconst_null
    //   515: astore 6
    //   517: aconst_null
    //   518: astore 7
    //   520: aload 7
    //   522: ifnull +8 -> 530
    //   525: aload 7
    //   527: invokevirtual 169	java/io/FileInputStream:close	()V
    //   530: aload 5
    //   532: ifnull +8 -> 540
    //   535: aload 5
    //   537: invokevirtual 170	java/io/BufferedOutputStream:close	()V
    //   540: aload 6
    //   542: ifnull +8 -> 550
    //   545: aload 6
    //   547: invokevirtual 171	java/io/FileOutputStream:close	()V
    //   550: aload_0
    //   551: athrow
    //   552: astore_0
    //   553: aconst_null
    //   554: astore 5
    //   556: aconst_null
    //   557: astore 6
    //   559: goto -39 -> 520
    //   562: astore_0
    //   563: aconst_null
    //   564: astore 5
    //   566: goto -46 -> 520
    //   569: astore_0
    //   570: aload 10
    //   572: astore 5
    //   574: aload 9
    //   576: astore 6
    //   578: aload 8
    //   580: astore 7
    //   582: goto -62 -> 520
    //   585: astore 5
    //   587: aconst_null
    //   588: astore_0
    //   589: aconst_null
    //   590: astore 6
    //   592: goto -135 -> 457
    //   595: astore 5
    //   597: aconst_null
    //   598: astore_0
    //   599: goto -142 -> 457
    //   602: astore 5
    //   604: goto -147 -> 457
    //   607: goto -533 -> 74
    //   610: aconst_null
    //   611: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	612	0	paramb	b
    //   1	373	1	k	int
    //   126	244	2	m	int
    //   121	42	3	l	long
    //   85	297	5	str1	String
    //   447	22	5	localException1	Exception
    //   512	61	5	localObject1	Object
    //   585	1	5	localException2	Exception
    //   595	1	5	localException3	Exception
    //   602	1	5	localException4	Exception
    //   51	540	6	localObject2	Object
    //   179	402	7	localObject3	Object
    //   211	368	8	localObject4	Object
    //   207	368	9	localObject5	Object
    //   203	368	10	localb	b
    //   141	304	11	str2	String
    //   216	149	12	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   170	181	447	java/lang/Exception
    //   2	22	503	java/lang/Exception
    //   22	74	503	java/lang/Exception
    //   74	111	503	java/lang/Exception
    //   116	170	503	java/lang/Exception
    //   377	383	503	java/lang/Exception
    //   430	444	503	java/lang/Exception
    //   478	483	503	java/lang/Exception
    //   487	491	503	java/lang/Exception
    //   496	501	503	java/lang/Exception
    //   525	530	503	java/lang/Exception
    //   535	540	503	java/lang/Exception
    //   545	550	503	java/lang/Exception
    //   550	552	503	java/lang/Exception
    //   170	181	510	finally
    //   181	192	552	finally
    //   192	202	562	finally
    //   213	218	569	finally
    //   229	237	569	finally
    //   253	260	569	finally
    //   271	284	569	finally
    //   295	303	569	finally
    //   314	351	569	finally
    //   362	370	569	finally
    //   397	401	569	finally
    //   412	430	569	finally
    //   468	473	569	finally
    //   181	192	585	java/lang/Exception
    //   192	202	595	java/lang/Exception
    //   213	218	602	java/lang/Exception
    //   229	237	602	java/lang/Exception
    //   253	260	602	java/lang/Exception
    //   271	284	602	java/lang/Exception
    //   295	303	602	java/lang/Exception
    //   314	351	602	java/lang/Exception
    //   362	370	602	java/lang/Exception
    //   397	401	602	java/lang/Exception
    //   412	430	602	java/lang/Exception
  }
  
  public static String a(b paramb, int paramInt)
  {
    if ((paramb == null) || (paramb.h() == 0)) {
      return null;
    }
    String str = paramb.l().toLowerCase().replaceFirst(".yltxt", ".yltxte");
    if (new File(str).exists()) {
      return a(str, paramb.h() * 1024, paramInt);
    }
    return a(a(paramb), paramb.h() * 1024, paramInt);
  }
  
  public static String a(String paramString)
  {
    return Jsoup.parse(paramString).text();
  }
  
  /* Error */
  private static String a(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc -62
    //   4: iconst_3
    //   5: anewarray 4	java/lang/Object
    //   8: dup
    //   9: iconst_0
    //   10: aload_0
    //   11: aastore
    //   12: dup
    //   13: iconst_1
    //   14: iload_1
    //   15: invokestatic 200	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   18: aastore
    //   19: dup
    //   20: iconst_2
    //   21: iload_2
    //   22: invokestatic 200	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   25: aastore
    //   26: invokestatic 204	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   29: pop
    //   30: new 71	java/io/File
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 86	java/io/File:<init>	(Ljava/lang/String;)V
    //   38: astore 11
    //   40: aload 11
    //   42: invokevirtual 90	java/io/File:exists	()Z
    //   45: ifne +5 -> 50
    //   48: aconst_null
    //   49: areturn
    //   50: new 206	org/mozilla/intl/chardet/nsDetector
    //   53: dup
    //   54: iconst_0
    //   55: invokespecial 209	org/mozilla/intl/chardet/nsDetector:<init>	(I)V
    //   58: astore 12
    //   60: aload 12
    //   62: new 211	com/ireadercity/b2/b/e
    //   65: dup
    //   66: invokespecial 212	com/ireadercity/b2/b/e:<init>	()V
    //   69: invokevirtual 216	org/mozilla/intl/chardet/nsDetector:Init	(Lorg/mozilla/intl/chardet/nsICharsetDetectionObserver;)V
    //   72: sipush 1024
    //   75: newarray <illegal type>
    //   77: astore 13
    //   79: new 218	java/io/RandomAccessFile
    //   82: dup
    //   83: aload 11
    //   85: ldc -36
    //   87: invokespecial 223	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   90: astore 10
    //   92: aload 10
    //   94: astore_0
    //   95: aload 10
    //   97: aload 13
    //   99: invokevirtual 224	java/io/RandomAccessFile:read	([B)I
    //   102: istore 4
    //   104: iload 4
    //   106: iconst_m1
    //   107: if_icmpeq +44 -> 151
    //   110: aload 10
    //   112: astore_0
    //   113: aload 12
    //   115: aload 13
    //   117: iload 4
    //   119: invokevirtual 228	org/mozilla/intl/chardet/nsDetector:isAscii	([BI)Z
    //   122: istore 5
    //   124: aload 10
    //   126: astore_0
    //   127: ldc -26
    //   129: putstatic 22	com/ireadercity/b2/b/d:j	Ljava/lang/String;
    //   132: iload 5
    //   134: ifne +17 -> 151
    //   137: aload 10
    //   139: astore_0
    //   140: aload 12
    //   142: aload 13
    //   144: iload 4
    //   146: iconst_0
    //   147: invokevirtual 234	org/mozilla/intl/chardet/nsDetector:DoIt	([BIZ)Z
    //   150: pop
    //   151: aload 10
    //   153: astore_0
    //   154: aload 12
    //   156: invokevirtual 237	org/mozilla/intl/chardet/nsDetector:DataEnd	()V
    //   159: aload 10
    //   161: invokevirtual 238	java/io/RandomAccessFile:close	()V
    //   164: getstatic 22	com/ireadercity/b2/b/d:j	Ljava/lang/String;
    //   167: ifnonnull +8 -> 175
    //   170: ldc -16
    //   172: putstatic 22	com/ireadercity/b2/b/d:j	Ljava/lang/String;
    //   175: new 73	java/lang/StringBuilder
    //   178: dup
    //   179: ldc -14
    //   181: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   184: getstatic 22	com/ireadercity/b2/b/d:j	Ljava/lang/String;
    //   187: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   193: pop
    //   194: iload_1
    //   195: iload_2
    //   196: imul
    //   197: i2l
    //   198: lstore 8
    //   200: iload_2
    //   201: iconst_1
    //   202: iadd
    //   203: iload_1
    //   204: imul
    //   205: i2l
    //   206: lstore 6
    //   208: lload 6
    //   210: aload 11
    //   212: invokevirtual 105	java/io/File:length	()J
    //   215: lcmp
    //   216: ifle +289 -> 505
    //   219: aload 11
    //   221: invokevirtual 105	java/io/File:length	()J
    //   224: lstore 6
    //   226: new 244	java/lang/StringBuffer
    //   229: dup
    //   230: invokespecial 245	java/lang/StringBuffer:<init>	()V
    //   233: astore 12
    //   235: new 218	java/io/RandomAccessFile
    //   238: dup
    //   239: aload 11
    //   241: ldc -36
    //   243: invokespecial 223	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   246: astore 10
    //   248: aload 10
    //   250: astore_0
    //   251: aload 10
    //   253: lload 8
    //   255: invokevirtual 249	java/io/RandomAccessFile:seek	(J)V
    //   258: aload 10
    //   260: astore_0
    //   261: ldc -5
    //   263: iconst_2
    //   264: anewarray 4	java/lang/Object
    //   267: dup
    //   268: iconst_0
    //   269: lload 8
    //   271: invokestatic 256	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   274: aastore
    //   275: dup
    //   276: iconst_1
    //   277: lload 6
    //   279: invokestatic 256	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   282: aastore
    //   283: invokestatic 204	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   286: pop
    //   287: iload_3
    //   288: istore_1
    //   289: aload 10
    //   291: astore_0
    //   292: aload 10
    //   294: invokevirtual 259	java/io/RandomAccessFile:getFilePointer	()J
    //   297: lload 6
    //   299: lcmp
    //   300: ifge +136 -> 436
    //   303: aload 10
    //   305: astore_0
    //   306: aload 10
    //   308: invokevirtual 262	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   311: astore 11
    //   313: aload 11
    //   315: ifnull +121 -> 436
    //   318: iload_2
    //   319: ifne +191 -> 510
    //   322: iload_1
    //   323: ifeq +6 -> 329
    //   326: goto +184 -> 510
    //   329: aload 10
    //   331: astore_0
    //   332: new 45	java/lang/String
    //   335: dup
    //   336: aload 11
    //   338: ldc_w 264
    //   341: invokevirtual 268	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   344: getstatic 22	com/ireadercity/b2/b/d:j	Ljava/lang/String;
    //   347: invokespecial 270	java/lang/String:<init>	([BLjava/lang/String;)V
    //   350: astore 11
    //   352: aload 10
    //   354: astore_0
    //   355: aload 12
    //   357: new 73	java/lang/StringBuilder
    //   360: dup
    //   361: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   364: aload 11
    //   366: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: ldc_w 272
    //   372: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   378: invokevirtual 275	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   381: pop
    //   382: iload_1
    //   383: iconst_1
    //   384: iadd
    //   385: istore_1
    //   386: goto -97 -> 289
    //   389: astore 11
    //   391: aconst_null
    //   392: astore 10
    //   394: aload 10
    //   396: astore_0
    //   397: aload 11
    //   399: invokevirtual 174	java/lang/Exception:printStackTrace	()V
    //   402: aload 10
    //   404: ifnull +104 -> 508
    //   407: aload 10
    //   409: invokevirtual 238	java/io/RandomAccessFile:close	()V
    //   412: aconst_null
    //   413: areturn
    //   414: astore_0
    //   415: aload_0
    //   416: invokevirtual 174	java/lang/Exception:printStackTrace	()V
    //   419: aconst_null
    //   420: areturn
    //   421: astore 10
    //   423: aconst_null
    //   424: astore_0
    //   425: aload_0
    //   426: ifnull +7 -> 433
    //   429: aload_0
    //   430: invokevirtual 238	java/io/RandomAccessFile:close	()V
    //   433: aload 10
    //   435: athrow
    //   436: aload 10
    //   438: invokevirtual 238	java/io/RandomAccessFile:close	()V
    //   441: aload 12
    //   443: invokevirtual 276	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   446: astore_0
    //   447: aload_0
    //   448: areturn
    //   449: astore 11
    //   451: aconst_null
    //   452: astore 10
    //   454: aload 10
    //   456: astore_0
    //   457: aload 11
    //   459: invokevirtual 174	java/lang/Exception:printStackTrace	()V
    //   462: aload 10
    //   464: ifnull +44 -> 508
    //   467: aload 10
    //   469: invokevirtual 238	java/io/RandomAccessFile:close	()V
    //   472: aconst_null
    //   473: areturn
    //   474: aload_0
    //   475: ifnull +7 -> 482
    //   478: aload_0
    //   479: invokevirtual 238	java/io/RandomAccessFile:close	()V
    //   482: aload 10
    //   484: athrow
    //   485: astore 10
    //   487: goto -13 -> 474
    //   490: astore 11
    //   492: goto -38 -> 454
    //   495: astore 10
    //   497: goto -72 -> 425
    //   500: astore 11
    //   502: goto -108 -> 394
    //   505: goto -279 -> 226
    //   508: aconst_null
    //   509: areturn
    //   510: iload_1
    //   511: ifle -129 -> 382
    //   514: goto -185 -> 329
    //   517: astore 10
    //   519: aconst_null
    //   520: astore_0
    //   521: goto -47 -> 474
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	524	0	paramString	String
    //   0	524	1	paramInt1	int
    //   0	524	2	paramInt2	int
    //   1	287	3	k	int
    //   102	43	4	m	int
    //   122	11	5	bool	boolean
    //   206	92	6	l1	long
    //   198	72	8	l2	long
    //   90	318	10	localRandomAccessFile	java.io.RandomAccessFile
    //   421	16	10	localObject1	Object
    //   452	31	10	localObject2	Object
    //   485	1	10	localObject3	Object
    //   495	1	10	localObject4	Object
    //   517	1	10	localObject5	Object
    //   38	327	11	localObject6	Object
    //   389	9	11	localException1	Exception
    //   449	9	11	localException2	Exception
    //   490	1	11	localException3	Exception
    //   500	1	11	localException4	Exception
    //   58	384	12	localObject7	Object
    //   77	66	13	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   79	92	389	java/lang/Exception
    //   30	48	414	java/lang/Exception
    //   50	79	414	java/lang/Exception
    //   159	175	414	java/lang/Exception
    //   175	194	414	java/lang/Exception
    //   208	226	414	java/lang/Exception
    //   226	235	414	java/lang/Exception
    //   407	412	414	java/lang/Exception
    //   429	433	414	java/lang/Exception
    //   433	436	414	java/lang/Exception
    //   436	447	414	java/lang/Exception
    //   467	472	414	java/lang/Exception
    //   478	482	414	java/lang/Exception
    //   482	485	414	java/lang/Exception
    //   79	92	421	finally
    //   235	248	449	java/lang/Exception
    //   251	258	485	finally
    //   261	287	485	finally
    //   292	303	485	finally
    //   306	313	485	finally
    //   332	352	485	finally
    //   355	382	485	finally
    //   457	462	485	finally
    //   251	258	490	java/lang/Exception
    //   261	287	490	java/lang/Exception
    //   292	303	490	java/lang/Exception
    //   306	313	490	java/lang/Exception
    //   332	352	490	java/lang/Exception
    //   355	382	490	java/lang/Exception
    //   95	104	495	finally
    //   113	124	495	finally
    //   127	132	495	finally
    //   140	151	495	finally
    //   154	159	495	finally
    //   397	402	495	finally
    //   95	104	500	java/lang/Exception
    //   113	124	500	java/lang/Exception
    //   127	132	500	java/lang/Exception
    //   140	151	500	java/lang/Exception
    //   154	159	500	java/lang/Exception
    //   235	248	517	finally
  }
  
  /* Error */
  private static byte[] a(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 279	java/io/ByteArrayOutputStream
    //   5: dup
    //   6: sipush 16384
    //   9: invokespecial 280	java/io/ByteArrayOutputStream:<init>	(I)V
    //   12: astore_3
    //   13: new 282	java/io/DataOutputStream
    //   16: dup
    //   17: aload_3
    //   18: invokespecial 283	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   21: astore_2
    //   22: sipush 16384
    //   25: newarray <illegal type>
    //   27: astore 4
    //   29: aload_0
    //   30: aload 4
    //   32: invokevirtual 286	java/io/InputStream:read	([B)I
    //   35: istore_1
    //   36: iload_1
    //   37: iconst_m1
    //   38: if_icmpeq +21 -> 59
    //   41: aload_2
    //   42: aload 4
    //   44: iconst_0
    //   45: iload_1
    //   46: invokevirtual 287	java/io/DataOutputStream:write	([BII)V
    //   49: aload_0
    //   50: aload 4
    //   52: invokevirtual 286	java/io/InputStream:read	([B)I
    //   55: istore_1
    //   56: goto -20 -> 36
    //   59: aload_2
    //   60: invokevirtual 288	java/io/DataOutputStream:close	()V
    //   63: aload_3
    //   64: invokevirtual 289	java/io/ByteArrayOutputStream:close	()V
    //   67: aload_3
    //   68: invokevirtual 293	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   71: areturn
    //   72: astore_3
    //   73: aconst_null
    //   74: astore_0
    //   75: aload_3
    //   76: athrow
    //   77: astore 4
    //   79: aload_2
    //   80: astore_3
    //   81: aload_0
    //   82: astore_2
    //   83: aload 4
    //   85: astore_0
    //   86: aload_2
    //   87: ifnull +7 -> 94
    //   90: aload_2
    //   91: invokevirtual 288	java/io/DataOutputStream:close	()V
    //   94: aload_3
    //   95: ifnull +7 -> 102
    //   98: aload_3
    //   99: invokevirtual 289	java/io/ByteArrayOutputStream:close	()V
    //   102: aload_0
    //   103: athrow
    //   104: astore_0
    //   105: aconst_null
    //   106: astore_2
    //   107: aconst_null
    //   108: astore_3
    //   109: goto -23 -> 86
    //   112: astore_0
    //   113: aconst_null
    //   114: astore_2
    //   115: goto -29 -> 86
    //   118: astore_0
    //   119: goto -33 -> 86
    //   122: astore 4
    //   124: aconst_null
    //   125: astore_0
    //   126: aload_3
    //   127: astore_2
    //   128: aload 4
    //   130: astore_3
    //   131: goto -56 -> 75
    //   134: astore_0
    //   135: aload_3
    //   136: astore 4
    //   138: aload_0
    //   139: astore_3
    //   140: aload_2
    //   141: astore_0
    //   142: aload 4
    //   144: astore_2
    //   145: goto -70 -> 75
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	paramInputStream	java.io.InputStream
    //   35	21	1	k	int
    //   1	144	2	localObject1	Object
    //   12	56	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   72	4	3	localException1	Exception
    //   80	60	3	localObject2	Object
    //   27	24	4	arrayOfByte	byte[]
    //   77	7	4	localObject3	Object
    //   122	7	4	localException2	Exception
    //   136	7	4	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   2	13	72	java/lang/Exception
    //   75	77	77	finally
    //   2	13	104	finally
    //   13	22	112	finally
    //   22	36	118	finally
    //   41	56	118	finally
    //   13	22	122	java/lang/Exception
    //   22	36	134	java/lang/Exception
    //   41	56	134	java/lang/Exception
  }
  
  public final String a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, String paramString4, int paramInt3, int paramInt4)
  {
    String str = paramString1;
    if (paramString1 == null) {
      str = "";
    }
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    this.d = (a.D - paramInt3 * 2);
    this.e = (a.E - paramInt3 * 2);
    new StringBuilder(" height=").append(this.e).append(" width=").append(this.d).toString();
    new StringBuilder("getHtmlCss width=").append(this.d).append(" u_fontSize=").append(paramInt1).append(" height=").append(this.e).append(" SYS_CSS=").append(str).toString();
    if ((!a.S) || (a.N == 1))
    {
      this.f = (this.e - 40);
      if (paramInt2 != 1) {
        break label704;
      }
      this.g = "font-weight:bold;";
      label170:
      new StringBuilder("spicHeight=").append(this.f).toString();
      paramString2 = new StringBuilder("<style type=\"text/css\">html{height:").append(this.f).append("px;}@font-face{font-family:").append("hk").append(";src:url(").append(a.t).append(paramString3.replace("[自定义]", "")).append(")} body{padding:5px 5px;font-size:").append(paramInt1).append("px;font-family:").append("hk").append("} h4{font-size:").append((int)(paramInt1 * 1.5D)).append("px;").append(this.g).append("} h3{font-size:").append((int)(paramInt1 * 1.6D)).append("px;").append(this.g).append("} h2{font-size:").append((int)(paramInt1 * 1.7D)).append("px;").append(this.g).append("} h1{font-size:").append((int)(paramInt1 * 1.8D)).append("px;").append(this.g).append("} p{").append(this.g).append("}body{width:auto;margin:0px;padding:0px;color:").append(paramString4).append(";").append(this.g).append("}img{max-width:100%;width:auto;max-height:100%;height:auto;}p{text-indent:2em;line-height:").append(paramInt4).append("%;}#book{width:");
      if (a.U >= 8) {
        break label714;
      }
      paramInt1 = this.d * 2;
      label453:
      paramString2 = paramString2.append(paramInt1).append("px;height:").append(this.f).append("px;padding:0px 0px;").append("-webkit-column-width:widthpx; -webkit-column-gap:0px;").append("text-align:justify;}#viewer{width:");
      if (a.U >= 8) {
        break label722;
      }
    }
    label704:
    label714:
    label722:
    for (paramInt1 = this.d * 2;; paramInt1 = this.d)
    {
      paramString2 = paramInt1 + "px;height:" + this.f + "px;color:" + paramString4 + ";}</style>";
      this.c = ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\"><head><title>My Book</title><meta content=\"http://www.w3.org/1999/xhtml; charset=utf-8\" http-equiv=\"Content-Type\"/>" + paramString2 + "<script language=\"JavaScript\" type=\"text/javascript\">function test(arg){window.getWidth.getWidth(arg);}</script></head>" + "<body onload=\"setTimeout(function() { test(document.body.scrollWidth); }, 300);\"><div id=\"viewer\"><div id=\"book\">" + paramString1 + "</div></div></body></html>");
      new StringBuilder("userCss=").append(paramString2).toString();
      new StringBuilder("SYS_CSS=").append(str).toString();
      new StringBuilder("NEWHTML=length=").append(this.c.length()).append(" newCon=").append(this.c).toString();
      new StringBuilder("multipleColumn=").append(this.c).toString();
      return this.c;
      this.f = (this.e - 95);
      break;
      this.g = "font-weight:normal;";
      break label170;
      paramInt1 = this.d;
      break label453;
    }
  }
  
  /* Error */
  public final String[] a(String paramString, b paramb)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aconst_null
    //   4: astore 8
    //   6: aconst_null
    //   7: astore 6
    //   9: new 73	java/lang/StringBuilder
    //   12: dup
    //   13: ldc_w 414
    //   16: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   19: aload_2
    //   20: invokevirtual 416	com/ireadercity/b2/bean/b:r	()Ljava/lang/String;
    //   23: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: pop
    //   30: aload_1
    //   31: ldc_w 418
    //   34: invokevirtual 422	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   37: istore_3
    //   38: aload_1
    //   39: astore 4
    //   41: iload_3
    //   42: iconst_m1
    //   43: if_icmpeq +11 -> 54
    //   46: aload_1
    //   47: iconst_0
    //   48: iload_3
    //   49: invokevirtual 147	java/lang/String:substring	(II)Ljava/lang/String;
    //   52: astore 4
    //   54: new 71	java/io/File
    //   57: dup
    //   58: aload 4
    //   60: invokespecial 86	java/io/File:<init>	(Ljava/lang/String;)V
    //   63: astore_1
    //   64: new 125	java/io/FileInputStream
    //   67: dup
    //   68: aload_1
    //   69: invokespecial 128	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   72: astore 5
    //   74: aload 8
    //   76: astore 6
    //   78: aload_2
    //   79: invokevirtual 60	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   82: invokevirtual 63	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   85: ldc_w 424
    //   88: invokevirtual 69	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   91: ifeq +354 -> 445
    //   94: aload 8
    //   96: astore 6
    //   98: aload_2
    //   99: invokevirtual 92	com/ireadercity/b2/bean/b:g	()Ljava/lang/String;
    //   102: ifnonnull +57 -> 159
    //   105: aload 8
    //   107: astore 6
    //   109: aload_2
    //   110: invokestatic 96	com/ireadercity/b2/b/t:a	(Lcom/ireadercity/b2/bean/b;)Ljava/lang/String;
    //   113: astore 7
    //   115: aload 8
    //   117: astore 6
    //   119: aload_2
    //   120: aload 7
    //   122: invokevirtual 98	com/ireadercity/b2/bean/b:b	(Ljava/lang/String;)V
    //   125: aload 8
    //   127: astore 6
    //   129: new 73	java/lang/StringBuilder
    //   132: dup
    //   133: ldc 100
    //   135: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   138: aload 7
    //   140: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: pop
    //   147: aload 7
    //   149: ifnonnull +23 -> 172
    //   152: aload 5
    //   154: invokevirtual 169	java/io/FileInputStream:close	()V
    //   157: aconst_null
    //   158: areturn
    //   159: aload 8
    //   161: astore 6
    //   163: aload_2
    //   164: invokevirtual 92	com/ireadercity/b2/bean/b:g	()Ljava/lang/String;
    //   167: astore 7
    //   169: goto -22 -> 147
    //   172: aload 8
    //   174: astore 6
    //   176: new 426	java/io/InputStreamReader
    //   179: dup
    //   180: aload 5
    //   182: invokespecial 429	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   185: astore_1
    //   186: aload_1
    //   187: astore 4
    //   189: aload 5
    //   191: invokestatic 431	com/ireadercity/b2/b/d:a	(Ljava/io/InputStream;)[B
    //   194: astore 6
    //   196: aload_1
    //   197: astore 4
    //   199: aload 6
    //   201: aload 7
    //   203: iconst_0
    //   204: bipush 16
    //   206: invokevirtual 147	java/lang/String:substring	(II)Ljava/lang/String;
    //   209: invokestatic 433	com/ireadercity/b2/b/t:b	([BLjava/lang/String;)V
    //   212: aload_1
    //   213: astore 4
    //   215: aload_0
    //   216: new 45	java/lang/String
    //   219: dup
    //   220: aload 6
    //   222: invokespecial 436	java/lang/String:<init>	([B)V
    //   225: putfield 30	com/ireadercity/b2/b/d:a	Ljava/lang/String;
    //   228: aload_1
    //   229: astore 4
    //   231: aload 4
    //   233: astore 6
    //   235: aload_2
    //   236: invokevirtual 438	com/ireadercity/b2/bean/b:t	()Ljava/lang/String;
    //   239: ldc_w 440
    //   242: invokevirtual 443	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   245: ifne +20 -> 265
    //   248: aload 4
    //   250: astore 6
    //   252: aload_2
    //   253: invokevirtual 438	com/ireadercity/b2/bean/b:t	()Ljava/lang/String;
    //   256: ldc_w 445
    //   259: invokevirtual 443	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   262: ifeq +488 -> 750
    //   265: aload 4
    //   267: astore 6
    //   269: iconst_2
    //   270: anewarray 45	java/lang/String
    //   273: astore_1
    //   274: aload 4
    //   276: astore 6
    //   278: aload_0
    //   279: getfield 30	com/ireadercity/b2/b/d:a	Ljava/lang/String;
    //   282: ldc_w 447
    //   285: invokevirtual 450	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   288: iconst_m1
    //   289: if_icmpeq +338 -> 627
    //   292: aload 4
    //   294: astore 6
    //   296: aload_0
    //   297: getfield 30	com/ireadercity/b2/b/d:a	Ljava/lang/String;
    //   300: ldc_w 447
    //   303: invokevirtual 454	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   306: astore_2
    //   307: aload_1
    //   308: iconst_0
    //   309: aload_2
    //   310: iconst_0
    //   311: aaload
    //   312: aastore
    //   313: aload 4
    //   315: astore 6
    //   317: aload_1
    //   318: iconst_1
    //   319: aload_2
    //   320: iconst_1
    //   321: aaload
    //   322: aload_2
    //   323: iconst_1
    //   324: aaload
    //   325: bipush 62
    //   327: invokevirtual 457	java/lang/String:indexOf	(I)I
    //   330: iconst_1
    //   331: iadd
    //   332: aload_2
    //   333: iconst_1
    //   334: aaload
    //   335: invokevirtual 405	java/lang/String:length	()I
    //   338: invokevirtual 147	java/lang/String:substring	(II)Ljava/lang/String;
    //   341: aastore
    //   342: aload 4
    //   344: astore 6
    //   346: aload_1
    //   347: iconst_0
    //   348: aaload
    //   349: ldc_w 459
    //   352: invokevirtual 450	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   355: iconst_m1
    //   356: if_icmpne +289 -> 645
    //   359: aload 4
    //   361: astore 6
    //   363: aload_0
    //   364: getfield 47	com/ireadercity/b2/b/d:i	[Ljava/lang/String;
    //   367: iconst_1
    //   368: aload_1
    //   369: iconst_1
    //   370: aaload
    //   371: ldc_w 461
    //   374: invokevirtual 454	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   377: iconst_0
    //   378: aaload
    //   379: aastore
    //   380: aload 4
    //   382: ifnull +8 -> 390
    //   385: aload 4
    //   387: invokevirtual 462	java/io/InputStreamReader:close	()V
    //   390: aload 5
    //   392: invokevirtual 169	java/io/FileInputStream:close	()V
    //   395: aload_0
    //   396: getfield 47	com/ireadercity/b2/b/d:i	[Ljava/lang/String;
    //   399: areturn
    //   400: astore 7
    //   402: aload_1
    //   403: astore 4
    //   405: aload 7
    //   407: invokevirtual 174	java/lang/Exception:printStackTrace	()V
    //   410: goto -198 -> 212
    //   413: astore_2
    //   414: aload_1
    //   415: astore 6
    //   417: aload 5
    //   419: astore_1
    //   420: aload 6
    //   422: ifnull +8 -> 430
    //   425: aload 6
    //   427: invokevirtual 462	java/io/InputStreamReader:close	()V
    //   430: aload_1
    //   431: ifnull -36 -> 395
    //   434: aload_1
    //   435: invokevirtual 169	java/io/FileInputStream:close	()V
    //   438: goto -43 -> 395
    //   441: astore_1
    //   442: goto -47 -> 395
    //   445: new 426	java/io/InputStreamReader
    //   448: dup
    //   449: aload 5
    //   451: invokespecial 429	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   454: astore_1
    //   455: new 464	java/io/BufferedReader
    //   458: dup
    //   459: aload_1
    //   460: sipush 16384
    //   463: invokespecial 467	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   466: astore 7
    //   468: aload 7
    //   470: invokevirtual 468	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   473: astore 4
    //   475: aload 4
    //   477: ifnull +78 -> 555
    //   480: aload_0
    //   481: new 73	java/lang/StringBuilder
    //   484: dup
    //   485: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   488: aload_0
    //   489: getfield 30	com/ireadercity/b2/b/d:a	Ljava/lang/String;
    //   492: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: aload 4
    //   497: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   500: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   503: putfield 30	com/ireadercity/b2/b/d:a	Ljava/lang/String;
    //   506: goto -38 -> 468
    //   509: astore 4
    //   511: aload 7
    //   513: astore 4
    //   515: aload 4
    //   517: ifnull +11 -> 528
    //   520: aload_1
    //   521: astore 6
    //   523: aload 4
    //   525: invokevirtual 469	java/io/BufferedReader:close	()V
    //   528: aload_1
    //   529: astore 4
    //   531: aload_1
    //   532: ifnull -301 -> 231
    //   535: aload_1
    //   536: astore 6
    //   538: aload_1
    //   539: invokevirtual 462	java/io/InputStreamReader:close	()V
    //   542: aload_1
    //   543: astore 4
    //   545: goto -314 -> 231
    //   548: astore_1
    //   549: aload 5
    //   551: astore_1
    //   552: goto -132 -> 420
    //   555: aload_1
    //   556: astore 6
    //   558: aload_1
    //   559: astore 4
    //   561: aload 7
    //   563: invokevirtual 469	java/io/BufferedReader:close	()V
    //   566: aload_1
    //   567: astore 6
    //   569: aload_1
    //   570: astore 4
    //   572: aload_1
    //   573: invokevirtual 462	java/io/InputStreamReader:close	()V
    //   576: aload_1
    //   577: astore 4
    //   579: goto -348 -> 231
    //   582: aload 7
    //   584: ifnull +14 -> 598
    //   587: aload_1
    //   588: astore 6
    //   590: aload_1
    //   591: astore 4
    //   593: aload 7
    //   595: invokevirtual 469	java/io/BufferedReader:close	()V
    //   598: aload_1
    //   599: ifnull +13 -> 612
    //   602: aload_1
    //   603: astore 6
    //   605: aload_1
    //   606: astore 4
    //   608: aload_1
    //   609: invokevirtual 462	java/io/InputStreamReader:close	()V
    //   612: aload_1
    //   613: astore 6
    //   615: aload_1
    //   616: astore 4
    //   618: aload_2
    //   619: athrow
    //   620: astore_1
    //   621: aload 5
    //   623: astore_1
    //   624: goto -204 -> 420
    //   627: aload 4
    //   629: astore 6
    //   631: aload_0
    //   632: getfield 30	com/ireadercity/b2/b/d:a	Ljava/lang/String;
    //   635: ldc_w 471
    //   638: invokevirtual 454	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   641: astore_1
    //   642: goto -300 -> 342
    //   645: aload 4
    //   647: astore 6
    //   649: aload_1
    //   650: iconst_0
    //   651: aaload
    //   652: ldc_w 459
    //   655: invokevirtual 454	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   658: astore_2
    //   659: aload 4
    //   661: astore 6
    //   663: aload_0
    //   664: getfield 47	com/ireadercity/b2/b/d:i	[Ljava/lang/String;
    //   667: iconst_0
    //   668: new 73	java/lang/StringBuilder
    //   671: dup
    //   672: ldc_w 473
    //   675: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   678: aload_2
    //   679: iconst_1
    //   680: aaload
    //   681: ldc_w 475
    //   684: invokevirtual 454	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   687: iconst_0
    //   688: aaload
    //   689: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   692: ldc_w 475
    //   695: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   698: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   701: aastore
    //   702: aload 4
    //   704: astore 6
    //   706: aload_0
    //   707: getfield 47	com/ireadercity/b2/b/d:i	[Ljava/lang/String;
    //   710: iconst_1
    //   711: aload_1
    //   712: iconst_1
    //   713: aaload
    //   714: ldc_w 461
    //   717: invokevirtual 454	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   720: iconst_0
    //   721: aaload
    //   722: aastore
    //   723: goto -343 -> 380
    //   726: astore_1
    //   727: aload 4
    //   729: astore_2
    //   730: aload_2
    //   731: ifnull +7 -> 738
    //   734: aload_2
    //   735: invokevirtual 462	java/io/InputStreamReader:close	()V
    //   738: aload 5
    //   740: ifnull +8 -> 748
    //   743: aload 5
    //   745: invokevirtual 169	java/io/FileInputStream:close	()V
    //   748: aload_1
    //   749: athrow
    //   750: aload 4
    //   752: astore 6
    //   754: aload_2
    //   755: invokevirtual 438	com/ireadercity/b2/bean/b:t	()Ljava/lang/String;
    //   758: ldc_w 477
    //   761: invokevirtual 443	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   764: ifeq -384 -> 380
    //   767: aload 4
    //   769: astore 6
    //   771: aload_0
    //   772: getfield 47	com/ireadercity/b2/b/d:i	[Ljava/lang/String;
    //   775: iconst_0
    //   776: ldc 28
    //   778: aastore
    //   779: aload 4
    //   781: astore 6
    //   783: aload_0
    //   784: getfield 47	com/ireadercity/b2/b/d:i	[Ljava/lang/String;
    //   787: iconst_1
    //   788: aload_0
    //   789: getfield 30	com/ireadercity/b2/b/d:a	Ljava/lang/String;
    //   792: aastore
    //   793: goto -413 -> 380
    //   796: astore_1
    //   797: aconst_null
    //   798: areturn
    //   799: astore_2
    //   800: goto -52 -> 748
    //   803: astore_1
    //   804: aconst_null
    //   805: astore 5
    //   807: aconst_null
    //   808: astore_2
    //   809: goto -79 -> 730
    //   812: astore_1
    //   813: aconst_null
    //   814: astore_2
    //   815: goto -85 -> 730
    //   818: astore_1
    //   819: aload 4
    //   821: astore_2
    //   822: goto -92 -> 730
    //   825: astore 4
    //   827: aload_1
    //   828: astore_2
    //   829: aload 4
    //   831: astore_1
    //   832: goto -102 -> 730
    //   835: astore_1
    //   836: aconst_null
    //   837: astore_1
    //   838: goto -418 -> 420
    //   841: astore_1
    //   842: goto -447 -> 395
    //   845: astore_2
    //   846: aconst_null
    //   847: astore 7
    //   849: goto -267 -> 582
    //   852: astore_2
    //   853: goto -271 -> 582
    //   856: astore_1
    //   857: aconst_null
    //   858: astore 4
    //   860: aload 7
    //   862: astore_1
    //   863: goto -348 -> 515
    //   866: astore 4
    //   868: aconst_null
    //   869: astore 4
    //   871: goto -356 -> 515
    //   874: astore_2
    //   875: aconst_null
    //   876: astore 7
    //   878: aconst_null
    //   879: astore_1
    //   880: goto -298 -> 582
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	883	0	this	d
    //   0	883	1	paramString	String
    //   0	883	2	paramb	b
    //   37	12	3	k	int
    //   39	457	4	str1	String
    //   509	1	4	localException1	Exception
    //   513	307	4	localObject1	Object
    //   825	5	4	localObject2	Object
    //   858	1	4	localObject3	Object
    //   866	1	4	localException2	Exception
    //   869	1	4	localObject4	Object
    //   72	734	5	localFileInputStream	java.io.FileInputStream
    //   7	775	6	localObject5	Object
    //   1	201	7	str2	String
    //   400	6	7	localException3	Exception
    //   466	411	7	localBufferedReader	java.io.BufferedReader
    //   4	169	8	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   199	212	400	java/lang/Exception
    //   189	196	413	java/lang/Exception
    //   215	228	413	java/lang/Exception
    //   405	410	413	java/lang/Exception
    //   425	430	441	java/lang/Exception
    //   434	438	441	java/lang/Exception
    //   468	475	509	java/lang/Exception
    //   480	506	509	java/lang/Exception
    //   78	94	548	java/lang/Exception
    //   98	105	548	java/lang/Exception
    //   109	115	548	java/lang/Exception
    //   119	125	548	java/lang/Exception
    //   129	147	548	java/lang/Exception
    //   163	169	548	java/lang/Exception
    //   176	186	548	java/lang/Exception
    //   235	248	548	java/lang/Exception
    //   252	265	548	java/lang/Exception
    //   269	274	548	java/lang/Exception
    //   278	292	548	java/lang/Exception
    //   296	307	548	java/lang/Exception
    //   317	342	548	java/lang/Exception
    //   346	359	548	java/lang/Exception
    //   363	380	548	java/lang/Exception
    //   523	528	548	java/lang/Exception
    //   538	542	548	java/lang/Exception
    //   631	642	548	java/lang/Exception
    //   649	659	548	java/lang/Exception
    //   663	702	548	java/lang/Exception
    //   706	723	548	java/lang/Exception
    //   754	767	548	java/lang/Exception
    //   771	779	548	java/lang/Exception
    //   783	793	548	java/lang/Exception
    //   561	566	620	java/lang/Exception
    //   572	576	620	java/lang/Exception
    //   593	598	620	java/lang/Exception
    //   608	612	620	java/lang/Exception
    //   618	620	620	java/lang/Exception
    //   235	248	726	finally
    //   252	265	726	finally
    //   269	274	726	finally
    //   278	292	726	finally
    //   296	307	726	finally
    //   317	342	726	finally
    //   346	359	726	finally
    //   363	380	726	finally
    //   631	642	726	finally
    //   649	659	726	finally
    //   663	702	726	finally
    //   706	723	726	finally
    //   754	767	726	finally
    //   771	779	726	finally
    //   783	793	726	finally
    //   152	157	796	java/lang/Exception
    //   734	738	799	java/lang/Exception
    //   743	748	799	java/lang/Exception
    //   64	74	803	finally
    //   78	94	812	finally
    //   98	105	812	finally
    //   109	115	812	finally
    //   119	125	812	finally
    //   129	147	812	finally
    //   163	169	812	finally
    //   176	186	812	finally
    //   189	196	818	finally
    //   199	212	818	finally
    //   215	228	818	finally
    //   405	410	818	finally
    //   561	566	818	finally
    //   572	576	818	finally
    //   593	598	818	finally
    //   608	612	818	finally
    //   618	620	818	finally
    //   523	528	825	finally
    //   538	542	825	finally
    //   64	74	835	java/lang/Exception
    //   385	390	841	java/lang/Exception
    //   390	395	841	java/lang/Exception
    //   455	468	845	finally
    //   468	475	852	finally
    //   480	506	852	finally
    //   445	455	856	java/lang/Exception
    //   455	468	866	java/lang/Exception
    //   445	455	874	finally
  }
  
  /* Error */
  public final String b(String paramString, b paramb)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 7
    //   6: aconst_null
    //   7: astore 5
    //   9: new 73	java/lang/StringBuilder
    //   12: dup
    //   13: ldc_w 414
    //   16: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   19: aload_2
    //   20: invokevirtual 416	com/ireadercity/b2/bean/b:r	()Ljava/lang/String;
    //   23: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: pop
    //   30: aload_1
    //   31: ldc_w 418
    //   34: invokevirtual 422	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   37: istore_3
    //   38: aload_1
    //   39: astore 4
    //   41: iload_3
    //   42: iconst_m1
    //   43: if_icmpeq +11 -> 54
    //   46: aload_1
    //   47: iconst_0
    //   48: iload_3
    //   49: invokevirtual 147	java/lang/String:substring	(II)Ljava/lang/String;
    //   52: astore 4
    //   54: new 71	java/io/File
    //   57: dup
    //   58: aload 4
    //   60: invokespecial 86	java/io/File:<init>	(Ljava/lang/String;)V
    //   63: astore_1
    //   64: new 125	java/io/FileInputStream
    //   67: dup
    //   68: aload_1
    //   69: invokespecial 128	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   72: astore 4
    //   74: aload 7
    //   76: astore 5
    //   78: aload_2
    //   79: invokevirtual 60	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   82: invokevirtual 63	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   85: ldc_w 424
    //   88: invokevirtual 69	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   91: ifeq +230 -> 321
    //   94: aload 7
    //   96: astore 5
    //   98: aload_2
    //   99: invokevirtual 92	com/ireadercity/b2/bean/b:g	()Ljava/lang/String;
    //   102: ifnonnull +58 -> 160
    //   105: aload 7
    //   107: astore 5
    //   109: aload_2
    //   110: invokestatic 96	com/ireadercity/b2/b/t:a	(Lcom/ireadercity/b2/bean/b;)Ljava/lang/String;
    //   113: astore 6
    //   115: aload 7
    //   117: astore 5
    //   119: aload_2
    //   120: aload 6
    //   122: invokevirtual 98	com/ireadercity/b2/bean/b:b	(Ljava/lang/String;)V
    //   125: aload 7
    //   127: astore 5
    //   129: new 73	java/lang/StringBuilder
    //   132: dup
    //   133: ldc_w 482
    //   136: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   139: aload 6
    //   141: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: pop
    //   148: aload 6
    //   150: ifnonnull +23 -> 173
    //   153: aload 4
    //   155: invokevirtual 169	java/io/FileInputStream:close	()V
    //   158: aconst_null
    //   159: areturn
    //   160: aload 7
    //   162: astore 5
    //   164: aload_2
    //   165: invokevirtual 92	com/ireadercity/b2/bean/b:g	()Ljava/lang/String;
    //   168: astore 6
    //   170: goto -45 -> 125
    //   173: aload 7
    //   175: astore 5
    //   177: new 426	java/io/InputStreamReader
    //   180: dup
    //   181: aload 4
    //   183: invokespecial 429	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   186: astore_1
    //   187: aload_1
    //   188: astore_2
    //   189: aload 4
    //   191: invokestatic 431	com/ireadercity/b2/b/d:a	(Ljava/io/InputStream;)[B
    //   194: astore 5
    //   196: aload_1
    //   197: astore_2
    //   198: aload 5
    //   200: aload 6
    //   202: iconst_0
    //   203: bipush 16
    //   205: invokevirtual 147	java/lang/String:substring	(II)Ljava/lang/String;
    //   208: invokestatic 433	com/ireadercity/b2/b/t:b	([BLjava/lang/String;)V
    //   211: aload_1
    //   212: astore_2
    //   213: aload_0
    //   214: new 45	java/lang/String
    //   217: dup
    //   218: aload 5
    //   220: invokespecial 436	java/lang/String:<init>	([B)V
    //   223: putfield 30	com/ireadercity/b2/b/d:a	Ljava/lang/String;
    //   226: aload_1
    //   227: ifnull +7 -> 234
    //   230: aload_1
    //   231: invokevirtual 462	java/io/InputStreamReader:close	()V
    //   234: aload 4
    //   236: invokevirtual 169	java/io/FileInputStream:close	()V
    //   239: aload_0
    //   240: getfield 30	com/ireadercity/b2/b/d:a	Ljava/lang/String;
    //   243: areturn
    //   244: astore 6
    //   246: aload_1
    //   247: astore_2
    //   248: aload 6
    //   250: invokevirtual 174	java/lang/Exception:printStackTrace	()V
    //   253: goto -42 -> 211
    //   256: astore_2
    //   257: aload 4
    //   259: astore_2
    //   260: aload_1
    //   261: ifnull +7 -> 268
    //   264: aload_1
    //   265: invokevirtual 462	java/io/InputStreamReader:close	()V
    //   268: aload_2
    //   269: ifnull -30 -> 239
    //   272: aload_2
    //   273: invokevirtual 169	java/io/FileInputStream:close	()V
    //   276: goto -37 -> 239
    //   279: astore_1
    //   280: goto -41 -> 239
    //   283: astore 5
    //   285: aload_1
    //   286: astore_2
    //   287: aload 5
    //   289: invokevirtual 483	java/lang/OutOfMemoryError:printStackTrace	()V
    //   292: aload_1
    //   293: astore_2
    //   294: invokestatic 488	java/lang/System:gc	()V
    //   297: goto -71 -> 226
    //   300: astore_1
    //   301: aload_2
    //   302: ifnull +7 -> 309
    //   305: aload_2
    //   306: invokevirtual 462	java/io/InputStreamReader:close	()V
    //   309: aload 4
    //   311: ifnull +8 -> 319
    //   314: aload 4
    //   316: invokevirtual 169	java/io/FileInputStream:close	()V
    //   319: aload_1
    //   320: athrow
    //   321: new 426	java/io/InputStreamReader
    //   324: dup
    //   325: aload 4
    //   327: invokespecial 429	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   330: astore_1
    //   331: new 464	java/io/BufferedReader
    //   334: dup
    //   335: aload_1
    //   336: sipush 16384
    //   339: invokespecial 467	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   342: astore 7
    //   344: aload 7
    //   346: invokevirtual 468	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   349: astore_2
    //   350: aload_2
    //   351: ifnull +60 -> 411
    //   354: aload_0
    //   355: new 73	java/lang/StringBuilder
    //   358: dup
    //   359: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   362: aload_0
    //   363: getfield 30	com/ireadercity/b2/b/d:a	Ljava/lang/String;
    //   366: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: aload_2
    //   370: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   376: putfield 30	com/ireadercity/b2/b/d:a	Ljava/lang/String;
    //   379: goto -35 -> 344
    //   382: astore_2
    //   383: aload 7
    //   385: astore_2
    //   386: aload_2
    //   387: ifnull +10 -> 397
    //   390: aload_1
    //   391: astore 5
    //   393: aload_2
    //   394: invokevirtual 469	java/io/BufferedReader:close	()V
    //   397: aload_1
    //   398: ifnull +154 -> 552
    //   401: aload_1
    //   402: astore 5
    //   404: aload_1
    //   405: invokevirtual 462	java/io/InputStreamReader:close	()V
    //   408: goto -182 -> 226
    //   411: aload_1
    //   412: astore_2
    //   413: aload_1
    //   414: astore 6
    //   416: aload 7
    //   418: invokevirtual 469	java/io/BufferedReader:close	()V
    //   421: aload_1
    //   422: astore_2
    //   423: aload_1
    //   424: astore 6
    //   426: aload_1
    //   427: invokevirtual 462	java/io/InputStreamReader:close	()V
    //   430: goto -204 -> 226
    //   433: aload 7
    //   435: ifnull +13 -> 448
    //   438: aload_1
    //   439: astore_2
    //   440: aload_1
    //   441: astore 6
    //   443: aload 7
    //   445: invokevirtual 469	java/io/BufferedReader:close	()V
    //   448: aload_1
    //   449: ifnull +12 -> 461
    //   452: aload_1
    //   453: astore_2
    //   454: aload_1
    //   455: astore 6
    //   457: aload_1
    //   458: invokevirtual 462	java/io/InputStreamReader:close	()V
    //   461: aload_1
    //   462: astore_2
    //   463: aload_1
    //   464: astore 6
    //   466: aload 5
    //   468: athrow
    //   469: astore_1
    //   470: aconst_null
    //   471: areturn
    //   472: astore_2
    //   473: goto -154 -> 319
    //   476: astore_1
    //   477: aconst_null
    //   478: astore 4
    //   480: aconst_null
    //   481: astore_2
    //   482: goto -181 -> 301
    //   485: astore_1
    //   486: aconst_null
    //   487: astore_2
    //   488: goto -187 -> 301
    //   491: astore 5
    //   493: aload_1
    //   494: astore_2
    //   495: aload 5
    //   497: astore_1
    //   498: goto -197 -> 301
    //   501: astore_1
    //   502: aconst_null
    //   503: astore_2
    //   504: aload 5
    //   506: astore_1
    //   507: goto -247 -> 260
    //   510: astore_1
    //   511: aload 4
    //   513: astore_2
    //   514: aload 5
    //   516: astore_1
    //   517: goto -257 -> 260
    //   520: astore_1
    //   521: goto -282 -> 239
    //   524: astore 5
    //   526: aconst_null
    //   527: astore 7
    //   529: goto -96 -> 433
    //   532: astore 5
    //   534: goto -101 -> 433
    //   537: astore_1
    //   538: aconst_null
    //   539: astore_2
    //   540: aload 6
    //   542: astore_1
    //   543: goto -157 -> 386
    //   546: astore_2
    //   547: aconst_null
    //   548: astore_2
    //   549: goto -163 -> 386
    //   552: goto -326 -> 226
    //   555: astore_1
    //   556: aload 6
    //   558: astore_1
    //   559: aload 4
    //   561: astore_2
    //   562: goto -302 -> 260
    //   565: astore 5
    //   567: aconst_null
    //   568: astore 7
    //   570: aconst_null
    //   571: astore_1
    //   572: goto -139 -> 433
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	575	0	this	d
    //   0	575	1	paramString	String
    //   0	575	2	paramb	b
    //   37	12	3	k	int
    //   39	521	4	localObject1	Object
    //   7	212	5	localObject2	Object
    //   283	5	5	localOutOfMemoryError	OutOfMemoryError
    //   391	76	5	str1	String
    //   491	24	5	localObject3	Object
    //   524	1	5	localObject4	Object
    //   532	1	5	localObject5	Object
    //   565	1	5	localObject6	Object
    //   1	200	6	str2	String
    //   244	5	6	localException	Exception
    //   414	143	6	str3	String
    //   4	565	7	localBufferedReader	java.io.BufferedReader
    // Exception table:
    //   from	to	target	type
    //   198	211	244	java/lang/Exception
    //   189	196	256	java/lang/Exception
    //   213	226	256	java/lang/Exception
    //   248	253	256	java/lang/Exception
    //   287	292	256	java/lang/Exception
    //   294	297	256	java/lang/Exception
    //   264	268	279	java/lang/Exception
    //   272	276	279	java/lang/Exception
    //   213	226	283	java/lang/OutOfMemoryError
    //   189	196	300	finally
    //   198	211	300	finally
    //   213	226	300	finally
    //   248	253	300	finally
    //   287	292	300	finally
    //   294	297	300	finally
    //   416	421	300	finally
    //   426	430	300	finally
    //   443	448	300	finally
    //   457	461	300	finally
    //   466	469	300	finally
    //   344	350	382	java/lang/Exception
    //   354	379	382	java/lang/Exception
    //   153	158	469	java/lang/Exception
    //   305	309	472	java/lang/Exception
    //   314	319	472	java/lang/Exception
    //   64	74	476	finally
    //   78	94	485	finally
    //   98	105	485	finally
    //   109	115	485	finally
    //   119	125	485	finally
    //   129	148	485	finally
    //   164	170	485	finally
    //   177	187	485	finally
    //   393	397	491	finally
    //   404	408	491	finally
    //   64	74	501	java/lang/Exception
    //   78	94	510	java/lang/Exception
    //   98	105	510	java/lang/Exception
    //   109	115	510	java/lang/Exception
    //   119	125	510	java/lang/Exception
    //   129	148	510	java/lang/Exception
    //   164	170	510	java/lang/Exception
    //   177	187	510	java/lang/Exception
    //   393	397	510	java/lang/Exception
    //   404	408	510	java/lang/Exception
    //   230	234	520	java/lang/Exception
    //   234	239	520	java/lang/Exception
    //   331	344	524	finally
    //   344	350	532	finally
    //   354	379	532	finally
    //   321	331	537	java/lang/Exception
    //   331	344	546	java/lang/Exception
    //   416	421	555	java/lang/Exception
    //   426	430	555	java/lang/Exception
    //   443	448	555	java/lang/Exception
    //   457	461	555	java/lang/Exception
    //   466	469	555	java/lang/Exception
    //   321	331	565	finally
  }
  
  public final String[] b(int paramInt, b paramb)
  {
    this.i[0] = "";
    String[] arrayOfString = this.i;
    String str = a(paramb, paramInt);
    paramb = str;
    if (str != null)
    {
      paramb = str;
      if (str.length() > 0)
      {
        paramb = str.replaceAll("\n", "</p></p>");
        paramb = "<p>" + paramb + "</p>";
      }
    }
    arrayOfString[1] = paramb;
    return this.i;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */