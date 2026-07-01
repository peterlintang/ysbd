package com.umeng.newxp.view.widget.indexlist;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public class SectionListView
  extends ListView
{
  public static final String a = SectionListView.class.getSimpleName();
  private View b;
  private boolean c;
  private int d;
  private int e;
  private AlphabetIndexAdapter f;
  
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
  
  public AlphabetIndexAdapter a()
  {
    return this.f;
  }
  
  public void a(int paramInt)
  {
    if (this.b == null) {}
    View localView;
    do
    {
      return;
      switch (this.f.a(paramInt))
      {
      default: 
        return;
      case 0: 
        this.c = false;
        return;
      case 1: 
        this.f.a(this.b, paramInt, 255);
        if (this.b.getTop() != 0) {
          this.b.layout(0, 0, this.d, this.e);
        }
        this.c = true;
        return;
      }
      localView = getChildAt(0);
    } while (localView == null);
    int i = localView.getBottom();
    int j = this.b.getHeight();
    if (i < j) {
      i -= j;
    }
    for (;;)
    {
      this.f.a(this.b, paramInt, 255);
      if (this.b.getTop() != i) {
        this.b.layout(0, i, this.d, this.e + i);
      }
      this.c = true;
      return;
      i = 0;
    }
  }
  
  public void a(View paramView)
  {
    this.b = paramView;
    if (this.b != null) {
      setFadingEdgeLength(0);
    }
    requestLayout();
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    if (this.c) {
      drawChild(paramCanvas, this.b, getDrawingTime());
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.b != null)
    {
      this.b.layout(0, 0, this.d, this.e);
      a(getFirstVisiblePosition());
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.b != null)
    {
      measureChild(this.b, paramInt1, paramInt2);
      this.d = this.b.getMeasuredWidth();
      this.e = this.b.getMeasuredHeight();
    }
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (!(paramListAdapter instanceof AlphabetIndexAdapter)) {
      throw new IllegalArgumentException(SectionListView.class.getSimpleName() + " must use adapter of type " + AlphabetIndexAdapter.class.getSimpleName());
    }
    if (this.f != null) {
      setOnScrollListener(null);
    }
    this.f = ((AlphabetIndexAdapter)paramListAdapter);
    setOnScrollListener((AlphabetIndexAdapter)paramListAdapter);
    super.setAdapter(paramListAdapter);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\indexlist\SectionListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */