package android.support.v4.app;

import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb
{
  private static final String TAG = "ActionBarDrawerToggleHoneycomb";
  private static final int[] THEME_ATTRS = { 16843531 };
  
  public static Drawable getThemeUpIndicator(Activity paramActivity)
  {
    paramActivity = paramActivity.obtainStyledAttributes(THEME_ATTRS);
    Drawable localDrawable = paramActivity.getDrawable(0);
    paramActivity.recycle();
    return localDrawable;
  }
  
  public static Object setActionBarDescription(Object paramObject, Activity paramActivity, int paramInt)
  {
    if (paramObject == null) {
      paramObject = new ActionBarDrawerToggleHoneycomb.SetIndicatorInfo(paramActivity);
    }
    for (;;)
    {
      ActionBarDrawerToggleHoneycomb.SetIndicatorInfo localSetIndicatorInfo = (ActionBarDrawerToggleHoneycomb.SetIndicatorInfo)paramObject;
      if (localSetIndicatorInfo.setHomeAsUpIndicator != null) {}
      try
      {
        paramActivity = paramActivity.getActionBar();
        localSetIndicatorInfo.setHomeActionContentDescription.invoke(paramActivity, new Object[] { Integer.valueOf(paramInt) });
        return paramObject;
      }
      catch (Exception paramActivity)
      {
        return paramObject;
      }
    }
  }
  
  public static Object setActionBarUpIndicator(Object paramObject, Activity paramActivity, Drawable paramDrawable, int paramInt)
  {
    if (paramObject == null) {
      paramObject = new ActionBarDrawerToggleHoneycomb.SetIndicatorInfo(paramActivity);
    }
    for (;;)
    {
      ActionBarDrawerToggleHoneycomb.SetIndicatorInfo localSetIndicatorInfo = (ActionBarDrawerToggleHoneycomb.SetIndicatorInfo)paramObject;
      if (localSetIndicatorInfo.setHomeAsUpIndicator != null) {}
      for (;;)
      {
        try
        {
          paramActivity = paramActivity.getActionBar();
          localSetIndicatorInfo.setHomeAsUpIndicator.invoke(paramActivity, new Object[] { paramDrawable });
          localSetIndicatorInfo.setHomeActionContentDescription.invoke(paramActivity, new Object[] { Integer.valueOf(paramInt) });
          return paramObject;
        }
        catch (Exception paramActivity)
        {
          return paramObject;
        }
        if (localSetIndicatorInfo.upIndicatorView != null)
        {
          localSetIndicatorInfo.upIndicatorView.setImageDrawable(paramDrawable);
          return paramObject;
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\ActionBarDrawerToggleHoneycomb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */