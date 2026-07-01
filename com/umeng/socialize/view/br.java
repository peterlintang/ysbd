package com.umeng.socialize.view;

import android.location.Location;
import android.widget.Toast;
import com.umeng.socialize.b.a;
import com.umeng.socialize.b.b;

class br
  extends b
{
  br(ShareActivity paramShareActivity, a parama)
  {
    super(parama);
  }
  
  protected void a(Location paramLocation)
  {
    super.onPostExecute(paramLocation);
    ShareActivity.a(this.a, paramLocation);
    ShareActivity.b(this.a, false);
    if ((paramLocation == null) && (!this.a.isFinishing())) {
      Toast.makeText(ShareActivity.m(this.a), "获取地理位置失败，请稍候重试.", 0).show();
    }
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    ShareActivity.b(this.a, true);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */