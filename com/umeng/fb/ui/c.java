package com.umeng.fb.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.fb.util.ActivityStarter;

class c
  implements View.OnClickListener
{
  c(FeedbackConversations paramFeedbackConversations) {}
  
  public void onClick(View paramView)
  {
    ActivityStarter.openSendFeedbackActivity(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */