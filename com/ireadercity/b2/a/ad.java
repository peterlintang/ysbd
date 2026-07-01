package com.ireadercity.b2.a;

import android.os.AsyncTask;
import android.view.View;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.ui.AIReaderActivity;
import java.util.List;

final class ad
  extends AsyncTask<Integer, Integer, List<b>>
{
  ad(r paramr) {}
  
  protected final void onPreExecute()
  {
    try
    {
      AIReaderActivity.a.c.setVisibility(0);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      r.g();
      localNullPointerException.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */