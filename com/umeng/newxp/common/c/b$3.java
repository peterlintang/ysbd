package com.umeng.newxp.common.c;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class b$3
  extends FutureTask<Result>
{
  b$3(b paramb, Callable paramCallable)
  {
    super(paramCallable);
  }
  
  protected void done()
  {
    try
    {
      b.b(this.a, get());
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      throw new RuntimeException("An error occured while executing doInBackground()", localExecutionException.getCause());
    }
    catch (CancellationException localCancellationException)
    {
      b.b(this.a, null);
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c\b$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */