package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.ireadercity.b2.h.b;
import com.ireadercity.b2.h.w;

final class g
  implements View.OnClickListener
{
  g(AIReaderActivity paramAIReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    int i = b.a(this.a.getApplicationContext());
    paramView = AIReaderActivity.a;
    ListView localListView = AIReaderActivity.k(this.a);
    View.OnClickListener localOnClickListener = AIReaderActivity.n(this.a);
    w.a(paramView, localListView, new String[] { "  按最后阅读  ", "  按下载时间  ", "  按书名  " }, i - 10011, localOnClickListener);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */