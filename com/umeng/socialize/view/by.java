package com.umeng.socialize.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.media.UMediaObject.a;

class by
  implements UMediaObject.a
{
  by(ShareActivity paramShareActivity, ProgressBar paramProgressBar, int paramInt) {}
  
  private void a(int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
      Bitmap localBitmap = Bitmap.createScaledBitmap(paramArrayOfByte, 150, 150, true);
      this.a.a.setImageBitmap(localBitmap);
      paramArrayOfByte.recycle();
      this.a.a.setVisibility(0);
      ShareActivity.k(this.a).setVisibility(0);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      for (;;)
      {
        this.a.a.setImageResource(paramInt);
      }
    }
  }
  
  public void a()
  {
    this.b.setVisibility(0);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    if (!ShareActivity.j(this.a).isUrlMedia()) {
      if (paramArrayOfByte != null)
      {
        this.a.setImageBytes(paramArrayOfByte);
        a(this.c, paramArrayOfByte);
      }
    }
    for (;;)
    {
      this.b.setVisibility(8);
      return;
      if (paramArrayOfByte != null)
      {
        a(this.c, paramArrayOfByte);
      }
      else
      {
        this.a.a.setImageResource(this.c);
        this.a.a.setVisibility(0);
        ShareActivity.k(this.a).setVisibility(0);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */