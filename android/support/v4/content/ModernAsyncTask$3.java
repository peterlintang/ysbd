package android.support.v4.content;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class ModernAsyncTask$3
  extends FutureTask<Result>
{
  ModernAsyncTask$3(ModernAsyncTask paramModernAsyncTask, Callable paramCallable)
  {
    super(paramCallable);
  }
  
  protected void done()
  {
    try
    {
      Object localObject = get();
      ModernAsyncTask.access$400(this.this$0, localObject);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      throw new RuntimeException("An error occured while executing doInBackground()", localExecutionException.getCause());
    }
    catch (CancellationException localCancellationException)
    {
      ModernAsyncTask.access$400(this.this$0, null);
      return;
    }
    catch (Throwable localThrowable)
    {
      throw new RuntimeException("An error occured while executing doInBackground()", localThrowable);
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\content\ModernAsyncTask$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */