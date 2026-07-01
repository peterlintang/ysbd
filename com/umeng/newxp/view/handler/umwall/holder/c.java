package com.umeng.newxp.view.handler.umwall.holder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a.b;
import com.umeng.newxp.a.d;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.AdapterListener;

public class c
  extends com.umeng.newxp.view.handler.a
{
  XpListenersCenter.AdapterListener b;
  Context c;
  private TextView d;
  private ImageView e;
  private ImageView f;
  
  protected View a(Context paramContext)
  {
    this.c = paramContext;
    FrameLayout localFrameLayout = new FrameLayout(this.c);
    this.a = View.inflate(paramContext, d.h(this.c), localFrameLayout);
    this.d = ((TextView)this.a.findViewById(com.umeng.common.ufp.c.a(this.c).b("umeng_xp_handler_grid_item_tv")));
    this.f = ((ImageView)this.a.findViewById(com.umeng.common.ufp.c.a(this.c).b("umeng_xp_new_tip")));
    this.e = ((ImageView)this.a.findViewById(com.umeng.common.ufp.c.a(this.c).b("umeng_xp_handler_grid_item_icon")));
    this.a.setTag(this);
    return localFrameLayout;
  }
  
  public <T extends Promoter> void a(T paramT, Object... paramVarArgs)
  {
    com.umeng.newxp.view.handler.utils.c localc = (com.umeng.newxp.view.handler.utils.c)paramVarArgs[0];
    int i = ((Integer)paramVarArgs[1]).intValue();
    ExchangeDataService localExchangeDataService = (ExchangeDataService)paramVarArgs[2];
    paramVarArgs = (com.umeng.newxp.common.a)paramVarArgs[3];
    this.e.setImageDrawable(this.c.getResources().getDrawable(b.b(this.c)));
    if (this.e != null) {
      localc.a(paramT.icon, this.e, paramVarArgs.d);
    }
    if (this.d != null) {
      this.d.setText(paramT.title);
    }
    if (this.f != null)
    {
      this.f.setVisibility(4);
      if (paramT.new_tip != 1) {
        break label150;
      }
      this.f.setVisibility(0);
    }
    for (;;)
    {
      this.a.setOnClickListener(new c.1(this, paramT, i, localExchangeDataService));
      return;
      label150:
      this.f.setVisibility(4);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\holder\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */