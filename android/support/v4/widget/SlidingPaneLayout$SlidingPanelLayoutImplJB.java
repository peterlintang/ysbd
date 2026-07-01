package android.support.v4.widget;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class SlidingPaneLayout$SlidingPanelLayoutImplJB
  extends SlidingPaneLayout.SlidingPanelLayoutImplBase
{
  private Method mGetDisplayList;
  private Field mRecreateDisplayList;
  
  SlidingPaneLayout$SlidingPanelLayoutImplJB()
  {
    try
    {
      this.mGetDisplayList = View.class.getDeclaredMethod("getDisplayList", null);
      try
      {
        this.mRecreateDisplayList = View.class.getDeclaredField("mRecreateDisplayList");
        this.mRecreateDisplayList.setAccessible(true);
        return;
      }
      catch (NoSuchFieldException localNoSuchFieldException) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  public void invalidateChildRegion(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    if ((this.mGetDisplayList != null) && (this.mRecreateDisplayList != null)) {}
    try
    {
      this.mRecreateDisplayList.setBoolean(paramView, true);
      this.mGetDisplayList.invoke(paramView, null);
      super.invalidateChildRegion(paramSlidingPaneLayout, paramView);
      return;
      paramView.invalidate();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\SlidingPaneLayout$SlidingPanelLayoutImplJB.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */