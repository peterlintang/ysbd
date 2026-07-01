package com.umeng.socialize.view.wigets;

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
import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import java.util.HashMap;
import java.util.List;

public class SlideBar
  extends View
{
  private HashMap<Character, Integer> enabledCharacter;
  private int existColor = Color.parseColor("#EEEEEE");
  private char[] mAlphabet;
  private int mAlphabetHeight;
  private int mAlphabetSize;
  private ListView mListView;
  private TextView mOverlay;
  private int unexistColor = Color.parseColor("#EEEEEE");
  
  public SlideBar(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public SlideBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public SlideBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private int getGroupIndex(Character paramCharacter)
  {
    return ((Integer)this.enabledCharacter.get(paramCharacter)).intValue();
  }
  
  private void init(Context paramContext)
  {
    this.mAlphabet = new char[] { 24120, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 31526 };
    this.mAlphabetSize = ((int)paramContext.getResources().getDimension(b.a(paramContext, b.a.g, "alphabet_size")));
  }
  
  private boolean isGroupExist(Character paramCharacter)
  {
    if (this.enabledCharacter == null) {
      return false;
    }
    return this.enabledCharacter.containsKey(paramCharacter);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    Paint localPaint = new Paint();
    localPaint.setColor(-5854806);
    localPaint.setTextSize(this.mAlphabetSize);
    localPaint.setAntiAlias(true);
    localPaint.setTextAlign(Paint.Align.CENTER);
    float f = getMeasuredWidth() / 2;
    int i;
    if (this.mAlphabet != null)
    {
      i = 0;
      if (i < this.mAlphabet.length) {}
    }
    else
    {
      super.onDraw(paramCanvas);
      return;
    }
    if (isGroupExist(Character.valueOf(this.mAlphabet[i]))) {
      localPaint.setColor(this.existColor);
    }
    for (;;)
    {
      paramCanvas.drawText(String.valueOf(this.mAlphabet[i]), f, this.mAlphabetHeight + this.mAlphabetHeight * i, localPaint);
      i += 1;
      break;
      localPaint.setColor(this.unexistColor);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    new StringBuilder("onSizeChanged +").append(paramInt2).toString();
    try
    {
      this.mAlphabetHeight = (paramInt2 / this.mAlphabet.length);
      return;
    }
    catch (Exception localException) {}
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    int j = (int)paramMotionEvent.getY() / this.mAlphabetHeight;
    int i;
    if (j >= this.mAlphabet.length)
    {
      i = this.mAlphabet.length - 1;
      if ((paramMotionEvent.getAction() != 0) && (paramMotionEvent.getAction() != 2)) {
        break label137;
      }
      setPressed(true);
      this.mOverlay.setText(String.valueOf(this.mAlphabet[i]));
      if (this.mOverlay.getVisibility() != 0) {
        this.mOverlay.setVisibility(0);
      }
      if (isGroupExist(Character.valueOf(this.mAlphabet[i]))) {
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
      this.mListView.setSelection(getGroupIndex(Character.valueOf(this.mAlphabet[i])));
    }
    setPressed(false);
    this.mOverlay.setVisibility(8);
    return true;
  }
  
  public void setListView(ListView paramListView)
  {
    this.mListView = paramListView;
    updateAlphabet(((a)this.mListView.getAdapter()).a());
  }
  
  public void setOverlay(TextView paramTextView)
  {
    this.mOverlay = paramTextView;
  }
  
  public void updateAlphabet(List<UMFriend> paramList)
  {
    this.enabledCharacter = new HashMap();
    int j = paramList.size();
    int i = 0;
    for (;;)
    {
      if (i >= j)
      {
        invalidate();
        return;
      }
      char c = ((UMFriend)paramList.get(i)).upGroup();
      if (!this.enabledCharacter.containsKey(Character.valueOf(c))) {
        this.enabledCharacter.put(Character.valueOf(c), Integer.valueOf(i));
      }
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\SlideBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */