package android.support.v4.content;

import android.database.ContentObserver;
import android.os.Handler;

public final class Loader$ForceLoadContentObserver
  extends ContentObserver
{
  public Loader$ForceLoadContentObserver(Loader paramLoader)
  {
    super(new Handler());
  }
  
  public final boolean deliverSelfNotifications()
  {
    return true;
  }
  
  public final void onChange(boolean paramBoolean)
  {
    this.this$0.onContentChanged();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\content\Loader$ForceLoadContentObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */