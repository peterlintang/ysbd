package com.ireadercity.b2.h;

import com.ireadercity.b2.d.a;
import com.youloft.natize.NativeUnzipUtils;
import java.io.File;

public final class x
{
  public static void a(String paramString1, String paramString2)
  {
    for (;;)
    {
      File localFile;
      try
      {
        long l = System.currentTimeMillis();
        localFile = new File(paramString2);
        if (!localFile.exists()) {
          localFile.mkdirs();
        }
        switch (NativeUnzipUtils.upZipFile(paramString1, paramString2))
        {
        case 0: 
          new StringBuilder().append(System.currentTimeMillis() - l).append(" time take for unzip a file================================================").toString();
          return;
        }
      }
      finally {}
      s.a(localFile);
      new StringBuilder("===========> Unzip file failed !!!!!!!!!!!!! file:").append(paramString1).toString();
      throw new a((byte)0);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */