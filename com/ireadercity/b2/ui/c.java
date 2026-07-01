package com.ireadercity.b2.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.store.DownloadListActivity;

final class c
  implements View.OnClickListener
{
  c(AIReaderActivity paramAIReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    try
    {
      paramView = new Intent(this.a, DownloadListActivity.class);
      this.a.startActivity(paramView);
      return;
    }
    catch (Throwable paramView)
    {
      paramView.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */