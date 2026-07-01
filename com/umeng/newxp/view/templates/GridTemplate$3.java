package com.umeng.newxp.view.templates;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.common.ufp.c;
import com.umeng.common.ufp.net.g;
import com.umeng.common.ufp.util.i;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a.d;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.view.widget.GridPage.GridPageAdapter;
import com.umeng.newxp.view.widget.GridPage.PageInfo;
import java.util.List;

class GridTemplate$3
  extends GridPage.GridPageAdapter
{
  GridTemplate$3(GridTemplate paramGridTemplate, List paramList, GridPage.PageInfo paramPageInfo, Context paramContext)
  {
    super(paramList, paramPageInfo);
  }
  
  public View a(int paramInt1, int paramInt2, Promoter paramPromoter)
  {
    new i(this.a);
    View localView = View.inflate(this.a, d.h(GridTemplate.c(this.b)), null);
    ((TextView)localView.findViewById(c.a(GridTemplate.c(this.b)).b("umeng_xp_handler_grid_item_tv"))).setText(paramPromoter.title);
    ImageView localImageView = (ImageView)localView.findViewById(c.a(GridTemplate.c(this.b)).b("umeng_xp_new_tip"));
    if (localImageView != null)
    {
      if (paramPromoter.new_tip == 1) {
        localImageView.setVisibility(0);
      }
    }
    else if (!TextUtils.isEmpty(paramPromoter.icon))
    {
      localImageView = (ImageView)localView.findViewById(c.a(GridTemplate.c(this.b)).b("umeng_xp_handler_grid_item_icon"));
      if (!ExchangeConstants.ROUND_ICON) {
        break label191;
      }
      g.a(this.a, localImageView, paramPromoter.icon, false, null, null, true);
    }
    for (;;)
    {
      localView.setOnClickListener(new GridTemplate.3.1(this, paramPromoter));
      return localView;
      localImageView.setVisibility(8);
      break;
      label191:
      g.a(this.a, localImageView, paramPromoter.icon, false);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\GridTemplate$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */