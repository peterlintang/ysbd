package com.ireadercity.b2.e;

import java.io.File;

final class c
  implements Runnable
{
  c(a parama) {}
  
  public final void run()
  {
    File localFile = new File(com.ireadercity.b2.a.l);
    File[] arrayOfFile = localFile.listFiles();
    if (arrayOfFile == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < arrayOfFile.length)
      {
        String str = arrayOfFile[i].getName().toLowerCase();
        a.f();
        new StringBuilder("files[i].getPath()=").append(arrayOfFile[i].getPath()).toString();
        if ((!arrayOfFile[i].isDirectory()) && (str.endsWith(".tmp")))
        {
          localFile.delete();
          a.f();
          new StringBuilder("delete tmp file ").append(arrayOfFile[i].getPath()).toString();
        }
        i += 1;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */