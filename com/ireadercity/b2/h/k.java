package com.ireadercity.b2.h;

import android.content.Context;
import android.os.AsyncTask;

public final class k
  extends AsyncTask<Boolean, Boolean, Boolean>
{
  private Context a = null;
  private String b = "http://www.facebook.com";
  
  public k(Context paramContext)
  {
    this.a = paramContext;
  }
  
  /* Error */
  private Boolean a()
  {
    // Byte code:
    //   0: new 26	org/apache/http/client/methods/HttpGet
    //   3: dup
    //   4: aload_0
    //   5: getfield 20	com/ireadercity/b2/h/k:b	Ljava/lang/String;
    //   8: invokespecial 29	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   11: astore_1
    //   12: new 31	org/apache/http/params/BasicHttpParams
    //   15: dup
    //   16: invokespecial 32	org/apache/http/params/BasicHttpParams:<init>	()V
    //   19: astore_2
    //   20: aload_2
    //   21: sipush 8000
    //   24: invokestatic 38	org/apache/http/params/HttpConnectionParams:setConnectionTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   27: new 40	org/apache/http/impl/client/DefaultHttpClient
    //   30: dup
    //   31: aload_2
    //   32: invokespecial 43	org/apache/http/impl/client/DefaultHttpClient:<init>	(Lorg/apache/http/params/HttpParams;)V
    //   35: aload_1
    //   36: invokevirtual 47	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   39: invokeinterface 53 1 0
    //   44: invokestatic 59	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   47: astore_1
    //   48: aload_1
    //   49: ldc 61
    //   51: invokevirtual 67	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   54: ifle +40 -> 94
    //   57: aload_1
    //   58: ldc 69
    //   60: invokevirtual 67	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   63: ifle +31 -> 94
    //   66: iconst_1
    //   67: putstatic 75	com/ireadercity/b2/a:af	Z
    //   70: new 77	java/lang/StringBuilder
    //   73: dup
    //   74: ldc 79
    //   76: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   79: getstatic 75	com/ireadercity/b2/a:af	Z
    //   82: invokevirtual 84	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   85: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: pop
    //   89: iconst_1
    //   90: invokestatic 93	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   93: areturn
    //   94: iconst_0
    //   95: putstatic 75	com/ireadercity/b2/a:af	Z
    //   98: goto -28 -> 70
    //   101: astore_1
    //   102: iconst_0
    //   103: putstatic 75	com/ireadercity/b2/a:af	Z
    //   106: aload_1
    //   107: invokevirtual 96	java/lang/Exception:printStackTrace	()V
    //   110: new 77	java/lang/StringBuilder
    //   113: dup
    //   114: ldc 79
    //   116: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   119: getstatic 75	com/ireadercity/b2/a:af	Z
    //   122: invokevirtual 84	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   125: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: pop
    //   129: iconst_0
    //   130: invokestatic 93	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   133: areturn
    //   134: astore_1
    //   135: iconst_0
    //   136: invokestatic 93	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   139: areturn
    //   140: astore_1
    //   141: new 77	java/lang/StringBuilder
    //   144: dup
    //   145: ldc 79
    //   147: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   150: getstatic 75	com/ireadercity/b2/a:af	Z
    //   153: invokevirtual 84	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   156: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: pop
    //   160: aload_1
    //   161: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	this	k
    //   11	47	1	localObject1	Object
    //   101	6	1	localException1	Exception
    //   134	1	1	localException2	Exception
    //   140	21	1	localObject2	Object
    //   19	13	2	localBasicHttpParams	org.apache.http.params.BasicHttpParams
    // Exception table:
    //   from	to	target	type
    //   12	70	101	java/lang/Exception
    //   94	98	101	java/lang/Exception
    //   0	12	134	java/lang/Exception
    //   70	89	134	java/lang/Exception
    //   110	129	134	java/lang/Exception
    //   141	162	134	java/lang/Exception
    //   12	70	140	finally
    //   94	98	140	finally
    //   102	110	140	finally
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */