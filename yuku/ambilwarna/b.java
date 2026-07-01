package yuku.ambilwarna;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class b
  implements View.OnTouchListener
{
  b(a parama) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    float f3 = 0.0F;
    float f1;
    if ((paramMotionEvent.getAction() == 2) || (paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 1))
    {
      float f2 = paramMotionEvent.getY();
      f1 = f2;
      if (f2 < 0.0F) {
        f1 = 0.0F;
      }
      f2 = f1;
      if (f1 > this.a.c.getMeasuredHeight()) {
        f2 = this.a.c.getMeasuredHeight() - 0.001F;
      }
      f1 = 360.0F - f2 * (360.0F / this.a.c.getMeasuredHeight());
      if (f1 != 360.0F) {
        break label199;
      }
      f1 = f3;
    }
    label199:
    for (;;)
    {
      this.a.j[0] = f1;
      this.a.d.a(this.a.j[0]);
      this.a.a();
      this.a.g.setBackgroundColor(Color.HSVToColor(this.a.j));
      paramView = this.a.b;
      paramMotionEvent = this.a;
      paramView.b(Color.HSVToColor(this.a.j));
      return true;
      return false;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\yuku\ambilwarna\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */