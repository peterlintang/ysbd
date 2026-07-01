package com.umeng.socialize.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.socom.Log;

public class h
  extends SQLiteOpenHelper
  implements g
{
  private static final String N = h.class.getName();
  
  public h(Context paramContext, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    super(paramContext, "USocialize.db", paramCursorFactory, 2);
  }
  
  protected void a(Cursor paramCursor)
  {
    if (paramCursor != null) {
      paramCursor.close();
    }
  }
  
  protected void a(SQLiteDatabase paramSQLiteDatabase)
  {
    if (paramSQLiteDatabase != null) {
      paramSQLiteDatabase.close();
    }
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.beginTransaction();
    Log.c(N, " createSQL: " + "CREATE TABLE comment(_id INTEGER PRIMARY KEY AUTOINCREMENT,uid VARCHAR(20),user VARCHAR(20),avatar_icon VARCHAR(40),entity_key VARCHAR(20),content TEXT,data INTEGER(20),location VARCHAR(20));");
    paramSQLiteDatabase.execSQL("CREATE TABLE comment(_id INTEGER PRIMARY KEY AUTOINCREMENT,uid VARCHAR(20),user VARCHAR(20),avatar_icon VARCHAR(40),entity_key VARCHAR(20),content TEXT,data INTEGER(20),location VARCHAR(20));");
    Log.c(N, " createSQL: " + "CREATE TABLE friends(_id INTEGER PRIMARY KEY AUTOINCREMENT,_name VARCHAR(20),fid VARCHAR(20),link_name VARCHAR(20),pinyin VARCHAR(20),initial VARCHAR(20),avatar_icon VARCHAR(20),usid VARCHAR(40),last_at_time INTEGER,alive INTEGER);");
    paramSQLiteDatabase.execSQL("CREATE TABLE friends(_id INTEGER PRIMARY KEY AUTOINCREMENT,_name VARCHAR(20),fid VARCHAR(20),link_name VARCHAR(20),pinyin VARCHAR(20),initial VARCHAR(20),avatar_icon VARCHAR(20),usid VARCHAR(40),last_at_time INTEGER,alive INTEGER);");
    Log.c(N, " createSQL: " + "CREATE TABLE platforms(_id INTEGER PRIMARY KEY AUTOINCREMENT,keyword VARCHAR(20),showord VARCHAR(20),icon_light VARCHAR(20),icon_grey VARCHAR(40),alive INTEGER);");
    paramSQLiteDatabase.execSQL("CREATE TABLE platforms(_id INTEGER PRIMARY KEY AUTOINCREMENT,keyword VARCHAR(20),showord VARCHAR(20),icon_light VARCHAR(20),icon_grey VARCHAR(40),alive INTEGER);");
    Log.c(N, " createSQL: " + "CREATE TABLE accounts(_id INTEGER PRIMARY KEY AUTOINCREMENT,acc_id VARCHAR(20),usid VARCHAR(20),keyword VARCHAR(20),username VARCHAR(20),gender VARCHAR(10),avatar_url VARCHAR(40),default_acc INTEGER);");
    paramSQLiteDatabase.execSQL("CREATE TABLE accounts(_id INTEGER PRIMARY KEY AUTOINCREMENT,acc_id VARCHAR(20),usid VARCHAR(20),keyword VARCHAR(20),username VARCHAR(20),gender VARCHAR(10),avatar_url VARCHAR(40),default_acc INTEGER);");
    paramSQLiteDatabase.setTransactionSuccessful();
    paramSQLiteDatabase.endTransaction();
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    Log.d(N, "DAOHelper.onUpgade do it  oldVersion:" + paramInt1 + "newVersion" + paramInt2);
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS comment;");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS friends;");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS platforms;");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS accounts;");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */