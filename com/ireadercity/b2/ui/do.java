package com.ireadercity.b2.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import com.ireadercity.b2.a;
import com.ireadercity.b2.b.r;
import com.ireadercity.b2.curlview.h;
import java.util.List;

final class do
  implements h
{
  private do(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  private Bitmap b(int paramInt)
  {
    Canvas localCanvas;
    try
    {
      if (a.U < 8) {}
      for (Bitmap localBitmap = Bitmap.createBitmap(a.D, a.E, Bitmap.Config.RGB_565);; localBitmap = Bitmap.createBitmap(a.D, a.E, Bitmap.Config.RGB_565))
      {
        localCanvas = new Canvas(localBitmap);
        localBitmap.eraseColor(-1);
        if (BookReadingActivityNew.p(this.a) != null)
        {
          if (BookReadingActivityNew.aa(this.a) == null) {
            break label163;
          }
          if (BookReadingActivityNew.p(this.a).a(this.a, BookReadingActivityNew.B(this.a), localCanvas, paramInt, BookReadingActivityNew.aa(this.a))) {
            break;
          }
          BookReadingActivityNew.ab(this.a);
          if (BookReadingActivityNew.ac(this.a) == 0) {
            BookReadingActivityNew.d(this.a, null);
          }
        }
        return localBitmap;
      }
      BookReadingActivityNew.d(this.a, 0);
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
      a.d();
      return null;
    }
    BookReadingActivityNew.d(this.a, null);
    return localThrowable;
    label163:
    BookReadingActivityNew.p(this.a).a(this.a, BookReadingActivityNew.B(this.a), localCanvas, paramInt, null);
    return localThrowable;
  }
  
  public final int a()
  {
    if (BookReadingActivityNew.p(this.a) != null) {
      return BookReadingActivityNew.p(this.a).b().size();
    }
    return 1;
  }
  
  public final Bitmap a(int paramInt)
  {
    Bitmap localBitmap2 = b(paramInt);
    Bitmap localBitmap1;
    if (localBitmap2 != null)
    {
      localBitmap1 = localBitmap2;
      if (!localBitmap2.isRecycled()) {}
    }
    else
    {
      localBitmap1 = b(paramInt);
    }
    return localBitmap1;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */