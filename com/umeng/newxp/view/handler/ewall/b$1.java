package com.umeng.newxp.view.handler.ewall;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class b$1
  implements View.OnClickListener
{
  b$1(b paramb) {}
  
  public void onClick(View paramView)
  {
    if (this.a.p)
    {
      paramView = new Intent("android.speech.action.RECOGNIZE_SPEECH");
      paramView.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
      paramView.putExtra("android.speech.extra.PROMPT", "请开始说话");
      this.a.startActivityForResult(paramView, 2199);
      return;
    }
    this.a.l.setText("");
    b.a(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\b$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */