package android.support.v4.view;

import android.view.MenuItem;

class MenuItemCompatIcs
{
  public static boolean collapseActionView(MenuItem paramMenuItem)
  {
    return paramMenuItem.collapseActionView();
  }
  
  public static boolean expandActionView(MenuItem paramMenuItem)
  {
    return paramMenuItem.expandActionView();
  }
  
  public static boolean isActionViewExpanded(MenuItem paramMenuItem)
  {
    return paramMenuItem.isActionViewExpanded();
  }
  
  public static MenuItem setOnActionExpandListener(MenuItem paramMenuItem, MenuItemCompatIcs.SupportActionExpandProxy paramSupportActionExpandProxy)
  {
    return paramMenuItem.setOnActionExpandListener(new MenuItemCompatIcs.OnActionExpandListenerWrapper(paramSupportActionExpandProxy));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\MenuItemCompatIcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */