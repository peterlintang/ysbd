package com.umeng.newxp.view.feed;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.handler.utils.c;
import com.umeng.newxp.view.widget.CYCImageView;

public class b
  extends FrameLayout
{
  Promoter a;
  ExchangeDataService b;
  CYCImageView c;
  
  public b(Context paramContext, Promoter paramPromoter)
  {
    super(paramContext);
    this.a = paramPromoter;
    paramPromoter = View.inflate(paramContext, FeedRes.layout_umeng_xp_feed_style_pager(paramContext), this);
    ((TextView)paramPromoter.findViewById(FeedRes.umeng_xp_title(paramContext))).setText(this.a.title);
    ((TextView)paramPromoter.findViewById(FeedRes.umeng_xp_adwords(paramContext))).setText(this.a.ad_words);
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
      FeedViewFactory.getImageFetcher().a(this.a.img, this.c);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */