package com.umeng.newxp.view.feed;

import android.content.Context;
import android.widget.FrameLayout;

public class e
  extends FrameLayout
{
  e.a a;
  
  public e(Context paramContext)
  {
    super(paramContext);
  }
  
  public void a(e.a parama)
  {
    this.a = parama;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.a != null) {
      this.a.onMeasured(paramInt1, paramInt2);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */