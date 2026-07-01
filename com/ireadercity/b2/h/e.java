package com.ireadercity.b2.h;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

final class e
  implements DialogInterface.OnClickListener
{
  e(d paramd) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    d.a(this.a, new ProgressDialog(d.a(this.a)));
    d.b(this.a).setTitle("正在下载");
    d.b(this.a).setMessage("请稍候...");
    d.b(this.a).setProgressStyle(0);
    if ((d.c(this.a) != null) && (!d.c(this.a).trim().equals("")))
    {
      d.a(this.a, d.c(this.a).replaceAll("\\\\", "/"));
      this.a.a(d.c(this.a));
      return;
    }
    Toast.makeText(d.a(this.a), "下载失败！", 1).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */