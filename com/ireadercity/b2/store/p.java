package com.ireadercity.b2.store;

import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.ui.widget.FriendlyScrollLayout;
import com.ireadercity.b2.ui.widget.ToolSlider;

final class p
  implements View.OnClickListener
{
  p(CloudStoreActivity paramCloudStoreActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView == CloudStoreActivity.h(this.a))
    {
      CloudStoreActivity.f(this.a).a(1, CloudStoreActivity.e(this.a));
      CloudStoreActivity.a(this.a).a(1);
    }
    do
    {
      return;
      if (paramView == CloudStoreActivity.i(this.a))
      {
        CloudStoreActivity.f(this.a).a(0, CloudStoreActivity.e(this.a));
        CloudStoreActivity.a(this.a).a(0);
        return;
      }
      if (paramView == CloudStoreActivity.j(this.a))
      {
        CloudStoreActivity.f(this.a).a(3, CloudStoreActivity.e(this.a));
        CloudStoreActivity.a(this.a).a(3);
        return;
      }
    } while (paramView != CloudStoreActivity.k(this.a));
    CloudStoreActivity.f(this.a).a(2, CloudStoreActivity.e(this.a));
    CloudStoreActivity.a(this.a).a(2);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */