package com.umeng.newxp.view.handler.ewall;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.handler.UMEWallPromoter;
import com.umeng.newxp.view.handler.a;

public class i
  extends a
{
  ImageView b;
  TextView c;
  TextView d;
  Context e;
  
  protected View a(Context paramContext)
  {
    this.e = paramContext;
    this.a = View.inflate(paramContext, c.K(paramContext), null);
    this.b = ((ImageView)this.a.findViewById(c.E(paramContext)));
    this.c = ((TextView)this.a.findViewById(c.x(paramContext)));
    this.d = ((TextView)this.a.findViewById(c.v(paramContext)));
    this.a.setTag(this);
    return this.a;
  }
  
  public <T extends Promoter> void a(T paramT, Object... paramVarArgs)
  {
    com.umeng.newxp.view.handler.utils.c localc;
    int i;
    double d1;
    Object localObject;
    if ((paramT instanceof UMEWallPromoter))
    {
      paramT = (UMEWallPromoter)paramT;
      localc = (com.umeng.newxp.view.handler.utils.c)paramVarArgs[0];
      i = ((Integer)paramVarArgs[1]).intValue();
      paramVarArgs = (ExchangeDataService)paramVarArgs[2];
      this.b.setTag(paramT.img);
      if (paramT.promoterPrice <= 0.0D) {
        break label245;
      }
      d1 = paramT.promoterPrice;
      if (d1 <= 100000.0D) {
        break label253;
      }
      float f = (int)(d1 / 1000.0D) / 10.0F;
      localObject = f + "万";
      this.c.setText((CharSequence)localObject);
      if (paramT.sell <= 10000) {
        break label296;
      }
      f = paramT.sell / 1000 / 10.0F;
      localObject = f + "万";
      this.d.setText("月销" + (String)localObject + "笔");
    }
    for (;;)
    {
      this.b.setImageBitmap(null);
      this.a.setOnClickListener(new i.1(this, paramT, i, paramVarArgs));
      this.b.setTag(paramT.img);
      localc.a(paramT.img, this.b, paramVarArgs.sessionId);
      return;
      label245:
      d1 = paramT.price;
      break;
      label253:
      localObject = this.c;
      StringBuilder localStringBuilder = new StringBuilder();
      if (d1 > 0.0D) {}
      for (;;)
      {
        ((TextView)localObject).setText(d1);
        break;
        d1 = 0.0D;
      }
      label296:
      this.d.setText("月销" + paramT.sell + "笔");
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */