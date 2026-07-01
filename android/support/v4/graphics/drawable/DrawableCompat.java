package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public class DrawableCompat
{
  static final DrawableCompat.DrawableImpl IMPL = new DrawableCompat.BaseDrawableImpl();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 19)
    {
      IMPL = new DrawableCompat.KitKatDrawableImpl();
      return;
    }
    if (i >= 11)
    {
      IMPL = new DrawableCompat.HoneycombDrawableImpl();
      return;
    }
  }
  
  public static boolean isAutoMirrored(Drawable paramDrawable)
  {
    return IMPL.isAutoMirrored(paramDrawable);
  }
  
  public static void jumpToCurrentState(Drawable paramDrawable)
  {
    IMPL.jumpToCurrentState(paramDrawable);
  }
  
  public static void setAutoMirrored(Drawable paramDrawable, boolean paramBoolean)
  {
    IMPL.setAutoMirrored(paramDrawable, paramBoolean);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\graphics\drawable\DrawableCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */