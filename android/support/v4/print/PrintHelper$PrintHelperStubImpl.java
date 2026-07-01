package android.support.v4.print;

import android.graphics.Bitmap;
import android.net.Uri;

final class PrintHelper$PrintHelperStubImpl
  implements PrintHelper.PrintHelperVersionImpl
{
  int mColorMode = 2;
  int mScaleMode = 2;
  
  public final int getColorMode()
  {
    return this.mColorMode;
  }
  
  public final int getScaleMode()
  {
    return this.mScaleMode;
  }
  
  public final void printBitmap(String paramString, Bitmap paramBitmap) {}
  
  public final void printBitmap(String paramString, Uri paramUri) {}
  
  public final void setColorMode(int paramInt)
  {
    this.mColorMode = paramInt;
  }
  
  public final void setScaleMode(int paramInt)
  {
    this.mScaleMode = paramInt;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\print\PrintHelper$PrintHelperStubImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */