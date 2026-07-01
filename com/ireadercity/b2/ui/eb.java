package com.ireadercity.b2.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask.Status;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

final class eb
  extends BroadcastReceiver
{
  eb(PDFBrowseActivity paramPDFBrowseActivity) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("turning_next")) {
      if (PDFBrowseActivity.d(this.a) + 1 < PDFBrowseActivity.e(this.a).size())
      {
        if ((PDFBrowseActivity.m(this.a) != null) && (!PDFBrowseActivity.m(this.a).getStatus().equals(AsyncTask.Status.FINISHED))) {
          PDFBrowseActivity.m(this.a).cancel(true);
        }
        PDFBrowseActivity.b(this.a, new ec(this.a));
        PDFBrowseActivity.n(this.a);
        this.a.a(0);
        PDFBrowseActivity.m(this.a).execute(new Object[] { (String)PDFBrowseActivity.e(this.a).get(PDFBrowseActivity.d(this.a)) + ".dcpt" });
        PDFBrowseActivity.f(this.a).setText(PDFBrowseActivity.d(this.a) + 1);
        PDFBrowseActivity.o(this.a).setProgress(PDFBrowseActivity.d(this.a));
      }
    }
    do
    {
      return;
      Toast.makeText(this.a, "当前已是最后一页", 0).show();
      return;
      if (paramIntent.getAction().equals("turning_last"))
      {
        if (PDFBrowseActivity.d(this.a) - 1 >= 0)
        {
          if ((PDFBrowseActivity.m(this.a) != null) && (!PDFBrowseActivity.m(this.a).getStatus().equals(AsyncTask.Status.FINISHED))) {
            PDFBrowseActivity.m(this.a).cancel(true);
          }
          PDFBrowseActivity.b(this.a, new ec(this.a));
          PDFBrowseActivity.p(this.a);
          this.a.a(1);
          PDFBrowseActivity.m(this.a).execute(new Object[] { (String)PDFBrowseActivity.e(this.a).get(PDFBrowseActivity.d(this.a)) + ".dcpt" });
          PDFBrowseActivity.f(this.a).setText(PDFBrowseActivity.d(this.a) + 1);
          PDFBrowseActivity.o(this.a).setProgress(PDFBrowseActivity.d(this.a));
          return;
        }
        Toast.makeText(this.a, "当前是第一页", 0).show();
        return;
      }
    } while ((paramIntent.getAction().equals("set_bitmap")) || (paramIntent.getAction().equals("set_cur_bitmap")) || (!paramIntent.getAction().equals("show_you_sisiter")));
    if (PDFBrowseActivity.q(this.a).getVisibility() == 0)
    {
      PDFBrowseActivity.q(this.a).setVisibility(8);
      this.a.c();
      return;
    }
    PDFBrowseActivity.q(this.a).setVisibility(0);
    PDFBrowseActivity.q(this.a).requestFocus();
    this.a.b();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */