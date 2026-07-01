package com.umeng.newxp.view.handler.umwall;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.umeng.newxp.common.a;
import java.util.List;

class UMWall$3
  implements ViewPager.OnPageChangeListener
{
  UMWall$3(UMWall paramUMWall, List paramList) {}
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
  
  public void onPageSelected(int paramInt)
  {
    this.b.h = ((a)this.a.get(paramInt));
    this.b.updateSpecialAttr(this.b.h);
    UMWall.a(this.b, paramInt, this.b.h);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\UMWall$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */