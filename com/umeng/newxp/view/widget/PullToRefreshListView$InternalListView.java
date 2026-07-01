package com.umeng.newxp.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.umeng.newxp.view.widget.pulltorefresh.internal.EmptyViewMethodAccessor;

public class PullToRefreshListView$InternalListView
  extends ListView
  implements EmptyViewMethodAccessor
{
  private boolean b = false;
  
  public PullToRefreshListView$InternalListView(PullToRefreshListView paramPullToRefreshListView, Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(View paramView)
  {
    super.setEmptyView(paramView);
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    try
    {
      super.dispatchDraw(paramCanvas);
      return;
    }
    catch (IndexOutOfBoundsException paramCanvas)
    {
      paramCanvas.printStackTrace();
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (IndexOutOfBoundsException paramMotionEvent)
    {
      paramMotionEvent.printStackTrace();
    }
    return false;
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    if ((PullToRefreshListView.a(this.a) != null) && (!this.b))
    {
      addFooterView(PullToRefreshListView.a(this.a), null, false);
      this.b = true;
    }
    super.setAdapter(paramListAdapter);
  }
  
  public void setEmptyView(View paramView)
  {
    this.a.a(paramView);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\PullToRefreshListView$InternalListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */