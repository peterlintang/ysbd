package com.umeng.newxp.common.c;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

class b$2
  extends b.e<Params, Result>
{
  b$2(b paramb)
  {
    super(null);
  }
  
  public Result call()
  {
    b.a(this.a).set(true);
    Process.setThreadPriority(10);
    return (Result)b.a(this.a, this.a.a(this.b));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c\b$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */