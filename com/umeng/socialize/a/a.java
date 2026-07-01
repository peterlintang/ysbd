package com.umeng.socialize.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.bean.UMLocation;

public class a
  extends h
{
  private static final String N = a.class.getName();
  
  public a(Context paramContext)
  {
    super(paramContext, null);
  }
  
  private void a(String paramString, SQLiteDatabase paramSQLiteDatabase, UMComment paramUMComment)
  {
    if ((paramSQLiteDatabase.isOpen()) && (!TextUtils.isEmpty(paramString)) && (!TextUtils.isEmpty(paramUMComment.uid)) && (!TextUtils.isEmpty(paramUMComment.uname)) && (!TextUtils.isEmpty(paramUMComment.text)))
    {
      localObject = new ContentValues();
      ((ContentValues)localObject).put("uid", paramUMComment.uid);
      ((ContentValues)localObject).put("entity_key", paramString);
      ((ContentValues)localObject).put("content", paramUMComment.text);
      ((ContentValues)localObject).put("avatar_icon", paramUMComment.user_icon);
      ((ContentValues)localObject).put("location", paramUMComment.location.toString());
      ((ContentValues)localObject).put("user", paramUMComment.uname);
      ((ContentValues)localObject).put("data", Long.valueOf(paramUMComment.dt));
      paramSQLiteDatabase.insertOrThrow("comment", "_id", (ContentValues)localObject);
      paramString = N;
      new StringBuilder("insert comment ").append(paramUMComment.text).toString();
      return;
    }
    Object localObject = N;
    new StringBuilder("Can`t insert comment to db...(openDB=").append(paramSQLiteDatabase.isOpen()).append(" ek=").append(paramString).append(" uid=").append(paramUMComment.uid).append(" uname=").append(paramUMComment.uname).append(" content=").append(paramUMComment.text).append(")").toString();
  }
  
  /* Error */
  public java.util.List<UMComment> a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: aconst_null
    //   7: astore 4
    //   9: aload_0
    //   10: invokevirtual 134	com/umeng/socialize/a/a:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   13: astore 7
    //   15: aload 7
    //   17: invokevirtual 30	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   20: ifeq +254 -> 274
    //   23: new 136	java/util/ArrayList
    //   26: dup
    //   27: invokespecial 137	java/util/ArrayList:<init>	()V
    //   30: astore 4
    //   32: aload 7
    //   34: ldc 94
    //   36: bipush 6
    //   38: anewarray 139	java/lang/String
    //   41: dup
    //   42: iconst_0
    //   43: ldc 52
    //   45: aastore
    //   46: dup
    //   47: iconst_1
    //   48: ldc 77
    //   50: aastore
    //   51: dup
    //   52: iconst_2
    //   53: ldc 67
    //   55: aastore
    //   56: dup
    //   57: iconst_3
    //   58: ldc 62
    //   60: aastore
    //   61: dup
    //   62: iconst_4
    //   63: ldc 79
    //   65: aastore
    //   66: dup
    //   67: iconst_5
    //   68: ldc 60
    //   70: aastore
    //   71: ldc -115
    //   73: iconst_1
    //   74: anewarray 139	java/lang/String
    //   77: dup
    //   78: iconst_0
    //   79: aload_1
    //   80: aastore
    //   81: aconst_null
    //   82: aconst_null
    //   83: ldc -113
    //   85: invokevirtual 147	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   88: astore_1
    //   89: iconst_0
    //   90: istore_2
    //   91: aload_1
    //   92: astore 5
    //   94: aload_1
    //   95: invokeinterface 152 1 0
    //   100: istore_3
    //   101: iload_3
    //   102: ifeq +220 -> 322
    //   105: iload_2
    //   106: bipush 20
    //   108: if_icmplt +17 -> 125
    //   111: aload_0
    //   112: aload_1
    //   113: invokevirtual 155	com/umeng/socialize/a/a:a	(Landroid/database/Cursor;)V
    //   116: aload_0
    //   117: aload 7
    //   119: invokevirtual 158	com/umeng/socialize/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   122: aload 4
    //   124: areturn
    //   125: aload_1
    //   126: astore 5
    //   128: new 38	com/umeng/socialize/bean/UMComment
    //   131: dup
    //   132: invokespecial 159	com/umeng/socialize/bean/UMComment:<init>	()V
    //   135: astore 6
    //   137: aload_1
    //   138: astore 5
    //   140: aload 6
    //   142: aload_1
    //   143: iconst_0
    //   144: invokeinterface 163 2 0
    //   149: putfield 41	com/umeng/socialize/bean/UMComment:uid	Ljava/lang/String;
    //   152: aload_1
    //   153: astore 5
    //   155: aload 6
    //   157: aload_1
    //   158: iconst_1
    //   159: invokeinterface 163 2 0
    //   164: putfield 44	com/umeng/socialize/bean/UMComment:uname	Ljava/lang/String;
    //   167: aload_1
    //   168: astore 5
    //   170: aload 6
    //   172: aload_1
    //   173: iconst_2
    //   174: invokeinterface 163 2 0
    //   179: invokestatic 167	com/umeng/socialize/bean/UMLocation:build	(Ljava/lang/String;)Lcom/umeng/socialize/bean/UMLocation;
    //   182: putfield 70	com/umeng/socialize/bean/UMComment:location	Lcom/umeng/socialize/bean/UMLocation;
    //   185: aload_1
    //   186: astore 5
    //   188: aload 6
    //   190: aload_1
    //   191: iconst_3
    //   192: invokeinterface 163 2 0
    //   197: putfield 65	com/umeng/socialize/bean/UMComment:user_icon	Ljava/lang/String;
    //   200: aload_1
    //   201: astore 5
    //   203: aload 6
    //   205: aload_1
    //   206: iconst_4
    //   207: invokeinterface 171 2 0
    //   212: putfield 83	com/umeng/socialize/bean/UMComment:dt	J
    //   215: aload_1
    //   216: astore 5
    //   218: aload 6
    //   220: aload_1
    //   221: iconst_5
    //   222: invokeinterface 163 2 0
    //   227: putfield 47	com/umeng/socialize/bean/UMComment:text	Ljava/lang/String;
    //   230: iload_2
    //   231: iconst_1
    //   232: iadd
    //   233: istore_2
    //   234: aload_1
    //   235: astore 5
    //   237: aload 4
    //   239: aload 6
    //   241: invokeinterface 177 2 0
    //   246: pop
    //   247: goto -156 -> 91
    //   250: astore 5
    //   252: aload_1
    //   253: astore 5
    //   255: getstatic 16	com/umeng/socialize/a/a:N	Ljava/lang/String;
    //   258: astore 6
    //   260: aload_0
    //   261: aload_1
    //   262: invokevirtual 155	com/umeng/socialize/a/a:a	(Landroid/database/Cursor;)V
    //   265: aload_0
    //   266: aload 7
    //   268: invokevirtual 158	com/umeng/socialize/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   271: aload 4
    //   273: areturn
    //   274: getstatic 16	com/umeng/socialize/a/a:N	Ljava/lang/String;
    //   277: astore_1
    //   278: aconst_null
    //   279: astore_1
    //   280: goto -169 -> 111
    //   283: astore_1
    //   284: aload 6
    //   286: astore 5
    //   288: aload_0
    //   289: aload 5
    //   291: invokevirtual 155	com/umeng/socialize/a/a:a	(Landroid/database/Cursor;)V
    //   294: aload_0
    //   295: aload 7
    //   297: invokevirtual 158	com/umeng/socialize/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   300: aload_1
    //   301: athrow
    //   302: astore_1
    //   303: goto -15 -> 288
    //   306: astore_1
    //   307: aconst_null
    //   308: astore_1
    //   309: aload 5
    //   311: astore 4
    //   313: goto -61 -> 252
    //   316: astore_1
    //   317: aconst_null
    //   318: astore_1
    //   319: goto -67 -> 252
    //   322: goto -211 -> 111
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	325	0	this	a
    //   0	325	1	paramString	String
    //   90	144	2	i	int
    //   100	2	3	bool	boolean
    //   7	305	4	localObject1	Object
    //   1	235	5	str	String
    //   250	1	5	localSQLException	android.database.SQLException
    //   253	57	5	localObject2	Object
    //   4	281	6	localObject3	Object
    //   13	283	7	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   94	101	250	android/database/SQLException
    //   128	137	250	android/database/SQLException
    //   140	152	250	android/database/SQLException
    //   155	167	250	android/database/SQLException
    //   170	185	250	android/database/SQLException
    //   188	200	250	android/database/SQLException
    //   203	215	250	android/database/SQLException
    //   218	230	250	android/database/SQLException
    //   237	247	250	android/database/SQLException
    //   15	32	283	finally
    //   32	89	283	finally
    //   274	278	283	finally
    //   94	101	302	finally
    //   128	137	302	finally
    //   140	152	302	finally
    //   155	167	302	finally
    //   170	185	302	finally
    //   188	200	302	finally
    //   203	215	302	finally
    //   218	230	302	finally
    //   237	247	302	finally
    //   255	260	302	finally
    //   15	32	306	android/database/SQLException
    //   274	278	306	android/database/SQLException
    //   32	89	316	android/database/SQLException
  }
  
  public void a(UMComment paramUMComment, String paramString)
  {
    Object localObject = null;
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      localObject = localSQLiteDatabase;
      a(paramString, localSQLiteDatabase, paramUMComment);
      a(localSQLiteDatabase);
      return;
    }
    finally
    {
      a((SQLiteDatabase)localObject);
    }
  }
  
  /* Error */
  public void a(java.util.List<UMComment> paramList, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: invokevirtual 183	com/umeng/socialize/a/a:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore 4
    //   8: aload 4
    //   10: astore_3
    //   11: aload 4
    //   13: invokevirtual 189	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   16: aload 4
    //   18: astore_3
    //   19: aload_1
    //   20: invokeinterface 193 1 0
    //   25: astore_1
    //   26: aload 4
    //   28: astore_3
    //   29: aload_1
    //   30: invokeinterface 198 1 0
    //   35: ifne +28 -> 63
    //   38: aload 4
    //   40: astore_3
    //   41: aload 4
    //   43: invokevirtual 201	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   46: aload 4
    //   48: ifnull +8 -> 56
    //   51: aload 4
    //   53: invokevirtual 204	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   56: aload_0
    //   57: aload 4
    //   59: invokevirtual 158	com/umeng/socialize/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   62: return
    //   63: aload 4
    //   65: astore_3
    //   66: aload_0
    //   67: aload_2
    //   68: aload 4
    //   70: aload_1
    //   71: invokeinterface 208 1 0
    //   76: checkcast 38	com/umeng/socialize/bean/UMComment
    //   79: invokespecial 185	com/umeng/socialize/a/a:a	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;Lcom/umeng/socialize/bean/UMComment;)V
    //   82: goto -56 -> 26
    //   85: astore_1
    //   86: aload_3
    //   87: ifnull +7 -> 94
    //   90: aload_3
    //   91: invokevirtual 204	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   94: aload_0
    //   95: aload_3
    //   96: invokevirtual 158	com/umeng/socialize/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   99: aload_1
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	a
    //   0	101	1	paramList	java.util.List<UMComment>
    //   0	101	2	paramString	String
    //   1	95	3	localObject	Object
    //   6	63	4	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   2	8	85	finally
    //   11	16	85	finally
    //   19	26	85	finally
    //   29	38	85	finally
    //   41	46	85	finally
    //   66	82	85	finally
  }
  
  /* Error */
  public void a(java.util.List<UMComment> paramList, String paramString, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_0
    //   4: invokevirtual 183	com/umeng/socialize/a/a:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   7: astore 6
    //   9: aload 6
    //   11: astore 5
    //   13: aload 6
    //   15: invokevirtual 30	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   18: ifeq +143 -> 161
    //   21: aload_1
    //   22: ifnull +139 -> 161
    //   25: aload 6
    //   27: astore 5
    //   29: aload_1
    //   30: invokeinterface 214 1 0
    //   35: ifle +126 -> 161
    //   38: aload 6
    //   40: astore 5
    //   42: aload_2
    //   43: invokestatic 36	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   46: ifne +115 -> 161
    //   49: aload 6
    //   51: astore 5
    //   53: aload 6
    //   55: invokevirtual 189	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   58: aload 6
    //   60: astore 5
    //   62: aload 6
    //   64: ldc 94
    //   66: ldc -115
    //   68: iconst_1
    //   69: anewarray 139	java/lang/String
    //   72: dup
    //   73: iconst_0
    //   74: aload_2
    //   75: aastore
    //   76: invokevirtual 218	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   79: pop
    //   80: iconst_0
    //   81: istore 4
    //   83: aload 6
    //   85: astore 5
    //   87: iload 4
    //   89: aload_1
    //   90: invokeinterface 214 1 0
    //   95: if_icmpge +9 -> 104
    //   98: iload 4
    //   100: iload_3
    //   101: if_icmplt +29 -> 130
    //   104: aload 6
    //   106: astore 5
    //   108: aload 6
    //   110: invokevirtual 201	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   113: aload 6
    //   115: ifnull +8 -> 123
    //   118: aload 6
    //   120: invokevirtual 204	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   123: aload_0
    //   124: aload 6
    //   126: invokevirtual 158	com/umeng/socialize/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   129: return
    //   130: aload 6
    //   132: astore 5
    //   134: aload_0
    //   135: aload_2
    //   136: aload 6
    //   138: aload_1
    //   139: iload 4
    //   141: invokeinterface 222 2 0
    //   146: checkcast 38	com/umeng/socialize/bean/UMComment
    //   149: invokespecial 185	com/umeng/socialize/a/a:a	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;Lcom/umeng/socialize/bean/UMComment;)V
    //   152: iload 4
    //   154: iconst_1
    //   155: iadd
    //   156: istore 4
    //   158: goto -75 -> 83
    //   161: aload 6
    //   163: astore 5
    //   165: getstatic 16	com/umeng/socialize/a/a:N	Ljava/lang/String;
    //   168: astore_1
    //   169: goto -56 -> 113
    //   172: astore_1
    //   173: aload 5
    //   175: ifnull +8 -> 183
    //   178: aload 5
    //   180: invokevirtual 204	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   183: aload_0
    //   184: aload 5
    //   186: invokevirtual 158	com/umeng/socialize/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   189: aload_1
    //   190: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	191	0	this	a
    //   0	191	1	paramList	java.util.List<UMComment>
    //   0	191	2	paramString	String
    //   0	191	3	paramInt	int
    //   81	76	4	i	int
    //   1	184	5	localObject	Object
    //   7	155	6	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   3	9	172	finally
    //   13	21	172	finally
    //   29	38	172	finally
    //   42	49	172	finally
    //   53	58	172	finally
    //   62	80	172	finally
    //   87	98	172	finally
    //   108	113	172	finally
    //   134	152	172	finally
    //   165	169	172	finally
  }
  
  public boolean b(String paramString)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      a(localSQLiteDatabase);
    }
    finally
    {
      try
      {
        if (localSQLiteDatabase.isOpen())
        {
          localSQLiteDatabase.delete("comment", "entity_key = ?", new String[] { paramString });
          a(localSQLiteDatabase);
          return true;
        }
        paramString = N;
        a(localSQLiteDatabase);
        return false;
      }
      finally
      {
        for (;;) {}
      }
      paramString = finally;
      localSQLiteDatabase = null;
    }
    throw paramString;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */