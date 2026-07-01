package com.umeng.newxp.view.handler.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

class e$a
  extends BitmapDrawable
{
  private final WeakReference<e.b> a;
  
  public e$a(Resources paramResources, Bitmap paramBitmap, e.b paramb)
  {
    super(paramResources, paramBitmap);
    this.a = new WeakReference(paramb);
  }
  
  public e.b a()
  {
    return (e.b)this.a.get();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\e$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */