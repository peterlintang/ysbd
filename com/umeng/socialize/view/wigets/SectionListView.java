package com.umeng.socialize.view.wigets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public class SectionListView
  extends ListView
{
  public static final String TAG = SectionListView.class.getSimpleName();
  private a adapter;
  private View mHeaderView;
  private int mHeaderViewHeight;
  private boolean mHeaderViewVisible;
  private int mHeaderViewWidth;
  
  public SectionListView(Context paramContext)
  {
    super(paramContext);
  }
  
  public SectionListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SectionListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void configureHeaderView(int paramInt)
  {
    if (this.mHeaderView == null) {}
    View localView;
    do
    {
      return;
      switch (this.adapter.a(paramInt))
      {
      default: 
        return;
      case 0: 
        this.mHeaderViewVisible = false;
        return;
      case 1: 
        this.adapter.a(this.mHeaderView, paramInt, 255);
        if (this.mHeaderView.getTop() != 0) {
          this.mHeaderView.layout(0, 0, this.mHeaderViewWidth, this.mHeaderViewHeight);
        }
        this.mHeaderViewVisible = true;
        return;
      }
      localView = getChildAt(0);
    } while (localView == null);
    int i = localView.getBottom();
    int j = this.mHeaderView.getHeight();
    if (i < j) {
      i -= j;
    }
    for (;;)
    {
      this.adapter.a(this.mHeaderView, paramInt, 255);
      if (this.mHeaderView.getTop() != i) {
        this.mHeaderView.layout(0, i, this.mHeaderViewWidth, this.mHeaderViewHeight + i);
      }
      this.mHeaderViewVisible = true;
      return;
      i = 0;
    }
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    if (this.mHeaderViewVisible) {
      drawChild(paramCanvas, this.mHeaderView, getDrawingTime());
    }
  }
  
  public a getAdapter()
  {
    return this.adapter;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.mHeaderView != null)
    {
      this.mHeaderView.layout(0, 0, this.mHeaderViewWidth, this.mHeaderViewHeight);
      configureHeaderView(getFirstVisiblePosition());
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.mHeaderView != null)
    {
      measureChild(this.mHeaderView, paramInt1, paramInt2);
      this.mHeaderViewWidth = this.mHeaderView.getMeasuredWidth();
      this.mHeaderViewHeight = this.mHeaderView.getMeasuredHeight();
    }
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (!(paramListAdapter instanceof a)) {
      throw new IllegalArgumentException(SectionListView.class.getSimpleName() + " must use adapter of type " + a.class.getSimpleName());
    }
    if (this.adapter != null) {
      setOnScrollListener(null);
    }
    this.adapter = ((a)paramListAdapter);
    setOnScrollListener((a)paramListAdapter);
    super.setAdapter(paramListAdapter);
  }
  
  public void setPinnedHeaderView(View paramView)
  {
    this.mHeaderView = paramView;
    if (this.mHeaderView != null) {
      setFadingEdgeLength(0);
    }
    requestLayout();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\SectionListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */