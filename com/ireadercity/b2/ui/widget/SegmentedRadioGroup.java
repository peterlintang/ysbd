package com.ireadercity.b2.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;

public class SegmentedRadioGroup
  extends RadioGroup
{
  public SegmentedRadioGroup(Context paramContext)
  {
    super(paramContext);
  }
  
  public SegmentedRadioGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onFinishInflate()
  {
    int i = 1;
    super.onFinishInflate();
    int j = super.getChildCount();
    if (j > 1)
    {
      super.getChildAt(0).setBackgroundResource(2130837882);
      while (i < j - 1)
      {
        super.getChildAt(i).setBackgroundResource(2130837883);
        i += 1;
      }
      super.getChildAt(j - 1).setBackgroundResource(2130837884);
    }
    while (j != 1) {
      return;
    }
    super.getChildAt(0).setBackgroundResource(2130837869);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\SegmentedRadioGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */