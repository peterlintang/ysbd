package com.taobao.munion.listviewanimations.itemmanipulation.contextualundo;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class a$1
  implements AbsListView.OnScrollListener
{
  a$1(a parama) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    boolean bool = true;
    paramAbsListView = this.a;
    if (paramInt != 1) {}
    for (;;)
    {
      paramAbsListView.a(bool);
      if (a.a(this.a)) {
        a.b(this.a).a();
      }
      return;
      bool = false;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\listviewanimations\itemmanipulation\contextualundo\a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */