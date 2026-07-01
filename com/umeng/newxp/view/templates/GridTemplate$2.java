package com.umeng.newxp.view.templates;

import com.umeng.common.ufp.Log;
import com.umeng.newxp.view.widget.GridPage.PageInfo;
import com.umeng.newxp.view.widget.SwipeView.OnPageChangedListener;
import java.util.List;

class GridTemplate$2
  implements SwipeView.OnPageChangedListener
{
  GridTemplate$2(GridTemplate paramGridTemplate) {}
  
  public void a(int paramInt1, int paramInt2)
  {
    try
    {
      GridPage.PageInfo localPageInfo = (GridPage.PageInfo)GridTemplate.b(this.a).get(paramInt2);
      GridTemplate.a(this.a, localPageInfo.a, localPageInfo.d, localPageInfo.c);
      Log.a(GridTemplate.a(), "send report  [newPage=" + paramInt2 + "]");
      return;
    }
    catch (Exception localException)
    {
      Log.b(GridTemplate.a(), "can`t send report [oldPage=" + paramInt1 + "]  [newPage=" + paramInt2 + "]", localException);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\GridTemplate$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */