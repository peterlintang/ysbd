package com.umeng.socialize.view;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.umeng.socialize.common.m;

class aw
  extends FrameLayout
{
  aw(at paramat, Context paramContext, View paramView1, View paramView2, int paramInt)
  {
    super(paramContext);
  }
  
  private void a(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    if ((paramView2.getVisibility() == 0) && (paramInt2 < paramInt1)) {
      at.c(this.a).post(new ax(this, paramView2, paramView1));
    }
    while ((paramView2.getVisibility() == 0) || (paramInt2 < paramInt1)) {
      return;
    }
    at.c(this.a).post(new ay(this, paramView2, paramView1));
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (!m.d(at.f(this.a))) {
      a(this.b, this.c, this.d, paramInt2);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */