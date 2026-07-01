package com.umeng.newxp.view.feed;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.handler.utils.c;
import com.umeng.newxp.view.widget.CYCImageView;

public class a
  extends FrameLayout
{
  Promoter a;
  ExchangeDataService b;
  CYCImageView c;
  int d;
  
  public a(Context paramContext, Promoter paramPromoter)
  {
    super(paramContext);
    this.d = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getWidth();
    this.a = paramPromoter;
    paramPromoter = View.inflate(paramContext, FeedRes.layout_umeng_xp_feed_style_simple(paramContext), this);
    ((TextView)paramPromoter.findViewById(FeedRes.umeng_xp_price(paramContext))).setText(this.a.title);
    this.c = ((CYCImageView)paramPromoter.findViewById(FeedRes.umeng_xp_image(paramContext)));
    this.c.setImageDrawable(null);
  }
  
  public void a(ExchangeDataService paramExchangeDataService)
  {
    this.b = paramExchangeDataService;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.c.getDrawable() == null) {
      FeedViewFactory.getImageFetcher().a(this.a.icon, this.c);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */