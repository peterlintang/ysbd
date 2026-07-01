package com.umeng.newxp.view;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.common.ufp.net.g;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a.a;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m.a;
import java.util.List;

class UMDetail$6
  implements XpListenersCenter.ExchangeDataRequestListener
{
  UMDetail$6(UMDetail paramUMDetail, View paramView) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if ((paramList != null) && (paramList.size() >= 4))
    {
      paramInt = 0;
      if (paramInt < 4)
      {
        Promoter localPromoter = (Promoter)paramList.get(paramInt);
        Object localObject;
        ImageView localImageView;
        switch (paramInt)
        {
        default: 
          localObject = null;
          localImageView = null;
        }
        for (;;)
        {
          if (localImageView != null) {
            localImageView.setOnClickListener(new UMDetail.6.1(this, localPromoter));
          }
          if (localObject != null) {
            ((TextView)localObject).setText(localPromoter.title);
          }
          localObject = AnimationUtils.loadAnimation(this.b.d, a.n(this.b.d));
          g.a(this.b.d, localImageView, localPromoter.icon, false, null, (Animation)localObject, true);
          this.a.setVisibility(0);
          paramInt += 1;
          break;
          localImageView = (ImageView)this.a.findViewById(com.umeng.newxp.a.c.ac(this.b.d));
          localObject = (TextView)this.a.findViewById(com.umeng.newxp.a.c.ad(this.b.d));
          continue;
          localImageView = (ImageView)this.a.findViewById(com.umeng.newxp.a.c.ae(this.b.d));
          localObject = (TextView)this.a.findViewById(com.umeng.newxp.a.c.af(this.b.d));
          continue;
          localImageView = (ImageView)this.a.findViewById(com.umeng.newxp.a.c.ag(this.b.d));
          localObject = (TextView)this.a.findViewById(com.umeng.newxp.a.c.ah(this.b.d));
          continue;
          localImageView = (ImageView)this.a.findViewById(com.umeng.newxp.a.c.ai(this.b.d));
          localObject = (TextView)this.a.findViewById(com.umeng.newxp.a.c.aj(this.b.d));
        }
      }
      paramList = new m.a(this.b.d).a(0).b(0).c(this.b.p.layoutType).a((Promoter[])paramList.toArray(new Promoter[paramList.size()])).f(com.umeng.newxp.common.c.a(this.b.d, this.b.p)).a(this.b.p.slot_id).g(this.b.p.getTimeConsuming()).a(this.b.p.sessionId, this.b.p.psid).a();
      new XpReportClient(this.b.d).sendAsync(paramList, null);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\UMDetail$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */