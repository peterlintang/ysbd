package com.umeng.socialize.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.umeng.socialize.bean.n;
import com.umeng.socom.Log;
import java.util.ArrayList;
import java.util.List;

public class e
  extends h
{
  private static final String N = e.class.getName();
  
  public e(Context paramContext)
  {
    super(paramContext, null);
  }
  
  private List<n> a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String[] paramArrayOfString, String paramString2)
  {
    if (paramSQLiteDatabase.isOpen())
    {
      ArrayList localArrayList = new ArrayList();
      paramSQLiteDatabase = paramSQLiteDatabase.query("platforms", new String[] { "keyword", "showord", "icon_light", "icon_grey", "alive" }, paramString1, paramArrayOfString, null, null, paramString2);
      for (;;)
      {
        if (!paramSQLiteDatabase.moveToNext())
        {
          a(paramSQLiteDatabase);
          return localArrayList;
        }
        paramString1 = new n();
        paramString1.a = paramSQLiteDatabase.getString(0);
        paramString1.b = paramSQLiteDatabase.getString(1);
      }
    }
    Log.e(N, "DB is close..............");
    return null;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */