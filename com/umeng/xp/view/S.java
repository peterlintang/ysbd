package com.umeng.xp.view;

import com.umeng.xp.view.widget.SwipeView.a;
import com.umeng.xp.view.widget.a.b;
import java.util.List;

class S
  implements SwipeView.a
{
  S(GridTemplate paramGridTemplate) {}
  
  public void a(int paramInt1, int paramInt2)
  {
    try
    {
      a.b localb = (a.b)GridTemplate.b(this.a).get(paramInt2);
      GridTemplate.a(this.a, localb.a, localb.d, localb.c);
      GridTemplate.a();
      new StringBuilder("send report  [newPage=").append(paramInt2).append("]").toString();
      return;
    }
    catch (Exception localException)
    {
      GridTemplate.a();
      new StringBuilder("can`t send report [oldPage=").append(paramInt1).append("]  [newPage=").append(paramInt2).append("]").toString();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\S.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */