package com.umeng.newxp.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Transformation;
import android.widget.Gallery;
import java.lang.reflect.Field;

public class AlignLeftGallery
  extends Gallery
{
  private static final String a = "AlignLeftGallery";
  private static int f;
  private static int g;
  private Camera b = new Camera();
  private int c;
  private int d;
  private boolean e;
  private int h;
  private AlignLeftGallery.IOnItemClickListener i;
  
  public AlignLeftGallery(Context paramContext)
  {
    super(paramContext);
    setStaticTransformationsEnabled(true);
  }
  
  public AlignLeftGallery(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
    setStaticTransformationsEnabled(true);
  }
  
  public AlignLeftGallery(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
    setStaticTransformationsEnabled(true);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842966 });
    this.d = paramContext.getDimensionPixelSize(0, 0);
    paramContext.recycle();
  }
  
  public void a(AlignLeftGallery.IOnItemClickListener paramIOnItemClickListener)
  {
    this.i = paramIOnItemClickListener;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  protected boolean getChildStaticTransformation(View paramView, Transformation paramTransformation)
  {
    paramTransformation.clear();
    paramTransformation.setTransformationType(Transformation.TYPE_MATRIX);
    this.b.save();
    paramView = paramTransformation.getMatrix();
    if (this.e)
    {
      f = getChildAt(0).getWidth();
      new StringBuilder("firstChildWidth = ").append(f).toString();
      g = getChildAt(0).getPaddingLeft();
      this.e = false;
    }
    this.h = (f / 2 + g + this.d - this.c / 2);
    this.b.translate(this.h, 0.0F, 0.0F);
    this.b.getMatrix(paramView);
    this.b.restore();
    return true;
  }
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    try
    {
      paramMotionEvent = AlignLeftGallery.class.getSuperclass().getDeclaredField("mDownTouchPosition");
      paramMotionEvent.setAccessible(true);
      int j = paramMotionEvent.getInt(this);
      new StringBuilder("mDownTouchPosition = ").append(j).toString();
      if ((this.i != null) && (j >= 0)) {
        this.i.a(j);
      }
    }
    catch (SecurityException paramMotionEvent)
    {
      for (;;)
      {
        paramMotionEvent.printStackTrace();
      }
    }
    catch (NoSuchFieldException paramMotionEvent)
    {
      for (;;)
      {
        paramMotionEvent.printStackTrace();
      }
    }
    catch (IllegalArgumentException paramMotionEvent)
    {
      for (;;)
      {
        paramMotionEvent.printStackTrace();
      }
    }
    catch (IllegalAccessException paramMotionEvent)
    {
      for (;;)
      {
        paramMotionEvent.printStackTrace();
      }
    }
    return false;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    new StringBuilder("onSizeChanged------- w = ").append(paramInt1).append(" h = ").append(paramInt2).append("oldw = ").append(paramInt3).append("oldh = ").append(paramInt4).toString();
    if (!this.e)
    {
      this.c = paramInt1;
      getLayoutParams().width = this.c;
      this.e = true;
    }
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    paramMotionEvent.offsetLocation(-this.h, 0.0F);
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\AlignLeftGallery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */