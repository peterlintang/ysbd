package com.umeng.fb;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.fb.util.ActivityStarter;

final class d
  implements View.OnClickListener
{
  d(AlertDialog paramAlertDialog) {}
  
  public final void onClick(View paramView)
  {
    ActivityStarter.openFeedbackListActivity(UMFeedbackService.a());
    this.a.dismiss();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */