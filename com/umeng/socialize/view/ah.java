package com.umeng.socialize.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import com.umeng.socialize.view.wigets.SearchBox;

class ah
  implements View.OnTouchListener
{
  ah(ab paramab, SearchBox paramSearchBox, InputMethodManager paramInputMethodManager) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    this.b.setInputType(1);
    this.c.showSoftInputFromInputMethod(ab.i(this.a).getWindowToken(), 0);
    this.b.setOnTouchListener(null);
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */