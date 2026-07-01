package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.ireadercity.b2.h.w;

final class ai
  implements View.OnClickListener
{
  ai(AIReaderActivity paramAIReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = AIReaderActivity.a;
    ListView localListView = AIReaderActivity.k(this.a);
    View.OnClickListener localOnClickListener = AIReaderActivity.l(this.a);
    w.a(paramView, localListView, new String[] { "云阅读记录", "添加分类", "软件帮助", "关于我们", "本地书籍", "筛选关键字", "清除缓存" }, localOnClickListener);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */