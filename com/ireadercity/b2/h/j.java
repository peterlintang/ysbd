package com.ireadercity.b2.h;

import android.content.Context;
import android.os.AsyncTask;

public final class j
  extends AsyncTask<Boolean, Boolean, Boolean>
{
  private Context a = null;
  
  public j(Context paramContext)
  {
    this.a = paramContext;
  }
  
  /* Error */
  private Boolean a()
  {
    // Byte code:
    //   0: new 20	org/apache/http/client/methods/HttpGet
    //   3: dup
    //   4: ldc 22
    //   6: invokespecial 25	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   9: astore_3
    //   10: aconst_null
    //   11: astore_2
    //   12: aconst_null
    //   13: astore_1
    //   14: new 27	org/apache/http/impl/client/DefaultHttpClient
    //   17: dup
    //   18: invokespecial 28	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   21: aload_3
    //   22: invokevirtual 32	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   25: invokeinterface 38 1 0
    //   30: invokestatic 44	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   33: astore_3
    //   34: aload_3
    //   35: ifnull +130 -> 165
    //   38: aload_3
    //   39: astore_1
    //   40: aload_3
    //   41: astore_2
    //   42: aload_3
    //   43: invokevirtual 50	java/lang/String:length	()I
    //   46: bipush 20
    //   48: if_icmpge +117 -> 165
    //   51: aload_3
    //   52: astore_1
    //   53: aload_3
    //   54: astore_2
    //   55: aload_3
    //   56: ldc 52
    //   58: invokevirtual 56	java/lang/String:matches	(Ljava/lang/String;)Z
    //   61: ifeq +104 -> 165
    //   64: aload_3
    //   65: astore_1
    //   66: aload_3
    //   67: astore_2
    //   68: aload_0
    //   69: getfield 14	com/ireadercity/b2/h/j:a	Landroid/content/Context;
    //   72: invokestatic 62	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   75: invokeinterface 68 1 0
    //   80: astore 4
    //   82: aload_3
    //   83: astore_1
    //   84: aload_3
    //   85: astore_2
    //   86: aload 4
    //   88: ldc 70
    //   90: aload_3
    //   91: invokeinterface 76 3 0
    //   96: pop
    //   97: aload_3
    //   98: astore_1
    //   99: aload_3
    //   100: astore_2
    //   101: aload 4
    //   103: invokeinterface 80 1 0
    //   108: pop
    //   109: aload_3
    //   110: astore_1
    //   111: aload_3
    //   112: astore_2
    //   113: aload_3
    //   114: putstatic 86	com/ireadercity/b2/a:y	Ljava/lang/String;
    //   117: aload_3
    //   118: astore_1
    //   119: aload_3
    //   120: astore_2
    //   121: getstatic 89	com/ireadercity/b2/a:z	Ljava/lang/String;
    //   124: ldc 91
    //   126: aload_3
    //   127: invokevirtual 95	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   130: putstatic 89	com/ireadercity/b2/a:z	Ljava/lang/String;
    //   133: aload_3
    //   134: astore_1
    //   135: aload_3
    //   136: astore_2
    //   137: getstatic 98	com/ireadercity/b2/a:A	Ljava/lang/String;
    //   140: ldc 91
    //   142: aload_3
    //   143: invokevirtual 95	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   146: putstatic 98	com/ireadercity/b2/a:A	Ljava/lang/String;
    //   149: aload_3
    //   150: astore_1
    //   151: aload_3
    //   152: astore_2
    //   153: getstatic 101	com/ireadercity/b2/a:B	Ljava/lang/String;
    //   156: ldc 91
    //   158: aload_3
    //   159: invokevirtual 95	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   162: putstatic 101	com/ireadercity/b2/a:B	Ljava/lang/String;
    //   165: new 103	java/lang/StringBuilder
    //   168: dup
    //   169: ldc 105
    //   171: invokespecial 106	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   174: aload_3
    //   175: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: ldc 112
    //   180: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: ldc 22
    //   185: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: invokevirtual 115	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: pop
    //   192: iconst_1
    //   193: invokestatic 121	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   196: areturn
    //   197: astore_3
    //   198: aload_1
    //   199: astore_2
    //   200: aload_3
    //   201: invokevirtual 124	java/lang/Exception:printStackTrace	()V
    //   204: new 103	java/lang/StringBuilder
    //   207: dup
    //   208: ldc 105
    //   210: invokespecial 106	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   213: aload_1
    //   214: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: ldc 112
    //   219: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: ldc 22
    //   224: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: invokevirtual 115	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   230: pop
    //   231: iconst_0
    //   232: invokestatic 121	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   235: areturn
    //   236: astore_1
    //   237: iconst_0
    //   238: invokestatic 121	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   241: areturn
    //   242: astore_1
    //   243: new 103	java/lang/StringBuilder
    //   246: dup
    //   247: ldc 105
    //   249: invokespecial 106	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   252: aload_2
    //   253: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: ldc 112
    //   258: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: ldc 22
    //   263: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: invokevirtual 115	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: pop
    //   270: aload_1
    //   271: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	272	0	this	j
    //   13	201	1	localObject1	Object
    //   236	1	1	localException1	Exception
    //   242	29	1	localObject2	Object
    //   11	242	2	localObject3	Object
    //   9	166	3	localObject4	Object
    //   197	4	3	localException2	Exception
    //   80	22	4	localEditor	android.content.SharedPreferences.Editor
    // Exception table:
    //   from	to	target	type
    //   14	34	197	java/lang/Exception
    //   42	51	197	java/lang/Exception
    //   55	64	197	java/lang/Exception
    //   68	82	197	java/lang/Exception
    //   86	97	197	java/lang/Exception
    //   101	109	197	java/lang/Exception
    //   113	117	197	java/lang/Exception
    //   121	133	197	java/lang/Exception
    //   137	149	197	java/lang/Exception
    //   153	165	197	java/lang/Exception
    //   0	10	236	java/lang/Exception
    //   165	192	236	java/lang/Exception
    //   204	231	236	java/lang/Exception
    //   243	272	236	java/lang/Exception
    //   14	34	242	finally
    //   42	51	242	finally
    //   55	64	242	finally
    //   68	82	242	finally
    //   86	97	242	finally
    //   101	109	242	finally
    //   113	117	242	finally
    //   121	133	242	finally
    //   137	149	242	finally
    //   153	165	242	finally
    //   200	204	242	finally
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */