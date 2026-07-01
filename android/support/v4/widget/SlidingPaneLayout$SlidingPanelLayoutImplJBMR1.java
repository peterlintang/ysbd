package android.support.v4.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;

class SlidingPaneLayout$SlidingPanelLayoutImplJBMR1
  extends SlidingPaneLayout.SlidingPanelLayoutImplBase
{
  public void invalidateChildRegion(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    ViewCompat.setLayerPaint(paramView, ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).dimPaint);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\SlidingPaneLayout$SlidingPanelLayoutImplJBMR1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */