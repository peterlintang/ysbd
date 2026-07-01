package com.umeng.newxp.view.handler.umwall.holder;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.handler.UMEWallPromoter;
import com.umeng.newxp.view.handler.umwall.UMWallRes;
import com.umeng.newxp.view.handler.utils.c;
import com.umeng.newxp.view.widget.CYCImageView;

public class f
  extends com.umeng.newxp.view.handler.a
{
  public CYCImageView b;
  TextView c;
  TextView d;
  Context e;
  
  protected View a(Context paramContext)
  {
    this.e = paramContext;
    this.a = new FrameLayout(this.e);
    View localView = View.inflate(paramContext, UMWallRes.layout_umeng_xp_hl_template_waterfall(paramContext), (FrameLayout)this.a);
    this.b = ((CYCImageView)localView.findViewById(UMWallRes.umeng_xp_ew_item_imv(paramContext)));
    this.b.a(true);
    this.c = ((TextView)localView.findViewById(UMWallRes.umeng_xp_ew_item_price(paramContext)));
    this.d = ((TextView)localView.findViewById(UMWallRes.umeng_xp_ew_item_sells(paramContext)));
    this.a.setTag(this);
    return this.a;
  }
  
  public <T extends Promoter> void a(T paramT, Object... paramVarArgs)
  {
    if ((paramT instanceof UMEWallPromoter))
    {
      paramT = (UMEWallPromoter)paramT;
      c localc = (c)paramVarArgs[0];
      int i = ((Integer)paramVarArgs[1]).intValue();
      ExchangeDataService localExchangeDataService = (ExchangeDataService)paramVarArgs[2];
      paramVarArgs = (com.umeng.newxp.common.a)paramVarArgs[3];
      this.b.setTag(paramT.img);
      double d1;
      Object localObject;
      if (paramT.promoterPrice > 0.0D)
      {
        d1 = paramT.promoterPrice;
        if (d1 <= 100000.0D) {
          break label262;
        }
        float f = (int)(d1 / 1000.0D) / 10.0F;
        localObject = f + "万";
        this.c.setText((CharSequence)localObject);
        if (paramT.sell <= 10000) {
          break label305;
        }
        f = paramT.sell / 1000 / 10.0F;
        localObject = f + "万";
        this.d.setText("月销" + (String)localObject + "笔");
      }
      for (;;)
      {
        this.b.setImageBitmap(null);
        this.a.setOnClickListener(new f.1(this, paramT, i, localExchangeDataService));
        this.b.setTag(paramT.img);
        localc.a(paramT.img, this.b, paramVarArgs.d);
        return;
        d1 = paramT.price;
        break;
        label262:
        localObject = this.c;
        StringBuilder localStringBuilder = new StringBuilder();
        if (d1 > 0.0D) {}
        for (;;)
        {
          ((TextView)localObject).setText(d1);
          break;
          d1 = 0.0D;
        }
        label305:
        this.d.setText("月销" + paramT.sell + "笔");
      }
    }
    paramT = ExchangeConstants.LOG_TAG;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\holder\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */