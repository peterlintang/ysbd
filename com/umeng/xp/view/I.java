package com.umeng.xp.view;

import android.widget.ImageView;
import com.umeng.xp.Promoter;
import com.umeng.xp.common.g.a;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.XpListenersCenter.NTipsChangedListener;
import java.util.List;

class I
  implements g.a
{
  I(ExchangeViewManager paramExchangeViewManager, XpListenersCenter.NTipsChangedListener paramNTipsChangedListener) {}
  
  public void a(int paramInt) {}
  
  public void a(ImageView paramImageView) {}
  
  public void a(List<Promoter> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0)) {
      ExchangeViewManager.c(this.b).setVisibility(0);
    }
    ExchangeViewManager.a(this.b).preloadData(this.b.c, paramList, this.a, 7);
    ExchangeViewManager.c(this.b).setOnClickListener(new J(this, paramList));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\I.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */