package com.umeng.common.net;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

class b
  implements ServiceConnection
{
  b(a parama) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    a.b();
    a.a(this.a, new Messenger(paramIBinder));
    if (a.a(this.a) != null) {
      a.a(this.a).a();
    }
    try
    {
      paramComponentName = Message.obtain(null, 4);
      paramComponentName.setData(new a.a(a.d(this.a), a.e(this.a), a.f(this.a)).a());
      paramComponentName.replyTo = this.a.a;
      a.g(this.a).send(paramComponentName);
      return;
    }
    catch (RemoteException paramComponentName) {}
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    a.b();
    a.a(this.a, null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */