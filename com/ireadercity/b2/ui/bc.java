package com.ireadercity.b2.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.ireadercity.b2.bean.b;
import java.util.ArrayList;
import java.util.HashMap;

final class bc
  implements AdapterView.OnItemClickListener
{
  bc(BookInfoActivity paramBookInfoActivity) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    new StringBuilder("chapter.get(index).get(src)=").append((String)((HashMap)BookInfoActivity.i(this.a).get(paramInt)).get("src")).append((String)((HashMap)BookInfoActivity.i(this.a).get(paramInt)).get("progress")).toString();
    paramAdapterView = null;
    if (BookInfoActivity.j(this.a).y()) {
      paramAdapterView = ((String)((HashMap)BookInfoActivity.i(this.a).get(paramInt)).get("src")).toString();
    }
    this.a.a(paramAdapterView, BookInfoActivity.j(this.a), paramInt, -1, Float.parseFloat((String)((HashMap)BookInfoActivity.i(this.a).get(paramInt)).get("progress")));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */