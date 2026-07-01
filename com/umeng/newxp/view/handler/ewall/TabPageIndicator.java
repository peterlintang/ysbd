package com.umeng.newxp.view.handler.ewall;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class TabPageIndicator
  extends HorizontalScrollView
  implements g
{
  private static final CharSequence a = "";
  private Runnable b;
  private int c;
  private int d;
  private final View.OnClickListener e = new TabPageIndicator.1(this);
  private final f f;
  private ViewPager g;
  private ViewPager.OnPageChangeListener h;
  private int i;
  private int j;
  private TabPageIndicator.a k;
  private Context l;
  
  public TabPageIndicator(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TabPageIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.l = paramContext;
    this.d = this.l.getResources().getColor(c.U(paramContext));
    this.c = this.l.getResources().getColor(c.V(paramContext));
    setHorizontalScrollBarEnabled(false);
    this.f = new f(paramContext, c.M(paramContext));
    addView(this.f, new ViewGroup.LayoutParams(-2, -1));
  }
  
  private void a(int paramInt)
  {
    TextView localTextView = (TextView)this.f.getChildAt(paramInt);
    if (this.b != null) {
      removeCallbacks(this.b);
    }
    this.b = new TabPageIndicator.2(this, localTextView);
    post(this.b);
  }
  
  private void a(int paramInt1, CharSequence paramCharSequence, int paramInt2)
  {
    TabPageIndicator.b localb = new TabPageIndicator.b(this, getContext());
    TabPageIndicator.b.a(localb, paramInt1);
    localb.setTextSize(2, 14.0F);
    localb.setFocusable(true);
    localb.setOnClickListener(this.e);
    localb.setText(paramCharSequence);
    if (paramInt2 != 0) {
      localb.setCompoundDrawablesWithIntrinsicBounds(paramInt2, 0, 0, 0);
    }
    this.f.addView(localb, new LinearLayout.LayoutParams(0, -1, 1.0F));
  }
  
  public void notifyDataSetChanged()
  {
    this.f.removeAllViews();
    PagerAdapter localPagerAdapter = this.g.getAdapter();
    e locale = null;
    if ((localPagerAdapter instanceof e)) {
      locale = (e)localPagerAdapter;
    }
    int i1 = localPagerAdapter.getCount();
    int m = 0;
    CharSequence localCharSequence;
    if (m < i1)
    {
      localCharSequence = localPagerAdapter.getPageTitle(m);
      if (localCharSequence != null) {
        break label127;
      }
      localCharSequence = a;
    }
    label127:
    for (;;)
    {
      if (locale != null) {}
      for (int n = locale.a(m);; n = 0)
      {
        a(m, localCharSequence, n);
        m += 1;
        break;
        if (this.j > i1) {
          this.j = (i1 - 1);
        }
        setCurrentItem(this.j);
        requestLayout();
        return;
      }
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.b != null) {
      post(this.b);
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.b != null) {
      removeCallbacks(this.b);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {}
    for (boolean bool = true;; bool = false)
    {
      setFillViewport(bool);
      this.f.getChildCount();
      this.i = -1;
      int m = getMeasuredWidth();
      super.onMeasure(paramInt1, paramInt2);
      paramInt1 = getMeasuredWidth();
      if ((bool) && (m != paramInt1)) {
        setCurrentItem(this.j);
      }
      return;
    }
  }
  
  public void onPageScrollStateChanged(int paramInt)
  {
    if (this.h != null) {
      this.h.onPageScrollStateChanged(paramInt);
    }
  }
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.h != null) {
      this.h.onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
  }
  
  public void onPageSelected(int paramInt)
  {
    setCurrentItem(paramInt);
    if (this.h != null) {
      this.h.onPageSelected(paramInt);
    }
  }
  
  public void setCurrentItem(int paramInt)
  {
    if (this.g == null) {
      throw new IllegalStateException("ViewPager has not been bound.");
    }
    this.j = paramInt;
    this.g.setCurrentItem(paramInt);
    int n = this.f.getChildCount();
    int m = 0;
    if (m < n)
    {
      TextView localTextView = (TextView)this.f.getChildAt(m);
      boolean bool;
      if (m == paramInt)
      {
        bool = true;
        label66:
        localTextView.setSelected(bool);
        if (!bool) {
          break label105;
        }
        a(paramInt);
        localTextView.setTextColor(this.c);
      }
      for (;;)
      {
        m += 1;
        break;
        bool = false;
        break label66;
        label105:
        localTextView.setTextColor(this.d);
      }
    }
  }
  
  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.h = paramOnPageChangeListener;
  }
  
  public void setOnTabReselectedListener(TabPageIndicator.a parama)
  {
    this.k = parama;
  }
  
  public void setViewPager(ViewPager paramViewPager)
  {
    if (this.g == paramViewPager) {
      return;
    }
    if (this.g != null) {
      this.g.setOnPageChangeListener(null);
    }
    if (paramViewPager.getAdapter() == null) {
      throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
    this.g = paramViewPager;
    paramViewPager.setOnPageChangeListener(this);
    notifyDataSetChanged();
  }
  
  public void setViewPager(ViewPager paramViewPager, int paramInt)
  {
    setViewPager(paramViewPager);
    setCurrentItem(paramInt);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\TabPageIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */