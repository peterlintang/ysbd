package yuku.ambilwarna.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.View;

public class AmbilWarnaPrefWidgetView
  extends View
{
  Paint a;
  float b;
  float c;
  
  public AmbilWarnaPrefWidgetView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.b = FloatMath.floor(24.0F * f + 0.5F);
    this.c = FloatMath.floor(f * 1.0F + 0.5F);
    this.a = new Paint();
    this.a.setColor(-1);
    this.a.setStyle(Paint.Style.STROKE);
    this.a.setStrokeWidth(this.c);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawRect(this.c, this.c, this.b - this.c, this.b - this.c, this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\yuku\ambilwarna\widget\AmbilWarnaPrefWidgetView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */