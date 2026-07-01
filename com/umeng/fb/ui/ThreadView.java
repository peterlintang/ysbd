package com.umeng.fb.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ThreadView
  extends ListView
{
  public ThreadView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt4 > paramInt2) {
      setSelection(getAdapter().getCount() - 1);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\ThreadView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */