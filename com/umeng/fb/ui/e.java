package com.umeng.fb.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.umeng.fb.util.ActivityStarter;

class e
  implements View.OnClickListener
{
  e(SendFeedback paramSendFeedback) {}
  
  public void onClick(View paramView)
  {
    ActivityStarter.openFeedbackListActivity(this.a);
    this.a.finish();
    ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(SendFeedback.a(this.a).getWindowToken(), 0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */