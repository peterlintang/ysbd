package com.umeng.socialize.view;

import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.view.controller.a.a;
import com.umeng.socialize.view.wigets.SlideBar;
import com.umeng.socialize.view.wigets.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class cc
  implements a.a
{
  cc(cb paramcb) {}
  
  public void a()
  {
    cb.e(this.a).setVisibility(0);
    cb.f(this.a).setVisibility(4);
  }
  
  public void a(List<UMFriend> paramList)
  {
    int i = cb.a(this.a).getCount();
    cb.a(this.a, new ArrayList(paramList));
    if (cb.b(this.a) != null) {
      cb.a(this.a).a(cb.c(this.a), cb.d(this.a));
    }
    cb.a(this.a).notifyDataSetChanged();
    cb.b(this.a).updateAlphabet(cb.a(this.a).a());
    int j = cb.a(this.a).getCount();
    cb.e(this.a).setVisibility(8);
    cb.f(this.a).setVisibility(0);
    Toast.makeText(cb.g(this.a), "已成功更新 " + (j - i) + " 个好友. ", 0).show();
  }
  
  public void b()
  {
    cb.e(this.a).setVisibility(8);
    cb.f(this.a).setVisibility(0);
    Toast.makeText(cb.g(this.a), "更新失败了，请重试.", 0).show();
  }
  
  public void b(List<UMFriend> paramList)
  {
    cb.b(this.a, new ArrayList(paramList));
    if (cb.d(this.a) != null) {
      paramList = cb.d(this.a).iterator();
    }
    for (;;)
    {
      if (!paramList.hasNext()) {
        return;
      }
      ((UMFriend)paramList.next()).group = "常".charAt(0);
    }
  }
  
  public void c(List<UMFriend> paramList)
  {
    cb.a(this.a, new ArrayList(paramList));
    this.a.a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */