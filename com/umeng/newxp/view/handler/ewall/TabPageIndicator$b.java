package com.umeng.newxp.view.handler.ewall;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;

class TabPageIndicator$b
  extends TextView
{
  private int b;
  
  public TabPageIndicator$b(TabPageIndicator paramTabPageIndicator, Context paramContext)
  {
    this(paramTabPageIndicator, paramContext, null, c.M(paramContext));
  }
  
  public TabPageIndicator$b(TabPageIndicator paramTabPageIndicator, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public int a()
  {
    return this.b;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((TabPageIndicator.c(this.a) > 0) && (getMeasuredWidth() > TabPageIndicator.c(this.a))) {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(TabPageIndicator.c(this.a), 1073741824), paramInt2);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\TabPageIndicator$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */