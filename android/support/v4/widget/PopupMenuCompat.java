package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View.OnTouchListener;

public class PopupMenuCompat
{
  static final PopupMenuCompat.PopupMenuImpl IMPL = new PopupMenuCompat.BasePopupMenuImpl();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      IMPL = new PopupMenuCompat.KitKatPopupMenuImpl();
      return;
    }
  }
  
  public static View.OnTouchListener getDragToOpenListener(Object paramObject)
  {
    return IMPL.getDragToOpenListener(paramObject);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\PopupMenuCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */