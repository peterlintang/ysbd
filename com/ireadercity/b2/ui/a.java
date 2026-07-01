package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.h.w;

final class a
  implements View.OnClickListener
{
  a(AIReaderActivity paramAIReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    w.c();
    int i = ((Integer)paramView.getTag()).intValue();
    new StringBuilder("     clicked ").append(i).toString();
    AIReaderActivity.a(this.a, i + 10011);
    AIReaderActivity.a(this.a, new am(this.a));
    AIReaderActivity.b(this.a).execute(new Integer[] { Integer.valueOf(AIReaderActivity.a(this.a)) });
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */