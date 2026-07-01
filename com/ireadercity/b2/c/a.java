package com.ireadercity.b2.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import com.ireadercity.b2.bean.d;
import com.ireadercity.b2.h.y;
import java.util.Date;

public final class a
{
  private static a c;
  private b a;
  private SQLiteDatabase b;
  
  private long a(String paramString1, String paramString2, int paramInt, float paramFloat, String paramString3)
  {
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("title", paramString1);
      localContentValues.put("src", paramString2);
      localContentValues.put("chapter_order", Integer.valueOf(paramInt));
      localContentValues.put("progress", Float.valueOf(paramFloat));
      localContentValues.put("book_id", paramString3);
      long l = this.b.insert("chapter", null, localContentValues);
      return l;
    }
    catch (Exception paramString1)
    {
      paramString1 = paramString1;
      paramString1.getMessage();
      paramString1.printStackTrace();
      return -1L;
    }
    finally {}
  }
  
  private long a(String paramString1, String paramString2, String paramString3, int paramInt, float paramFloat)
  {
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("title", paramString1);
      localContentValues.put("book_id", paramString2);
      localContentValues.put("src", paramString3);
      localContentValues.put("progress", Float.valueOf(paramFloat));
      localContentValues.put("spine_order", Integer.valueOf(paramInt));
      long l = this.b.insert("chapterspine", null, localContentValues);
      return l;
    }
    catch (Exception paramString1)
    {
      paramString1 = paramString1;
      paramString1.getMessage();
      paramString1.printStackTrace();
      return 0L;
    }
    finally {}
  }
  
  public static a a(Context paramContext)
  {
    try
    {
      if (c == null) {
        c = new a();
      }
      if ((c.b == null) || (!c.b.isOpen()))
      {
        a locala = c;
        locala.a = new b(paramContext);
        locala.b = locala.a.getWritableDatabase();
      }
      paramContext = c;
      return paramContext;
    }
    finally {}
  }
  
  /* Error */
  private boolean a(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: ldc 98
    //   2: monitorenter
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore 6
    //   12: new 100	java/lang/StringBuilder
    //   15: dup
    //   16: ldc 102
    //   18: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: ldc 111
    //   27: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: aload 4
    //   32: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc 113
    //   37: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: iload_2
    //   41: invokevirtual 116	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   44: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: astore_1
    //   48: aload 6
    //   50: aload_3
    //   51: iconst_1
    //   52: anewarray 121	java/lang/String
    //   55: dup
    //   56: iconst_0
    //   57: ldc 42
    //   59: aastore
    //   60: aload_1
    //   61: aconst_null
    //   62: aconst_null
    //   63: aconst_null
    //   64: aconst_null
    //   65: invokevirtual 125	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   68: astore_3
    //   69: aload_3
    //   70: astore_1
    //   71: aload_3
    //   72: invokeinterface 131 1 0
    //   77: istore_2
    //   78: iload_2
    //   79: ifle +18 -> 97
    //   82: aload_3
    //   83: ifnull +9 -> 92
    //   86: aload_3
    //   87: invokeinterface 134 1 0
    //   92: ldc 98
    //   94: monitorexit
    //   95: iconst_1
    //   96: ireturn
    //   97: aload_3
    //   98: ifnull +9 -> 107
    //   101: aload_3
    //   102: invokeinterface 134 1 0
    //   107: ldc 98
    //   109: monitorexit
    //   110: iconst_0
    //   111: ireturn
    //   112: astore 4
    //   114: aconst_null
    //   115: astore_3
    //   116: aload_3
    //   117: astore_1
    //   118: aload 4
    //   120: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   123: aload_3
    //   124: ifnull +9 -> 133
    //   127: aload_3
    //   128: invokeinterface 134 1 0
    //   133: ldc 98
    //   135: monitorexit
    //   136: iconst_0
    //   137: ireturn
    //   138: aload_3
    //   139: ifnull +9 -> 148
    //   142: aload_3
    //   143: invokeinterface 134 1 0
    //   148: aload_1
    //   149: athrow
    //   150: astore_1
    //   151: ldc 98
    //   153: monitorexit
    //   154: aload_1
    //   155: athrow
    //   156: astore 4
    //   158: aload_1
    //   159: astore_3
    //   160: aload 4
    //   162: astore_1
    //   163: goto -25 -> 138
    //   166: astore 4
    //   168: goto -52 -> 116
    //   171: astore_1
    //   172: aload 5
    //   174: astore_3
    //   175: goto -37 -> 138
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	178	0	this	a
    //   0	178	1	paramString1	String
    //   0	178	2	paramInt	int
    //   0	178	3	paramString2	String
    //   0	178	4	paramString3	String
    //   4	169	5	localObject	Object
    //   10	39	6	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   6	69	112	java/lang/Exception
    //   86	92	150	finally
    //   92	95	150	finally
    //   101	107	150	finally
    //   107	110	150	finally
    //   127	133	150	finally
    //   133	136	150	finally
    //   142	148	150	finally
    //   148	150	150	finally
    //   151	154	150	finally
    //   71	78	156	finally
    //   118	123	156	finally
    //   71	78	166	java/lang/Exception
    //   6	69	171	finally
  }
  
  /* Error */
  private java.util.HashMap<String, String> e(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_3
    //   5: new 100	java/lang/StringBuilder
    //   8: dup
    //   9: ldc 102
    //   11: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: ldc -118
    //   20: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: iload_2
    //   24: invokevirtual 116	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   27: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: astore_1
    //   31: aload_3
    //   32: ldc 76
    //   34: bipush 6
    //   36: anewarray 121	java/lang/String
    //   39: dup
    //   40: iconst_0
    //   41: ldc -116
    //   43: aastore
    //   44: dup
    //   45: iconst_1
    //   46: ldc 23
    //   48: aastore
    //   49: dup
    //   50: iconst_2
    //   51: ldc 29
    //   53: aastore
    //   54: dup
    //   55: iconst_3
    //   56: ldc 74
    //   58: aastore
    //   59: dup
    //   60: iconst_4
    //   61: ldc 42
    //   63: aastore
    //   64: dup
    //   65: iconst_5
    //   66: ldc 52
    //   68: aastore
    //   69: aload_1
    //   70: aconst_null
    //   71: aconst_null
    //   72: aconst_null
    //   73: ldc -114
    //   75: invokevirtual 125	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   78: astore_1
    //   79: aload_1
    //   80: astore_3
    //   81: aload_1
    //   82: invokeinterface 145 1 0
    //   87: ifeq +199 -> 286
    //   90: aload_1
    //   91: astore_3
    //   92: new 147	java/util/HashMap
    //   95: dup
    //   96: invokespecial 148	java/util/HashMap:<init>	()V
    //   99: astore 4
    //   101: aload_1
    //   102: astore_3
    //   103: aload 4
    //   105: ldc -116
    //   107: aload_1
    //   108: iconst_0
    //   109: invokeinterface 152 2 0
    //   114: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   117: pop
    //   118: aload_1
    //   119: astore_3
    //   120: aload 4
    //   122: ldc 23
    //   124: aload_1
    //   125: iconst_1
    //   126: invokeinterface 152 2 0
    //   131: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   134: pop
    //   135: aload_1
    //   136: astore_3
    //   137: aload 4
    //   139: ldc 29
    //   141: aload_1
    //   142: iconst_2
    //   143: invokeinterface 152 2 0
    //   148: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   151: pop
    //   152: aload_1
    //   153: astore_3
    //   154: aload 4
    //   156: ldc 74
    //   158: aload_1
    //   159: iconst_3
    //   160: invokeinterface 152 2 0
    //   165: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   168: pop
    //   169: aload_1
    //   170: astore_3
    //   171: aload 4
    //   173: ldc 52
    //   175: aload_1
    //   176: iconst_5
    //   177: invokeinterface 152 2 0
    //   182: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   185: pop
    //   186: aload_1
    //   187: astore_3
    //   188: aload 4
    //   190: ldc 42
    //   192: new 100	java/lang/StringBuilder
    //   195: dup
    //   196: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   199: aload_1
    //   200: iconst_4
    //   201: invokeinterface 152 2 0
    //   206: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   215: pop
    //   216: aload 4
    //   218: astore_3
    //   219: aload_1
    //   220: ifnull +9 -> 229
    //   223: aload_1
    //   224: invokeinterface 134 1 0
    //   229: aload_3
    //   230: areturn
    //   231: astore 4
    //   233: aconst_null
    //   234: astore_1
    //   235: aload_1
    //   236: astore_3
    //   237: aload 4
    //   239: invokevirtual 66	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   242: pop
    //   243: aload_1
    //   244: astore_3
    //   245: aload 4
    //   247: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   250: aload_1
    //   251: ifnull +9 -> 260
    //   254: aload_1
    //   255: invokeinterface 134 1 0
    //   260: aconst_null
    //   261: areturn
    //   262: astore_1
    //   263: aconst_null
    //   264: astore_3
    //   265: aload_3
    //   266: ifnull +9 -> 275
    //   269: aload_3
    //   270: invokeinterface 134 1 0
    //   275: aload_1
    //   276: athrow
    //   277: astore_1
    //   278: goto -13 -> 265
    //   281: astore 4
    //   283: goto -48 -> 235
    //   286: aconst_null
    //   287: astore_3
    //   288: goto -69 -> 219
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	291	0	this	a
    //   0	291	1	paramString	String
    //   0	291	2	paramInt	int
    //   4	284	3	localObject	Object
    //   99	118	4	localHashMap	java.util.HashMap
    //   231	15	4	localException1	Exception
    //   281	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   0	79	231	java/lang/Exception
    //   0	79	262	finally
    //   81	90	277	finally
    //   92	101	277	finally
    //   103	118	277	finally
    //   120	135	277	finally
    //   137	152	277	finally
    //   154	169	277	finally
    //   171	186	277	finally
    //   188	216	277	finally
    //   237	243	277	finally
    //   245	250	277	finally
    //   81	90	281	java/lang/Exception
    //   92	101	281	java/lang/Exception
    //   103	118	281	java/lang/Exception
    //   120	135	281	java/lang/Exception
    //   137	152	281	java/lang/Exception
    //   154	169	281	java/lang/Exception
    //   171	186	281	java/lang/Exception
    //   188	216	281	java/lang/Exception
  }
  
  /* Error */
  public final int a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore 4
    //   8: new 100	java/lang/StringBuilder
    //   11: dup
    //   12: ldc 102
    //   14: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: ldc -95
    //   23: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: astore_1
    //   30: aload 4
    //   32: ldc -93
    //   34: iconst_2
    //   35: anewarray 121	java/lang/String
    //   38: dup
    //   39: iconst_0
    //   40: ldc -91
    //   42: aastore
    //   43: dup
    //   44: iconst_1
    //   45: ldc 23
    //   47: aastore
    //   48: aload_1
    //   49: aconst_null
    //   50: aconst_null
    //   51: aconst_null
    //   52: aconst_null
    //   53: aconst_null
    //   54: invokevirtual 168	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   57: astore_1
    //   58: aload_1
    //   59: astore_3
    //   60: aload_3
    //   61: ifnull +97 -> 158
    //   64: aload_3
    //   65: astore_1
    //   66: aload_3
    //   67: invokeinterface 145 1 0
    //   72: ifeq +86 -> 158
    //   75: aload_3
    //   76: astore_1
    //   77: aload_3
    //   78: iconst_0
    //   79: invokeinterface 172 2 0
    //   84: istore_2
    //   85: aload_3
    //   86: ifnull +9 -> 95
    //   89: aload_3
    //   90: invokeinterface 134 1 0
    //   95: iload_2
    //   96: ireturn
    //   97: astore 4
    //   99: aconst_null
    //   100: astore_3
    //   101: aload_3
    //   102: astore_1
    //   103: aload 4
    //   105: invokevirtual 66	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   108: pop
    //   109: aload_3
    //   110: astore_1
    //   111: aload 4
    //   113: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   116: aload_3
    //   117: ifnull +39 -> 156
    //   120: aload_3
    //   121: invokeinterface 134 1 0
    //   126: iconst_0
    //   127: ireturn
    //   128: astore_1
    //   129: aload_3
    //   130: ifnull +9 -> 139
    //   133: aload_3
    //   134: invokeinterface 134 1 0
    //   139: aload_1
    //   140: athrow
    //   141: astore 4
    //   143: aload_1
    //   144: astore_3
    //   145: aload 4
    //   147: astore_1
    //   148: goto -19 -> 129
    //   151: astore 4
    //   153: goto -52 -> 101
    //   156: iconst_0
    //   157: ireturn
    //   158: iconst_0
    //   159: istore_2
    //   160: goto -75 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	this	a
    //   0	163	1	paramString	String
    //   84	76	2	i	int
    //   1	144	3	str	String
    //   6	25	4	localSQLiteDatabase	SQLiteDatabase
    //   97	15	4	localException1	Exception
    //   141	5	4	localObject	Object
    //   151	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   2	58	97	java/lang/Exception
    //   2	58	128	finally
    //   66	75	141	finally
    //   77	85	141	finally
    //   103	109	141	finally
    //   111	116	141	finally
    //   66	75	151	java/lang/Exception
    //   77	85	151	java/lang/Exception
  }
  
  public final long a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt, String paramString9)
  {
    new StringBuilder("BookOperator.insertBook() path=").append(paramString1).toString();
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("book_id", y.e(paramString1));
      localContentValues.put("path", paramString1);
      localContentValues.put("title", paramString2);
      localContentValues.put("summary", paramString3);
      localContentValues.put("author", paramString4);
      localContentValues.put("publisher", paramString5);
      localContentValues.put("cover_path", paramString6);
      localContentValues.put("subject", paramString7);
      localContentValues.put("language", paramString8);
      localContentValues.put("status", Integer.valueOf(paramInt));
      localContentValues.put("type", paramString9);
      localContentValues.put("createddate", new Date().getTime());
      localContentValues.put("row_index", Integer.valueOf(0));
      localContentValues.put("last_reading_date", Long.valueOf(System.currentTimeMillis()));
      try
      {
        long l = this.b.insert("book", null, localContentValues);
        return l;
      }
      catch (SQLiteConstraintException paramString1)
      {
        paramString1.printStackTrace();
        return 0L;
      }
      return 0L;
    }
    catch (Exception paramString1)
    {
      paramString1.getMessage();
      paramString1.printStackTrace();
    }
  }
  
  /* Error */
  public final java.util.List<com.ireadercity.b2.bean.b> a(int paramInt)
  {
    // Byte code:
    //   0: iload_1
    //   1: tableswitch	default:+23->24, 10011:+568->569, 10012:+574->575
    //   24: ldc -25
    //   26: astore_3
    //   27: new 233	java/util/ArrayList
    //   30: dup
    //   31: invokespecial 234	java/util/ArrayList:<init>	()V
    //   34: astore 5
    //   36: aload_0
    //   37: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   40: iconst_1
    //   41: ldc -93
    //   43: bipush 16
    //   45: anewarray 121	java/lang/String
    //   48: dup
    //   49: iconst_0
    //   50: ldc 52
    //   52: aastore
    //   53: dup
    //   54: iconst_1
    //   55: ldc -72
    //   57: aastore
    //   58: dup
    //   59: iconst_2
    //   60: ldc 23
    //   62: aastore
    //   63: dup
    //   64: iconst_3
    //   65: ldc -70
    //   67: aastore
    //   68: dup
    //   69: iconst_4
    //   70: ldc -68
    //   72: aastore
    //   73: dup
    //   74: iconst_5
    //   75: ldc -66
    //   77: aastore
    //   78: dup
    //   79: bipush 6
    //   81: ldc -64
    //   83: aastore
    //   84: dup
    //   85: bipush 7
    //   87: ldc -62
    //   89: aastore
    //   90: dup
    //   91: bipush 8
    //   93: ldc -60
    //   95: aastore
    //   96: dup
    //   97: bipush 9
    //   99: ldc -91
    //   101: aastore
    //   102: dup
    //   103: bipush 10
    //   105: ldc -58
    //   107: aastore
    //   108: dup
    //   109: bipush 11
    //   111: ldc -42
    //   113: aastore
    //   114: dup
    //   115: bipush 12
    //   117: ldc -20
    //   119: aastore
    //   120: dup
    //   121: bipush 13
    //   123: ldc -18
    //   125: aastore
    //   126: dup
    //   127: bipush 14
    //   129: ldc -56
    //   131: aastore
    //   132: dup
    //   133: bipush 15
    //   135: ldc -16
    //   137: aastore
    //   138: ldc -14
    //   140: aconst_null
    //   141: aconst_null
    //   142: aconst_null
    //   143: aload_3
    //   144: aconst_null
    //   145: invokevirtual 245	android/database/sqlite/SQLiteDatabase:query	(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   148: astore 4
    //   150: aload 4
    //   152: astore_3
    //   153: new 247	com/ireadercity/b2/bean/NetBookInfo
    //   156: dup
    //   157: invokespecial 248	com/ireadercity/b2/bean/NetBookInfo:<init>	()V
    //   160: astore 6
    //   162: aload 4
    //   164: astore_3
    //   165: aload 4
    //   167: invokeinterface 145 1 0
    //   172: ifeq +382 -> 554
    //   175: aload 4
    //   177: astore_3
    //   178: new 250	com/ireadercity/b2/bean/b
    //   181: dup
    //   182: invokespecial 251	com/ireadercity/b2/bean/b:<init>	()V
    //   185: astore 7
    //   187: aload 4
    //   189: astore_3
    //   190: aload 7
    //   192: aload 4
    //   194: iconst_0
    //   195: invokeinterface 152 2 0
    //   200: invokevirtual 253	com/ireadercity/b2/bean/b:e	(Ljava/lang/String;)V
    //   203: aload 4
    //   205: astore_3
    //   206: aload 7
    //   208: aload 4
    //   210: iconst_1
    //   211: invokeinterface 152 2 0
    //   216: invokevirtual 256	com/ireadercity/b2/bean/b:g	(Ljava/lang/String;)V
    //   219: aload 4
    //   221: astore_3
    //   222: aload 7
    //   224: aload 4
    //   226: iconst_2
    //   227: invokeinterface 152 2 0
    //   232: invokevirtual 259	com/ireadercity/b2/bean/b:f	(Ljava/lang/String;)V
    //   235: aload 4
    //   237: astore_3
    //   238: aload 7
    //   240: aload 4
    //   242: iconst_3
    //   243: invokeinterface 152 2 0
    //   248: invokevirtual 262	com/ireadercity/b2/bean/b:h	(Ljava/lang/String;)V
    //   251: aload 4
    //   253: astore_3
    //   254: aload 7
    //   256: aload 4
    //   258: iconst_4
    //   259: invokeinterface 152 2 0
    //   264: invokevirtual 265	com/ireadercity/b2/bean/b:i	(Ljava/lang/String;)V
    //   267: aload 4
    //   269: astore_3
    //   270: aload 7
    //   272: aload 4
    //   274: iconst_5
    //   275: invokeinterface 152 2 0
    //   280: invokevirtual 268	com/ireadercity/b2/bean/b:k	(Ljava/lang/String;)V
    //   283: aload 4
    //   285: astore_3
    //   286: aload 7
    //   288: aload 4
    //   290: bipush 6
    //   292: invokeinterface 152 2 0
    //   297: invokevirtual 271	com/ireadercity/b2/bean/b:l	(Ljava/lang/String;)V
    //   300: aload 4
    //   302: astore_3
    //   303: aload 7
    //   305: aload 4
    //   307: bipush 7
    //   309: invokeinterface 152 2 0
    //   314: invokevirtual 274	com/ireadercity/b2/bean/b:p	(Ljava/lang/String;)V
    //   317: aload 4
    //   319: astore_3
    //   320: aload 7
    //   322: aload 4
    //   324: bipush 8
    //   326: invokeinterface 152 2 0
    //   331: invokevirtual 277	com/ireadercity/b2/bean/b:j	(Ljava/lang/String;)V
    //   334: aload 4
    //   336: astore_3
    //   337: aload 7
    //   339: aload 4
    //   341: bipush 9
    //   343: invokeinterface 172 2 0
    //   348: invokevirtual 281	com/ireadercity/b2/bean/b:d	(I)V
    //   351: aload 4
    //   353: astore_3
    //   354: aload 7
    //   356: aload 4
    //   358: bipush 10
    //   360: invokeinterface 152 2 0
    //   365: invokevirtual 284	com/ireadercity/b2/bean/b:n	(Ljava/lang/String;)V
    //   368: aload 4
    //   370: astore_3
    //   371: aload 7
    //   373: aload 4
    //   375: bipush 11
    //   377: invokeinterface 152 2 0
    //   382: invokevirtual 286	com/ireadercity/b2/bean/b:a	(Ljava/lang/String;)V
    //   385: aload 4
    //   387: astore_3
    //   388: aload 7
    //   390: aload 4
    //   392: bipush 12
    //   394: invokeinterface 172 2 0
    //   399: invokevirtual 288	com/ireadercity/b2/bean/b:b	(I)V
    //   402: aload 4
    //   404: astore_3
    //   405: aload 7
    //   407: aload 4
    //   409: bipush 13
    //   411: invokeinterface 152 2 0
    //   416: invokevirtual 290	com/ireadercity/b2/bean/b:d	(Ljava/lang/String;)V
    //   419: aload 4
    //   421: astore_3
    //   422: aload 7
    //   424: aload 4
    //   426: bipush 14
    //   428: invokeinterface 152 2 0
    //   433: invokevirtual 293	com/ireadercity/b2/bean/b:m	(Ljava/lang/String;)V
    //   436: aload 4
    //   438: astore_3
    //   439: aload 7
    //   441: aload 4
    //   443: bipush 15
    //   445: invokeinterface 172 2 0
    //   450: invokevirtual 295	com/ireadercity/b2/bean/b:c	(I)V
    //   453: aload 4
    //   455: astore_3
    //   456: aload 5
    //   458: aload 7
    //   460: invokeinterface 301 2 0
    //   465: pop
    //   466: aload 4
    //   468: astore_3
    //   469: aload 7
    //   471: invokevirtual 303	com/ireadercity/b2/bean/b:i	()Ljava/lang/String;
    //   474: invokestatic 306	com/ireadercity/b2/h/y:d	(Ljava/lang/String;)Z
    //   477: ifeq +29 -> 506
    //   480: aload 4
    //   482: astore_3
    //   483: aload 6
    //   485: aload 7
    //   487: invokevirtual 308	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   490: invokevirtual 309	com/ireadercity/b2/bean/NetBookInfo:k	(Ljava/lang/String;)V
    //   493: aload 4
    //   495: astore_3
    //   496: aload 7
    //   498: aload 6
    //   500: invokevirtual 311	com/ireadercity/b2/bean/NetBookInfo:d	()Ljava/lang/String;
    //   503: invokevirtual 290	com/ireadercity/b2/bean/b:d	(Ljava/lang/String;)V
    //   506: aload 4
    //   508: astore_3
    //   509: aload 7
    //   511: invokevirtual 313	com/ireadercity/b2/bean/b:h	()I
    //   514: ifne +25 -> 539
    //   517: aload 4
    //   519: astore_3
    //   520: aload 7
    //   522: invokevirtual 316	com/ireadercity/b2/bean/b:z	()Z
    //   525: ifeq +14 -> 539
    //   528: aload 4
    //   530: astore_3
    //   531: aload 7
    //   533: getstatic 322	com/ireadercity/b2/a:T	I
    //   536: invokevirtual 295	com/ireadercity/b2/bean/b:c	(I)V
    //   539: aload 4
    //   541: astore_3
    //   542: aload 4
    //   544: invokeinterface 325 1 0
    //   549: istore_2
    //   550: iload_2
    //   551: ifne -376 -> 175
    //   554: aload 4
    //   556: ifnull +10 -> 566
    //   559: aload 4
    //   561: invokeinterface 134 1 0
    //   566: aload 5
    //   568: areturn
    //   569: ldc -25
    //   571: astore_3
    //   572: goto -545 -> 27
    //   575: ldc_w 327
    //   578: astore_3
    //   579: goto -552 -> 27
    //   582: astore 5
    //   584: aconst_null
    //   585: astore 4
    //   587: aload 4
    //   589: astore_3
    //   590: aload 5
    //   592: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   595: aload 4
    //   597: ifnull +10 -> 607
    //   600: aload 4
    //   602: invokeinterface 134 1 0
    //   607: aconst_null
    //   608: areturn
    //   609: astore 4
    //   611: aconst_null
    //   612: astore_3
    //   613: aload_3
    //   614: ifnull +9 -> 623
    //   617: aload_3
    //   618: invokeinterface 134 1 0
    //   623: aload 4
    //   625: athrow
    //   626: astore 4
    //   628: goto -15 -> 613
    //   631: astore 5
    //   633: goto -46 -> 587
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	636	0	this	a
    //   0	636	1	paramInt	int
    //   549	2	2	bool	boolean
    //   26	592	3	localObject1	Object
    //   148	453	4	localCursor	Cursor
    //   609	15	4	localObject2	Object
    //   626	1	4	localObject3	Object
    //   34	533	5	localArrayList	java.util.ArrayList
    //   582	9	5	localException1	Exception
    //   631	1	5	localException2	Exception
    //   160	339	6	localNetBookInfo	com.ireadercity.b2.bean.NetBookInfo
    //   185	347	7	localb	com.ireadercity.b2.bean.b
    // Exception table:
    //   from	to	target	type
    //   36	150	582	java/lang/Exception
    //   36	150	609	finally
    //   153	162	626	finally
    //   165	175	626	finally
    //   178	187	626	finally
    //   190	203	626	finally
    //   206	219	626	finally
    //   222	235	626	finally
    //   238	251	626	finally
    //   254	267	626	finally
    //   270	283	626	finally
    //   286	300	626	finally
    //   303	317	626	finally
    //   320	334	626	finally
    //   337	351	626	finally
    //   354	368	626	finally
    //   371	385	626	finally
    //   388	402	626	finally
    //   405	419	626	finally
    //   422	436	626	finally
    //   439	453	626	finally
    //   456	466	626	finally
    //   469	480	626	finally
    //   483	493	626	finally
    //   496	506	626	finally
    //   509	517	626	finally
    //   520	528	626	finally
    //   531	539	626	finally
    //   542	550	626	finally
    //   590	595	626	finally
    //   153	162	631	java/lang/Exception
    //   165	175	631	java/lang/Exception
    //   178	187	631	java/lang/Exception
    //   190	203	631	java/lang/Exception
    //   206	219	631	java/lang/Exception
    //   222	235	631	java/lang/Exception
    //   238	251	631	java/lang/Exception
    //   254	267	631	java/lang/Exception
    //   270	283	631	java/lang/Exception
    //   286	300	631	java/lang/Exception
    //   303	317	631	java/lang/Exception
    //   320	334	631	java/lang/Exception
    //   337	351	631	java/lang/Exception
    //   354	368	631	java/lang/Exception
    //   371	385	631	java/lang/Exception
    //   388	402	631	java/lang/Exception
    //   405	419	631	java/lang/Exception
    //   422	436	631	java/lang/Exception
    //   439	453	631	java/lang/Exception
    //   456	466	631	java/lang/Exception
    //   469	480	631	java/lang/Exception
    //   483	493	631	java/lang/Exception
    //   496	506	631	java/lang/Exception
    //   509	517	631	java/lang/Exception
    //   520	528	631	java/lang/Exception
    //   531	539	631	java/lang/Exception
    //   542	550	631	java/lang/Exception
  }
  
  /* Error */
  public final java.util.List<com.ireadercity.b2.bean.b> a(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc_w 331
    //   3: astore 4
    //   5: aload 4
    //   7: astore_3
    //   8: iload_2
    //   9: tableswitch	default:+27->36, 10011:+464->473, 10012:+457->466, 10013:+30->39
    //   36: aload 4
    //   38: astore_3
    //   39: new 233	java/util/ArrayList
    //   42: dup
    //   43: invokespecial 234	java/util/ArrayList:<init>	()V
    //   46: astore 4
    //   48: aload_0
    //   49: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   52: new 100	java/lang/StringBuilder
    //   55: dup
    //   56: ldc_w 333
    //   59: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   62: aload_3
    //   63: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: iconst_1
    //   70: anewarray 121	java/lang/String
    //   73: dup
    //   74: iconst_0
    //   75: new 100	java/lang/StringBuilder
    //   78: dup
    //   79: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   82: iload_1
    //   83: invokevirtual 116	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   86: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   89: aastore
    //   90: invokevirtual 337	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   93: astore_3
    //   94: aload_3
    //   95: invokeinterface 145 1 0
    //   100: ifeq +311 -> 411
    //   103: new 250	com/ireadercity/b2/bean/b
    //   106: dup
    //   107: invokespecial 251	com/ireadercity/b2/bean/b:<init>	()V
    //   110: astore 5
    //   112: aload 5
    //   114: aload_3
    //   115: iconst_0
    //   116: invokeinterface 152 2 0
    //   121: invokevirtual 253	com/ireadercity/b2/bean/b:e	(Ljava/lang/String;)V
    //   124: aload 5
    //   126: aload_3
    //   127: iconst_1
    //   128: invokeinterface 152 2 0
    //   133: invokevirtual 256	com/ireadercity/b2/bean/b:g	(Ljava/lang/String;)V
    //   136: aload 5
    //   138: aload_3
    //   139: iconst_2
    //   140: invokeinterface 152 2 0
    //   145: invokevirtual 259	com/ireadercity/b2/bean/b:f	(Ljava/lang/String;)V
    //   148: aload 5
    //   150: aload_3
    //   151: iconst_3
    //   152: invokeinterface 152 2 0
    //   157: invokevirtual 262	com/ireadercity/b2/bean/b:h	(Ljava/lang/String;)V
    //   160: aload 5
    //   162: aload_3
    //   163: iconst_4
    //   164: invokeinterface 152 2 0
    //   169: invokevirtual 265	com/ireadercity/b2/bean/b:i	(Ljava/lang/String;)V
    //   172: aload 5
    //   174: aload_3
    //   175: iconst_5
    //   176: invokeinterface 152 2 0
    //   181: invokevirtual 268	com/ireadercity/b2/bean/b:k	(Ljava/lang/String;)V
    //   184: aload 5
    //   186: aload_3
    //   187: bipush 6
    //   189: invokeinterface 152 2 0
    //   194: invokevirtual 271	com/ireadercity/b2/bean/b:l	(Ljava/lang/String;)V
    //   197: aload 5
    //   199: aload_3
    //   200: bipush 7
    //   202: invokeinterface 152 2 0
    //   207: invokevirtual 274	com/ireadercity/b2/bean/b:p	(Ljava/lang/String;)V
    //   210: aload 5
    //   212: aload_3
    //   213: bipush 8
    //   215: invokeinterface 152 2 0
    //   220: invokevirtual 277	com/ireadercity/b2/bean/b:j	(Ljava/lang/String;)V
    //   223: aload 5
    //   225: aload_3
    //   226: bipush 9
    //   228: invokeinterface 172 2 0
    //   233: invokevirtual 281	com/ireadercity/b2/bean/b:d	(I)V
    //   236: aload 5
    //   238: aload_3
    //   239: bipush 10
    //   241: invokeinterface 152 2 0
    //   246: invokevirtual 284	com/ireadercity/b2/bean/b:n	(Ljava/lang/String;)V
    //   249: aload 5
    //   251: aload_3
    //   252: bipush 11
    //   254: invokeinterface 152 2 0
    //   259: invokevirtual 286	com/ireadercity/b2/bean/b:a	(Ljava/lang/String;)V
    //   262: aload 5
    //   264: aload_3
    //   265: bipush 12
    //   267: invokeinterface 172 2 0
    //   272: invokevirtual 288	com/ireadercity/b2/bean/b:b	(I)V
    //   275: aload 5
    //   277: aload_3
    //   278: bipush 13
    //   280: invokeinterface 152 2 0
    //   285: invokevirtual 290	com/ireadercity/b2/bean/b:d	(Ljava/lang/String;)V
    //   288: aload 5
    //   290: aload_3
    //   291: bipush 14
    //   293: invokeinterface 152 2 0
    //   298: invokevirtual 293	com/ireadercity/b2/bean/b:m	(Ljava/lang/String;)V
    //   301: aload 5
    //   303: aload_3
    //   304: bipush 15
    //   306: invokeinterface 172 2 0
    //   311: invokevirtual 295	com/ireadercity/b2/bean/b:c	(I)V
    //   314: aload 4
    //   316: aload 5
    //   318: invokeinterface 301 2 0
    //   323: pop
    //   324: new 100	java/lang/StringBuilder
    //   327: dup
    //   328: ldc_w 339
    //   331: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   334: aload 5
    //   336: invokevirtual 341	com/ireadercity/b2/bean/b:j	()Ljava/lang/String;
    //   339: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   342: ldc_w 343
    //   345: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: aload 5
    //   350: invokevirtual 345	com/ireadercity/b2/bean/b:k	()Ljava/lang/String;
    //   353: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: ldc_w 347
    //   359: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: aload 5
    //   364: invokevirtual 308	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   367: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: ldc_w 349
    //   373: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   376: aload 5
    //   378: invokevirtual 351	com/ireadercity/b2/bean/b:e	()I
    //   381: invokevirtual 116	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   384: ldc_w 353
    //   387: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: aload 5
    //   392: invokevirtual 356	com/ireadercity/b2/bean/b:r	()Ljava/lang/String;
    //   395: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   401: pop
    //   402: aload_3
    //   403: invokeinterface 325 1 0
    //   408: ifne -305 -> 103
    //   411: aload 4
    //   413: invokeinterface 360 1 0
    //   418: astore 5
    //   420: aload 5
    //   422: invokeinterface 365 1 0
    //   427: ifeq +53 -> 480
    //   430: aload 5
    //   432: invokeinterface 369 1 0
    //   437: checkcast 250	com/ireadercity/b2/bean/b
    //   440: invokevirtual 345	com/ireadercity/b2/bean/b:k	()Ljava/lang/String;
    //   443: pop
    //   444: goto -24 -> 420
    //   447: astore 4
    //   449: aload 4
    //   451: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   454: aload_3
    //   455: ifnull +9 -> 464
    //   458: aload_3
    //   459: invokeinterface 134 1 0
    //   464: aconst_null
    //   465: areturn
    //   466: ldc_w 371
    //   469: astore_3
    //   470: goto -431 -> 39
    //   473: ldc_w 373
    //   476: astore_3
    //   477: goto -438 -> 39
    //   480: aload_3
    //   481: ifnull +9 -> 490
    //   484: aload_3
    //   485: invokeinterface 134 1 0
    //   490: aload 4
    //   492: areturn
    //   493: astore 4
    //   495: aconst_null
    //   496: astore_3
    //   497: aload_3
    //   498: ifnull +9 -> 507
    //   501: aload_3
    //   502: invokeinterface 134 1 0
    //   507: aload 4
    //   509: athrow
    //   510: astore 4
    //   512: goto -15 -> 497
    //   515: astore 4
    //   517: goto -20 -> 497
    //   520: astore 4
    //   522: aconst_null
    //   523: astore_3
    //   524: goto -75 -> 449
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	527	0	this	a
    //   0	527	1	paramInt1	int
    //   0	527	2	paramInt2	int
    //   7	517	3	localObject1	Object
    //   3	409	4	localObject2	Object
    //   447	44	4	localException1	Exception
    //   493	15	4	localObject3	Object
    //   510	1	4	localObject4	Object
    //   515	1	4	localObject5	Object
    //   520	1	4	localException2	Exception
    //   110	321	5	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   94	103	447	java/lang/Exception
    //   103	411	447	java/lang/Exception
    //   411	420	447	java/lang/Exception
    //   420	444	447	java/lang/Exception
    //   48	94	493	finally
    //   94	103	510	finally
    //   103	411	510	finally
    //   411	420	510	finally
    //   420	444	510	finally
    //   449	454	515	finally
    //   48	94	520	java/lang/Exception
  }
  
  /* Error */
  public final java.util.List<com.ireadercity.b2.bean.b> a(long paramLong)
  {
    // Byte code:
    //   0: new 233	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 234	java/util/ArrayList:<init>	()V
    //   7: astore 17
    //   9: aload_0
    //   10: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   13: astore 16
    //   15: new 100	java/lang/StringBuilder
    //   18: dup
    //   19: ldc_w 377
    //   22: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   25: lload_1
    //   26: invokevirtual 210	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   29: ldc_w 379
    //   32: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: astore 18
    //   40: aload 16
    //   42: iconst_1
    //   43: ldc -93
    //   45: bipush 16
    //   47: anewarray 121	java/lang/String
    //   50: dup
    //   51: iconst_0
    //   52: ldc 52
    //   54: aastore
    //   55: dup
    //   56: iconst_1
    //   57: ldc -72
    //   59: aastore
    //   60: dup
    //   61: iconst_2
    //   62: ldc 23
    //   64: aastore
    //   65: dup
    //   66: iconst_3
    //   67: ldc -70
    //   69: aastore
    //   70: dup
    //   71: iconst_4
    //   72: ldc -68
    //   74: aastore
    //   75: dup
    //   76: iconst_5
    //   77: ldc -66
    //   79: aastore
    //   80: dup
    //   81: bipush 6
    //   83: ldc -64
    //   85: aastore
    //   86: dup
    //   87: bipush 7
    //   89: ldc -62
    //   91: aastore
    //   92: dup
    //   93: bipush 8
    //   95: ldc -60
    //   97: aastore
    //   98: dup
    //   99: bipush 9
    //   101: ldc -91
    //   103: aastore
    //   104: dup
    //   105: bipush 10
    //   107: ldc -58
    //   109: aastore
    //   110: dup
    //   111: bipush 11
    //   113: ldc -42
    //   115: aastore
    //   116: dup
    //   117: bipush 12
    //   119: ldc -20
    //   121: aastore
    //   122: dup
    //   123: bipush 13
    //   125: ldc -18
    //   127: aastore
    //   128: dup
    //   129: bipush 14
    //   131: ldc -56
    //   133: aastore
    //   134: dup
    //   135: bipush 15
    //   137: ldc -16
    //   139: aastore
    //   140: aload 18
    //   142: aconst_null
    //   143: aconst_null
    //   144: aconst_null
    //   145: ldc_w 331
    //   148: aconst_null
    //   149: invokevirtual 245	android/database/sqlite/SQLiteDatabase:query	(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   152: astore 16
    //   154: aload 16
    //   156: invokeinterface 145 1 0
    //   161: ifeq +390 -> 551
    //   164: new 250	com/ireadercity/b2/bean/b
    //   167: dup
    //   168: invokespecial 251	com/ireadercity/b2/bean/b:<init>	()V
    //   171: astore 18
    //   173: aload 18
    //   175: aload 16
    //   177: iconst_0
    //   178: invokeinterface 152 2 0
    //   183: invokevirtual 253	com/ireadercity/b2/bean/b:e	(Ljava/lang/String;)V
    //   186: aload 18
    //   188: aload 16
    //   190: iconst_1
    //   191: invokeinterface 152 2 0
    //   196: invokevirtual 256	com/ireadercity/b2/bean/b:g	(Ljava/lang/String;)V
    //   199: aload 18
    //   201: aload 16
    //   203: iconst_2
    //   204: invokeinterface 152 2 0
    //   209: invokevirtual 259	com/ireadercity/b2/bean/b:f	(Ljava/lang/String;)V
    //   212: aload 18
    //   214: aload 16
    //   216: iconst_3
    //   217: invokeinterface 152 2 0
    //   222: invokevirtual 262	com/ireadercity/b2/bean/b:h	(Ljava/lang/String;)V
    //   225: aload 18
    //   227: aload 16
    //   229: iconst_4
    //   230: invokeinterface 152 2 0
    //   235: invokevirtual 265	com/ireadercity/b2/bean/b:i	(Ljava/lang/String;)V
    //   238: aload 18
    //   240: aload 16
    //   242: iconst_5
    //   243: invokeinterface 152 2 0
    //   248: invokevirtual 268	com/ireadercity/b2/bean/b:k	(Ljava/lang/String;)V
    //   251: aload 18
    //   253: aload 16
    //   255: bipush 6
    //   257: invokeinterface 152 2 0
    //   262: invokevirtual 271	com/ireadercity/b2/bean/b:l	(Ljava/lang/String;)V
    //   265: aload 18
    //   267: aload 16
    //   269: bipush 7
    //   271: invokeinterface 152 2 0
    //   276: invokevirtual 274	com/ireadercity/b2/bean/b:p	(Ljava/lang/String;)V
    //   279: aload 18
    //   281: aload 16
    //   283: bipush 8
    //   285: invokeinterface 152 2 0
    //   290: invokevirtual 277	com/ireadercity/b2/bean/b:j	(Ljava/lang/String;)V
    //   293: aload 18
    //   295: aload 16
    //   297: bipush 9
    //   299: invokeinterface 172 2 0
    //   304: invokevirtual 281	com/ireadercity/b2/bean/b:d	(I)V
    //   307: aload 18
    //   309: aload 16
    //   311: bipush 10
    //   313: invokeinterface 152 2 0
    //   318: invokevirtual 284	com/ireadercity/b2/bean/b:n	(Ljava/lang/String;)V
    //   321: aload 18
    //   323: aload 16
    //   325: bipush 11
    //   327: invokeinterface 152 2 0
    //   332: invokevirtual 286	com/ireadercity/b2/bean/b:a	(Ljava/lang/String;)V
    //   335: aload 18
    //   337: aload 16
    //   339: bipush 12
    //   341: invokeinterface 172 2 0
    //   346: invokevirtual 288	com/ireadercity/b2/bean/b:b	(I)V
    //   349: aload 18
    //   351: aload 16
    //   353: bipush 13
    //   355: invokeinterface 152 2 0
    //   360: invokevirtual 290	com/ireadercity/b2/bean/b:d	(Ljava/lang/String;)V
    //   363: aload 18
    //   365: aload 16
    //   367: bipush 14
    //   369: invokeinterface 152 2 0
    //   374: invokevirtual 293	com/ireadercity/b2/bean/b:m	(Ljava/lang/String;)V
    //   377: aload 18
    //   379: aload 16
    //   381: bipush 15
    //   383: invokeinterface 172 2 0
    //   388: invokevirtual 295	com/ireadercity/b2/bean/b:c	(I)V
    //   391: aload 18
    //   393: invokevirtual 351	com/ireadercity/b2/bean/b:e	()I
    //   396: istore 9
    //   398: iload 9
    //   400: ifeq +127 -> 527
    //   403: fconst_0
    //   404: fstore 5
    //   406: fconst_0
    //   407: fstore 7
    //   409: fconst_0
    //   410: fstore 8
    //   412: fconst_0
    //   413: fstore 6
    //   415: fload 7
    //   417: fstore_3
    //   418: fload 8
    //   420: fstore 4
    //   422: aload 18
    //   424: invokevirtual 382	com/ireadercity/b2/bean/b:y	()Z
    //   427: ifeq +139 -> 566
    //   430: fload 7
    //   432: fstore_3
    //   433: fload 8
    //   435: fstore 4
    //   437: aload_0
    //   438: aload 18
    //   440: invokevirtual 341	com/ireadercity/b2/bean/b:j	()Ljava/lang/String;
    //   443: iload 9
    //   445: invokespecial 384	com/ireadercity/b2/c/a:e	(Ljava/lang/String;I)Ljava/util/HashMap;
    //   448: astore 19
    //   450: aload 19
    //   452: ifnull +673 -> 1125
    //   455: fload 7
    //   457: fstore_3
    //   458: fload 8
    //   460: fstore 4
    //   462: aload 19
    //   464: ldc 42
    //   466: invokevirtual 388	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   469: checkcast 121	java/lang/String
    //   472: invokestatic 392	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   475: fstore 5
    //   477: fload 5
    //   479: ldc_w 393
    //   482: fdiv
    //   483: fstore_3
    //   484: fload_3
    //   485: fstore 6
    //   487: aload 18
    //   489: fload 6
    //   491: invokevirtual 396	com/ireadercity/b2/bean/b:a	(F)V
    //   494: new 100	java/lang/StringBuilder
    //   497: dup
    //   498: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   501: aload 18
    //   503: invokevirtual 345	com/ireadercity/b2/bean/b:k	()Ljava/lang/String;
    //   506: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: ldc_w 398
    //   512: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   515: aload 18
    //   517: invokevirtual 401	com/ireadercity/b2/bean/b:b	()F
    //   520: invokevirtual 404	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   523: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   526: pop
    //   527: aload 17
    //   529: aload 18
    //   531: invokeinterface 301 2 0
    //   536: pop
    //   537: aload 16
    //   539: invokeinterface 325 1 0
    //   544: istore 15
    //   546: iload 15
    //   548: ifne -384 -> 164
    //   551: aload 16
    //   553: ifnull +10 -> 563
    //   556: aload 16
    //   558: invokeinterface 134 1 0
    //   563: aload 17
    //   565: areturn
    //   566: fload 7
    //   568: fstore_3
    //   569: fload 8
    //   571: fstore 4
    //   573: aload 18
    //   575: invokevirtual 316	com/ireadercity/b2/bean/b:z	()Z
    //   578: ifeq +383 -> 961
    //   581: fload 7
    //   583: fstore_3
    //   584: fload 8
    //   586: fstore 4
    //   588: aload_0
    //   589: aload 18
    //   591: invokevirtual 341	com/ireadercity/b2/bean/b:j	()Ljava/lang/String;
    //   594: iload 9
    //   596: invokevirtual 406	com/ireadercity/b2/c/a:b	(Ljava/lang/String;I)Ljava/util/HashMap;
    //   599: astore 19
    //   601: aload 19
    //   603: ifnull +25 -> 628
    //   606: fload 7
    //   608: fstore_3
    //   609: fload 8
    //   611: fstore 4
    //   613: aload 19
    //   615: ldc 42
    //   617: invokevirtual 388	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   620: checkcast 121	java/lang/String
    //   623: invokestatic 392	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   626: fstore 5
    //   628: fload 5
    //   630: fstore_3
    //   631: fload 5
    //   633: fstore 4
    //   635: new 100	java/lang/StringBuilder
    //   638: dup
    //   639: ldc_w 408
    //   642: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   645: aload 19
    //   647: ldc 42
    //   649: invokevirtual 388	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   652: checkcast 121	java/lang/String
    //   655: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   658: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   661: pop
    //   662: fload 5
    //   664: fstore_3
    //   665: fload 5
    //   667: fstore 4
    //   669: aload 18
    //   671: invokevirtual 411	com/ireadercity/b2/bean/b:v	()Ljava/lang/String;
    //   674: ifnonnull +268 -> 942
    //   677: fload 5
    //   679: fstore_3
    //   680: fload 5
    //   682: fstore 4
    //   684: new 413	java/io/File
    //   687: dup
    //   688: aload 18
    //   690: invokevirtual 308	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   693: invokespecial 414	java/io/File:<init>	(Ljava/lang/String;)V
    //   696: invokevirtual 417	java/io/File:length	()J
    //   699: lstore_1
    //   700: fload 5
    //   702: fstore_3
    //   703: fload 5
    //   705: fstore 4
    //   707: aload 18
    //   709: new 100	java/lang/StringBuilder
    //   712: dup
    //   713: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   716: lload_1
    //   717: invokevirtual 210	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   720: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   723: invokevirtual 420	com/ireadercity/b2/bean/b:o	(Ljava/lang/String;)V
    //   726: fload 5
    //   728: fstore_3
    //   729: fload 5
    //   731: fstore 4
    //   733: lload_1
    //   734: aload 18
    //   736: invokevirtual 313	com/ireadercity/b2/bean/b:h	()I
    //   739: sipush 1024
    //   742: imul
    //   743: i2l
    //   744: ldiv
    //   745: lstore 13
    //   747: lload 13
    //   749: lstore 11
    //   751: fload 5
    //   753: fstore_3
    //   754: fload 5
    //   756: fstore 4
    //   758: lload_1
    //   759: aload 18
    //   761: invokevirtual 313	com/ireadercity/b2/bean/b:h	()I
    //   764: sipush 1024
    //   767: imul
    //   768: i2l
    //   769: lrem
    //   770: lconst_0
    //   771: lcmp
    //   772: ifeq +9 -> 781
    //   775: lload 13
    //   777: lconst_1
    //   778: ladd
    //   779: lstore 11
    //   781: fload 5
    //   783: fstore 6
    //   785: lload 11
    //   787: lconst_0
    //   788: lcmp
    //   789: ifle +45 -> 834
    //   792: fload 5
    //   794: fstore_3
    //   795: fload 5
    //   797: fstore 4
    //   799: fload 5
    //   801: ldc_w 393
    //   804: fdiv
    //   805: fstore 6
    //   807: iload 9
    //   809: i2f
    //   810: fstore 7
    //   812: lload 11
    //   814: l2f
    //   815: fstore 5
    //   817: fload 5
    //   819: fstore_3
    //   820: fload 5
    //   822: fstore 4
    //   824: fload 6
    //   826: fload 7
    //   828: fadd
    //   829: fload 5
    //   831: fdiv
    //   832: fstore 6
    //   834: fload 6
    //   836: fstore_3
    //   837: fload 6
    //   839: fstore 4
    //   841: new 100	java/lang/StringBuilder
    //   844: dup
    //   845: ldc_w 422
    //   848: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   851: lload 11
    //   853: invokevirtual 210	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   856: ldc_w 424
    //   859: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   862: iload 9
    //   864: invokevirtual 116	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   867: ldc_w 426
    //   870: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   873: fload 6
    //   875: invokevirtual 404	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   878: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   881: pop
    //   882: goto -395 -> 487
    //   885: astore 19
    //   887: fload_3
    //   888: fstore 4
    //   890: aload 19
    //   892: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   895: aload 18
    //   897: fload_3
    //   898: invokevirtual 396	com/ireadercity/b2/bean/b:a	(F)V
    //   901: new 100	java/lang/StringBuilder
    //   904: dup
    //   905: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   908: aload 18
    //   910: invokevirtual 345	com/ireadercity/b2/bean/b:k	()Ljava/lang/String;
    //   913: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   916: ldc_w 398
    //   919: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   922: aload 18
    //   924: invokevirtual 401	com/ireadercity/b2/bean/b:b	()F
    //   927: invokevirtual 404	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   930: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   933: pop
    //   934: goto -407 -> 527
    //   937: astore 19
    //   939: goto -412 -> 527
    //   942: fload 5
    //   944: fstore_3
    //   945: fload 5
    //   947: fstore 4
    //   949: aload 18
    //   951: invokevirtual 411	com/ireadercity/b2/bean/b:v	()Ljava/lang/String;
    //   954: invokestatic 430	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   957: lstore_1
    //   958: goto -232 -> 726
    //   961: fload 7
    //   963: fstore_3
    //   964: fload 8
    //   966: fstore 4
    //   968: aload 18
    //   970: invokevirtual 433	com/ireadercity/b2/bean/b:A	()Z
    //   973: ifeq -486 -> 487
    //   976: fload 7
    //   978: fstore_3
    //   979: fload 8
    //   981: fstore 4
    //   983: invokestatic 438	com/ireadercity/b2/b/n:a	()Lcom/ireadercity/b2/b/n;
    //   986: aload 18
    //   988: invokevirtual 441	com/ireadercity/b2/b/n:a	(Lcom/ireadercity/b2/bean/b;)I
    //   991: istore 10
    //   993: iload 9
    //   995: i2f
    //   996: iload 10
    //   998: i2f
    //   999: fdiv
    //   1000: fstore 6
    //   1002: goto -515 -> 487
    //   1005: astore 19
    //   1007: aload 18
    //   1009: fload 4
    //   1011: invokevirtual 396	com/ireadercity/b2/bean/b:a	(F)V
    //   1014: new 100	java/lang/StringBuilder
    //   1017: dup
    //   1018: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   1021: aload 18
    //   1023: invokevirtual 345	com/ireadercity/b2/bean/b:k	()Ljava/lang/String;
    //   1026: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1029: ldc_w 398
    //   1032: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1035: aload 18
    //   1037: invokevirtual 401	com/ireadercity/b2/bean/b:b	()F
    //   1040: invokevirtual 404	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   1043: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1046: pop
    //   1047: aload 19
    //   1049: athrow
    //   1050: astore 18
    //   1052: aload 16
    //   1054: astore 17
    //   1056: aload 18
    //   1058: astore 16
    //   1060: aload 17
    //   1062: ifnull +10 -> 1072
    //   1065: aload 17
    //   1067: invokeinterface 134 1 0
    //   1072: aload 16
    //   1074: athrow
    //   1075: astore 17
    //   1077: aconst_null
    //   1078: astore 16
    //   1080: aload 17
    //   1082: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   1085: aload 16
    //   1087: ifnull +10 -> 1097
    //   1090: aload 16
    //   1092: invokeinterface 134 1 0
    //   1097: aconst_null
    //   1098: areturn
    //   1099: astore 16
    //   1101: aconst_null
    //   1102: astore 17
    //   1104: goto -44 -> 1060
    //   1107: astore 18
    //   1109: aload 16
    //   1111: astore 17
    //   1113: aload 18
    //   1115: astore 16
    //   1117: goto -57 -> 1060
    //   1120: astore 17
    //   1122: goto -42 -> 1080
    //   1125: fconst_0
    //   1126: fstore_3
    //   1127: goto -643 -> 484
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1130	0	this	a
    //   0	1130	1	paramLong	long
    //   417	710	3	f1	float
    //   420	590	4	f2	float
    //   404	542	5	f3	float
    //   413	588	6	f4	float
    //   407	570	7	f5	float
    //   410	570	8	f6	float
    //   396	598	9	i	int
    //   991	6	10	j	int
    //   749	103	11	l1	long
    //   745	31	13	l2	long
    //   544	3	15	bool	boolean
    //   13	1078	16	localObject1	Object
    //   1099	11	16	localObject2	Object
    //   1115	1	16	localObject3	Object
    //   7	1059	17	localObject4	Object
    //   1075	6	17	localException1	Exception
    //   1102	10	17	localObject5	Object
    //   1120	1	17	localException2	Exception
    //   38	998	18	localObject6	Object
    //   1050	7	18	localObject7	Object
    //   1107	7	18	localObject8	Object
    //   448	198	19	localHashMap	java.util.HashMap
    //   885	6	19	localException3	Exception
    //   937	1	19	localException4	Exception
    //   1005	43	19	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   422	430	885	java/lang/Exception
    //   437	450	885	java/lang/Exception
    //   462	477	885	java/lang/Exception
    //   573	581	885	java/lang/Exception
    //   588	601	885	java/lang/Exception
    //   613	628	885	java/lang/Exception
    //   635	662	885	java/lang/Exception
    //   669	677	885	java/lang/Exception
    //   684	700	885	java/lang/Exception
    //   707	726	885	java/lang/Exception
    //   733	747	885	java/lang/Exception
    //   758	775	885	java/lang/Exception
    //   799	807	885	java/lang/Exception
    //   824	834	885	java/lang/Exception
    //   841	882	885	java/lang/Exception
    //   949	958	885	java/lang/Exception
    //   968	976	885	java/lang/Exception
    //   983	993	885	java/lang/Exception
    //   391	398	937	java/lang/Exception
    //   487	527	937	java/lang/Exception
    //   895	934	937	java/lang/Exception
    //   1007	1050	937	java/lang/Exception
    //   422	430	1005	finally
    //   437	450	1005	finally
    //   462	477	1005	finally
    //   573	581	1005	finally
    //   588	601	1005	finally
    //   613	628	1005	finally
    //   635	662	1005	finally
    //   669	677	1005	finally
    //   684	700	1005	finally
    //   707	726	1005	finally
    //   733	747	1005	finally
    //   758	775	1005	finally
    //   799	807	1005	finally
    //   824	834	1005	finally
    //   841	882	1005	finally
    //   890	895	1005	finally
    //   949	958	1005	finally
    //   968	976	1005	finally
    //   983	993	1005	finally
    //   154	164	1050	finally
    //   164	391	1050	finally
    //   391	398	1050	finally
    //   487	527	1050	finally
    //   527	546	1050	finally
    //   895	934	1050	finally
    //   1007	1050	1050	finally
    //   9	154	1075	java/lang/Exception
    //   9	154	1099	finally
    //   1080	1085	1107	finally
    //   154	164	1120	java/lang/Exception
    //   164	391	1120	java/lang/Exception
    //   527	546	1120	java/lang/Exception
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   4: ldc -93
    //   6: iconst_2
    //   7: anewarray 121	java/lang/String
    //   10: dup
    //   11: iconst_0
    //   12: ldc 52
    //   14: aastore
    //   15: dup
    //   16: iconst_1
    //   17: ldc -72
    //   19: aastore
    //   20: aconst_null
    //   21: aconst_null
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: invokevirtual 125	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_3
    //   29: aload_3
    //   30: astore_2
    //   31: aload_3
    //   32: invokeinterface 145 1 0
    //   37: ifeq +132 -> 169
    //   40: aload_3
    //   41: astore_2
    //   42: aload_3
    //   43: iconst_0
    //   44: invokeinterface 152 2 0
    //   49: astore 4
    //   51: aload_3
    //   52: astore_2
    //   53: aload_3
    //   54: iconst_1
    //   55: invokeinterface 152 2 0
    //   60: astore 6
    //   62: aload_3
    //   63: astore_2
    //   64: new 413	java/io/File
    //   67: dup
    //   68: aload 6
    //   70: invokespecial 414	java/io/File:<init>	(Ljava/lang/String;)V
    //   73: astore 5
    //   75: aload_3
    //   76: astore_2
    //   77: new 413	java/io/File
    //   80: dup
    //   81: new 100	java/lang/StringBuilder
    //   84: dup
    //   85: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   88: aload 6
    //   90: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: ldc_w 444
    //   96: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokespecial 414	java/io/File:<init>	(Ljava/lang/String;)V
    //   105: astore 6
    //   107: aload_3
    //   108: astore_2
    //   109: aload 5
    //   111: invokevirtual 447	java/io/File:exists	()Z
    //   114: ifeq +13 -> 127
    //   117: aload_3
    //   118: astore_2
    //   119: aload 5
    //   121: invokevirtual 450	java/io/File:isDirectory	()Z
    //   124: ifeq +32 -> 156
    //   127: aload_3
    //   128: astore_2
    //   129: aload 6
    //   131: invokevirtual 447	java/io/File:exists	()Z
    //   134: ifeq +13 -> 147
    //   137: aload_3
    //   138: astore_2
    //   139: aload 6
    //   141: invokevirtual 450	java/io/File:isDirectory	()Z
    //   144: ifeq +12 -> 156
    //   147: aload_3
    //   148: astore_2
    //   149: aload_0
    //   150: aload 4
    //   152: invokevirtual 452	com/ireadercity/b2/c/a:m	(Ljava/lang/String;)Z
    //   155: pop
    //   156: aload_3
    //   157: astore_2
    //   158: aload_3
    //   159: invokeinterface 325 1 0
    //   164: istore_1
    //   165: iload_1
    //   166: ifne -126 -> 40
    //   169: aload_3
    //   170: ifnull +9 -> 179
    //   173: aload_3
    //   174: invokeinterface 134 1 0
    //   179: return
    //   180: astore 4
    //   182: aconst_null
    //   183: astore_3
    //   184: aload_3
    //   185: astore_2
    //   186: aload 4
    //   188: invokevirtual 66	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   191: pop
    //   192: aload_3
    //   193: astore_2
    //   194: aload 4
    //   196: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   199: aload_3
    //   200: ifnull -21 -> 179
    //   203: aload_3
    //   204: invokeinterface 134 1 0
    //   209: return
    //   210: astore_3
    //   211: aconst_null
    //   212: astore_2
    //   213: aload_2
    //   214: ifnull +9 -> 223
    //   217: aload_2
    //   218: invokeinterface 134 1 0
    //   223: aload_3
    //   224: athrow
    //   225: astore_3
    //   226: goto -13 -> 213
    //   229: astore 4
    //   231: goto -47 -> 184
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	a
    //   164	2	1	bool	boolean
    //   30	188	2	localCursor1	Cursor
    //   28	176	3	localCursor2	Cursor
    //   210	14	3	localObject1	Object
    //   225	1	3	localObject2	Object
    //   49	102	4	str	String
    //   180	15	4	localException1	Exception
    //   229	1	4	localException2	Exception
    //   73	47	5	localFile	java.io.File
    //   60	80	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   0	29	180	java/lang/Exception
    //   0	29	210	finally
    //   31	40	225	finally
    //   42	51	225	finally
    //   53	62	225	finally
    //   64	75	225	finally
    //   77	107	225	finally
    //   109	117	225	finally
    //   119	127	225	finally
    //   129	137	225	finally
    //   139	147	225	finally
    //   149	156	225	finally
    //   158	165	225	finally
    //   186	192	225	finally
    //   194	199	225	finally
    //   31	40	229	java/lang/Exception
    //   42	51	229	java/lang/Exception
    //   53	62	229	java/lang/Exception
    //   64	75	229	java/lang/Exception
    //   77	107	229	java/lang/Exception
    //   109	117	229	java/lang/Exception
    //   119	127	229	java/lang/Exception
    //   129	137	229	java/lang/Exception
    //   139	147	229	java/lang/Exception
    //   149	156	229	java/lang/Exception
    //   158	165	229	java/lang/Exception
  }
  
  public final void a(int paramInt, String paramString)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("categoryname", paramString);
    this.b.update("category", localContentValues, "category_id=" + paramInt, null);
  }
  
  public final boolean a(d paramd)
  {
    if (paramd == null) {}
    for (;;)
    {
      return false;
      new StringBuilder("insertOrUpdateDownloadInfo ").append(paramd.e()).toString();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("storebookid", paramd.g());
      localContentValues.put("book_full_url", paramd.h());
      localContentValues.put("current_step", Integer.valueOf(paramd.i()));
      localContentValues.put("local_abs_path", paramd.j());
      localContentValues.put("totle_size", Long.valueOf(paramd.k()));
      localContentValues.put("downloaded_size", Long.valueOf(paramd.l()));
      localContentValues.put("book_author", paramd.d());
      localContentValues.put("book_title", paramd.e());
      localContentValues.put("book_desc", paramd.f());
      localContentValues.put("last_operationtime", Long.valueOf(paramd.c()));
      try
      {
        l = this.b.insert("downloadinfo", null, localContentValues);
        if (l > -1L) {
          return true;
        }
      }
      catch (SQLiteConstraintException localSQLiteConstraintException)
      {
        for (;;)
        {
          long l = -1L;
        }
        try
        {
          new StringBuilder("update info...").append(paramd.g()).toString();
          int i = this.b.update("downloadinfo", localContentValues, "storebookid = '" + paramd.g() + "'", null);
          if (i > 0) {
            return true;
          }
        }
        catch (Exception paramd)
        {
          paramd.printStackTrace();
        }
      }
    }
    return false;
  }
  
  public final boolean a(String paramString1, float paramFloat, String paramString2, long paramLong)
  {
    boolean bool = false;
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("title", paramString1);
      localContentValues.put("progress", Float.valueOf(paramFloat));
      localContentValues.put("createddate", new Date().getTime());
      localContentValues.put("book_id", paramString2);
      localContentValues.put("spine_id", Long.valueOf(paramLong));
      paramLong = this.b.insert("bookmark", null, localContentValues);
      if (paramLong > 0L) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramString1)
    {
      paramString1.getMessage();
      paramString1.printStackTrace();
    }
    return false;
  }
  
  public final boolean a(String paramString, int paramInt)
  {
    boolean bool = false;
    new StringBuilder("updateBookLastReadingChapter=book_id=").append(paramString).append("order=").append(paramInt).toString();
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("last_chapter_id", Integer.valueOf(paramInt));
      paramInt = this.b.update("book", localContentValues, "book_id='" + paramString + "'", null);
      if (paramInt > 0) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramString)
    {
      paramString.getMessage();
      paramString.printStackTrace();
    }
    return false;
  }
  
  public final boolean a(String paramString, int paramInt, float paramFloat)
  {
    try
    {
      if (a(paramString, paramInt, "chapter", "chapter_order"))
      {
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("progress", Float.valueOf(paramFloat));
        if (this.b.update("chapter", localContentValues, "book_id='" + paramString + "' and chapter_order =" + paramInt, null) > 0) {
          return true;
        }
      }
      else
      {
        long l = a("", "", paramInt, paramFloat, paramString);
        return l > 0L;
      }
    }
    catch (Exception paramString)
    {
      paramString.getMessage();
      paramString.printStackTrace();
      return false;
    }
    return false;
  }
  
  /* Error */
  public final boolean a(String paramString, long paramLong, float paramFloat)
  {
    // Byte code:
    //   0: new 100	java/lang/StringBuilder
    //   3: dup
    //   4: ldc_w 532
    //   7: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   10: aload_1
    //   11: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: ldc_w 534
    //   17: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: lload_2
    //   21: invokevirtual 210	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   24: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: pop
    //   28: new 100	java/lang/StringBuilder
    //   31: dup
    //   32: ldc_w 532
    //   35: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: fload 4
    //   40: invokevirtual 404	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   43: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: pop
    //   47: aconst_null
    //   48: astore 8
    //   50: aload_0
    //   51: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   54: astore 9
    //   56: new 100	java/lang/StringBuilder
    //   59: dup
    //   60: ldc 102
    //   62: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   65: aload_1
    //   66: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: ldc_w 536
    //   72: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: lload_2
    //   76: invokevirtual 210	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   79: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: astore_1
    //   83: aload 9
    //   85: ldc_w 517
    //   88: iconst_2
    //   89: anewarray 121	java/lang/String
    //   92: dup
    //   93: iconst_0
    //   94: ldc 52
    //   96: aastore
    //   97: dup
    //   98: iconst_1
    //   99: ldc 42
    //   101: aastore
    //   102: aload_1
    //   103: aconst_null
    //   104: aconst_null
    //   105: aconst_null
    //   106: aconst_null
    //   107: aconst_null
    //   108: invokevirtual 168	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   111: astore_1
    //   112: aload_1
    //   113: astore 8
    //   115: aload 8
    //   117: ifnonnull +21 -> 138
    //   120: aload 8
    //   122: ifnull +10 -> 132
    //   125: aload 8
    //   127: invokeinterface 134 1 0
    //   132: iconst_0
    //   133: istore 7
    //   135: iload 7
    //   137: ireturn
    //   138: iconst_0
    //   139: istore 7
    //   141: iload 7
    //   143: istore 6
    //   145: aload 8
    //   147: astore_1
    //   148: aload 8
    //   150: invokeinterface 325 1 0
    //   155: ifeq +36 -> 191
    //   158: aload 8
    //   160: astore_1
    //   161: aload 8
    //   163: iconst_1
    //   164: invokeinterface 540 2 0
    //   169: fstore 5
    //   171: fload 5
    //   173: fload 4
    //   175: fcmpl
    //   176: ifne +34 -> 210
    //   179: iconst_1
    //   180: istore 6
    //   182: iload 6
    //   184: istore 7
    //   186: iload 6
    //   188: ifeq -47 -> 141
    //   191: iload 6
    //   193: istore 7
    //   195: aload 8
    //   197: ifnull -62 -> 135
    //   200: aload 8
    //   202: invokeinterface 134 1 0
    //   207: iload 6
    //   209: ireturn
    //   210: iconst_0
    //   211: istore 6
    //   213: goto -31 -> 182
    //   216: astore 9
    //   218: aconst_null
    //   219: astore 8
    //   221: aload 8
    //   223: astore_1
    //   224: aload 9
    //   226: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   229: aload 8
    //   231: ifnull +10 -> 241
    //   234: aload 8
    //   236: invokeinterface 134 1 0
    //   241: iconst_0
    //   242: ireturn
    //   243: astore_1
    //   244: aload 8
    //   246: ifnull +10 -> 256
    //   249: aload 8
    //   251: invokeinterface 134 1 0
    //   256: aload_1
    //   257: athrow
    //   258: astore 9
    //   260: aload_1
    //   261: astore 8
    //   263: aload 9
    //   265: astore_1
    //   266: goto -22 -> 244
    //   269: astore 9
    //   271: goto -50 -> 221
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	274	0	this	a
    //   0	274	1	paramString	String
    //   0	274	2	paramLong	long
    //   0	274	4	paramFloat	float
    //   169	3	5	f	float
    //   143	69	6	bool1	boolean
    //   133	61	7	bool2	boolean
    //   48	214	8	str	String
    //   54	30	9	localSQLiteDatabase	SQLiteDatabase
    //   216	9	9	localException1	Exception
    //   258	6	9	localObject	Object
    //   269	1	9	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   50	112	216	java/lang/Exception
    //   50	112	243	finally
    //   148	158	258	finally
    //   161	171	258	finally
    //   224	229	258	finally
    //   148	158	269	java/lang/Exception
    //   161	171	269	java/lang/Exception
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool = false;
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("title", paramString2);
      localContentValues.put("summary", paramString3);
      localContentValues.put("author", paramString4);
      int i = this.b.update("book", localContentValues, "book_id='" + paramString1 + "'", null);
      if (i > 0) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramString1)
    {
      paramString1.getMessage();
      paramString1.printStackTrace();
    }
    return false;
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt1, int paramInt2)
  {
    try
    {
      new StringBuilder("====updateBook======").append(paramString6).append(" title=").append(paramString2).toString();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("title", paramString2);
      localContentValues.put("summary", paramString3);
      localContentValues.put("author", paramString4);
      localContentValues.put("publisher", paramString5);
      localContentValues.put("cover_path", paramString6);
      localContentValues.put("subject", paramString7);
      localContentValues.put("language", paramString8);
      localContentValues.put("status", Integer.valueOf(paramInt1));
      localContentValues.put("txt_chapter_size", Integer.valueOf(paramInt2));
      paramInt1 = this.b.update("book", localContentValues, "book_id='" + paramString1 + "'", null);
      return paramInt1 > 0;
    }
    catch (Exception paramString1)
    {
      paramString1.getMessage();
      paramString1.printStackTrace();
    }
    return false;
  }
  
  /* Error */
  public final com.ireadercity.b2.bean.b b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 100	java/lang/StringBuilder
    //   5: dup
    //   6: ldc_w 549
    //   9: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   12: aload_1
    //   13: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   19: pop
    //   20: aload_0
    //   21: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   24: astore_3
    //   25: new 100	java/lang/StringBuilder
    //   28: dup
    //   29: ldc_w 551
    //   32: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   35: aload_1
    //   36: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: ldc -95
    //   41: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: astore_1
    //   48: aload_3
    //   49: ldc -93
    //   51: iconst_1
    //   52: anewarray 121	java/lang/String
    //   55: dup
    //   56: iconst_0
    //   57: ldc 52
    //   59: aastore
    //   60: aload_1
    //   61: aconst_null
    //   62: aconst_null
    //   63: aconst_null
    //   64: aconst_null
    //   65: aconst_null
    //   66: invokevirtual 168	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   69: astore_1
    //   70: aload_1
    //   71: ifnull +127 -> 198
    //   74: aload_1
    //   75: astore_2
    //   76: aload_1
    //   77: invokeinterface 145 1 0
    //   82: ifeq +116 -> 198
    //   85: aload_1
    //   86: astore_2
    //   87: aload_1
    //   88: iconst_0
    //   89: invokeinterface 152 2 0
    //   94: astore_3
    //   95: aload_1
    //   96: astore_2
    //   97: new 100	java/lang/StringBuilder
    //   100: dup
    //   101: ldc_w 553
    //   104: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   107: aload_3
    //   108: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: pop
    //   115: aload_1
    //   116: astore_2
    //   117: aload_3
    //   118: invokestatic 306	com/ireadercity/b2/h/y:d	(Ljava/lang/String;)Z
    //   121: ifne +23 -> 144
    //   124: aload_1
    //   125: astore_2
    //   126: aload_0
    //   127: aload_3
    //   128: invokevirtual 555	com/ireadercity/b2/c/a:g	(Ljava/lang/String;)Lcom/ireadercity/b2/bean/b;
    //   131: astore_3
    //   132: aload_1
    //   133: ifnull +9 -> 142
    //   136: aload_1
    //   137: invokeinterface 134 1 0
    //   142: aload_3
    //   143: areturn
    //   144: aload_1
    //   145: ifnull +9 -> 154
    //   148: aload_1
    //   149: invokeinterface 134 1 0
    //   154: aconst_null
    //   155: areturn
    //   156: astore_3
    //   157: aconst_null
    //   158: astore_1
    //   159: aload_1
    //   160: astore_2
    //   161: aload_3
    //   162: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   165: aload_1
    //   166: ifnull +9 -> 175
    //   169: aload_1
    //   170: invokeinterface 134 1 0
    //   175: aconst_null
    //   176: areturn
    //   177: astore_1
    //   178: aload_2
    //   179: ifnull +9 -> 188
    //   182: aload_2
    //   183: invokeinterface 134 1 0
    //   188: aload_1
    //   189: athrow
    //   190: astore_1
    //   191: goto -13 -> 178
    //   194: astore_3
    //   195: goto -36 -> 159
    //   198: aconst_null
    //   199: astore_3
    //   200: goto -105 -> 95
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	203	0	this	a
    //   0	203	1	paramString	String
    //   1	182	2	str	String
    //   24	119	3	localObject1	Object
    //   156	6	3	localException1	Exception
    //   194	1	3	localException2	Exception
    //   199	1	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   20	70	156	java/lang/Exception
    //   20	70	177	finally
    //   76	85	190	finally
    //   87	95	190	finally
    //   97	115	190	finally
    //   117	124	190	finally
    //   126	132	190	finally
    //   161	165	190	finally
    //   76	85	194	java/lang/Exception
    //   87	95	194	java/lang/Exception
    //   97	115	194	java/lang/Exception
    //   117	124	194	java/lang/Exception
    //   126	132	194	java/lang/Exception
  }
  
  /* Error */
  public final java.util.HashMap<String, String> b(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 4
    //   6: new 100	java/lang/StringBuilder
    //   9: dup
    //   10: ldc 102
    //   12: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: ldc_w 557
    //   22: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: iload_2
    //   26: invokevirtual 116	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   29: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: astore_1
    //   33: aload 4
    //   35: ldc 56
    //   37: bipush 6
    //   39: anewarray 121	java/lang/String
    //   42: dup
    //   43: iconst_0
    //   44: ldc -116
    //   46: aastore
    //   47: dup
    //   48: iconst_1
    //   49: ldc 23
    //   51: aastore
    //   52: dup
    //   53: iconst_2
    //   54: ldc 29
    //   56: aastore
    //   57: dup
    //   58: iconst_3
    //   59: ldc 31
    //   61: aastore
    //   62: dup
    //   63: iconst_4
    //   64: ldc 42
    //   66: aastore
    //   67: dup
    //   68: iconst_5
    //   69: ldc 52
    //   71: aastore
    //   72: aload_1
    //   73: aconst_null
    //   74: aconst_null
    //   75: aconst_null
    //   76: ldc_w 559
    //   79: invokevirtual 125	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   82: astore_1
    //   83: aload_1
    //   84: astore 4
    //   86: aload_1
    //   87: invokeinterface 145 1 0
    //   92: ifeq +218 -> 310
    //   95: aload_1
    //   96: astore 4
    //   98: aload_1
    //   99: iconst_4
    //   100: invokeinterface 540 2 0
    //   105: fstore_3
    //   106: aload_1
    //   107: astore 4
    //   109: new 147	java/util/HashMap
    //   112: dup
    //   113: invokespecial 148	java/util/HashMap:<init>	()V
    //   116: astore 5
    //   118: aload_1
    //   119: astore 4
    //   121: aload 5
    //   123: ldc -116
    //   125: aload_1
    //   126: iconst_0
    //   127: invokeinterface 152 2 0
    //   132: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   135: pop
    //   136: aload_1
    //   137: astore 4
    //   139: aload 5
    //   141: ldc 23
    //   143: aload_1
    //   144: iconst_1
    //   145: invokeinterface 152 2 0
    //   150: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   153: pop
    //   154: aload_1
    //   155: astore 4
    //   157: aload 5
    //   159: ldc 29
    //   161: aload_1
    //   162: iconst_2
    //   163: invokeinterface 152 2 0
    //   168: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   171: pop
    //   172: aload_1
    //   173: astore 4
    //   175: aload 5
    //   177: ldc 31
    //   179: aload_1
    //   180: iconst_3
    //   181: invokeinterface 152 2 0
    //   186: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   189: pop
    //   190: aload_1
    //   191: astore 4
    //   193: aload 5
    //   195: ldc 52
    //   197: aload_1
    //   198: iconst_5
    //   199: invokeinterface 152 2 0
    //   204: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   207: pop
    //   208: aload_1
    //   209: astore 4
    //   211: aload 5
    //   213: ldc 42
    //   215: new 100	java/lang/StringBuilder
    //   218: dup
    //   219: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   222: fload_3
    //   223: invokevirtual 404	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   226: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   229: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   232: pop
    //   233: aload 5
    //   235: astore 4
    //   237: aload_1
    //   238: ifnull +9 -> 247
    //   241: aload_1
    //   242: invokeinterface 134 1 0
    //   247: aload 4
    //   249: areturn
    //   250: astore 5
    //   252: aconst_null
    //   253: astore_1
    //   254: aload_1
    //   255: astore 4
    //   257: aload 5
    //   259: invokevirtual 66	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   262: pop
    //   263: aload_1
    //   264: astore 4
    //   266: aload 5
    //   268: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   271: aload_1
    //   272: ifnull +9 -> 281
    //   275: aload_1
    //   276: invokeinterface 134 1 0
    //   281: aconst_null
    //   282: areturn
    //   283: astore_1
    //   284: aconst_null
    //   285: astore 4
    //   287: aload 4
    //   289: ifnull +10 -> 299
    //   292: aload 4
    //   294: invokeinterface 134 1 0
    //   299: aload_1
    //   300: athrow
    //   301: astore_1
    //   302: goto -15 -> 287
    //   305: astore 5
    //   307: goto -53 -> 254
    //   310: aconst_null
    //   311: astore 4
    //   313: goto -76 -> 237
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	316	0	this	a
    //   0	316	1	paramString	String
    //   0	316	2	paramInt	int
    //   105	118	3	f	float
    //   4	308	4	localObject	Object
    //   116	118	5	localHashMap	java.util.HashMap
    //   250	17	5	localException1	Exception
    //   305	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   0	83	250	java/lang/Exception
    //   0	83	283	finally
    //   86	95	301	finally
    //   98	106	301	finally
    //   109	118	301	finally
    //   121	136	301	finally
    //   139	154	301	finally
    //   157	172	301	finally
    //   175	190	301	finally
    //   193	208	301	finally
    //   211	233	301	finally
    //   257	263	301	finally
    //   266	271	301	finally
    //   86	95	305	java/lang/Exception
    //   98	106	305	java/lang/Exception
    //   109	118	305	java/lang/Exception
    //   121	136	305	java/lang/Exception
    //   139	154	305	java/lang/Exception
    //   157	172	305	java/lang/Exception
    //   175	190	305	java/lang/Exception
    //   193	208	305	java/lang/Exception
    //   211	233	305	java/lang/Exception
  }
  
  public final void b(int paramInt)
  {
    this.b.delete("category", "category_id = " + paramInt, null);
    this.b.delete("rsbookcategory", "category_id = " + paramInt, null);
  }
  
  public final boolean b()
  {
    boolean bool = false;
    try
    {
      this.b.delete("chapter", null, null);
      this.b.delete("bookmark", null, null);
      this.b.delete("chapterspine", null, null);
      int i = this.b.delete("book", null, null);
      if (i > 0) {
        bool = true;
      }
      return bool;
    }
    catch (Exception localException)
    {
      localException.getMessage();
      localException.printStackTrace();
    }
    return false;
  }
  
  public final boolean b(String paramString, int paramInt, float paramFloat)
  {
    try
    {
      if (a(paramString, paramInt, "chapterspine", "spine_order"))
      {
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("progress", Float.valueOf(paramFloat));
        if (this.b.update("chapterspine", localContentValues, "book_id='" + paramString + "' and spine_order =" + paramInt, null) > 0) {
          return true;
        }
      }
      else
      {
        long l = a("", paramString, "", paramInt, paramFloat);
        return l > 0L;
      }
    }
    catch (Exception paramString)
    {
      paramString.getMessage();
      paramString.printStackTrace();
      return false;
    }
    return false;
  }
  
  /* Error */
  public final java.util.List<com.ireadercity.b2.bean.f> c()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_1
    //   4: new 233	java/util/ArrayList
    //   7: dup
    //   8: invokespecial 234	java/util/ArrayList:<init>	()V
    //   11: astore 4
    //   13: aload_0
    //   14: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   17: ldc_w 574
    //   20: aconst_null
    //   21: invokevirtual 337	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   24: astore_3
    //   25: aload_3
    //   26: ifnull +178 -> 204
    //   29: aload_3
    //   30: astore_1
    //   31: aload_3
    //   32: astore_2
    //   33: new 100	java/lang/StringBuilder
    //   36: dup
    //   37: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   40: aload_3
    //   41: invokeinterface 131 1 0
    //   46: invokevirtual 116	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   49: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: pop
    //   53: aload_3
    //   54: astore_1
    //   55: aload_3
    //   56: astore_2
    //   57: new 100	java/lang/StringBuilder
    //   60: dup
    //   61: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   64: aload_3
    //   65: invokeinterface 577 1 0
    //   70: invokevirtual 116	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   73: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: pop
    //   77: aload_3
    //   78: astore_1
    //   79: aload_3
    //   80: astore_2
    //   81: aload_3
    //   82: invokeinterface 325 1 0
    //   87: ifeq +117 -> 204
    //   90: aload_3
    //   91: astore_1
    //   92: aload_3
    //   93: astore_2
    //   94: new 579	com/ireadercity/b2/bean/f
    //   97: dup
    //   98: invokespecial 580	com/ireadercity/b2/bean/f:<init>	()V
    //   101: astore 5
    //   103: aload_3
    //   104: astore_1
    //   105: aload_3
    //   106: astore_2
    //   107: aload 5
    //   109: aload_3
    //   110: iconst_0
    //   111: invokeinterface 172 2 0
    //   116: invokevirtual 581	com/ireadercity/b2/bean/f:c	(I)V
    //   119: aload_3
    //   120: astore_1
    //   121: aload_3
    //   122: astore_2
    //   123: aload 5
    //   125: aload_3
    //   126: iconst_1
    //   127: invokeinterface 152 2 0
    //   132: invokevirtual 582	com/ireadercity/b2/bean/f:a	(Ljava/lang/String;)V
    //   135: aload_3
    //   136: astore_1
    //   137: aload_3
    //   138: astore_2
    //   139: aload 5
    //   141: aload_3
    //   142: iconst_2
    //   143: invokeinterface 172 2 0
    //   148: invokevirtual 583	com/ireadercity/b2/bean/f:b	(I)V
    //   151: aload_3
    //   152: astore_1
    //   153: aload_3
    //   154: astore_2
    //   155: aload 5
    //   157: aload_3
    //   158: iconst_3
    //   159: invokeinterface 172 2 0
    //   164: invokevirtual 585	com/ireadercity/b2/bean/f:a	(I)V
    //   167: aload_3
    //   168: astore_1
    //   169: aload_3
    //   170: astore_2
    //   171: aload 4
    //   173: aload 5
    //   175: invokeinterface 301 2 0
    //   180: pop
    //   181: goto -104 -> 77
    //   184: astore_3
    //   185: aload_1
    //   186: astore_2
    //   187: aload_3
    //   188: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   191: aload_1
    //   192: ifnull +9 -> 201
    //   195: aload_1
    //   196: invokeinterface 134 1 0
    //   201: aload 4
    //   203: areturn
    //   204: aload_3
    //   205: ifnull -4 -> 201
    //   208: aload_3
    //   209: invokeinterface 134 1 0
    //   214: aload 4
    //   216: areturn
    //   217: astore_1
    //   218: aload_2
    //   219: ifnull +9 -> 228
    //   222: aload_2
    //   223: invokeinterface 134 1 0
    //   228: aload_1
    //   229: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	230	0	this	a
    //   3	193	1	localObject1	Object
    //   217	12	1	localObject2	Object
    //   1	222	2	localObject3	Object
    //   24	146	3	localCursor	Cursor
    //   184	25	3	localException	Exception
    //   11	204	4	localArrayList	java.util.ArrayList
    //   101	73	5	localf	com.ireadercity.b2.bean.f
    // Exception table:
    //   from	to	target	type
    //   13	25	184	java/lang/Exception
    //   33	53	184	java/lang/Exception
    //   57	77	184	java/lang/Exception
    //   81	90	184	java/lang/Exception
    //   94	103	184	java/lang/Exception
    //   107	119	184	java/lang/Exception
    //   123	135	184	java/lang/Exception
    //   139	151	184	java/lang/Exception
    //   155	167	184	java/lang/Exception
    //   171	181	184	java/lang/Exception
    //   13	25	217	finally
    //   33	53	217	finally
    //   57	77	217	finally
    //   81	90	217	finally
    //   94	103	217	finally
    //   107	119	217	finally
    //   123	135	217	finally
    //   139	151	217	finally
    //   155	167	217	finally
    //   171	181	217	finally
    //   187	191	217	finally
  }
  
  public final void c(String paramString, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("book_id", paramString);
    localContentValues.put("category_id", Integer.valueOf(paramInt));
    this.b.insert("rsbookcategory", null, localContentValues);
  }
  
  public final boolean c(String paramString)
  {
    boolean bool = false;
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("last_reading_date", new Date().getTime());
      int i = this.b.update("book", localContentValues, "book_id='" + paramString + "'", null);
      if (i > 0) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramString)
    {
      paramString.getMessage();
      paramString.printStackTrace();
    }
    return false;
  }
  
  /* Error */
  public final java.util.List<d> d()
  {
    // Byte code:
    //   0: new 233	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 234	java/util/ArrayList:<init>	()V
    //   7: astore 5
    //   9: aload_0
    //   10: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   13: ldc_w 508
    //   16: bipush 10
    //   18: anewarray 121	java/lang/String
    //   21: dup
    //   22: iconst_0
    //   23: ldc_w 472
    //   26: aastore
    //   27: dup
    //   28: iconst_1
    //   29: ldc_w 476
    //   32: aastore
    //   33: dup
    //   34: iconst_2
    //   35: ldc_w 480
    //   38: aastore
    //   39: dup
    //   40: iconst_3
    //   41: ldc_w 484
    //   44: aastore
    //   45: dup
    //   46: iconst_4
    //   47: ldc_w 487
    //   50: aastore
    //   51: dup
    //   52: iconst_5
    //   53: ldc_w 491
    //   56: aastore
    //   57: dup
    //   58: bipush 6
    //   60: ldc_w 495
    //   63: aastore
    //   64: dup
    //   65: bipush 7
    //   67: ldc_w 498
    //   70: aastore
    //   71: dup
    //   72: bipush 8
    //   74: ldc_w 500
    //   77: aastore
    //   78: dup
    //   79: bipush 9
    //   81: ldc_w 504
    //   84: aastore
    //   85: aconst_null
    //   86: aconst_null
    //   87: aconst_null
    //   88: aconst_null
    //   89: ldc_w 591
    //   92: aconst_null
    //   93: invokevirtual 168	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   96: astore_3
    //   97: aload_3
    //   98: astore_2
    //   99: aload_3
    //   100: invokeinterface 145 1 0
    //   105: ifeq +223 -> 328
    //   108: aload_3
    //   109: astore_2
    //   110: new 468	com/ireadercity/b2/bean/d
    //   113: dup
    //   114: invokespecial 592	com/ireadercity/b2/bean/d:<init>	()V
    //   117: astore 4
    //   119: aload_3
    //   120: astore_2
    //   121: aload 4
    //   123: aload_3
    //   124: iconst_0
    //   125: invokeinterface 152 2 0
    //   130: invokevirtual 593	com/ireadercity/b2/bean/d:e	(Ljava/lang/String;)V
    //   133: aload_3
    //   134: astore_2
    //   135: aload 4
    //   137: aload_3
    //   138: iconst_1
    //   139: invokeinterface 152 2 0
    //   144: invokevirtual 594	com/ireadercity/b2/bean/d:f	(Ljava/lang/String;)V
    //   147: aload_3
    //   148: astore_2
    //   149: aload 4
    //   151: aload_3
    //   152: iconst_2
    //   153: invokeinterface 172 2 0
    //   158: invokevirtual 595	com/ireadercity/b2/bean/d:a	(I)V
    //   161: aload_3
    //   162: astore_2
    //   163: aload 4
    //   165: aload_3
    //   166: iconst_3
    //   167: invokeinterface 152 2 0
    //   172: invokevirtual 596	com/ireadercity/b2/bean/d:g	(Ljava/lang/String;)V
    //   175: aload_3
    //   176: astore_2
    //   177: aload 4
    //   179: aload_3
    //   180: iconst_4
    //   181: invokeinterface 600 2 0
    //   186: invokevirtual 603	com/ireadercity/b2/bean/d:b	(J)V
    //   189: aload_3
    //   190: astore_2
    //   191: aload 4
    //   193: aload_3
    //   194: iconst_5
    //   195: invokeinterface 600 2 0
    //   200: invokevirtual 605	com/ireadercity/b2/bean/d:c	(J)V
    //   203: aload_3
    //   204: astore_2
    //   205: aload 4
    //   207: aload_3
    //   208: bipush 6
    //   210: invokeinterface 152 2 0
    //   215: invokevirtual 607	com/ireadercity/b2/bean/d:b	(Ljava/lang/String;)V
    //   218: aload_3
    //   219: astore_2
    //   220: aload 4
    //   222: aload_3
    //   223: bipush 7
    //   225: invokeinterface 152 2 0
    //   230: invokevirtual 609	com/ireadercity/b2/bean/d:c	(Ljava/lang/String;)V
    //   233: aload_3
    //   234: astore_2
    //   235: aload 4
    //   237: aload_3
    //   238: bipush 8
    //   240: invokeinterface 152 2 0
    //   245: invokevirtual 610	com/ireadercity/b2/bean/d:d	(Ljava/lang/String;)V
    //   248: aload_3
    //   249: astore_2
    //   250: aload 4
    //   252: aload_3
    //   253: bipush 9
    //   255: invokeinterface 600 2 0
    //   260: invokevirtual 612	com/ireadercity/b2/bean/d:a	(J)V
    //   263: aload_3
    //   264: astore_2
    //   265: new 247	com/ireadercity/b2/bean/NetBookInfo
    //   268: dup
    //   269: invokespecial 248	com/ireadercity/b2/bean/NetBookInfo:<init>	()V
    //   272: astore 6
    //   274: aload_3
    //   275: astore_2
    //   276: aload 6
    //   278: aload 4
    //   280: invokevirtual 478	com/ireadercity/b2/bean/d:h	()Ljava/lang/String;
    //   283: invokevirtual 309	com/ireadercity/b2/bean/NetBookInfo:k	(Ljava/lang/String;)V
    //   286: aload_3
    //   287: astore_2
    //   288: aload 4
    //   290: aload 6
    //   292: invokevirtual 615	com/ireadercity/b2/bean/d:a	(Lcom/ireadercity/b2/bean/NetBookInfo;)V
    //   295: aload_3
    //   296: astore_2
    //   297: aload 4
    //   299: invokevirtual 470	com/ireadercity/b2/bean/d:e	()Ljava/lang/String;
    //   302: pop
    //   303: aload_3
    //   304: astore_2
    //   305: aload 5
    //   307: aload 4
    //   309: invokeinterface 301 2 0
    //   314: pop
    //   315: aload_3
    //   316: astore_2
    //   317: aload_3
    //   318: invokeinterface 325 1 0
    //   323: istore_1
    //   324: iload_1
    //   325: ifne -217 -> 108
    //   328: aload_3
    //   329: ifnull +9 -> 338
    //   332: aload_3
    //   333: invokeinterface 134 1 0
    //   338: aload 5
    //   340: areturn
    //   341: astore 4
    //   343: aconst_null
    //   344: astore_3
    //   345: aload_3
    //   346: astore_2
    //   347: aload 4
    //   349: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   352: aload_3
    //   353: ifnull +9 -> 362
    //   356: aload_3
    //   357: invokeinterface 134 1 0
    //   362: aload 5
    //   364: areturn
    //   365: astore_3
    //   366: aconst_null
    //   367: astore_2
    //   368: aload_2
    //   369: ifnull +9 -> 378
    //   372: aload_2
    //   373: invokeinterface 134 1 0
    //   378: aload_3
    //   379: athrow
    //   380: astore_3
    //   381: goto -13 -> 368
    //   384: astore 4
    //   386: goto -41 -> 345
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	389	0	this	a
    //   323	2	1	bool	boolean
    //   98	275	2	localCursor1	Cursor
    //   96	261	3	localCursor2	Cursor
    //   365	14	3	localObject1	Object
    //   380	1	3	localObject2	Object
    //   117	191	4	locald	d
    //   341	7	4	localException1	Exception
    //   384	1	4	localException2	Exception
    //   7	356	5	localArrayList	java.util.ArrayList
    //   272	19	6	localNetBookInfo	com.ireadercity.b2.bean.NetBookInfo
    // Exception table:
    //   from	to	target	type
    //   9	97	341	java/lang/Exception
    //   9	97	365	finally
    //   99	108	380	finally
    //   110	119	380	finally
    //   121	133	380	finally
    //   135	147	380	finally
    //   149	161	380	finally
    //   163	175	380	finally
    //   177	189	380	finally
    //   191	203	380	finally
    //   205	218	380	finally
    //   220	233	380	finally
    //   235	248	380	finally
    //   250	263	380	finally
    //   265	274	380	finally
    //   276	286	380	finally
    //   288	295	380	finally
    //   297	303	380	finally
    //   305	315	380	finally
    //   317	324	380	finally
    //   347	352	380	finally
    //   99	108	384	java/lang/Exception
    //   110	119	384	java/lang/Exception
    //   121	133	384	java/lang/Exception
    //   135	147	384	java/lang/Exception
    //   149	161	384	java/lang/Exception
    //   163	175	384	java/lang/Exception
    //   177	189	384	java/lang/Exception
    //   191	203	384	java/lang/Exception
    //   205	218	384	java/lang/Exception
    //   220	233	384	java/lang/Exception
    //   235	248	384	java/lang/Exception
    //   250	263	384	java/lang/Exception
    //   265	274	384	java/lang/Exception
    //   276	286	384	java/lang/Exception
    //   288	295	384	java/lang/Exception
    //   297	303	384	java/lang/Exception
    //   305	315	384	java/lang/Exception
    //   317	324	384	java/lang/Exception
  }
  
  public final void d(String paramString, int paramInt)
  {
    this.b.delete("rsbookcategory", "book_id = '" + paramString + "' AND category_id=" + paramInt, null);
  }
  
  public final boolean d(String paramString)
  {
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("status", Integer.valueOf(1));
      int i = this.b.update("book", localContentValues, "book_id='" + paramString + "'", null);
      return i > 0;
    }
    catch (Exception paramString)
    {
      paramString.getMessage();
      paramString.printStackTrace();
    }
    return false;
  }
  
  public final void e()
  {
    this.b.execSQL("delete from downloadinfo");
  }
  
  public final boolean e(String paramString)
  {
    Object localObject4 = null;
    Object localObject3 = null;
    boolean bool2 = false;
    boolean bool1 = false;
    localObject2 = localObject3;
    localObject1 = localObject4;
    try
    {
      paramString = "SELECT * FROM book where title = '" + paramString + "';";
      localObject2 = localObject3;
      localObject1 = localObject4;
      paramString = this.b.rawQuery(paramString, null);
      localObject2 = paramString;
      localObject1 = paramString;
      boolean bool3 = paramString.moveToFirst();
      if (bool3) {
        bool1 = true;
      }
      bool2 = bool1;
      if (paramString != null)
      {
        paramString.close();
        bool2 = bool1;
      }
    }
    catch (Exception paramString)
    {
      localObject1 = localObject2;
      paramString.getMessage();
      localObject1 = localObject2;
      paramString.printStackTrace();
      return false;
    }
    finally
    {
      if (localObject1 == null) {
        break label142;
      }
      ((Cursor)localObject1).close();
    }
    return bool2;
  }
  
  /* Error */
  public final boolean f(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 98
    //   4: monitorenter
    //   5: aload_0
    //   6: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   9: astore 4
    //   11: new 100	java/lang/StringBuilder
    //   14: dup
    //   15: ldc_w 551
    //   18: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: ldc -95
    //   27: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: astore_1
    //   34: aload 4
    //   36: ldc -93
    //   38: iconst_1
    //   39: anewarray 121	java/lang/String
    //   42: dup
    //   43: iconst_0
    //   44: ldc 52
    //   46: aastore
    //   47: aload_1
    //   48: aconst_null
    //   49: aconst_null
    //   50: aconst_null
    //   51: aconst_null
    //   52: invokevirtual 125	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   55: astore_1
    //   56: aload_1
    //   57: astore_3
    //   58: aload_3
    //   59: astore_1
    //   60: aload_3
    //   61: invokeinterface 131 1 0
    //   66: istore_2
    //   67: iload_2
    //   68: ifle +18 -> 86
    //   71: aload_3
    //   72: ifnull +9 -> 81
    //   75: aload_3
    //   76: invokeinterface 134 1 0
    //   81: ldc 98
    //   83: monitorexit
    //   84: iconst_1
    //   85: ireturn
    //   86: aload_3
    //   87: ifnull +9 -> 96
    //   90: aload_3
    //   91: invokeinterface 134 1 0
    //   96: ldc 98
    //   98: monitorexit
    //   99: iconst_0
    //   100: ireturn
    //   101: astore 4
    //   103: aconst_null
    //   104: astore_3
    //   105: aload_3
    //   106: astore_1
    //   107: aload 4
    //   109: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   112: aload_3
    //   113: ifnull +9 -> 122
    //   116: aload_3
    //   117: invokeinterface 134 1 0
    //   122: ldc 98
    //   124: monitorexit
    //   125: iconst_0
    //   126: ireturn
    //   127: aload_3
    //   128: ifnull +9 -> 137
    //   131: aload_3
    //   132: invokeinterface 134 1 0
    //   137: aload_1
    //   138: athrow
    //   139: astore_1
    //   140: ldc 98
    //   142: monitorexit
    //   143: aload_1
    //   144: athrow
    //   145: astore 4
    //   147: aload_1
    //   148: astore_3
    //   149: aload 4
    //   151: astore_1
    //   152: goto -25 -> 127
    //   155: astore 4
    //   157: goto -52 -> 105
    //   160: astore_1
    //   161: goto -34 -> 127
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	this	a
    //   0	164	1	paramString	String
    //   66	2	2	i	int
    //   1	148	3	str	String
    //   9	26	4	localSQLiteDatabase	SQLiteDatabase
    //   101	7	4	localException1	Exception
    //   145	5	4	localObject	Object
    //   155	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   5	56	101	java/lang/Exception
    //   75	81	139	finally
    //   81	84	139	finally
    //   90	96	139	finally
    //   96	99	139	finally
    //   116	122	139	finally
    //   122	125	139	finally
    //   131	137	139	finally
    //   137	139	139	finally
    //   140	143	139	finally
    //   60	67	145	finally
    //   107	112	145	finally
    //   60	67	155	java/lang/Exception
    //   5	56	160	finally
  }
  
  public final com.ireadercity.b2.bean.b g(String paramString)
  {
    Object localObject = this.b;
    paramString = "book_id='" + paramString + "'";
    Cursor localCursor = ((SQLiteDatabase)localObject).query("book", new String[] { "book_id", "path", "title", "summary", "author", "publisher", "cover_path", "subject", "language", "status", "type", "last_reading_date", "txt_chapter_size", "store_bookurl", "store_bookid", "last_chapter_id" }, paramString, null, null, null, null);
    if (localCursor != null) {}
    for (;;)
    {
      try
      {
        localCursor.moveToFirst();
        paramString = new com.ireadercity.b2.bean.b();
        String str;
        paramString = null;
      }
      catch (CursorIndexOutOfBoundsException localCursorIndexOutOfBoundsException1)
      {
        localCursorIndexOutOfBoundsException1 = localCursorIndexOutOfBoundsException1;
        paramString = null;
        localCursorIndexOutOfBoundsException1.getMessage();
        localCursorIndexOutOfBoundsException1.printStackTrace();
        str = paramString;
        return paramString;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
    }
  }
  
  /* Error */
  public final java.util.ArrayList<java.util.HashMap<String, String>> h(String paramString)
  {
    // Byte code:
    //   0: new 233	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 234	java/util/ArrayList:<init>	()V
    //   7: astore 5
    //   9: aload_0
    //   10: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   13: astore 4
    //   15: new 100	java/lang/StringBuilder
    //   18: dup
    //   19: ldc 102
    //   21: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   24: aload_1
    //   25: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: ldc -95
    //   30: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: astore_1
    //   37: aload 4
    //   39: ldc 76
    //   41: bipush 6
    //   43: anewarray 121	java/lang/String
    //   46: dup
    //   47: iconst_0
    //   48: ldc -116
    //   50: aastore
    //   51: dup
    //   52: iconst_1
    //   53: ldc 23
    //   55: aastore
    //   56: dup
    //   57: iconst_2
    //   58: ldc 29
    //   60: aastore
    //   61: dup
    //   62: iconst_3
    //   63: ldc 74
    //   65: aastore
    //   66: dup
    //   67: iconst_4
    //   68: ldc 42
    //   70: aastore
    //   71: dup
    //   72: iconst_5
    //   73: ldc 52
    //   75: aastore
    //   76: aload_1
    //   77: aconst_null
    //   78: aconst_null
    //   79: aconst_null
    //   80: ldc -114
    //   82: invokevirtual 125	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   85: astore 4
    //   87: aload 4
    //   89: astore_1
    //   90: aload 4
    //   92: invokeinterface 145 1 0
    //   97: ifeq +173 -> 270
    //   100: aload 4
    //   102: astore_1
    //   103: aload 4
    //   105: iconst_4
    //   106: invokeinterface 540 2 0
    //   111: fstore_2
    //   112: aload 4
    //   114: astore_1
    //   115: new 147	java/util/HashMap
    //   118: dup
    //   119: invokespecial 148	java/util/HashMap:<init>	()V
    //   122: astore 6
    //   124: aload 4
    //   126: astore_1
    //   127: aload 6
    //   129: ldc -116
    //   131: aload 4
    //   133: iconst_0
    //   134: invokeinterface 152 2 0
    //   139: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   142: pop
    //   143: aload 4
    //   145: astore_1
    //   146: aload 6
    //   148: ldc 23
    //   150: aload 4
    //   152: iconst_1
    //   153: invokeinterface 152 2 0
    //   158: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   161: pop
    //   162: aload 4
    //   164: astore_1
    //   165: aload 6
    //   167: ldc 29
    //   169: aload 4
    //   171: iconst_2
    //   172: invokeinterface 152 2 0
    //   177: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   180: pop
    //   181: aload 4
    //   183: astore_1
    //   184: aload 6
    //   186: ldc 74
    //   188: aload 4
    //   190: iconst_3
    //   191: invokeinterface 152 2 0
    //   196: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   199: pop
    //   200: aload 4
    //   202: astore_1
    //   203: aload 6
    //   205: ldc 52
    //   207: aload 4
    //   209: iconst_5
    //   210: invokeinterface 152 2 0
    //   215: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   218: pop
    //   219: aload 4
    //   221: astore_1
    //   222: aload 6
    //   224: ldc 42
    //   226: new 100	java/lang/StringBuilder
    //   229: dup
    //   230: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   233: fload_2
    //   234: invokevirtual 404	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   237: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   240: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   243: pop
    //   244: aload 4
    //   246: astore_1
    //   247: aload 5
    //   249: aload 6
    //   251: invokevirtual 638	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   254: pop
    //   255: aload 4
    //   257: astore_1
    //   258: aload 4
    //   260: invokeinterface 325 1 0
    //   265: istore_3
    //   266: iload_3
    //   267: ifne -167 -> 100
    //   270: aload 4
    //   272: ifnull +10 -> 282
    //   275: aload 4
    //   277: invokeinterface 134 1 0
    //   282: aload 5
    //   284: areturn
    //   285: astore 5
    //   287: aconst_null
    //   288: astore 4
    //   290: aload 4
    //   292: astore_1
    //   293: aload 5
    //   295: invokevirtual 66	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   298: pop
    //   299: aload 4
    //   301: astore_1
    //   302: aload 5
    //   304: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   307: aload 4
    //   309: ifnull +10 -> 319
    //   312: aload 4
    //   314: invokeinterface 134 1 0
    //   319: aconst_null
    //   320: areturn
    //   321: astore 4
    //   323: aconst_null
    //   324: astore_1
    //   325: aload_1
    //   326: ifnull +9 -> 335
    //   329: aload_1
    //   330: invokeinterface 134 1 0
    //   335: aload 4
    //   337: athrow
    //   338: astore 4
    //   340: goto -15 -> 325
    //   343: astore 5
    //   345: goto -55 -> 290
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	348	0	this	a
    //   0	348	1	paramString	String
    //   111	123	2	f	float
    //   265	2	3	bool	boolean
    //   13	300	4	localObject1	Object
    //   321	15	4	localObject2	Object
    //   338	1	4	localObject3	Object
    //   7	276	5	localArrayList	java.util.ArrayList
    //   285	18	5	localException1	Exception
    //   343	1	5	localException2	Exception
    //   122	128	6	localHashMap	java.util.HashMap
    // Exception table:
    //   from	to	target	type
    //   9	87	285	java/lang/Exception
    //   9	87	321	finally
    //   90	100	338	finally
    //   103	112	338	finally
    //   115	124	338	finally
    //   127	143	338	finally
    //   146	162	338	finally
    //   165	181	338	finally
    //   184	200	338	finally
    //   203	219	338	finally
    //   222	244	338	finally
    //   247	255	338	finally
    //   258	266	338	finally
    //   293	299	338	finally
    //   302	307	338	finally
    //   90	100	343	java/lang/Exception
    //   103	112	343	java/lang/Exception
    //   115	124	343	java/lang/Exception
    //   127	143	343	java/lang/Exception
    //   146	162	343	java/lang/Exception
    //   165	181	343	java/lang/Exception
    //   184	200	343	java/lang/Exception
    //   203	219	343	java/lang/Exception
    //   222	244	343	java/lang/Exception
    //   247	255	343	java/lang/Exception
    //   258	266	343	java/lang/Exception
  }
  
  /* Error */
  public final java.util.ArrayList<java.util.HashMap<String, String>> i(String paramString)
  {
    // Byte code:
    //   0: new 233	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 234	java/util/ArrayList:<init>	()V
    //   7: astore 5
    //   9: aload_0
    //   10: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   13: astore 4
    //   15: new 100	java/lang/StringBuilder
    //   18: dup
    //   19: ldc 102
    //   21: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   24: aload_1
    //   25: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: ldc -95
    //   30: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: astore_1
    //   37: aload 4
    //   39: ldc 56
    //   41: bipush 6
    //   43: anewarray 121	java/lang/String
    //   46: dup
    //   47: iconst_0
    //   48: ldc -116
    //   50: aastore
    //   51: dup
    //   52: iconst_1
    //   53: ldc 23
    //   55: aastore
    //   56: dup
    //   57: iconst_2
    //   58: ldc 29
    //   60: aastore
    //   61: dup
    //   62: iconst_3
    //   63: ldc 31
    //   65: aastore
    //   66: dup
    //   67: iconst_4
    //   68: ldc 42
    //   70: aastore
    //   71: dup
    //   72: iconst_5
    //   73: ldc 52
    //   75: aastore
    //   76: aload_1
    //   77: aconst_null
    //   78: aconst_null
    //   79: aconst_null
    //   80: ldc_w 559
    //   83: invokevirtual 125	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   86: astore 4
    //   88: aload 4
    //   90: astore_1
    //   91: aload 4
    //   93: invokeinterface 145 1 0
    //   98: ifeq +173 -> 271
    //   101: aload 4
    //   103: astore_1
    //   104: aload 4
    //   106: iconst_4
    //   107: invokeinterface 540 2 0
    //   112: fstore_2
    //   113: aload 4
    //   115: astore_1
    //   116: new 147	java/util/HashMap
    //   119: dup
    //   120: invokespecial 148	java/util/HashMap:<init>	()V
    //   123: astore 6
    //   125: aload 4
    //   127: astore_1
    //   128: aload 6
    //   130: ldc -116
    //   132: aload 4
    //   134: iconst_0
    //   135: invokeinterface 152 2 0
    //   140: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   143: pop
    //   144: aload 4
    //   146: astore_1
    //   147: aload 6
    //   149: ldc 23
    //   151: aload 4
    //   153: iconst_1
    //   154: invokeinterface 152 2 0
    //   159: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   162: pop
    //   163: aload 4
    //   165: astore_1
    //   166: aload 6
    //   168: ldc 29
    //   170: aload 4
    //   172: iconst_2
    //   173: invokeinterface 152 2 0
    //   178: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   181: pop
    //   182: aload 4
    //   184: astore_1
    //   185: aload 6
    //   187: ldc 31
    //   189: aload 4
    //   191: iconst_3
    //   192: invokeinterface 152 2 0
    //   197: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   200: pop
    //   201: aload 4
    //   203: astore_1
    //   204: aload 6
    //   206: ldc 52
    //   208: aload 4
    //   210: iconst_5
    //   211: invokeinterface 152 2 0
    //   216: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   219: pop
    //   220: aload 4
    //   222: astore_1
    //   223: aload 6
    //   225: ldc 42
    //   227: new 100	java/lang/StringBuilder
    //   230: dup
    //   231: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   234: fload_2
    //   235: invokevirtual 404	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   238: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   241: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   244: pop
    //   245: aload 4
    //   247: astore_1
    //   248: aload 5
    //   250: aload 6
    //   252: invokevirtual 638	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   255: pop
    //   256: aload 4
    //   258: astore_1
    //   259: aload 4
    //   261: invokeinterface 325 1 0
    //   266: istore_3
    //   267: iload_3
    //   268: ifne -167 -> 101
    //   271: aload 4
    //   273: ifnull +10 -> 283
    //   276: aload 4
    //   278: invokeinterface 134 1 0
    //   283: aload 5
    //   285: areturn
    //   286: astore 5
    //   288: aconst_null
    //   289: astore 4
    //   291: aload 4
    //   293: astore_1
    //   294: aload 5
    //   296: invokevirtual 66	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   299: pop
    //   300: aload 4
    //   302: astore_1
    //   303: aload 5
    //   305: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   308: aload 4
    //   310: ifnull +10 -> 320
    //   313: aload 4
    //   315: invokeinterface 134 1 0
    //   320: aconst_null
    //   321: areturn
    //   322: astore 4
    //   324: aconst_null
    //   325: astore_1
    //   326: aload_1
    //   327: ifnull +9 -> 336
    //   330: aload_1
    //   331: invokeinterface 134 1 0
    //   336: aload 4
    //   338: athrow
    //   339: astore 4
    //   341: goto -15 -> 326
    //   344: astore 5
    //   346: goto -55 -> 291
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	349	0	this	a
    //   0	349	1	paramString	String
    //   112	123	2	f	float
    //   266	2	3	bool	boolean
    //   13	301	4	localObject1	Object
    //   322	15	4	localObject2	Object
    //   339	1	4	localObject3	Object
    //   7	277	5	localArrayList	java.util.ArrayList
    //   286	18	5	localException1	Exception
    //   344	1	5	localException2	Exception
    //   123	128	6	localHashMap	java.util.HashMap
    // Exception table:
    //   from	to	target	type
    //   9	88	286	java/lang/Exception
    //   9	88	322	finally
    //   91	101	339	finally
    //   104	113	339	finally
    //   116	125	339	finally
    //   128	144	339	finally
    //   147	163	339	finally
    //   166	182	339	finally
    //   185	201	339	finally
    //   204	220	339	finally
    //   223	245	339	finally
    //   248	256	339	finally
    //   259	267	339	finally
    //   294	300	339	finally
    //   303	308	339	finally
    //   91	101	344	java/lang/Exception
    //   104	113	344	java/lang/Exception
    //   116	125	344	java/lang/Exception
    //   128	144	344	java/lang/Exception
    //   147	163	344	java/lang/Exception
    //   166	182	344	java/lang/Exception
    //   185	201	344	java/lang/Exception
    //   204	220	344	java/lang/Exception
    //   223	245	344	java/lang/Exception
    //   248	256	344	java/lang/Exception
    //   259	267	344	java/lang/Exception
  }
  
  /* Error */
  public final java.util.ArrayList<java.util.HashMap<String, Object>> j(String paramString)
  {
    // Byte code:
    //   0: new 233	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 234	java/util/ArrayList:<init>	()V
    //   7: astore 4
    //   9: aload_0
    //   10: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   13: astore_3
    //   14: new 100	java/lang/StringBuilder
    //   17: dup
    //   18: ldc 102
    //   20: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   23: aload_1
    //   24: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: ldc -95
    //   29: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: astore_1
    //   36: aload_3
    //   37: ldc_w 517
    //   40: bipush 6
    //   42: anewarray 121	java/lang/String
    //   45: dup
    //   46: iconst_0
    //   47: ldc 23
    //   49: aastore
    //   50: dup
    //   51: iconst_1
    //   52: ldc 42
    //   54: aastore
    //   55: dup
    //   56: iconst_2
    //   57: ldc -56
    //   59: aastore
    //   60: dup
    //   61: iconst_3
    //   62: ldc_w 515
    //   65: aastore
    //   66: dup
    //   67: iconst_4
    //   68: ldc_w 641
    //   71: aastore
    //   72: dup
    //   73: iconst_5
    //   74: ldc -116
    //   76: aastore
    //   77: aload_1
    //   78: aconst_null
    //   79: aconst_null
    //   80: aconst_null
    //   81: ldc_w 643
    //   84: invokevirtual 125	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   87: astore_3
    //   88: aload_3
    //   89: astore_1
    //   90: aload_3
    //   91: invokeinterface 145 1 0
    //   96: ifeq +153 -> 249
    //   99: aload_3
    //   100: astore_1
    //   101: new 147	java/util/HashMap
    //   104: dup
    //   105: invokespecial 148	java/util/HashMap:<init>	()V
    //   108: astore 5
    //   110: aload_3
    //   111: astore_1
    //   112: aload 5
    //   114: ldc 23
    //   116: aload_3
    //   117: iconst_0
    //   118: invokeinterface 152 2 0
    //   123: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   126: pop
    //   127: aload_3
    //   128: astore_1
    //   129: aload 5
    //   131: ldc 42
    //   133: aload_3
    //   134: iconst_1
    //   135: invokeinterface 540 2 0
    //   140: invokestatic 47	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   143: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   146: pop
    //   147: aload_3
    //   148: astore_1
    //   149: aload 5
    //   151: ldc -56
    //   153: aload_3
    //   154: iconst_2
    //   155: invokeinterface 152 2 0
    //   160: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   163: pop
    //   164: aload_3
    //   165: astore_1
    //   166: aload 5
    //   168: ldc_w 515
    //   171: aload_3
    //   172: iconst_3
    //   173: invokeinterface 600 2 0
    //   178: invokestatic 224	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   181: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   184: pop
    //   185: aload_3
    //   186: astore_1
    //   187: aload 5
    //   189: ldc_w 641
    //   192: aload_3
    //   193: iconst_4
    //   194: invokeinterface 600 2 0
    //   199: invokestatic 224	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   202: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   205: pop
    //   206: aload_3
    //   207: astore_1
    //   208: aload 5
    //   210: ldc -116
    //   212: aload_3
    //   213: iconst_5
    //   214: invokeinterface 600 2 0
    //   219: invokestatic 224	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   222: invokevirtual 155	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   225: pop
    //   226: aload_3
    //   227: astore_1
    //   228: aload 4
    //   230: aload 5
    //   232: invokevirtual 638	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   235: pop
    //   236: aload_3
    //   237: astore_1
    //   238: aload_3
    //   239: invokeinterface 325 1 0
    //   244: istore_2
    //   245: iload_2
    //   246: ifne -147 -> 99
    //   249: aload_3
    //   250: ifnull +9 -> 259
    //   253: aload_3
    //   254: invokeinterface 134 1 0
    //   259: aload 4
    //   261: areturn
    //   262: astore 4
    //   264: aconst_null
    //   265: astore_3
    //   266: aload_3
    //   267: astore_1
    //   268: aload 4
    //   270: invokevirtual 66	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   273: pop
    //   274: aload_3
    //   275: astore_1
    //   276: aload 4
    //   278: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   281: aload_3
    //   282: ifnull +9 -> 291
    //   285: aload_3
    //   286: invokeinterface 134 1 0
    //   291: aconst_null
    //   292: areturn
    //   293: astore_3
    //   294: aconst_null
    //   295: astore_1
    //   296: aload_1
    //   297: ifnull +9 -> 306
    //   300: aload_1
    //   301: invokeinterface 134 1 0
    //   306: aload_3
    //   307: athrow
    //   308: astore_3
    //   309: goto -13 -> 296
    //   312: astore 4
    //   314: goto -48 -> 266
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	317	0	this	a
    //   0	317	1	paramString	String
    //   244	2	2	bool	boolean
    //   13	273	3	localObject1	Object
    //   293	14	3	localObject2	Object
    //   308	1	3	localObject3	Object
    //   7	253	4	localArrayList	java.util.ArrayList
    //   262	15	4	localException1	Exception
    //   312	1	4	localException2	Exception
    //   108	123	5	localHashMap	java.util.HashMap
    // Exception table:
    //   from	to	target	type
    //   9	88	262	java/lang/Exception
    //   9	88	293	finally
    //   90	99	308	finally
    //   101	110	308	finally
    //   112	127	308	finally
    //   129	147	308	finally
    //   149	164	308	finally
    //   166	185	308	finally
    //   187	206	308	finally
    //   208	226	308	finally
    //   228	236	308	finally
    //   238	245	308	finally
    //   268	274	308	finally
    //   276	281	308	finally
    //   90	99	312	java/lang/Exception
    //   101	110	312	java/lang/Exception
    //   112	127	312	java/lang/Exception
    //   129	147	312	java/lang/Exception
    //   149	164	312	java/lang/Exception
    //   166	185	312	java/lang/Exception
    //   187	206	312	java/lang/Exception
    //   208	226	312	java/lang/Exception
    //   228	236	312	java/lang/Exception
    //   238	245	312	java/lang/Exception
  }
  
  public final boolean k(String paramString)
  {
    boolean bool = false;
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("progress", Integer.valueOf(0));
      int i = this.b.update("chapter", localContentValues, "book_id='" + paramString + "'", null);
      if (i > 0) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramString)
    {
      paramString.getMessage();
      paramString.printStackTrace();
    }
    return false;
  }
  
  public final boolean l(String paramString)
  {
    boolean bool = false;
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("progress", Integer.valueOf(0));
      int i = this.b.update("chapterspine", localContentValues, "book_id='" + paramString + "'", null);
      if (i > 0) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramString)
    {
      paramString.getMessage();
      paramString.printStackTrace();
    }
    return false;
  }
  
  public final boolean m(String paramString)
  {
    boolean bool = false;
    new StringBuilder("====deleteBook======id=").append(paramString).toString();
    try
    {
      this.b.delete("chapter", "book_id='" + paramString + "'", null);
      this.b.delete("bookmark", "book_id='" + paramString + "'", null);
      this.b.delete("chapterspine", "book_id='" + paramString + "'", null);
      this.b.delete("rsbookcategory", "book_id = '" + paramString + "'", null);
      int i = this.b.delete("book", "book_id='" + paramString + "'", null);
      if (i > 0) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramString)
    {
      paramString.getMessage();
      paramString.printStackTrace();
    }
    return false;
  }
  
  public final boolean n(String paramString)
  {
    boolean bool = false;
    try
    {
      int i = this.b.delete("bookmark", "book_id='" + paramString + "'", null);
      if (i > 0) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramString)
    {
      paramString.getMessage();
      paramString.printStackTrace();
    }
    return false;
  }
  
  /* Error */
  public final boolean o(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: getfield 54	com/ireadercity/b2/c/a:b	Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore 4
    //   8: new 100	java/lang/StringBuilder
    //   11: dup
    //   12: ldc_w 648
    //   15: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: ldc -95
    //   24: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: astore_1
    //   31: aload 4
    //   33: ldc_w 457
    //   36: iconst_1
    //   37: anewarray 121	java/lang/String
    //   40: dup
    //   41: iconst_0
    //   42: ldc_w 455
    //   45: aastore
    //   46: aload_1
    //   47: aconst_null
    //   48: aconst_null
    //   49: aconst_null
    //   50: aconst_null
    //   51: invokevirtual 125	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   54: astore_1
    //   55: aload_1
    //   56: astore_3
    //   57: aload_3
    //   58: astore_1
    //   59: aload_3
    //   60: invokeinterface 131 1 0
    //   65: istore_2
    //   66: iload_2
    //   67: ifle +15 -> 82
    //   70: aload_3
    //   71: ifnull +9 -> 80
    //   74: aload_3
    //   75: invokeinterface 134 1 0
    //   80: iconst_1
    //   81: ireturn
    //   82: aload_3
    //   83: ifnull +9 -> 92
    //   86: aload_3
    //   87: invokeinterface 134 1 0
    //   92: iconst_0
    //   93: ireturn
    //   94: astore 4
    //   96: aconst_null
    //   97: astore_3
    //   98: aload_3
    //   99: astore_1
    //   100: aload 4
    //   102: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   105: aload_3
    //   106: ifnull +9 -> 115
    //   109: aload_3
    //   110: invokeinterface 134 1 0
    //   115: iconst_0
    //   116: ireturn
    //   117: astore_1
    //   118: aload_3
    //   119: ifnull +9 -> 128
    //   122: aload_3
    //   123: invokeinterface 134 1 0
    //   128: aload_1
    //   129: athrow
    //   130: astore 4
    //   132: aload_1
    //   133: astore_3
    //   134: aload 4
    //   136: astore_1
    //   137: goto -19 -> 118
    //   140: astore 4
    //   142: goto -44 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	a
    //   0	145	1	paramString	String
    //   65	2	2	i	int
    //   1	133	3	str	String
    //   6	26	4	localSQLiteDatabase	SQLiteDatabase
    //   94	7	4	localException1	Exception
    //   130	5	4	localObject	Object
    //   140	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   2	55	94	java/lang/Exception
    //   2	55	117	finally
    //   59	66	130	finally
    //   100	105	130	finally
    //   59	66	140	java/lang/Exception
  }
  
  public final void p(String paramString)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("categoryname", paramString);
    localContentValues.put("categorylevel", Integer.valueOf(1));
    localContentValues.put("latestmodifytime", Long.valueOf(System.currentTimeMillis()));
    localContentValues.put("createdtime", Long.valueOf(System.currentTimeMillis()));
    this.b.insert("category", null, localContentValues);
  }
  
  public final void q(String paramString)
  {
    this.b.delete("downloadinfo", "storebookid = '" + paramString + "'", null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */