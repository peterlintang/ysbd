package com.tencent.mm.sdk.platformtools;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;

final class m
  extends PhoneStateListener
{
  m(l paraml) {}
  
  public final void onSignalStrengthsChanged(SignalStrength paramSignalStrength)
  {
    super.onSignalStrengthsChanged(paramSignalStrength);
    if (l.a(this.a) == 2) {
      l.a(paramSignalStrength.getCdmaDbm());
    }
    if (l.a(this.a) == 1) {
      l.a(paramSignalStrength.getGsmSignalStrength() * 2 - 113);
    }
    if (l.b(this.a) != null) {
      l.b(this.a).listen(l.c(this.a), 0);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */