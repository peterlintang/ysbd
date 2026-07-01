package com.taobao.munion.utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class h
{
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = b(paramContext, paramString1, paramString2);
    if (paramContext != null) {
      return new String(paramContext);
    }
    return null;
  }
  
  public static void a(File paramFile)
  {
    if ((paramFile != null) && (paramFile.exists()))
    {
      if (!paramFile.isFile()) {
        break label29;
      }
      paramFile.delete();
    }
    for (;;)
    {
      paramFile.delete();
      return;
      label29:
      if (paramFile.isDirectory())
      {
        File[] arrayOfFile = paramFile.listFiles();
        int i = 0;
        while (i < arrayOfFile.length)
        {
          a(arrayOfFile[i]);
          i += 1;
        }
      }
    }
  }
  
  public static boolean a()
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    boolean bool = false;
    paramContext = paramContext.getDir(paramString1, 0);
    if (paramContext != null) {
      bool = a(paramContext, paramString2, paramArrayOfByte);
    }
    return bool;
  }
  
  public static boolean a(File paramFile, String paramString, byte[] paramArrayOfByte)
  {
    File localFile = new File(paramFile, paramString);
    paramString = null;
    for (;;)
    {
      try
      {
        if (!localFile.exists()) {
          localFile.createNewFile();
        }
        paramFile = new RandomAccessFile(localFile, "rw");
        paramFile.printStackTrace();
      }
      catch (FileNotFoundException paramFile)
      {
        try
        {
          paramFile.seek(localFile.length());
          paramFile.write(paramArrayOfByte);
          paramFile.close();
          return true;
        }
        catch (IOException paramArrayOfByte)
        {
          for (;;)
          {
            paramString = paramFile;
            paramFile = paramArrayOfByte;
          }
        }
        paramFile = paramFile;
        paramFile.printStackTrace();
        return false;
      }
      catch (IOException paramFile) {}
      if (paramString != null) {
        try
        {
          paramString.close();
        }
        catch (IOException paramFile)
        {
          paramFile.printStackTrace();
        }
      }
    }
  }
  
  public static byte[] a(File paramFile, String paramString)
  {
    try
    {
      paramFile = new File(paramFile, paramString);
      if (!paramFile.exists()) {
        paramFile.createNewFile();
      }
      paramFile = a(new FileInputStream(paramFile));
      return paramFile;
    }
    catch (FileNotFoundException paramFile)
    {
      paramFile.printStackTrace();
      return null;
    }
    catch (IOException paramFile)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public static byte[] a(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 107	java/io/BufferedInputStream
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 110	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   14: astore_0
    //   15: aload_0
    //   16: invokevirtual 114	java/io/BufferedInputStream:available	()I
    //   19: newarray <illegal type>
    //   21: astore_1
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual 118	java/io/BufferedInputStream:read	([B)I
    //   27: pop
    //   28: aload_0
    //   29: invokevirtual 119	java/io/BufferedInputStream:close	()V
    //   32: aload_1
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: invokevirtual 97	java/io/IOException:printStackTrace	()V
    //   39: aload_0
    //   40: invokevirtual 119	java/io/BufferedInputStream:close	()V
    //   43: aconst_null
    //   44: areturn
    //   45: astore_0
    //   46: aload_0
    //   47: invokevirtual 97	java/io/IOException:printStackTrace	()V
    //   50: aconst_null
    //   51: areturn
    //   52: astore_1
    //   53: aload_0
    //   54: invokevirtual 119	java/io/BufferedInputStream:close	()V
    //   57: aload_1
    //   58: athrow
    //   59: astore_0
    //   60: aload_0
    //   61: invokevirtual 97	java/io/IOException:printStackTrace	()V
    //   64: goto -7 -> 57
    //   67: astore_0
    //   68: aload_0
    //   69: invokevirtual 97	java/io/IOException:printStackTrace	()V
    //   72: goto -40 -> 32
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	paramInputStream	java.io.InputStream
    //   21	12	1	arrayOfByte	byte[]
    //   34	2	1	localIOException	IOException
    //   52	6	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   15	28	34	java/io/IOException
    //   39	43	45	java/io/IOException
    //   15	28	52	finally
    //   35	39	52	finally
    //   53	57	59	java/io/IOException
    //   28	32	67	java/io/IOException
  }
  
  public static byte[] b(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = paramContext.getDir(paramString1, 0);
    if (paramContext != null) {
      return a(paramContext, paramString2);
    }
    return null;
  }
  
  public static void c(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = paramContext.getDir(paramString1, 0);
    if (paramContext != null) {
      a(new File(paramContext, paramString2));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */