package com.umeng.newxp.view.templates;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.umeng.newxp.a.e;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.ExHeader;
import com.umeng.newxp.view.b;
import java.util.List;

class a$3
  extends b
{
  a$3(a parama, ListView paramListView, Context paramContext, int paramInt1, ExHeader paramExHeader, List paramList, int paramInt2, ExchangeDataService paramExchangeDataService)
  {
    super(paramListView, paramContext, paramInt1, paramExHeader, paramList, paramInt2, paramExchangeDataService);
  }
  
  public void a(int paramInt)
  {
    super.a(paramInt);
    int i = a.c(this.a).getChildCount();
    int j = a.c(this.a).getHeaderViewsCount();
    if ((!a.d(this.a)) && (paramInt <= i - j))
    {
      a.e(this.a).setVisibility(0);
      a.e(this.a).setClickable(false);
      a.f(this.a).setVisibility(0);
      a.f(this.a).startAnimation(a.g(this.a));
      a.h(this.a).setText(e.h(a.a(this.a)));
      this.a.a();
      a.a(this.a, true);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\a$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */