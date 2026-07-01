package com.taobao.munion.animationadapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.taobao.munion.nineoldandroids.view.a;

class b$f
  implements View.OnClickListener
{
  private final com.taobao.munion.listviewanimations.itemmanipulation.contextualundo.b b;
  
  public b$f(b paramb, com.taobao.munion.listviewanimations.itemmanipulation.contextualundo.b paramb1)
  {
    this.b = paramb1;
  }
  
  private void a()
  {
    a.i(this.b, this.b.getWidth());
  }
  
  private void b()
  {
    com.taobao.munion.nineoldandroids.view.b.a(this.b).k(0.0F).a(150L).a(null);
  }
  
  public void onClick(View paramView)
  {
    this.a.d();
    this.b.e();
    a();
    b();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\animationadapter\b$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */