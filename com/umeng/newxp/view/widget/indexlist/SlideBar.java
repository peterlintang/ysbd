package com.umeng.newxp.view.widget.indexlist;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.umeng.newxp.common.ExchangeConstants;
import java.util.HashMap;
import java.util.List;

public class SlideBar
  extends View
{
  private char[] a;
  private int b = Color.parseColor("#000000");
  private int c = Color.parseColor("#000000");
  private HashMap<Character, Integer> d;
  private ListView e;
  private TextView f;
  private int g;
  private int h;
  
  public SlideBar(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public SlideBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public SlideBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    this.a = new char[] { 24120, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 31526 };
    this.g = ((int)paramContext.getResources().getDimension(IndexListRes.a(paramContext)));
  }
  
  private boolean a(Character paramCharacter)
  {
    if (this.d == null) {
      return false;
    }
    return this.d.containsKey(paramCharacter);
  }
  
  private int b(Character paramCharacter)
  {
    return ((Integer)this.d.get(paramCharacter)).intValue();
  }
  
  public void a(ListView paramListView)
  {
    this.e = paramListView;
    a(((AlphabetIndexAdapter)this.e.getAdapter()).a());
  }
  
  public void a(TextView paramTextView)
  {
    this.f = paramTextView;
  }
  
  public void a(List<City> paramList)
  {
    this.d = new HashMap();
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      char c1 = ((City)paramList.get(i)).a();
      if (!this.d.containsKey(Character.valueOf(c1))) {
        this.d.put(Character.valueOf(c1), Integer.valueOf(i));
      }
      i += 1;
    }
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    Paint localPaint = new Paint();
    localPaint.setColor(-5854806);
    localPaint.setTextSize(this.g);
    localPaint.setAntiAlias(true);
    localPaint.setTextAlign(Paint.Align.CENTER);
    float f1 = getMeasuredWidth() / 2;
    if (this.a != null)
    {
      int i = 0;
      if (i < this.a.length)
      {
        if (a(Character.valueOf(this.a[i]))) {
          localPaint.setColor(this.b);
        }
        for (;;)
        {
          paramCanvas.drawText(String.valueOf(this.a[i]), f1, this.h + this.h * i, localPaint);
          i += 1;
          break;
          localPaint.setColor(this.c);
        }
      }
    }
    super.onDraw(paramCanvas);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    String str = ExchangeConstants.LOG_TAG;
    new StringBuilder("onSizeChanged +").append(paramInt2).toString();
    try
    {
      this.h = (paramInt2 / this.a.length);
      return;
    }
    catch (Exception localException) {}
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    int j = (int)paramMotionEvent.getY() / this.h;
    int i;
    if (j >= this.a.length)
    {
      i = this.a.length - 1;
      if ((paramMotionEvent.getAction() != 0) && (paramMotionEvent.getAction() != 2)) {
        break label137;
      }
      setPressed(true);
      this.f.setText(String.valueOf(this.a[i]));
      if (this.f.getVisibility() != 0) {
        this.f.setVisibility(0);
      }
      if (a(Character.valueOf(this.a[i]))) {
        break label117;
      }
    }
    label117:
    label137:
    while (paramMotionEvent.getAction() != 1)
    {
      return true;
      i = j;
      if (j >= 0) {
        break;
      }
      i = 0;
      break;
      this.e.setSelection(b(Character.valueOf(this.a[i])));
    }
    setPressed(false);
    this.f.setVisibility(8);
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\indexlist\SlideBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */