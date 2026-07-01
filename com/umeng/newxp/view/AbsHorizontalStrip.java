package com.umeng.newxp.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class AbsHorizontalStrip
  extends ViewGroup
{
  private static String g = AbsHorizontalStrip.class.getSimpleName();
  protected Context a;
  protected final float b;
  protected int c = 10;
  protected float d = 0.0F;
  protected float e;
  HashMap<Integer, Float[]> f = new HashMap();
  private boolean h;
  private float i;
  private AbsHorizontalStrip.a j;
  private final int k;
  private VelocityTracker l;
  private float m;
  private AbsHorizontalStrip.b n;
  
  public AbsHorizontalStrip(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext;
    this.k = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    ViewConfiguration.getScrollFriction();
    this.b = 5.0F;
    setWillNotDraw(false);
  }
  
  private void a(float paramFloat)
  {
    int i1 = -(int)limitScrollPosition(paramFloat);
    String str = g;
    new StringBuilder("updateScrollPosition toX=").append(i1).append("  total=").append(this.e).toString();
    scrollTo(i1, 0);
    invalidate();
  }
  
  private void a(float paramFloat1, float paramFloat2)
  {
    this.i = paramFloat1;
    this.m = 0.0F;
  }
  
  private void a(float paramFloat1, float paramFloat2, boolean paramBoolean) {}
  
  private void b()
  {
    if (this.l == null) {
      this.l = VelocityTracker.obtain();
    }
    this.l.clear();
  }
  
  private void b(float paramFloat1, float paramFloat2)
  {
    paramFloat2 = this.i - paramFloat1;
    this.i = paramFloat1;
    String str = g;
    new StringBuilder("onTouchEventMove action= touchX=").append(paramFloat1).append("  getScrollPosition=").append(getScrollPosition()).append(" offsetX=").append(paramFloat2).toString();
    int i1 = getWidth();
    if (this.e > i1) {
      a(getScrollPosition() - paramFloat2);
    }
  }
  
  private void c()
  {
    if (this.l == null) {
      this.l = VelocityTracker.obtain();
    }
  }
  
  private void c(float paramFloat1, float paramFloat2)
  {
    int i2 = 0;
    paramFloat1 = Math.abs(getScrollPosition());
    Object localObject = this.f.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      i1 = ((Integer)((Iterator)localObject).next()).intValue();
      Float[] arrayOfFloat = (Float[])this.f.get(Integer.valueOf(i1));
      if ((arrayOfFloat[0].floatValue() <= paramFloat1) && (arrayOfFloat[1].floatValue() >= paramFloat1))
      {
        paramFloat2 = arrayOfFloat[1].floatValue();
        float f1 = arrayOfFloat[0].floatValue();
        if (paramFloat1 - arrayOfFloat[0].floatValue() <= (paramFloat2 - f1) / 2.0F) {
          onChildAcquiredFocus(i1);
        } else if (this.f.containsKey(Integer.valueOf(i1 + 1))) {
          onChildAcquiredFocus(i1 + 1);
        }
      }
    }
    localObject = getVisibleChild();
    if (this.n != null) {
      if (((List)localObject).size() <= 0) {
        break label249;
      }
    }
    label249:
    for (int i1 = ((Integer)((List)localObject).get(0)).intValue();; i1 = 0)
    {
      if (((List)localObject).size() > 0) {
        i2 = ((Integer)((List)localObject).get(((List)localObject).size() - 1)).intValue();
      }
      this.n.onChildVisibleChanged(i1, i2);
      return;
    }
  }
  
  private void d()
  {
    if (this.l != null)
    {
      this.l.recycle();
      this.l = null;
    }
  }
  
  private void e()
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(true);
    }
  }
  
  protected float clampToTotalStripWidth(float paramFloat)
  {
    if (this.e == 0.0F) {}
    float f1;
    do
    {
      return paramFloat;
      f1 = paramFloat;
      if (paramFloat < 0.0F) {
        f1 = paramFloat + this.e;
      }
      paramFloat = f1;
    } while (f1 < this.e);
    return f1 - this.e;
  }
  
  protected AbsHorizontalStrip.a createScrollAnimation(float paramFloat, long paramLong)
  {
    this.d = getScrollPosition();
    return new AbsHorizontalStrip.a(this, paramFloat, paramLong);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
  }
  
  public int getChildByX(float paramFloat)
  {
    Iterator localIterator = this.f.keySet().iterator();
    while (localIterator.hasNext())
    {
      int i1 = ((Integer)localIterator.next()).intValue();
      Float[] arrayOfFloat = (Float[])this.f.get(Integer.valueOf(i1));
      if ((arrayOfFloat[0].floatValue() <= paramFloat) && (arrayOfFloat[1].floatValue() >= paramFloat)) {
        return i1;
      }
    }
    throw new IllegalArgumentException();
  }
  
  public int getLayoutMargin()
  {
    return this.c;
  }
  
  abstract float getLeftEdgeOfChild(int paramInt);
  
  abstract float getLeftEdgeOfChildOnLeft(float paramFloat);
  
  abstract float getLeftEdgeOfChildOnRight(float paramFloat);
  
  protected float getScrollPosition()
  {
    return -getScrollX();
  }
  
  public List<Integer> getVisibleChild()
  {
    float f1 = getScrollPosition();
    ArrayList localArrayList = new ArrayList();
    f1 = Math.abs(f1);
    float f2 = f1 + getWidth();
    Iterator localIterator = this.f.keySet().iterator();
    while (localIterator.hasNext())
    {
      int i1 = ((Integer)localIterator.next()).intValue();
      Float[] arrayOfFloat = (Float[])this.f.get(Integer.valueOf(i1));
      if (((arrayOfFloat[0].floatValue() >= f1) && (arrayOfFloat[0].floatValue() < f2)) || ((arrayOfFloat[1].floatValue() >= f1) && (arrayOfFloat[1].floatValue() < f2))) {
        localArrayList.add(Integer.valueOf(i1));
      }
    }
    return localArrayList;
  }
  
  protected float limitScrollPosition(float paramFloat)
  {
    float f1 = paramFloat;
    if (paramFloat > 0.0F) {
      f1 = 0.0F;
    }
    int i1 = (int)(this.e - getWidth());
    String str = g;
    new StringBuilder("exSize ").append(i1).append("   ").append(f1).toString();
    paramFloat = f1;
    if (-f1 > i1) {
      paramFloat = -i1;
    }
    return paramFloat;
  }
  
  public void onChildAcquiredFocus(int paramInt)
  {
    runScrollAnimation(-(getLeftEdgeOfChild(paramInt) + getScrollPosition()) / 0.1F, 0.1F);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    float f1 = paramMotionEvent.getY();
    float f2 = paramMotionEvent.getX();
    int i1 = paramMotionEvent.getAction() & 0xFF;
    String str = g;
    new StringBuilder("onInterceptTouchEvent action=").append(i1).append(" touchX=").append(f2).append(" touchY").append(f1).toString();
    switch (i1)
    {
    default: 
      bool = super.onInterceptTouchEvent(paramMotionEvent);
    }
    do
    {
      do
      {
        return bool;
        this.i = f2;
        this.m = 0.0F;
        a(f2, f1);
        return false;
        this.h = false;
        this.m += Math.abs(this.i - f2);
        this.i = f2;
        if (this.m > this.k) {
          this.h = true;
        }
      } while (!this.h);
      onTouchEvent(paramMotionEvent);
      return true;
    } while (!this.h);
    this.h = false;
    onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getY();
    float f2 = paramMotionEvent.getX();
    String str = g;
    new StringBuilder("onTouch action=").append(i1).append("   ").append(i1 & 0xFF).append(" touchX=").append(f2).append(" touchY=").append(f1).toString();
    c();
    this.l.addMovement(paramMotionEvent);
    switch (i1 & 0xFF)
    {
    }
    for (;;)
    {
      return true;
      b(f2, f1);
      continue;
      a(f2, f1);
      continue;
      c(f2, f1);
    }
  }
  
  public void runScrollAnimation(float paramFloat1, float paramFloat2)
  {
    this.j = createScrollAnimation(paramFloat1, Math.abs(1000.0F * paramFloat2));
    this.j.a();
  }
  
  public void setChildVisibleChanged(AbsHorizontalStrip.b paramb)
  {
    this.n = paramb;
  }
  
  public void setLayoutMargin(int paramInt)
  {
    this.c = paramInt;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\AbsHorizontalStrip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */