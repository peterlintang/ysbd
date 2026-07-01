package com.taobao.munion.p4p.statistics.model;

import java.util.HashMap;

public class j
  implements h
{
  private HashMap<String, i> a = new HashMap(7);
  
  public HashMap<String, i> a()
  {
    return this.a;
  }
  
  public void a(a parama)
  {
    String str;
    if (parama != null)
    {
      str = parama.b;
      if ((str != null) && (str.trim().length() > 0))
      {
        locali = (i)this.a.get(str);
        if (locali == null) {
          break label48;
        }
        locali.a(parama.c);
      }
    }
    return;
    label48:
    i locali = new i(str);
    locali.a(parama.c);
    this.a.put(str, locali);
  }
  
  public void b()
  {
    this.a.clear();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\p4p\statistics\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */