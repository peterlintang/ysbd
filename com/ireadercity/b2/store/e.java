package com.ireadercity.b2.store;

import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.ireadercity.b2.a.h;
import com.ireadercity.b2.ui.widget.SegmentedRadioGroup;

final class e
  implements RadioGroup.OnCheckedChangeListener
{
  e(SegmentedRadioGroup paramSegmentedRadioGroup, ListView paramListView1, ak paramak1, ListView paramListView2, ListView paramListView3, ak paramak2, ak paramak3) {}
  
  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    if (paramRadioGroup == this.a) {}
    switch (paramInt)
    {
    default: 
      return;
    case 2131362331: 
      this.b.setVisibility(0);
      ((h)this.b.getAdapter()).notifyDataSetChanged();
      if (this.b.getAdapter().getCount() == 0) {
        this.c.c();
      }
      this.d.setVisibility(4);
      this.e.setVisibility(4);
      CloudStoreActivity.a(this.d);
      CloudStoreActivity.a(this.e);
      new StringBuilder().append(this.b).append(" 1 clicked").toString();
      return;
    case 2131362332: 
      this.d.setVisibility(0);
      ((h)this.d.getAdapter()).notifyDataSetChanged();
      if (this.d.getAdapter().getCount() == 0) {
        this.f.c();
      }
      this.b.setVisibility(4);
      this.e.setVisibility(4);
      this.b.setVisibility(4);
      this.e.setVisibility(4);
      CloudStoreActivity.a(this.b);
      CloudStoreActivity.a(this.e);
      new StringBuilder().append(this.d).append(" 2 clicked").toString();
      return;
    }
    this.e.setVisibility(0);
    ((h)this.e.getAdapter()).notifyDataSetChanged();
    if (this.e.getAdapter().getCount() == 0) {
      this.g.c();
    }
    this.d.setVisibility(4);
    this.b.setVisibility(4);
    this.b.setVisibility(4);
    this.d.setVisibility(4);
    CloudStoreActivity.a(this.b);
    CloudStoreActivity.a(this.d);
    new StringBuilder().append(this.e).append(" 3 clicked").toString();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */