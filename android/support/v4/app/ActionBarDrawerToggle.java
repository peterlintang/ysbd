package android.support.v4.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.DrawerListener;
import android.view.MenuItem;
import android.view.View;

public class ActionBarDrawerToggle
  implements DrawerLayout.DrawerListener
{
  private static final int ID_HOME = 16908332;
  private static final ActionBarDrawerToggle.ActionBarDrawerToggleImpl IMPL = new ActionBarDrawerToggle.ActionBarDrawerToggleImplBase(null);
  private static final float TOGGLE_DRAWABLE_OFFSET = 0.33333334F;
  private final Activity mActivity;
  private final ActionBarDrawerToggle.Delegate mActivityImpl;
  private final int mCloseDrawerContentDescRes;
  private Drawable mDrawerImage;
  private final int mDrawerImageResource;
  private boolean mDrawerIndicatorEnabled = true;
  private final DrawerLayout mDrawerLayout;
  private final int mOpenDrawerContentDescRes;
  private Object mSetIndicatorInfo;
  private ActionBarDrawerToggle.SlideDrawable mSlider;
  private Drawable mThemeImage;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      IMPL = new ActionBarDrawerToggle.ActionBarDrawerToggleImplHC(null);
      return;
    }
  }
  
  public ActionBarDrawerToggle(Activity paramActivity, DrawerLayout paramDrawerLayout, int paramInt1, int paramInt2, int paramInt3)
  {
    this.mActivity = paramActivity;
    if ((paramActivity instanceof ActionBarDrawerToggle.DelegateProvider)) {}
    for (this.mActivityImpl = ((ActionBarDrawerToggle.DelegateProvider)paramActivity).getDrawerToggleDelegate();; this.mActivityImpl = null)
    {
      this.mDrawerLayout = paramDrawerLayout;
      this.mDrawerImageResource = paramInt1;
      this.mOpenDrawerContentDescRes = paramInt2;
      this.mCloseDrawerContentDescRes = paramInt3;
      this.mThemeImage = getThemeUpIndicator();
      this.mDrawerImage = paramActivity.getResources().getDrawable(paramInt1);
      this.mSlider = new ActionBarDrawerToggle.SlideDrawable(this, this.mDrawerImage, null);
      this.mSlider.setOffset(0.33333334F);
      return;
    }
  }
  
  Drawable getThemeUpIndicator()
  {
    if (this.mActivityImpl != null) {
      return this.mActivityImpl.getThemeUpIndicator();
    }
    return IMPL.getThemeUpIndicator(this.mActivity);
  }
  
  public boolean isDrawerIndicatorEnabled()
  {
    return this.mDrawerIndicatorEnabled;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.mThemeImage = getThemeUpIndicator();
    this.mDrawerImage = this.mActivity.getResources().getDrawable(this.mDrawerImageResource);
    syncState();
  }
  
  public void onDrawerClosed(View paramView)
  {
    this.mSlider.setPosition(0.0F);
    if (this.mDrawerIndicatorEnabled) {
      setActionBarDescription(this.mOpenDrawerContentDescRes);
    }
  }
  
  public void onDrawerOpened(View paramView)
  {
    this.mSlider.setPosition(1.0F);
    if (this.mDrawerIndicatorEnabled) {
      setActionBarDescription(this.mCloseDrawerContentDescRes);
    }
  }
  
  public void onDrawerSlide(View paramView, float paramFloat)
  {
    float f = this.mSlider.getPosition();
    if (paramFloat > 0.5F) {}
    for (paramFloat = Math.max(f, Math.max(0.0F, paramFloat - 0.5F) * 2.0F);; paramFloat = Math.min(f, paramFloat * 2.0F))
    {
      this.mSlider.setPosition(paramFloat);
      return;
    }
  }
  
  public void onDrawerStateChanged(int paramInt) {}
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if ((paramMenuItem != null) && (paramMenuItem.getItemId() == 16908332) && (this.mDrawerIndicatorEnabled))
    {
      if (this.mDrawerLayout.isDrawerVisible(8388611)) {
        this.mDrawerLayout.closeDrawer(8388611);
      }
      for (;;)
      {
        return true;
        this.mDrawerLayout.openDrawer(8388611);
      }
    }
    return false;
  }
  
  void setActionBarDescription(int paramInt)
  {
    if (this.mActivityImpl != null)
    {
      this.mActivityImpl.setActionBarDescription(paramInt);
      return;
    }
    this.mSetIndicatorInfo = IMPL.setActionBarDescription(this.mSetIndicatorInfo, this.mActivity, paramInt);
  }
  
  void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    if (this.mActivityImpl != null)
    {
      this.mActivityImpl.setActionBarUpIndicator(paramDrawable, paramInt);
      return;
    }
    this.mSetIndicatorInfo = IMPL.setActionBarUpIndicator(this.mSetIndicatorInfo, this.mActivity, paramDrawable, paramInt);
  }
  
  public void setDrawerIndicatorEnabled(boolean paramBoolean)
  {
    int i;
    if (paramBoolean != this.mDrawerIndicatorEnabled)
    {
      if (!paramBoolean) {
        break label54;
      }
      ActionBarDrawerToggle.SlideDrawable localSlideDrawable = this.mSlider;
      if (!this.mDrawerLayout.isDrawerOpen(8388611)) {
        break label46;
      }
      i = this.mCloseDrawerContentDescRes;
      setActionBarUpIndicator(localSlideDrawable, i);
    }
    for (;;)
    {
      this.mDrawerIndicatorEnabled = paramBoolean;
      return;
      label46:
      i = this.mOpenDrawerContentDescRes;
      break;
      label54:
      setActionBarUpIndicator(this.mThemeImage, 0);
    }
  }
  
  public void syncState()
  {
    ActionBarDrawerToggle.SlideDrawable localSlideDrawable;
    if (this.mDrawerLayout.isDrawerOpen(8388611))
    {
      this.mSlider.setPosition(1.0F);
      if (this.mDrawerIndicatorEnabled)
      {
        localSlideDrawable = this.mSlider;
        if (!this.mDrawerLayout.isDrawerOpen(8388611)) {
          break label67;
        }
      }
    }
    label67:
    for (int i = this.mCloseDrawerContentDescRes;; i = this.mOpenDrawerContentDescRes)
    {
      setActionBarUpIndicator(localSlideDrawable, i);
      return;
      this.mSlider.setPosition(0.0F);
      break;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\ActionBarDrawerToggle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */