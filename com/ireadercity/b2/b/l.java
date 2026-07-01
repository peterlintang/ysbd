package com.ireadercity.b2.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ireadercity.b2.a;
import java.util.Stack;

final class l
  implements Runnable
{
  private l(g paramg) {}
  
  public final void run()
  {
    try
    {
      for (;;)
      {
        new StringBuilder("ImageQueueManager ").append(Thread.currentThread().getId()).append(" running").toString();
        if (k.a(g.a(this.a)).size() == 0) {}
        synchronized (k.a(g.a(this.a)))
        {
          new StringBuilder("imageQueue ").append(Thread.currentThread().getId()).append(" wait ").append(k.a(g.a(this.a)).hashCode()).toString();
          k.a(g.a(this.a)).wait();
          new StringBuilder("imageQueue ").append(Thread.currentThread().getId()).append(" wakeup").toString();
          if (k.a(g.a(this.a)).size() == 0) {
            break label341;
          }
          synchronized (k.a(g.a(this.a)))
          {
            if (k.a(g.a(this.a)).size() != 0) {}
          }
        }
        Object localObject2 = (m)k.a(g.a(this.a)).pop();
        new StringBuilder("REQUEST IMAGE [").append(Thread.currentThread().getId()).append("] =").append(((m)localObject2).a).toString();
        Bitmap localBitmap = g.a(this.a, ((m)localObject2).a);
        new StringBuilder("GET image returned [").append(Thread.currentThread().getId()).toString();
        Object localObject4 = ((m)localObject2).b.getTag();
        if ((localObject4 != null) && (((String)localObject4).equals(((m)localObject2).a))) {
          localObject2 = new i(this.a, localBitmap, ((m)localObject2).b);
        }
        try
        {
          a.ag.runOnUiThread((Runnable)localObject2);
          label341:
          boolean bool = Thread.interrupted();
          if (bool) {}
        }
        catch (Exception localException)
        {
          for (;;) {}
        }
      }
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */