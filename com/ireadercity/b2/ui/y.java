package com.ireadercity.b2.ui;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.a.r;
import java.util.HashMap;

final class y
  implements View.OnClickListener
{
  y(AIReaderActivity paramAIReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    if (AIReaderActivity.f(this.a).a().isEmpty())
    {
      this.a.a("没有选择书籍!");
      return;
    }
    paramView = new AlertDialog.Builder(this.a);
    paramView.setTitle(2131230798);
    paramView.setMessage("删除选择的所有书籍？");
    paramView.setPositiveButton("确认", new z(this));
    paramView.setNegativeButton("取消", new aa(this));
    paramView.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */