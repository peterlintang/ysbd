package com.ireadercity.b2.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import java.util.List;

final class ai
  implements View.OnClickListener
{
  ai(ah paramah, int paramInt) {}
  
  public final void onClick(View paramView)
  {
    this.b.c = this.a;
    paramView = this.b;
    int i = 0;
    if (i < paramView.b.length)
    {
      aj localaj = (aj)((View)paramView.e.get(i)).getTag();
      if (paramView.c == i) {
        localaj.a.setTextColor(paramView.a.getResources().getColor(2131099672));
      }
      for (;;)
      {
        i += 1;
        break;
        localaj.a.setTextColor(paramView.a.getResources().getColor(2131099673));
      }
    }
    this.b.d.a(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */