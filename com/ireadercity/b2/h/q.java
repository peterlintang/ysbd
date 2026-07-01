package com.ireadercity.b2.h;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public final class q
  extends DefaultHandler
{
  private static String A = "OpfSAXHandler";
  private String B;
  private String C;
  private File D;
  String a = null;
  String b = null;
  String c = null;
  String d = null;
  String e = null;
  String f = null;
  String g = null;
  String h = null;
  StringBuilder i;
  StringBuilder j;
  StringBuilder k;
  StringBuilder l;
  StringBuilder m;
  StringBuilder n;
  StringBuilder o;
  boolean p = false;
  boolean q = false;
  boolean r = false;
  String s;
  String t;
  String u = null;
  String v = null;
  ArrayList<HashMap<String, String>> w = null;
  HashMap<String, HashMap<String, String>> x;
  HashMap<String, String> y = null;
  HashMap<String, String> z = null;
  
  public q(String paramString1, String paramString2)
  {
    this.B = paramString1;
    this.C = paramString2;
    this.D = new File(this.B);
  }
  
  public final String a()
  {
    return this.u;
  }
  
  public final String b()
  {
    return this.v;
  }
  
  public final ArrayList<HashMap<String, String>> c()
  {
    return this.w;
  }
  
  public final void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    String str = new String(paramArrayOfChar, paramInt1, paramInt2);
    if (!this.p)
    {
      if (!"dc:publisher".equalsIgnoreCase(this.s)) {
        break label49;
      }
      this.o.append(str);
    }
    for (;;)
    {
      super.characters(paramArrayOfChar, paramInt1, paramInt2);
      return;
      label49:
      if (("dc:description".equalsIgnoreCase(this.s)) || ("description".equalsIgnoreCase(this.t)))
      {
        str = str.replaceAll("<p>", "").replaceAll("</p>", "");
        this.j.append(str);
      }
      else if ("dc:language".equalsIgnoreCase(this.s))
      {
        this.l.append(str);
      }
      else if ("dc:creator".equalsIgnoreCase(this.s))
      {
        this.k.append(str);
      }
      else if ("dc:title".equalsIgnoreCase(this.s))
      {
        new StringBuilder("booktitle:").append(str).toString();
        this.i.append(str);
      }
      else if ("dc:subject".equalsIgnoreCase(this.s))
      {
        this.m.append(str);
      }
      else if ("dc:date".equalsIgnoreCase(this.s))
      {
        this.n.append(str);
      }
    }
  }
  
  public final HashMap<String, HashMap<String, String>> d()
  {
    return this.x;
  }
  
  public final String e()
  {
    return this.a;
  }
  
  public final void endDocument()
  {
    String str = A;
    this.a = this.i.toString();
    this.b = this.j.toString();
    this.c = this.k.toString();
    this.d = this.o.toString();
    this.f = this.l.toString();
    this.g = this.m.toString();
    this.h = this.n.toString();
    super.endDocument();
  }
  
  public final void endElement(String paramString1, String paramString2, String paramString3)
  {
    String str;
    if ("metadata".equals(paramString2))
    {
      this.p = true;
      str = A;
    }
    if ("manifest".equals(paramString2))
    {
      str = A;
      this.q = false;
    }
    if ("spine".equals(paramString2))
    {
      str = A;
      this.r = false;
    }
    super.endElement(paramString1, paramString2, paramString3);
  }
  
  public final String f()
  {
    return this.b;
  }
  
  public final String g()
  {
    return this.c;
  }
  
  public final String h()
  {
    return this.d;
  }
  
  public final String i()
  {
    return this.e;
  }
  
  public final String j()
  {
    return this.f;
  }
  
  public final String k()
  {
    return this.g;
  }
  
  public final String l()
  {
    return this.h;
  }
  
  public final void startDocument()
  {
    this.w = new ArrayList();
    this.x = new HashMap();
    this.i = new StringBuilder();
    this.j = new StringBuilder();
    this.k = new StringBuilder();
    this.l = new StringBuilder();
    this.m = new StringBuilder();
    this.n = new StringBuilder();
    this.o = new StringBuilder();
    super.startDocument();
  }
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    this.t = paramString2;
    this.s = paramString3;
    if ((!this.q) && ("manifest".equals(paramString2))) {
      this.q = true;
    }
    if ((!this.r) && ("spine".equals(paramString2))) {
      this.r = true;
    }
    String str1;
    String str2;
    if ((this.q) && ("item".equalsIgnoreCase(this.t)))
    {
      str1 = paramAttributes.getValue("href");
      str2 = paramAttributes.getValue("id");
      if (!"application/xhtml+xml".equalsIgnoreCase(paramAttributes.getValue("media-type"))) {
        break label289;
      }
      this.y = new HashMap();
      this.y.put("id", str2);
      this.y.put("title", this.i.toString());
      this.y.put("book_id", this.C);
      this.y.put("src", this.D.getParent() + "/" + str1);
      this.x.put(str2, this.y);
    }
    for (;;)
    {
      if ((this.r) && ("itemref".equalsIgnoreCase(this.t)))
      {
        this.z = new HashMap();
        this.z.put("id", paramAttributes.getValue("idref"));
        this.w.add(this.z);
      }
      super.startElement(paramString1, paramString2, paramString3, paramAttributes);
      return;
      label289:
      if (("ncx".equalsIgnoreCase(str2)) || ("ncxtoc".equalsIgnoreCase(str2))) {
        this.v = str1;
      } else if ("cover-image".equalsIgnoreCase(str2)) {
        this.u = str1;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */