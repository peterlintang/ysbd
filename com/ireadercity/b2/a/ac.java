package com.ireadercity.b2.a;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.d.a;
import com.ireadercity.b2.h.x;

final class ac
  extends AsyncTask<Object, Integer, Boolean>
{
  ProgressDialog a;
  b b;
  boolean c;
  
  ac(r paramr) {}
  
  private Boolean a(Object... paramVarArgs)
  {
    String str1 = (String)paramVarArgs[0];
    String str2 = (String)paramVarArgs[1];
    this.b = ((b)paramVarArgs[2]);
    this.c = ((Boolean)paramVarArgs[3]).booleanValue();
    try
    {
      x.a(str1, str2);
      return Boolean.valueOf(true);
    }
    catch (a paramVarArgs)
    {
      paramVarArgs.printStackTrace();
    }
    return Boolean.valueOf(false);
  }
  
  protected final void onPreExecute()
  {
    this.a = new ProgressDialog(r.b(this.d));
    this.a.setTitle(2131230798);
    this.a.setMessage("请耐心等待...");
    this.a.setCancelable(false);
    this.a.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */