package com.ireadercity.b2.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import java.util.List;

final class am
  implements View.OnClickListener
{
  am(al paramal, int paramInt) {}
  
  public final void onClick(View paramView)
  {
    this.b.c = this.a;
    paramView = this.b;
    int i = 0;
    if (i < paramView.e())
    {
      an localan = (an)((View)paramView.d.get(i)).getTag();
      if (paramView.c == i) {
        localan.b.setBackgroundColor(paramView.a.getResources().getColor(2131099672));
      }
      for (;;)
      {
        i += 1;
        break;
        localan.b.setBackgroundColor(paramView.a.getResources().getColor(2131099673));
      }
    }
    this.b.e.a(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */