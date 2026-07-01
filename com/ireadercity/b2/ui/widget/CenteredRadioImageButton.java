package com.ireadercity.b2.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.ireadercity.b2.R.styleable;

public class CenteredRadioImageButton
  extends RadioButton
{
  Drawable a;
  
  public CenteredRadioImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CompoundButton, 0, 0).getDrawable(1);
    setButtonDrawable(16908292);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int k;
    int i;
    int j;
    int m;
    if (this.a != null)
    {
      this.a.setState(getDrawableState());
      k = this.a.getIntrinsicHeight();
      i = this.a.getIntrinsicWidth();
      j = getWidth();
      m = getHeight();
      if ((i > j) || (k > m)) {
        break label156;
      }
    }
    label156:
    for (float f1 = 1.0F;; f1 = Math.min(j / i, m / k))
    {
      j = (int)((j - i * f1) * 0.5F + 0.5F);
      k = (int)((m - k * f1) * 0.5F + 0.5F);
      Drawable localDrawable = this.a;
      m = (int)(j + i * f1);
      float f2 = k;
      localDrawable.setBounds(j, k, m, (int)(f1 * i + f2));
      this.a.draw(paramCanvas);
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\CenteredRadioImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */