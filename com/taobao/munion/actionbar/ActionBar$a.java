package com.taobao.munion.actionbar;

import android.view.View;

public abstract class ActionBar$a
  implements ActionBar.b
{
  private int a;
  private View b;
  private boolean c;
  
  public ActionBar$a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public ActionBar$a(int paramInt, boolean paramBoolean)
  {
    this.a = paramInt;
    this.c = paramBoolean;
  }
  
  public ActionBar$a(View paramView)
  {
    this.b = paramView;
  }
  
  public ActionBar$a(View paramView, boolean paramBoolean)
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\actionbar\ActionBar$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */