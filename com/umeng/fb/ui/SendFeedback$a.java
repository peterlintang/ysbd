package com.umeng.fb.ui;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.fb.util.ActivityStarter;

class SendFeedback$a
  implements View.OnClickListener
{
  private SendFeedback$a(SendFeedback paramSendFeedback) {}
  
  public void onClick(View paramView)
  {
    this.a.finish();
    if (ActivityStarter.lastContext != null) {
      ((Activity)ActivityStarter.lastContext).finish();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\SendFeedback$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */