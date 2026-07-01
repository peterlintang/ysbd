package yuku.ambilwarna;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class c
  implements View.OnTouchListener
{
  c(a parama) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    float f3 = 0.0F;
    float f2;
    float f4;
    if ((paramMotionEvent.getAction() == 2) || (paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 1))
    {
      f2 = paramMotionEvent.getX();
      f4 = paramMotionEvent.getY();
      f1 = f2;
      if (f2 < 0.0F) {
        f1 = 0.0F;
      }
      f2 = f1;
      if (f1 > this.a.d.getMeasuredWidth()) {
        f2 = this.a.d.getMeasuredWidth();
      }
      if (f4 >= 0.0F) {
        break label244;
      }
    }
    label244:
    for (float f1 = f3;; f1 = f4)
    {
      f3 = f1;
      if (f1 > this.a.d.getMeasuredHeight()) {
        f3 = this.a.d.getMeasuredHeight();
      }
      paramView = this.a;
      f1 = 1.0F / this.a.d.getMeasuredWidth();
      paramView.j[1] = (f2 * f1);
      paramView = this.a;
      f1 = 1.0F / this.a.d.getMeasuredHeight();
      paramView.j[2] = (1.0F - f3 * f1);
      this.a.b();
      this.a.g.setBackgroundColor(Color.HSVToColor(this.a.j));
      paramView = this.a.b;
      paramMotionEvent = this.a;
      paramView.b(Color.HSVToColor(this.a.j));
      return true;
      return false;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\yuku\ambilwarna\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */