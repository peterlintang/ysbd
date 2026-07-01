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

class ae
  implements a.a
{
  ae(ab paramab) {}
  
  public void a()
  {
    ab.g(this.a).setVisibility(0);
    ab.h(this.a).setVisibility(4);
  }
  
  public void a(List<UMFriend> paramList)
  {
    int i = ab.b(this.a).getCount();
    ab.a(this.a, new ArrayList(paramList));
    if (ab.d(this.a) != null) {
      ab.b(this.a).a(ab.e(this.a), ab.f(this.a));
    }
    ab.b(this.a).notifyDataSetChanged();
    ab.d(this.a).updateAlphabet(ab.b(this.a).a());
    int j = ab.b(this.a).getCount();
    ab.g(this.a).setVisibility(8);
    ab.h(this.a).setVisibility(0);
    Toast.makeText(this.a.getContext(), "已成功更新 " + (j - i) + " 个好友. ", 0).show();
  }
  
  public void b()
  {
    ab.g(this.a).setVisibility(8);
    ab.h(this.a).setVisibility(0);
    Toast.makeText(this.a.getContext(), "更新失败了，请重试.", 0).show();
  }
  
  public void b(List<UMFriend> paramList)
  {
    ab.b(this.a, new ArrayList(paramList));
    if (ab.f(this.a) != null) {
      paramList = ab.f(this.a).iterator();
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
    ab.a(this.a, new ArrayList(paramList));
    try
    {
      this.a.c();
      return;
    }
    catch (Exception paramList)
    {
      ab.d();
      paramList.toString();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */