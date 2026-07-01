package com.ireadercity.b2.store;

import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.ireadercity.b2.a.e;

final class ai
  implements View.OnClickListener
{
  ai(DownloadListActivity paramDownloadListActivity) {}
  
  public final void onClick(View paramView)
  {
    if (DownloadListActivity.a(this.a).getCount() <= 0)
    {
      paramView = Toast.makeText(this.a.getApplicationContext(), "没有正在进行的任务", 0);
      paramView.setGravity(17, 0, 0);
      paramView.show();
      return;
    }
    new AlertDialog.Builder(this.a).setTitle(2131230809).setMessage(this.a.getResources().getString(2131230811, new Object[] { "" })).setPositiveButton(2131230844, new aj(this)).setNegativeButton(2131230845, null).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */