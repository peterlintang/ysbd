package com.umeng.fb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class b
  implements Comparable<b>
{
  public String a = b.class.getSimpleName();
  public b.a b = b.a.d;
  public String c;
  public a d;
  public a e;
  public List<a> f = new ArrayList();
  
  public b(JSONArray paramJSONArray)
  {
    int i = 0;
    for (;;)
    {
      if (i >= paramJSONArray.length()) {
        break label97;
      }
      try
      {
        a locala = new a(paramJSONArray.getJSONObject(i));
        if (locala.g == a.a.b) {
          this.b = b.a.c;
        }
        this.f.add(locala);
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          localJSONException.printStackTrace();
        }
      }
      i += 1;
    }
    label97:
    if (!this.f.isEmpty())
    {
      this.d = ((a)this.f.get(0));
      this.e = ((a)this.f.get(this.f.size() - 1));
      this.c = this.d.c;
      if (this.f.size() == 1)
      {
        if (((a)this.f.get(0)).g != a.a.b) {
          break label207;
        }
        this.b = b.a.b;
      }
    }
    label207:
    while (((a)this.f.get(0)).g != a.a.a) {
      return;
    }
    this.b = b.a.a;
  }
  
  public int a(b paramb)
  {
    Date localDate = this.e.e;
    paramb = paramb.e.e;
    if ((paramb == null) || (localDate == null) || (localDate.equals(paramb))) {
      return 0;
    }
    if (localDate.after(paramb)) {
      return -1;
    }
    return 1;
  }
  
  public a a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.f.size() - 1)) {
      return null;
    }
    return (a)this.f.get(paramInt);
  }
  
  public void b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.f.size() - 1)) {
      return;
    }
    this.f.remove(paramInt);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */