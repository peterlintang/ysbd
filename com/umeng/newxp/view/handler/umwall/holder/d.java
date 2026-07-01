package com.umeng.newxp.view.handler.umwall.holder;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.handler.UMTuanPromoter;
import com.umeng.newxp.view.handler.utils.c;

public class d
  extends com.umeng.newxp.view.handler.a
{
  Context b;
  TextView c;
  TextView d;
  TextView e;
  TextView f;
  TextView g;
  TextView h;
  View i;
  ImageView j;
  Button k;
  
  protected View a(Context paramContext)
  {
    this.b = paramContext;
    FrameLayout localFrameLayout = new FrameLayout(this.b);
    this.a = View.inflate(paramContext, d.a.a(this.b), localFrameLayout);
    this.h = ((TextView)this.a.findViewById(d.a.d(this.b)));
    this.d = ((TextView)this.a.findViewById(d.a.e(this.b)));
    this.d.getPaint().setFlags(16);
    this.d.getPaint().setAntiAlias(true);
    this.c = ((TextView)this.a.findViewById(d.a.f(this.b)));
    this.e = ((TextView)this.a.findViewById(d.a.g(this.b)));
    this.f = ((TextView)this.a.findViewById(d.a.h(this.b)));
    this.g = ((TextView)this.a.findViewById(d.a.i(this.b)));
    this.j = ((ImageView)this.a.findViewById(d.a.j(this.b)));
    this.i = this.a.findViewById(d.a.k(this.b));
    this.a.setTag(this);
    return localFrameLayout;
  }
  
  public <T extends Promoter> void a(T paramT, Object... paramVarArgs)
  {
    if ((paramT instanceof UMTuanPromoter))
    {
      paramT = (UMTuanPromoter)paramT;
      c localc = (c)paramVarArgs[0];
      int m = ((Integer)paramVarArgs[1]).intValue();
      Object localObject = (ExchangeDataService)paramVarArgs[2];
      paramVarArgs = (com.umeng.newxp.common.a)paramVarArgs[3];
      if (paramT.isNeedOrder)
      {
        this.i.setVisibility(4);
        this.d.setText(paramT.price);
        this.c.setText(paramT.promoterPrice);
        this.e.setText(paramT.location);
        this.f.setText(paramT.sell + "人");
        this.h.setText(paramT.ad_words);
        if (!TextUtils.isEmpty(paramT.publisher)) {
          break label306;
        }
        this.g.setVisibility(8);
      }
      for (;;)
      {
        localObject = new d.1(this, paramT, m, (ExchangeDataService)localObject);
        this.a.setOnClickListener((View.OnClickListener)localObject);
        if (paramT.points <= 10000) {
          break label328;
        }
        float f1 = paramT.points / 1000 / 10.0F;
        new StringBuilder().append(f1).append("w").toString();
        this.j.setImageBitmap(null);
        this.j.setTag(paramT.img);
        localc.b(d.a.c(this.b));
        localc.a(paramT.img, this.j, paramVarArgs.d);
        return;
        this.i.setVisibility(0);
        break;
        label306:
        this.g.setVisibility(0);
        this.g.setText(paramT.publisher);
      }
      label328:
      localObject = new StringBuilder();
      if (paramT.points > 0) {}
      for (m = paramT.points;; m = 0)
      {
        ((StringBuilder)localObject).append(m).toString();
        break;
      }
    }
    paramT = ExchangeConstants.LOG_TAG;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\holder\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */