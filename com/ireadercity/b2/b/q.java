package com.ireadercity.b2.b;

import android.os.Environment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class q
{
  public static String a(String paramString)
  {
    byte[] arrayOfByte2 = new byte['Ѐ'];
    localObject1 = arrayOfByte2;
    byte[] arrayOfByte1;
    if (!b())
    {
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
    }
    try
    {
      Object localObject2 = new File(paramString);
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      if (!((File)localObject2).exists())
      {
        localObject1 = arrayOfByte2;
        arrayOfByte1 = arrayOfByte2;
        a(paramString, t.a("100"));
      }
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      localObject2 = new FileInputStream((File)localObject2);
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      for (int i = ((FileInputStream)localObject2).read(arrayOfByte2, 0, 1024); i != -1; i = ((FileInputStream)localObject2).read(arrayOfByte2, 0, 1024))
      {
        localObject1 = arrayOfByte2;
        arrayOfByte1 = arrayOfByte2;
        localByteArrayOutputStream.write(arrayOfByte2, 0, i);
        localObject1 = arrayOfByte2;
        arrayOfByte1 = arrayOfByte2;
      }
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      arrayOfByte2 = localByteArrayOutputStream.toByteArray();
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      ((FileInputStream)localObject2).close();
      localObject1 = arrayOfByte2;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;)
      {
        new File(paramString);
        localFileNotFoundException.printStackTrace();
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        localObject1 = localFileNotFoundException;
      }
    }
    return new String((byte[])localObject1);
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if ((a()) && (!b())) {}
    try
    {
      Object localObject = new File(paramString1);
      if (!((File)localObject).getParentFile().exists()) {
        ((File)localObject).getParentFile().mkdirs();
      }
      localObject = new FileOutputStream((File)localObject);
      ((FileOutputStream)localObject).write(paramString2.getBytes("utf-8"));
      ((FileOutputStream)localObject).close();
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      try
      {
        paramString1 = new FileOutputStream(new File(paramString1));
        paramString1.write(paramString2.getBytes("utf-8"));
        paramString1.close();
        localFileNotFoundException.printStackTrace();
        return;
      }
      catch (FileNotFoundException paramString1)
      {
        for (;;)
        {
          paramString1.printStackTrace();
        }
      }
      catch (UnsupportedEncodingException paramString1)
      {
        for (;;)
        {
          paramString1.printStackTrace();
        }
      }
      catch (IOException paramString1)
      {
        for (;;)
        {
          paramString1.printStackTrace();
        }
      }
    }
    catch (IOException paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public static boolean a()
  {
    boolean bool = false;
    if ("mounted".equals(Environment.getExternalStorageState())) {
      bool = true;
    }
    return bool;
  }
  
  public static String b(String paramString)
  {
    byte[] arrayOfByte2 = new byte['Ѐ'];
    localObject1 = arrayOfByte2;
    byte[] arrayOfByte1;
    if (!b())
    {
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
    }
    try
    {
      Object localObject2 = new File(paramString);
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      if (!((File)localObject2).exists())
      {
        localObject1 = arrayOfByte2;
        arrayOfByte1 = arrayOfByte2;
        a(paramString, "100");
      }
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      localObject2 = new FileInputStream((File)localObject2);
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      for (int i = ((FileInputStream)localObject2).read(arrayOfByte2, 0, 1024); i != -1; i = ((FileInputStream)localObject2).read(arrayOfByte2, 0, 1024))
      {
        localObject1 = arrayOfByte2;
        arrayOfByte1 = arrayOfByte2;
        localByteArrayOutputStream.write(arrayOfByte2, 0, i);
        localObject1 = arrayOfByte2;
        arrayOfByte1 = arrayOfByte2;
      }
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      arrayOfByte2 = localByteArrayOutputStream.toByteArray();
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      ((FileInputStream)localObject2).close();
      localObject1 = arrayOfByte2;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;)
      {
        new File(paramString);
        localFileNotFoundException.printStackTrace();
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        localObject1 = localFileNotFoundException;
      }
    }
    return new String((byte[])localObject1);
  }
  
  public static boolean b()
  {
    boolean bool = false;
    if ("mounted_ro".equals(Environment.getExternalStorageState())) {
      bool = true;
    }
    return bool;
  }
  
  public static String c(String paramString)
  {
    byte[] arrayOfByte2 = new byte['Ѐ'];
    localObject1 = arrayOfByte2;
    byte[] arrayOfByte1;
    if (!b())
    {
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
    }
    try
    {
      Object localObject2 = new File(paramString);
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      if (!((File)localObject2).exists())
      {
        localObject1 = arrayOfByte2;
        arrayOfByte1 = arrayOfByte2;
        a(paramString, "99");
      }
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      localObject2 = new FileInputStream((File)localObject2);
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      for (int i = ((FileInputStream)localObject2).read(arrayOfByte2, 0, 1024); i != -1; i = ((FileInputStream)localObject2).read(arrayOfByte2, 0, 1024))
      {
        localObject1 = arrayOfByte2;
        arrayOfByte1 = arrayOfByte2;
        localByteArrayOutputStream.write(arrayOfByte2, 0, i);
        localObject1 = arrayOfByte2;
        arrayOfByte1 = arrayOfByte2;
      }
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      arrayOfByte2 = localByteArrayOutputStream.toByteArray();
      localObject1 = arrayOfByte2;
      arrayOfByte1 = arrayOfByte2;
      ((FileInputStream)localObject2).close();
      localObject1 = arrayOfByte2;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;)
      {
        new File(paramString);
        localFileNotFoundException.printStackTrace();
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        localObject1 = localFileNotFoundException;
      }
    }
    return new String((byte[])localObject1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */