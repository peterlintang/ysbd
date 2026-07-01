package com.umeng.newxp.view.handler.ewall;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

class b$4
  implements TextView.OnEditorActionListener
{
  b$4(b paramb) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if ((paramInt == 3) || (paramInt == 2) || (paramInt == 0))
    {
      paramTextView = this.a.l.getText().toString().trim();
      if (TextUtils.isEmpty(paramTextView)) {
        break label55;
      }
      this.a.a(paramTextView);
    }
    for (;;)
    {
      bool = true;
      return bool;
      label55:
      Toast.makeText(this.a, "请正确输入搜索内容哦，亲～", 0).show();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\b$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */