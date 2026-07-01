package com.ireadercity.b2.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.ireadercity.b2.bean.NetBookInfo;
import com.ireadercity.b2.bean.e;
import com.ireadercity.b2.store.CloudStoreBaseActivity;

final class p
  implements View.OnClickListener
{
  p(l paraml) {}
  
  public final void onClick(View paramView)
  {
    try
    {
      NetBookInfo localNetBookInfo = new NetBookInfo();
      paramView = (e)paramView.getTag();
      localNetBookInfo.a(paramView.a);
      localNetBookInfo.g(paramView.k);
      localNetBookInfo.d(paramView.g);
      localNetBookInfo.b(paramView.f);
      localNetBookInfo.f(paramView.h);
      ((CloudStoreBaseActivity)l.a(this.a)).a(localNetBookInfo);
      return;
    }
    catch (Exception paramView)
    {
      paramView.printStackTrace();
      Toast.makeText(l.a(this.a), "发生异常，不能直接下载", 0).show();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */