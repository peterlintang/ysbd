package com.umeng.newxp.controller;

import com.umeng.newxp.Promoter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  implements Iterator<Promoter>
{
  private ArrayList<Promoter> a = new ArrayList();
  private int b = 0;
  
  public a(List<Promoter> paramList)
  {
    this.a.addAll(paramList);
  }
  
  public int a()
  {
    return this.b;
  }
  
  public List<a.a> a(int paramInt)
  {
    Object localObject;
    if ((b() == 0) || (paramInt <= 0))
    {
      localObject = null;
      return (List<a.a>)localObject;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (;;)
    {
      localObject = localArrayList;
      if (i >= paramInt) {
        break;
      }
      localArrayList.add(e());
      i += 1;
    }
  }
  
  public void a(List<Promoter> paramList)
  {
    if (this.a == null) {
      this.a = new ArrayList();
    }
    this.a.addAll(paramList);
  }
  
  public int b()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.size();
  }
  
  public Promoter b(int paramInt)
  {
    if (this.a != null) {
      return (Promoter)this.a.get(paramInt);
    }
    return null;
  }
  
  public Promoter c()
  {
    if (hasNext())
    {
      ArrayList localArrayList = this.a;
      int i = this.b;
      this.b = (i + 1);
      return (Promoter)localArrayList.get(i);
    }
    return null;
  }
  
  public Promoter d()
  {
    if (b() == 0) {
      return null;
    }
    this.b %= b();
    ArrayList localArrayList = this.a;
    int i = this.b;
    this.b = (i + 1);
    return (Promoter)localArrayList.get(i);
  }
  
  public a.a e()
  {
    if (b() == 0) {
      return null;
    }
    this.b %= b();
    a.a locala = new a.a((Promoter)this.a.get(this.b), this.b);
    this.b += 1;
    return locala;
  }
  
  public Promoter f()
  {
    if ((this.b > 0) && (this.b <= b())) {
      return (Promoter)this.a.get(this.b - 1);
    }
    return null;
  }
  
  public boolean hasNext()
  {
    return (this.a != null) && (this.b >= 0) && (this.b < this.a.size());
  }
  
  public void remove()
  {
    if ((this.b > 0) && (this.b <= b())) {
      this.a.remove(this.b - 1);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */