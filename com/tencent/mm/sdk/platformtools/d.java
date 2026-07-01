package com.tencent.mm.sdk.platformtools;

import java.text.SimpleDateFormat;

final class d
{
  private static final SimpleDateFormat a = new SimpleDateFormat("MM-dd HH:mm:ss SSS");
  private static final byte[] b = { 4, 0, 0, 0, -1, -1, -1, 0 };
  
  /* Error */
  public static void a(java.io.PrintStream paramPrintStream, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +24 -> 25
    //   4: aload_1
    //   5: invokestatic 34	com/tencent/mm/sdk/platformtools/o:a	([B)Z
    //   8: ifne +17 -> 25
    //   11: aload_2
    //   12: invokestatic 37	com/tencent/mm/sdk/platformtools/o:b	(Ljava/lang/String;)Z
    //   15: ifne +10 -> 25
    //   18: aload_3
    //   19: invokestatic 37	com/tencent/mm/sdk/platformtools/o:b	(Ljava/lang/String;)Z
    //   22: ifeq +4 -> 26
    //   25: return
    //   26: aload_0
    //   27: monitorenter
    //   28: new 39	java/lang/StringBuffer
    //   31: dup
    //   32: invokespecial 41	java/lang/StringBuffer:<init>	()V
    //   35: astore 4
    //   37: aload 4
    //   39: getstatic 20	com/tencent/mm/sdk/platformtools/d:a	Ljava/text/SimpleDateFormat;
    //   42: invokestatic 47	java/lang/System:currentTimeMillis	()J
    //   45: invokestatic 53	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   48: invokevirtual 57	java/text/SimpleDateFormat:format	(Ljava/lang/Object;)Ljava/lang/String;
    //   51: invokevirtual 61	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   54: pop
    //   55: aload 4
    //   57: ldc 63
    //   59: invokevirtual 61	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   62: aload_2
    //   63: invokevirtual 61	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   66: ldc 63
    //   68: invokevirtual 61	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   71: aload_3
    //   72: invokevirtual 61	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   75: pop
    //   76: aload 4
    //   78: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   81: astore_2
    //   82: new 69	javax/crypto/spec/DESKeySpec
    //   85: dup
    //   86: aload_1
    //   87: invokespecial 72	javax/crypto/spec/DESKeySpec:<init>	([B)V
    //   90: astore_1
    //   91: ldc 74
    //   93: invokestatic 80	javax/crypto/SecretKeyFactory:getInstance	(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
    //   96: aload_1
    //   97: invokevirtual 84	javax/crypto/SecretKeyFactory:generateSecret	(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    //   100: astore_1
    //   101: ldc 74
    //   103: invokestatic 89	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   106: astore_3
    //   107: aload_3
    //   108: iconst_1
    //   109: aload_1
    //   110: invokevirtual 93	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   113: aload_3
    //   114: aload_2
    //   115: invokevirtual 99	java/lang/String:getBytes	()[B
    //   118: invokevirtual 103	javax/crypto/Cipher:doFinal	([B)[B
    //   121: astore_1
    //   122: aload_0
    //   123: aload_1
    //   124: arraylength
    //   125: invokestatic 108	com/tencent/mm/a/b:a	(I)[B
    //   128: invokevirtual 113	java/io/PrintStream:write	([B)V
    //   131: aload_0
    //   132: aload_1
    //   133: invokevirtual 113	java/io/PrintStream:write	([B)V
    //   136: aload_0
    //   137: getstatic 25	com/tencent/mm/sdk/platformtools/d:b	[B
    //   140: invokevirtual 113	java/io/PrintStream:write	([B)V
    //   143: aload_0
    //   144: invokevirtual 116	java/io/PrintStream:flush	()V
    //   147: aload_0
    //   148: monitorexit
    //   149: return
    //   150: astore_1
    //   151: aload_0
    //   152: monitorexit
    //   153: aload_1
    //   154: athrow
    //   155: astore_1
    //   156: aload_1
    //   157: invokevirtual 119	java/lang/Exception:printStackTrace	()V
    //   160: goto -17 -> 143
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	paramPrintStream	java.io.PrintStream
    //   0	163	1	paramArrayOfByte	byte[]
    //   0	163	2	paramString1	String
    //   0	163	3	paramString2	String
    //   35	42	4	localStringBuffer	StringBuffer
    // Exception table:
    //   from	to	target	type
    //   28	82	150	finally
    //   82	143	150	finally
    //   143	149	150	finally
    //   156	160	150	finally
    //   82	143	155	java/lang/Exception
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */