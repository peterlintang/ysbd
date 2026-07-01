package com.taobao.munion.ewall.ui.fragments;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.taobao.munion.model.a;
import com.taobao.munion.model.b;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.view.handler.UMEWallPromoter;

public class EWallPageFragment$WaterFlowItemHolder
{
  View contentView;
  ImageView imageView;
  Context mContext;
  TextView priceTextView;
  TextView sellTextView;
  
  protected EWallPageFragment$WaterFlowItemHolder(EWallPageFragment paramEWallPageFragment) {}
  
  public void cosmetics(a parama, Object... paramVarArgs)
  {
    com.umeng.newxp.view.handler.utils.c localc = (com.umeng.newxp.view.handler.utils.c)paramVarArgs[0];
    int i = ((Integer)paramVarArgs[1]).intValue();
    paramVarArgs = (b)paramVarArgs[2];
    this.imageView.setTag(parama.c);
    double d;
    Object localObject;
    if (parama.s > 0.0D)
    {
      d = parama.s;
      if (d <= 100000.0D) {
        break label263;
      }
      float f = (int)(d / 1000.0D) / 10.0F;
      localObject = f + "万";
      this.priceTextView.setText((CharSequence)localObject);
      if (parama.h <= 10000) {
        break label306;
      }
      f = parama.h / 1000 / 10.0F;
      localObject = f + "万";
      this.sellTextView.setText("月销" + (String)localObject + "笔");
    }
    for (;;)
    {
      this.imageView.setImageBitmap(null);
      localObject = (UMEWallPromoter)Promoter.getPromoterFromJson(parama.z, UMEWallPromoter.class);
      this.contentView.setOnClickListener(new EWallPageFragment.WaterFlowItemHolder.1(this, (UMEWallPromoter)localObject, i, paramVarArgs, parama));
      this.imageView.setTag(parama.c);
      localc.a(parama.c, this.imageView, this.this$0.mEWallTabBean.g());
      return;
      d = parama.v;
      break;
      label263:
      localObject = this.priceTextView;
      StringBuilder localStringBuilder = new StringBuilder();
      if (d > 0.0D) {}
      for (;;)
      {
        ((TextView)localObject).setText(d);
        break;
        d = 0.0D;
      }
      label306:
      this.sellTextView.setText("月销" + parama.h + "笔");
    }
  }
  
  protected View inflate(Context paramContext)
  {
    this.mContext = paramContext;
    this.contentView = View.inflate(paramContext, com.umeng.newxp.view.handler.ewall.c.J(paramContext), null);
    this.imageView = ((ImageView)this.contentView.findViewById(com.umeng.newxp.view.handler.ewall.c.E(paramContext)));
    this.priceTextView = ((TextView)this.contentView.findViewById(com.umeng.newxp.view.handler.ewall.c.x(paramContext)));
    this.sellTextView = ((TextView)this.contentView.findViewById(com.umeng.newxp.view.handler.ewall.c.v(paramContext)));
    this.contentView.setTag(this);
    return this.contentView;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallPageFragment$WaterFlowItemHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */