package com.umeng.newxp.view.handler.umwall.holder;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.handler.UMEWallPromoter;
import com.umeng.newxp.view.handler.umwall.UMWallRes;
import com.umeng.newxp.view.handler.utils.c;

public class b
  extends com.umeng.newxp.view.handler.a
{
  ImageView b;
  TextView c;
  TextView d;
  Context e;
  
  protected View a(Context paramContext)
  {
    this.e = paramContext;
    FrameLayout localFrameLayout = new FrameLayout(this.e);
    this.a = View.inflate(paramContext, UMWallRes.layout_umeng_xp_hl_template_item_gaigai(paramContext), localFrameLayout);
    this.b = ((ImageView)this.a.findViewById(UMWallRes.umeng_xp_ew_item_imv(paramContext)));
    this.c = ((TextView)this.a.findViewById(UMWallRes.umeng_xp_ew_item_describle(paramContext)));
    this.d = ((TextView)this.a.findViewById(UMWallRes.umeng_xp_ew_item_price(paramContext)));
    this.a.setTag(this);
    return localFrameLayout;
  }
  
  public <T extends Promoter> void a(T paramT, Object... paramVarArgs)
  {
    c localc;
    int i;
    ExchangeDataService localExchangeDataService;
    if ((paramT instanceof UMEWallPromoter))
    {
      paramT = (UMEWallPromoter)paramT;
      localc = (c)paramVarArgs[0];
      i = ((Integer)paramVarArgs[1]).intValue();
      localExchangeDataService = (ExchangeDataService)paramVarArgs[2];
      paramVarArgs = (com.umeng.newxp.common.a)paramVarArgs[3];
      this.b.setTag(paramT.img);
      if (paramT.promoterPrice <= 0.0D) {
        break label190;
      }
    }
    label190:
    for (double d1 = paramT.promoterPrice; d1 > 100000.0D; d1 = paramT.price)
    {
      float f = (int)(d1 / 1000.0D) / 10.0F;
      localObject = f + "万";
      this.d.setText((CharSequence)localObject);
      this.a.setOnClickListener(new b.1(this, paramT, i, localExchangeDataService));
      this.c.setText(paramT.title);
      this.b.setImageBitmap(null);
      this.b.setTag(paramT.img);
      localc.a(paramT.img, this.b, paramVarArgs.d);
      return;
    }
    Object localObject = this.d;
    StringBuilder localStringBuilder = new StringBuilder();
    if (d1 > 0.0D) {}
    for (;;)
    {
      ((TextView)localObject).setText(d1);
      break;
      d1 = 0.0D;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\holder\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */