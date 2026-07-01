package com.umeng.xp.view.widget;

import android.view.View;
import com.umeng.xp.Promoter;
import java.util.List;

public abstract class a$a
{
  List<Promoter> c;
  a.b d;
  
  public a$a(List<Promoter> paramList, a.b paramb)
  {
    this.c = paramList;
    this.d = paramb;
  }
  
  public int a()
  {
    return this.d.b;
  }
  
  public View a(int paramInt)
  {
    int i = paramInt + this.d.a;
    return a(paramInt, i, (Promoter)this.c.get(i));
  }
  
  public abstract View a(int paramInt1, int paramInt2, Promoter paramPromoter);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\widget\a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */