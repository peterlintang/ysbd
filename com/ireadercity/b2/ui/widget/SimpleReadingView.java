package com.ireadercity.b2.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ireadercity.b2.a;
import com.ireadercity.b2.curlview.h;

public class SimpleReadingView
  extends RelativeLayout
  implements View.OnTouchListener
{
  private static float d = 1.0F;
  RecycleableImageView a = null;
  RecycleableImageView b = null;
  int c;
  private com.ireadercity.b2.curlview.k e;
  private h f;
  private boolean g = false;
  private int h = 0;
  private PointF i;
  private PointF j;
  private long k;
  private long l;
  private boolean m = false;
  private Boolean n = Boolean.valueOf(false);
  private boolean o = false;
  private int p;
  private boolean q = false;
  private boolean r = false;
  private boolean s = false;
  
  public SimpleReadingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    d = paramContext.getResources().getDisplayMetrics().density;
    setClipChildren(false);
    setClipToPadding(false);
    if (!this.s)
    {
      this.b = new RecycleableImageView(paramContext);
      addView(this.b);
    }
    this.a = new RecycleableImageView(paramContext);
    addView(this.a);
  }
  
  private void a(ImageView paramImageView, int paramInt)
  {
    new StringBuilder("setBitmapOnPageIndex of Index=").append(paramInt).toString();
    paramImageView.setImageBitmap(this.f.a(paramInt));
    a.d();
  }
  
  private void c()
  {
    if (!this.s) {
      this.b.layout(0, 0, a.D, a.E);
    }
    this.a.layout(0, 0, a.D, a.E);
  }
  
  private void c(int paramInt)
  {
    if (this.s)
    {
      a(this.a, this.h);
      return;
    }
    Animation localAnimation2;
    Animation localAnimation1;
    Object localObject;
    if (!this.r)
    {
      new StringBuilder("showAnimation 1 ").append(-a.D).toString();
      a(this.b, this.h);
      if (paramInt == 1) {
        if (!this.q)
        {
          localAnimation2 = AnimationUtils.loadAnimation(getContext(), 2130968614);
          localAnimation1 = AnimationUtils.loadAnimation(getContext(), 2130968613);
          this.a.setAnimation(localAnimation2);
          this.b.setAnimation(localAnimation1);
          this.c = 0;
          localObject = new k(this);
          localAnimation2.setAnimationListener((Animation.AnimationListener)localObject);
          localAnimation1.setAnimationListener((Animation.AnimationListener)localObject);
          localAnimation2.startNow();
          localAnimation1.startNow();
        }
      }
    }
    for (;;)
    {
      c();
      return;
      localAnimation2 = AnimationUtils.loadAnimation(getContext(), 2130968618);
      localAnimation1 = AnimationUtils.loadAnimation(getContext(), 2130968617);
      break;
      if (!this.q)
      {
        localAnimation2 = AnimationUtils.loadAnimation(getContext(), 2130968616);
        localAnimation1 = AnimationUtils.loadAnimation(getContext(), 2130968615);
        break;
      }
      localAnimation2 = AnimationUtils.loadAnimation(getContext(), 2130968612);
      localAnimation1 = AnimationUtils.loadAnimation(getContext(), 2130968611);
      break;
      new StringBuilder("showAnimation 2 ").append(-a.D).toString();
      a(this.b, this.h);
      if (!this.q)
      {
        localAnimation2 = AnimationUtils.loadAnimation(getContext(), 2130968614);
        localAnimation1 = AnimationUtils.loadAnimation(getContext(), 2130968615);
        label282:
        if (paramInt != 1) {
          break label392;
        }
        localAnimation2.setFillEnabled(false);
        this.a.setAnimation(localAnimation2);
        this.a.bringToFront();
      }
      for (;;)
      {
        new StringBuilder("showAnimation 2 bringToFront pageFlag=").append(paramInt).append(" isUpDown=").append(this.q).toString();
        this.c = 0;
        localObject = new l(this);
        if (paramInt != 1) {
          break label415;
        }
        localAnimation2.setAnimationListener((Animation.AnimationListener)localObject);
        localAnimation2.startNow();
        break;
        localAnimation2 = AnimationUtils.loadAnimation(getContext(), 2130968618);
        localAnimation1 = AnimationUtils.loadAnimation(getContext(), 2130968611);
        break label282;
        label392:
        localAnimation1.setFillEnabled(false);
        this.b.setAnimation(localAnimation1);
        this.b.bringToFront();
      }
      label415:
      localAnimation1.setAnimationListener((Animation.AnimationListener)localObject);
      localAnimation1.startNow();
    }
  }
  
  public final int a()
  {
    return this.h;
  }
  
  public final void a(int paramInt)
  {
    if (this.f == null)
    {
      this.h = -1;
      return;
    }
    if (paramInt <= 0) {}
    for (this.h = 0;; this.h = Math.min(paramInt, this.f.a() - 1))
    {
      a(this.a, this.h);
      return;
    }
  }
  
  public final void a(h paramh)
  {
    this.f = paramh;
  }
  
  public final void a(com.ireadercity.b2.curlview.k paramk)
  {
    this.e = paramk;
  }
  
  public final void b()
  {
    try
    {
      this.a.a();
      if (!this.s) {
        this.b.a();
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public final void b(int paramInt)
  {
    this.p = paramInt;
    if (paramInt == 7) {
      this.s = true;
    }
    if ((paramInt == 5) || (paramInt == 6)) {
      this.q = true;
    }
    if ((paramInt == 4) || (paramInt == 6)) {
      this.r = true;
    }
    new StringBuilder("isUpDown=").append(this.q).append(" isOverLap=").append(this.r).append(" isNoEffect=").append(this.s).toString();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    c();
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    new StringBuilder("OnTouch on =").append(paramMotionEvent.getAction()).toString();
    if ((this.g) || (this.f == null))
    {
      new StringBuilder("mAnimate || mBitmapProvider == null?mAnimate=").append(this.g).append(" ").append(this.f).toString();
      return false;
    }
    this.j = new PointF(paramMotionEvent.getX(), paramMotionEvent.getY());
    this.l = System.currentTimeMillis();
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return true;
      this.n = Boolean.valueOf(false);
      this.o = false;
      this.i = new PointF(paramMotionEvent.getX(), paramMotionEvent.getY());
      this.k = System.currentTimeMillis();
      continue;
      if ((this.o) || (this.n.booleanValue())) {
        break;
      }
      if (((Math.abs(this.j.x - this.i.x) > 15.0F) && (!this.q)) || ((Math.abs(this.j.y - this.i.y) > 15.0F) && (this.q)))
      {
        this.n = Boolean.valueOf(true);
        if ((this.h <= 0) && (((this.j.x > this.i.x) && (!this.q)) || ((this.j.y > this.i.y) && (this.q))))
        {
          this.o = true;
          this.e.c();
          return false;
        }
        if ((this.h >= this.f.a() - 1) && (((this.j.x < this.i.x) && (!this.q)) || ((this.j.y < this.i.y) && (this.q))))
        {
          this.o = true;
          this.e.b();
          return false;
        }
        if (((this.j.x > this.i.x) && (!this.q)) || ((this.j.y > this.i.y) && (this.q)))
        {
          this.h -= 1;
          this.e.e();
          c(-1);
        }
        else
        {
          this.h += 1;
          this.e.a();
          c(1);
          continue;
          if ((this.o) || (this.n.booleanValue()))
          {
            this.o = false;
            this.n = Boolean.valueOf(false);
            return false;
          }
          if (!this.n.booleanValue())
          {
            if (((this.j.x > a.D * 0.33D) && (this.j.x < a.D * 0.66D) && (!this.q)) || ((this.j.y > a.E * 0.33D) && (this.j.y < a.E * 0.66D) && (this.q)))
            {
              if (this.e == null) {
                break;
              }
              this.e.d();
              return false;
            }
            if ((this.h == 0) && (((this.i.x < a.D / 2) && (!this.q)) || ((this.i.y < a.E / 2) && (this.q))))
            {
              this.e.c();
              return false;
            }
            if ((this.h == this.f.a() - 1) && (((this.i.x > a.D / 2) && (!this.q)) || (this.i.y > a.E / 2) || (this.q)))
            {
              this.e.b();
              return false;
            }
            this.n = Boolean.valueOf(true);
            if (((this.i.x < a.D / 2) && (!this.q)) || ((this.i.y < a.E / 2) && (this.q)))
            {
              this.h -= 1;
              this.e.e();
              c(-1);
            }
            else
            {
              this.h += 1;
              this.e.a();
              c(1);
            }
          }
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\SimpleReadingView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */