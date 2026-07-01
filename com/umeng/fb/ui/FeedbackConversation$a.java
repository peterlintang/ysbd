package com.umeng.fb.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import com.umeng.fb.b.a;
import com.umeng.fb.util.c;

class FeedbackConversation$a
  extends BroadcastReceiver
{
  private FeedbackConversation$a(FeedbackConversation paramFeedbackConversation) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getStringExtra("feedback_id");
    if (FeedbackConversation.b(this.a).c.equalsIgnoreCase(paramContext))
    {
      FeedbackConversation.a(this.a, c.b(this.a, paramContext));
      FeedbackConversation.c(this.a).a(FeedbackConversation.b(this.a));
      FeedbackConversation.c(this.a).notifyDataSetChanged();
    }
    if (FeedbackConversation.b(this.a).b != b.a.d)
    {
      FeedbackConversation.a(this.a).setEnabled(false);
      FeedbackConversation.d(this.a).setEnabled(false);
      return;
    }
    FeedbackConversation.a(this.a).setEnabled(true);
    FeedbackConversation.d(this.a).setEnabled(true);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\FeedbackConversation$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */