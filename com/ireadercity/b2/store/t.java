package com.ireadercity.b2.store;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

final class t
  implements View.OnClickListener
{
  t(CloudStoreBookDetailActivity paramCloudStoreBookDetailActivity, TextView paramTextView) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Boolean(false);
    if ((this.a.getTag() == null) || (this.a.getTag().equals(paramView)))
    {
      this.a.setMaxLines(Integer.MAX_VALUE);
      this.a.setTag(Boolean.valueOf(true));
      CloudStoreBookDetailActivity.a(this.b).setImageResource(2130837717);
      return;
    }
    this.a.setMaxLines(3);
    this.a.setTag(paramView);
    CloudStoreBookDetailActivity.a(this.b).setImageResource(2130837718);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */