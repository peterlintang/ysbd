package com.ireadercity.b2.store;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.ireadercity.b2.a.e;
import com.ireadercity.b2.e.a;

final class aj
  implements DialogInterface.OnClickListener
{
  aj(ai paramai) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      a.a(this.a.a.getApplicationContext()).d();
      DownloadListActivity.a(this.a.a).notifyDataSetChanged();
      return;
    }
    catch (Exception paramDialogInterface)
    {
      paramDialogInterface.printStackTrace();
      paramDialogInterface = Toast.makeText(this.a.a.getApplicationContext(), "删除失败！稍后重试", 0);
      paramDialogInterface.setGravity(17, 0, 0);
      paramDialogInterface.show();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */