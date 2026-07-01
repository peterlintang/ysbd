package android.support.v4.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;

public final class PrintHelper
{
  public static final int COLOR_MODE_COLOR = 2;
  public static final int COLOR_MODE_MONOCHROME = 1;
  public static final int SCALE_MODE_FILL = 2;
  public static final int SCALE_MODE_FIT = 1;
  PrintHelper.PrintHelperVersionImpl mImpl;
  
  public PrintHelper(Context paramContext)
  {
    if (systemSupportsPrint())
    {
      this.mImpl = new PrintHelper.PrintHelperKitkatImpl(paramContext);
      return;
    }
    this.mImpl = new PrintHelper.PrintHelperStubImpl(null);
  }
  
  public static boolean systemSupportsPrint()
  {
    return Build.VERSION.SDK_INT >= 19;
  }
  
  public final int getColorMode()
  {
    return this.mImpl.getColorMode();
  }
  
  public final int getScaleMode()
  {
    return this.mImpl.getScaleMode();
  }
  
  public final void printBitmap(String paramString, Bitmap paramBitmap)
  {
    this.mImpl.printBitmap(paramString, paramBitmap);
  }
  
  public final void printBitmap(String paramString, Uri paramUri)
  {
    this.mImpl.printBitmap(paramString, paramUri);
  }
  
  public final void setColorMode(int paramInt)
  {
    this.mImpl.setColorMode(paramInt);
  }
  
  public final void setScaleMode(int paramInt)
  {
    this.mImpl.setScaleMode(paramInt);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\print\PrintHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */