package com.umeng.socialize.controller.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public abstract class ay<Result>
{
  private static final HandlerThread a;
  
  static
  {
    HandlerThread localHandlerThread = new HandlerThread(b.class.getName(), 10);
    a = localHandlerThread;
    localHandlerThread.start();
  }
  
  protected void a() {}
  
  protected void a(Result paramResult) {}
  
  protected abstract Result c();
  
  public final ay<Result> d()
  {
    Handler localHandler1 = new Handler(Looper.myLooper());
    Handler localHandler2 = new Handler(a.getLooper());
    a();
    localHandler2.post(new az(this, localHandler1));
    return this;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */