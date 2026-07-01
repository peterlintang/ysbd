package com.taobao.munion.nineoldandroids.view;

import android.view.View;
import com.taobao.munion.nineoldandroids.animation.a;
import com.taobao.munion.nineoldandroids.animation.a.a;
import com.taobao.munion.nineoldandroids.animation.q;
import com.taobao.munion.nineoldandroids.animation.q.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

class c$a
  implements a.a, q.b
{
  private c$a(c paramc) {}
  
  public void a(a parama)
  {
    if (c.b(this.a) != null) {
      c.b(this.a).a(parama);
    }
    c.c(this.a).remove(parama);
    if (c.c(this.a).isEmpty()) {
      c.a(this.a, null);
    }
  }
  
  public void a(q paramq)
  {
    float f1 = paramq.A();
    paramq = (c.c)c.c(this.a).get(paramq);
    Object localObject;
    if ((paramq.a & 0x1FF) != 0)
    {
      localObject = (View)c.d(this.a).get();
      if (localObject != null) {
        ((View)localObject).invalidate();
      }
    }
    paramq = paramq.b;
    if (paramq != null)
    {
      int j = paramq.size();
      int i = 0;
      while (i < j)
      {
        localObject = (c.b)paramq.get(i);
        float f2 = ((c.b)localObject).b;
        float f3 = ((c.b)localObject).c;
        c.a(this.a, ((c.b)localObject).a, f2 + f3 * f1);
        i += 1;
      }
    }
    paramq = (View)c.d(this.a).get();
    if (paramq != null) {
      paramq.invalidate();
    }
  }
  
  public void b(a parama)
  {
    if (c.b(this.a) != null) {
      c.b(this.a).b(parama);
    }
  }
  
  public void c(a parama)
  {
    if (c.b(this.a) != null) {
      c.b(this.a).c(parama);
    }
  }
  
  public void d(a parama)
  {
    if (c.b(this.a) != null) {
      c.b(this.a).d(parama);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\view\c$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */