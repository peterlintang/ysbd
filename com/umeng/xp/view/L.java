package com.umeng.xp.view;

import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.umeng.xp.Promoter;
import com.umeng.xp.common.g.a;
import java.util.List;

class L
  implements g.a
{
  L(ExchangeViewManager paramExchangeViewManager, View.OnClickListener paramOnClickListener) {}
  
  public void a(int paramInt) {}
  
  public void a(ImageView paramImageView) {}
  
  public void a(List<Promoter> paramList)
  {
    ExchangeViewManager.c(this.b).setOnClickListener(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\L.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */