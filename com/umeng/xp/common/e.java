package com.umeng.xp.common;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class e
{
  public static final String a = "key";
  public static final String b = "value";
  public static final String c = "_id";
  private static final String d = "Preferences";
  private static final String e = "create table settings (_id integer primary key autoincrement, key text not null, value text not null);";
  private static final String f = "data";
  private static final String g = "settings";
  private static final int h = 1;
  private static e l = null;
  private Context i;
  private e.a j;
  private SQLiteDatabase k;
  
  private e(Context paramContext)
  {
    this.i = paramContext;
  }
  
  public static e a(Context paramContext)
  {
    if (l == null) {
      l = new e(paramContext.getApplicationContext());
    }
    return l;
  }
  
  public e a()
  {
    this.j = new e.a(this, this.i);
    this.k = this.j.getWritableDatabase();
    return this;
  }
  
  public String a(String paramString)
  {
    Object localObject = null;
    a();
    Cursor localCursor = this.k.query("settings", new String[] { "key", "value" }, "key=?", new String[] { paramString }, null, null, null);
    paramString = (String)localObject;
    if (localCursor != null)
    {
      paramString = (String)localObject;
      if (localCursor.getCount() > 0)
      {
        localCursor.moveToFirst();
        paramString = localCursor.getString(1);
        localCursor.close();
      }
    }
    b();
    return paramString;
  }
  
  public String a(String paramString1, String paramString2)
  {
    String str = a(paramString1);
    if (str != null)
    {
      paramString1 = str;
      if (!"".equals(str)) {}
    }
    else
    {
      paramString1 = new String(paramString2);
    }
    return paramString1;
  }
  
  public boolean a(String paramString, boolean paramBoolean)
  {
    paramString = a(paramString);
    if (paramString == null) {
      return paramBoolean;
    }
    return "true".equals(paramString);
  }
  
  public void b()
  {
    this.j.close();
  }
  
  public boolean b(String paramString)
  {
    paramString = a(paramString);
    if (paramString == null) {}
    while (!"true".equals(paramString)) {
      return false;
    }
    return true;
  }
  
  public boolean b(String paramString1, String paramString2)
  {
    boolean bool = true;
    a();
    Object localObject = this.k.query("settings", new String[] { "key", "value" }, "key=?", new String[] { paramString1 }, null, null, null);
    if ((localObject != null) && (((Cursor)localObject).getCount() > 0))
    {
      ((Cursor)localObject).close();
      localObject = new ContentValues();
      ((ContentValues)localObject).put("key", paramString1);
      ((ContentValues)localObject).put("value", paramString2);
      if (this.k.update("settings", (ContentValues)localObject, "key= ?", new String[] { paramString1 }) > 0) {
        bool = true;
      }
    }
    do
    {
      for (;;)
      {
        b();
        return bool;
        bool = false;
      }
      if (localObject != null) {
        ((Cursor)localObject).close();
      }
      localObject = new ContentValues();
      ((ContentValues)localObject).put("key", paramString1);
      ((ContentValues)localObject).put("value", paramString2);
    } while (this.k.insert("settings", null, (ContentValues)localObject) != -1L);
    for (;;)
    {
      bool = false;
    }
  }
  
  public boolean b(String paramString, boolean paramBoolean)
  {
    if (paramBoolean == true) {}
    for (String str = "true";; str = "false") {
      return b(paramString, str);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\common\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */