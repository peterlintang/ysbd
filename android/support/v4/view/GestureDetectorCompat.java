package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

public class GestureDetectorCompat
{
  private final GestureDetectorCompat.GestureDetectorCompatImpl mImpl;
  
  public GestureDetectorCompat(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener)
  {
    this(paramContext, paramOnGestureListener, null);
  }
  
  public GestureDetectorCompat(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
  {
    if (Build.VERSION.SDK_INT > 17)
    {
      this.mImpl = new GestureDetectorCompat.GestureDetectorCompatImplJellybeanMr2(paramContext, paramOnGestureListener, paramHandler);
      return;
    }
    this.mImpl = new GestureDetectorCompat.GestureDetectorCompatImplBase(paramContext, paramOnGestureListener, paramHandler);
  }
  
  public boolean isLongpressEnabled()
  {
    return this.mImpl.isLongpressEnabled();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.mImpl.onTouchEvent(paramMotionEvent);
  }
  
  public void setIsLongpressEnabled(boolean paramBoolean)
  {
    this.mImpl.setIsLongpressEnabled(paramBoolean);
  }
  
  public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    this.mImpl.setOnDoubleTapListener(paramOnDoubleTapListener);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\GestureDetectorCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */