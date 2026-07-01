package com.umeng.xp.view.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.util.ArrayList;

public class SwipeViewPointer
  extends LinearLayout
{
  private int a = 7;
  private Drawable b;
  private Drawable c;
  private ArrayList<ImageView> d;
  private int e = 0;
  private int f = 0;
  private Context g;
  private SwipeViewPointer.a h = null;
  
  public SwipeViewPointer(Context paramContext)
  {
    super(paramContext);
    this.g = paramContext;
    a();
  }
  
  public SwipeViewPointer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.g = paramContext;
  }
  
  private void a()
  {
    this.d = new ArrayList();
    this.b = new ShapeDrawable();
    this.c = new ShapeDrawable();
    this.b.setBounds(0, 0, this.a, this.a);
    this.c.setBounds(0, 0, this.a, this.a);
    OvalShape localOvalShape1 = new OvalShape();
    localOvalShape1.resize(this.a, this.a);
    OvalShape localOvalShape2 = new OvalShape();
    localOvalShape2.resize(this.a, this.a);
    ((ShapeDrawable)this.b).getPaint().setColor(-12303292);
    ((ShapeDrawable)this.c).getPaint().setColor(-3355444);
    ((ShapeDrawable)this.b).setShape(localOvalShape1);
    ((ShapeDrawable)this.c).setShape(localOvalShape2);
    this.a = ((int)(this.a * getResources().getDisplayMetrics().density));
    setOnTouchListener(new c(this));
  }
  
  private void b()
  {
    ImageView localImageView = new ImageView(this.g);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(this.a, this.a);
    localLayoutParams.setMargins(this.a / 2, this.a, this.a / 2, this.a);
    localImageView.setLayoutParams(localLayoutParams);
    localImageView.setBackgroundDrawable(this.c);
    this.d.add(localImageView);
    addView(localImageView);
  }
  
  public void addPageCount(int paramInt)
  {
    this.e += paramInt;
    int i = 0;
    while (i < paramInt)
    {
      b();
      i += 1;
    }
  }
  
  public Drawable getActiveDrawable()
  {
    return this.b;
  }
  
  public int getCurrentPage()
  {
    return this.f;
  }
  
  public Drawable getInactiveDrawable()
  {
    return this.c;
  }
  
  public int getIndicatorSize()
  {
    return this.a;
  }
  
  public SwipeViewPointer.a getOnPageControlClickListener()
  {
    return this.h;
  }
  
  public int getPageCount()
  {
    return this.e;
  }
  
  protected void onFinishInflate()
  {
    a();
  }
  
  public void setActiveDrawable(Drawable paramDrawable)
  {
    this.b = paramDrawable;
    if ((this.d != null) && (this.d.size() > 0)) {
      ((ImageView)this.d.get(this.f)).setBackgroundDrawable(this.b);
    }
  }
  
  public void setCurrentPage(int paramInt)
  {
    if (paramInt < this.e)
    {
      ((ImageView)this.d.get(this.f)).setBackgroundDrawable(this.c);
      ((ImageView)this.d.get(paramInt)).setBackgroundDrawable(this.b);
      this.f = paramInt;
    }
  }
  
  public void setInactiveDrawable(Drawable paramDrawable)
  {
    this.c = paramDrawable;
    if ((this.d != null) && (this.d.size() > 0))
    {
      int i = 0;
      while (i < this.e)
      {
        ((ImageView)this.d.get(i)).setBackgroundDrawable(this.c);
        i += 1;
      }
      ((ImageView)this.d.get(this.f)).setBackgroundDrawable(this.b);
    }
  }
  
  public void setIndicatorSize(int paramInt)
  {
    this.a = paramInt;
    paramInt = 0;
    while (paramInt < this.e)
    {
      ((ImageView)this.d.get(paramInt)).setLayoutParams(new LinearLayout.LayoutParams(this.a, this.a));
      paramInt += 1;
    }
  }
  
  public void setOnPageControlClickListener(SwipeViewPointer.a parama)
  {
    this.h = parama;
  }
  
  public void setPageCount(int paramInt)
  {
    this.e = paramInt;
    int i = 0;
    while (i < paramInt)
    {
      b();
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\widget\SwipeViewPointer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */