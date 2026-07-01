package com.umeng.newxp.view.handler.umwall.holder;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.util.g;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.Promoter.a;
import com.umeng.newxp.a.e;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.AdapterListener;
import com.umeng.newxp.controller.XpListenersCenter.FitType;
import com.umeng.newxp.view.handler.umwall.UMWallRes;

public class a
  extends com.umeng.newxp.view.handler.a
{
  XpListenersCenter.AdapterListener b;
  Context c;
  private TextView d;
  private TextView e;
  private TextView f;
  private TextView g;
  private ImageView h;
  private ImageView i;
  private Button j;
  
  protected View a(Context paramContext)
  {
    this.c = paramContext;
    FrameLayout localFrameLayout = new FrameLayout(this.c);
    this.a = View.inflate(paramContext, UMWallRes.layout_umeng_xp_hl_template_banner_app(paramContext), localFrameLayout);
    this.h = ((ImageView)this.a.findViewById(com.umeng.newxp.a.c.D(paramContext)));
    this.d = ((TextView)this.a.findViewById(com.umeng.newxp.a.c.g(paramContext)));
    this.e = ((TextView)this.a.findViewById(com.umeng.newxp.a.c.B(paramContext)));
    this.f = ((TextView)this.a.findViewById(com.umeng.newxp.a.c.C(paramContext)));
    this.g = ((TextView)this.a.findViewById(com.umeng.newxp.a.c.p(paramContext)));
    this.j = ((Button)this.a.findViewById(com.umeng.newxp.a.c.H(paramContext)));
    try
    {
      this.i = ((ImageView)this.a.findViewById(com.umeng.newxp.a.c.n(paramContext)));
      if (Log.LOG)
      {
        String str = ExchangeConstants.LOG_TAG;
        if ("New tip Imageview is " + this.i == null)
        {
          paramContext = "null";
          Log.c(str, paramContext);
        }
      }
      else
      {
        this.a.setTag(this);
        return localFrameLayout;
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        this.i = null;
        continue;
        paramContext = "not null";
      }
    }
  }
  
  public <T extends Promoter> void a(T paramT, Object... paramVarArgs)
  {
    Object localObject = (com.umeng.newxp.view.handler.utils.c)paramVarArgs[0];
    int k = ((Integer)paramVarArgs[1]).intValue();
    ExchangeDataService localExchangeDataService = (ExchangeDataService)paramVarArgs[2];
    paramVarArgs = (com.umeng.newxp.common.a)paramVarArgs[3];
    this.h.setImageDrawable(this.c.getResources().getDrawable(com.umeng.newxp.a.b.b(this.c)));
    if (this.h != null) {
      ((com.umeng.newxp.view.handler.utils.c)localObject).a(paramT.icon, this.h, paramVarArgs.d);
    }
    if (this.d != null)
    {
      if (!com.umeng.common.ufp.b.a(paramT.app_package_name, this.c)) {
        break label383;
      }
      this.d.setText(e.b(this.c));
      if ((!com.umeng.common.ufp.b.a(paramT.app_package_name, this.c)) && (!TextUtils.isEmpty(paramT.price))) {
        this.d.setText(paramT.price);
      }
    }
    if (this.e != null) {
      this.e.setText(paramT.title);
    }
    if (this.f != null) {
      this.f.setText(paramT.ad_words);
    }
    if (ExchangeConstants.show_size)
    {
      if (this.g != null) {
        this.g.setText(g.a(this.c, paramT.size));
      }
      label218:
      if (this.j != null) {
        this.f.setText(paramT.ad_words);
      }
      paramVarArgs = new a.1(this, paramT, k, localExchangeDataService);
      if (this.j != null)
      {
        if (!com.umeng.common.ufp.b.a(paramT.app_package_name, this.c)) {
          break label460;
        }
        this.j.setText(e.b(this.c));
        if (this.b != null) {
          this.b.onFitType(this.a, paramT, XpListenersCenter.FitType.OPEN);
        }
        label308:
        if (paramT.new_tip != 1) {
          break label650;
        }
        if (this.b != null) {
          this.b.onFitType(this.a, paramT, XpListenersCenter.FitType.NEW);
        }
        if (this.i != null) {
          this.i.setVisibility(0);
        }
      }
    }
    for (;;)
    {
      this.j.setOnClickListener(paramVarArgs);
      this.a.setOnClickListener(new a.2(this, paramT, k, localExchangeDataService));
      return;
      label383:
      if ((paramT.landing_type == 3) || (paramT.landing_type == 2) || (paramT.landing_type == 4))
      {
        this.d.setText(e.c(this.c));
        break;
      }
      this.d.setText(e.e(this.c));
      break;
      if (this.g == null) {
        break label218;
      }
      this.g.setVisibility(8);
      break label218;
      label460:
      if ((paramT.landing_type == 3) || (paramT.landing_type == 2) || (paramT.landing_type == 4))
      {
        int m = e.c(this.c);
        localObject = Uri.parse(paramT.url).getScheme();
        if ((localObject != null) && (((String)localObject).equalsIgnoreCase(Promoter.a.b.toString())))
        {
          this.j.setText(e.d(this.c));
          e.f(this.c);
          if (this.b == null) {
            break label308;
          }
          this.b.onFitType(this.a, paramT, XpListenersCenter.FitType.PHONE);
          break label308;
        }
        this.j.setText(m);
        if (this.b == null) {
          break label308;
        }
        this.b.onFitType(this.a, paramT, XpListenersCenter.FitType.BROWSE);
        break label308;
      }
      this.j.setText(e.e(this.c));
      if (this.b == null) {
        break label308;
      }
      this.b.onFitType(this.a, paramT, XpListenersCenter.FitType.DOWNLOAD);
      break label308;
      label650:
      if (this.i != null) {
        this.i.setVisibility(8);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\holder\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */