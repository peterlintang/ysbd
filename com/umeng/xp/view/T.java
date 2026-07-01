package com.umeng.xp.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.common.c;
import com.umeng.xp.Promoter;
import com.umeng.xp.view.widget.a.a;
import com.umeng.xp.view.widget.a.b;
import java.util.List;

class T
  extends a.a
{
  T(GridTemplate paramGridTemplate, List paramList, a.b paramb, Context paramContext)
  {
    super(paramList, paramb);
  }
  
  public View a(int paramInt1, int paramInt2, Promoter paramPromoter)
  {
    new com.umeng.common.b.i(this.a);
    View localView = View.inflate(this.a, c.a(GridTemplate.c(this.b)).d("umeng_xp_handler_grid_item"), null);
    ((TextView)localView.findViewById(c.a(GridTemplate.c(this.b)).b("umeng_xp_handler_grid_item_tv"))).setText(paramPromoter.title);
    ImageView localImageView = (ImageView)localView.findViewById(c.a(GridTemplate.c(this.b)).b("umeng_xp_new_tip"));
    if (localImageView != null)
    {
      if (paramPromoter.new_tip != 1) {
        break label180;
      }
      localImageView.setVisibility(0);
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(paramPromoter.icon))
      {
        localImageView = (ImageView)localView.findViewById(c.a(GridTemplate.c(this.b)).b("umeng_xp_handler_grid_item_icon"));
        com.umeng.common.net.i.a(this.a, localImageView, paramPromoter.icon, false, null, null, true);
      }
      localView.setOnClickListener(new U(this, paramPromoter));
      return localView;
      label180:
      localImageView.setVisibility(8);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\T.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */