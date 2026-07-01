package com.ireadercity.b2.g;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

final class e
  implements View.OnClickListener
{
  e(a parama, Dialog paramDialog) {}
  
  public final void onClick(View paramView)
  {
    this.a.dismiss();
    a.a(this.b, new AlertDialog.Builder(a.e(this.b)).create());
    a.f(this.b).show();
    a.f(this.b).setContentView(2130903086);
    paramView = new Message();
    paramView.what = 0;
    a.b(this.b).sendMessage(paramView);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\g\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */