package com.ireadercity.b2.e;

import java.io.File;

final class b
  implements Runnable
{
  b(a parama, String paramString) {}
  
  public final void run()
  {
    File localFile = new File(com.ireadercity.b2.a.l + "/" + this.a);
    if (localFile.exists()) {
      localFile.delete();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */