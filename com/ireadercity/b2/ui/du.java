package com.ireadercity.b2.ui;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;

public final class du
  extends Dialog
{
  private volatile boolean a = false;
  private ProgressDialog b;
  private Activity c;
  
  public du(Activity paramActivity)
  {
    super(paramActivity);
    this.c = paramActivity;
  }
  
  public final void a(String paramString)
  {
    if (this.b == null) {
      this.b = new ProgressDialog(this.c);
    }
    this.b.setProgressStyle(0);
    this.b.setTitle(2131230798);
    this.b.setMessage(paramString);
    this.b.setIndeterminate(true);
    this.b.setCancelable(true);
    this.a = true;
    if (!this.b.isShowing()) {
      this.b.show();
    }
  }
  
  public final boolean a()
  {
    return this.a;
  }
  
  public final void b()
  {
    this.a = false;
    this.b.cancel();
  }
  
  public final void dismiss()
  {
    this.b.dismiss();
    this.a = false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */