package com.ireadercity.b2.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.bean.i;

final class ex
  implements View.OnClickListener
{
  ex(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    if (SetReaderActivity.d() != 0) {
      SetReaderActivity.c().a(SetReaderActivity.d());
    }
    if (SetReaderActivity.e() != 0) {
      SetReaderActivity.c().b(SetReaderActivity.e());
    }
    if (SetReaderActivity.g(this.a) != 0)
    {
      new StringBuilder().append(SetReaderActivity.g(this.a)).append("!!!!!!").toString();
      SetReaderActivity.c().f(SetReaderActivity.g(this.a));
    }
    new StringBuilder("resultCode=").append(SetReaderActivity.c(this.a)).toString();
    SetReaderActivity.c().b(this.a);
    paramView = new Intent(this.a, BookReadingActivityNew.class);
    this.a.setResult(SetReaderActivity.c(this.a), paramView);
    this.a.finish();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */