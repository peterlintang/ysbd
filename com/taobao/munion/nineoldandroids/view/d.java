package com.taobao.munion.nineoldandroids.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import com.taobao.munion.nineoldandroids.animation.a.a;
import java.lang.ref.WeakReference;

class d
  extends b
{
  private static final long a = -1L;
  private final WeakReference<ViewPropertyAnimator> b;
  
  d(View paramView)
  {
    this.b = new WeakReference(paramView.animate());
  }
  
  public long a()
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      return localViewPropertyAnimator.getDuration();
    }
    return -1L;
  }
  
  public b a(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.x(paramFloat);
    }
    return this;
  }
  
  public b a(long paramLong)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.setDuration(paramLong);
    }
    return this;
  }
  
  public b a(Interpolator paramInterpolator)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.setInterpolator(paramInterpolator);
    }
    return this;
  }
  
  public b a(a.a parama)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null)
    {
      if (parama == null) {
        localViewPropertyAnimator.setListener(null);
      }
    }
    else {
      return this;
    }
    localViewPropertyAnimator.setListener(new d.1(this, parama));
    return this;
  }
  
  public long b()
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      return localViewPropertyAnimator.getStartDelay();
    }
    return -1L;
  }
  
  public b b(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.xBy(paramFloat);
    }
    return this;
  }
  
  public b b(long paramLong)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.setStartDelay(paramLong);
    }
    return this;
  }
  
  public b c(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.y(paramFloat);
    }
    return this;
  }
  
  public void c()
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.start();
    }
  }
  
  public b d(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.yBy(paramFloat);
    }
    return this;
  }
  
  public void d()
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.cancel();
    }
  }
  
  public b e(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.rotation(paramFloat);
    }
    return this;
  }
  
  public b f(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.rotationBy(paramFloat);
    }
    return this;
  }
  
  public b g(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.rotationX(paramFloat);
    }
    return this;
  }
  
  public b h(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.rotationXBy(paramFloat);
    }
    return this;
  }
  
  public b i(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.rotationY(paramFloat);
    }
    return this;
  }
  
  public b j(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.rotationYBy(paramFloat);
    }
    return this;
  }
  
  public b k(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.translationX(paramFloat);
    }
    return this;
  }
  
  public b l(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.translationXBy(paramFloat);
    }
    return this;
  }
  
  public b m(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.translationY(paramFloat);
    }
    return this;
  }
  
  public b n(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.translationYBy(paramFloat);
    }
    return this;
  }
  
  public b o(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.scaleX(paramFloat);
    }
    return this;
  }
  
  public b p(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.scaleXBy(paramFloat);
    }
    return this;
  }
  
  public b q(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.scaleY(paramFloat);
    }
    return this;
  }
  
  public b r(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.scaleYBy(paramFloat);
    }
    return this;
  }
  
  public b s(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.alpha(paramFloat);
    }
    return this;
  }
  
  public b t(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.b.get();
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.alphaBy(paramFloat);
    }
    return this;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\view\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */