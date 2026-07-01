package com.taobao.munion.animationadapter;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class a$1
  implements AbsListView.OnScrollListener
{
  a$1(a parama) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (a.c(this.a) != null) {
      a.c(this.a).onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    boolean bool = true;
    a locala = this.a;
    if (paramInt != 1) {}
    for (;;)
    {
      locala.a(bool);
      if (a.a(this.a)) {
        a.b(this.a).a();
      }
      if (a.c(this.a) != null) {
        a.c(this.a).onScrollStateChanged(paramAbsListView, paramInt);
      }
      return;
      bool = false;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\animationadapter\a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */