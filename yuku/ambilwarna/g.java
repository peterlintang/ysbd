package yuku.ambilwarna;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class g
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  g(a parama, View paramView) {}
  
  public final void onGlobalLayout()
  {
    this.b.a();
    this.b.b();
    this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\yuku\ambilwarna\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */