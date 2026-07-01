package android.support.v4.view;

import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;

abstract interface GestureDetectorCompat$GestureDetectorCompatImpl
{
  public abstract boolean isLongpressEnabled();
  
  public abstract boolean onTouchEvent(MotionEvent paramMotionEvent);
  
  public abstract void setIsLongpressEnabled(boolean paramBoolean);
  
  public abstract void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\GestureDetectorCompat$GestureDetectorCompatImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */