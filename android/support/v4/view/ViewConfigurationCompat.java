package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public class ViewConfigurationCompat
{
  static final ViewConfigurationCompat.ViewConfigurationVersionImpl IMPL = new ViewConfigurationCompat.BaseViewConfigurationVersionImpl();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      IMPL = new ViewConfigurationCompat.FroyoViewConfigurationVersionImpl();
      return;
    }
  }
  
  public static int getScaledPagingTouchSlop(ViewConfiguration paramViewConfiguration)
  {
    return IMPL.getScaledPagingTouchSlop(paramViewConfiguration);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ViewConfigurationCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */