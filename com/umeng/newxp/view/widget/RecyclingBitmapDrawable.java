package com.umeng.newxp.view.widget;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public class RecyclingBitmapDrawable
  extends BitmapDrawable
{
  static final String a = "CountingBitmapDrawable";
  private int b = 0;
  private int c = 0;
  private boolean d;
  
  public RecyclingBitmapDrawable(Resources paramResources, Bitmap paramBitmap)
  {
    super(paramResources, paramBitmap);
  }
  
  private void a()
  {
    try
    {
      if ((this.b <= 0) && (this.c <= 0) && (this.d) && (b())) {
        getBitmap().recycle();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  private boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 32	com/umeng/newxp/view/widget/RecyclingBitmapDrawable:getBitmap	()Landroid/graphics/Bitmap;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +18 -> 26
    //   11: aload_2
    //   12: invokevirtual 40	android/graphics/Bitmap:isRecycled	()Z
    //   15: istore_1
    //   16: iload_1
    //   17: ifne +9 -> 26
    //   20: iconst_1
    //   21: istore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: iload_1
    //   25: ireturn
    //   26: iconst_0
    //   27: istore_1
    //   28: goto -6 -> 22
    //   31: astore_2
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_2
    //   35: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	RecyclingBitmapDrawable
    //   15	13	1	bool	boolean
    //   6	6	2	localBitmap	Bitmap
    //   31	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	31	finally
    //   11	16	31	finally
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        this.c += 1;
        this.d = true;
        a();
        return;
      }
      finally {}
      this.c -= 1;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        this.b += 1;
        a();
        return;
      }
      finally {}
      this.b -= 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\RecyclingBitmapDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */