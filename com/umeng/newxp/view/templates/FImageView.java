package com.umeng.newxp.view.templates;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.net.g;
import com.umeng.common.ufp.net.g.a;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m;
import com.umeng.newxp.net.m.a;

public class FImageView
  extends RelativeLayout
  implements com.umeng.newxp.view.common.c, com.umeng.newxp.view.common.d
{
  Promoter a;
  private boolean b = false;
  private g.a c;
  private LayoutInflater d;
  private ExchangeDataService e;
  private Drawable f;
  
  public FImageView(Context paramContext)
  {
    super(paramContext);
  }
  
  public FImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public FImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a()
  {
    m localm = new m.a(getContext()).a(0).b(0).d(3).c(this.e.layoutType).a(new Promoter[] { this.a }).a(this.e.slot_id).g(this.e.getTimeConsuming()).a(this.e.sessionId, this.e.psid).a();
    new XpReportClient(getContext()).sendAsync(localm, null);
  }
  
  public void a(int paramInt)
  {
    b();
  }
  
  public boolean a(ExchangeDataService paramExchangeDataService, Promoter paramPromoter, g.a parama)
  {
    if ((paramPromoter != null) && (!TextUtils.isEmpty(paramPromoter.img)))
    {
      this.a = paramPromoter;
      this.c = parama;
      this.e = paramExchangeDataService;
      this.d = ((LayoutInflater)getContext().getSystemService("layout_inflater"));
      return true;
    }
    Log.b(ExchangeConstants.LOG_TAG, "promoter has no img url...");
    return false;
  }
  
  public boolean b()
  {
    if (this.a == null)
    {
      Log.b(ExchangeConstants.LOG_TAG, "FImageView has no promoter..");
      return false;
    }
    Object localObject = com.umeng.common.ufp.c.a(getContext());
    if (getChildCount() > 0) {
      removeAllViews();
    }
    View localView;
    ImageView localImageView;
    if (getContext().getResources().getConfiguration().orientation == 2)
    {
      localView = this.d.inflate(com.umeng.newxp.a.d.l(getContext()), this, false);
      localImageView = (ImageView)localView.findViewById(((com.umeng.common.ufp.c)localObject).b("umeng_xp_imagev"));
      TextView localTextView1 = (TextView)localView.findViewById(((com.umeng.common.ufp.c)localObject).b("umeng_xp_title"));
      TextView localTextView2 = (TextView)localView.findViewById(((com.umeng.common.ufp.c)localObject).b("umeng_xp_descript"));
      localObject = (Button)localView.findViewById(((com.umeng.common.ufp.c)localObject).b("umeng_xp_button"));
      FImageView.1 local1 = new FImageView.1(this);
      ((Button)localObject).setOnClickListener(local1);
      localTextView1.setText(this.a.title);
      localTextView2.setText(this.a.ad_words);
      localImageView.setOnClickListener(local1);
      if (this.f != null) {
        break label235;
      }
      g.a(getContext(), localImageView, this.a.img, false, new FImageView.2(this, localImageView));
    }
    for (;;)
    {
      addView(localView, -1, -1);
      return true;
      localView = this.d.inflate(com.umeng.newxp.a.d.m(getContext()), this, false);
      break;
      label235:
      localImageView.setImageDrawable(this.f);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\FImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */