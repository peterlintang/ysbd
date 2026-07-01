package android.support.v4.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

final class PrintHelper$PrintHelperKitkatImpl
  implements PrintHelper.PrintHelperVersionImpl
{
  private final PrintHelperKitkat printHelper;
  
  PrintHelper$PrintHelperKitkatImpl(Context paramContext)
  {
    this.printHelper = new PrintHelperKitkat(paramContext);
  }
  
  public final int getColorMode()
  {
    return this.printHelper.getColorMode();
  }
  
  public final int getScaleMode()
  {
    return this.printHelper.getScaleMode();
  }
  
  public final void printBitmap(String paramString, Bitmap paramBitmap)
  {
    this.printHelper.printBitmap(paramString, paramBitmap);
  }
  
  public final void printBitmap(String paramString, Uri paramUri)
  {
    this.printHelper.printBitmap(paramString, paramUri);
  }
  
  public final void setColorMode(int paramInt)
  {
    this.printHelper.setColorMode(paramInt);
  }
  
  public final void setScaleMode(int paramInt)
  {
    this.printHelper.setScaleMode(paramInt);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\print\PrintHelper$PrintHelperKitkatImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */