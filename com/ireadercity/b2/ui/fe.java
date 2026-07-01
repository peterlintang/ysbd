package com.ireadercity.b2.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.ireadercity.b2.bean.i;

final class fe
  implements View.OnTouchListener
{
  fe(SetReaderActivity paramSetReaderActivity) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      SetReaderActivity.c().e(SetReaderActivity.c().d());
      SetReaderActivity.c().c(SetReaderActivity.c().g());
      this.a.a();
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */