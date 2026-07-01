package com.taobao.munion.p4p.statistics;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import com.taobao.munion.p4p.statistics.model.b;
import com.taobao.munion.p4p.statistics.model.d;
import com.taobao.munion.p4p.statistics.model.g;
import com.taobao.munion.p4p.statistics.model.h;
import com.taobao.munion.p4p.statistics.model.i;
import com.taobao.munion.p4p.statistics.model.j;
import java.util.Vector;

public class a
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  private static d d;
  private static a f = new a();
  private Vector<h> e;
  
  private a()
  {
    d = new d();
    this.e = new Vector(3);
    this.e.add(new b());
    this.e.add(new g());
    this.e.add(new j());
  }
  
  public static a a()
  {
    return f;
  }
  
  public void a(int paramInt)
  {
    ((h)this.e.get(paramInt)).b();
  }
  
  public void a(Context paramContext, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent != null)
    {
      ((b)this.e.get(0)).a(paramContext, paramMotionEvent);
      ((g)this.e.get(1)).a(paramContext, paramMotionEvent);
    }
  }
  
  public void a(Bundle paramBundle)
  {
    if (paramBundle != null) {
      d.a(paramBundle);
    }
  }
  
  public void a(com.taobao.munion.p4p.statistics.model.a parama)
  {
    if (parama != null) {
      ((g)this.e.get(1)).a(parama);
    }
  }
  
  public void a(i parami)
  {
    if (parami != null) {
      ((g)this.e.get(1)).a(parami);
    }
  }
  
  public d b()
  {
    return d;
  }
  
  public h b(int paramInt)
  {
    return (h)this.e.get(paramInt);
  }
  
  public void b(com.taobao.munion.p4p.statistics.model.a parama)
  {
    if (parama != null) {
      ((j)this.e.get(2)).a(parama);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\p4p\statistics\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */