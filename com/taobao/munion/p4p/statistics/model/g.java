package com.taobao.munion.p4p.statistics.model;

import android.content.Context;
import android.view.MotionEvent;

public class g
  implements h
{
  private e a = new e();
  private int b = 0;
  private int c = 0;
  
  public e a()
  {
    new StringBuilder("Pingback model touchMove num is -------------->>>>>>>>>>>> ").append(this.a.a).toString();
    return this.a;
  }
  
  public void a(Context paramContext, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent != null) {
      this.a.a(paramContext, paramMotionEvent);
    }
  }
  
  public void a(a parama)
  {
    this.b += 1;
  }
  
  public void a(i parami)
  {
    this.c += 1;
  }
  
  public void b()
  {
    this.a.c();
    this.c = 0;
    this.b = 0;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public int d()
  {
    return this.c;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\p4p\statistics\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */