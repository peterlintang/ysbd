package com.umeng.newxp.view.widget;

import android.view.View;
import com.umeng.newxp.Promoter;
import java.util.List;

public abstract class GridPage$GridPageAdapter
{
  List<Promoter> c;
  GridPage.PageInfo d;
  
  public GridPage$GridPageAdapter(List<Promoter> paramList, GridPage.PageInfo paramPageInfo)
  {
    this.c = paramList;
    this.d = paramPageInfo;
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\GridPage$GridPageAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */