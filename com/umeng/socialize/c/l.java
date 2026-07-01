package com.umeng.socialize.c;

import com.umeng.socialize.bean.SocializeUser;
import com.umeng.socialize.c.a.e;
import org.json.JSONObject;

public class l
  extends e
{
  public SocializeUser a;
  
  public l(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	com/umeng/socialize/c/l:l	Lorg/json/JSONObject;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnonnull +12 -> 18
    //   9: getstatic 24	com/umeng/socialize/c/a/e:k	Ljava/lang/String;
    //   12: ldc 26
    //   14: invokestatic 32	com/umeng/socom/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: return
    //   18: aload_0
    //   19: new 34	com/umeng/socialize/bean/SocializeUser
    //   22: dup
    //   23: invokespecial 36	com/umeng/socialize/bean/SocializeUser:<init>	()V
    //   26: putfield 38	com/umeng/socialize/c/l:a	Lcom/umeng/socialize/bean/SocializeUser;
    //   29: aload_2
    //   30: ldc 40
    //   32: invokevirtual 46	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   35: ifeq +21 -> 56
    //   38: aload_2
    //   39: ldc 40
    //   41: invokevirtual 50	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   44: astore_3
    //   45: aload_0
    //   46: getfield 38	com/umeng/socialize/c/l:a	Lcom/umeng/socialize/bean/SocializeUser;
    //   49: aload_3
    //   50: invokestatic 56	com/umeng/socialize/bean/SHARE_MEDIA:convertToEmun	(Ljava/lang/String;)Lcom/umeng/socialize/bean/SHARE_MEDIA;
    //   53: putfield 60	com/umeng/socialize/bean/SocializeUser:default_platform	Lcom/umeng/socialize/bean/SHARE_MEDIA;
    //   56: aload_2
    //   57: ldc 62
    //   59: invokevirtual 46	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   62: ifeq +44 -> 106
    //   65: new 64	java/util/ArrayList
    //   68: dup
    //   69: invokespecial 65	java/util/ArrayList:<init>	()V
    //   72: astore_3
    //   73: aload_2
    //   74: ldc 62
    //   76: invokevirtual 69	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   79: astore 4
    //   81: aload 4
    //   83: invokevirtual 73	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   86: astore 5
    //   88: aload 5
    //   90: invokeinterface 79 1 0
    //   95: ifne +270 -> 365
    //   98: aload_0
    //   99: getfield 38	com/umeng/socialize/c/l:a	Lcom/umeng/socialize/bean/SocializeUser;
    //   102: aload_3
    //   103: putfield 82	com/umeng/socialize/bean/SocializeUser:accounts	Ljava/util/List;
    //   106: aload_2
    //   107: ldc 84
    //   109: invokevirtual 46	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   112: ifeq +177 -> 289
    //   115: aload_2
    //   116: ldc 84
    //   118: invokevirtual 69	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   121: astore 4
    //   123: aload 4
    //   125: invokevirtual 73	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   128: astore_3
    //   129: aload_3
    //   130: invokeinterface 79 1 0
    //   135: ifeq +154 -> 289
    //   138: aload_3
    //   139: invokeinterface 88 1 0
    //   144: invokevirtual 94	java/lang/Object:toString	()Ljava/lang/String;
    //   147: astore_3
    //   148: aload 4
    //   150: aload_3
    //   151: invokevirtual 69	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   154: astore 9
    //   156: aload 9
    //   158: ldc 96
    //   160: ldc 98
    //   162: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   165: astore 6
    //   167: aload 9
    //   169: ldc 104
    //   171: ldc 98
    //   173: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   176: astore 7
    //   178: aload 9
    //   180: ldc 106
    //   182: ldc 98
    //   184: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   187: astore 8
    //   189: aload 9
    //   191: ldc 108
    //   193: ldc 98
    //   195: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   198: astore 4
    //   200: aload 9
    //   202: ldc 110
    //   204: iconst_0
    //   205: invokevirtual 114	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   208: istore_1
    //   209: aload 9
    //   211: ldc 116
    //   213: ldc 98
    //   215: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   218: astore 5
    //   220: aload 9
    //   222: ldc 118
    //   224: ldc 98
    //   226: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   229: astore 9
    //   231: new 120	com/umeng/socialize/bean/SnsAccount
    //   234: dup
    //   235: aload 6
    //   237: iload_1
    //   238: invokestatic 126	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   241: invokestatic 131	com/umeng/socialize/bean/Gender:convertToEmun	(Ljava/lang/String;)Lcom/umeng/socialize/bean/Gender;
    //   244: aload 7
    //   246: aload 8
    //   248: invokespecial 134	com/umeng/socialize/bean/SnsAccount:<init>	(Ljava/lang/String;Lcom/umeng/socialize/bean/Gender;Ljava/lang/String;Ljava/lang/String;)V
    //   251: astore 6
    //   253: aload 6
    //   255: aload_3
    //   256: invokevirtual 138	com/umeng/socialize/bean/SnsAccount:setPlatform	(Ljava/lang/String;)V
    //   259: aload 6
    //   261: aload 4
    //   263: invokevirtual 141	com/umeng/socialize/bean/SnsAccount:setProfileUrl	(Ljava/lang/String;)V
    //   266: aload_0
    //   267: getfield 38	com/umeng/socialize/c/l:a	Lcom/umeng/socialize/bean/SocializeUser;
    //   270: aload 6
    //   272: putfield 145	com/umeng/socialize/bean/SocializeUser:loginAccount	Lcom/umeng/socialize/bean/SnsAccount;
    //   275: aload 6
    //   277: aload 5
    //   279: invokevirtual 148	com/umeng/socialize/bean/SnsAccount:setBirthday	(Ljava/lang/String;)V
    //   282: aload 6
    //   284: aload 9
    //   286: invokevirtual 151	com/umeng/socialize/bean/SnsAccount:setExtendArgs	(Ljava/lang/String;)V
    //   289: aload_0
    //   290: getfield 38	com/umeng/socialize/c/l:a	Lcom/umeng/socialize/bean/SocializeUser;
    //   293: getfield 145	com/umeng/socialize/bean/SocializeUser:loginAccount	Lcom/umeng/socialize/bean/SnsAccount;
    //   296: astore_3
    //   297: aload_3
    //   298: ifnonnull -281 -> 17
    //   301: aload_2
    //   302: ldc 96
    //   304: invokevirtual 46	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   307: ifeq -290 -> 17
    //   310: aload_2
    //   311: ldc 96
    //   313: ldc 98
    //   315: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   318: putstatic 156	com/umeng/socialize/common/SocializeConstants:GUIDENAME	Ljava/lang/String;
    //   321: return
    //   322: astore_3
    //   323: getstatic 157	com/umeng/socialize/c/l:k	Ljava/lang/String;
    //   326: ldc -97
    //   328: invokestatic 161	com/umeng/socom/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   331: return
    //   332: astore_3
    //   333: getstatic 157	com/umeng/socialize/c/l:k	Ljava/lang/String;
    //   336: new 163	java/lang/StringBuilder
    //   339: dup
    //   340: ldc -91
    //   342: invokespecial 167	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   345: aload_2
    //   346: invokevirtual 168	org/json/JSONObject:toString	()Ljava/lang/String;
    //   349: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: ldc -82
    //   354: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   360: aload_3
    //   361: invokestatic 178	com/umeng/socom/Log:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   364: return
    //   365: aload 5
    //   367: invokeinterface 88 1 0
    //   372: invokevirtual 94	java/lang/Object:toString	()Ljava/lang/String;
    //   375: astore 6
    //   377: aload 4
    //   379: aload 6
    //   381: invokevirtual 69	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   384: astore 12
    //   386: aload 12
    //   388: ldc 96
    //   390: ldc 98
    //   392: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   395: astore 9
    //   397: aload 12
    //   399: ldc 104
    //   401: ldc 98
    //   403: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   406: astore 10
    //   408: aload 12
    //   410: ldc 106
    //   412: ldc 98
    //   414: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   417: astore 11
    //   419: aload 12
    //   421: ldc 110
    //   423: iconst_0
    //   424: invokevirtual 114	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   427: istore_1
    //   428: aload 12
    //   430: ldc 108
    //   432: ldc 98
    //   434: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   437: astore 7
    //   439: aload 12
    //   441: ldc 116
    //   443: ldc 98
    //   445: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   448: astore 8
    //   450: aload 12
    //   452: ldc 118
    //   454: ldc 98
    //   456: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   459: astore 12
    //   461: new 120	com/umeng/socialize/bean/SnsAccount
    //   464: dup
    //   465: aload 9
    //   467: iload_1
    //   468: invokestatic 126	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   471: invokestatic 131	com/umeng/socialize/bean/Gender:convertToEmun	(Ljava/lang/String;)Lcom/umeng/socialize/bean/Gender;
    //   474: aload 10
    //   476: aload 11
    //   478: invokespecial 134	com/umeng/socialize/bean/SnsAccount:<init>	(Ljava/lang/String;Lcom/umeng/socialize/bean/Gender;Ljava/lang/String;Ljava/lang/String;)V
    //   481: astore 9
    //   483: aload 9
    //   485: aload 6
    //   487: invokevirtual 138	com/umeng/socialize/bean/SnsAccount:setPlatform	(Ljava/lang/String;)V
    //   490: aload 9
    //   492: aload 7
    //   494: invokevirtual 141	com/umeng/socialize/bean/SnsAccount:setProfileUrl	(Ljava/lang/String;)V
    //   497: aload_3
    //   498: aload 9
    //   500: invokeinterface 184 2 0
    //   505: pop
    //   506: aload 9
    //   508: aload 8
    //   510: invokevirtual 148	com/umeng/socialize/bean/SnsAccount:setBirthday	(Ljava/lang/String;)V
    //   513: aload 9
    //   515: aload 12
    //   517: invokevirtual 151	com/umeng/socialize/bean/SnsAccount:setExtendArgs	(Ljava/lang/String;)V
    //   520: goto -432 -> 88
    //   523: astore_3
    //   524: getstatic 157	com/umeng/socialize/c/l:k	Ljava/lang/String;
    //   527: ldc -70
    //   529: invokestatic 161	com/umeng/socom/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   532: goto -426 -> 106
    //   535: astore_3
    //   536: getstatic 157	com/umeng/socialize/c/l:k	Ljava/lang/String;
    //   539: ldc -97
    //   541: invokestatic 161	com/umeng/socom/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   544: goto -255 -> 289
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	547	0	this	l
    //   208	260	1	i	int
    //   4	342	2	localJSONObject	JSONObject
    //   44	254	3	localObject1	Object
    //   322	1	3	localException	Exception
    //   332	166	3	localJSONException1	org.json.JSONException
    //   523	1	3	localJSONException2	org.json.JSONException
    //   535	1	3	localJSONException3	org.json.JSONException
    //   79	299	4	localObject2	Object
    //   86	280	5	localObject3	Object
    //   165	321	6	localObject4	Object
    //   176	317	7	str1	String
    //   187	322	8	str2	String
    //   154	360	9	localObject5	Object
    //   406	69	10	str3	String
    //   417	60	11	str4	String
    //   384	132	12	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   301	321	322	java/lang/Exception
    //   18	56	332	org/json/JSONException
    //   289	297	332	org/json/JSONException
    //   301	321	332	org/json/JSONException
    //   323	331	332	org/json/JSONException
    //   524	532	332	org/json/JSONException
    //   536	544	332	org/json/JSONException
    //   56	88	523	org/json/JSONException
    //   88	106	523	org/json/JSONException
    //   365	520	523	org/json/JSONException
    //   106	289	535	org/json/JSONException
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */