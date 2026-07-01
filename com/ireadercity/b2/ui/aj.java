package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.ireadercity.b2.a.r;

final class aj
  implements View.OnClickListener
{
  aj(AIReaderActivity paramAIReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    if (AIReaderActivity.f(this.a).b())
    {
      AIReaderActivity.f(this.a).a(false);
      AIReaderActivity.m(this.a).setImageResource(2130837553);
    }
    for (;;)
    {
      AIReaderActivity.f(this.a).notifyDataSetChanged();
      return;
      AIReaderActivity.f(this.a).a(true);
      AIReaderActivity.m(this.a).setImageResource(2130837557);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */