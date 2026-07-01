package com.umeng.newxp.view;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

class i$4
  implements TextView.OnEditorActionListener
{
  i$4(i parami) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if ((paramInt == 3) || (paramInt == 2) || (paramInt == 0))
    {
      paramTextView = i.a(this.a).getText().toString().trim();
      if ((TextUtils.isEmpty(paramTextView)) || (this.a.b == null) || (i.a == null)) {
        break label71;
      }
      this.a.a(paramTextView);
    }
    for (;;)
    {
      bool = true;
      return bool;
      label71:
      Toast.makeText(this.a.getActivity(), "请正确输入搜索内容哦，亲～", 0).show();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\i$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */