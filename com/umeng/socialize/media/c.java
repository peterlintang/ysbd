package com.umeng.socialize.media;

import android.graphics.Bitmap;

class c
  implements Runnable
{
  c(UMImage paramUMImage, Bitmap paramBitmap1, Bitmap paramBitmap2) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 15	com/umeng/socialize/media/c:a	Lcom/umeng/socialize/media/UMImage;
    //   4: aload_0
    //   5: getfield 17	com/umeng/socialize/media/c:b	Landroid/graphics/Bitmap;
    //   8: invokevirtual 32	java/lang/Object:toString	()Ljava/lang/String;
    //   11: invokestatic 37	com/umeng/socom/b/g:a	(Ljava/lang/String;)Ljava/lang/String;
    //   14: invokestatic 42	com/umeng/socialize/media/UMImage:a	(Lcom/umeng/socialize/media/UMImage;Ljava/lang/String;)Ljava/io/File;
    //   17: astore_3
    //   18: new 44	java/io/FileOutputStream
    //   21: dup
    //   22: aload_3
    //   23: invokespecial 47	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   26: astore_2
    //   27: aload_2
    //   28: astore_1
    //   29: aload_0
    //   30: getfield 19	com/umeng/socialize/media/c:c	Landroid/graphics/Bitmap;
    //   33: getstatic 53	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   36: bipush 100
    //   38: aload_2
    //   39: invokevirtual 59	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   42: pop
    //   43: aload_2
    //   44: astore_1
    //   45: aload_0
    //   46: getfield 15	com/umeng/socialize/media/c:a	Lcom/umeng/socialize/media/UMImage;
    //   49: aload_3
    //   50: invokestatic 62	com/umeng/socialize/media/UMImage:a	(Lcom/umeng/socialize/media/UMImage;Ljava/io/File;)V
    //   53: aload_2
    //   54: astore_1
    //   55: aload_0
    //   56: getfield 15	com/umeng/socialize/media/c:a	Lcom/umeng/socialize/media/UMImage;
    //   59: getstatic 67	com/umeng/socialize/media/UMImage$a:a	Lcom/umeng/socialize/media/UMImage$a;
    //   62: invokestatic 70	com/umeng/socialize/media/UMImage:a	(Lcom/umeng/socialize/media/UMImage;Lcom/umeng/socialize/media/UMImage$a;)V
    //   65: aload_2
    //   66: astore_1
    //   67: invokestatic 72	com/umeng/socialize/media/UMImage:a	()Ljava/lang/String;
    //   70: pop
    //   71: aload_2
    //   72: astore_1
    //   73: new 74	java/lang/StringBuilder
    //   76: dup
    //   77: ldc 76
    //   79: invokespecial 79	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   82: aload_3
    //   83: invokevirtual 84	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   86: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: pop
    //   93: aload_0
    //   94: getfield 15	com/umeng/socialize/media/c:a	Lcom/umeng/socialize/media/UMImage;
    //   97: aconst_null
    //   98: invokestatic 92	com/umeng/socialize/media/UMImage:a	(Lcom/umeng/socialize/media/UMImage;[B)V
    //   101: aload_2
    //   102: invokevirtual 97	java/io/OutputStream:close	()V
    //   105: return
    //   106: astore_3
    //   107: aconst_null
    //   108: astore_2
    //   109: aload_2
    //   110: astore_1
    //   111: invokestatic 72	com/umeng/socialize/media/UMImage:a	()Ljava/lang/String;
    //   114: pop
    //   115: aload_2
    //   116: astore_1
    //   117: new 74	java/lang/StringBuilder
    //   120: dup
    //   121: ldc 99
    //   123: invokespecial 79	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   126: aload_3
    //   127: invokevirtual 100	java/lang/Exception:toString	()Ljava/lang/String;
    //   130: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: ldc 102
    //   135: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: pop
    //   142: aload_0
    //   143: getfield 15	com/umeng/socialize/media/c:a	Lcom/umeng/socialize/media/UMImage;
    //   146: aconst_null
    //   147: invokestatic 92	com/umeng/socialize/media/UMImage:a	(Lcom/umeng/socialize/media/UMImage;[B)V
    //   150: aload_2
    //   151: ifnull -46 -> 105
    //   154: aload_2
    //   155: invokevirtual 97	java/io/OutputStream:close	()V
    //   158: return
    //   159: astore_1
    //   160: return
    //   161: astore_2
    //   162: aconst_null
    //   163: astore_1
    //   164: aload_0
    //   165: getfield 15	com/umeng/socialize/media/c:a	Lcom/umeng/socialize/media/UMImage;
    //   168: aconst_null
    //   169: invokestatic 92	com/umeng/socialize/media/UMImage:a	(Lcom/umeng/socialize/media/UMImage;[B)V
    //   172: aload_1
    //   173: ifnull +7 -> 180
    //   176: aload_1
    //   177: invokevirtual 97	java/io/OutputStream:close	()V
    //   180: aload_2
    //   181: athrow
    //   182: astore_1
    //   183: goto -3 -> 180
    //   186: astore_1
    //   187: return
    //   188: astore_2
    //   189: goto -25 -> 164
    //   192: astore_3
    //   193: goto -84 -> 109
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	c
    //   28	89	1	localFileOutputStream1	java.io.FileOutputStream
    //   159	1	1	localIOException1	java.io.IOException
    //   163	14	1	localObject1	Object
    //   182	1	1	localIOException2	java.io.IOException
    //   186	1	1	localIOException3	java.io.IOException
    //   26	129	2	localFileOutputStream2	java.io.FileOutputStream
    //   161	20	2	localObject2	Object
    //   188	1	2	localObject3	Object
    //   17	66	3	localFile	java.io.File
    //   106	21	3	localException1	Exception
    //   192	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   0	27	106	java/lang/Exception
    //   154	158	159	java/io/IOException
    //   0	27	161	finally
    //   176	180	182	java/io/IOException
    //   101	105	186	java/io/IOException
    //   29	43	188	finally
    //   45	53	188	finally
    //   55	65	188	finally
    //   67	71	188	finally
    //   73	93	188	finally
    //   111	115	188	finally
    //   117	142	188	finally
    //   29	43	192	java/lang/Exception
    //   45	53	192	java/lang/Exception
    //   55	65	192	java/lang/Exception
    //   67	71	192	java/lang/Exception
    //   73	93	192	java/lang/Exception
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */