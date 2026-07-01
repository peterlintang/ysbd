package com.umeng.socialize.view.a;

import android.os.Handler;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.controller.listener.SocializeListeners.FetchCommetsListener;
import java.util.List;

class d
  implements SocializeListeners.FetchCommetsListener
{
  d(b paramb, b.a parama) {}
  
  public void onComplete(int paramInt, List<UMComment> paramList, SocializeEntity paramSocializeEntity)
  {
    this.a.runOnUiThread(new f(this, paramInt, paramList, this.b));
  }
  
  public void onStart()
  {
    this.b.a();
    b.a(this.a, true);
    String str = b.e;
    b.a(this.a).postDelayed(new e(this), 20000L);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */