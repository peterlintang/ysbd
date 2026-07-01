package com.umeng.newxp.view;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.a.e;

class UMDetail$3
  implements View.OnClickListener
{
  int a;
  int b = 3;
  boolean c = false;
  
  UMDetail$3(UMDetail paramUMDetail, TextView paramTextView) {}
  
  public void onClick(View paramView)
  {
    paramView = this.e.m.getLayoutParams();
    if (this.a == 0) {
      this.a = paramView.height;
    }
    if (3 <= this.e.m.getLineCount())
    {
      if (!this.c) {
        break label134;
      }
      this.e.m.setMaxLines(this.b);
      this.c = false;
      this.d.setText(this.e.d.getText(e.o(this.e.d)));
    }
    for (;;)
    {
      Log.a(UMDetail.a(), "descript text view has changed height.[" + paramView.height + "]");
      this.e.m.requestLayout();
      return;
      label134:
      this.e.m.setMaxLines(Integer.MAX_VALUE);
      this.c = true;
      this.d.setText(this.e.d.getText(e.p(this.e.d)));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\UMDetail$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */