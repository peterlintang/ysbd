package com.ireadercity.b2.curlview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class CurlView
  extends GLSurfaceView
  implements View.OnTouchListener, f
{
  private PointF A = new PointF();
  private PointF B = new PointF();
  private long C;
  private long D;
  private boolean E = false;
  private float F;
  private PointF G;
  private long H;
  private Boolean I = Boolean.valueOf(false);
  private boolean J = false;
  k a;
  private int b = 1;
  private boolean c = true;
  private boolean d = false;
  private a e;
  private a f;
  private a g;
  private int h = 0;
  private int i = 0;
  private int j = -1;
  private int k = -1;
  private PointF l = new PointF();
  private i m = new i(this, (byte)0);
  private PointF n = new PointF();
  private PointF o = new PointF();
  private boolean p = false;
  private PointF q = new PointF();
  private PointF r = new PointF();
  private long s;
  private long t = 200L;
  private int u;
  private e v;
  private h w;
  private j x;
  private g y;
  private boolean z = false;
  
  public CurlView(Context paramContext)
  {
    super(paramContext);
    h();
  }
  
  public CurlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    h();
  }
  
  public CurlView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet);
  }
  
  private void a(int paramInt, boolean paramBoolean, PointF paramPointF)
  {
    new StringBuilder("direction=").append(paramInt).append("isReversMove=").append(paramBoolean).append("currentPoint.x").append(paramPointF.x).toString();
    this.h = paramInt;
    this.E = paramBoolean;
    this.A = paramPointF;
    this.C = System.currentTimeMillis();
    RectF localRectF = this.v.a(2);
    this.v.a(1);
    this.m.a.set(paramPointF.x, paramPointF.y);
    new StringBuilder("myInitCurl mPointerPos.mPos xy=").append(this.m.a.x).append(",").append(this.m.a.y).toString();
    label171:
    label323:
    float f1;
    if (this.E)
    {
      if (this.h == 1) {
        this.m.a.set(0.0F, paramPointF.y);
      }
    }
    else
    {
      new StringBuilder("myInitCurl mPointerPos.mPos xy=").append(this.m.a.x).append(",").append(this.m.a.y).toString();
      this.v.a(this.m.a);
      new StringBuilder("myInitCurl mPointerPos.mPos xy=").append(this.m.a.x).append(",").append(this.m.a.y).toString();
      this.m.b = 0.0F;
      this.l.set(this.m.a);
      if (this.l.y <= localRectF.top) {
        break label434;
      }
      this.l.y = localRectF.top;
      f1 = (localRectF.right + localRectF.left) / 2.0F;
      if ((this.l.x >= f1) || (this.i <= 0)) {
        break label465;
      }
      this.l.x = localRectF.left;
    }
    for (;;)
    {
      new StringBuilder("====startCurl==== page 012-(none,left,right)=").append(paramInt).toString();
      switch (paramInt)
      {
      default: 
        return;
        this.m.a.set(com.ireadercity.b2.a.D, paramPointF.y);
        break label171;
        label434:
        if (this.l.y >= localRectF.bottom) {
          break label323;
        }
        this.l.y = localRectF.bottom;
        break label323;
        label465:
        if ((this.w != null) && (this.l.x >= f1) && (this.i < this.w.a()))
        {
          this.l.x = localRectF.right;
          int i1 = this.i;
          this.w.a();
        }
        break;
      }
    }
    this.v.b(this.f);
    this.v.b(this.g);
    this.v.b(this.e);
    paramPointF = this.g;
    this.g = this.e;
    this.e = paramPointF;
    if (this.i > 0)
    {
      this.f.a(this.v.a(1));
      this.f.a();
      if (this.c) {
        this.v.a(this.f);
      }
    }
    if ((this.w != null) && (this.i < this.w.a() - 1))
    {
      paramPointF = this.w;
      paramInt = this.j;
      paramInt = this.k;
      paramPointF = paramPointF.a(this.i + 1);
      if ((paramPointF != null) && (!paramPointF.isRecycled())) {
        this.g.a(paramPointF);
      }
      this.g.a(this.v.a(2));
      this.g.a(false);
      this.g.a();
      this.v.a(this.g);
    }
    this.e.a(this.v.a(2));
    this.e.a(false);
    this.e.a();
    this.v.a(this.e);
    this.h = 2;
    return;
    this.v.b(this.f);
    this.v.b(this.g);
    this.v.b(this.e);
    paramPointF = this.f;
    this.f = this.e;
    this.e = paramPointF;
    if ((this.i > 1) && (this.w != null))
    {
      paramPointF = this.w;
      paramInt = this.j;
      paramInt = this.k;
      paramPointF = paramPointF.a(this.i - 2);
      if ((paramPointF != null) && (!paramPointF.isRecycled())) {
        this.f.a(paramPointF);
      }
      this.f.a(this.v.a(1));
      this.f.a(true);
      this.f.a();
      if (this.c) {
        this.v.a(this.f);
      }
    }
    if ((this.w != null) && (this.i < this.w.a()))
    {
      this.g.a(this.v.a(2));
      this.g.a();
      this.v.a(this.g);
    }
    if (this.b == 1)
    {
      this.e.a(this.v.a(2));
      this.e.a(false);
    }
    for (;;)
    {
      this.e.a();
      this.v.a(this.e);
      this.h = 1;
      return;
      this.e.a(this.v.a(1));
      this.e.a(true);
    }
  }
  
  private void a(PointF paramPointF1, PointF paramPointF2, double paramDouble)
  {
    RectF localRectF;
    float f1;
    float f2;
    float f3;
    if ((this.h == 2) || ((this.h == 1) && (this.b == 1)))
    {
      localRectF = this.v.a(2);
      if (paramPointF1.x >= localRectF.right)
      {
        this.e.a();
        requestRender();
        return;
      }
      if (paramPointF1.x < localRectF.left) {
        paramPointF1.x = localRectF.left;
      }
      if (paramPointF2.y != 0.0F)
      {
        f1 = paramPointF1.x;
        f2 = localRectF.left;
        f3 = paramPointF1.y;
        f1 = (f1 - f2) * paramPointF2.x / paramPointF2.y + f3;
        if ((paramPointF2.y < 0.0F) && (f1 < localRectF.top))
        {
          paramPointF2.x = (paramPointF1.y - localRectF.top);
          paramPointF2.y = (localRectF.left - paramPointF1.x);
        }
      }
      else
      {
        double d1 = Math.sqrt(paramPointF2.x * paramPointF2.x + paramPointF2.y * paramPointF2.y);
        if (d1 == 0.0D) {
          break label516;
        }
        paramPointF2.x = ((float)(paramPointF2.x / d1));
        paramPointF2.y = ((float)(paramPointF2.y / d1));
        this.e.a(paramPointF1, paramPointF2, paramDouble);
      }
    }
    for (;;)
    {
      requestRender();
      return;
      if ((paramPointF2.y <= 0.0F) || (f1 <= localRectF.bottom)) {
        break;
      }
      paramPointF2.x = (localRectF.bottom - paramPointF1.y);
      paramPointF2.y = (paramPointF1.x - localRectF.left);
      break;
      if (this.h != 1) {
        break;
      }
      localRectF = this.v.a(1);
      if (paramPointF1.x <= localRectF.left)
      {
        this.e.a();
        requestRender();
        return;
      }
      if (paramPointF1.x > localRectF.right) {
        paramPointF1.x = localRectF.right;
      }
      if (paramPointF2.y == 0.0F) {
        break;
      }
      f1 = paramPointF1.x;
      f2 = localRectF.right;
      f3 = paramPointF1.y;
      f1 = (f1 - f2) * paramPointF2.x / paramPointF2.y + f3;
      if ((paramPointF2.y < 0.0F) && (f1 < localRectF.top))
      {
        paramPointF2.x = (localRectF.top - paramPointF1.y);
        paramPointF2.y = (paramPointF1.x - localRectF.right);
        break;
      }
      if ((paramPointF2.y <= 0.0F) || (f1 <= localRectF.bottom)) {
        break;
      }
      paramPointF2.x = (paramPointF1.y - localRectF.bottom);
      paramPointF2.y = (localRectF.right - paramPointF1.x);
      break;
      label516:
      this.e.a();
    }
  }
  
  private void a(i parami)
  {
    double d1 = this.v.a(2).width() / 3.0F;
    d1 = Math.max(1.0F - parami.b, 0.0F) * d1;
    this.n.set(parami.a);
    if ((this.h == 2) || ((this.h == 1) && (this.b == 2)))
    {
      this.o.x = (this.n.x - this.l.x);
      this.o.y = (this.n.y - this.l.y);
      f1 = (float)Math.sqrt(this.o.x * this.o.x + this.o.y * this.o.y);
      f2 = this.v.a(2).width();
      d3 = d1 * 3.141592653589793D;
      d2 = d3;
      if (f1 > f2 * 2.0F - d3)
      {
        d2 = Math.max(f2 * 2.0F - f1, 0.0F);
        d1 = d2 / 3.141592653589793D;
      }
      if (f1 >= d2)
      {
        d2 = (f1 - d2) / 2.0D;
        parami = this.n;
        parami.x = ((float)(parami.x - this.o.x * d2 / f1));
        parami = this.n;
        parami.y = ((float)(parami.y - d2 * this.o.y / f1));
        a(this.n, this.o, d1);
      }
    }
    while (this.h != 1) {
      for (;;)
      {
        float f2;
        return;
        double d2 = Math.sin(Math.sqrt(f1 / d2) * 3.141592653589793D) * d1;
        parami = this.n;
        parami.x = ((float)(parami.x + this.o.x * d2 / f1));
        parami = this.n;
        double d3 = parami.y;
        parami.y = ((float)(d2 * this.o.y / f1 + d3));
      }
    }
    float f1 = this.v.a(2).left;
    d1 = Math.max(Math.min(this.n.x - f1, d1), 0.0D);
    f1 = this.v.a(2).right;
    parami = this.n;
    parami.x = ((float)(parami.x - Math.min(f1 - this.n.x, d1)));
    this.o.x = (this.n.x + this.l.x);
    this.o.y = (this.n.y - this.l.y);
    a(this.n, this.o, d1);
  }
  
  private void h()
  {
    int i2 = 100;
    int i1 = 10;
    this.v = new e(this);
    setRenderer(this.v);
    setRenderMode(0);
    int i3 = com.ireadercity.b2.a.D / 16;
    if (i3 < 10) {}
    for (;;)
    {
      if (i1 > 100) {
        i1 = i2;
      }
      for (;;)
      {
        this.f = new a(i1);
        this.g = new a(i1);
        this.e = new a(i1);
        this.f.a(true);
        this.g.a(false);
        return;
      }
      i1 = i3;
    }
  }
  
  public final void a()
  {
    if (!this.p) {
      return;
    }
    long l1 = System.currentTimeMillis();
    if (l1 >= this.s + this.t)
    {
      a locala;
      int i1;
      if (this.u == 2)
      {
        localObject = this.e;
        locala = this.g;
        ((a)localObject).a(this.v.a(2));
        ((a)localObject).a(false);
        ((a)localObject).a();
        this.v.b(locala);
        this.e = locala;
        this.g = ((a)localObject);
        if (this.h == 1)
        {
          this.i -= 1;
          this.a.e();
          if (this.y != null)
          {
            localObject = this.y;
            i1 = this.i;
          }
        }
      }
      for (;;)
      {
        this.h = 0;
        this.p = false;
        if (this.y != null) {
          localObject = this.y;
        }
        requestRender();
        return;
        if (this.u == 1)
        {
          localObject = this.e;
          locala = this.f;
          ((a)localObject).a(this.v.a(1));
          ((a)localObject).a(true);
          ((a)localObject).a();
          this.v.b(locala);
          if (!this.c) {
            this.v.b((a)localObject);
          }
          this.e = locala;
          this.f = ((a)localObject);
          if (this.h == 2)
          {
            this.i += 1;
            this.a.a();
            if (this.y != null)
            {
              localObject = this.y;
              i1 = this.i;
            }
          }
        }
      }
    }
    this.m.a.set(this.q);
    float f1 = (float)Math.sqrt((l1 - this.s) / this.t);
    Object localObject = this.m.a;
    ((PointF)localObject).x += (this.r.x - this.q.x) * f1;
    localObject = this.m.a;
    float f2 = ((PointF)localObject).y;
    ((PointF)localObject).y = (f1 * (this.r.y - this.q.y) + f2);
    a(this.m);
  }
  
  public final void a(int paramInt)
  {
    if (this.w == null)
    {
      this.i = -1;
      return;
    }
    if (paramInt <= 0) {
      this.i = 0;
    }
    try
    {
      for (;;)
      {
        f();
        requestRender();
        return;
        this.i = Math.min(paramInt, this.w.a() - 1);
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      for (;;)
      {
        localOutOfMemoryError.printStackTrace();
        System.gc();
        System.gc();
        System.gc();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.j = paramInt1;
    this.k = paramInt2;
    try
    {
      f();
      requestRender();
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      for (;;)
      {
        System.gc();
        localOutOfMemoryError.printStackTrace();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public final void a(h paramh)
  {
    this.w = paramh;
    this.i = -1;
  }
  
  public final void a(j paramj)
  {
    this.x = paramj;
  }
  
  public final void a(k paramk)
  {
    this.a = paramk;
  }
  
  public final void b()
  {
    this.f.b();
    this.g.b();
    this.e.b();
  }
  
  public final void b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      this.b = paramInt;
      this.v.c(1);
      return;
    }
    this.b = paramInt;
    this.v.c(2);
  }
  
  public final int c()
  {
    return this.i;
  }
  
  public final void d()
  {
    this.v.a();
  }
  
  public final void e()
  {
    this.f.c();
    this.g.c();
    this.e.c();
    this.v.b(this.f);
    this.v.b(this.g);
    this.v.b(this.e);
    this.f = null;
    this.g = null;
    this.e = null;
    this.y = null;
    this.x = null;
    this.w = null;
    this.v = null;
    com.ireadercity.b2.a.d();
  }
  
  public final void f()
  {
    if ((this.w == null) || (this.j <= 0) || (this.k <= 0) || (this.i < 0)) {
      return;
    }
    this.v.b(this.f);
    this.v.b(this.g);
    this.v.b(this.e);
    int i1 = this.i - 1;
    int i3 = this.i;
    int i2;
    if (this.h == 1) {
      i2 = i1 - 1;
    }
    for (;;)
    {
      new StringBuilder("leftIdx=").append(i2).append(" rightIdx=").append(i3).toString();
      int i4;
      if ((i3 >= 0) && (i3 < this.w.a()))
      {
        localObject = this.w;
        i4 = this.j;
        i4 = this.k;
        localObject = ((h)localObject).a(i3);
        if ((localObject != null) && (this.g != null))
        {
          if ((localObject != null) && (!((Bitmap)localObject).isRecycled())) {
            this.g.a((Bitmap)localObject);
          }
          this.g.a(this.v.a(2));
          this.g.a();
          this.v.a(this.g);
        }
      }
      if ((this.f != null) && (i2 >= 0) && (i2 < this.w.a()))
      {
        localObject = this.w;
        i3 = this.j;
        i3 = this.k;
        localObject = ((h)localObject).a(i2);
        if ((localObject != null) && (!((Bitmap)localObject).isRecycled())) {
          this.f.a((Bitmap)localObject);
        }
        this.f.a(this.v.a(1));
        this.f.a();
        if (this.c) {
          this.v.a(this.f);
        }
      }
      if ((this.e == null) || (i1 < 0) || (i1 >= this.w.a())) {
        break;
      }
      Object localObject = this.w;
      i2 = this.j;
      i2 = this.k;
      localObject = ((h)localObject).a(i1);
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled())) {
        this.e.a((Bitmap)localObject);
      }
      if ((this.h == 2) || ((this.h == 1) && (this.b == 2))) {
        this.e.a(this.v.a(2));
      }
      for (;;)
      {
        this.e.a();
        this.v.a(this.e);
        return;
        if (this.h != 2) {
          break label509;
        }
        i4 = i3 + 1;
        i2 = i1;
        i1 = i3;
        i3 = i4;
        break;
        this.e.a(this.v.a(1));
      }
      label509:
      i2 = i1;
      i1 = -1;
    }
  }
  
  public final Bitmap g()
  {
    h localh = this.w;
    int i1 = this.j;
    i1 = this.k;
    return localh.a(this.i);
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    requestRender();
    if (this.x != null) {
      this.x.a(paramInt1, paramInt2);
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((this.p) || (this.w == null)) {
      return false;
    }
    this.G = new PointF(paramMotionEvent.getX(), paramMotionEvent.getY());
    this.H = System.currentTimeMillis();
    paramView = this.v.a(2);
    RectF localRectF = this.v.a(1);
    this.m.a.set(paramMotionEvent.getX(), paramMotionEvent.getY());
    if (this.E)
    {
      if (this.h == 1) {
        this.m.a.set(paramMotionEvent.getX() - this.A.x, paramMotionEvent.getY());
      }
    }
    else
    {
      this.v.a(this.m.a);
      if (!this.z) {
        break label224;
      }
      this.m.b = paramMotionEvent.getPressure();
      label152:
      switch (paramMotionEvent.getAction())
      {
      }
    }
    for (;;)
    {
      return true;
      this.m.a.set(paramMotionEvent.getX() + (com.ireadercity.b2.a.D - this.A.x), paramMotionEvent.getY());
      break;
      label224:
      this.m.b = 0.0F;
      break label152;
      this.I = Boolean.valueOf(false);
      this.J = false;
      this.A = new PointF(paramMotionEvent.getX(), paramMotionEvent.getY());
      this.C = System.currentTimeMillis();
      this.l.set(this.m.a);
      if (this.l.y > paramView.top) {
        this.l.y = paramView.top;
      }
      while (this.J)
      {
        return false;
        if (this.l.y < paramView.bottom) {
          this.l.y = paramView.bottom;
        }
      }
      boolean bool2;
      boolean bool1;
      if ((!this.I.booleanValue()) && (Math.abs(this.G.x - this.A.x) > 10.0F))
      {
        bool2 = false;
        bool1 = bool2;
        if (this.A.x < com.ireadercity.b2.a.D / 2)
        {
          bool1 = bool2;
          if (this.G.x < this.A.x) {
            bool1 = true;
          }
        }
        bool2 = bool1;
        if (this.A.x > com.ireadercity.b2.a.D / 2)
        {
          bool2 = bool1;
          if (this.G.x > this.A.x) {
            bool2 = true;
          }
        }
        if ((this.i <= 0) && (((bool2) && (this.A.x > com.ireadercity.b2.a.D / 2)) || ((!bool2) && (this.A.x < com.ireadercity.b2.a.D / 2))))
        {
          this.J = true;
          this.a.c();
          return false;
        }
        if ((this.i >= this.w.a() - 1) && (((bool2) && (this.A.x < com.ireadercity.b2.a.D / 2)) || ((!bool2) && (this.A.x > com.ireadercity.b2.a.D / 2))))
        {
          this.J = true;
          this.a.b();
          return false;
        }
        if (this.G.x <= this.A.x) {
          break label694;
        }
      }
      label694:
      for (int i1 = 1;; i1 = 2)
      {
        a(i1, bool2, this.G);
        this.I = Boolean.valueOf(true);
        if ((!this.I.booleanValue()) || (this.J)) {
          break;
        }
        a(this.m);
        break;
      }
      if (this.J)
      {
        this.J = false;
        return false;
      }
      if (!this.I.booleanValue())
      {
        if ((this.G.x > com.ireadercity.b2.a.D * 0.33D) && (this.G.x < com.ireadercity.b2.a.D * 0.66D))
        {
          if (this.a != null) {
            this.a.d();
          }
          return false;
        }
        if ((this.i == 0) && (this.A.x < com.ireadercity.b2.a.D / 2))
        {
          this.a.c();
          return false;
        }
        if ((this.i == this.w.a() - 1) && (this.A.x > com.ireadercity.b2.a.D / 2))
        {
          this.a.b();
          return false;
        }
        if (this.G.x <= com.ireadercity.b2.a.D / 2) {
          break label1232;
        }
      }
      label1232:
      for (i1 = 2;; i1 = 1)
      {
        a(i1, false, this.G);
        a(this.m);
        if ((this.h != 1) && (this.h != 2)) {
          break label1647;
        }
        this.B = new PointF(paramMotionEvent.getX(), paramMotionEvent.getY());
        this.D = System.currentTimeMillis();
        new StringBuilder("ACTION_UP time=").append(this.D - this.C).append(" x_Move=").append(Math.abs(paramMotionEvent.getX() - this.A.x)).append(" y_Move=").append(Math.abs(paramMotionEvent.getY() - this.A.y)).toString();
        int i2 = 0;
        i1 = i2;
        if (this.D - this.C < 1000L)
        {
          i1 = i2;
          if (Math.abs(paramMotionEvent.getX() - this.A.x) >= 0.0F)
          {
            i1 = 1;
            new StringBuilder("isSwip=true endTime-startTime=").append(this.D - this.C).toString();
          }
        }
        this.q.set(this.m.a);
        this.s = System.currentTimeMillis();
        if ((this.b != 1) || (this.m.a.x <= (paramView.left + paramView.right) / 2.0F)) {
          break;
        }
        this.r.set(this.l);
        this.r.x = this.v.a(2).right;
        this.u = 2;
        if (i1 == 0) {
          break label1560;
        }
        this.q.set(this.m.a);
        if ((this.i != 0) || (this.h != 1)) {
          break label1298;
        }
        this.a.c();
        if (this.y == null) {
          break label1347;
        }
        paramView = this.y;
        return true;
      }
      this.r.set(this.l);
      if ((this.h == 2) || (this.b == 2)) {}
      for (this.r.x = localRectF.left;; this.r.x = paramView.left)
      {
        this.u = 1;
        break;
      }
      label1298:
      if ((this.i == this.w.a() - 1) && (this.h == 2))
      {
        this.a.b();
        if (this.y != null)
        {
          paramView = this.y;
          return true;
        }
      }
      label1347:
      paramMotionEvent = new StringBuilder("mAnimationTargetEvent==SET_CURL_TO_LEFT?=");
      if (this.u == 1)
      {
        bool1 = true;
        label1369:
        paramMotionEvent.append(bool1).toString();
        paramMotionEvent = new StringBuilder("mCurlState==CURL_LEFT?=");
        if (this.h != 1) {
          break label1482;
        }
        bool1 = true;
        label1401:
        paramMotionEvent.append(bool1).toString();
        if (this.h != 2) {
          break label1488;
        }
        i1 = 1;
        label1421:
        this.u = i1;
        if (this.u != 2) {
          break label1493;
        }
        this.r.x = this.v.a(2).right;
      }
      label1482:
      label1488:
      label1493:
      label1560:
      label1598:
      do
      {
        do
        {
          do
          {
            for (;;)
            {
              if (this.y != null) {
                paramView = this.y;
              }
              this.p = true;
              requestRender();
              break;
              bool1 = false;
              break label1369;
              bool1 = false;
              break label1401;
              i1 = 2;
              break label1421;
              new StringBuilder("*****leftRect.left=").append(localRectF.left).toString();
              if ((this.h == 2) || (this.b == 2)) {
                this.r.x = localRectF.left;
              } else {
                this.r.x = paramView.left;
              }
            }
            if ((this.i != 0) || (this.h != 1)) {
              break label1598;
            }
            this.a.c();
          } while (this.y == null);
          paramView = this.y;
          return true;
        } while ((this.i != this.w.a() - 1) || (this.h != 2));
        this.a.b();
      } while (this.y == null);
      paramView = this.y;
      return true;
      label1647:
      if ((this.F > com.ireadercity.b2.a.D * 0.6D) && (this.i == this.w.a() - 1)) {
        this.a.b();
      } else if ((this.F < com.ireadercity.b2.a.D * 0.33D) && (this.i == 0)) {
        this.a.c();
      }
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    this.v.b(paramInt);
    requestRender();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\curlview\CurlView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */