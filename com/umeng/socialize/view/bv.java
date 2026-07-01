package com.umeng.socialize.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.umeng.socialize.common.m;

class bv
  implements View.OnClickListener
{
  bv(ShareActivity paramShareActivity) {}
  
  public void onClick(View paramView)
  {
    if (ShareActivity.c(this.a))
    {
      if (!ShareActivity.b(this.a).a) {
        ShareActivity.b(this.a).a(this.a, ShareActivity.d(this.a), ShareActivity.e(this.a));
      }
      ShareActivity.b(this.a).b();
      ShareActivity.b(this.a).setVisibility(0);
    }
    while (ShareActivity.f(this.a).isShowing()) {
      return;
    }
    ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(ShareActivity.g(this.a).getWindowToken(), 0);
    m.a(ShareActivity.f(this.a), false);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */