package com.taobao.munion.pattern;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LockPatternView
  extends View
{
  static final int a = 25;
  private static final int b = 0;
  private static final int c = 1;
  private static final int d = 2;
  private static final boolean e = false;
  private static final int i = 700;
  private Bitmap A;
  private Bitmap B;
  private Bitmap C;
  private Bitmap D;
  private Bitmap E;
  private final Path F = new Path();
  private final Rect G = new Rect();
  private int H;
  private int I;
  private int J;
  private boolean f = false;
  private Paint g = new Paint();
  private Paint h = new Paint();
  private LockPatternView.c j;
  private ArrayList<LockPatternView.a> k = new ArrayList(9);
  private boolean[][] l = (boolean[][])Array.newInstance(Boolean.TYPE, new int[] { 3, 3 });
  private float m = -1.0F;
  private float n = -1.0F;
  private long o;
  private LockPatternView.b p = LockPatternView.b.a;
  private boolean q = true;
  private boolean r = false;
  private boolean s = true;
  private boolean t = false;
  private float u = 0.55F;
  private float v = 0.6F;
  private float w;
  private float x;
  private Bitmap y;
  private Bitmap z;
  
  public LockPatternView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public LockPatternView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, com.taobao.munion.restool.a.g("LockPatternView"));
    paramAttributeSet = paramContext.getString(com.taobao.munion.restool.a.h("LockPatternView_aspect"));
    if (!"square".equals(paramAttributeSet)) {
      if ("lock_width".equals(paramAttributeSet)) {
        this.J = 1;
      }
    }
    for (;;)
    {
      setClickable(true);
      this.h.setAntiAlias(true);
      this.h.setDither(true);
      this.h.setColor(getResources().getColor(com.taobao.munion.restool.a.b("munion_paint_color_green")));
      this.h.setAlpha(128);
      this.h.setStyle(Paint.Style.STROKE);
      this.h.setStrokeJoin(Paint.Join.ROUND);
      this.h.setStrokeCap(Paint.Cap.ROUND);
      this.y = a(paramContext, com.taobao.munion.restool.a.h("LockPatternView_default_show_cell_src"), com.taobao.munion.restool.a.e("munion_btn_code_lock_default"));
      this.z = a(paramContext, com.taobao.munion.restool.a.h("LockPatternView_default_touch_cell_src"), com.taobao.munion.restool.a.e("munion_btn_code_lock_touched"));
      this.A = a(paramContext, com.taobao.munion.restool.a.h("LockPatternView_indicator_lock_point_area_default"), com.taobao.munion.restool.a.e("munion_indicator_code_lock_point_area_default"));
      this.B = a(paramContext, com.taobao.munion.restool.a.h("LockPatternView_indicator_code_lock_point_area_normal"), com.taobao.munion.restool.a.e("munion_indicator_code_lock_point_area_green"));
      this.C = a(paramContext, com.taobao.munion.restool.a.h("LockPatternView_indicator_code_lock_point_area_warn"), com.taobao.munion.restool.a.e("munion_indicator_code_lock_point_area_red"));
      this.D = a(paramContext, com.taobao.munion.restool.a.h("LockPatternView_indicator_code_lock_drag_direction_normal"));
      this.E = a(paramContext, com.taobao.munion.restool.a.h("LockPatternView_indicator_code_lock_point_area_warn"));
      this.H = this.y.getWidth();
      this.I = this.y.getHeight();
      return;
      if ("lock_height".equals(paramAttributeSet)) {
        this.J = 2;
      } else {
        this.J = 0;
      }
    }
  }
  
  private int a(float paramFloat)
  {
    float f1 = this.x;
    float f2 = f1 * this.v;
    float f3 = getPaddingTop();
    float f4 = (f1 - f2) / 2.0F;
    int i1 = 0;
    while (i1 < 3)
    {
      float f5 = i1 * f1 + (f4 + f3);
      if ((paramFloat >= f5) && (paramFloat <= f5 + f2)) {
        return i1;
      }
      i1 += 1;
    }
    return -1;
  }
  
  private Bitmap a(TypedArray paramTypedArray, int paramInt)
  {
    paramTypedArray = (BitmapDrawable)paramTypedArray.getDrawable(paramInt);
    if (paramTypedArray != null) {
      return paramTypedArray.getBitmap();
    }
    return null;
  }
  
  private Bitmap a(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    paramTypedArray = (BitmapDrawable)paramTypedArray.getDrawable(paramInt1);
    if (paramTypedArray != null) {
      return paramTypedArray.getBitmap();
    }
    return b(paramInt2);
  }
  
  private LockPatternView.a a(float paramFloat1, float paramFloat2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i2 = 1;
    LockPatternView.a locala = b(paramFloat1, paramFloat2);
    int i3;
    int i1;
    if (locala != null)
    {
      ArrayList localArrayList = this.k;
      localObject1 = localObject2;
      if (!localArrayList.isEmpty())
      {
        localObject1 = (LockPatternView.a)localArrayList.get(localArrayList.size() - 1);
        int i6 = locala.a - ((LockPatternView.a)localObject1).a;
        int i5 = locala.b - ((LockPatternView.a)localObject1).b;
        int i4 = ((LockPatternView.a)localObject1).a;
        i3 = ((LockPatternView.a)localObject1).b;
        i1 = i4;
        if (Math.abs(i6) == 2)
        {
          i1 = i4;
          if (Math.abs(i5) != 1)
          {
            i4 = ((LockPatternView.a)localObject1).a;
            if (i6 <= 0) {
              break label234;
            }
            i1 = 1;
            i1 += i4;
          }
        }
        if ((Math.abs(i5) != 2) || (Math.abs(i6) == 1)) {
          break label245;
        }
        i3 = ((LockPatternView.a)localObject1).b;
        if (i5 <= 0) {
          break label239;
        }
      }
    }
    label170:
    label234:
    label239:
    label245:
    for (i2 = i3 + i2;; i2 = i3)
    {
      localObject1 = LockPatternView.a.a(i1, i2);
      if ((localObject1 != null) && (this.l[localObject1.a][localObject1.b] == 0)) {
        a((LockPatternView.a)localObject1);
      }
      a(locala);
      boolean bool = this.s;
      localObject1 = locala;
      return (LockPatternView.a)localObject1;
      i1 = -1;
      break;
      i2 = -1;
      break label170;
    }
  }
  
  private void a(Canvas paramCanvas, float paramFloat1, float paramFloat2, LockPatternView.a parama1, LockPatternView.a parama2)
  {
    int i1;
    if (this.p != LockPatternView.b.c)
    {
      i1 = 1;
      if (i1 == 0) {
        break label32;
      }
      if (this.D != null) {
        break label39;
      }
    }
    label32:
    while (this.E == null)
    {
      return;
      i1 = 0;
      break;
    }
    label39:
    int i2 = parama2.a;
    int i3 = parama1.a;
    int i4 = parama2.b;
    int i5 = parama1.b;
    int i6 = ((int)this.w - this.H) / 2;
    int i7 = ((int)this.x - this.I) / 2;
    if (i1 != 0) {}
    for (parama1 = this.D;; parama1 = this.E)
    {
      parama2 = new Matrix();
      i1 = this.A.getWidth();
      int i8 = this.A.getHeight();
      float f1 = (float)Math.toDegrees((float)Math.atan2(i2 - i3, i4 - i5));
      parama2.setTranslate(i6 + paramFloat1, i7 + paramFloat2);
      parama2.preRotate(f1 + 90.0F, i1 / 2.0F, i8 / 2.0F);
      parama2.preTranslate((i1 - parama1.getWidth()) / 2.0F, 0.0F);
      paramCanvas.drawBitmap(parama1, parama2, this.g);
      return;
    }
  }
  
  private void a(Canvas paramCanvas, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Bitmap localBitmap2;
    Bitmap localBitmap1;
    if ((!paramBoolean) || ((this.r) && (this.p != LockPatternView.b.c)))
    {
      localBitmap2 = this.A;
      localBitmap1 = this.y;
    }
    for (;;)
    {
      int i2 = this.H;
      int i1 = this.I;
      float f1 = this.w;
      float f2 = this.x;
      i2 = (int)((f1 - i2) / 2.0F);
      i1 = (int)((f2 - i1) / 2.0F);
      paramCanvas.drawBitmap(localBitmap2, paramInt1 + i2, paramInt2 + i1, this.g);
      paramCanvas.drawBitmap(localBitmap1, paramInt1 + i2, paramInt2 + i1, this.g);
      return;
      if (this.t)
      {
        localBitmap2 = this.B;
        localBitmap1 = this.z;
      }
      else if (this.p == LockPatternView.b.c)
      {
        localBitmap2 = this.C;
        localBitmap1 = this.y;
      }
      else
      {
        if ((this.p != LockPatternView.b.a) && (this.p != LockPatternView.b.b)) {
          break;
        }
        localBitmap2 = this.B;
        localBitmap1 = this.y;
      }
    }
    throw new IllegalStateException("unknown display mode " + this.p);
  }
  
  private void a(LockPatternView.a parama)
  {
    this.l[parama.a()][parama.b()] = 1;
    this.k.add(parama);
    if (this.j != null) {
      this.j.onPatternCellAdded(this.k);
    }
  }
  
  private int b(float paramFloat)
  {
    float f1 = this.w;
    float f2 = f1 * this.v;
    float f3 = getPaddingLeft();
    float f4 = (f1 - f2) / 2.0F;
    int i1 = 0;
    while (i1 < 3)
    {
      float f5 = i1 * f1 + (f4 + f3);
      if ((paramFloat >= f5) && (paramFloat <= f5 + f2)) {
        return i1;
      }
      i1 += 1;
    }
    return -1;
  }
  
  private Bitmap b(int paramInt)
  {
    return BitmapFactory.decodeResource(getContext().getResources(), paramInt);
  }
  
  private LockPatternView.a b(float paramFloat1, float paramFloat2)
  {
    int i1 = a(paramFloat2);
    if (i1 < 0) {}
    int i2;
    do
    {
      return null;
      i2 = b(paramFloat1);
    } while ((i2 < 0) || (this.l[i1][i2] != 0));
    return LockPatternView.a.a(i1, i2);
  }
  
  private void b(LockPatternView.b paramb)
  {
    switch (LockPatternView.1.a[paramb.ordinal()])
    {
    default: 
      return;
    case 1: 
    case 2: 
      this.h.setColor(getResources().getColor(com.taobao.munion.restool.a.b("munion_paint_color_green")));
      return;
    }
    this.h.setColor(getResources().getColor(com.taobao.munion.restool.a.b("munion_paint_color_red")));
  }
  
  private float c(int paramInt)
  {
    return getPaddingLeft() + paramInt * this.w + this.w / 2.0F;
  }
  
  private float d(int paramInt)
  {
    return getPaddingTop() + paramInt * this.x + this.x / 2.0F;
  }
  
  private void g()
  {
    b(LockPatternView.b.a);
    this.k.clear();
    h();
    this.p = LockPatternView.b.a;
    invalidate();
  }
  
  private void h()
  {
    int i1 = 0;
    while (i1 < 3)
    {
      int i2 = 0;
      while (i2 < 3)
      {
        this.l[i1][i2] = 0;
        i2 += 1;
      }
      i1 += 1;
    }
  }
  
  public void a(int paramInt)
  {
    if (this.h != null) {
      this.h.setColor(paramInt);
    }
  }
  
  public void a(LockPatternView.b paramb)
  {
    this.p = paramb;
    b(paramb);
    if (paramb == LockPatternView.b.b)
    {
      if (this.k.size() == 0) {
        throw new IllegalStateException("you must have a pattern to animate if you want to set the display mode to animate");
      }
      this.o = SystemClock.elapsedRealtime();
      paramb = (LockPatternView.a)this.k.get(0);
      this.m = c(paramb.b());
      this.n = d(paramb.a());
      h();
    }
    invalidate();
  }
  
  public void a(LockPatternView.b paramb, List<LockPatternView.a> paramList)
  {
    this.k.clear();
    this.k.addAll(paramList);
    h();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      LockPatternView.a locala = (LockPatternView.a)paramList.next();
      this.l[locala.a()][locala.b()] = 1;
    }
    a(paramb);
  }
  
  public void a(LockPatternView.c paramc)
  {
    this.j = paramc;
  }
  
  public void a(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }
  
  public boolean a()
  {
    return this.r;
  }
  
  public void b(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }
  
  public boolean b()
  {
    return this.s;
  }
  
  public void c()
  {
    g();
  }
  
  public void d()
  {
    this.q = false;
  }
  
  public void e()
  {
    this.q = true;
  }
  
  public String f()
  {
    return a.a(this.k);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    ArrayList localArrayList = this.k;
    int i4 = localArrayList.size();
    boolean[][] arrayOfBoolean = this.l;
    int i3;
    int i1;
    Object localObject;
    float f1;
    float f2;
    float f3;
    float f4;
    label300:
    label311:
    LockPatternView.a locala;
    if (this.p == LockPatternView.b.b)
    {
      i2 = (int)(SystemClock.elapsedRealtime() - this.o) % ((i4 + 1) * 700);
      i3 = i2 / 700;
      h();
      i1 = 0;
      while (i1 < i3)
      {
        localObject = (LockPatternView.a)localArrayList.get(i1);
        arrayOfBoolean[localObject.a()][localObject.b()] = 1;
        i1 += 1;
      }
      if ((i3 > 0) && (i3 < i4))
      {
        i1 = 1;
        if (i1 != 0)
        {
          f1 = i2 % 700 / 700.0F;
          localObject = (LockPatternView.a)localArrayList.get(i3 - 1);
          f2 = c(((LockPatternView.a)localObject).b);
          f3 = d(((LockPatternView.a)localObject).a);
          localObject = (LockPatternView.a)localArrayList.get(i3);
          f4 = c(((LockPatternView.a)localObject).b);
          float f5 = d(((LockPatternView.a)localObject).a);
          this.m = (f2 + (f4 - f2) * f1);
          this.n = ((f5 - f3) * f1 + f3);
        }
        invalidate();
      }
    }
    else
    {
      f1 = this.w;
      f2 = this.x;
      f3 = this.u;
      this.h.setStrokeWidth(f3 * f1 * 0.5F);
      localObject = this.F;
      ((Path)localObject).rewind();
      if ((this.r) && (this.p != LockPatternView.b.c)) {
        break label401;
      }
      i1 = 1;
      if (i1 == 0) {
        break label464;
      }
      i3 = 0;
      i2 = 0;
      if (i2 >= i4) {
        break label419;
      }
      locala = (LockPatternView.a)localArrayList.get(i2);
      if (arrayOfBoolean[locala.a][locala.b] == 0) {
        break label419;
      }
      i3 = 1;
      f3 = c(locala.b);
      f4 = d(locala.a);
      if (i2 != 0) {
        break label407;
      }
      ((Path)localObject).moveTo(f3, f4);
    }
    for (;;)
    {
      i2 += 1;
      break label311;
      i1 = 0;
      break;
      label401:
      i1 = 0;
      break label300;
      label407:
      ((Path)localObject).lineTo(f3, f4);
    }
    label419:
    if (((this.t) || (this.p == LockPatternView.b.b)) && (i3 != 0)) {
      ((Path)localObject).lineTo(this.m, this.n);
    }
    paramCanvas.drawPath((Path)localObject, this.h);
    label464:
    int i5 = getPaddingTop();
    int i6 = getPaddingLeft();
    int i2 = 0;
    while (i2 < 3)
    {
      f3 = i5;
      f4 = i2;
      i3 = 0;
      while (i3 < 3)
      {
        a(paramCanvas, (int)(i6 + i3 * f1), (int)(f4 * f2 + f3), arrayOfBoolean[i2][i3]);
        i3 += 1;
      }
      i2 += 1;
    }
    if ((this.g.getFlags() & 0x2) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.g.setFilterBitmap(true);
      if (i1 == 0) {
        break;
      }
      i1 = 0;
      while (i1 < i4 - 1)
      {
        localObject = (LockPatternView.a)localArrayList.get(i1);
        locala = (LockPatternView.a)localArrayList.get(i1 + 1);
        if (arrayOfBoolean[locala.a][locala.b] == 0) {
          break;
        }
        a(paramCanvas, i6 + ((LockPatternView.a)localObject).b * f1, i5 + ((LockPatternView.a)localObject).a * f2, (LockPatternView.a)localObject, locala);
        i1 += 1;
      }
    }
    this.g.setFilterBitmap(bool);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    switch (this.J)
    {
    default: 
      paramInt2 = i1;
    }
    for (;;)
    {
      setMeasuredDimension(paramInt2, paramInt1);
      return;
      paramInt1 = Math.min(i1, paramInt1);
      paramInt2 = paramInt1;
      continue;
      paramInt1 = Math.min(i1, paramInt1);
      paramInt2 = i1;
      continue;
      paramInt2 = Math.min(i1, paramInt1);
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (LockPatternView.d)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    a(LockPatternView.b.a, a.a(paramParcelable.a()));
    this.p = LockPatternView.b.values()[paramParcelable.b()];
    this.q = paramParcelable.c();
    this.r = paramParcelable.d();
    this.s = paramParcelable.e();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    return new LockPatternView.d(super.onSaveInstanceState(), a.a(this.k), this.p.ordinal(), this.q, this.r, this.s, null);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.w = ((paramInt1 - getPaddingLeft() - getPaddingRight()) / 3.0F);
    this.x = ((paramInt2 - getPaddingTop() - getPaddingBottom()) / 3.0F);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((!this.q) || (!isEnabled())) {
      return false;
    }
    float f6 = paramMotionEvent.getX();
    float f4 = paramMotionEvent.getY();
    float f1;
    float f2;
    float f3;
    float f5;
    switch (paramMotionEvent.getAction())
    {
    default: 
      return false;
    case 0: 
      g();
      paramMotionEvent = a(f6, f4);
      if ((paramMotionEvent != null) && (this.j != null))
      {
        this.t = true;
        this.p = LockPatternView.b.a;
        this.j.onPatternStart();
      }
      for (;;)
      {
        if (paramMotionEvent != null)
        {
          f1 = c(paramMotionEvent.b);
          f2 = d(paramMotionEvent.a);
          f3 = this.w / 2.0F;
          f5 = this.x / 2.0F;
          invalidate((int)(f1 - f3), (int)(f2 - f5), (int)(f1 + f3), (int)(f2 + f5));
        }
        this.m = f6;
        this.n = f4;
        return true;
        if (this.j != null)
        {
          this.t = false;
          this.j.onPatternCleared();
        }
      }
    case 1: 
      if ((!this.k.isEmpty()) && (this.j != null))
      {
        this.t = false;
        this.j.onPatternDetected(this.k);
        invalidate();
      }
      return true;
    case 2: 
      int i1 = this.k.size();
      paramMotionEvent = a(f6, f4);
      int i2 = this.k.size();
      if ((paramMotionEvent != null) && (this.j != null) && (i2 == 1))
      {
        this.t = true;
        this.j.onPatternStart();
      }
      float f7;
      float f9;
      float f8;
      if (Math.abs(f6 - this.m) + Math.abs(f4 - this.n) > this.w * 0.01F)
      {
        f5 = this.m;
        f3 = this.n;
        this.m = f6;
        this.n = f4;
        if ((!this.t) || (i2 <= 0)) {
          break label756;
        }
        ArrayList localArrayList = this.k;
        float f10 = this.w * this.u * 0.5F;
        Object localObject = (LockPatternView.a)localArrayList.get(i2 - 1);
        f2 = c(((LockPatternView.a)localObject).b);
        f1 = d(((LockPatternView.a)localObject).a);
        localObject = this.G;
        if (f2 >= f6) {
          break label698;
        }
        f7 = f2;
        if (f1 >= f4) {
          break label708;
        }
        f9 = f1;
        f8 = f4;
        label464:
        ((Rect)localObject).set((int)(f7 - f10), (int)(f9 - f10), (int)(f6 + f10), (int)(f8 + f10));
        if (f2 >= f5) {
          break label718;
        }
        f4 = f2;
        f2 = f5;
        label506:
        f6 = f1;
        f5 = f3;
        if (f1 < f3)
        {
          f5 = f1;
          f6 = f3;
        }
        ((Rect)localObject).union((int)(f4 - f10), (int)(f5 - f10), (int)(f2 + f10), (int)(f6 + f10));
        if (paramMotionEvent != null)
        {
          f1 = c(paramMotionEvent.b);
          f2 = d(paramMotionEvent.a);
          if (i2 < 2) {
            break label744;
          }
          paramMotionEvent = (LockPatternView.a)localArrayList.get(i2 - 1 - (i2 - i1));
          f3 = c(paramMotionEvent.b);
          f4 = d(paramMotionEvent.a);
          if (f1 >= f3) {
            break label725;
          }
          f5 = f3;
          f3 = f1;
          f1 = f5;
          label639:
          if (f2 >= f4) {
            break label728;
          }
          f5 = f1;
          label649:
          f1 = this.w / 2.0F;
          f6 = this.x / 2.0F;
          ((Rect)localObject).set((int)(f3 - f1), (int)(f2 - f6), (int)(f5 + f1), (int)(f4 + f6));
        }
        invalidate((Rect)localObject);
      }
      for (;;)
      {
        return true;
        label698:
        f7 = f6;
        f6 = f2;
        break;
        label708:
        f8 = f1;
        f9 = f4;
        break label464;
        label718:
        f4 = f5;
        break label506;
        label725:
        break label639;
        label728:
        f6 = f4;
        f5 = f1;
        f4 = f2;
        f2 = f6;
        break label649;
        label744:
        f5 = f1;
        f4 = f2;
        f3 = f1;
        break label649;
        label756:
        invalidate();
      }
    }
    g();
    if (this.j != null)
    {
      this.t = false;
      this.j.onPatternCleared();
    }
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\pattern\LockPatternView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */