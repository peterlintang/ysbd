package com.umeng.common.net;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.common.Log;

class c$a
  extends SQLiteOpenHelper
{
  private static final int b = 2;
  private static final String c = "CREATE TABLE umeng_download_task_list (cp TEXT, url TEXT, progress INTEGER, extra TEXT, last_modified TEXT, UNIQUE (cp,url) ON CONFLICT ABORT);";
  
  c$a(c paramc, Context paramContext)
  {
    super(paramContext, "UMENG_DATA", null, 2);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    Log.c(c.a(), "CREATE TABLE umeng_download_task_list (cp TEXT, url TEXT, progress INTEGER, extra TEXT, last_modified TEXT, UNIQUE (cp,url) ON CONFLICT ABORT);");
    paramSQLiteDatabase.execSQL("CREATE TABLE umeng_download_task_list (cp TEXT, url TEXT, progress INTEGER, extra TEXT, last_modified TEXT, UNIQUE (cp,url) ON CONFLICT ABORT);");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\c$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */