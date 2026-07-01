package android.support.v4.app;

import android.view.MenuItem;

class ShareCompat$ShareCompatImplICS
  extends ShareCompat.ShareCompatImplBase
{
  public void configureMenuItem(MenuItem paramMenuItem, ShareCompat.IntentBuilder paramIntentBuilder)
  {
    ShareCompatICS.configureMenuItem(paramMenuItem, paramIntentBuilder.getActivity(), paramIntentBuilder.getIntent());
    if (shouldAddChooserIntent(paramMenuItem)) {
      paramMenuItem.setIntent(paramIntentBuilder.createChooserIntent());
    }
  }
  
  boolean shouldAddChooserIntent(MenuItem paramMenuItem)
  {
    return !paramMenuItem.hasSubMenu();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\ShareCompat$ShareCompatImplICS.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */