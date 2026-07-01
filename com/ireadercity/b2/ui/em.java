package com.ireadercity.b2.ui;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.ireadercity.b2.b.n;
import com.ireadercity.b2.ui.widget.PDFView;

final class em
  extends AsyncTask<Object, Integer, Bitmap>
{
  PDFView a = null;
  Bitmap b;
  int c = 1;
  
  public em(PDFViewerActivity paramPDFViewerActivity) {}
  
  private Bitmap a(Object... paramVarArgs)
  {
    try
    {
      this.a = ((PDFView)paramVarArgs[0]);
      paramVarArgs = (String)paramVarArgs[1];
      this.b = PDFViewerActivity.j(this.d).a(paramVarArgs);
      paramVarArgs = this.b;
      return paramVarArgs;
    }
    catch (Exception paramVarArgs)
    {
      paramVarArgs.printStackTrace();
    }
    return null;
  }
  
  final void a()
  {
    if ((this.b != null) && (!this.b.isRecycled())) {}
    try
    {
      this.b.recycle();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  protected final void onCancelled()
  {
    a();
    super.onCancelled();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */