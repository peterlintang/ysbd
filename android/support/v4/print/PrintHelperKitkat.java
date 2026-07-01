package android.support.v4.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.print.PrintAttributes;
import android.print.PrintAttributes.Builder;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintManager;

public class PrintHelperKitkat
{
  public static final int COLOR_MODE_COLOR = 2;
  public static final int COLOR_MODE_MONOCHROME = 1;
  private static final String LOG_TAG = "PrintHelperKitkat";
  private static final int MAX_PRINT_SIZE = 3500;
  public static final int SCALE_MODE_FILL = 2;
  public static final int SCALE_MODE_FIT = 1;
  int mColorMode = 2;
  final Context mContext;
  int mScaleMode = 2;
  
  PrintHelperKitkat(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  /* Error */
  private Bitmap loadBitmap(Uri paramUri, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: ifnull +10 -> 13
    //   6: aload_0
    //   7: getfield 32	android/support/v4/print/PrintHelperKitkat:mContext	Landroid/content/Context;
    //   10: ifnonnull +13 -> 23
    //   13: new 39	java/lang/IllegalArgumentException
    //   16: dup
    //   17: ldc 41
    //   19: invokespecial 44	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   22: athrow
    //   23: aload_0
    //   24: getfield 32	android/support/v4/print/PrintHelperKitkat:mContext	Landroid/content/Context;
    //   27: invokevirtual 50	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   30: aload_1
    //   31: invokevirtual 56	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   34: astore_1
    //   35: aload_1
    //   36: astore_3
    //   37: aload_1
    //   38: aconst_null
    //   39: aload_2
    //   40: invokestatic 62	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   43: astore_2
    //   44: aload_1
    //   45: ifnull +7 -> 52
    //   48: aload_1
    //   49: invokevirtual 67	java/io/InputStream:close	()V
    //   52: aload_2
    //   53: areturn
    //   54: astore_1
    //   55: aload_3
    //   56: ifnull +7 -> 63
    //   59: aload_3
    //   60: invokevirtual 67	java/io/InputStream:close	()V
    //   63: aload_1
    //   64: athrow
    //   65: astore_1
    //   66: aload_2
    //   67: areturn
    //   68: astore_2
    //   69: goto -6 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	PrintHelperKitkat
    //   0	72	1	paramUri	Uri
    //   0	72	2	paramOptions	BitmapFactory.Options
    //   1	59	3	localUri	Uri
    // Exception table:
    //   from	to	target	type
    //   23	35	54	finally
    //   37	44	54	finally
    //   48	52	65	java/io/IOException
    //   59	63	68	java/io/IOException
  }
  
  private Bitmap loadConstrainedBitmap(Uri paramUri, int paramInt)
  {
    if ((paramInt <= 0) || (paramUri == null) || (this.mContext == null)) {
      throw new IllegalArgumentException("bad argument to getScaledBitmap");
    }
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    loadBitmap(paramUri, localOptions);
    int k = localOptions.outWidth;
    int m = localOptions.outHeight;
    if ((k <= 0) || (m <= 0)) {}
    int i;
    do
    {
      return null;
      int j = Math.max(k, m);
      i = 1;
      while (j > paramInt)
      {
        j >>>= 1;
        i <<= 1;
      }
    } while ((i <= 0) || (Math.min(k, m) / i <= 0));
    localOptions = new BitmapFactory.Options();
    localOptions.inMutable = true;
    localOptions.inSampleSize = i;
    return loadBitmap(paramUri, localOptions);
  }
  
  public int getColorMode()
  {
    return this.mColorMode;
  }
  
  public int getScaleMode()
  {
    return this.mScaleMode;
  }
  
  public void printBitmap(String paramString, Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return;
    }
    int i = this.mScaleMode;
    PrintManager localPrintManager = (PrintManager)this.mContext.getSystemService("print");
    Object localObject = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
    if (paramBitmap.getWidth() > paramBitmap.getHeight()) {
      localObject = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
    }
    localObject = new PrintAttributes.Builder().setMediaSize((PrintAttributes.MediaSize)localObject).setColorMode(this.mColorMode).build();
    localPrintManager.print(paramString, new PrintHelperKitkat.1(this, paramString, paramBitmap, i), (PrintAttributes)localObject);
  }
  
  public void printBitmap(String paramString, Uri paramUri)
  {
    printBitmap(paramString, loadConstrainedBitmap(paramUri, 3500));
  }
  
  public void setColorMode(int paramInt)
  {
    this.mColorMode = paramInt;
  }
  
  public void setScaleMode(int paramInt)
  {
    this.mScaleMode = paramInt;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\print\PrintHelperKitkat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */