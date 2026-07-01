package com.taobao.munion.actionbar;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class ActionBar$d
  extends ActionBar.a
{
  private Context a;
  private Intent b;
  
  public ActionBar$d(Context paramContext, Intent paramIntent, int paramInt)
  {
    super(paramInt);
    this.a = paramContext;
    this.b = paramIntent;
  }
  
  public void a(View paramView)
  {
    try
    {
      this.a.startActivity(this.b);
      return;
    }
    catch (ActivityNotFoundException paramView)
    {
      Toast.makeText(this.a, "failed to open intent", 0).show();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\actionbar\ActionBar$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */