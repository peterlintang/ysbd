package com.ireadercity.b2.ui;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

final class dq
  implements ActionMode.Callback
{
  private dq(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    String.format("onDestroyActionMode item=%s/%d", new Object[] { paramMenuItem.toString(), Integer.valueOf(paramMenuItem.getItemId()) });
    this.a.c(paramMenuItem.getItemId());
    return false;
  }
  
  public final boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    paramActionMode.getMenuInflater().inflate(2131427329, paramMenu);
    try
    {
      paramMenu.removeItem(16908319);
      paramMenu.removeItem(16908321);
      return true;
    }
    catch (Exception paramActionMode)
    {
      for (;;) {}
    }
  }
  
  public final void onDestroyActionMode(ActionMode paramActionMode)
  {
    this.a.a(false);
  }
  
  public final boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */