package com.umeng.common.ufp.net;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.ImageView;
import java.io.File;

final class g$2
  extends g.d
{
  g$2(Context paramContext1, String paramString1, File paramFile, g.a parama, Context paramContext2, ImageView paramImageView, boolean paramBoolean1, Animation paramAnimation, boolean paramBoolean2, String paramString2)
  {
    super(paramContext1, paramString1, paramFile);
  }
  
  public final void a(Drawable paramDrawable)
  {
    g.a(this.b, this.c, paramDrawable, this.d, this.a, this.e, this.f, this.g);
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\g$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */