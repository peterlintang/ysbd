package com.umeng.fb.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.umeng.fb.util.c;

class FeedbackConversations$a
  extends BroadcastReceiver
{
  d a;
  
  public FeedbackConversations$a(FeedbackConversations paramFeedbackConversations, d paramd)
  {
    this.a = paramd;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = c.a(this.b);
    this.a.a(paramContext);
    this.a.notifyDataSetChanged();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\FeedbackConversations$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */