package android.support.v4.view;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

class MenuItemCompatIcs$OnActionExpandListenerWrapper
  implements MenuItem.OnActionExpandListener
{
  private MenuItemCompatIcs.SupportActionExpandProxy mWrapped;
  
  public MenuItemCompatIcs$OnActionExpandListenerWrapper(MenuItemCompatIcs.SupportActionExpandProxy paramSupportActionExpandProxy)
  {
    this.mWrapped = paramSupportActionExpandProxy;
  }
  
  public boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
  {
    return this.mWrapped.onMenuItemActionCollapse(paramMenuItem);
  }
  
  public boolean onMenuItemActionExpand(MenuItem paramMenuItem)
  {
    return this.mWrapped.onMenuItemActionExpand(paramMenuItem);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\MenuItemCompatIcs$OnActionExpandListenerWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */