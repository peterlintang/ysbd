package com.umeng.newxp.view.common.actionbar;

import android.view.View;

public abstract class ActionBar$b
  implements ActionBar.c
{
  private int a;
  private View b;
  private boolean c;
  
  public ActionBar$b(int paramInt)
  {
    this.a = paramInt;
  }
  
  public ActionBar$b(int paramInt, boolean paramBoolean)
  {
    this.a = paramInt;
    this.c = paramBoolean;
  }
  
  public ActionBar$b(View paramView)
  {
    this.b = paramView;
  }
  
  public ActionBar$b(View paramView, boolean paramBoolean)
  {
    this.b = paramView;
    this.c = paramBoolean;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public View b()
  {
    return this.b;
  }
  
  public boolean c()
  {
    return this.c;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\actionbar\ActionBar$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */