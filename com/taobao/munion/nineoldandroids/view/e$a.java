package com.taobao.munion.nineoldandroids.view;

import android.view.View;
import com.taobao.munion.nineoldandroids.animation.a;
import com.taobao.munion.nineoldandroids.animation.a.a;
import com.taobao.munion.nineoldandroids.animation.q;
import com.taobao.munion.nineoldandroids.animation.q.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

class e$a
  implements a.a, q.b
{
  private e$a(e parame) {}
  
  public void a(a parama)
  {
    if (e.b(this.a) != null) {
      e.b(this.a).a(parama);
    }
    e.c(this.a).remove(parama);
    if (e.c(this.a).isEmpty()) {
      e.a(this.a, null);
    }
  }
  
  public void a(q paramq)
  {
    float f1 = paramq.A();
    paramq = (e.c)e.c(this.a).get(paramq);
    Object localObject;
    if ((paramq.a & 0x1FF) != 0)
    {
      localObject = (View)e.d(this.a).get();
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
        localObject = (e.b)paramq.get(i);
        float f2 = ((e.b)localObject).b;
        float f3 = ((e.b)localObject).c;
        e.a(this.a, ((e.b)localObject).a, f2 + f3 * f1);
        i += 1;
      }
    }
    paramq = (View)e.d(this.a).get();
    if (paramq != null) {
      paramq.invalidate();
    }
  }
  
  public void b(a parama)
  {
    if (e.b(this.a) != null) {
      e.b(this.a).b(parama);
    }
  }
  
  public void c(a parama)
  {
    if (e.b(this.a) != null) {
      e.b(this.a).c(parama);
    }
  }
  
  public void d(a parama)
  {
    if (e.b(this.a) != null) {
      e.b(this.a).d(parama);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\view\e$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */