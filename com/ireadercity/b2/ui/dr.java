package com.ireadercity.b2.ui;

import android.database.DataSetObserver;

final class dr
  extends DataSetObserver
{
  dr(HorizontialListView paramHorizontialListView) {}
  
  public final void onChanged()
  {
    synchronized (this.a)
    {
      HorizontialListView.a(this.a);
      this.a.invalidate();
      this.a.requestLayout();
      return;
    }
  }
  
  public final void onInvalidated()
  {
    HorizontialListView.b(this.a);
    this.a.invalidate();
    this.a.requestLayout();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */