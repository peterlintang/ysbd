package com.umeng.socialize.view;

import android.location.Location;
import android.widget.Toast;
import com.umeng.socialize.b.a;
import com.umeng.socialize.b.b;

class y
  extends b
{
  y(q paramq, a parama)
  {
    super(parama);
  }
  
  protected void a(Location paramLocation)
  {
    super.onPostExecute(paramLocation);
    q.a(this.a, paramLocation);
    q.a(this.a, false);
    if (paramLocation == null) {
      Toast.makeText(q.g(this.a), "获取地理位置失败，请稍候重试.", 0).show();
    }
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    q.a(this.a, true);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */