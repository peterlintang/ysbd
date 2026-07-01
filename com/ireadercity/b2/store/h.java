package com.ireadercity.b2.store;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.ireadercity.b2.a;
import com.ireadercity.b2.ui.widget.SegmentedRadioGroup;

final class h
  implements DialogInterface.OnClickListener
{
  h(CloudStoreActivity paramCloudStoreActivity, int paramInt, SharedPreferences paramSharedPreferences) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    CloudStoreActivity.l(this.c);
    paramDialogInterface.dismiss();
    if (this.a == 1)
    {
      paramDialogInterface = new Intent("android.intent.action.VIEW", Uri.parse("http://ibooks." + a.y + "/CN/Register.aspx"));
      this.c.startActivity(paramDialogInterface);
    }
    while (this.a == 1) {
      return;
    }
    paramDialogInterface = this.b.edit();
    paramDialogInterface.remove("userName");
    paramDialogInterface.remove("password");
    paramDialogInterface.commit();
    CloudStoreActivity.a(CloudStoreActivity.m(this.c));
    paramDialogInterface = (SegmentedRadioGroup)CloudStoreActivity.m(this.c).findViewById(2131362330);
    paramDialogInterface.check(paramDialogInterface.getChildAt(0).getId());
    Toast.makeText(this.c.getApplicationContext(), "成功注销！", 1).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */