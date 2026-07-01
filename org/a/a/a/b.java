package org.a.a.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;

public final class b
{
  public static final BigInteger a;
  public static final BigInteger b;
  public static final File[] c = new File[0];
  private static final Charset d = Charset.forName("UTF-8");
  
  static
  {
    BigInteger localBigInteger = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
    a = localBigInteger;
    b = localBigInteger.multiply(BigInteger.valueOf(1152921504606846976L));
  }
  
  public static void a(File paramFile1, File paramFile2)
  {
    if (paramFile1 == null) {
      throw new NullPointerException("Source must not be null");
    }
    if (paramFile2 == null) {
      throw new NullPointerException("Destination must not be null");
    }
    if (!paramFile1.exists()) {
      throw new FileNotFoundException("Source '" + paramFile1 + "' does not exist");
    }
    if (paramFile1.isDirectory()) {
      throw new IOException("Source '" + paramFile1 + "' is a directory");
    }
    if (paramFile2.exists()) {
      throw new a("Destination '" + paramFile2 + "' already exists");
    }
    if (paramFile2.isDirectory()) {
      throw new IOException("Destination '" + paramFile2 + "' is a directory");
    }
    if (!paramFile1.renameTo(paramFile2))
    {
      if (paramFile1 == null) {
        throw new NullPointerException("Source must not be null");
      }
      if (paramFile2 == null) {
        throw new NullPointerException("Destination must not be null");
      }
      if (!paramFile1.exists()) {
        throw new FileNotFoundException("Source '" + paramFile1 + "' does not exist");
      }
      if (paramFile1.isDirectory()) {
        throw new IOException("Source '" + paramFile1 + "' exists but is a directory");
      }
      if (paramFile1.getCanonicalPath().equals(paramFile2.getCanonicalPath())) {
        throw new IOException("Source '" + paramFile1 + "' and destination '" + paramFile2 + "' are the same");
      }
      File localFile = paramFile2.getParentFile();
      if ((localFile != null) && (!localFile.mkdirs()) && (!localFile.isDirectory())) {
        throw new IOException("Destination '" + localFile + "' directory cannot be created");
      }
      if ((paramFile2.exists()) && (!paramFile2.canWrite())) {
        throw new IOException("Destination '" + paramFile2 + "' exists but is read-only");
      }
      b(paramFile1, paramFile2);
      if (!paramFile1.delete())
      {
        a(paramFile2);
        throw new IOException("Failed to delete original file '" + paramFile1 + "' after copy to '" + paramFile2 + "'");
      }
    }
  }
  
  private static boolean a(File paramFile)
  {
    if (paramFile == null) {
      return false;
    }
    try
    {
      if (paramFile.isDirectory()) {
        b(paramFile);
      }
      try
      {
        boolean bool = paramFile.delete();
        return bool;
      }
      catch (Exception paramFile)
      {
        return false;
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private static void b(File paramFile)
  {
    if (!paramFile.exists()) {
      throw new IllegalArgumentException(paramFile + " does not exist");
    }
    if (!paramFile.isDirectory()) {
      throw new IllegalArgumentException(paramFile + " is not a directory");
    }
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null) {
      throw new IOException("Failed to list contents of " + paramFile);
    }
    paramFile = null;
    int k = arrayOfFile.length;
    int j = 0;
    File localFile2;
    if (j < k) {
      localFile2 = arrayOfFile[j];
    }
    for (;;)
    {
      try
      {
        if (localFile2.isDirectory())
        {
          localFile1 = paramFile;
          if (!localFile2.exists()) {
            continue;
          }
          if (localFile2 == null) {
            throw new NullPointerException("File must not be null");
          }
          if (c.a())
          {
            i = 0;
            if (i == 0) {
              b(localFile2);
            }
            localFile1 = paramFile;
            if (localFile2.delete()) {
              continue;
            }
            throw new IOException("Unable to delete directory " + localFile2 + ".");
          }
          if (localFile2.getParent() != null)
          {
            localFile1 = new File(localFile2.getParentFile().getCanonicalFile(), localFile2.getName());
            if (!localFile1.getCanonicalFile().equals(localFile1.getAbsoluteFile())) {
              break label364;
            }
            i = 0;
            continue;
          }
        }
        else
        {
          boolean bool = localFile2.exists();
          localFile1 = paramFile;
          if (localFile2.delete()) {
            continue;
          }
          if (!bool) {
            throw new FileNotFoundException("File does not exist: " + localFile2);
          }
          throw new IOException("Unable to delete file: " + localFile2);
          if (paramFile != null) {
            throw paramFile;
          }
          return;
        }
        File localFile1 = localFile2;
        continue;
      }
      catch (IOException localIOException)
      {
        j += 1;
        paramFile = localIOException;
      }
      label364:
      int i = 1;
    }
  }
  
  /* Error */
  private static void b(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 12
    //   3: aload_1
    //   4: invokevirtual 61	java/io/File:exists	()Z
    //   7: ifeq +39 -> 46
    //   10: aload_1
    //   11: invokevirtual 85	java/io/File:isDirectory	()Z
    //   14: ifeq +32 -> 46
    //   17: new 87	java/io/IOException
    //   20: dup
    //   21: new 65	java/lang/StringBuilder
    //   24: dup
    //   25: ldc 94
    //   27: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   30: aload_1
    //   31: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   34: ldc 103
    //   36: invokevirtual 77	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   42: invokespecial 90	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   45: athrow
    //   46: new 195	java/io/FileInputStream
    //   49: dup
    //   50: aload_0
    //   51: invokespecial 197	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   54: astore 8
    //   56: new 199	java/io/FileOutputStream
    //   59: dup
    //   60: aload_1
    //   61: invokespecial 200	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   64: astore 9
    //   66: aload 8
    //   68: invokevirtual 204	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   71: astore 10
    //   73: aload 9
    //   75: invokevirtual 205	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   78: astore 12
    //   80: aload 10
    //   82: invokevirtual 211	java/nio/channels/FileChannel:size	()J
    //   85: lstore 6
    //   87: lconst_0
    //   88: lstore_2
    //   89: goto +226 -> 315
    //   92: aload 12
    //   94: aload 10
    //   96: lload_2
    //   97: lload 4
    //   99: invokevirtual 215	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   102: lstore 4
    //   104: lload_2
    //   105: lload 4
    //   107: ladd
    //   108: lstore_2
    //   109: goto +206 -> 315
    //   112: lload 6
    //   114: lload_2
    //   115: lsub
    //   116: lstore 4
    //   118: goto -26 -> 92
    //   121: aload 12
    //   123: invokestatic 220	org/a/a/a/d:a	(Ljava/io/Closeable;)V
    //   126: aload 9
    //   128: invokestatic 223	org/a/a/a/d:a	(Ljava/io/OutputStream;)V
    //   131: aload 10
    //   133: invokestatic 220	org/a/a/a/d:a	(Ljava/io/Closeable;)V
    //   136: aload 8
    //   138: invokestatic 226	org/a/a/a/d:a	(Ljava/io/InputStream;)V
    //   141: aload_0
    //   142: invokevirtual 229	java/io/File:length	()J
    //   145: aload_1
    //   146: invokevirtual 229	java/io/File:length	()J
    //   149: lcmp
    //   150: ifeq +75 -> 225
    //   153: new 87	java/io/IOException
    //   156: dup
    //   157: new 65	java/lang/StringBuilder
    //   160: dup
    //   161: ldc -25
    //   163: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   166: aload_0
    //   167: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   170: ldc -23
    //   172: invokevirtual 77	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: aload_1
    //   176: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   179: ldc -113
    //   181: invokevirtual 77	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: invokespecial 90	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   190: athrow
    //   191: astore_0
    //   192: aconst_null
    //   193: astore_1
    //   194: aconst_null
    //   195: astore 8
    //   197: aconst_null
    //   198: astore 9
    //   200: aload 12
    //   202: astore 10
    //   204: aload_1
    //   205: invokestatic 220	org/a/a/a/d:a	(Ljava/io/Closeable;)V
    //   208: aload 8
    //   210: invokestatic 223	org/a/a/a/d:a	(Ljava/io/OutputStream;)V
    //   213: aload 10
    //   215: invokestatic 220	org/a/a/a/d:a	(Ljava/io/Closeable;)V
    //   218: aload 9
    //   220: invokestatic 226	org/a/a/a/d:a	(Ljava/io/InputStream;)V
    //   223: aload_0
    //   224: athrow
    //   225: aload_1
    //   226: aload_0
    //   227: invokevirtual 236	java/io/File:lastModified	()J
    //   230: invokevirtual 240	java/io/File:setLastModified	(J)Z
    //   233: pop
    //   234: return
    //   235: astore_0
    //   236: aconst_null
    //   237: astore_1
    //   238: aconst_null
    //   239: astore 11
    //   241: aload 8
    //   243: astore 9
    //   245: aload 12
    //   247: astore 10
    //   249: aload 11
    //   251: astore 8
    //   253: goto -49 -> 204
    //   256: astore_0
    //   257: aconst_null
    //   258: astore_1
    //   259: aload 8
    //   261: astore 11
    //   263: aload 12
    //   265: astore 10
    //   267: aload 9
    //   269: astore 8
    //   271: aload 11
    //   273: astore 9
    //   275: goto -71 -> 204
    //   278: astore_0
    //   279: aload 8
    //   281: astore 11
    //   283: aconst_null
    //   284: astore_1
    //   285: aload 9
    //   287: astore 8
    //   289: aload 11
    //   291: astore 9
    //   293: goto -89 -> 204
    //   296: astore_0
    //   297: aload 8
    //   299: astore 11
    //   301: aload 12
    //   303: astore_1
    //   304: aload 9
    //   306: astore 8
    //   308: aload 11
    //   310: astore 9
    //   312: goto -108 -> 204
    //   315: lload_2
    //   316: lload 6
    //   318: lcmp
    //   319: ifge -198 -> 121
    //   322: lload 6
    //   324: lload_2
    //   325: lsub
    //   326: ldc2_w 241
    //   329: lcmp
    //   330: ifle -218 -> 112
    //   333: ldc2_w 241
    //   336: lstore 4
    //   338: goto -246 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	341	0	paramFile1	File
    //   0	341	1	paramFile2	File
    //   88	237	2	l1	long
    //   97	1	4	localObject1	Object
    //   102	235	4	l2	long
    //   85	238	6	l3	long
    //   54	253	8	localObject2	Object
    //   64	247	9	localObject3	Object
    //   71	195	10	localFileChannel1	java.nio.channels.FileChannel
    //   239	70	11	localObject4	Object
    //   1	301	12	localFileChannel2	java.nio.channels.FileChannel
    // Exception table:
    //   from	to	target	type
    //   46	56	191	finally
    //   56	66	235	finally
    //   66	73	256	finally
    //   73	80	278	finally
    //   80	87	296	finally
    //   92	104	296	finally
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\a\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */