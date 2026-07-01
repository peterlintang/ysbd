package com.ireadercity.b2.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public final class b
  implements Serializable
{
  public static b a;
  private boolean b = false;
  private int c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private ArrayList<HashMap<String, String>> k;
  private ArrayList<HashMap<String, String>> l;
  private String m;
  private String n;
  private String o;
  private int p;
  private String q;
  private int r;
  private String s;
  private String t;
  private int u;
  private String v;
  private String w;
  private String x;
  private float y;
  
  public final boolean A()
  {
    return (this.q != null) && (this.q.equalsIgnoreCase("pdf"));
  }
  
  public final int a()
  {
    return this.c;
  }
  
  public final void a(float paramFloat)
  {
    this.y = paramFloat;
  }
  
  public final void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public final void a(String paramString)
  {
    this.o = paramString;
  }
  
  public final void a(ArrayList<HashMap<String, String>> paramArrayList)
  {
    this.k = paramArrayList;
  }
  
  public final float b()
  {
    return this.y;
  }
  
  public final void b(int paramInt)
  {
    this.p = paramInt;
  }
  
  public final void b(String paramString)
  {
    this.x = paramString;
  }
  
  public final void b(ArrayList<HashMap<String, String>> paramArrayList)
  {
    this.l = paramArrayList;
  }
  
  public final void c(int paramInt)
  {
    this.u = paramInt;
  }
  
  public final void c(String paramString)
  {
    this.v = paramString;
  }
  
  public final boolean c()
  {
    return this.b;
  }
  
  public final void d()
  {
    this.b = true;
  }
  
  public final void d(int paramInt)
  {
    this.r = paramInt;
  }
  
  public final void d(String paramString)
  {
    this.w = paramString;
  }
  
  public final int e()
  {
    return this.p;
  }
  
  public final void e(String paramString)
  {
    this.d = paramString;
  }
  
  public final String f()
  {
    return this.o;
  }
  
  public final void f(String paramString)
  {
    this.e = paramString;
  }
  
  public final String g()
  {
    return this.x;
  }
  
  public final void g(String paramString)
  {
    this.f = paramString;
  }
  
  public final int h()
  {
    return this.u;
  }
  
  public final void h(String paramString)
  {
    this.g = paramString;
  }
  
  public final String i()
  {
    return this.w;
  }
  
  public final void i(String paramString)
  {
    this.h = paramString;
  }
  
  public final String j()
  {
    return this.d;
  }
  
  public final void j(String paramString)
  {
    this.i = paramString;
  }
  
  public final String k()
  {
    return this.e;
  }
  
  public final void k(String paramString)
  {
    this.j = paramString;
  }
  
  public final String l()
  {
    return this.f;
  }
  
  public final void l(String paramString)
  {
    this.m = paramString;
  }
  
  public final String m()
  {
    return this.g;
  }
  
  public final void m(String paramString)
  {
    this.n = paramString;
  }
  
  public final String n()
  {
    return this.h;
  }
  
  public final void n(String paramString)
  {
    this.q = paramString;
  }
  
  public final String o()
  {
    return this.i;
  }
  
  public final void o(String paramString)
  {
    this.s = paramString;
  }
  
  public final String p()
  {
    return this.j;
  }
  
  public final void p(String paramString)
  {
    this.t = paramString;
  }
  
  public final ArrayList<HashMap<String, String>> q()
  {
    return this.k;
  }
  
  public final String r()
  {
    return this.m;
  }
  
  public final String s()
  {
    return this.n;
  }
  
  public final String t()
  {
    return this.q;
  }
  
  public final String toString()
  {
    return String.format("BookID=%s bookAuthor=%s Path=%s Cover=%s bookTitle=%s, storebookID=%s bookSize=%s txt_chapter_size=%d", new Object[] { this.d, this.h, this.f, this.m, this.e, this.w, this.s, Integer.valueOf(this.u) });
  }
  
  public final int u()
  {
    return this.r;
  }
  
  public final String v()
  {
    return this.s;
  }
  
  public final String w()
  {
    return this.t;
  }
  
  public final ArrayList<HashMap<String, String>> x()
  {
    return this.l;
  }
  
  public final boolean y()
  {
    return (this.q != null) && (this.q.equalsIgnoreCase("epub"));
  }
  
  public final boolean z()
  {
    return (this.q != null) && (this.q.equalsIgnoreCase("txt"));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\bean\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */