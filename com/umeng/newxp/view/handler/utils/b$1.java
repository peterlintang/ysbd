package com.umeng.newxp.view.handler.utils;

import android.graphics.drawable.BitmapDrawable;
import android.support.v4.util.LruCache;
import com.umeng.newxp.view.widget.RecyclingBitmapDrawable;
import java.lang.ref.SoftReference;
import java.util.HashSet;

class b$1
  extends LruCache<String, BitmapDrawable>
{
  b$1(b paramb, int paramInt)
  {
    super(paramInt);
  }
  
  protected int a(String paramString, BitmapDrawable paramBitmapDrawable)
  {
    int j = b.a(paramBitmapDrawable) / 1024;
    int i = j;
    if (j == 0) {
      i = 1;
    }
    return i;
  }
  
  protected void a(boolean paramBoolean, String paramString, BitmapDrawable paramBitmapDrawable1, BitmapDrawable paramBitmapDrawable2)
  {
    if (RecyclingBitmapDrawable.class.isInstance(paramBitmapDrawable1)) {
      ((RecyclingBitmapDrawable)paramBitmapDrawable1).b(false);
    }
    while (!f.d()) {
      return;
    }
    b.a(this.a).add(new SoftReference(paramBitmapDrawable1.getBitmap()));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\b$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */