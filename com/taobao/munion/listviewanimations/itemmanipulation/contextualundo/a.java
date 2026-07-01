package com.taobao.munion.listviewanimations.itemmanipulation.contextualundo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.taobao.munion.nineoldandroids.view.b;

public class a
  implements View.OnTouchListener
{
  private int a;
  private int b;
  private int c;
  private long d;
  private AbsListView e;
  private a.a f;
  private int g = 1;
  private float h;
  private boolean i;
  private VelocityTracker j;
  private int k;
  private View l;
  private boolean m;
  
  public a(AbsListView paramAbsListView, a.a parama)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramAbsListView.getContext());
    this.a = localViewConfiguration.getScaledTouchSlop();
    this.b = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.c = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.d = paramAbsListView.getContext().getResources().getInteger(17694720);
    this.e = paramAbsListView;
    this.f = parama;
  }
  
  public AbsListView.OnScrollListener a()
  {
    return new a.1(this);
  }
  
  public void a(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.m = paramBoolean;
      return;
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    int n = 0;
    if (this.g < 2) {
      this.g = this.e.getWidth();
    }
    float f1;
    float f2;
    float f3;
    switch (paramMotionEvent.getActionMasked())
    {
    default: 
    case 0: 
    case 1: 
      do
      {
        do
        {
          return false;
        } while (this.m);
        Rect localRect = new Rect();
        i1 = this.e.getChildCount();
        Object localObject = new int[2];
        this.e.getLocationOnScreen((int[])localObject);
        int i2 = (int)paramMotionEvent.getRawX();
        int i3 = localObject[0];
        int i4 = (int)paramMotionEvent.getRawY();
        int i5 = localObject[1];
        for (;;)
        {
          if (n < i1)
          {
            localObject = this.e.getChildAt(n);
            ((View)localObject).getHitRect(localRect);
            if (localRect.contains(i2 - i3, i4 - i5)) {
              this.l = ((View)localObject);
            }
          }
          else
          {
            if (this.l != null)
            {
              this.h = paramMotionEvent.getRawX();
              this.k = this.e.getPositionForView(this.l);
              this.j = VelocityTracker.obtain();
              this.j.addMovement(paramMotionEvent);
            }
            paramView.onTouchEvent(paramMotionEvent);
            return true;
          }
          n += 1;
        }
      } while (this.j == null);
      f1 = paramMotionEvent.getRawX() - this.h;
      this.j.addMovement(paramMotionEvent);
      this.j.computeCurrentVelocity(1000);
      f2 = Math.abs(this.j.getXVelocity());
      f3 = Math.abs(this.j.getYVelocity());
      if (Math.abs(f1) > this.g / 2) {
        if (f1 > 0.0F) {
          n = 1;
        }
      }
      break;
    }
    for (;;)
    {
      if (i1 != 0)
      {
        paramView = this.l;
        i1 = this.k;
        paramMotionEvent = b.a(this.l);
        if (n != 0)
        {
          f1 = this.g;
          label352:
          paramMotionEvent.k(f1).s(0.0F).a(this.d).a(new a.2(this, paramView, i1));
        }
      }
      for (;;)
      {
        this.j = null;
        this.h = 0.0F;
        this.l = null;
        this.k = -1;
        this.i = false;
        return false;
        n = 0;
        break;
        if ((this.b > f2) || (f2 > this.c) || (f3 >= f2)) {
          break label641;
        }
        if (this.j.getXVelocity() > 0.0F)
        {
          n = 1;
          break;
        }
        n = 0;
        break;
        f1 = -this.g;
        break label352;
        b.a(this.l).k(0.0F).s(1.0F).a(this.d).a(null);
      }
      if ((this.j == null) || (this.m)) {
        break;
      }
      this.j.addMovement(paramMotionEvent);
      f1 = paramMotionEvent.getRawX() - this.h;
      if (Math.abs(f1) > this.a)
      {
        this.i = true;
        this.e.requestDisallowInterceptTouchEvent(true);
        paramView = MotionEvent.obtain(paramMotionEvent);
        paramView.setAction(paramMotionEvent.getActionIndex() << 8 | 0x3);
        this.e.onTouchEvent(paramView);
      }
      if (!this.i) {
        break;
      }
      com.taobao.munion.nineoldandroids.view.a.i(this.l, f1);
      com.taobao.munion.nineoldandroids.view.a.a(this.l, Math.max(0.0F, Math.min(1.0F, 1.0F - Math.abs(f1) * 2.0F / this.g)));
      return true;
      label641:
      n = 0;
      i1 = 0;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\listviewanimations\itemmanipulation\contextualundo\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */