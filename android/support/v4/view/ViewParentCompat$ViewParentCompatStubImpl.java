package android.support.v4.view;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

class ViewParentCompat$ViewParentCompatStubImpl
  implements ViewParentCompat.ViewParentCompatImpl
{
  public boolean requestSendAccessibilityEvent(ViewParent paramViewParent, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramView == null) {
      return false;
    }
    ((AccessibilityManager)paramView.getContext().getSystemService("accessibility")).sendAccessibilityEvent(paramAccessibilityEvent);
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ViewParentCompat$ViewParentCompatStubImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */