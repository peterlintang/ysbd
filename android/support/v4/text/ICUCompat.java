package android.support.v4.text;

import android.os.Build.VERSION;

public class ICUCompat
{
  private static final ICUCompat.ICUCompatImpl IMPL = new ICUCompat.ICUCompatImplBase();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      IMPL = new ICUCompat.ICUCompatImplIcs();
      return;
    }
  }
  
  public static String addLikelySubtags(String paramString)
  {
    return IMPL.addLikelySubtags(paramString);
  }
  
  public static String getScript(String paramString)
  {
    return IMPL.getScript(paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\text\ICUCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */