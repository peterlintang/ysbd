package com.tencent.mm.sdk.platformtools;

import android.os.Handler;
import android.os.Message;

public final class e
  extends Handler
{
  private final int a;
  private final boolean b;
  private long c;
  private final f d;
  
  public final void a()
  {
    removeMessages(this.a);
  }
  
  protected final void finalize()
  {
    a();
    super.finalize();
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if ((paramMessage.what != this.a) || (this.d == null)) {}
    while ((!this.d.a()) || (!this.b)) {
      return;
    }
    sendEmptyMessageDelayed(this.a, this.c);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */