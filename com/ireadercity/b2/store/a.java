package com.ireadercity.b2.store;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.ui.widget.FriendlyScrollLayout;

final class a
  implements View.OnClickListener
{
  a(CloudStoreActivity paramCloudStoreActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = PreferenceManager.getDefaultSharedPreferences(this.a.getApplicationContext()).getString("userName", null);
    CloudStoreActivity.a(this.a);
    if ((FriendlyScrollLayout.a() == 3) && (paramView != null))
    {
      this.a.a(true);
      return;
    }
    this.a.a(false);
    CloudStoreActivity.a(this.a).a(3);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */