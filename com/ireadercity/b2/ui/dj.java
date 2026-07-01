package com.ireadercity.b2.ui;

import android.os.AsyncTask;
import android.widget.RelativeLayout;

final class dj
  extends AsyncTask<Void, Void, Integer>
{
  String a = "";
  
  dj(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  /* Error */
  private Integer a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   4: new 28	com/ireadercity/b2/b/d
    //   7: dup
    //   8: aload_0
    //   9: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   12: invokevirtual 34	com/ireadercity/b2/ui/BookReadingActivityNew:getApplicationContext	()Landroid/content/Context;
    //   15: invokespecial 37	com/ireadercity/b2/b/d:<init>	(Landroid/content/Context;)V
    //   18: invokestatic 40	com/ireadercity/b2/ui/BookReadingActivityNew:a	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;Lcom/ireadercity/b2/b/d;)Lcom/ireadercity/b2/b/d;
    //   21: pop
    //   22: aload_0
    //   23: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   26: invokestatic 44	com/ireadercity/b2/ui/BookReadingActivityNew:l	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/bean/b;
    //   29: invokevirtual 50	com/ireadercity/b2/bean/b:y	()Z
    //   32: ifeq +336 -> 368
    //   35: aload_0
    //   36: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   39: iconst_0
    //   40: invokestatic 53	com/ireadercity/b2/ui/BookReadingActivityNew:b	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;Z)Z
    //   43: pop
    //   44: aload_0
    //   45: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   48: aload_0
    //   49: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   52: invokestatic 57	com/ireadercity/b2/ui/BookReadingActivityNew:n	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/b/d;
    //   55: aload_0
    //   56: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   59: invokestatic 61	com/ireadercity/b2/ui/BookReadingActivityNew:m	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Ljava/lang/String;
    //   62: aload_0
    //   63: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   66: invokestatic 44	com/ireadercity/b2/ui/BookReadingActivityNew:l	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/bean/b;
    //   69: invokevirtual 64	com/ireadercity/b2/b/d:b	(Ljava/lang/String;Lcom/ireadercity/b2/bean/b;)Ljava/lang/String;
    //   72: invokestatic 67	com/ireadercity/b2/ui/BookReadingActivityNew:a	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;Ljava/lang/String;)Ljava/lang/String;
    //   75: pop
    //   76: new 69	java/io/File
    //   79: dup
    //   80: aload_0
    //   81: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   84: invokestatic 61	com/ireadercity/b2/ui/BookReadingActivityNew:m	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Ljava/lang/String;
    //   87: invokespecial 72	java/io/File:<init>	(Ljava/lang/String;)V
    //   90: invokevirtual 76	java/io/File:getParent	()Ljava/lang/String;
    //   93: astore_2
    //   94: aload_0
    //   95: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   98: invokestatic 79	com/ireadercity/b2/ui/BookReadingActivityNew:o	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Ljava/lang/String;
    //   101: ifnonnull +13 -> 114
    //   104: aload_0
    //   105: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   108: ldc 81
    //   110: invokestatic 67	com/ireadercity/b2/ui/BookReadingActivityNew:a	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;Ljava/lang/String;)Ljava/lang/String;
    //   113: pop
    //   114: aload_0
    //   115: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   118: invokestatic 79	com/ireadercity/b2/ui/BookReadingActivityNew:o	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Ljava/lang/String;
    //   121: pop
    //   122: aload_0
    //   123: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   126: invokestatic 85	com/ireadercity/b2/ui/BookReadingActivityNew:p	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/b/r;
    //   129: ifnull +13 -> 142
    //   132: aload_0
    //   133: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   136: invokestatic 85	com/ireadercity/b2/ui/BookReadingActivityNew:p	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/b/r;
    //   139: invokevirtual 90	com/ireadercity/b2/b/r:f	()V
    //   142: aload_0
    //   143: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   146: astore_3
    //   147: aload_0
    //   148: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   151: invokevirtual 34	com/ireadercity/b2/ui/BookReadingActivityNew:getApplicationContext	()Landroid/content/Context;
    //   154: pop
    //   155: aload_3
    //   156: new 87	com/ireadercity/b2/b/r
    //   159: dup
    //   160: aload_0
    //   161: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   164: invokestatic 94	com/ireadercity/b2/ui/BookReadingActivityNew:q	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Landroid/graphics/Paint;
    //   167: aload_0
    //   168: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   171: invokestatic 79	com/ireadercity/b2/ui/BookReadingActivityNew:o	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Ljava/lang/String;
    //   174: aload_0
    //   175: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   178: invokestatic 98	com/ireadercity/b2/ui/BookReadingActivityNew:r	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Z
    //   181: invokespecial 101	com/ireadercity/b2/b/r:<init>	(Landroid/graphics/Paint;Ljava/lang/String;Z)V
    //   184: invokestatic 104	com/ireadercity/b2/ui/BookReadingActivityNew:a	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;Lcom/ireadercity/b2/b/r;)Lcom/ireadercity/b2/b/r;
    //   187: pop
    //   188: aload_0
    //   189: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   192: invokestatic 85	com/ireadercity/b2/ui/BookReadingActivityNew:p	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/b/r;
    //   195: aload_0
    //   196: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   199: invokevirtual 107	com/ireadercity/b2/b/r:a	(Lcom/ireadercity/b2/b/f;)V
    //   202: aload_0
    //   203: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   206: invokestatic 85	com/ireadercity/b2/ui/BookReadingActivityNew:p	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/b/r;
    //   209: aload_2
    //   210: invokevirtual 109	com/ireadercity/b2/b/r:a	(Ljava/lang/String;)V
    //   213: aload_0
    //   214: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   217: invokestatic 85	com/ireadercity/b2/ui/BookReadingActivityNew:p	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/b/r;
    //   220: invokevirtual 112	com/ireadercity/b2/b/r:e	()V
    //   223: aload_0
    //   224: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   227: aload_0
    //   228: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   231: invokestatic 85	com/ireadercity/b2/ui/BookReadingActivityNew:p	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/b/r;
    //   234: invokevirtual 114	com/ireadercity/b2/b/r:a	()Z
    //   237: invokestatic 53	com/ireadercity/b2/ui/BookReadingActivityNew:b	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;Z)Z
    //   240: pop
    //   241: aload_0
    //   242: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   245: invokestatic 85	com/ireadercity/b2/ui/BookReadingActivityNew:p	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/b/r;
    //   248: invokevirtual 117	com/ireadercity/b2/b/r:d	()V
    //   251: aload_0
    //   252: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   255: invokestatic 85	com/ireadercity/b2/ui/BookReadingActivityNew:p	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/b/r;
    //   258: invokevirtual 120	com/ireadercity/b2/b/r:b	()Ljava/util/List;
    //   261: invokeinterface 126 1 0
    //   266: iconst_1
    //   267: isub
    //   268: i2f
    //   269: aload_0
    //   270: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   273: invokestatic 130	com/ireadercity/b2/ui/BookReadingActivityNew:s	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)F
    //   276: ldc -125
    //   278: fdiv
    //   279: fmul
    //   280: f2d
    //   281: invokestatic 137	java/lang/Math:floor	(D)D
    //   284: d2i
    //   285: istore_1
    //   286: new 139	java/lang/StringBuilder
    //   289: dup
    //   290: ldc -115
    //   292: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   295: iload_1
    //   296: invokevirtual 146	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   299: ldc -108
    //   301: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: aload_0
    //   305: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   308: invokestatic 130	com/ireadercity/b2/ui/BookReadingActivityNew:s	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)F
    //   311: invokevirtual 154	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   314: ldc -100
    //   316: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: aload_0
    //   320: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   323: invokestatic 85	com/ireadercity/b2/ui/BookReadingActivityNew:p	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/b/r;
    //   326: invokevirtual 120	com/ireadercity/b2/b/r:b	()Ljava/util/List;
    //   329: invokeinterface 126 1 0
    //   334: invokevirtual 146	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   337: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   340: pop
    //   341: aload_0
    //   342: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   345: aconst_null
    //   346: invokestatic 67	com/ireadercity/b2/ui/BookReadingActivityNew:a	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;Ljava/lang/String;)Ljava/lang/String;
    //   349: pop
    //   350: invokestatic 162	com/ireadercity/b2/a:d	()V
    //   353: iload_1
    //   354: invokestatic 168	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   357: areturn
    //   358: astore_2
    //   359: aload_2
    //   360: invokevirtual 171	java/lang/Exception:printStackTrace	()V
    //   363: aconst_null
    //   364: astore_2
    //   365: goto -271 -> 94
    //   368: aload_0
    //   369: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   372: invokestatic 44	com/ireadercity/b2/ui/BookReadingActivityNew:l	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/bean/b;
    //   375: invokevirtual 174	com/ireadercity/b2/bean/b:z	()Z
    //   378: ifeq +43 -> 421
    //   381: aload_0
    //   382: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   385: astore_2
    //   386: aload_0
    //   387: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   390: invokestatic 57	com/ireadercity/b2/ui/BookReadingActivityNew:n	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/b/d;
    //   393: pop
    //   394: aload_2
    //   395: invokestatic 177	com/ireadercity/b2/ui/BookReadingActivityNew:k	()I
    //   398: aload_0
    //   399: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   402: invokestatic 44	com/ireadercity/b2/ui/BookReadingActivityNew:l	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)Lcom/ireadercity/b2/bean/b;
    //   405: invokestatic 180	com/ireadercity/b2/b/d:a	(ILcom/ireadercity/b2/bean/b;)Ljava/lang/String;
    //   408: invokestatic 67	com/ireadercity/b2/ui/BookReadingActivityNew:a	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;Ljava/lang/String;)Ljava/lang/String;
    //   411: pop
    //   412: aload_0
    //   413: getfield 13	com/ireadercity/b2/ui/dj:b	Lcom/ireadercity/b2/ui/BookReadingActivityNew;
    //   416: iconst_1
    //   417: invokestatic 53	com/ireadercity/b2/ui/BookReadingActivityNew:b	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;Z)Z
    //   420: pop
    //   421: aconst_null
    //   422: astore_2
    //   423: goto -329 -> 94
    //   426: astore_2
    //   427: aload_2
    //   428: invokevirtual 181	java/lang/OutOfMemoryError:printStackTrace	()V
    //   431: invokestatic 162	com/ireadercity/b2/a:d	()V
    //   434: invokestatic 162	com/ireadercity/b2/a:d	()V
    //   437: invokestatic 162	com/ireadercity/b2/a:d	()V
    //   440: goto -199 -> 241
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	443	0	this	dj
    //   285	69	1	i	int
    //   93	117	2	str	String
    //   358	2	2	localException	Exception
    //   364	59	2	localBookReadingActivityNew1	BookReadingActivityNew
    //   426	2	2	localOutOfMemoryError	OutOfMemoryError
    //   146	10	3	localBookReadingActivityNew2	BookReadingActivityNew
    // Exception table:
    //   from	to	target	type
    //   76	94	358	java/lang/Exception
    //   213	241	426	java/lang/OutOfMemoryError
  }
  
  protected final void onPreExecute()
  {
    BookReadingActivityNew.a(this.b, true);
    BookReadingActivityNew.k(this.b).setVisibility(0);
    BookReadingActivityNew.k(this.b).requestFocus();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */