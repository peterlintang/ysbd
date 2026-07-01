package com.umeng.newxp.view.handler.umwall.tab;

import android.content.Context;
import android.graphics.Color;
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
import com.umeng.newxp.view.handler.umwall.UMWallRes;

public class TabPageIndicator
  extends HorizontalScrollView
  implements c
{
  private static final CharSequence a = "";
  private Runnable b;
  private int c = -1;
  private int d = Color.rgb(203, 203, 203);
  private int e;
  private final View.OnClickListener f = new TabPageIndicator.1(this);
  private final b g;
  private ViewPager h;
  private ViewPager.OnPageChangeListener i;
  private int j;
  private int k;
  private TabPageIndicator.a l;
  
  public TabPageIndicator(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TabPageIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setHorizontalScrollBarEnabled(false);
    this.g = new b(paramContext, UMWallRes.attr_vpiTabPageIndicatorStyle(paramContext));
    addView(this.g, new ViewGroup.LayoutParams(-2, -1));
  }
  
  private void a(int paramInt)
  {
    TextView localTextView = (TextView)this.g.getChildAt(paramInt);
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
    localb.setFocusable(true);
    localb.setOnClickListener(this.f);
    localb.setText(paramCharSequence);
    if (this.e != 0) {
      localb.setBackgroundResource(this.e);
    }
    if (paramInt2 != 0) {
      localb.setCompoundDrawablesWithIntrinsicBounds(paramInt2, 0, 0, 0);
    }
    this.g.addView(localb, new LinearLayout.LayoutParams(-2, -1, 1.0F));
  }
  
  public void notifyDataSetChanged()
  {
    this.g.removeAllViews();
    PagerAdapter localPagerAdapter = this.h.getAdapter();
    a locala = null;
    if ((localPagerAdapter instanceof a)) {
      locala = (a)localPagerAdapter;
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
      if (locala != null) {}
      for (int n = locala.a(m);; n = 0)
      {
        a(m, localCharSequence, n);
        m += 1;
        break;
        if (this.k > i1) {
          this.k = (i1 - 1);
        }
        setCurrentItem(this.k);
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
      this.g.getChildCount();
      this.j = -1;
      int m = getMeasuredWidth();
      super.onMeasure(paramInt1, paramInt2);
      paramInt1 = getMeasuredWidth();
      if ((bool) && (m != paramInt1)) {
        setCurrentItem(this.k);
      }
      return;
    }
  }
  
  public void onPageScrollStateChanged(int paramInt)
  {
    if (this.i != null) {
      this.i.onPageScrollStateChanged(paramInt);
    }
  }
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.i != null) {
      this.i.onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
  }
  
  public void onPageSelected(int paramInt)
  {
    setCurrentItem(paramInt);
    if (this.i != null) {
      this.i.onPageSelected(paramInt);
    }
  }
  
  public void setColorSelected(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void setCurrentItem(int paramInt)
  {
    if (this.h == null) {
      throw new IllegalStateException("ViewPager has not been bound.");
    }
    this.k = paramInt;
    this.h.setCurrentItem(paramInt);
    int n = this.g.getChildCount();
    int m = 0;
    if (m < n)
    {
      TextView localTextView = (TextView)this.g.getChildAt(m);
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
    this.i = paramOnPageChangeListener;
  }
  
  public void setOnTabReselectedListener(TabPageIndicator.a parama)
  {
    this.l = parama;
  }
  
  public void setTabBackground(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void setTextColor(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void setViewPager(ViewPager paramViewPager)
  {
    if (this.h == paramViewPager) {
      return;
    }
    if (this.h != null) {
      this.h.setOnPageChangeListener(null);
    }
    if (paramViewPager.getAdapter() == null) {
      throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
    this.h = paramViewPager;
    paramViewPager.setOnPageChangeListener(this);
    notifyDataSetChanged();
  }
  
  public void setViewPager(ViewPager paramViewPager, int paramInt)
  {
    setViewPager(paramViewPager);
    setCurrentItem(paramInt);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\tab\TabPageIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */