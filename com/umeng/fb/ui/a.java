package com.umeng.fb.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import com.umeng.fb.a.f;
import com.umeng.fb.b.e;
import com.umeng.fb.util.c;
import java.util.concurrent.ExecutorService;

class a
  implements View.OnClickListener
{
  a(FeedbackConversation paramFeedbackConversation) {}
  
  public void onClick(View paramView)
  {
    paramView = FeedbackConversation.a(this.a).getText().toString();
    if ((paramView == null) || (paramView.trim().length() == 0)) {
      return;
    }
    if (paramView.length() > 140)
    {
      Toast.makeText(this.a, this.a.getString(e.q(this.a)), 0).show();
      return;
    }
    try
    {
      paramView = com.umeng.fb.util.b.a(this.a, paramView, FeedbackConversation.b(this.a).c);
      FeedbackConversation.a(this.a).setText("");
      ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(FeedbackConversation.a(this.a).getWindowToken(), 0);
      c.c(this.a, paramView);
      FeedbackConversation.a(this.a, c.b(this.a, FeedbackConversation.b(this.a).c));
      FeedbackConversation.c(this.a).a(FeedbackConversation.b(this.a));
      FeedbackConversation.c(this.a).notifyDataSetChanged();
      this.a.setSelection(FeedbackConversation.c(this.a).getCount() - 1);
      paramView = new f(paramView, this.a);
      FeedbackConversation.executorService.submit(paramView);
      return;
    }
    catch (Exception paramView)
    {
      for (;;)
      {
        Toast.makeText(this.a, paramView.getMessage(), 0).show();
        c.d(this.a, null);
        String str = FeedbackConversation.c;
        paramView.getMessage();
        paramView = null;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */