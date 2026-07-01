package android.support.v4.view.accessibility;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.List;

public class AccessibilityNodeProviderCompat
{
  private static final AccessibilityNodeProviderCompat.AccessibilityNodeProviderImpl IMPL = new AccessibilityNodeProviderCompat.AccessibilityNodeProviderStubImpl();
  private final Object mProvider;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      IMPL = new AccessibilityNodeProviderCompat.AccessibilityNodeProviderKitKatImpl();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      IMPL = new AccessibilityNodeProviderCompat.AccessibilityNodeProviderJellyBeanImpl();
      return;
    }
  }
  
  public AccessibilityNodeProviderCompat()
  {
    this.mProvider = IMPL.newAccessibilityNodeProviderBridge(this);
  }
  
  public AccessibilityNodeProviderCompat(Object paramObject)
  {
    this.mProvider = paramObject;
  }
  
  public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int paramInt)
  {
    return null;
  }
  
  public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String paramString, int paramInt)
  {
    return null;
  }
  
  public AccessibilityNodeInfoCompat findFocus(int paramInt)
  {
    return null;
  }
  
  public Object getProvider()
  {
    return this.mProvider;
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\accessibility\AccessibilityNodeProviderCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */