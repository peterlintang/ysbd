package android.support.v4.print;

import android.graphics.Bitmap;
import android.net.Uri;

abstract interface PrintHelper$PrintHelperVersionImpl
{
  public abstract int getColorMode();
  
  public abstract int getScaleMode();
  
  public abstract void printBitmap(String paramString, Bitmap paramBitmap);
  
  public abstract void printBitmap(String paramString, Uri paramUri);
  
  public abstract void setColorMode(int paramInt);
  
  public abstract void setScaleMode(int paramInt);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\print\PrintHelper$PrintHelperVersionImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */