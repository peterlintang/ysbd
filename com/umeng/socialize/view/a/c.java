package com.umeng.socialize.view.a;

import com.umeng.socialize.a.a;
import com.umeng.socialize.bean.SocializeEntity;
import java.util.List;

class c
  implements Runnable
{
  c(b paramb, b.a parama) {}
  
  public void run()
  {
    this.b.a();
    List localList = new a(this.a).a(this.a.f.entityKey);
    if ((localList == null) || (localList.size() == 0))
    {
      this.a.fetchFormNet(this.b, -1L);
      return;
    }
    this.b.a(localList);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */