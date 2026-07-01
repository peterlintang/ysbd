package com.umeng.newxp.view.common;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Toast;

class g$1
  implements View.OnClickListener
{
  g$1(g paramg) {}
  
  public void onClick(View paramView)
  {
    if (this.a.b.canGoBack())
    {
      this.a.b.goBack();
      return;
    }
    Toast.makeText(this.a.a, "已经是第一页了，亲～", 0).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\g$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */