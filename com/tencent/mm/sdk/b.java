package com.tencent.mm.sdk;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.plugin.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class b
  implements SharedPreferences.Editor
{
  private Map<String, Object> a = new HashMap();
  private Set<String> b = new HashSet();
  private boolean c = false;
  private ContentResolver d;
  
  public b(ContentResolver paramContentResolver)
  {
    this.d = paramContentResolver;
  }
  
  public final void apply() {}
  
  public final SharedPreferences.Editor clear()
  {
    this.c = true;
    return this;
  }
  
  public final boolean commit()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.c)
    {
      this.d.delete(e.a, null, null);
      this.c = false;
    }
    Iterator localIterator = this.b.iterator();
    Object localObject1;
    while (localIterator.hasNext())
    {
      localObject1 = (String)localIterator.next();
      this.d.delete(e.a, "key = ?", new String[] { localObject1 });
    }
    localIterator = this.a.entrySet().iterator();
    label146:
    label302:
    label326:
    while (localIterator.hasNext())
    {
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = ((Map.Entry)localObject1).getValue();
      if (localObject2 == null)
      {
        c.a("MicroMsg.SDK.PluginProvider.Resolver", "unresolve failed, null value");
        i = 0;
        if (i != 0) {
          break label302;
        }
      }
      for (int i = 0;; i = 1)
      {
        if (i == 0) {
          break label326;
        }
        this.d.update(e.a, localContentValues, "key = ?", new String[] { (String)((Map.Entry)localObject1).getKey() });
        break;
        if ((localObject2 instanceof Integer))
        {
          i = 1;
          break label146;
        }
        if ((localObject2 instanceof Long))
        {
          i = 2;
          break label146;
        }
        if ((localObject2 instanceof String))
        {
          i = 3;
          break label146;
        }
        if ((localObject2 instanceof Boolean))
        {
          i = 4;
          break label146;
        }
        if ((localObject2 instanceof Float))
        {
          i = 5;
          break label146;
        }
        if ((localObject2 instanceof Double))
        {
          i = 6;
          break label146;
        }
        c.a("MicroMsg.SDK.PluginProvider.Resolver", "unresolve failed, unknown type=" + localObject2.getClass().toString());
        i = 0;
        break label146;
        localContentValues.put("type", Integer.valueOf(i));
        localContentValues.put("value", localObject2.toString());
      }
    }
    return true;
  }
  
  public final SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
  {
    this.a.put(paramString, Boolean.valueOf(paramBoolean));
    this.b.remove(paramString);
    return this;
  }
  
  public final SharedPreferences.Editor putFloat(String paramString, float paramFloat)
  {
    this.a.put(paramString, Float.valueOf(paramFloat));
    this.b.remove(paramString);
    return this;
  }
  
  public final SharedPreferences.Editor putInt(String paramString, int paramInt)
  {
    this.a.put(paramString, Integer.valueOf(paramInt));
    this.b.remove(paramString);
    return this;
  }
  
  public final SharedPreferences.Editor putLong(String paramString, long paramLong)
  {
    this.a.put(paramString, Long.valueOf(paramLong));
    this.b.remove(paramString);
    return this;
  }
  
  public final SharedPreferences.Editor putString(String paramString1, String paramString2)
  {
    this.a.put(paramString1, paramString2);
    this.b.remove(paramString1);
    return this;
  }
  
  public final SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
  {
    return null;
  }
  
  public final SharedPreferences.Editor remove(String paramString)
  {
    this.b.add(paramString);
    return this;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */