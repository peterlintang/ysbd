package com.taobao.munion.net;

import android.os.Message;
import com.taobao.munion.utils.p;

class f$d
  implements Runnable
{
  private f.e b;
  
  public f$d(f paramf, f.e parame)
  {
    this.b = parame;
  }
  
  public void run()
  {
    Message localMessage = Message.obtain();
    localMessage.obj = this.b;
    this.a.e.sendMessage(localMessage);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\f$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */