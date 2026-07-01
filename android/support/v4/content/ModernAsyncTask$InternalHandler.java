package android.support.v4.content;

import android.os.Handler;
import android.os.Message;

class ModernAsyncTask$InternalHandler
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    ModernAsyncTask.AsyncTaskResult localAsyncTaskResult = (ModernAsyncTask.AsyncTaskResult)paramMessage.obj;
    switch (paramMessage.what)
    {
    default: 
      return;
    case 1: 
      ModernAsyncTask.access$500(localAsyncTaskResult.mTask, localAsyncTaskResult.mData[0]);
      return;
    }
    localAsyncTaskResult.mTask.onProgressUpdate(localAsyncTaskResult.mData);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\content\ModernAsyncTask$InternalHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */