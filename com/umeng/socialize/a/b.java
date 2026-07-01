package com.umeng.socialize.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.bean.UMFriend.a;
import com.umeng.socom.Log;
import java.util.ArrayList;
import java.util.List;

public class b
  extends h
{
  private static final String N = b.class.getName();
  
  public b(Context paramContext)
  {
    super(paramContext, null);
  }
  
  private List<UMFriend> a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String[] paramArrayOfString, String paramString2, int paramInt)
  {
    if (paramSQLiteDatabase.isOpen())
    {
      ArrayList localArrayList = new ArrayList();
      paramSQLiteDatabase = paramSQLiteDatabase.query("friends", new String[] { "_id", "_name", "avatar_icon", "usid", "last_at_time", "fid", "alive", "link_name", "pinyin", "initial" }, paramString1, paramArrayOfString, null, null, paramString2);
      if (paramSQLiteDatabase.moveToNext())
      {
        i = paramInt;
        if (paramInt < 0) {
          break label125;
        }
        if (paramInt > 0) {}
      }
      else
      {
        a(paramSQLiteDatabase);
        return localArrayList;
      }
      int i = paramInt - 1;
      label125:
      paramString1 = new UMFriend();
      paramString1.setId(paramSQLiteDatabase.getInt(0));
      paramString1.setName(paramSQLiteDatabase.getString(1));
      paramString1.setIcon(paramSQLiteDatabase.getString(2));
      paramString1.setUsid(paramSQLiteDatabase.getString(3));
      paramString1.setLast_at_time(paramSQLiteDatabase.getLong(4));
      paramString1.setFid(paramSQLiteDatabase.getString(5));
      if (paramSQLiteDatabase.getInt(6) == 0) {}
      for (boolean bool = true;; bool = false)
      {
        paramString1.setAlive(bool);
        paramString1.setLink_name(paramSQLiteDatabase.getString(7));
        paramArrayOfString = new UMFriend.a();
        paramArrayOfString.a = paramSQLiteDatabase.getString(8);
        paramArrayOfString.b = paramSQLiteDatabase.getString(9);
        paramString1.setPinyin(paramArrayOfString);
        localArrayList.add(paramString1);
        paramInt = i;
        break;
      }
    }
    Log.e(N, "DB is close..............");
    return null;
  }
  
  /* Error */
  private void a(SQLiteDatabase paramSQLiteDatabase, UMFriend paramUMFriend)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: invokespecial 146	com/umeng/socialize/a/b:c	(Lcom/umeng/socialize/bean/UMFriend;)Landroid/content/ContentValues;
    //   7: astore_3
    //   8: aload_1
    //   9: invokevirtual 30	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   12: ifeq +56 -> 68
    //   15: aload_3
    //   16: ifnull +52 -> 68
    //   19: aload_1
    //   20: ldc 36
    //   22: aload_3
    //   23: ldc -108
    //   25: iconst_1
    //   26: anewarray 38	java/lang/String
    //   29: dup
    //   30: iconst_0
    //   31: aload_2
    //   32: invokevirtual 151	com/umeng/socialize/bean/UMFriend:getFid	()Ljava/lang/String;
    //   35: aastore
    //   36: invokevirtual 155	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   39: pop
    //   40: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   43: new 157	java/lang/StringBuilder
    //   46: dup
    //   47: ldc -97
    //   49: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   52: aload_2
    //   53: invokevirtual 162	com/umeng/socialize/bean/UMFriend:getName	()Ljava/lang/String;
    //   56: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: invokestatic 171	com/umeng/socom/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   65: aload_0
    //   66: monitorexit
    //   67: return
    //   68: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   71: new 157	java/lang/StringBuilder
    //   74: dup
    //   75: ldc -83
    //   77: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   80: aload_1
    //   81: invokevirtual 30	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   84: invokevirtual 176	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   87: ldc -78
    //   89: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: aload_2
    //   93: invokevirtual 162	com/umeng/socialize/bean/UMFriend:getName	()Ljava/lang/String;
    //   96: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: ldc -76
    //   101: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: aload_2
    //   105: invokevirtual 183	com/umeng/socialize/bean/UMFriend:getUsid	()Ljava/lang/String;
    //   108: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: ldc -71
    //   113: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: aload_2
    //   117: invokevirtual 151	com/umeng/socialize/bean/UMFriend:getFid	()Ljava/lang/String;
    //   120: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: ldc -69
    //   125: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: invokestatic 139	com/umeng/socom/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: goto -69 -> 65
    //   137: astore_1
    //   138: aload_0
    //   139: monitorexit
    //   140: aload_1
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	b
    //   0	142	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	142	2	paramUMFriend	UMFriend
    //   7	16	3	localContentValues	ContentValues
    // Exception table:
    //   from	to	target	type
    //   2	15	137	finally
    //   19	65	137	finally
    //   68	134	137	finally
  }
  
  /* Error */
  private void b(SQLiteDatabase paramSQLiteDatabase, UMFriend paramUMFriend)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: invokespecial 146	com/umeng/socialize/a/b:c	(Lcom/umeng/socialize/bean/UMFriend;)Landroid/content/ContentValues;
    //   7: astore_3
    //   8: aload_1
    //   9: invokevirtual 30	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   12: ifeq +45 -> 57
    //   15: aload_3
    //   16: ifnull +41 -> 57
    //   19: aload_1
    //   20: ldc 36
    //   22: ldc 40
    //   24: aload_3
    //   25: invokevirtual 191	android/database/sqlite/SQLiteDatabase:insertOrThrow	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   28: pop2
    //   29: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   32: new 157	java/lang/StringBuilder
    //   35: dup
    //   36: ldc -63
    //   38: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   41: aload_2
    //   42: invokevirtual 162	com/umeng/socialize/bean/UMFriend:getName	()Ljava/lang/String;
    //   45: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: invokestatic 171	com/umeng/socom/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: aload_0
    //   55: monitorexit
    //   56: return
    //   57: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   60: new 157	java/lang/StringBuilder
    //   63: dup
    //   64: ldc -61
    //   66: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   69: aload_1
    //   70: invokevirtual 30	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   73: invokevirtual 176	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   76: ldc -78
    //   78: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: aload_2
    //   82: invokevirtual 162	com/umeng/socialize/bean/UMFriend:getName	()Ljava/lang/String;
    //   85: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: ldc -76
    //   90: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: aload_2
    //   94: invokevirtual 183	com/umeng/socialize/bean/UMFriend:getUsid	()Ljava/lang/String;
    //   97: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: ldc -71
    //   102: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: aload_2
    //   106: invokevirtual 151	com/umeng/socialize/bean/UMFriend:getFid	()Ljava/lang/String;
    //   109: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: ldc -69
    //   114: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   120: invokestatic 139	com/umeng/socom/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   123: goto -69 -> 54
    //   126: astore_1
    //   127: aload_0
    //   128: monitorexit
    //   129: aload_1
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	this	b
    //   0	131	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	131	2	paramUMFriend	UMFriend
    //   7	18	3	localContentValues	ContentValues
    // Exception table:
    //   from	to	target	type
    //   2	15	126	finally
    //   19	54	126	finally
    //   57	123	126	finally
  }
  
  private ContentValues c(UMFriend paramUMFriend)
  {
    if ((!TextUtils.isEmpty(paramUMFriend.getName())) && (!TextUtils.isEmpty(paramUMFriend.getUsid())) && (!TextUtils.isEmpty(paramUMFriend.getFid())))
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("_name", paramUMFriend.getName());
      localContentValues.put("link_name", paramUMFriend.getLink_name());
      UMFriend.a locala = paramUMFriend.getPinyin();
      String str2 = "";
      String str1 = "";
      if (locala != null)
      {
        str2 = locala.a;
        str1 = locala.b;
      }
      localContentValues.put("pinyin", str2);
      localContentValues.put("initial", str1);
      localContentValues.put("usid", paramUMFriend.getUsid());
      localContentValues.put("fid", paramUMFriend.getFid());
      if (paramUMFriend.isAlive()) {}
      for (int i = 0;; i = 1)
      {
        localContentValues.put("alive", Integer.valueOf(i));
        if (!TextUtils.isEmpty(paramUMFriend.getIcon())) {
          localContentValues.put("avatar_icon", paramUMFriend.getIcon());
        }
        if (!TextUtils.isEmpty(paramUMFriend.getUsid())) {
          localContentValues.put("usid", paramUMFriend.getUsid());
        }
        if (paramUMFriend.getLast_at_time() > 0L) {
          localContentValues.put("last_at_time", Long.valueOf(paramUMFriend.getLast_at_time()));
        }
        return localContentValues;
      }
    }
    return null;
  }
  
  /* Error */
  public List<UMFriend> a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 250	com/umeng/socialize/a/b:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual 30	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   9: ifeq +35 -> 44
    //   12: aload_0
    //   13: aload_2
    //   14: ldc -4
    //   16: iconst_2
    //   17: anewarray 38	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: aload_1
    //   23: aastore
    //   24: dup
    //   25: iconst_1
    //   26: ldc -2
    //   28: aastore
    //   29: ldc_w 256
    //   32: iconst_m1
    //   33: invokespecial 258	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;
    //   36: astore_1
    //   37: aload_0
    //   38: aload_2
    //   39: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   42: aload_1
    //   43: areturn
    //   44: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   47: ldc -123
    //   49: invokestatic 139	com/umeng/socom/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   52: aconst_null
    //   53: astore_1
    //   54: goto -17 -> 37
    //   57: astore_1
    //   58: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   61: ldc -40
    //   63: aload_1
    //   64: invokestatic 264	com/umeng/socom/Log:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   67: aload_0
    //   68: aload_2
    //   69: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   72: aconst_null
    //   73: areturn
    //   74: astore_1
    //   75: aload_0
    //   76: aload_2
    //   77: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   80: aload_1
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	b
    //   0	82	1	paramString	String
    //   4	73	2	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   5	37	57	android/database/SQLException
    //   44	52	57	android/database/SQLException
    //   5	37	74	finally
    //   44	52	74	finally
    //   58	67	74	finally
  }
  
  /* Error */
  public List<UMFriend> a(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 250	com/umeng/socialize/a/b:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_3
    //   5: aload_3
    //   6: invokevirtual 30	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   9: ifeq +31 -> 40
    //   12: aload_0
    //   13: aload_3
    //   14: ldc_w 268
    //   17: iconst_1
    //   18: anewarray 38	java/lang/String
    //   21: dup
    //   22: iconst_0
    //   23: aload_1
    //   24: aastore
    //   25: ldc_w 270
    //   28: iload_2
    //   29: invokespecial 258	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;
    //   32: astore_1
    //   33: aload_0
    //   34: aload_3
    //   35: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   38: aload_1
    //   39: areturn
    //   40: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   43: ldc -123
    //   45: invokestatic 139	com/umeng/socom/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: aconst_null
    //   49: astore_1
    //   50: goto -17 -> 33
    //   53: astore_1
    //   54: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   57: ldc -40
    //   59: aload_1
    //   60: invokestatic 264	com/umeng/socom/Log:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   63: aload_0
    //   64: aload_3
    //   65: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   68: aconst_null
    //   69: areturn
    //   70: astore_1
    //   71: aload_0
    //   72: aload_3
    //   73: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   76: aload_1
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	b
    //   0	78	1	paramString	String
    //   0	78	2	paramInt	int
    //   4	69	3	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   5	33	53	android/database/SQLException
    //   40	48	53	android/database/SQLException
    //   5	33	70	finally
    //   40	48	70	finally
    //   54	63	70	finally
  }
  
  /* Error */
  public void a(UMFriend paramUMFriend)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 275	com/umeng/socialize/a/b:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore_2
    //   7: aload_2
    //   8: invokevirtual 30	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   11: ifeq +69 -> 80
    //   14: aload_0
    //   15: aload_2
    //   16: aload_1
    //   17: invokespecial 277	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;Lcom/umeng/socialize/bean/UMFriend;)V
    //   20: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   23: new 157	java/lang/StringBuilder
    //   26: dup
    //   27: ldc_w 279
    //   30: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   33: aload_1
    //   34: invokevirtual 162	com/umeng/socialize/bean/UMFriend:getName	()Ljava/lang/String;
    //   37: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: ldc_w 281
    //   43: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: aload_1
    //   47: invokevirtual 183	com/umeng/socialize/bean/UMFriend:getUsid	()Ljava/lang/String;
    //   50: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: ldc_w 283
    //   56: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: aload_1
    //   60: invokevirtual 235	com/umeng/socialize/bean/UMFriend:getLast_at_time	()J
    //   63: invokevirtual 286	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   66: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: invokestatic 171	com/umeng/socom/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   72: aload_0
    //   73: aload_2
    //   74: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   77: aload_0
    //   78: monitorexit
    //   79: return
    //   80: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   83: ldc -123
    //   85: invokestatic 139	com/umeng/socom/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   88: goto -16 -> 72
    //   91: astore_1
    //   92: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   95: ldc -40
    //   97: aload_1
    //   98: invokestatic 264	com/umeng/socom/Log:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   101: aload_0
    //   102: aload_2
    //   103: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   106: goto -29 -> 77
    //   109: astore_1
    //   110: aload_0
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    //   114: astore_1
    //   115: aload_0
    //   116: aload_2
    //   117: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   120: aload_1
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	b
    //   0	122	1	paramUMFriend	UMFriend
    //   6	111	2	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   7	72	91	android/database/SQLException
    //   80	88	91	android/database/SQLException
    //   2	7	109	finally
    //   72	77	109	finally
    //   101	106	109	finally
    //   115	122	109	finally
    //   7	72	114	finally
    //   80	88	114	finally
    //   92	101	114	finally
  }
  
  /* Error */
  public void a(List<UMFriend> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull +15 -> 20
    //   8: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   11: ldc_w 289
    //   14: invokestatic 171	com/umeng/socom/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: aload_0
    //   21: invokevirtual 275	com/umeng/socialize/a/b:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   24: astore_3
    //   25: aload_3
    //   26: astore_2
    //   27: aload_3
    //   28: invokevirtual 292	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   31: aload_3
    //   32: astore_2
    //   33: aload_1
    //   34: invokeinterface 296 1 0
    //   39: astore_1
    //   40: aload_3
    //   41: astore_2
    //   42: aload_1
    //   43: invokeinterface 301 1 0
    //   48: ifne +30 -> 78
    //   51: aload_3
    //   52: astore_2
    //   53: aload_3
    //   54: invokevirtual 304	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   57: aload_3
    //   58: ifnull +7 -> 65
    //   61: aload_3
    //   62: invokevirtual 307	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   65: aload_0
    //   66: aload_3
    //   67: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   70: goto -53 -> 17
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_1
    //   77: athrow
    //   78: aload_3
    //   79: astore_2
    //   80: aload_1
    //   81: invokeinterface 311 1 0
    //   86: checkcast 72	com/umeng/socialize/bean/UMFriend
    //   89: astore 4
    //   91: aload_3
    //   92: astore_2
    //   93: aload_0
    //   94: aload_3
    //   95: ldc_w 313
    //   98: iconst_2
    //   99: anewarray 38	java/lang/String
    //   102: dup
    //   103: iconst_0
    //   104: aload 4
    //   106: invokevirtual 151	com/umeng/socialize/bean/UMFriend:getFid	()Ljava/lang/String;
    //   109: aastore
    //   110: dup
    //   111: iconst_1
    //   112: aload 4
    //   114: invokevirtual 183	com/umeng/socialize/bean/UMFriend:getUsid	()Ljava/lang/String;
    //   117: aastore
    //   118: ldc_w 256
    //   121: iconst_m1
    //   122: invokespecial 258	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;
    //   125: astore 5
    //   127: aload 5
    //   129: ifnull +212 -> 341
    //   132: aload_3
    //   133: astore_2
    //   134: aload 5
    //   136: invokeinterface 317 1 0
    //   141: ifle +200 -> 341
    //   144: aload_3
    //   145: astore_2
    //   146: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   149: new 157	java/lang/StringBuilder
    //   152: dup
    //   153: ldc_w 319
    //   156: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   159: aload 4
    //   161: invokevirtual 151	com/umeng/socialize/bean/UMFriend:getFid	()Ljava/lang/String;
    //   164: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: ldc_w 321
    //   170: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: aload 4
    //   175: invokevirtual 183	com/umeng/socialize/bean/UMFriend:getUsid	()Ljava/lang/String;
    //   178: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: invokestatic 171	com/umeng/socom/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   187: aload_3
    //   188: astore_2
    //   189: aload 5
    //   191: invokeinterface 317 1 0
    //   196: iconst_1
    //   197: if_icmple +52 -> 249
    //   200: aload_3
    //   201: astore_2
    //   202: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   205: new 157	java/lang/StringBuilder
    //   208: dup
    //   209: ldc_w 323
    //   212: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   215: aload 4
    //   217: invokevirtual 151	com/umeng/socialize/bean/UMFriend:getFid	()Ljava/lang/String;
    //   220: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: ldc_w 321
    //   226: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: aload 4
    //   231: invokevirtual 183	com/umeng/socialize/bean/UMFriend:getUsid	()Ljava/lang/String;
    //   234: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: ldc_w 325
    //   240: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   246: invokestatic 139	com/umeng/socom/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   249: aload_3
    //   250: astore_2
    //   251: aload 5
    //   253: iconst_0
    //   254: invokeinterface 329 2 0
    //   259: checkcast 72	com/umeng/socialize/bean/UMFriend
    //   262: aload 4
    //   264: invokevirtual 333	com/umeng/socialize/bean/UMFriend:isUpdate	(Lcom/umeng/socialize/bean/UMFriend;)Z
    //   267: ifeq -227 -> 40
    //   270: aload_3
    //   271: astore_2
    //   272: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   275: new 157	java/lang/StringBuilder
    //   278: dup
    //   279: ldc_w 335
    //   282: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   285: aload 4
    //   287: invokevirtual 151	com/umeng/socialize/bean/UMFriend:getFid	()Ljava/lang/String;
    //   290: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: ldc_w 321
    //   296: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: aload 4
    //   301: invokevirtual 183	com/umeng/socialize/bean/UMFriend:getUsid	()Ljava/lang/String;
    //   304: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: invokestatic 171	com/umeng/socom/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   313: aload_3
    //   314: astore_2
    //   315: aload_0
    //   316: aload_3
    //   317: aload 4
    //   319: invokespecial 277	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;Lcom/umeng/socialize/bean/UMFriend;)V
    //   322: goto -282 -> 40
    //   325: astore_1
    //   326: aload_2
    //   327: ifnull +7 -> 334
    //   330: aload_2
    //   331: invokevirtual 307	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   334: aload_0
    //   335: aload_2
    //   336: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   339: aload_1
    //   340: athrow
    //   341: aload_3
    //   342: astore_2
    //   343: aload_0
    //   344: aload_3
    //   345: aload 4
    //   347: invokespecial 337	com/umeng/socialize/a/b:b	(Landroid/database/sqlite/SQLiteDatabase;Lcom/umeng/socialize/bean/UMFriend;)V
    //   350: goto -310 -> 40
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	353	0	this	b
    //   0	353	1	paramList	List<UMFriend>
    //   3	340	2	localObject	Object
    //   24	321	3	localSQLiteDatabase	SQLiteDatabase
    //   89	257	4	localUMFriend	UMFriend
    //   125	127	5	localList	List
    // Exception table:
    //   from	to	target	type
    //   8	17	73	finally
    //   61	65	73	finally
    //   65	70	73	finally
    //   330	334	73	finally
    //   334	341	73	finally
    //   20	25	325	finally
    //   27	31	325	finally
    //   33	40	325	finally
    //   42	51	325	finally
    //   53	57	325	finally
    //   80	91	325	finally
    //   93	127	325	finally
    //   134	144	325	finally
    //   146	187	325	finally
    //   189	200	325	finally
    //   202	249	325	finally
    //   251	270	325	finally
    //   272	313	325	finally
    //   315	322	325	finally
    //   343	350	325	finally
  }
  
  /* Error */
  @Deprecated
  public void b(UMFriend paramUMFriend)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 275	com/umeng/socialize/a/b:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore_2
    //   7: aload_2
    //   8: invokevirtual 30	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   11: ifeq +230 -> 241
    //   14: new 203	android/content/ContentValues
    //   17: dup
    //   18: invokespecial 204	android/content/ContentValues:<init>	()V
    //   21: astore_3
    //   22: aload_3
    //   23: ldc 48
    //   25: aload_1
    //   26: invokevirtual 235	com/umeng/socialize/bean/UMFriend:getLast_at_time	()J
    //   29: invokestatic 240	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   32: invokevirtual 243	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   35: aload_2
    //   36: invokevirtual 30	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   39: ifeq +109 -> 148
    //   42: aload_2
    //   43: ldc 36
    //   45: aload_3
    //   46: ldc -108
    //   48: iconst_1
    //   49: anewarray 38	java/lang/String
    //   52: dup
    //   53: iconst_0
    //   54: aload_1
    //   55: invokevirtual 151	com/umeng/socialize/bean/UMFriend:getFid	()Ljava/lang/String;
    //   58: aastore
    //   59: invokevirtual 155	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   62: pop
    //   63: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   66: new 157	java/lang/StringBuilder
    //   69: dup
    //   70: ldc -97
    //   72: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   75: aload_1
    //   76: invokevirtual 162	com/umeng/socialize/bean/UMFriend:getName	()Ljava/lang/String;
    //   79: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: invokestatic 171	com/umeng/socom/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   88: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   91: new 157	java/lang/StringBuilder
    //   94: dup
    //   95: ldc_w 341
    //   98: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   101: aload_1
    //   102: invokevirtual 162	com/umeng/socialize/bean/UMFriend:getName	()Ljava/lang/String;
    //   105: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: ldc_w 281
    //   111: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: aload_1
    //   115: invokevirtual 183	com/umeng/socialize/bean/UMFriend:getUsid	()Ljava/lang/String;
    //   118: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: ldc_w 283
    //   124: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: aload_1
    //   128: invokevirtual 235	com/umeng/socialize/bean/UMFriend:getLast_at_time	()J
    //   131: invokevirtual 286	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   134: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   137: invokestatic 171	com/umeng/socom/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   140: aload_0
    //   141: aload_2
    //   142: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   145: aload_0
    //   146: monitorexit
    //   147: return
    //   148: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   151: new 157	java/lang/StringBuilder
    //   154: dup
    //   155: ldc_w 343
    //   158: invokespecial 161	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   161: aload_2
    //   162: invokevirtual 30	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   165: invokevirtual 176	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   168: ldc -78
    //   170: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: aload_1
    //   174: invokevirtual 162	com/umeng/socialize/bean/UMFriend:getName	()Ljava/lang/String;
    //   177: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: ldc -76
    //   182: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: aload_1
    //   186: invokevirtual 183	com/umeng/socialize/bean/UMFriend:getUsid	()Ljava/lang/String;
    //   189: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: ldc -71
    //   194: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: aload_1
    //   198: invokevirtual 151	com/umeng/socialize/bean/UMFriend:getFid	()Ljava/lang/String;
    //   201: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: ldc -69
    //   206: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: invokestatic 139	com/umeng/socom/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   215: goto -127 -> 88
    //   218: astore_1
    //   219: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   222: ldc -40
    //   224: aload_1
    //   225: invokestatic 264	com/umeng/socom/Log:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   228: aload_0
    //   229: aload_2
    //   230: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   233: goto -88 -> 145
    //   236: astore_1
    //   237: aload_0
    //   238: monitorexit
    //   239: aload_1
    //   240: athrow
    //   241: getstatic 16	com/umeng/socialize/a/b:N	Ljava/lang/String;
    //   244: ldc -123
    //   246: invokestatic 139	com/umeng/socom/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   249: goto -109 -> 140
    //   252: astore_1
    //   253: aload_0
    //   254: aload_2
    //   255: invokevirtual 261	com/umeng/socialize/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   258: aload_1
    //   259: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	260	0	this	b
    //   0	260	1	paramUMFriend	UMFriend
    //   6	249	2	localSQLiteDatabase	SQLiteDatabase
    //   21	25	3	localContentValues	ContentValues
    // Exception table:
    //   from	to	target	type
    //   7	88	218	android/database/SQLException
    //   88	140	218	android/database/SQLException
    //   148	215	218	android/database/SQLException
    //   241	249	218	android/database/SQLException
    //   2	7	236	finally
    //   140	145	236	finally
    //   228	233	236	finally
    //   253	260	236	finally
    //   7	88	252	finally
    //   88	140	252	finally
    //   148	215	252	finally
    //   219	228	252	finally
    //   241	249	252	finally
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */