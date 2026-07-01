package com.taobao.munion.filecache;

import java.io.File;

public class b
{
  public static boolean a(String paramString)
  {
    return new File(paramString).exists();
  }
  
  /* Error */
  public static boolean a(String paramString, java.nio.ByteBuffer paramByteBuffer)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 9
    //   3: aconst_null
    //   4: astore_2
    //   5: aconst_null
    //   6: astore 4
    //   8: aconst_null
    //   9: astore 8
    //   11: aconst_null
    //   12: astore 6
    //   14: aconst_null
    //   15: astore 5
    //   17: new 13	java/io/File
    //   20: dup
    //   21: aload_0
    //   22: invokespecial 16	java/io/File:<init>	(Ljava/lang/String;)V
    //   25: astore 7
    //   27: aload 7
    //   29: invokevirtual 20	java/io/File:exists	()Z
    //   32: ifne +18 -> 50
    //   35: aload 7
    //   37: invokevirtual 29	java/io/File:getParentFile	()Ljava/io/File;
    //   40: invokevirtual 32	java/io/File:mkdirs	()Z
    //   43: pop
    //   44: aload 7
    //   46: invokevirtual 35	java/io/File:createNewFile	()Z
    //   49: pop
    //   50: new 37	java/io/FileOutputStream
    //   53: dup
    //   54: aload_0
    //   55: invokespecial 38	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   58: astore_3
    //   59: aload 9
    //   61: astore_0
    //   62: aload_3
    //   63: astore_2
    //   64: aload 8
    //   66: astore 4
    //   68: aload 6
    //   70: astore 5
    //   72: aload_3
    //   73: invokevirtual 42	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   76: astore 6
    //   78: aload 6
    //   80: astore_0
    //   81: aload_3
    //   82: astore_2
    //   83: aload 6
    //   85: astore 4
    //   87: aload 6
    //   89: astore 5
    //   91: aload_1
    //   92: iconst_0
    //   93: invokevirtual 48	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   96: pop
    //   97: aload 6
    //   99: astore_0
    //   100: aload_3
    //   101: astore_2
    //   102: aload 6
    //   104: astore 4
    //   106: aload 6
    //   108: astore 5
    //   110: aload 6
    //   112: aload_1
    //   113: invokevirtual 54	java/nio/channels/FileChannel:write	(Ljava/nio/ByteBuffer;)I
    //   116: pop
    //   117: aload 6
    //   119: astore_0
    //   120: aload_3
    //   121: astore_2
    //   122: aload 6
    //   124: astore 4
    //   126: aload 6
    //   128: astore 5
    //   130: aload 6
    //   132: iconst_1
    //   133: invokevirtual 58	java/nio/channels/FileChannel:force	(Z)V
    //   136: aload_3
    //   137: invokevirtual 61	java/io/FileOutputStream:close	()V
    //   140: aload 6
    //   142: ifnull +8 -> 150
    //   145: aload 6
    //   147: invokevirtual 62	java/nio/channels/FileChannel:close	()V
    //   150: iconst_1
    //   151: ireturn
    //   152: astore_0
    //   153: aload_0
    //   154: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   157: goto -17 -> 140
    //   160: astore_0
    //   161: aload_0
    //   162: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   165: iconst_1
    //   166: ireturn
    //   167: astore 4
    //   169: aconst_null
    //   170: astore 7
    //   172: aconst_null
    //   173: astore_1
    //   174: aload 5
    //   176: astore_0
    //   177: aload_1
    //   178: astore_2
    //   179: aload 4
    //   181: invokevirtual 69	java/io/IOException:getMessage	()Ljava/lang/String;
    //   184: astore_3
    //   185: aload_3
    //   186: ifnull +55 -> 241
    //   189: aload 5
    //   191: astore_0
    //   192: aload_1
    //   193: astore_2
    //   194: aload_3
    //   195: ldc 71
    //   197: invokevirtual 77	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   200: ifeq +41 -> 241
    //   203: aload 5
    //   205: astore_0
    //   206: aload_1
    //   207: astore_2
    //   208: new 79	com/taobao/munion/filecache/l
    //   211: dup
    //   212: ldc 81
    //   214: invokespecial 82	com/taobao/munion/filecache/l:<init>	(Ljava/lang/String;)V
    //   217: athrow
    //   218: astore_3
    //   219: aload_0
    //   220: astore_1
    //   221: aload_3
    //   222: astore_0
    //   223: aload_2
    //   224: ifnull +7 -> 231
    //   227: aload_2
    //   228: invokevirtual 61	java/io/FileOutputStream:close	()V
    //   231: aload_1
    //   232: ifnull +7 -> 239
    //   235: aload_1
    //   236: invokevirtual 62	java/nio/channels/FileChannel:close	()V
    //   239: aload_0
    //   240: athrow
    //   241: aload 7
    //   243: ifnull +14 -> 257
    //   246: aload 5
    //   248: astore_0
    //   249: aload_1
    //   250: astore_2
    //   251: aload 7
    //   253: invokevirtual 85	java/io/File:delete	()Z
    //   256: pop
    //   257: aload 5
    //   259: astore_0
    //   260: aload_1
    //   261: astore_2
    //   262: aload 4
    //   264: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   267: aload_1
    //   268: ifnull +7 -> 275
    //   271: aload_1
    //   272: invokevirtual 61	java/io/FileOutputStream:close	()V
    //   275: aload 5
    //   277: ifnull +8 -> 285
    //   280: aload 5
    //   282: invokevirtual 62	java/nio/channels/FileChannel:close	()V
    //   285: iconst_0
    //   286: ireturn
    //   287: astore_0
    //   288: aload_0
    //   289: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   292: goto -17 -> 275
    //   295: astore_0
    //   296: aload_0
    //   297: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   300: goto -15 -> 285
    //   303: astore 5
    //   305: aconst_null
    //   306: astore 7
    //   308: aconst_null
    //   309: astore_1
    //   310: aload 4
    //   312: astore_0
    //   313: aload_1
    //   314: astore_2
    //   315: aload 5
    //   317: invokevirtual 86	java/lang/Exception:printStackTrace	()V
    //   320: aload 7
    //   322: ifnull +14 -> 336
    //   325: aload 4
    //   327: astore_0
    //   328: aload_1
    //   329: astore_2
    //   330: aload 7
    //   332: invokevirtual 85	java/io/File:delete	()Z
    //   335: pop
    //   336: aload_1
    //   337: ifnull +7 -> 344
    //   340: aload_1
    //   341: invokevirtual 61	java/io/FileOutputStream:close	()V
    //   344: aload 4
    //   346: ifnull +8 -> 354
    //   349: aload 4
    //   351: invokevirtual 62	java/nio/channels/FileChannel:close	()V
    //   354: iconst_0
    //   355: ireturn
    //   356: astore_0
    //   357: aload_0
    //   358: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   361: goto -17 -> 344
    //   364: astore_0
    //   365: aload_0
    //   366: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   369: goto -15 -> 354
    //   372: astore_2
    //   373: aload_2
    //   374: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   377: goto -146 -> 231
    //   380: astore_1
    //   381: aload_1
    //   382: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   385: goto -146 -> 239
    //   388: astore_0
    //   389: aconst_null
    //   390: astore_3
    //   391: aload_2
    //   392: astore_1
    //   393: aload_3
    //   394: astore_2
    //   395: goto -172 -> 223
    //   398: astore 5
    //   400: aconst_null
    //   401: astore_1
    //   402: goto -92 -> 310
    //   405: astore 5
    //   407: aload_3
    //   408: astore_1
    //   409: goto -99 -> 310
    //   412: astore 4
    //   414: aconst_null
    //   415: astore_1
    //   416: goto -242 -> 174
    //   419: astore 4
    //   421: aload_3
    //   422: astore_1
    //   423: goto -249 -> 174
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	426	0	paramString	String
    //   0	426	1	paramByteBuffer	java.nio.ByteBuffer
    //   4	326	2	localObject1	Object
    //   372	20	2	localIOException1	java.io.IOException
    //   394	1	2	localObject2	Object
    //   58	137	3	localObject3	Object
    //   218	4	3	localObject4	Object
    //   390	32	3	localObject5	Object
    //   6	119	4	localObject6	Object
    //   167	183	4	localIOException2	java.io.IOException
    //   412	1	4	localIOException3	java.io.IOException
    //   419	1	4	localIOException4	java.io.IOException
    //   15	266	5	localFileChannel1	java.nio.channels.FileChannel
    //   303	13	5	localException1	Exception
    //   398	1	5	localException2	Exception
    //   405	1	5	localException3	Exception
    //   12	134	6	localFileChannel2	java.nio.channels.FileChannel
    //   25	306	7	localFile	File
    //   9	56	8	localObject7	Object
    //   1	59	9	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   136	140	152	java/io/IOException
    //   145	150	160	java/io/IOException
    //   17	27	167	java/io/IOException
    //   72	78	218	finally
    //   91	97	218	finally
    //   110	117	218	finally
    //   130	136	218	finally
    //   179	185	218	finally
    //   194	203	218	finally
    //   208	218	218	finally
    //   251	257	218	finally
    //   262	267	218	finally
    //   315	320	218	finally
    //   330	336	218	finally
    //   271	275	287	java/io/IOException
    //   280	285	295	java/io/IOException
    //   17	27	303	java/lang/Exception
    //   340	344	356	java/io/IOException
    //   349	354	364	java/io/IOException
    //   227	231	372	java/io/IOException
    //   235	239	380	java/io/IOException
    //   17	27	388	finally
    //   27	50	388	finally
    //   50	59	388	finally
    //   27	50	398	java/lang/Exception
    //   50	59	398	java/lang/Exception
    //   72	78	405	java/lang/Exception
    //   91	97	405	java/lang/Exception
    //   110	117	405	java/lang/Exception
    //   130	136	405	java/lang/Exception
    //   27	50	412	java/io/IOException
    //   50	59	412	java/io/IOException
    //   72	78	419	java/io/IOException
    //   91	97	419	java/io/IOException
    //   110	117	419	java/io/IOException
    //   130	136	419	java/io/IOException
  }
  
  /* Error */
  public static byte[] b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: new 90	java/io/FileInputStream
    //   6: dup
    //   7: aload_0
    //   8: invokespecial 91	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   11: astore_1
    //   12: aload_1
    //   13: invokevirtual 92	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   16: astore_0
    //   17: aload_0
    //   18: astore_3
    //   19: aload_1
    //   20: astore_2
    //   21: aload_0
    //   22: invokevirtual 96	java/nio/channels/FileChannel:size	()J
    //   25: l2i
    //   26: invokestatic 100	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   29: astore 4
    //   31: aload_0
    //   32: astore_3
    //   33: aload_1
    //   34: astore_2
    //   35: aload_0
    //   36: aload 4
    //   38: invokevirtual 103	java/nio/channels/FileChannel:read	(Ljava/nio/ByteBuffer;)I
    //   41: pop
    //   42: aload_0
    //   43: astore_3
    //   44: aload_1
    //   45: astore_2
    //   46: aload 4
    //   48: invokevirtual 107	java/nio/ByteBuffer:array	()[B
    //   51: astore 4
    //   53: aload 4
    //   55: astore_2
    //   56: aload_1
    //   57: invokevirtual 108	java/io/FileInputStream:close	()V
    //   60: aload_2
    //   61: astore_1
    //   62: aload_0
    //   63: ifnull +9 -> 72
    //   66: aload_0
    //   67: invokevirtual 62	java/nio/channels/FileChannel:close	()V
    //   70: aload_2
    //   71: astore_1
    //   72: aload_1
    //   73: areturn
    //   74: astore_1
    //   75: aload_1
    //   76: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   79: goto -19 -> 60
    //   82: astore_0
    //   83: aload_0
    //   84: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   87: aload_2
    //   88: areturn
    //   89: astore 4
    //   91: aconst_null
    //   92: astore_0
    //   93: aconst_null
    //   94: astore_1
    //   95: aload_0
    //   96: astore_3
    //   97: aload_1
    //   98: astore_2
    //   99: aload 4
    //   101: invokevirtual 86	java/lang/Exception:printStackTrace	()V
    //   104: aload_1
    //   105: ifnull +7 -> 112
    //   108: aload_1
    //   109: invokevirtual 108	java/io/FileInputStream:close	()V
    //   112: aload 5
    //   114: astore_1
    //   115: aload_0
    //   116: ifnull -44 -> 72
    //   119: aload_0
    //   120: invokevirtual 62	java/nio/channels/FileChannel:close	()V
    //   123: aconst_null
    //   124: areturn
    //   125: astore_0
    //   126: aload_0
    //   127: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   130: aconst_null
    //   131: areturn
    //   132: astore_1
    //   133: aload_1
    //   134: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   137: goto -25 -> 112
    //   140: astore_0
    //   141: aconst_null
    //   142: astore_3
    //   143: aconst_null
    //   144: astore_1
    //   145: aload_1
    //   146: ifnull +7 -> 153
    //   149: aload_1
    //   150: invokevirtual 108	java/io/FileInputStream:close	()V
    //   153: aload_3
    //   154: ifnull +7 -> 161
    //   157: aload_3
    //   158: invokevirtual 62	java/nio/channels/FileChannel:close	()V
    //   161: aload_0
    //   162: athrow
    //   163: astore_1
    //   164: aload_1
    //   165: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   168: goto -15 -> 153
    //   171: astore_1
    //   172: aload_1
    //   173: invokevirtual 65	java/io/IOException:printStackTrace	()V
    //   176: goto -15 -> 161
    //   179: astore_0
    //   180: aconst_null
    //   181: astore_3
    //   182: goto -37 -> 145
    //   185: astore_0
    //   186: aload_2
    //   187: astore_1
    //   188: goto -43 -> 145
    //   191: astore 4
    //   193: aconst_null
    //   194: astore_0
    //   195: goto -100 -> 95
    //   198: astore 4
    //   200: goto -105 -> 95
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	203	0	paramString	String
    //   11	62	1	localObject1	Object
    //   74	2	1	localIOException1	java.io.IOException
    //   94	21	1	localObject2	Object
    //   132	2	1	localIOException2	java.io.IOException
    //   144	6	1	localObject3	Object
    //   163	2	1	localIOException3	java.io.IOException
    //   171	2	1	localIOException4	java.io.IOException
    //   187	1	1	localObject4	Object
    //   20	167	2	localObject5	Object
    //   18	164	3	str	String
    //   29	25	4	localObject6	Object
    //   89	11	4	localException1	Exception
    //   191	1	4	localException2	Exception
    //   198	1	4	localException3	Exception
    //   1	112	5	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   56	60	74	java/io/IOException
    //   66	70	82	java/io/IOException
    //   3	12	89	java/lang/Exception
    //   119	123	125	java/io/IOException
    //   108	112	132	java/io/IOException
    //   3	12	140	finally
    //   149	153	163	java/io/IOException
    //   157	161	171	java/io/IOException
    //   12	17	179	finally
    //   21	31	185	finally
    //   35	42	185	finally
    //   46	53	185	finally
    //   99	104	185	finally
    //   12	17	191	java/lang/Exception
    //   21	31	198	java/lang/Exception
    //   35	42	198	java/lang/Exception
    //   46	53	198	java/lang/Exception
  }
  
  public static boolean c(String paramString)
  {
    return new File(paramString).delete();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\filecache\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */