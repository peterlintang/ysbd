package com.taobao.munion.animationadapter;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import com.taobao.munion.nineoldandroids.animation.a;
import com.taobao.munion.nineoldandroids.animation.c;
import java.util.Map;

class b$c
  extends c
{
  private final View b;
  private final int c;
  
  public b$c(b paramb, View paramView)
  {
    this.b = paramView;
    this.c = paramView.getHeight();
  }
  
  private void a()
  {
    com.taobao.munion.listviewanimations.itemmanipulation.contextualundo.b localb = (com.taobao.munion.listviewanimations.itemmanipulation.contextualundo.b)this.b;
    AbsListView localAbsListView = this.a.h();
    if (localAbsListView != null) {
      View localView = this.b;
    }
    for (int i = localAbsListView.getPositionForView(localb);; i = 0)
    {
      b.a(this.a).deleteItem(i);
      return;
    }
  }
  
  private void a(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    localLayoutParams.height = this.c;
    paramView.setLayoutParams(localLayoutParams);
  }
  
  public void a(a parama)
  {
    b.b(this.a).remove(this.b);
    b.a(this.a, this.b);
    a(this.b);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\animationadapter\b$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */