package com.umeng.common.net;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.umeng.common.Log;
import com.umeng.common.b.g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class c
{
  private static final String a = c.class.getName();
  private static final String b = "umeng_download_task_list";
  private static final String c = "UMENG_DATA";
  private static final String d = "cp";
  private static final String e = "url";
  private static final String f = "progress";
  private static final String g = "last_modified";
  private static final String h = "extra";
  private static Context i;
  private static final String j = "yyyy-MM-dd HH:mm:ss";
  private c.a k = new c.a(this, i);
  
  public static c a(Context paramContext)
  {
    if ((i == null) && (paramContext == null)) {
      throw new NullPointerException();
    }
    if (i == null) {
      i = paramContext;
    }
    return c.b.a;
  }
  
  public List<String> a(String paramString)
  {
    paramString = this.k.getReadableDatabase().query("umeng_download_task_list", new String[] { "url" }, "cp=?", new String[] { paramString }, null, null, null, "1");
    ArrayList localArrayList = new ArrayList();
    paramString.moveToFirst();
    while (!paramString.isAfterLast())
    {
      localArrayList.add(paramString.getString(0));
      paramString.moveToNext();
    }
    paramString.close();
    return localArrayList;
  }
  
  public void a(int paramInt)
  {
    try
    {
      Date localDate = new Date(new Date().getTime() - paramInt * 1000);
      String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(localDate);
      str = " DELETE FROM umeng_download_task_list WHERE strftime('yyyy-MM-dd HH:mm:ss', last_modified)<=strftime('yyyy-MM-dd HH:mm:ss', '" + str + "')";
      this.k.getWritableDatabase().execSQL(str);
      Log.c(a, "clearOverdueTasks(" + paramInt + ") remove all tasks before " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(localDate));
      return;
    }
    catch (Exception localException)
    {
      Log.b(a, localException.getMessage());
    }
  }
  
  public void a(String paramString1, String paramString2, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("progress", Integer.valueOf(paramInt));
    localContentValues.put("last_modified", g.a());
    this.k.getWritableDatabase().update("umeng_download_task_list", localContentValues, "cp=? and url=?", new String[] { paramString1, paramString2 });
    Log.c(a, "updateProgress(" + paramString1 + ", " + paramString2 + ", " + paramInt + ")");
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("extra", paramString3);
    localContentValues.put("last_modified", g.a());
    this.k.getWritableDatabase().update("umeng_download_task_list", localContentValues, "cp=? and url=?", new String[] { paramString1, paramString2 });
    Log.c(a, "updateExtra(" + paramString1 + ", " + paramString2 + ", " + paramString3 + ")");
  }
  
  /* Error */
  public boolean a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 177	android/content/ContentValues
    //   3: dup
    //   4: invokespecial 178	android/content/ContentValues:<init>	()V
    //   7: astore 6
    //   9: aload 6
    //   11: ldc 15
    //   13: aload_1
    //   14: invokevirtual 194	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: aload 6
    //   19: ldc 18
    //   21: aload_2
    //   22: invokevirtual 194	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: aload 6
    //   27: ldc 21
    //   29: iconst_0
    //   30: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   33: invokevirtual 188	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   36: aload 6
    //   38: ldc 24
    //   40: invokestatic 192	com/umeng/common/b/g:a	()Ljava/lang/String;
    //   43: invokevirtual 194	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: aload_0
    //   47: getfield 57	com/umeng/common/net/c:k	Lcom/umeng/common/net/c$a;
    //   50: invokevirtual 73	com/umeng/common/net/c$a:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   53: ldc 9
    //   55: iconst_1
    //   56: anewarray 75	java/lang/String
    //   59: dup
    //   60: iconst_0
    //   61: ldc 21
    //   63: aastore
    //   64: ldc -60
    //   66: iconst_2
    //   67: anewarray 75	java/lang/String
    //   70: dup
    //   71: iconst_0
    //   72: aload_1
    //   73: aastore
    //   74: dup
    //   75: iconst_1
    //   76: aload_2
    //   77: aastore
    //   78: aconst_null
    //   79: aconst_null
    //   80: aconst_null
    //   81: ldc 79
    //   83: invokevirtual 85	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   86: astore 7
    //   88: aload 7
    //   90: invokeinterface 214 1 0
    //   95: ifle +50 -> 145
    //   98: getstatic 44	com/umeng/common/net/c:a	Ljava/lang/String;
    //   101: new 139	java/lang/StringBuilder
    //   104: dup
    //   105: ldc -40
    //   107: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   110: aload_1
    //   111: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: ldc -52
    //   116: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: aload_2
    //   120: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: ldc -38
    //   125: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: invokestatic 169	com/umeng/common/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: iconst_0
    //   135: istore_3
    //   136: aload 7
    //   138: invokeinterface 113 1 0
    //   143: iload_3
    //   144: ireturn
    //   145: aload_0
    //   146: getfield 57	com/umeng/common/net/c:k	Lcom/umeng/common/net/c$a;
    //   149: invokevirtual 154	com/umeng/common/net/c$a:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   152: ldc 9
    //   154: aconst_null
    //   155: aload 6
    //   157: invokevirtual 222	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   160: lstore 4
    //   162: lload 4
    //   164: ldc2_w 223
    //   167: lcmp
    //   168: ifne +49 -> 217
    //   171: iconst_0
    //   172: istore_3
    //   173: getstatic 44	com/umeng/common/net/c:a	Ljava/lang/String;
    //   176: new 139	java/lang/StringBuilder
    //   179: dup
    //   180: ldc -40
    //   182: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   185: aload_1
    //   186: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: ldc -52
    //   191: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: aload_2
    //   195: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: ldc -30
    //   200: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: lload 4
    //   205: invokevirtual 229	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   208: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   211: invokestatic 169	com/umeng/common/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   214: goto -78 -> 136
    //   217: iconst_1
    //   218: istore_3
    //   219: goto -46 -> 173
    //   222: astore 6
    //   224: iconst_0
    //   225: istore_3
    //   226: getstatic 44	com/umeng/common/net/c:a	Ljava/lang/String;
    //   229: new 139	java/lang/StringBuilder
    //   232: dup
    //   233: ldc -40
    //   235: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   238: aload_1
    //   239: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: ldc -52
    //   244: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: aload_2
    //   248: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: ldc -25
    //   253: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: aload 6
    //   258: invokevirtual 172	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   261: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   267: aload 6
    //   269: invokestatic 234	com/umeng/common/Log:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   272: iload_3
    //   273: ireturn
    //   274: astore 6
    //   276: goto -50 -> 226
    //   279: astore 6
    //   281: goto -55 -> 226
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	284	0	this	c
    //   0	284	1	paramString1	String
    //   0	284	2	paramString2	String
    //   135	138	3	bool	boolean
    //   160	44	4	l	long
    //   7	149	6	localContentValues	ContentValues
    //   222	46	6	localException1	Exception
    //   274	1	6	localException2	Exception
    //   279	1	6	localException3	Exception
    //   86	51	7	localCursor	Cursor
    // Exception table:
    //   from	to	target	type
    //   46	134	222	java/lang/Exception
    //   145	162	222	java/lang/Exception
    //   173	214	274	java/lang/Exception
    //   136	143	279	java/lang/Exception
  }
  
  public int b(String paramString1, String paramString2)
  {
    paramString1 = this.k.getReadableDatabase().query("umeng_download_task_list", new String[] { "progress" }, "cp=? and url=?", new String[] { paramString1, paramString2 }, null, null, null, "1");
    if (paramString1.getCount() > 0) {
      paramString1.moveToFirst();
    }
    for (int m = paramString1.getInt(0);; m = -1)
    {
      paramString1.close();
      return m;
    }
  }
  
  public String c(String paramString1, String paramString2)
  {
    Object localObject = null;
    paramString2 = this.k.getReadableDatabase().query("umeng_download_task_list", new String[] { "extra" }, "cp=? and url=?", new String[] { paramString1, paramString2 }, null, null, null, "1");
    paramString1 = (String)localObject;
    if (paramString2.getCount() > 0)
    {
      paramString2.moveToFirst();
      paramString1 = paramString2.getString(0);
    }
    paramString2.close();
    return paramString1;
  }
  
  public Date d(String paramString1, String paramString2)
  {
    Object localObject2 = null;
    Cursor localCursor = this.k.getReadableDatabase().query("umeng_download_task_list", new String[] { "last_modified" }, "cp=? and url=?", new String[] { paramString1, paramString2 }, null, null, null, null);
    Object localObject1 = localObject2;
    if (localCursor.getCount() > 0)
    {
      localCursor.moveToFirst();
      localObject1 = localCursor.getString(0);
      Log.c(a, "getLastModified(" + paramString1 + ", " + paramString2 + "): " + (String)localObject1);
    }
    try
    {
      localObject1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String)localObject1);
      localCursor.close();
      return (Date)localObject1;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        Log.c(a, paramString1.getMessage());
        localObject1 = localObject2;
      }
    }
  }
  
  public void e(String paramString1, String paramString2)
  {
    this.k.getWritableDatabase().delete("umeng_download_task_list", "cp=? and url=?", new String[] { paramString1, paramString2 });
    Log.c(a, "delete(" + paramString1 + ", " + paramString2 + ")");
  }
  
  public void finalize()
  {
    this.k.close();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */