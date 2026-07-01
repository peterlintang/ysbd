package com.umeng.newxp.view.handler.utils;

import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.umeng.newxp.view.widget.RecyclingBitmapDrawable;
import java.lang.ref.WeakReference;

class e$b
  extends com.umeng.newxp.common.c.b<Object, Void, BitmapDrawable>
{
  private String f;
  private Object g;
  private final WeakReference<ImageView> h;
  
  public e$b(e parame, ImageView paramImageView)
  {
    this.h = new WeakReference(paramImageView);
  }
  
  private ImageView h()
  {
    ImageView localImageView = (ImageView)this.h.get();
    if (this == e.b(localImageView)) {
      return localImageView;
    }
    return null;
  }
  
  protected void a(BitmapDrawable paramBitmapDrawable)
  {
    if ((e()) || (e.c(this.e))) {
      paramBitmapDrawable = null;
    }
    ImageView localImageView = h();
    if ((paramBitmapDrawable != null) && (localImageView != null)) {
      e.a(this.e, localImageView, paramBitmapDrawable);
    }
  }
  
  protected void b(BitmapDrawable arg1)
  {
    super.b(???);
    synchronized (e.a(this.e))
    {
      e.a(this.e).notifyAll();
      return;
    }
  }
  
  protected BitmapDrawable e(Object... paramVarArgs)
  {
    Object localObject2 = null;
    this.g = paramVarArgs[0];
    String str = String.valueOf(this.g);
    for (;;)
    {
      synchronized (e.a(this.e))
      {
        if (this.e.c)
        {
          boolean bool = e();
          if (!bool)
          {
            try
            {
              e.a(this.e).wait();
            }
            catch (InterruptedException localInterruptedException) {}
            continue;
          }
        }
        if ((e.b(this.e) == null) || (e()) || (h() == null) || (e.c(this.e))) {
          break label262;
        }
        ??? = e.b(this.e).b(str);
        if ((??? != null) || (e()) || (h() == null) || (e.c(this.e))) {}
      }
      paramVarArgs = (Object[])???;
      continue;
      paramVarArgs = new RecyclingBitmapDrawable(this.e.d, paramVarArgs);
      continue;
      label262:
      ??? = null;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\e$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */