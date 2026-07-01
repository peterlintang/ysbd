package com.ireadercity.b2.a;

import android.app.Activity;
import android.content.Intent;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.ui.BookInfoActivity;
import com.ireadercity.b2.ui.du;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

final class z
  extends Thread
{
  z(r paramr, b paramb, du paramdu) {}
  
  public final void run()
  {
    try
    {
      int i = this.a.u();
      if (i <= 0) {}
      Intent localIntent;
      for (;;)
      {
        try
        {
          r.g();
          com.ireadercity.b2.c.a.a(r.b(this.c).getApplicationContext()).a(this.a.j(), this.a.k(), this.a.m(), this.a.n(), "", this.a.r(), "", "", 1, com.ireadercity.b2.a.T);
          Object localObject1 = new File(this.a.l());
          long l = ((File)localObject1).length() / (com.ireadercity.b2.a.T * 1024);
          if (((File)localObject1).length() % (com.ireadercity.b2.a.T * 1024) != 0L)
          {
            l += 1L;
            localObject1 = new ArrayList();
            i = 0;
            if (i < l)
            {
              HashMap localHashMap = new HashMap();
              localHashMap.put("title", "章节-" + (i + 1));
              localHashMap.put("order", i);
              ((ArrayList)localObject1).add(localHashMap);
              i += 1;
            }
          }
        }
        catch (Exception localException1)
        {
          r.g();
          new StringBuilder("Exception").append(localException1).toString();
        }
      }
    }
    catch (Exception localException2)
    {
      localException2.toString();
      return;
      this.a.a(localException2);
      if (this.a.h() == 0) {
        this.a.c(com.ireadercity.b2.a.T);
      }
      b.a = this.a;
      localIntent = new Intent(r.b(this.c), BookInfoActivity.class);
      r.b(this.c).startActivity(localIntent);
      return;
    }
    finally
    {
      this.b.b();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */