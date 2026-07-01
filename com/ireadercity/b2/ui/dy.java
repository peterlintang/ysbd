package com.ireadercity.b2.ui;

import android.os.AsyncTask.Status;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import java.util.List;

final class dy
  implements SeekBar.OnSeekBarChangeListener
{
  dy(PDFBrowseActivity paramPDFBrowseActivity) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    PDFBrowseActivity.a(this.a, paramInt);
    PDFBrowseActivity.f(this.a).setText(PDFBrowseActivity.d(this.a) + 1);
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    if ((PDFBrowseActivity.b(this.a) != null) && (!PDFBrowseActivity.b(this.a).getStatus().equals(AsyncTask.Status.FINISHED))) {
      PDFBrowseActivity.b(this.a).cancel(true);
    }
    PDFBrowseActivity.a(this.a, new ec(this.a));
    if (PDFBrowseActivity.c(this.a)) {
      PDFBrowseActivity.b(this.a).execute(new Object[] { (String)PDFBrowseActivity.e(this.a).get(PDFBrowseActivity.d(this.a)) + ".dcpt" });
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */