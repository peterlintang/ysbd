package com.ireadercity.b2.h;

import android.content.Context;
import android.os.AsyncTask;

public final class c
  extends AsyncTask<Boolean, Boolean, Boolean>
{
  private Context a = null;
  
  public c(Context paramContext)
  {
    this.a = paramContext;
  }
  
  /* Error */
  private Boolean a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: new 22	java/lang/StringBuilder
    //   6: dup
    //   7: ldc 24
    //   9: invokespecial 27	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   12: getstatic 33	com/ireadercity/b2/a:y	Ljava/lang/String;
    //   15: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: ldc 39
    //   20: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: getstatic 42	com/ireadercity/b2/a:R	Ljava/lang/String;
    //   26: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: ldc 44
    //   31: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: getstatic 48	com/ireadercity/b2/a:Q	I
    //   37: invokevirtual 51	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   40: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: astore 5
    //   45: new 57	org/apache/http/client/methods/HttpGet
    //   48: dup
    //   49: aload 5
    //   51: invokespecial 58	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   54: astore 4
    //   56: new 60	org/apache/http/impl/client/DefaultHttpClient
    //   59: dup
    //   60: invokespecial 61	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   63: aload 4
    //   65: invokevirtual 65	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   68: invokeinterface 71 1 0
    //   73: invokestatic 76	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   76: astore 4
    //   78: new 22	java/lang/StringBuilder
    //   81: dup
    //   82: ldc 78
    //   84: invokespecial 27	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   87: aload 4
    //   89: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: ldc 80
    //   94: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: aload 5
    //   99: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: pop
    //   106: aload 4
    //   108: invokestatic 86	com/ireadercity/b2/h/y:d	(Ljava/lang/String;)Z
    //   111: ifeq +87 -> 198
    //   114: iconst_0
    //   115: invokestatic 92	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   118: areturn
    //   119: astore 4
    //   121: aload 4
    //   123: invokevirtual 95	java/lang/Exception:printStackTrace	()V
    //   126: new 22	java/lang/StringBuilder
    //   129: dup
    //   130: ldc 78
    //   132: invokespecial 27	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   135: aconst_null
    //   136: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: ldc 80
    //   141: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: aload 5
    //   146: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: pop
    //   153: aconst_null
    //   154: astore 4
    //   156: goto -50 -> 106
    //   159: astore 4
    //   161: new 22	java/lang/StringBuilder
    //   164: dup
    //   165: ldc 78
    //   167: invokespecial 27	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   170: aconst_null
    //   171: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: ldc 80
    //   176: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: aload 5
    //   181: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: pop
    //   188: aload 4
    //   190: athrow
    //   191: astore 4
    //   193: iconst_0
    //   194: invokestatic 92	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   197: areturn
    //   198: new 97	org/json/JSONObject
    //   201: dup
    //   202: aload 4
    //   204: invokespecial 98	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   207: astore 5
    //   209: aload 6
    //   211: astore 4
    //   213: aload 5
    //   215: ifnull +12 -> 227
    //   218: aload 5
    //   220: ldc 100
    //   222: invokevirtual 104	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   225: astore 4
    //   227: aload 4
    //   229: ifnull +262 -> 491
    //   232: aload 4
    //   234: ldc 106
    //   236: invokevirtual 110	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   239: istore_2
    //   240: aload 4
    //   242: ldc 112
    //   244: invokevirtual 110	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   247: istore_3
    //   248: aload 4
    //   250: ldc 114
    //   252: invokevirtual 118	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   255: astore 5
    //   257: aload 4
    //   259: ldc 120
    //   261: invokevirtual 118	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   264: astore 6
    //   266: aload 4
    //   268: ldc 122
    //   270: invokevirtual 110	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   273: istore_1
    //   274: aload_0
    //   275: getfield 14	com/ireadercity/b2/h/c:a	Landroid/content/Context;
    //   278: invokestatic 128	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   281: invokeinterface 134 1 0
    //   286: astore 4
    //   288: iload_1
    //   289: ifne +76 -> 365
    //   292: iconst_0
    //   293: putstatic 138	com/ireadercity/b2/a:i	Z
    //   296: aload 4
    //   298: ldc -116
    //   300: iconst_0
    //   301: invokeinterface 146 3 0
    //   306: pop
    //   307: aload 5
    //   309: invokestatic 86	com/ireadercity/b2/h/y:d	(Ljava/lang/String;)Z
    //   312: ifne +11 -> 323
    //   315: aload 6
    //   317: invokestatic 86	com/ireadercity/b2/h/y:d	(Ljava/lang/String;)Z
    //   320: ifeq +80 -> 400
    //   323: iconst_0
    //   324: invokestatic 92	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   327: areturn
    //   328: astore 4
    //   330: aload 4
    //   332: invokevirtual 147	org/json/JSONException:printStackTrace	()V
    //   335: aconst_null
    //   336: astore 5
    //   338: goto -129 -> 209
    //   341: astore 4
    //   343: aload 4
    //   345: invokevirtual 147	org/json/JSONException:printStackTrace	()V
    //   348: iconst_0
    //   349: invokestatic 92	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   352: areturn
    //   353: astore 4
    //   355: aload 4
    //   357: invokevirtual 95	java/lang/Exception:printStackTrace	()V
    //   360: iconst_1
    //   361: istore_1
    //   362: goto -88 -> 274
    //   365: iload_1
    //   366: iconst_1
    //   367: if_icmpne -60 -> 307
    //   370: iconst_1
    //   371: putstatic 138	com/ireadercity/b2/a:i	Z
    //   374: aload 4
    //   376: ldc -116
    //   378: iconst_1
    //   379: invokeinterface 146 3 0
    //   384: pop
    //   385: goto -78 -> 307
    //   388: astore 4
    //   390: aload 4
    //   392: invokevirtual 147	org/json/JSONException:printStackTrace	()V
    //   395: iconst_0
    //   396: invokestatic 92	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   399: areturn
    //   400: aload 4
    //   402: ldc 106
    //   404: iload_2
    //   405: invokeinterface 151 3 0
    //   410: pop
    //   411: aload 4
    //   413: ldc 112
    //   415: iload_3
    //   416: invokeinterface 151 3 0
    //   421: pop
    //   422: aload 4
    //   424: ldc 114
    //   426: aload 5
    //   428: invokeinterface 155 3 0
    //   433: pop
    //   434: aload 4
    //   436: ldc 120
    //   438: aload 6
    //   440: invokeinterface 155 3 0
    //   445: pop
    //   446: aload 4
    //   448: invokeinterface 159 1 0
    //   453: pop
    //   454: iload_2
    //   455: putstatic 162	com/ireadercity/b2/a:N	I
    //   458: iload_3
    //   459: putstatic 165	com/ireadercity/b2/a:M	I
    //   462: aload 5
    //   464: putstatic 168	com/ireadercity/b2/a:O	Ljava/lang/String;
    //   467: aload 6
    //   469: putstatic 171	com/ireadercity/b2/a:P	Ljava/lang/String;
    //   472: new 22	java/lang/StringBuilder
    //   475: dup
    //   476: ldc -83
    //   478: invokespecial 27	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   481: getstatic 162	com/ireadercity/b2/a:N	I
    //   484: invokevirtual 51	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   487: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   490: pop
    //   491: iconst_1
    //   492: invokestatic 92	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   495: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	496	0	this	c
    //   273	95	1	i	int
    //   239	216	2	j	int
    //   247	212	3	k	int
    //   54	53	4	localObject1	Object
    //   119	3	4	localException1	Exception
    //   154	1	4	localObject2	Object
    //   159	30	4	localObject3	Object
    //   191	12	4	localException2	Exception
    //   211	86	4	localObject4	Object
    //   328	3	4	localJSONException1	org.json.JSONException
    //   341	3	4	localJSONException2	org.json.JSONException
    //   353	22	4	localException3	Exception
    //   388	59	4	localJSONException3	org.json.JSONException
    //   43	420	5	localObject5	Object
    //   1	467	6	str	String
    // Exception table:
    //   from	to	target	type
    //   56	78	119	java/lang/Exception
    //   56	78	159	finally
    //   121	126	159	finally
    //   3	56	191	java/lang/Exception
    //   78	106	191	java/lang/Exception
    //   106	114	191	java/lang/Exception
    //   126	153	191	java/lang/Exception
    //   161	191	191	java/lang/Exception
    //   198	209	191	java/lang/Exception
    //   218	227	191	java/lang/Exception
    //   232	266	191	java/lang/Exception
    //   274	288	191	java/lang/Exception
    //   292	307	191	java/lang/Exception
    //   307	323	191	java/lang/Exception
    //   330	335	191	java/lang/Exception
    //   343	348	191	java/lang/Exception
    //   355	360	191	java/lang/Exception
    //   370	385	191	java/lang/Exception
    //   390	395	191	java/lang/Exception
    //   400	491	191	java/lang/Exception
    //   198	209	328	org/json/JSONException
    //   218	227	341	org/json/JSONException
    //   266	274	353	java/lang/Exception
    //   232	266	388	org/json/JSONException
    //   266	274	388	org/json/JSONException
    //   274	288	388	org/json/JSONException
    //   292	307	388	org/json/JSONException
    //   307	323	388	org/json/JSONException
    //   355	360	388	org/json/JSONException
    //   370	385	388	org/json/JSONException
    //   400	491	388	org/json/JSONException
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */