package com.ireadercity.b2.ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.ireadercity.b2.bean.b;
import java.util.ArrayList;
import java.util.HashMap;

final class cu
  implements AdapterView.OnItemClickListener
{
  cu(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    new StringBuilder("chapter.get(index).get(src)=").append(((HashMap)BookReadingActivityNew.H(this.a).get(paramInt)).get("chapterIndex")).append(" ").append(((HashMap)BookReadingActivityNew.H(this.a).get(paramInt)).get("floatPercent")).append(" ").append(((HashMap)BookReadingActivityNew.H(this.a).get(paramInt)).get("URL")).toString();
    if (BookReadingActivityNew.l(this.a).y())
    {
      BookReadingActivityNew.d(((Integer)((HashMap)BookReadingActivityNew.H(this.a).get(paramInt)).get("chapterIndex")).intValue());
      BookReadingActivityNew.e(BookReadingActivityNew.c(this.a, BookReadingActivityNew.l()));
      BookReadingActivityNew.c(this.a, (String)((HashMap)BookReadingActivityNew.H(this.a).get(paramInt)).get("URL"));
      BookReadingActivityNew.a(this.a, ((Float)((HashMap)BookReadingActivityNew.H(this.a).get(paramInt)).get("floatPercent")).floatValue());
    }
    for (;;)
    {
      ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(BookReadingActivityNew.E(this.a).getWindowToken(), 0);
      BookReadingActivityNew.d(this.a, BookReadingActivityNew.E(this.a).getText().toString());
      BookReadingActivityNew.d(this.a, 4);
      BookReadingActivityNew.G(this.a);
      BookReadingActivityNew.F(this.a).setVisibility(8);
      this.a.t = false;
      this.a.e(BookReadingActivityNew.g[0]);
      this.a.f();
      return;
      BookReadingActivityNew.e(((Integer)((HashMap)BookReadingActivityNew.H(this.a).get(paramInt)).get("chapterIndex")).intValue());
      BookReadingActivityNew.d(BookReadingActivityNew.k());
      BookReadingActivityNew.a(this.a, ((Float)((HashMap)BookReadingActivityNew.H(this.a).get(paramInt)).get("floatPercent")).floatValue());
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */