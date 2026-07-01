package com.umeng.newxp.common.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class d
{
  public static final int a = 2;
  public static final int b = 1;
  public static final int c = 0;
  private static final Object f = new Object();
  private final Object d = new Object();
  private File e;
  private HashMap<File, d.a> g = new HashMap();
  
  public d(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      this.e = new File(paramString);
      return;
    }
    throw new RuntimeException("Directory can not be empty");
  }
  
  private File a(File paramFile, String paramString)
  {
    if (paramString.indexOf(File.separatorChar) < 0) {
      return new File(paramFile, paramString);
    }
    throw new IllegalArgumentException("File " + paramString + " contains a path separator");
  }
  
  private File a(String paramString)
  {
    return a(b(), paramString + ".xml");
  }
  
  private File b()
  {
    synchronized (this.d)
    {
      File localFile = this.e;
      return localFile;
    }
  }
  
  private static File b(File paramFile)
  {
    return new File(paramFile.getPath() + ".bak");
  }
  
  public b a(String arg1, int paramInt)
  {
    localFile = a(???);
    synchronized (f)
    {
      d.a locala = (d.a)this.g.get(localFile);
      if ((locala != null) && (!locala.d())) {
        return locala;
      }
      ??? = b(localFile);
      if (???.exists())
      {
        localFile.delete();
        ???.renameTo(localFile);
      }
      if (localFile.exists()) {
        localFile.canRead();
      }
      Object localObject6 = null;
      Object localObject7 = null;
      Object localObject8 = null;
      Object localObject1 = null;
      ??? = (String)localObject1;
      if (localFile.exists())
      {
        ??? = (String)localObject1;
        if (localFile.canRead())
        {
          localObject1 = localObject6;
          localObject4 = localObject7;
          localObject5 = localObject8;
        }
      }
      try
      {
        FileInputStream localFileInputStream = new FileInputStream(localFile);
        localObject1 = localObject6;
        localObject4 = localObject7;
        localObject5 = localObject8;
        ??? = e.a(localFileInputStream);
        localObject1 = ???;
        localObject4 = ???;
        localObject5 = ???;
        localFileInputStream.close();
      }
      catch (XmlPullParserException ???)
      {
        for (;;)
        {
          try
          {
            ??? = new FileInputStream(localFile);
            localObject4 = new byte[???.available()];
            ???.read((byte[])localObject4);
            new String((byte[])localObject4, 0, localObject4.length, "UTF-8");
            ??? = (String)localObject2;
          }
          catch (FileNotFoundException ???)
          {
            ???.printStackTrace();
            ??? = (String)localObject2;
          }
          catch (IOException ???)
          {
            ???.printStackTrace();
            ??? = (String)localObject2;
          }
          continue;
          localObject4 = (d.a)this.g.get(localFile);
          Object localObject3 = localObject4;
          if (localObject4 == null)
          {
            localObject3 = new d.a(localFile, paramInt, ???);
            this.g.put(localFile, localObject3);
          }
        }
      }
      catch (IOException ???)
      {
        for (;;)
        {
          ??? = (String)localObject4;
        }
      }
      catch (FileNotFoundException ???)
      {
        for (;;)
        {
          ??? = (String)localObject5;
        }
      }
      localObject5 = f;
      if (locala != null) {
        try
        {
          locala.a(???);
          localObject1 = locala;
          return (b)localObject1;
        }
        finally {}
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\persistence\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */