package com.youloft.natize;

import java.io.FileDescriptor;

public class PDF
{
  private static final String TAG = "PDF";
  private int invalid_password = 0;
  public String mFileName = null;
  private int pdf_ptr = -1;
  
  /* Error */
  public PDF(java.io.File paramFile, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: aconst_null
    //   7: astore 4
    //   9: aload_0
    //   10: invokespecial 21	java/lang/Object:<init>	()V
    //   13: aload_0
    //   14: aconst_null
    //   15: putfield 23	com/youloft/natize/PDF:mFileName	Ljava/lang/String;
    //   18: aload_0
    //   19: iconst_m1
    //   20: putfield 25	com/youloft/natize/PDF:pdf_ptr	I
    //   23: aload_0
    //   24: iconst_0
    //   25: putfield 27	com/youloft/natize/PDF:invalid_password	I
    //   28: new 29	java/lang/StringBuilder
    //   31: dup
    //   32: ldc 31
    //   34: invokespecial 34	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   37: aload_1
    //   38: invokevirtual 40	java/io/File:getPath	()Ljava/lang/String;
    //   41: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: pop
    //   48: aload_0
    //   49: aload_1
    //   50: invokevirtual 40	java/io/File:getPath	()Ljava/lang/String;
    //   53: putfield 23	com/youloft/natize/PDF:mFileName	Ljava/lang/String;
    //   56: aload_1
    //   57: invokevirtual 51	java/io/File:exists	()Z
    //   60: ifeq +45 -> 105
    //   63: aload 6
    //   65: astore_3
    //   66: new 53	java/io/FileInputStream
    //   69: dup
    //   70: aload_1
    //   71: invokespecial 56	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   74: astore_1
    //   75: aload_1
    //   76: invokevirtual 60	java/io/FileInputStream:available	()I
    //   79: newarray <illegal type>
    //   81: astore_3
    //   82: aload_1
    //   83: aload_3
    //   84: invokevirtual 64	java/io/FileInputStream:read	([B)I
    //   87: pop
    //   88: aload_0
    //   89: aload_3
    //   90: iload_2
    //   91: ldc 66
    //   93: invokespecial 70	com/youloft/natize/PDF:parseFileBytes	([BILjava/lang/String;)I
    //   96: pop
    //   97: aload_1
    //   98: ifnull +7 -> 105
    //   101: aload_1
    //   102: invokevirtual 73	java/io/FileInputStream:close	()V
    //   105: return
    //   106: astore_1
    //   107: aload 6
    //   109: astore_3
    //   110: aload_1
    //   111: invokevirtual 76	java/lang/Exception:printStackTrace	()V
    //   114: aconst_null
    //   115: astore_1
    //   116: goto -41 -> 75
    //   119: astore_3
    //   120: aload_3
    //   121: invokevirtual 77	java/io/IOException:printStackTrace	()V
    //   124: aload 4
    //   126: astore_3
    //   127: goto -45 -> 82
    //   130: astore 4
    //   132: aload_1
    //   133: astore_3
    //   134: aload 4
    //   136: invokevirtual 76	java/lang/Exception:printStackTrace	()V
    //   139: aload_1
    //   140: ifnull -35 -> 105
    //   143: aload_1
    //   144: invokevirtual 73	java/io/FileInputStream:close	()V
    //   147: return
    //   148: astore_1
    //   149: return
    //   150: astore 4
    //   152: aload 4
    //   154: invokevirtual 77	java/io/IOException:printStackTrace	()V
    //   157: goto -69 -> 88
    //   160: astore_3
    //   161: aload_1
    //   162: astore 4
    //   164: aload_3
    //   165: astore_1
    //   166: aload 4
    //   168: ifnull +8 -> 176
    //   171: aload 4
    //   173: invokevirtual 73	java/io/FileInputStream:close	()V
    //   176: aload_1
    //   177: athrow
    //   178: astore_1
    //   179: return
    //   180: astore_3
    //   181: goto -5 -> 176
    //   184: astore_1
    //   185: aload_3
    //   186: astore 4
    //   188: goto -22 -> 166
    //   191: astore 4
    //   193: aload 5
    //   195: astore_1
    //   196: goto -64 -> 132
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	this	PDF
    //   0	199	1	paramFile	java.io.File
    //   0	199	2	paramInt	int
    //   65	45	3	localObject1	Object
    //   119	2	3	localIOException1	java.io.IOException
    //   126	8	3	localObject2	Object
    //   160	5	3	localObject3	Object
    //   180	6	3	localException1	Exception
    //   7	118	4	localObject4	Object
    //   130	5	4	localException2	Exception
    //   150	3	4	localIOException2	java.io.IOException
    //   162	25	4	localObject5	Object
    //   191	1	4	localException3	Exception
    //   1	193	5	localObject6	Object
    //   4	104	6	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   66	75	106	java/lang/Exception
    //   75	82	119	java/io/IOException
    //   75	82	130	java/lang/Exception
    //   82	88	130	java/lang/Exception
    //   88	97	130	java/lang/Exception
    //   120	124	130	java/lang/Exception
    //   152	157	130	java/lang/Exception
    //   143	147	148	java/lang/Exception
    //   82	88	150	java/io/IOException
    //   75	82	160	finally
    //   82	88	160	finally
    //   88	97	160	finally
    //   120	124	160	finally
    //   152	157	160	finally
    //   101	105	178	java/lang/Exception
    //   171	176	180	java/lang/Exception
    //   66	75	184	finally
    //   110	114	184	finally
    //   134	139	184	finally
    //   110	114	191	java/lang/Exception
  }
  
  public PDF(FileDescriptor paramFileDescriptor, int paramInt)
  {
    parseFileDescriptor(paramFileDescriptor, paramInt, "");
  }
  
  private synchronized native void freeMemory();
  
  private synchronized native int parseFileBytes(byte[] paramArrayOfByte, int paramInt, String paramString);
  
  private synchronized native int parseFileDescriptor(FileDescriptor paramFileDescriptor, int paramInt, String paramString);
  
  public void finalize()
  {
    try
    {
      freeMemory();
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
  
  public synchronized native int getPageCount();
  
  public synchronized native int getPageSize(int paramInt, PDF.Size paramSize);
  
  public boolean isInvalidPassword()
  {
    return this.invalid_password != 0;
  }
  
  public boolean isValid()
  {
    return this.pdf_ptr != 0;
  }
  
  public synchronized native int[] renderPage(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, boolean paramBoolean2, PDF.Size paramSize);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\youloft\natize\PDF.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */