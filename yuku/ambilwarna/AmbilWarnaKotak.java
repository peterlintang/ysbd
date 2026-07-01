package yuku.ambilwarna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;

public class AmbilWarnaKotak
  extends View
{
  Paint a;
  Shader b;
  final float[] c = { 1.0F, 1.0F, 1.0F };
  
  public AmbilWarnaKotak(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public AmbilWarnaKotak(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  final void a(float paramFloat)
  {
    this.c[0] = paramFloat;
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.a == null)
    {
      this.a = new Paint();
      this.b = new LinearGradient(0.0F, 0.0F, 0.0F, getMeasuredHeight(), -1, -16777216, Shader.TileMode.CLAMP);
    }
    int i = Color.HSVToColor(this.c);
    Object localObject = new LinearGradient(0.0F, 0.0F, getMeasuredWidth(), 0.0F, -1, i, Shader.TileMode.CLAMP);
    localObject = new ComposeShader(this.b, (Shader)localObject, PorterDuff.Mode.MULTIPLY);
    this.a.setShader((Shader)localObject);
    paramCanvas.drawRect(0.0F, 0.0F, getMeasuredWidth(), getMeasuredHeight(), this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\yuku\ambilwarna\AmbilWarnaKotak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */