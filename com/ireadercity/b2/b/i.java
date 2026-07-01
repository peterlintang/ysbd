package com.ireadercity.b2.b;

import android.graphics.Bitmap;
import android.widget.ImageView;

final class i
  implements Runnable
{
  Bitmap a;
  ImageView b;
  
  public i(g paramg, Bitmap paramBitmap, ImageView paramImageView)
  {
    this.a = paramBitmap;
    this.b = paramImageView;
  }
  
  public final void run()
  {
    if (this.a != null)
    {
      g localg = this.c;
      g.a(this.a, this.b);
      return;
    }
    this.b.setImageBitmap(g.a(this.b.getContext()));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */