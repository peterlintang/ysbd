package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo
{
  public Method setHomeActionContentDescription;
  public Method setHomeAsUpIndicator;
  public ImageView upIndicatorView;
  
  ActionBarDrawerToggleHoneycomb$SetIndicatorInfo(Activity paramActivity)
  {
    for (;;)
    {
      Object localObject;
      try
      {
        this.setHomeAsUpIndicator = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[] { Drawable.class });
        this.setHomeActionContentDescription = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[] { Integer.TYPE });
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        paramActivity = paramActivity.findViewById(16908332);
        if (paramActivity == null) {
          continue;
        }
        localObject = (ViewGroup)paramActivity.getParent();
        if (((ViewGroup)localObject).getChildCount() != 2) {
          continue;
        }
        paramActivity = ((ViewGroup)localObject).getChildAt(0);
        localObject = ((ViewGroup)localObject).getChildAt(1);
        if (paramActivity.getId() != 16908332) {
          break label113;
        }
      }
      paramActivity = (Activity)localObject;
      label113:
      while ((paramActivity instanceof ImageView))
      {
        this.upIndicatorView = ((ImageView)paramActivity);
        return;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */