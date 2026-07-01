package com.ireadercity.b2.bean;

import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Typeface;
import com.ireadercity.b2.a;

public final class g
{
  public static boolean a = true;
  public static int b = 15;
  public static int c = 15;
  public static int d = a.D - b * 2;
  public static float e = a.E - c * 2;
  public static float f = a.E;
  public static float g = a.D;
  public static float h = 40.0F;
  public static float i = 1.0F;
  public static float j = 27.0F;
  public static float k = 7.0F;
  private static float l = 40.0F;
  
  public static void a(Paint paramPaint, i parami)
  {
    Paint.FontMetrics localFontMetrics = paramPaint.getFontMetrics();
    paramPaint = localFontMetrics;
    if (localFontMetrics.ascent == 0.0F)
    {
      paramPaint = localFontMetrics;
      if (localFontMetrics.descent == 0.0F)
      {
        paramPaint = localFontMetrics;
        if (localFontMetrics.bottom == 0.0F)
        {
          paramPaint = localFontMetrics;
          if (localFontMetrics.leading == 0.0F)
          {
            paramPaint = localFontMetrics;
            if (localFontMetrics.top == 0.0F)
            {
              paramPaint = new Paint();
              paramPaint.setAntiAlias(true);
              paramPaint.setFlags(3);
              paramPaint.setTextAlign(Paint.Align.LEFT);
              paramPaint.setTextSize(parami.i() + 8);
              if (parami.k() != 0) {
                break label236;
              }
              paramPaint.setFakeBoldText(false);
              paramPaint.setTypeface(Typeface.DEFAULT);
              paramPaint = paramPaint.getFontMetrics();
            }
          }
        }
      }
    }
    b = parami.n();
    c = parami.n();
    i = parami.o() / 100.0F;
    j = Math.abs(paramPaint.ascent) + 10.0F;
    if ((!a.S) || (a.N == 1))
    {
      k = Math.abs(paramPaint.descent) + c;
      e = a.E - c * 2;
    }
    for (;;)
    {
      d = a.D - b * 2;
      float f1 = paramPaint.descent - paramPaint.ascent;
      l = f1;
      h = f1 * i;
      return;
      label236:
      paramPaint.setFakeBoldText(true);
      break;
      e = a.E - c - a.K;
      k = Math.abs(paramPaint.descent) + a.K;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\bean\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */