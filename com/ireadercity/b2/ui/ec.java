package com.ireadercity.b2.ui;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.ireadercity.b2.b.n;

final class ec
  extends AsyncTask<Object, Integer, Bitmap>
{
  Bitmap a;
  int b = 1;
  
  public ec(PDFBrowseActivity paramPDFBrowseActivity) {}
  
  private Bitmap a(Object... paramVarArgs)
  {
    try
    {
      paramVarArgs = (String)paramVarArgs[0];
      this.a = PDFBrowseActivity.g(this.c).a(paramVarArgs);
      paramVarArgs = this.a;
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
    if ((this.a != null) && (!this.a.isRecycled())) {}
    try
    {
      this.a.recycle();
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */