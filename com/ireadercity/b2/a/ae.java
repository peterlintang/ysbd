package com.ireadercity.b2.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.bean.f;

final class ae
  implements View.OnClickListener
{
  ae(r paramr) {}
  
  public final void onClick(View paramView)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    this.a.a = System.currentTimeMillis();
    if (r.c(this.a)) {
      r.g();
    }
    for (;;)
    {
      return;
      Object localObject3 = paramView.getTag();
      if ((localObject3 instanceof b))
      {
        new StringBuilder("2---").append(System.currentTimeMillis() - this.a.a).toString();
        if ((paramView instanceof ImageView))
        {
          paramView = (ImageView)paramView;
          paramView.startAnimation(r.d(this.a));
          localObject1 = (b)paramView.getTag();
        }
        for (;;)
        {
          new StringBuilder("3---").append(System.currentTimeMillis() - this.a.a).toString();
          if (localObject1 == null) {
            break;
          }
          this.a.c((b)localObject1);
          return;
          if ((paramView instanceof TextView)) {
            localObject1 = (b)((TextView)paramView).getTag();
          }
        }
      }
      if ((localObject3 instanceof f))
      {
        if ((paramView instanceof ImageView)) {
          localObject1 = (f)((ImageView)paramView).getTag();
        }
        while (localObject1 != null)
        {
          this.a.a((f)localObject1);
          return;
          localObject1 = localObject2;
          if ((paramView instanceof TextView)) {
            localObject1 = (f)((TextView)paramView).getTag();
          }
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */