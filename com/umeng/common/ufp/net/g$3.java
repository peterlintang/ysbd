package com.umeng.common.ufp.net;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

final class g$3
  extends g.d
{
  g$3(Context paramContext, String paramString, File paramFile, g.c paramc)
  {
    super(paramContext, paramString, paramFile);
  }
  
  public final void a(Drawable paramDrawable)
  {
    this.a.a(paramDrawable);
  }
  
  protected final void onPreExecute()
  {
    super.onPreExecute();
    if (this.a != null)
    {
      if (1 == this.h) {
        this.a.a(g.b.a);
      }
    }
    else {
      return;
    }
    this.a.a(g.b.b);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\g$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */