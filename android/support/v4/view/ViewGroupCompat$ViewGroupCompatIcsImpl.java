package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

class ViewGroupCompat$ViewGroupCompatIcsImpl
  extends ViewGroupCompat.ViewGroupCompatHCImpl
{
  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return ViewGroupCompatIcs.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ViewGroupCompat$ViewGroupCompatIcsImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */