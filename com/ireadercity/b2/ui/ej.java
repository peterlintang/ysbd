package com.ireadercity.b2.ui;

import android.os.AsyncTask.Status;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.ireadercity.b2.ui.widget.ScrollLayout_PDF;
import java.util.List;

final class ej
  implements SeekBar.OnSeekBarChangeListener
{
  ej(PDFViewerActivity paramPDFViewerActivity) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    PDFViewerActivity.a(this.a, paramInt);
    PDFViewerActivity.e(this.a).setText(PDFViewerActivity.c(this.a) + 1);
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    PDFViewerActivity.b(this.a).a(PDFViewerActivity.c(this.a));
    if ((PDFViewerActivity.g(this.a) != null) && (!PDFViewerActivity.g(this.a).getStatus().equals(AsyncTask.Status.FINISHED))) {
      PDFViewerActivity.g(this.a).cancel(true);
    }
    PDFViewerActivity.a(this.a, new em(this.a));
    if (PDFViewerActivity.h(this.a)) {
      PDFViewerActivity.g(this.a).execute(new Object[] { PDFViewerActivity.b(this.a).getChildAt(PDFViewerActivity.c(this.a)), (String)PDFViewerActivity.i(this.a).get(PDFViewerActivity.c(this.a)) + ".dcpt" });
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */