package com.umeng.common.ufp.net;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.umeng.common.ufp.Log;

class a$1
  implements ServiceConnection
{
  a$1(a parama) {}
  
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
      paramIBinder = new a.a(a.d(this.a), a.e(this.a), a.f(this.a));
      paramIBinder.d = a.g(this.a);
      paramIBinder.e = a.h(this.a);
      paramIBinder.f = a.i(this.a);
      paramIBinder.g = a.j(this.a);
      paramComponentName.setData(paramIBinder.a());
      paramComponentName.replyTo = this.a.a;
      a.k(this.a).send(paramComponentName);
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */