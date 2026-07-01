package com.umeng.socialize.view.wigets;

import android.os.Handler;
import android.os.SystemClock;

public abstract class c
{
  protected static final int a = 1000;
  protected static final int b = 16;
  protected boolean c = false;
  protected final Handler d = new c.a(this, null);
  protected float e;
  protected float f;
  protected float g;
  protected float h;
  protected long i;
  
  protected abstract void a(float paramFloat);
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public boolean a()
  {
    return this.c;
  }
  
  protected abstract void b();
  
  protected void c()
  {
    long l = SystemClock.uptimeMillis();
    float f1 = ((float)l - this.e) / 1000.0F;
    float f2 = this.f;
    float f3 = this.g;
    float f4 = this.h;
    this.f = (f2 + f3 * f1 + 0.5F * f4 * f1 * f1);
    this.g = (f1 * f4 + f3);
    this.e = ((float)l);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */