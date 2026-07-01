package com.taobao.munion.animationadapter;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.taobao.munion.nineoldandroids.animation.q;
import com.taobao.munion.nineoldandroids.animation.q.b;

class b$d
  implements q.b
{
  private final View b;
  private final ViewGroup.LayoutParams c;
  
  public b$d(b paramb, View paramView)
  {
    this.b = paramView;
    this.c = paramView.getLayoutParams();
  }
  
  public void a(q paramq)
  {
    this.c.height = ((Integer)paramq.u()).intValue();
    this.b.setLayoutParams(this.c);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\animationadapter\b$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */