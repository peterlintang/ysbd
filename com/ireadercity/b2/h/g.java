package com.ireadercity.b2.h;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.ireadercity.b2.a;

final class g
  implements DialogInterface.OnClickListener
{
  g(d paramd) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = d.a(this.a);
    paramInt = a.Q;
    PreferenceManager.getDefaultSharedPreferences(paramDialogInterface).edit().putInt("notremindversion", paramInt).commit();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */