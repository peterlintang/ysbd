package com.umeng.newxp.view.handler.ewall;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.Promoter.a;
import com.umeng.newxp.a.e;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.AdapterListener;
import com.umeng.newxp.controller.XpListenersCenter.FitType;

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
    a(View.inflate(paramContext, c.L(paramContext), null));
    this.h = ((ImageView)a().findViewById(com.umeng.newxp.a.c.D(paramContext)));
    this.d = ((TextView)a().findViewById(com.umeng.newxp.a.c.g(paramContext)));
    this.e = ((TextView)a().findViewById(com.umeng.newxp.a.c.B(paramContext)));
    this.f = ((TextView)a().findViewById(com.umeng.newxp.a.c.C(paramContext)));
    this.g = ((TextView)a().findViewById(com.umeng.newxp.a.c.p(paramContext)));
    this.j = ((Button)a().findViewById(com.umeng.newxp.a.c.H(paramContext)));
    try
    {
      this.i = ((ImageView)a().findViewById(com.umeng.newxp.a.c.n(paramContext)));
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
        a().setTag(this);
        return a();
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
    int k = ((Integer)paramVarArgs[1]).intValue();
    paramVarArgs = (ExchangeDataService)paramVarArgs[2];
    this.h.setImageDrawable(this.c.getResources().getDrawable(com.umeng.newxp.a.b.b(this.c)));
    label108:
    label219:
    a.1 local1;
    if (this.h != null)
    {
      if (ExchangeConstants.ROUND_ICON) {
        com.umeng.common.ufp.net.g.a(this.c, this.h, paramT.icon, false, null, null, true);
      }
    }
    else
    {
      if (this.d != null)
      {
        if (!com.umeng.common.ufp.b.a(paramT.app_package_name, this.c)) {
          break label403;
        }
        this.d.setText(e.b(this.c));
        if ((!com.umeng.common.ufp.b.a(paramT.app_package_name, this.c)) && (paramT.price != null) && (!"".equals(paramT.price))) {
          this.d.setText(paramT.price);
        }
      }
      if (this.e != null) {
        this.e.setText(paramT.title);
      }
      if (this.f != null) {
        this.f.setText(paramT.ad_words);
      }
      if (!ExchangeConstants.show_size) {
        break label461;
      }
      if (this.g != null) {
        this.g.setText(com.umeng.common.ufp.util.g.a(this.c, paramT.size));
      }
      if (this.j != null) {
        this.f.setText(paramT.ad_words);
      }
      local1 = new a.1(this, paramT, k, paramVarArgs);
      if (this.j != null)
      {
        if (!com.umeng.common.ufp.b.a(paramT.app_package_name, this.c)) {
          break label480;
        }
        this.j.setText(e.b(this.c));
        if (this.b != null) {
          this.b.onFitType(a(), paramT, XpListenersCenter.FitType.OPEN);
        }
        label309:
        if (paramT.new_tip != 1) {
          break label665;
        }
        if (this.b != null) {
          this.b.onFitType(a(), paramT, XpListenersCenter.FitType.NEW);
        }
        if (this.i != null) {
          this.i.setVisibility(0);
        }
      }
    }
    for (;;)
    {
      this.j.setOnClickListener(local1);
      a().setOnClickListener(new a.2(this, paramT, k, paramVarArgs));
      return;
      com.umeng.common.ufp.net.g.a(this.c, this.h, paramT.icon, false);
      break;
      label403:
      if ((paramT.landing_type == 3) || (paramT.landing_type == 2) || (paramT.landing_type == 4))
      {
        this.d.setText(e.c(this.c));
        break label108;
      }
      this.d.setText(e.e(this.c));
      break label108;
      label461:
      if (this.g == null) {
        break label219;
      }
      this.g.setVisibility(8);
      break label219;
      label480:
      if ((paramT.landing_type == 3) || (paramT.landing_type == 2) || (paramT.landing_type == 4))
      {
        int m = e.c(this.c);
        String str = Uri.parse(paramT.url).getScheme();
        if ((str != null) && (str.equalsIgnoreCase(Promoter.a.b.toString())))
        {
          this.j.setText("");
          e.f(this.c);
          if (this.b == null) {
            break label309;
          }
          this.b.onFitType(a(), paramT, XpListenersCenter.FitType.PHONE);
          break label309;
        }
        this.j.setText(m);
        if (this.b == null) {
          break label309;
        }
        this.b.onFitType(a(), paramT, XpListenersCenter.FitType.BROWSE);
        break label309;
      }
      this.j.setText(e.e(this.c));
      if (this.b == null) {
        break label309;
      }
      this.b.onFitType(a(), paramT, XpListenersCenter.FitType.DOWNLOAD);
      break label309;
      label665:
      if (this.i != null) {
        this.i.setVisibility(8);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */