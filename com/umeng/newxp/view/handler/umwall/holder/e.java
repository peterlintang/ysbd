package com.umeng.newxp.view.handler.umwall.holder;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.handler.UMTuanPromoter;
import com.umeng.newxp.view.handler.utils.c;

public class e
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
    this.a = View.inflate(paramContext, e.a.a(this.b), localFrameLayout);
    this.h = ((TextView)this.a.findViewById(e.a.c(this.b)));
    this.d = ((TextView)this.a.findViewById(e.a.d(this.b)));
    this.d.getPaint().setFlags(16);
    this.d.getPaint().setAntiAlias(true);
    this.c = ((TextView)this.a.findViewById(e.a.e(this.b)));
    this.e = ((TextView)this.a.findViewById(e.a.f(this.b)));
    this.f = ((TextView)this.a.findViewById(e.a.g(this.b)));
    this.g = ((TextView)this.a.findViewById(e.a.h(this.b)));
    this.j = ((ImageView)this.a.findViewById(e.a.i(this.b)));
    this.i = this.a.findViewById(e.a.j(this.b));
    this.k = ((Button)this.a.findViewById(e.a.k(this.b)));
    this.a.setTag(this);
    return localFrameLayout;
  }
  
  public <T extends Promoter> void a(T paramT, Object... paramVarArgs)
  {
    if ((paramT instanceof UMTuanPromoter))
    {
      UMTuanPromoter localUMTuanPromoter = (UMTuanPromoter)paramT;
      c localc = (c)paramVarArgs[0];
      int m = ((Integer)paramVarArgs[1]).intValue();
      paramT = (ExchangeDataService)paramVarArgs[2];
      paramVarArgs = (com.umeng.newxp.common.a)paramVarArgs[3];
      if (localUMTuanPromoter.isNeedOrder)
      {
        this.i.setVisibility(4);
        this.d.setText(localUMTuanPromoter.price);
        this.c.setText(localUMTuanPromoter.promoterPrice);
        this.e.setText(localUMTuanPromoter.location);
        this.f.setText(localUMTuanPromoter.sell + "人");
        this.h.setText(localUMTuanPromoter.ad_words);
        if (!TextUtils.isEmpty(localUMTuanPromoter.publisher)) {
          break label349;
        }
        this.g.setVisibility(8);
      }
      for (;;)
      {
        e.1 local1 = new e.1(this, localUMTuanPromoter, m, paramT);
        this.a.setOnClickListener(local1);
        if (localUMTuanPromoter.points <= 10000) {
          break label372;
        }
        float f1 = localUMTuanPromoter.points / 1000 / 10.0F;
        paramT = f1 + "w";
        this.k.setText("+\n" + paramT);
        this.k.setOnClickListener(local1);
        this.j.setImageBitmap(null);
        this.j.setTag(localUMTuanPromoter.img);
        localc.b(e.a.b(this.b));
        localc.a(localUMTuanPromoter.img, this.j, paramVarArgs.d);
        return;
        this.i.setVisibility(0);
        break;
        label349:
        this.g.setVisibility(0);
        this.g.setText(localUMTuanPromoter.publisher);
      }
      label372:
      paramT = new StringBuilder();
      if (localUMTuanPromoter.points > 0) {}
      for (m = localUMTuanPromoter.points;; m = 0)
      {
        paramT = m;
        break;
      }
    }
    paramT = ExchangeConstants.LOG_TAG;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\holder\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */