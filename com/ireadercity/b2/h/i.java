package com.ireadercity.b2.h;

import android.content.Context;
import android.os.AsyncTask;

public final class i
  extends AsyncTask<Boolean, Boolean, Boolean>
{
  private Context a = null;
  
  public i(Context paramContext)
  {
    this.a = paramContext;
  }
  
  /* Error */
  private Boolean a()
  {
    // Byte code:
    //   0: new 20	java/lang/StringBuilder
    //   3: dup
    //   4: ldc 22
    //   6: invokespecial 25	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   9: getstatic 31	com/ireadercity/b2/a:y	Ljava/lang/String;
    //   12: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: ldc 37
    //   17: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: getstatic 40	com/ireadercity/b2/a:R	Ljava/lang/String;
    //   23: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: ldc 42
    //   28: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: getstatic 46	com/ireadercity/b2/a:Q	I
    //   34: invokevirtual 49	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   37: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: astore 4
    //   42: new 55	org/apache/http/client/methods/HttpGet
    //   45: dup
    //   46: aload 4
    //   48: invokespecial 56	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   51: astore_3
    //   52: aconst_null
    //   53: astore_1
    //   54: aconst_null
    //   55: astore_2
    //   56: new 58	org/apache/http/impl/client/DefaultHttpClient
    //   59: dup
    //   60: invokespecial 59	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   63: aload_3
    //   64: invokevirtual 63	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   67: invokeinterface 69 1 0
    //   72: invokestatic 74	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   75: astore_3
    //   76: aload_3
    //   77: astore_1
    //   78: aload_3
    //   79: invokestatic 80	com/ireadercity/b2/h/y:d	(Ljava/lang/String;)Z
    //   82: ifne +110 -> 192
    //   85: aload_3
    //   86: astore_1
    //   87: aload_3
    //   88: invokevirtual 86	java/lang/String:length	()I
    //   91: bipush 10
    //   93: if_icmple +99 -> 192
    //   96: aload_3
    //   97: astore_1
    //   98: aload_3
    //   99: invokevirtual 86	java/lang/String:length	()I
    //   102: sipush 500
    //   105: if_icmpge +87 -> 192
    //   108: aload_3
    //   109: astore_1
    //   110: aload_3
    //   111: ldc 88
    //   113: invokevirtual 92	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   116: arraylength
    //   117: iconst_1
    //   118: if_icmple +74 -> 192
    //   121: aload_3
    //   122: astore_1
    //   123: aload_3
    //   124: putstatic 95	com/ireadercity/b2/a:ah	Ljava/lang/String;
    //   127: aload_3
    //   128: astore_1
    //   129: aload_0
    //   130: getfield 14	com/ireadercity/b2/h/i:a	Landroid/content/Context;
    //   133: astore_2
    //   134: aload_3
    //   135: astore_1
    //   136: getstatic 95	com/ireadercity/b2/a:ah	Ljava/lang/String;
    //   139: astore 5
    //   141: aload_3
    //   142: astore_1
    //   143: aload_2
    //   144: invokestatic 101	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   147: invokeinterface 107 1 0
    //   152: ldc 109
    //   154: aload 5
    //   156: invokeinterface 115 3 0
    //   161: invokeinterface 119 1 0
    //   166: pop
    //   167: aload_3
    //   168: astore_1
    //   169: aload_3
    //   170: invokestatic 123	com/ireadercity/b2/bean/a:a	(Ljava/lang/String;)V
    //   173: aload_3
    //   174: astore_1
    //   175: new 20	java/lang/StringBuilder
    //   178: dup
    //   179: ldc 125
    //   181: invokespecial 25	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   184: aload_3
    //   185: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: pop
    //   192: new 20	java/lang/StringBuilder
    //   195: dup
    //   196: ldc 125
    //   198: invokespecial 25	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   201: aload_3
    //   202: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: ldc 127
    //   207: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: aload 4
    //   212: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   218: pop
    //   219: iconst_1
    //   220: invokestatic 133	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   223: areturn
    //   224: astore 5
    //   226: aload_3
    //   227: astore_2
    //   228: aload_3
    //   229: astore_1
    //   230: aload 5
    //   232: invokevirtual 136	java/lang/Exception:printStackTrace	()V
    //   235: goto -43 -> 192
    //   238: astore_3
    //   239: aload_2
    //   240: astore_1
    //   241: aload_3
    //   242: invokevirtual 136	java/lang/Exception:printStackTrace	()V
    //   245: new 20	java/lang/StringBuilder
    //   248: dup
    //   249: ldc 125
    //   251: invokespecial 25	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   254: aload_2
    //   255: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: ldc 127
    //   260: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: aload 4
    //   265: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   271: pop
    //   272: iconst_0
    //   273: invokestatic 133	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   276: areturn
    //   277: astore_1
    //   278: iconst_0
    //   279: invokestatic 133	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   282: areturn
    //   283: astore_2
    //   284: new 20	java/lang/StringBuilder
    //   287: dup
    //   288: ldc 125
    //   290: invokespecial 25	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   293: aload_1
    //   294: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: ldc 127
    //   299: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: aload 4
    //   304: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: pop
    //   311: aload_2
    //   312: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	313	0	this	i
    //   53	188	1	localObject1	Object
    //   277	17	1	localException1	Exception
    //   55	200	2	localObject2	Object
    //   283	29	2	localObject3	Object
    //   51	178	3	localObject4	Object
    //   238	4	3	localException2	Exception
    //   40	263	4	str1	String
    //   139	16	5	str2	String
    //   224	7	5	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   78	85	224	java/lang/Exception
    //   87	96	224	java/lang/Exception
    //   98	108	224	java/lang/Exception
    //   110	121	224	java/lang/Exception
    //   123	127	224	java/lang/Exception
    //   129	134	224	java/lang/Exception
    //   136	141	224	java/lang/Exception
    //   143	167	224	java/lang/Exception
    //   169	173	224	java/lang/Exception
    //   175	192	224	java/lang/Exception
    //   56	76	238	java/lang/Exception
    //   230	235	238	java/lang/Exception
    //   0	52	277	java/lang/Exception
    //   192	219	277	java/lang/Exception
    //   245	272	277	java/lang/Exception
    //   284	313	277	java/lang/Exception
    //   56	76	283	finally
    //   78	85	283	finally
    //   87	96	283	finally
    //   98	108	283	finally
    //   110	121	283	finally
    //   123	127	283	finally
    //   129	134	283	finally
    //   136	141	283	finally
    //   143	167	283	finally
    //   169	173	283	finally
    //   175	192	283	finally
    //   230	235	283	finally
    //   241	245	283	finally
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */