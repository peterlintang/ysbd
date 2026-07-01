package com.ireadercity.b2.a;

import android.os.AsyncTask.Status;
import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.bean.d;
import java.util.concurrent.ConcurrentHashMap;

final class f
  implements View.OnClickListener
{
  f(e parame) {}
  
  public final void onClick(View paramView)
  {
    d locald = (d)paramView.getTag();
    if (locald == null)
    {
      e.a();
      return;
    }
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131361868: 
      paramView = (com.ireadercity.b2.e.e)com.ireadercity.b2.e.a.b.get(locald.g());
      if ((paramView != null) && (paramView.getStatus().equals(AsyncTask.Status.RUNNING))) {
        com.ireadercity.b2.e.a.a(e.a(this.a)).a(locald.g(), false);
      }
      break;
    }
    for (;;)
    {
      this.a.notifyDataSetChanged();
      return;
      try
      {
        com.ireadercity.b2.e.a.a(e.a(this.a)).c(locald);
        com.ireadercity.b2.e.a.a(e.a(this.a)).e(locald);
        com.ireadercity.b2.e.a.d.remove(locald.g());
        com.ireadercity.b2.e.a.b.remove(locald.g());
        com.ireadercity.b2.e.a.c.remove(locald.g());
        paramView = com.ireadercity.b2.c.a.a(e.a(this.a));
        paramView.m(locald.g());
        paramView.q(locald.g());
        this.a.notifyDataSetChanged();
        return;
      }
      catch (Exception paramView)
      {
        for (;;)
        {
          paramView.printStackTrace();
        }
      }
      com.ireadercity.b2.e.a.a(e.a(this.a)).a(locald.g(), true);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */