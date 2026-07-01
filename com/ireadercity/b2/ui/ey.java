package com.ireadercity.b2.ui;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

final class ey
  implements View.OnClickListener
{
  ey(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    new AlertDialog.Builder(SetReaderActivity.j(this.a)).setTitle(2131230832).setMessage(2131230841).setPositiveButton(2131230844, new ez(this)).setNegativeButton(2131230845, null).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */