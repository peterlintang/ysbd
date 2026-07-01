package yuku.ambilwarna;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;

public final class a
{
  final AlertDialog a;
  final h b;
  final View c;
  final AmbilWarnaKotak d;
  final ImageView e;
  final View f;
  final View g;
  final ImageView h;
  final ViewGroup i;
  final float[] j = new float[3];
  
  public a(Context paramContext, int paramInt, h paramh)
  {
    this.b = paramh;
    Color.colorToHSV(paramInt, this.j);
    paramh = LayoutInflater.from(paramContext).inflate(2130903040, null);
    this.c = paramh.findViewById(2131361809);
    this.d = ((AmbilWarnaKotak)paramh.findViewById(2131361808));
    this.e = ((ImageView)paramh.findViewById(2131361810));
    this.f = paramh.findViewById(2131361813);
    this.g = paramh.findViewById(2131361814);
    this.h = ((ImageView)paramh.findViewById(2131361811));
    this.i = ((ViewGroup)paramh.findViewById(2131361807));
    this.d.a(this.j[0]);
    this.f.setBackgroundColor(paramInt);
    this.g.setBackgroundColor(paramInt);
    this.c.setOnTouchListener(new b(this));
    this.d.setOnTouchListener(new c(this));
    this.a = new AlertDialog.Builder(paramContext).setPositiveButton(17039370, new f(this)).setNegativeButton(17039360, new e(this)).setOnCancelListener(new d(this)).create();
    this.a.setView(paramh, 0, 0, 0, 0);
    paramh.getViewTreeObserver().addOnGlobalLayoutListener(new g(this, paramh));
  }
  
  protected final void a()
  {
    float f1 = this.c.getMeasuredHeight() - this.j[0] * this.c.getMeasuredHeight() / 360.0F;
    if (f1 == this.c.getMeasuredHeight()) {
      f1 = 0.0F;
    }
    for (;;)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.e.getLayoutParams();
      localLayoutParams.leftMargin = ((int)(this.c.getLeft() - Math.floor(this.e.getMeasuredWidth() / 2) - this.i.getPaddingLeft()));
      localLayoutParams.topMargin = ((int)(f1 + this.c.getTop() - Math.floor(this.e.getMeasuredHeight() / 2) - this.i.getPaddingTop()));
      this.e.setLayoutParams(localLayoutParams);
      return;
    }
  }
  
  protected final void b()
  {
    float f1 = this.j[1];
    float f2 = this.d.getMeasuredWidth();
    float f3 = this.j[2];
    float f4 = this.d.getMeasuredHeight();
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.h.getLayoutParams();
    localLayoutParams.leftMargin = ((int)(f2 * f1 + this.d.getLeft() - Math.floor(this.h.getMeasuredWidth() / 2) - this.i.getPaddingLeft()));
    localLayoutParams.topMargin = ((int)(this.d.getTop() + f4 * (1.0F - f3) - Math.floor(this.h.getMeasuredHeight() / 2) - this.i.getPaddingTop()));
    this.h.setLayoutParams(localLayoutParams);
  }
  
  public final void c()
  {
    this.a.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\yuku\ambilwarna\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */