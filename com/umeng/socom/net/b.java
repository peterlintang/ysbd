package com.umeng.socom.net;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.umeng.socom.Log;

class b
  implements ServiceConnection
{
  b(a parama) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Log.c(a.b(), "ServiceConnection.onServiceConnected");
    a.a(this.a, new Messenger(paramIBinder));
    if (a.a(this.a) != null) {
      a.a(this.a).a();
    }
    try
    {
      paramComponentName = Message.obtain(null, 4);
      paramIBinder = new a.a(a.b(this.a), a.c(this.a), a.d(this.a));
      paramIBinder.d = a.e(this.a);
      paramIBinder.e = a.f(this.a);
      paramComponentName.setData(paramIBinder.a());
      paramComponentName.replyTo = this.a.a;
      a.g(this.a).send(paramComponentName);
      return;
    }
    catch (RemoteException paramComponentName) {}
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Log.c(a.b(), "ServiceConnection.onServiceDisconnected");
    a.a(this.a, null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */