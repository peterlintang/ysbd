package com.umeng.newxp.common.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Environment;
import android.text.TextUtils;
import com.umeng.newxp.common.c.i;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class c
{
  private static final String a = "t";
  private static final String b = "t2";
  private String c = "";
  private String d = "";
  private boolean e = false;
  private boolean f = false;
  private boolean g = false;
  private SharedPreferences h = null;
  private b i = null;
  private SharedPreferences.Editor j = null;
  private b.a k = null;
  private Context l = null;
  private d m = null;
  private boolean n = false;
  
  public c(Context paramContext, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.e = paramBoolean1;
    this.n = paramBoolean2;
    this.c = paramString2;
    this.d = paramString1;
    this.l = paramContext;
    l3 = 0L;
    long l4 = 0L;
    if (paramContext != null)
    {
      this.h = paramContext.getSharedPreferences(paramString2, 0);
      l3 = this.h.getLong("t", 0L);
    }
    String str = Environment.getExternalStorageState();
    if (!i.a(str)) {
      if (str.equals("mounted"))
      {
        this.g = true;
        this.f = true;
        if (!this.f)
        {
          l2 = l3;
          l1 = l4;
          if (!this.g) {}
        }
        else
        {
          l2 = l3;
          l1 = l4;
          if (paramContext != null)
          {
            l2 = l3;
            l1 = l4;
            if (!i.a(paramString1))
            {
              this.m = g(paramString1);
              l2 = l3;
              l1 = l4;
              if (this.m != null) {
                l1 = l4;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      try
      {
        this.i = this.m.a(paramString2, 0);
        l1 = l4;
        l4 = this.i.a("t", 0L);
        if (paramBoolean2) {
          continue;
        }
        if (l3 <= l4) {
          continue;
        }
        l1 = l4;
        a(this.h, this.i);
        l1 = l4;
        this.i = this.m.a(paramString2, 0);
        l1 = l4;
        l2 = l3;
      }
      catch (Exception paramContext)
      {
        l2 = l1;
        l1 = l3;
        l3 = l2;
        l2 = l1;
        l1 = l3;
        continue;
      }
      if ((l2 != l1) || ((l2 == 0L) && (l1 == 0L)))
      {
        l3 = System.currentTimeMillis();
        if ((!this.n) || ((this.n) && (l2 == 0L) && (l1 == 0L))) {
          if (this.h != null)
          {
            paramContext = this.h.edit();
            paramContext.putLong("t2", l3);
            paramContext.commit();
          }
        }
      }
      try
      {
        if (this.i != null)
        {
          paramContext = this.i.c();
          paramContext.a("t2", l3);
          paramContext.b();
        }
        return;
      }
      catch (Exception paramContext)
      {
        return;
      }
      if (str.equals("mounted_ro"))
      {
        this.f = true;
        this.g = false;
        break;
      }
      this.g = false;
      this.f = false;
      break;
      if (l3 < l4)
      {
        l1 = l4;
        a(this.i, this.h);
        l1 = l4;
        this.h = paramContext.getSharedPreferences(paramString2, 0);
        l2 = l3;
        l1 = l4;
      }
      else
      {
        if (l3 != l4) {
          continue;
        }
        l1 = l4;
        a(this.h, this.i);
        l1 = l4;
        this.i = this.m.a(paramString2, 0);
        l2 = l3;
        l1 = l4;
        continue;
        l1 = l4;
        l2 = this.h.getLong("t2", 0L);
        l1 = l2;
      }
      try
      {
        l2 = this.i.a("t2", 0L);
        if ((l1 >= l2) || (l1 <= 0L)) {}
      }
      catch (Exception paramContext)
      {
        l2 = l4;
      }
      try
      {
        a(this.h, this.i);
        this.i = this.m.a(paramString2, 0);
        l3 = l2;
        l2 = l1;
        l1 = l3;
      }
      catch (Exception paramContext)
      {
        continue;
      }
      if ((l1 > l2) && (l2 > 0L))
      {
        a(this.i, this.h);
        this.h = paramContext.getSharedPreferences(paramString2, 0);
        l3 = l2;
        l2 = l1;
        l1 = l3;
      }
      else if ((l1 == 0L) && (l2 > 0L))
      {
        a(this.i, this.h);
        this.h = paramContext.getSharedPreferences(paramString2, 0);
        l3 = l2;
        l2 = l1;
        l1 = l3;
      }
      else
      {
        if ((l2 != 0L) || (l1 <= 0L)) {
          continue;
        }
        a(this.h, this.i);
        this.i = this.m.a(paramString2, 0);
        l3 = l2;
        l2 = l1;
        l1 = l3;
      }
    }
    if (l1 == l2)
    {
      a(this.h, this.i);
      this.i = this.m.a(paramString2, 0);
    }
    for (;;)
    {
      l3 = l2;
      l2 = l1;
      l1 = l3;
      break;
      l1 = l3;
      l2 = l4;
    }
  }
  
  private void a(SharedPreferences paramSharedPreferences, b paramb)
  {
    if ((paramSharedPreferences != null) && (paramb != null))
    {
      paramb = paramb.c();
      if (paramb != null)
      {
        paramb.a();
        paramSharedPreferences = paramSharedPreferences.getAll().entrySet().iterator();
        while (paramSharedPreferences.hasNext())
        {
          Object localObject = (Map.Entry)paramSharedPreferences.next();
          String str = (String)((Map.Entry)localObject).getKey();
          localObject = ((Map.Entry)localObject).getValue();
          if ((localObject instanceof String)) {
            paramb.a(str, (String)localObject);
          } else if ((localObject instanceof Integer)) {
            paramb.a(str, ((Integer)localObject).intValue());
          } else if ((localObject instanceof Long)) {
            paramb.a(str, ((Long)localObject).longValue());
          } else if ((localObject instanceof Float)) {
            paramb.a(str, ((Float)localObject).floatValue());
          } else if ((localObject instanceof Boolean)) {
            paramb.a(str, ((Boolean)localObject).booleanValue());
          }
        }
        paramb.b();
      }
    }
  }
  
  private void a(b paramb, SharedPreferences paramSharedPreferences)
  {
    if ((paramb != null) && (paramSharedPreferences != null))
    {
      paramSharedPreferences = paramSharedPreferences.edit();
      if (paramSharedPreferences != null)
      {
        paramSharedPreferences.clear();
        paramb = paramb.b().entrySet().iterator();
        while (paramb.hasNext())
        {
          Object localObject = (Map.Entry)paramb.next();
          String str = (String)((Map.Entry)localObject).getKey();
          localObject = ((Map.Entry)localObject).getValue();
          if ((localObject instanceof String)) {
            paramSharedPreferences.putString(str, (String)localObject);
          } else if ((localObject instanceof Integer)) {
            paramSharedPreferences.putInt(str, ((Integer)localObject).intValue());
          } else if ((localObject instanceof Long)) {
            paramSharedPreferences.putLong(str, ((Long)localObject).longValue());
          } else if ((localObject instanceof Float)) {
            paramSharedPreferences.putFloat(str, ((Float)localObject).floatValue());
          } else if ((localObject instanceof Boolean)) {
            paramSharedPreferences.putBoolean(str, ((Boolean)localObject).booleanValue());
          }
        }
        paramSharedPreferences.commit();
      }
    }
  }
  
  private boolean e()
  {
    if (this.i != null)
    {
      boolean bool = this.i.a();
      if (!bool) {
        c();
      }
      return bool;
    }
    return false;
  }
  
  private void f()
  {
    if ((this.j == null) && (this.h != null)) {
      this.j = this.h.edit();
    }
    if ((this.g) && (this.k == null) && (this.i != null)) {
      this.k = this.i.c();
    }
    e();
  }
  
  private d g(String paramString)
  {
    paramString = h(paramString);
    if (paramString != null)
    {
      this.m = new d(paramString.getAbsolutePath());
      return this.m;
    }
    return null;
  }
  
  private File h(String paramString)
  {
    File localFile = Environment.getExternalStorageDirectory();
    if (localFile != null)
    {
      paramString = new File(String.format("%s%s%s", new Object[] { localFile.getAbsolutePath(), File.separator, paramString }));
      if (!paramString.exists()) {
        paramString.mkdirs();
      }
      return paramString;
    }
    return null;
  }
  
  public void a()
  {
    if ((this.h != null) && (this.l != null)) {
      this.h = this.l.getSharedPreferences(this.c, 0);
    }
    String str = Environment.getExternalStorageState();
    if ((!i.a(str)) && ((str.equals("mounted")) || ((str.equals("mounted_ro")) && (this.i != null)))) {}
    try
    {
      if (this.m != null) {
        this.i = this.m.a(this.c, 0);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public void a(String paramString)
  {
    if ((!i.a(paramString)) && (!paramString.equals("t")))
    {
      f();
      if (this.j != null) {
        this.j.remove(paramString);
      }
      if (this.k != null) {
        this.k.a(paramString);
      }
    }
  }
  
  public void a(String paramString, float paramFloat)
  {
    if ((!i.a(paramString)) && (!paramString.equals("t")))
    {
      f();
      if (this.j != null) {
        this.j.putFloat(paramString, paramFloat);
      }
      if (this.k != null) {
        this.k.a(paramString, paramFloat);
      }
    }
  }
  
  public void a(String paramString, int paramInt)
  {
    if ((!i.a(paramString)) && (!paramString.equals("t")))
    {
      f();
      if (this.j != null) {
        this.j.putInt(paramString, paramInt);
      }
      if (this.k != null) {
        this.k.a(paramString, paramInt);
      }
    }
  }
  
  public void a(String paramString, long paramLong)
  {
    if ((!i.a(paramString)) && (!paramString.equals("t")))
    {
      f();
      if (this.j != null) {
        this.j.putLong(paramString, paramLong);
      }
      if (this.k != null) {
        this.k.a(paramString, paramLong);
      }
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    if ((!i.a(paramString1)) && (!paramString1.equals("t")))
    {
      f();
      if (this.j != null) {
        this.j.putString(paramString1, paramString2);
      }
      if (this.k != null) {
        this.k.a(paramString1, paramString2);
      }
    }
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    if ((!i.a(paramString)) && (!paramString.equals("t")))
    {
      f();
      if (this.j != null) {
        this.j.putBoolean(paramString, paramBoolean);
      }
      if (this.k != null) {
        this.k.a(paramString, paramBoolean);
      }
    }
  }
  
  public String b(String paramString)
  {
    e();
    if ((this.h != null) && (!TextUtils.isEmpty(this.h.getString(paramString, "")))) {
      return this.h.getString(paramString, "");
    }
    if (this.i != null) {
      return this.i.a(paramString, "");
    }
    return "";
  }
  
  public void b()
  {
    f();
    long l1 = System.currentTimeMillis();
    if (this.j != null)
    {
      this.j.clear();
      this.j.putLong("t", l1);
    }
    if (this.k != null)
    {
      this.k.a();
      this.k.a("t", l1);
    }
  }
  
  public int c(String paramString)
  {
    int i1 = 0;
    e();
    if (this.h != null) {
      i1 = this.h.getInt(paramString, 0);
    }
    while (this.i == null) {
      return i1;
    }
    return this.i.a(paramString, 0);
  }
  
  public boolean c()
  {
    boolean bool2 = true;
    long l1 = System.currentTimeMillis();
    boolean bool1 = bool2;
    if (this.j != null)
    {
      if ((!this.n) && (this.h != null)) {
        this.j.putLong("t", l1);
      }
      bool1 = bool2;
      if (!this.j.commit()) {
        bool1 = false;
      }
    }
    if ((this.h != null) && (this.l != null)) {
      this.h = this.l.getSharedPreferences(this.c, 0);
    }
    String str = Environment.getExternalStorageState();
    boolean bool3 = bool1;
    if (!i.a(str))
    {
      bool2 = bool1;
      if (str.equals("mounted"))
      {
        if (this.i != null) {
          break label264;
        }
        d locald = g(this.d);
        bool2 = bool1;
        if (locald != null)
        {
          this.i = locald.a(this.c, 0);
          if (this.n) {
            break label249;
          }
          a(this.h, this.i);
          this.k = this.i.c();
          bool2 = bool1;
        }
      }
    }
    for (;;)
    {
      if (!str.equals("mounted"))
      {
        bool3 = bool2;
        if (str.equals("mounted_ro"))
        {
          bool3 = bool2;
          if (this.i == null) {}
        }
      }
      else
      {
        bool3 = bool2;
      }
      label249:
      try
      {
        if (this.m != null)
        {
          this.i = this.m.a(this.c, 0);
          bool3 = bool2;
        }
        return bool3;
      }
      catch (Exception localException) {}
      a(this.i, this.h);
      break;
      label264:
      bool2 = bool1;
      if (this.k != null)
      {
        bool2 = bool1;
        if (!this.k.b()) {
          bool2 = false;
        }
      }
    }
    return bool2;
  }
  
  public long d(String paramString)
  {
    long l1 = 0L;
    e();
    if (this.h != null) {
      l1 = this.h.getLong(paramString, 0L);
    }
    while (this.i == null) {
      return l1;
    }
    return this.i.a(paramString, 0L);
  }
  
  public Map<String, ?> d()
  {
    e();
    if (this.h != null) {
      return this.h.getAll();
    }
    if (this.i != null) {
      return this.i.b();
    }
    return null;
  }
  
  public float e(String paramString)
  {
    float f1 = 0.0F;
    e();
    if (this.h != null) {
      f1 = this.h.getFloat(paramString, 0.0F);
    }
    while (this.i == null) {
      return f1;
    }
    return this.i.a(paramString, 0.0F);
  }
  
  public boolean f(String paramString)
  {
    boolean bool = false;
    e();
    if (this.h != null) {
      bool = this.h.getBoolean(paramString, false);
    }
    while (this.i == null) {
      return bool;
    }
    return this.i.a(paramString, false);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\persistence\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */