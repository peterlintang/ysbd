package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;

class AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl
  extends AccessibilityDelegateCompat.AccessibilityDelegateIcsImpl
{
  public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(Object paramObject, View paramView)
  {
    paramObject = AccessibilityDelegateCompatJellyBean.getAccessibilityNodeProvider(paramObject, paramView);
    if (paramObject != null) {
      return new AccessibilityNodeProviderCompat(paramObject);
    }
    return null;
  }
  
  public Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
  {
    return AccessibilityDelegateCompatJellyBean.newAccessibilityDelegateBridge(new AccessibilityDelegateCompat.AccessibilityDelegateJellyBeanImpl.1(this, paramAccessibilityDelegateCompat));
  }
  
  public boolean performAccessibilityAction(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return AccessibilityDelegateCompatJellyBean.performAccessibilityAction(paramObject, paramView, paramInt, paramBundle);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */