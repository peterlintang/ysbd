package com.umeng.socialize.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.socom.Log;

@Deprecated
public class f
  extends SQLiteOpenHelper
  implements g
{
  private static final String N = h.class.getName();
  
  public f(Context paramContext, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    super(paramContext, "USocialize.db", paramCursorFactory, 2);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    Log.c(N, " createSQL: " + "CREATE TABLE sns_account(_id INTEGER PRIMARY KEY AUTOINCREMENT,uid VARCHAR(20),user VARCHAR(20),avatar_icon VARCHAR(40),entity_key VARCHAR(20),content TEXT,data INTEGER(20),location VARCHAR(20));");
    paramSQLiteDatabase.execSQL("CREATE TABLE sns_account(_id INTEGER PRIMARY KEY AUTOINCREMENT,uid VARCHAR(20),user VARCHAR(20),avatar_icon VARCHAR(40),entity_key VARCHAR(20),content TEXT,data INTEGER(20),location VARCHAR(20));");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */