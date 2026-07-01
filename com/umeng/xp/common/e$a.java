package com.umeng.xp.common;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class e$a
  extends SQLiteOpenHelper
{
  public e$a(e parame, Context paramContext)
  {
    super(paramContext, "data", null, 1);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table settings (_id integer primary key autoincrement, key text not null, value text not null);");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    new StringBuilder("Upgrading database from version ").append(paramInt1).append(" to ").append(paramInt2).append(", which will destroy all old data").toString();
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS settings");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\common\e$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */