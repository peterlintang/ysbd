package com.ireadercity.b2.a;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.bean.e;

final class m
  implements View.OnClickListener
{
  m(l paraml) {}
  
  public final void onClick(View paramView)
  {
    e locale = (e)paramView.getTag();
    if (locale == null)
    {
      l.b();
      return;
    }
    switch (paramView.getId())
    {
    default: 
      return;
    }
    try
    {
      paramView = new AlertDialog.Builder(l.a(this.a));
      paramView.setTitle(2131230798);
      paramView.setMessage("你确定要删除本条云端的阅读记录吗？ 书名：" + locale.f);
      paramView.setPositiveButton("确认", new n(this, locale));
      paramView.setNegativeButton("取消", new o(this));
      paramView.show();
      this.a.notifyDataSetChanged();
      return;
    }
    catch (Exception paramView)
    {
      for (;;)
      {
        paramView.printStackTrace();
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */