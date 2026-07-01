package com.ireadercity.b2.curlview;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLU;
import java.util.Vector;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class e
  implements GLSurfaceView.Renderer
{
  private int a = 1;
  private RectF b = new RectF();
  private RectF c = new RectF();
  private int d;
  private int e;
  private Vector<a> f;
  private boolean g = false;
  private int h;
  private f i;
  private RectF j;
  private RectF k;
  
  public e(f paramf)
  {
    this.i = paramf;
    this.f = new Vector();
    this.j = new RectF();
    this.k = new RectF();
  }
  
  private void b()
  {
    if ((this.b.width() == 0.0F) || (this.b.height() == 0.0F)) {}
    do
    {
      return;
      if (this.a == 1)
      {
        this.k.set(this.b);
        localRectF = this.k;
        localRectF.left += this.b.width() * this.c.left;
        localRectF = this.k;
        localRectF.right -= this.b.width() * this.c.right;
        localRectF = this.k;
        localRectF.top += this.b.height() * this.c.top;
        localRectF = this.k;
        localRectF.bottom -= this.b.height() * this.c.bottom;
        this.j.set(this.k);
        this.j.offset(-this.k.width(), 0.0F);
        m = (int)(this.k.width() * this.d / this.b.width());
        n = (int)(this.k.height() * this.e / this.b.height());
        this.i.a(m, n);
        return;
      }
    } while (this.a != 2);
    this.k.set(this.b);
    RectF localRectF = this.k;
    localRectF.left += this.b.width() * this.c.left;
    localRectF = this.k;
    localRectF.right -= this.b.width() * this.c.right;
    localRectF = this.k;
    localRectF.top += this.b.height() * this.c.top;
    localRectF = this.k;
    localRectF.bottom -= this.b.height() * this.c.bottom;
    this.j.set(this.k);
    this.j.right = ((this.j.right + this.j.left) / 2.0F);
    this.k.left = this.j.right;
    int m = (int)(this.k.width() * this.d / this.b.width());
    int n = (int)(this.k.height() * this.e / this.b.height());
    this.i.a(m, n);
  }
  
  public final RectF a(int paramInt)
  {
    if (paramInt == 1) {
      return this.j;
    }
    if (paramInt == 2) {
      return this.k;
    }
    return null;
  }
  
  public final void a()
  {
    try
    {
      this.c.left = 0.0F;
      this.c.top = 0.0F;
      this.c.right = 0.0F;
      this.c.bottom = 0.0F;
      b();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(PointF paramPointF)
  {
    paramPointF.x = (this.b.left + this.b.width() * paramPointF.x / this.d);
    paramPointF.y = (this.b.top - -this.b.height() * paramPointF.y / this.e);
  }
  
  public final void a(a parama)
  {
    try
    {
      b(parama);
      this.f.add(parama);
      new StringBuilder("mCurlMeshes.size()=").append(this.f.size()).toString();
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public final void b(int paramInt)
  {
    this.h = paramInt;
    this.g = true;
  }
  
  public final void b(a parama)
  {
    try
    {
      boolean bool;
      do
      {
        bool = this.f.remove(parama);
      } while (bool);
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public final void c(int paramInt)
  {
    if (paramInt == 1) {}
    for (;;)
    {
      try
      {
        this.a = paramInt;
        b();
        return;
      }
      finally {}
      if (paramInt == 2)
      {
        this.a = paramInt;
        b();
      }
    }
  }
  
  public final void onDrawFrame(GL10 paramGL10)
  {
    try
    {
      this.i.a();
      if (this.g)
      {
        paramGL10.glClearColor(Color.red(this.h) / 255.0F, Color.green(this.h) / 255.0F, Color.blue(this.h) / 255.0F, Color.alpha(this.h) / 255.0F);
        this.g = false;
      }
      paramGL10.glClear(16384);
      paramGL10.glLoadIdentity();
      int m = 0;
      while (m < this.f.size())
      {
        ((a)this.f.get(m)).a(paramGL10);
        m += 1;
      }
      return;
    }
    finally {}
  }
  
  public final void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    paramGL10.glViewport(0, 0, paramInt1, paramInt2);
    this.d = paramInt1;
    this.e = paramInt2;
    float f1 = paramInt1 / paramInt2;
    this.b.top = 1.0F;
    this.b.bottom = -1.0F;
    this.b.left = (-f1);
    this.b.right = f1;
    b();
    paramGL10.glMatrixMode(5889);
    paramGL10.glLoadIdentity();
    GLU.gluOrtho2D(paramGL10, this.b.left, this.b.right, this.b.bottom, this.b.top);
    paramGL10.glMatrixMode(5888);
    paramGL10.glLoadIdentity();
  }
  
  public final void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    paramGL10.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    paramGL10.glShadeModel(7425);
    paramGL10.glHint(3152, 4354);
    paramGL10.glHint(3154, 4354);
    paramGL10.glHint(3155, 4354);
    paramGL10.glEnable(2848);
    paramGL10.glDisable(2929);
    paramGL10.glDisable(2884);
    this.i.b();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\curlview\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */