package com.ireadercity.b2.ui;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;
import com.ireadercity.b2.bean.b;
import java.util.List;

final class am
  extends AsyncTask<Integer, Void, List<b>>
{
  am(AIReaderActivity paramAIReaderActivity) {}
  
  protected final void onPreExecute()
  {
    AIReaderActivity.u(this.a).setVisibility(0);
    String str;
    switch (AIReaderActivity.a(this.a))
    {
    default: 
      str = this.a.getResources().getString(2131230940);
    }
    for (;;)
    {
      AIReaderActivity.v(this.a).setText(str);
      return;
      str = this.a.getResources().getString(2131230937);
      continue;
      str = this.a.getResources().getString(2131230938);
      continue;
      str = this.a.getResources().getString(2131230939);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */