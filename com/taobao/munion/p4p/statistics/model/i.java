package com.taobao.munion.p4p.statistics.model;

import java.util.ArrayList;

public class i
{
  String a;
  int b = 0;
  public ArrayList<String> c;
  
  public i(String paramString)
  {
    this.a = paramString;
    this.c = new ArrayList();
  }
  
  public int a()
  {
    int i = 0;
    if (this.c != null) {
      i = this.c.size();
    }
    return i;
  }
  
  public void a(String paramString)
  {
    if ((paramString != null) && (paramString.trim().length() > 0) && (!this.c.contains(paramString.trim()))) {
      this.c.add(paramString.trim());
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\p4p\statistics\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */