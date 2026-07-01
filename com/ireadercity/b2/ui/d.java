package com.ireadercity.b2.ui;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.h.y;

final class d
  implements View.OnClickListener
{
  d(AIReaderActivity paramAIReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    if (y.a(this.a.getApplicationContext()).booleanValue())
    {
      this.a.d();
      return;
    }
    paramView = new AlertDialog.Builder(this.a);
    paramView.setTitle(2131230798);
    paramView.setMessage("无可用网络连接，不能访问云端书库！");
    paramView.setPositiveButton("确认", new e(this));
    paramView.setNegativeButton("设置网络", new f(this));
    paramView.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */