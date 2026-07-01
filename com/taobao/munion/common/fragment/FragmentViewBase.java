package com.taobao.munion.common.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.taobao.munion.actionbar.ActionBar;
import com.taobao.munion.actionbar.ActionBar.b;
import com.taobao.munion.restool.a;

public class FragmentViewBase
  extends FrameLayout
{
  protected ActionBar mActionBar;
  
  public FragmentViewBase(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FragmentViewBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setClickable(true);
  }
  
  public void initActionBar(String paramString, ActionBar.b paramb1, ActionBar.b paramb2, View.OnClickListener paramOnClickListener)
  {
    this.mActionBar = ((ActionBar)findViewById(a.c("munion_actionbar")));
    if (this.mActionBar == null) {
      return;
    }
    this.mActionBar.a(paramString);
    if (paramb1 != null) {
      this.mActionBar.a(paramb1);
    }
    if (paramb2 != null)
    {
      this.mActionBar.d(paramb2);
      this.mActionBar.c(paramb2);
    }
    this.mActionBar.a(paramOnClickListener);
  }
  
  public void updateActionIcon(ActionBar.b paramb, int paramInt)
  {
    if (this.mActionBar != null) {
      this.mActionBar.b(paramb, paramInt);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\common\fragment\FragmentViewBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */