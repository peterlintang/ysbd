package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.ireadercity.b2.b.r;
import com.ireadercity.b2.g.a;

final class bw
  implements View.OnClickListener
{
  bw(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onClick(View paramView)
  {
    if (BookReadingActivityNew.K(this.a) == null) {
      BookReadingActivityNew.L(this.a);
    }
    if (BookReadingActivityNew.K(this.a).e())
    {
      this.a.e(BookReadingActivityNew.g[4]);
      BookReadingActivityNew.K(this.a).a(BookReadingActivityNew.p(this.a).a(BookReadingActivityNew.e(this.a)), BookReadingActivityNew.k() * 100 + BookReadingActivityNew.e(this.a), BookReadingActivityNew.k() * 100 + BookReadingActivityNew.e(this.a));
      return;
    }
    Toast.makeText(this.a.getApplicationContext(), "请先安装讯飞语音插件", 0).show();
    BookReadingActivityNew.K(this.a).g();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */