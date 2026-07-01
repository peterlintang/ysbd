package com.umeng.socialize.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class bw
  implements View.OnClickListener
{
  bw(ShareActivity paramShareActivity) {}
  
  public void onClick(View paramView)
  {
    ShareActivity.h(this.a).setClickable(false);
    this.a.b();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */