package com.umeng.socialize.media;

import com.umeng.socom.b.g;
import java.io.File;
import java.io.IOException;

class b
  implements Runnable
{
  b(UMImage paramUMImage, byte[] paramArrayOfByte) {}
  
  public void run()
  {
    try
    {
      File localFile = UMImage.a(this.a, g.a(new String(this.b)));
      localFile = UMImage.a(this.b, localFile);
      UMImage.a(this.a, localFile);
      UMImage.a(this.a, UMImage.a.a);
      return;
    }
    catch (IOException localIOException)
    {
      UMImage.a();
      new StringBuilder("Sorry cannot setImage..[").append(localIOException.toString()).append("]").toString();
      return;
    }
    finally
    {
      UMImage.a(this.a, null);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */