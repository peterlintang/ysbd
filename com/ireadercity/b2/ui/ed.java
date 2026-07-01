package com.ireadercity.b2.ui;

import android.os.AsyncTask;

final class ed
  extends AsyncTask<Void, Integer, Boolean>
{
  ed(PDFBrowseActivity paramPDFBrowseActivity) {}
  
  /* Error */
  private Boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   4: getfield 27	com/ireadercity/b2/ui/PDFBrowseActivity:a	Lcom/ireadercity/b2/c/a;
    //   7: aload_0
    //   8: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   11: invokestatic 31	com/ireadercity/b2/ui/PDFBrowseActivity:h	(Lcom/ireadercity/b2/ui/PDFBrowseActivity;)Lcom/ireadercity/b2/bean/b;
    //   14: invokevirtual 37	com/ireadercity/b2/bean/b:j	()Ljava/lang/String;
    //   17: invokevirtual 43	com/ireadercity/b2/c/a:c	(Ljava/lang/String;)Z
    //   20: pop
    //   21: new 45	java/lang/StringBuilder
    //   24: dup
    //   25: ldc 47
    //   27: invokespecial 50	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   30: aload_0
    //   31: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   34: invokestatic 31	com/ireadercity/b2/ui/PDFBrowseActivity:h	(Lcom/ireadercity/b2/ui/PDFBrowseActivity;)Lcom/ireadercity/b2/bean/b;
    //   37: invokevirtual 53	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   40: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: pop
    //   47: aload_0
    //   48: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   51: astore_3
    //   52: aload_0
    //   53: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   56: astore 4
    //   58: aload_3
    //   59: aload_0
    //   60: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   63: invokestatic 31	com/ireadercity/b2/ui/PDFBrowseActivity:h	(Lcom/ireadercity/b2/ui/PDFBrowseActivity;)Lcom/ireadercity/b2/bean/b;
    //   66: invokestatic 63	com/ireadercity/b2/ui/PDFBrowseActivity:a	(Lcom/ireadercity/b2/bean/b;)Ljava/lang/String;
    //   69: invokestatic 66	com/ireadercity/b2/ui/PDFBrowseActivity:a	(Lcom/ireadercity/b2/ui/PDFBrowseActivity;Ljava/lang/String;)Ljava/lang/String;
    //   72: pop
    //   73: aload_0
    //   74: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   77: invokestatic 70	com/ireadercity/b2/ui/PDFBrowseActivity:i	(Lcom/ireadercity/b2/ui/PDFBrowseActivity;)Ljava/lang/String;
    //   80: ifnonnull +8 -> 88
    //   83: iconst_0
    //   84: invokestatic 76	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   87: areturn
    //   88: aload_0
    //   89: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   92: aload_0
    //   93: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   96: invokestatic 80	com/ireadercity/b2/ui/PDFBrowseActivity:g	(Lcom/ireadercity/b2/ui/PDFBrowseActivity;)Lcom/ireadercity/b2/b/n;
    //   99: aload_0
    //   100: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   103: invokestatic 31	com/ireadercity/b2/ui/PDFBrowseActivity:h	(Lcom/ireadercity/b2/ui/PDFBrowseActivity;)Lcom/ireadercity/b2/bean/b;
    //   106: invokevirtual 86	com/ireadercity/b2/b/n:b	(Lcom/ireadercity/b2/bean/b;)Ljava/util/List;
    //   109: invokestatic 89	com/ireadercity/b2/ui/PDFBrowseActivity:a	(Lcom/ireadercity/b2/ui/PDFBrowseActivity;Ljava/util/List;)Ljava/util/List;
    //   112: pop
    //   113: aload_0
    //   114: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   117: invokestatic 93	com/ireadercity/b2/ui/PDFBrowseActivity:e	(Lcom/ireadercity/b2/ui/PDFBrowseActivity;)Ljava/util/List;
    //   120: invokeinterface 99 1 0
    //   125: astore 4
    //   127: iconst_m1
    //   128: istore_1
    //   129: aload 4
    //   131: invokeinterface 105 1 0
    //   136: ifeq +219 -> 355
    //   139: aload 4
    //   141: invokeinterface 109 1 0
    //   146: checkcast 111	java/lang/String
    //   149: astore 5
    //   151: iload_1
    //   152: iconst_1
    //   153: iadd
    //   154: istore_1
    //   155: new 113	java/io/File
    //   158: dup
    //   159: new 45	java/lang/StringBuilder
    //   162: dup
    //   163: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   166: aload 5
    //   168: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: ldc 116
    //   173: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   179: invokespecial 117	java/io/File:<init>	(Ljava/lang/String;)V
    //   182: astore_3
    //   183: aload_3
    //   184: invokevirtual 120	java/io/File:exists	()Z
    //   187: ifeq +48 -> 235
    //   190: aload_3
    //   191: invokevirtual 123	java/io/File:isFile	()Z
    //   194: ifeq +41 -> 235
    //   197: aload_3
    //   198: invokevirtual 127	java/io/File:length	()J
    //   201: lconst_0
    //   202: lcmp
    //   203: ifle +32 -> 235
    //   206: iload_1
    //   207: aload_0
    //   208: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   211: invokestatic 130	com/ireadercity/b2/ui/PDFBrowseActivity:j	(Lcom/ireadercity/b2/ui/PDFBrowseActivity;)I
    //   214: if_icmpne +164 -> 378
    //   217: aload_0
    //   218: iconst_1
    //   219: anewarray 132	java/lang/Integer
    //   222: dup
    //   223: iconst_0
    //   224: iload_1
    //   225: invokestatic 135	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   228: aastore
    //   229: invokevirtual 139	com/ireadercity/b2/ui/ed:publishProgress	([Ljava/lang/Object;)V
    //   232: goto -103 -> 129
    //   235: new 141	java/io/FileInputStream
    //   238: dup
    //   239: aload 5
    //   241: invokespecial 142	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   244: astore_3
    //   245: aload_3
    //   246: invokevirtual 146	java/io/FileInputStream:available	()I
    //   249: istore_2
    //   250: iload_2
    //   251: newarray <illegal type>
    //   253: astore 6
    //   255: aload_3
    //   256: aload 6
    //   258: iconst_0
    //   259: iload_2
    //   260: invokevirtual 150	java/io/FileInputStream:read	([BII)I
    //   263: pop
    //   264: aload 6
    //   266: aload_0
    //   267: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   270: invokestatic 70	com/ireadercity/b2/ui/PDFBrowseActivity:i	(Lcom/ireadercity/b2/ui/PDFBrowseActivity;)Ljava/lang/String;
    //   273: iconst_0
    //   274: bipush 16
    //   276: invokevirtual 154	java/lang/String:substring	(II)Ljava/lang/String;
    //   279: invokestatic 159	com/ireadercity/b2/b/t:b	([BLjava/lang/String;)V
    //   282: new 161	java/io/FileOutputStream
    //   285: dup
    //   286: new 45	java/lang/StringBuilder
    //   289: dup
    //   290: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   293: aload 5
    //   295: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: ldc 116
    //   300: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   306: invokespecial 162	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   309: aload 6
    //   311: invokevirtual 166	java/io/FileOutputStream:write	([B)V
    //   314: goto -185 -> 129
    //   317: astore_3
    //   318: aload_3
    //   319: invokevirtual 169	java/io/FileNotFoundException:printStackTrace	()V
    //   322: aconst_null
    //   323: astore_3
    //   324: goto -79 -> 245
    //   327: astore 6
    //   329: aload 6
    //   331: invokevirtual 170	java/io/IOException:printStackTrace	()V
    //   334: iconst_0
    //   335: istore_2
    //   336: goto -86 -> 250
    //   339: astore_3
    //   340: aload_3
    //   341: invokevirtual 170	java/io/IOException:printStackTrace	()V
    //   344: goto -215 -> 129
    //   347: astore_3
    //   348: aload_3
    //   349: invokevirtual 171	java/lang/Exception:printStackTrace	()V
    //   352: goto -223 -> 129
    //   355: aload_0
    //   356: getfield 11	com/ireadercity/b2/ui/ed:a	Lcom/ireadercity/b2/ui/PDFBrowseActivity;
    //   359: invokestatic 175	com/ireadercity/b2/ui/PDFBrowseActivity:k	(Lcom/ireadercity/b2/ui/PDFBrowseActivity;)Z
    //   362: pop
    //   363: iconst_1
    //   364: invokestatic 76	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   367: areturn
    //   368: astore_3
    //   369: aload_3
    //   370: invokevirtual 171	java/lang/Exception:printStackTrace	()V
    //   373: iconst_0
    //   374: invokestatic 76	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   377: areturn
    //   378: goto -249 -> 129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	381	0	this	ed
    //   128	97	1	i	int
    //   249	87	2	j	int
    //   51	205	3	localObject1	Object
    //   317	2	3	localFileNotFoundException	java.io.FileNotFoundException
    //   323	1	3	localObject2	Object
    //   339	2	3	localIOException1	java.io.IOException
    //   347	2	3	localException1	Exception
    //   368	2	3	localException2	Exception
    //   56	84	4	localObject3	Object
    //   149	145	5	str	String
    //   253	57	6	arrayOfByte	byte[]
    //   327	3	6	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   235	245	317	java/io/FileNotFoundException
    //   245	250	327	java/io/IOException
    //   255	314	339	java/io/IOException
    //   255	314	347	java/lang/Exception
    //   0	88	368	java/lang/Exception
    //   88	127	368	java/lang/Exception
    //   129	151	368	java/lang/Exception
    //   155	232	368	java/lang/Exception
    //   235	245	368	java/lang/Exception
    //   245	250	368	java/lang/Exception
    //   250	255	368	java/lang/Exception
    //   318	322	368	java/lang/Exception
    //   329	334	368	java/lang/Exception
    //   340	344	368	java/lang/Exception
    //   348	352	368	java/lang/Exception
    //   355	363	368	java/lang/Exception
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */