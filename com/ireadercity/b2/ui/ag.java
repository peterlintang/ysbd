package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.ireadercity.b2.a.r;

final class ag
  implements View.OnClickListener
{
  ag(AIReaderActivity paramAIReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = AIReaderActivity.f(this.a);
    if (!AIReaderActivity.f(this.a).e()) {}
    for (boolean bool = true;; bool = false)
    {
      paramView.b(bool);
      if (!AIReaderActivity.f(this.a).e()) {
        break;
      }
      this.a.i.setText("取消");
      return;
    }
    this.a.i.setText("全选");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */