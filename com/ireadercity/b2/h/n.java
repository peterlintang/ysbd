package com.ireadercity.b2.h;

public final class n
{
  private static int a = 4096;
  
  /* Error */
  public static java.io.File a(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 18	java/io/File
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 22	java/io/File:<init>	(Ljava/lang/String;)V
    //   10: astore_3
    //   11: aload_3
    //   12: invokevirtual 26	java/io/File:createNewFile	()Z
    //   15: pop
    //   16: new 28	java/io/FileOutputStream
    //   19: dup
    //   20: aload_3
    //   21: invokespecial 31	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   24: astore_0
    //   25: aload_0
    //   26: astore_2
    //   27: aload_0
    //   28: aload_1
    //   29: invokevirtual 37	java/io/OutputStream:write	([B)V
    //   32: aload_0
    //   33: astore_2
    //   34: aload_0
    //   35: invokevirtual 40	java/io/OutputStream:flush	()V
    //   38: aload_0
    //   39: invokevirtual 43	java/io/OutputStream:close	()V
    //   42: aload_3
    //   43: areturn
    //   44: astore_0
    //   45: aload_0
    //   46: invokevirtual 46	java/io/IOException:printStackTrace	()V
    //   49: aload_3
    //   50: areturn
    //   51: astore_1
    //   52: aconst_null
    //   53: astore_0
    //   54: aconst_null
    //   55: astore_3
    //   56: aload_0
    //   57: astore_2
    //   58: aload_1
    //   59: invokevirtual 47	java/lang/Exception:printStackTrace	()V
    //   62: aload_0
    //   63: invokevirtual 43	java/io/OutputStream:close	()V
    //   66: aload_3
    //   67: areturn
    //   68: astore_0
    //   69: aload_0
    //   70: invokevirtual 46	java/io/IOException:printStackTrace	()V
    //   73: aload_3
    //   74: areturn
    //   75: astore_0
    //   76: aload_2
    //   77: astore_1
    //   78: aload_1
    //   79: invokevirtual 43	java/io/OutputStream:close	()V
    //   82: aload_0
    //   83: athrow
    //   84: astore_1
    //   85: aload_1
    //   86: invokevirtual 46	java/io/IOException:printStackTrace	()V
    //   89: goto -7 -> 82
    //   92: astore_0
    //   93: aload_2
    //   94: astore_1
    //   95: goto -17 -> 78
    //   98: astore_1
    //   99: aconst_null
    //   100: astore_0
    //   101: goto -45 -> 56
    //   104: astore_1
    //   105: goto -49 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	paramString	String
    //   0	108	1	paramArrayOfByte	byte[]
    //   1	93	2	str	String
    //   10	64	3	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   38	42	44	java/io/IOException
    //   2	16	51	java/lang/Exception
    //   62	66	68	java/io/IOException
    //   2	16	75	finally
    //   16	25	75	finally
    //   78	82	84	java/io/IOException
    //   27	32	92	finally
    //   34	38	92	finally
    //   58	62	92	finally
    //   16	25	98	java/lang/Exception
    //   27	32	104	java/lang/Exception
    //   34	38	104	java/lang/Exception
  }
  
  /* Error */
  public static void a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 54	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aconst_null
    //   10: astore 7
    //   12: aconst_null
    //   13: astore 8
    //   15: aconst_null
    //   16: astore 9
    //   18: aload 8
    //   20: astore 6
    //   22: new 18	java/io/File
    //   25: dup
    //   26: aload_0
    //   27: invokespecial 22	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: astore 10
    //   32: lconst_0
    //   33: lstore 4
    //   35: aload 8
    //   37: astore 6
    //   39: aload 10
    //   41: invokevirtual 57	java/io/File:exists	()Z
    //   44: ifeq +194 -> 238
    //   47: aload 8
    //   49: astore 6
    //   51: new 59	java/io/FileInputStream
    //   54: dup
    //   55: aload 10
    //   57: invokespecial 60	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   60: astore 11
    //   62: aload 8
    //   64: astore 6
    //   66: aload 11
    //   68: invokevirtual 64	java/io/FileInputStream:available	()I
    //   71: i2l
    //   72: lstore 4
    //   74: aload 8
    //   76: astore 6
    //   78: aload 11
    //   80: invokevirtual 65	java/io/FileInputStream:close	()V
    //   83: ldc2_w 66
    //   86: lload 4
    //   88: lcmp
    //   89: ifge +196 -> 285
    //   92: aload 8
    //   94: astore 6
    //   96: new 69	android/graphics/BitmapFactory$Options
    //   99: dup
    //   100: invokespecial 71	android/graphics/BitmapFactory$Options:<init>	()V
    //   103: astore 10
    //   105: aload 8
    //   107: astore 6
    //   109: aload 10
    //   111: iconst_4
    //   112: putfield 74	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   115: aload 8
    //   117: astore 6
    //   119: aload_0
    //   120: aload 10
    //   122: invokestatic 80	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   125: astore 10
    //   127: aload 8
    //   129: astore 6
    //   131: aload 10
    //   133: invokevirtual 85	android/graphics/Bitmap:getWidth	()I
    //   136: istore_2
    //   137: aload 8
    //   139: astore 6
    //   141: aload 10
    //   143: invokevirtual 88	android/graphics/Bitmap:getHeight	()I
    //   146: istore_3
    //   147: aload 8
    //   149: astore 6
    //   151: aload 10
    //   153: iload_2
    //   154: iconst_2
    //   155: idiv
    //   156: iload_3
    //   157: iconst_2
    //   158: idiv
    //   159: iconst_0
    //   160: invokestatic 92	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   163: astore_0
    //   164: aload 8
    //   166: astore 6
    //   168: aload 10
    //   170: invokevirtual 95	android/graphics/Bitmap:recycle	()V
    //   173: aload 8
    //   175: astore 6
    //   177: new 97	java/io/BufferedOutputStream
    //   180: dup
    //   181: new 28	java/io/FileOutputStream
    //   184: dup
    //   185: aload_1
    //   186: invokespecial 98	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   189: invokespecial 101	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   192: astore_1
    //   193: aload 8
    //   195: astore 6
    //   197: aload_0
    //   198: getstatic 107	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   201: bipush 80
    //   203: aload_1
    //   204: invokevirtual 111	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   207: pop
    //   208: aload 8
    //   210: astore 6
    //   212: aload_1
    //   213: invokevirtual 112	java/io/BufferedOutputStream:flush	()V
    //   216: aload 8
    //   218: astore 6
    //   220: aload_1
    //   221: invokevirtual 113	java/io/BufferedOutputStream:close	()V
    //   224: aload 9
    //   226: astore_0
    //   227: aload_0
    //   228: ifnull -220 -> 8
    //   231: aload_0
    //   232: invokevirtual 116	java/io/InputStream:close	()V
    //   235: return
    //   236: astore_0
    //   237: return
    //   238: aload 8
    //   240: astore 6
    //   242: aload 10
    //   244: invokevirtual 26	java/io/File:createNewFile	()Z
    //   247: pop
    //   248: aload 8
    //   250: astore 6
    //   252: getstatic 122	java/lang/System:out	Ljava/io/PrintStream;
    //   255: ldc 124
    //   257: invokevirtual 129	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   260: goto -177 -> 83
    //   263: astore_1
    //   264: aload 7
    //   266: astore_0
    //   267: aload_0
    //   268: astore 6
    //   270: aload_1
    //   271: invokevirtual 47	java/lang/Exception:printStackTrace	()V
    //   274: aload_0
    //   275: ifnull -267 -> 8
    //   278: aload_0
    //   279: invokevirtual 116	java/io/InputStream:close	()V
    //   282: return
    //   283: astore_0
    //   284: return
    //   285: aload 8
    //   287: astore 6
    //   289: new 18	java/io/File
    //   292: dup
    //   293: aload_1
    //   294: invokespecial 22	java/io/File:<init>	(Ljava/lang/String;)V
    //   297: astore_1
    //   298: aload 8
    //   300: astore 6
    //   302: new 59	java/io/FileInputStream
    //   305: dup
    //   306: aload 10
    //   308: invokespecial 60	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   311: astore_0
    //   312: new 28	java/io/FileOutputStream
    //   315: dup
    //   316: aload_1
    //   317: invokespecial 31	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   320: astore_1
    //   321: sipush 4096
    //   324: newarray <illegal type>
    //   326: astore 6
    //   328: aload_0
    //   329: aload 6
    //   331: invokevirtual 133	java/io/InputStream:read	([B)I
    //   334: istore_2
    //   335: iload_2
    //   336: ifle +14 -> 350
    //   339: aload_1
    //   340: aload 6
    //   342: iconst_0
    //   343: iload_2
    //   344: invokevirtual 136	java/io/OutputStream:write	([BII)V
    //   347: goto -19 -> 328
    //   350: aload_1
    //   351: invokevirtual 43	java/io/OutputStream:close	()V
    //   354: goto -127 -> 227
    //   357: astore_0
    //   358: aload 6
    //   360: ifnull +8 -> 368
    //   363: aload 6
    //   365: invokevirtual 116	java/io/InputStream:close	()V
    //   368: aload_0
    //   369: athrow
    //   370: astore_1
    //   371: goto -3 -> 368
    //   374: astore_1
    //   375: aload_0
    //   376: astore 6
    //   378: aload_1
    //   379: astore_0
    //   380: goto -22 -> 358
    //   383: astore_1
    //   384: goto -117 -> 267
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	387	0	paramString1	String
    //   0	387	1	paramString2	String
    //   136	208	2	i	int
    //   146	13	3	j	int
    //   33	54	4	l	long
    //   20	357	6	localObject1	Object
    //   10	255	7	localObject2	Object
    //   13	286	8	localObject3	Object
    //   16	209	9	localObject4	Object
    //   30	277	10	localObject5	Object
    //   60	19	11	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   231	235	236	java/lang/Exception
    //   22	32	263	java/lang/Exception
    //   39	47	263	java/lang/Exception
    //   51	62	263	java/lang/Exception
    //   66	74	263	java/lang/Exception
    //   78	83	263	java/lang/Exception
    //   96	105	263	java/lang/Exception
    //   109	115	263	java/lang/Exception
    //   119	127	263	java/lang/Exception
    //   131	137	263	java/lang/Exception
    //   141	147	263	java/lang/Exception
    //   151	164	263	java/lang/Exception
    //   168	173	263	java/lang/Exception
    //   177	193	263	java/lang/Exception
    //   197	208	263	java/lang/Exception
    //   212	216	263	java/lang/Exception
    //   220	224	263	java/lang/Exception
    //   242	248	263	java/lang/Exception
    //   252	260	263	java/lang/Exception
    //   289	298	263	java/lang/Exception
    //   302	312	263	java/lang/Exception
    //   278	282	283	java/lang/Exception
    //   22	32	357	finally
    //   39	47	357	finally
    //   51	62	357	finally
    //   66	74	357	finally
    //   78	83	357	finally
    //   96	105	357	finally
    //   109	115	357	finally
    //   119	127	357	finally
    //   131	137	357	finally
    //   141	147	357	finally
    //   151	164	357	finally
    //   168	173	357	finally
    //   177	193	357	finally
    //   197	208	357	finally
    //   212	216	357	finally
    //   220	224	357	finally
    //   242	248	357	finally
    //   252	260	357	finally
    //   270	274	357	finally
    //   289	298	357	finally
    //   302	312	357	finally
    //   363	368	370	java/lang/Exception
    //   312	328	374	finally
    //   328	335	374	finally
    //   339	347	374	finally
    //   350	354	374	finally
    //   312	328	383	java/lang/Exception
    //   328	335	383	java/lang/Exception
    //   339	347	383	java/lang/Exception
    //   350	354	383	java/lang/Exception
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */