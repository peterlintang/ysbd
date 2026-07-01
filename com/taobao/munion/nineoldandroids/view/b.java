package com.taobao.munion.nineoldandroids.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import com.taobao.munion.nineoldandroids.animation.a.a;
import java.util.WeakHashMap;

public abstract class b
{
  private static final WeakHashMap<View, b> a = new WeakHashMap(0);
  
  public static b a(View paramView)
  {
    b localb = (b)a.get(paramView);
    Object localObject = localb;
    int i;
    if (localb == null)
    {
      i = Integer.valueOf(Build.VERSION.SDK).intValue();
      if (i < 14) {
        break label53;
      }
      localObject = new d(paramView);
    }
    for (;;)
    {
      a.put(paramView, localObject);
      return (b)localObject;
      label53:
      if (i >= 11) {
        localObject = new c(paramView);
      } else {
        localObject = new e(paramView);
      }
    }
  }
  
  public abstract long a();
  
  public abstract b a(float paramFloat);
  
  public abstract b a(long paramLong);
  
  public abstract b a(Interpolator paramInterpolator);
  
  public abstract b a(a.a parama);
  
  public abstract long b();
  
  public abstract b b(float paramFloat);
  
  public abstract b b(long paramLong);
  
  public abstract b c(float paramFloat);
  
  public abstract void c();
  
  public abstract b d(float paramFloat);
  
  public abstract void d();
  
  public abstract b e(float paramFloat);
  
  public abstract b f(float paramFloat);
  
  public abstract b g(float paramFloat);
  
  public abstract b h(float paramFloat);
  
  public abstract b i(float paramFloat);
  
  public abstract b j(float paramFloat);
  
  public abstract b k(float paramFloat);
  
  public abstract b l(float paramFloat);
  
  public abstract b m(float paramFloat);
  
  public abstract b n(float paramFloat);
  
  public abstract b o(float paramFloat);
  
  public abstract b p(float paramFloat);
  
  public abstract b q(float paramFloat);
  
  public abstract b r(float paramFloat);
  
  public abstract b s(float paramFloat);
  
  public abstract b t(float paramFloat);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\view\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */