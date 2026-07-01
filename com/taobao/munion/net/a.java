package com.taobao.munion.net;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

public class a
{
  public static final int a = 1;
  public static final int b = 2;
  public static final int c = 4;
  public static final int d = 8;
  public static final int e = 32;
  public static final int f = 1;
  public static final int g = 2;
  private static a i = null;
  final int h = 20;
  private final HashMap<String, a.a> j = new HashMap();
  private final ArrayList<String> k = new ArrayList();
  
  public static a a()
  {
    if (i == null) {
      i = new a();
    }
    return i;
  }
  
  public Object a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      return null;
    }
    if (1 == (paramInt1 & 0x1)) {
      return null;
    }
    synchronized (this.j)
    {
      paramString = (a.a)this.j.get(paramString);
      if ((paramString != null) && (paramString.a > System.currentTimeMillis()))
      {
        paramString = paramString.c;
        return paramString;
      }
    }
    return null;
  }
  
  public void a(String paramString, Object arg2, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramString == null) {}
    while (2 == (paramInt1 & 0x2)) {
      return;
    }
    a.a locala = new a.a(this, ???, paramInt2, paramInt3 + System.currentTimeMillis());
    synchronized (this.j)
    {
      this.j.put(paramString, locala);
      this.k.add(paramString);
      if (this.j.size() > 20)
      {
        paramString = (String)this.k.remove(0);
        this.j.remove(paramString);
      }
      return;
    }
  }
  
  public boolean a(int paramInt)
  {
    synchronized (this.j)
    {
      this.j.clear();
      this.k.clear();
      return true;
    }
  }
  
  public boolean a(Context paramContext)
  {
    return true;
  }
  
  public boolean a(String paramString, int paramInt)
  {
    synchronized (this.j)
    {
      this.k.remove(paramString);
      this.j.remove(paramString);
      return true;
    }
  }
  
  public boolean b()
  {
    return true;
  }
  
  public boolean b(String paramString, int paramInt)
  {
    synchronized (this.j)
    {
      boolean bool = this.j.containsKey(paramString);
      return bool;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */