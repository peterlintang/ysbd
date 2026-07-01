package com.taobao.munion.ewall.ui.fragments;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.taobao.munion.model.a;
import com.taobao.munion.model.b;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.view.handler.UMEWallPromoter;

public class EWallPageFragment$GaiItemHolder
{
  TextView adwordTextView;
  View contentView;
  ImageView imageView;
  Context mContext;
  TextView priceTextView;
  
  public EWallPageFragment$GaiItemHolder(EWallPageFragment paramEWallPageFragment) {}
  
  public void cosmetics(a parama, Object... paramVarArgs)
  {
    com.umeng.newxp.view.handler.utils.c localc = (com.umeng.newxp.view.handler.utils.c)paramVarArgs[0];
    int i = ((Integer)paramVarArgs[1]).intValue();
    paramVarArgs = (b)paramVarArgs[2];
    this.imageView.setTag(parama.c);
    if (parama.s > 0.0D) {}
    for (double d = parama.s; d > 100000.0D; d = parama.v)
    {
      float f = (int)(d / 1000.0D) / 10.0F;
      localObject = f + "万";
      this.priceTextView.setText((CharSequence)localObject);
      localObject = (UMEWallPromoter)Promoter.getPromoterFromJson(parama.z, UMEWallPromoter.class);
      this.contentView.setOnClickListener(new EWallPageFragment.GaiItemHolder.1(this, (UMEWallPromoter)localObject, i, paramVarArgs, parama));
      this.adwordTextView.setText(parama.g);
      this.imageView.setImageBitmap(null);
      this.imageView.setTag(parama.c);
      localc.a(parama.c, this.imageView, this.this$0.mEWallTabBean.g());
      return;
    }
    Object localObject = this.priceTextView;
    StringBuilder localStringBuilder = new StringBuilder();
    if (d > 0.0D) {}
    for (;;)
    {
      ((TextView)localObject).setText(d);
      break;
      d = 0.0D;
    }
  }
  
  public View inflate(Context paramContext)
  {
    this.mContext = paramContext;
    this.contentView = View.inflate(paramContext, com.umeng.newxp.view.handler.ewall.c.d(paramContext), null);
    this.imageView = ((ImageView)this.contentView.findViewById(com.umeng.newxp.view.handler.ewall.c.E(paramContext)));
    this.adwordTextView = ((TextView)this.contentView.findViewById(com.umeng.newxp.view.handler.ewall.c.n(paramContext)));
    this.priceTextView = ((TextView)this.contentView.findViewById(com.umeng.newxp.view.handler.ewall.c.x(paramContext)));
    this.contentView.setTag(this);
    return this.contentView;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallPageFragment$GaiItemHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */