package com.tencent.mm.sdk.platformtools;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

final class k
  extends PhoneStateListener
{
  k(j paramj) {}
  
  public final void onSignalStrengthChanged(int paramInt)
  {
    super.onSignalStrengthChanged(paramInt);
    j.a(paramInt * 2 - 113);
    if (j.a(this.a) != null) {
      j.a(this.a).listen(j.b(this.a), 0);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */