package com.umeng.newxp.view;

import android.app.Activity;
import android.os.Bundle;
import com.umeng.newxp.a.c;
import com.umeng.newxp.a.d;
import com.umeng.newxp.view.common.actionbar.ActionBar;
import com.umeng.newxp.view.common.actionbar.a;

public class UMCity
  extends Activity
{
  private void a()
  {
    ActionBar localActionBar = (ActionBar)findViewById(c.ar(this));
    localActionBar.setLeftAction(new a(this));
    localActionBar.setTitle("选择城市");
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(d.t(this));
    a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\UMCity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */