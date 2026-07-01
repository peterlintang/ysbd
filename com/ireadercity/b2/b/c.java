package com.ireadercity.b2.b;

import android.content.Context;
import com.ireadercity.b2.bean.NetBookInfo;
import com.ireadercity.b2.h.y;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class c
{
  public static List<com.ireadercity.b2.bean.b> a(Context paramContext, boolean paramBoolean)
  {
    com.ireadercity.b2.c.a locala = com.ireadercity.b2.c.a.a(paramContext);
    Object localObject1 = new ArrayList();
    if (!paramBoolean) {
      return locala.a(com.ireadercity.b2.h.b.a(paramContext));
    }
    locala.a();
    File[] arrayOfFile = new File(com.ireadercity.b2.a.l).listFiles();
    if (arrayOfFile == null) {
      return (List<com.ireadercity.b2.bean.b>)localObject1;
    }
    int j = 0;
    String str1;
    String str2;
    int i;
    label203:
    Object localObject2;
    Object localObject3;
    if (j < arrayOfFile.length)
    {
      str1 = arrayOfFile[j].getName().toLowerCase();
      new StringBuilder("files[i].getPath()=").append(arrayOfFile[j].getPath()).toString();
      if ((!arrayOfFile[j].isDirectory()) && ((str1.endsWith("epub")) || (str1.endsWith("txt")) || (str1.endsWith("ylpdf")) || (str1.endsWith("pdf"))))
      {
        str2 = str1.substring(0, str1.lastIndexOf("."));
        if (!locala.f(arrayOfFile[j].getPath()))
        {
          i = 0;
          localObject1 = "";
          if (!str1.endsWith("epub")) {
            break label512;
          }
          i = 0;
          localObject1 = "epub";
          localObject2 = new File(com.ireadercity.b2.a.o + "/" + str1 + ".pngx");
          if (((File)localObject2).exists()) {
            break label730;
          }
          localObject3 = y.k(arrayOfFile[j].getPath());
          if (localObject3 == null) {
            break label730;
          }
          localObject2 = new File((String)localObject3);
        }
      }
    }
    label320:
    label512:
    label730:
    for (;;)
    {
      if (((File)localObject2).exists())
      {
        locala.a(arrayOfFile[j].getPath(), str2, "", "", "", ((File)localObject2).getPath(), "", "", i, (String)localObject1);
        new StringBuilder("i=").append(j).append(" insertBook=").append(str2).append(" fileName=").append(str1).append(" files[i].getPath()=").append(arrayOfFile[j].getPath()).toString();
        new StringBuilder("coverPath=").append(localObject2).toString();
        localObject1 = new NetBookInfo();
        ((NetBookInfo)localObject1).k(arrayOfFile[j].getPath());
        localObject2 = locala.b(arrayOfFile[j].getPath());
        new StringBuilder("savedBook=").append(localObject2).append(" netBookInfo=").append(localObject1).toString();
        if (localObject2 == null) {}
      }
      try
      {
        locala.a(((com.ireadercity.b2.bean.b)localObject2).j(), ((NetBookInfo)localObject1).e(), ((NetBookInfo)localObject1).f(), ((NetBookInfo)localObject1).g(), "", ((com.ireadercity.b2.bean.b)localObject2).r(), "", "", ((com.ireadercity.b2.bean.b)localObject2).u(), ((com.ireadercity.b2.bean.b)localObject2).h());
        j += 1;
        break;
        if (str1.endsWith("txt"))
        {
          i = 0;
          localObject1 = "txt";
          break label203;
        }
        if (!str1.endsWith("pdf")) {
          break label203;
        }
        i = 1;
        localObject1 = "pdf";
        break label203;
        localObject2 = new File(com.ireadercity.b2.a.o + "/" + str1 + ".png");
        if (((File)localObject2).exists())
        {
          localObject3 = new File(com.ireadercity.b2.a.o + "/" + str1 + ".pngx");
          ((File)localObject2).renameTo((File)localObject3);
          locala.a(arrayOfFile[j].getPath(), str2, "", "", "", ((File)localObject3).getPath(), "", "", i, (String)localObject1);
          break label320;
        }
        locala.a(arrayOfFile[j].getPath(), str2, "", "", "", "", "", "", i, (String)localObject1);
        break label320;
        return locala.a(com.ireadercity.b2.h.b.a(paramContext));
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */