package com.taobao.munion.listviewanimations.itemmanipulation.contextualundo;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public class b
  extends FrameLayout
{
  private View a;
  private View b;
  private long c;
  
  public b(Context paramContext, int paramInt)
  {
    super(paramContext);
    a(paramInt);
  }
  
  private void a(int paramInt)
  {
    this.a = View.inflate(getContext(), paramInt, null);
    addView(this.a);
  }
  
  public View a()
  {
    return this.b;
  }
  
  public void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void a(View paramView)
  {
    if (this.b == null) {
      addView(paramView);
    }
    this.b = paramView;
  }
  
  public long b()
  {
    return this.c;
  }
  
  public boolean c()
  {
    return this.b.getVisibility() == 0;
  }
  
  public void d()
  {
    this.b.setVisibility(8);
    this.a.setVisibility(0);
  }
  
  public void e()
  {
    this.b.setVisibility(0);
    this.a.setVisibility(8);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\listviewanimations\itemmanipulation\contextualundo\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */