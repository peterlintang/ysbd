package com.ireadercity.b2.h;

import android.content.Context;
import com.ireadercity.b2.c.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public final class o
  extends DefaultHandler
{
  ArrayList<HashMap<String, String>> a = null;
  HashMap<String, String> b = null;
  a c = null;
  String d;
  String e;
  String f;
  String g;
  int h = 0;
  volatile boolean i = false;
  StringBuilder j;
  int k = -1;
  
  public o(Context paramContext, String paramString1, String paramString2)
  {
    this.c = a.a(paramContext);
    this.d = paramString1;
    this.e = paramString2;
    if (this.e != null)
    {
      paramContext = new File(this.e);
      this.f = (paramContext.getParent() + "/");
    }
  }
  
  private void b()
  {
    if (this.b == null) {
      return;
    }
    new StringBuilder().append((String)this.b.get("title")).toString();
    new StringBuilder().append((String)this.b.get("src")).toString();
    HashMap localHashMap = this.b;
    StringBuilder localStringBuilder = new StringBuilder();
    int m = this.h;
    this.h = (m + 1);
    localHashMap.put("order", m);
    this.a.add(this.b);
    this.b = null;
  }
  
  public final ArrayList<HashMap<String, String>> a()
  {
    return this.a;
  }
  
  public final void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (!this.i) {}
    do
    {
      return;
      paramArrayOfChar = new String(paramArrayOfChar, paramInt1, paramInt2);
    } while ((!"text".equalsIgnoreCase(this.g)) || (this.j == null));
    this.j.append(paramArrayOfChar);
  }
  
  public final void endDocument() {}
  
  public final void endElement(String paramString1, String paramString2, String paramString3)
  {
    this.g = paramString2;
    if (!this.i) {}
    do
    {
      return;
      if ("navPoint".equalsIgnoreCase(paramString2))
      {
        this.k -= 1;
        b();
        return;
      }
    } while (!"navLabel".equalsIgnoreCase(paramString2));
    if ((this.b != null) && (this.k >= 0))
    {
      paramString1 = y.a("", this.k * 3);
      this.b.put("title", this.j.insert(0, paramString1));
    }
    this.j = null;
  }
  
  public final void startDocument()
  {
    this.a = new ArrayList();
  }
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    this.g = paramString2;
    if ("navMap".equalsIgnoreCase(paramString2)) {
      this.i = true;
    }
    if (!this.i) {}
    do
    {
      do
      {
        return;
        if ("navPoint".equalsIgnoreCase(paramString2))
        {
          this.k += 1;
          if (this.b != null) {
            b();
          }
          this.b = new HashMap();
          this.b.put("ID", paramAttributes.getValue("id"));
          this.b.put("playOrder", paramAttributes.getValue("playOrder"));
          this.b.put("NavLevel", this.k);
          return;
        }
        if (!"content".equalsIgnoreCase(paramString2)) {
          break;
        }
      } while (this.b == null);
      this.b.put("src", this.f + paramAttributes.getValue("src"));
      return;
    } while (!"navLabel".equalsIgnoreCase(paramString2));
    this.j = new StringBuilder();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */