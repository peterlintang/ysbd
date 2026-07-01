package com.ireadercity.b2.store;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.a;

final class f
  implements View.OnClickListener
{
  f(CloudStoreActivity paramCloudStoreActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent("android.intent.action.VIEW", Uri.parse("http://ibooks." + a.y + "/CN/Resetpassword.aspx"));
    this.a.startActivity(paramView);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */