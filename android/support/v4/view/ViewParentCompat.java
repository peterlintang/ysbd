package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public class ViewParentCompat
{
  static final ViewParentCompat.ViewParentCompatImpl IMPL = new ViewParentCompat.ViewParentCompatStubImpl();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      IMPL = new ViewParentCompat.ViewParentCompatICSImpl();
      return;
    }
  }
  
  public static boolean requestSendAccessibilityEvent(ViewParent paramViewParent, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return IMPL.requestSendAccessibilityEvent(paramViewParent, paramView, paramAccessibilityEvent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ViewParentCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */