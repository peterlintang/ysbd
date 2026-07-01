package com.umeng.newxp.view.handler.umwall;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.a;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase;
import java.util.List;

class UMWallFragment$1
  extends e
{
  UMWallFragment$1(UMWallFragment paramUMWallFragment, Context paramContext, ExchangeDataService paramExchangeDataService, a parama)
  {
    super(paramContext, paramExchangeDataService, parama);
  }
  
  public void a(int paramInt, List<Promoter> paramList)
  {
    if ((this.a.getActivity() instanceof UMWall))
    {
      UMWall localUMWall = (UMWall)this.a.getActivity();
      if (localUMWall.e.getCurrentItem() == this.a.o) {
        localUMWall.updateSpecialAttr(this.c);
      }
    }
    if ((this.a.A != null) && (!this.a.A.isFinishing()))
    {
      UMWallFragment.b();
      new StringBuilder().append(this.a.m).append("  UMWallFragment eWallCallbackRevicedFirstPage.").toString();
      this.a.g = false;
      if ((paramList == null) || (paramList.size() <= 0)) {
        break label186;
      }
      UMWallFragment.a(this.a, paramList, true);
    }
    for (;;)
    {
      this.a.d.setVisibility(8);
      if (this.a.l != null) {
        this.a.l.o();
      }
      UMWallFragment.a(this.a, this.b.psid, this.b.sessionId);
      return;
      label186:
      this.a.a = null;
      this.a.onErrorView();
    }
  }
  
  public void b(int paramInt, List<Promoter> paramList)
  {
    UMWallFragment.b();
    new StringBuilder().append(this.a.m).append("  UMWallFragment eWallCallbackRevicedChildPage.").toString();
    if ((this.a.A != null) && (!this.a.A.isFinishing()))
    {
      this.a.c.setVisibility(8);
      this.a.g = false;
      if ((paramList != null) && (paramList.size() > 0)) {
        UMWallFragment.a(this.a, paramList, false);
      }
    }
    else
    {
      return;
    }
    this.a.h = true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\UMWallFragment$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */