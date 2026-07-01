package com.umeng.socialize.view.wigets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;

public class SwitchButton
  extends CheckBox
{
  private SwitchButton.b A;
  private CompoundButton.OnCheckedChangeListener B;
  private CompoundButton.OnCheckedChangeListener C;
  private SwitchButton.c D = new SwitchButton.c(this, null);
  private SwitchButton.a E = new SwitchButton.a(this, null);
  public boolean a = false;
  private Paint b;
  private ViewParent c;
  private Bitmap d;
  private Bitmap e;
  private Bitmap f;
  private Bitmap g;
  private Bitmap h;
  private Bitmap i;
  private float j;
  private float k;
  private float l;
  private float m;
  private float n;
  private float o;
  private final float p = 15.0F;
  private float q;
  private float r;
  private float s;
  private float t;
  private int u;
  private int v;
  private int w = 255;
  private boolean x = false;
  private boolean y;
  private boolean z;
  
  public SwitchButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwitchButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842860);
  }
  
  public SwitchButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private float a(float paramFloat)
  {
    return paramFloat - this.s / 2.0F;
  }
  
  private void a()
  {
    this.c = getParent();
    if (this.c != null) {
      this.c.requestDisallowInterceptTouchEvent(true);
    }
  }
  
  private void a(Context paramContext)
  {
    this.b = new Paint();
    this.b.setColor(-1);
    Resources localResources = paramContext.getResources();
    this.u = (ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout());
    this.v = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.d = BitmapFactory.decodeResource(localResources, b.a(getContext(), b.a.c, "umeng_socialize_switchbutton_bottom"));
    this.f = BitmapFactory.decodeResource(localResources, b.a(getContext(), b.a.c, "umeng_socialize_switchbutton_btn_pressed"));
    this.g = BitmapFactory.decodeResource(localResources, b.a(getContext(), b.a.c, "umeng_socialize_switchbutton_btn_unpressed"));
    this.h = BitmapFactory.decodeResource(localResources, b.a(getContext(), b.a.c, "umeng_socialize_switchbutton_frame"));
    this.i = BitmapFactory.decodeResource(localResources, b.a(getContext(), b.a.c, "umeng_socialize_switchbutton_mask"));
    this.e = this.g;
    this.s = this.f.getWidth();
    this.q = this.i.getWidth();
    this.r = this.i.getHeight();
    this.o = (this.s / 2.0F);
    this.n = (this.q - this.s / 2.0F);
    if (this.x) {}
    for (float f1 = this.n;; f1 = this.o)
    {
      this.m = f1;
      this.l = a(this.m);
      return;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      this.D.sendEmptyMessageDelayed(i1, 10L);
      return;
    }
  }
  
  void a(CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener)
  {
    this.C = paramOnCheckedChangeListener;
  }
  
  public CompoundButton.OnCheckedChangeListener getOnCheckedChangeListener()
  {
    return this.B;
  }
  
  public boolean isChecked()
  {
    return this.x;
  }
  
  public boolean isEnabled()
  {
    return super.isEnabled();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.saveLayerAlpha(new RectF(0.0F, 15.0F, this.i.getWidth(), this.i.getHeight() + 15.0F), this.w, 31);
    paramCanvas.drawBitmap(this.i, 0.0F, 15.0F, this.b);
    this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    paramCanvas.drawBitmap(this.d, this.l, 15.0F, this.b);
    this.b.setXfermode(null);
    paramCanvas.drawBitmap(this.h, 0.0F, 15.0F, this.b);
    paramCanvas.drawBitmap(this.e, this.l, 15.0F, this.b);
    paramCanvas.restore();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension((int)this.q, (int)(this.r + 30.0F));
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int i1 = paramMotionEvent.getAction();
    float f3 = paramMotionEvent.getX();
    float f4 = paramMotionEvent.getY();
    float f1 = Math.abs(f3 - this.k);
    float f2 = Math.abs(f4 - this.j);
    switch (i1)
    {
    }
    for (;;)
    {
      invalidate();
      return isEnabled();
      a();
      this.k = f3;
      this.j = f4;
      this.e = this.f;
      if (this.x) {}
      for (f1 = this.n;; f1 = this.o)
      {
        this.t = f1;
        break;
      }
      paramMotionEvent.getEventTime();
      paramMotionEvent.getDownTime();
      this.m = (this.t + paramMotionEvent.getX() - this.k);
      if (this.m >= this.o) {
        this.m = this.o;
      }
      if (this.m <= this.n) {
        this.m = this.n;
      }
      if (this.m > (this.o - this.n) / 2.0F + this.n) {}
      for (;;)
      {
        this.z = bool1;
        this.l = a(this.m);
        break;
        bool1 = false;
      }
      this.e = this.g;
      f3 = (float)(paramMotionEvent.getEventTime() - paramMotionEvent.getDownTime());
      if ((f2 >= this.v) || (f1 >= this.v) || (f3 >= this.u)) {
        break;
      }
      if (this.A == null) {
        this.A = new SwitchButton.b(this, null);
      }
      if (!post(this.A)) {
        performClick();
      }
    }
    paramMotionEvent = this.E;
    if (this.z) {}
    for (bool1 = bool2;; bool1 = true)
    {
      paramMotionEvent.b(bool1);
      break;
    }
  }
  
  public boolean performClick()
  {
    SwitchButton.a locala = this.E;
    if (this.x) {}
    for (boolean bool = false;; bool = true)
    {
      locala.b(bool);
      return true;
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    if (this.x != paramBoolean)
    {
      this.x = paramBoolean;
      if (!paramBoolean) {
        break label51;
      }
    }
    label51:
    for (float f1 = this.n;; f1 = this.o)
    {
      this.m = f1;
      this.l = a(this.m);
      invalidate();
      if (!this.y) {
        break;
      }
      return;
    }
    this.y = true;
    if (this.B != null) {
      this.B.onCheckedChanged(this, this.x);
    }
    if (this.C != null) {
      this.C.onCheckedChanged(this, this.x);
    }
    this.y = false;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 255;; i1 = 128)
    {
      this.w = i1;
      super.setEnabled(paramBoolean);
      return;
    }
  }
  
  public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener)
  {
    this.B = paramOnCheckedChangeListener;
  }
  
  public void toggle()
  {
    if (this.x) {}
    for (boolean bool = false;; bool = true)
    {
      setChecked(bool);
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\SwitchButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */