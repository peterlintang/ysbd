package com.ireadercity.b2.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.widget.ProgressBar;
import com.ireadercity.b2.bean.NetBookInfo;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.h.v;
import com.ireadercity.b2.h.x;
import com.ireadercity.b2.h.y;
import com.ireadercity.b2.ui.SyncCloudInfoActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
  extends AsyncTask<Object, Integer, String>
{
  private static String a = "BookDownloadTask";
  private static float b = 0.1F;
  private static float c = 0.7F;
  private static float d = 0.2F;
  private static int e = 4096;
  private List<d> f;
  private int g = 0;
  private com.ireadercity.b2.bean.d h;
  private NetBookInfo i;
  private ProgressBar j;
  private ProgressBar k;
  private Context l;
  private String m;
  private String n;
  private String o;
  private volatile boolean p = false;
  
  public e(com.ireadercity.b2.bean.d paramd)
  {
    this.h = paramd;
    this.i = this.h.m();
  }
  
  private void a(b paramb, String paramString)
  {
    try
    {
      Object localObject = PreferenceManager.getDefaultSharedPreferences(this.l).getString("lastSyncProgressResult", null);
      if (localObject != null)
      {
        localObject = SyncCloudInfoActivity.a((String)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          com.ireadercity.b2.bean.e locale = (com.ireadercity.b2.bean.e)((Iterator)localObject).next();
          if (locale.a.equals(paramString)) {
            SyncCloudInfoActivity.a(paramb, locale, com.ireadercity.b2.c.a.a(this.l));
          }
        }
      }
      return;
    }
    catch (Exception paramb)
    {
      paramb.printStackTrace();
    }
  }
  
  /* Error */
  private boolean a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 7
    //   6: aconst_null
    //   7: astore 6
    //   9: new 129	java/io/RandomAccessFile
    //   12: dup
    //   13: aload_2
    //   14: ldc -125
    //   16: invokespecial 134	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: astore 5
    //   21: new 136	java/net/URL
    //   24: dup
    //   25: aload_1
    //   26: invokespecial 139	java/net/URL:<init>	(Ljava/lang/String;)V
    //   29: invokevirtual 143	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   32: checkcast 145	java/net/HttpURLConnection
    //   35: astore_1
    //   36: aload 7
    //   38: astore 4
    //   40: aload_1
    //   41: ldc -110
    //   43: invokevirtual 150	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   46: aload 7
    //   48: astore 4
    //   50: aload_1
    //   51: ldc -104
    //   53: invokevirtual 155	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   56: aload 7
    //   58: astore 4
    //   60: aload_0
    //   61: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   64: invokevirtual 158	com/ireadercity/b2/bean/d:h	()Ljava/lang/String;
    //   67: ldc -96
    //   69: invokevirtual 164	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   72: ifne +22 -> 94
    //   75: aload 7
    //   77: astore 4
    //   79: aload_0
    //   80: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   83: invokevirtual 158	com/ireadercity/b2/bean/d:h	()Ljava/lang/String;
    //   86: ldc -90
    //   88: invokevirtual 170	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   91: ifeq +15 -> 106
    //   94: aload 7
    //   96: astore 4
    //   98: aload_1
    //   99: ldc -84
    //   101: ldc -82
    //   103: invokevirtual 177	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: aload 7
    //   108: astore 4
    //   110: aload_1
    //   111: invokevirtual 181	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   114: astore_2
    //   115: aload_2
    //   116: astore 4
    //   118: getstatic 48	com/ireadercity/b2/e/e:e	I
    //   121: iconst_4
    //   122: imul
    //   123: newarray <illegal type>
    //   125: astore 6
    //   127: aload_2
    //   128: astore 4
    //   130: aload_2
    //   131: aload 6
    //   133: invokevirtual 187	java/io/InputStream:read	([B)I
    //   136: istore_3
    //   137: iload_3
    //   138: iconst_m1
    //   139: if_icmpeq +62 -> 201
    //   142: aload_2
    //   143: astore 4
    //   145: aload 5
    //   147: aload 6
    //   149: iconst_0
    //   150: iload_3
    //   151: invokevirtual 191	java/io/RandomAccessFile:write	([BII)V
    //   154: goto -27 -> 127
    //   157: astore 6
    //   159: aload_1
    //   160: astore 4
    //   162: aload_2
    //   163: astore_1
    //   164: aload 6
    //   166: astore_2
    //   167: aload_2
    //   168: invokevirtual 126	java/lang/Exception:printStackTrace	()V
    //   171: aload 5
    //   173: ifnull +8 -> 181
    //   176: aload 5
    //   178: invokevirtual 194	java/io/RandomAccessFile:close	()V
    //   181: aload_1
    //   182: ifnull +7 -> 189
    //   185: aload_1
    //   186: invokevirtual 195	java/io/InputStream:close	()V
    //   189: aload 4
    //   191: ifnull +8 -> 199
    //   194: aload 4
    //   196: invokevirtual 198	java/net/HttpURLConnection:disconnect	()V
    //   199: iconst_0
    //   200: ireturn
    //   201: aload 5
    //   203: invokevirtual 194	java/io/RandomAccessFile:close	()V
    //   206: aload_2
    //   207: ifnull +7 -> 214
    //   210: aload_2
    //   211: invokevirtual 195	java/io/InputStream:close	()V
    //   214: aload_1
    //   215: ifnull +7 -> 222
    //   218: aload_1
    //   219: invokevirtual 198	java/net/HttpURLConnection:disconnect	()V
    //   222: iconst_1
    //   223: ireturn
    //   224: astore_1
    //   225: aconst_null
    //   226: astore_2
    //   227: aconst_null
    //   228: astore 5
    //   230: aload 5
    //   232: ifnull +8 -> 240
    //   235: aload 5
    //   237: invokevirtual 194	java/io/RandomAccessFile:close	()V
    //   240: aload 4
    //   242: ifnull +8 -> 250
    //   245: aload 4
    //   247: invokevirtual 195	java/io/InputStream:close	()V
    //   250: aload_2
    //   251: ifnull +7 -> 258
    //   254: aload_2
    //   255: invokevirtual 198	java/net/HttpURLConnection:disconnect	()V
    //   258: aload_1
    //   259: athrow
    //   260: astore_2
    //   261: goto -3 -> 258
    //   264: astore_1
    //   265: aconst_null
    //   266: astore_2
    //   267: goto -37 -> 230
    //   270: astore 6
    //   272: aload_1
    //   273: astore_2
    //   274: aload 6
    //   276: astore_1
    //   277: goto -47 -> 230
    //   280: astore 6
    //   282: aload 4
    //   284: astore_2
    //   285: aload_1
    //   286: astore 4
    //   288: aload 6
    //   290: astore_1
    //   291: goto -61 -> 230
    //   294: astore_1
    //   295: goto -96 -> 199
    //   298: astore_2
    //   299: aconst_null
    //   300: astore_1
    //   301: aconst_null
    //   302: astore 5
    //   304: aload 6
    //   306: astore 4
    //   308: goto -141 -> 167
    //   311: astore_2
    //   312: aconst_null
    //   313: astore_1
    //   314: aload 6
    //   316: astore 4
    //   318: goto -151 -> 167
    //   321: astore_2
    //   322: aconst_null
    //   323: astore 6
    //   325: aload_1
    //   326: astore 4
    //   328: aload 6
    //   330: astore_1
    //   331: goto -164 -> 167
    //   334: astore_1
    //   335: goto -113 -> 222
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	338	0	this	e
    //   0	338	1	paramString1	String
    //   0	338	2	paramString2	String
    //   136	15	3	i1	int
    //   1	326	4	localObject1	Object
    //   19	284	5	localRandomAccessFile	java.io.RandomAccessFile
    //   7	141	6	arrayOfByte	byte[]
    //   157	8	6	localException	Exception
    //   270	5	6	localObject2	Object
    //   280	35	6	localObject3	Object
    //   323	6	6	localObject4	Object
    //   4	103	7	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   118	127	157	java/lang/Exception
    //   130	137	157	java/lang/Exception
    //   145	154	157	java/lang/Exception
    //   9	21	224	finally
    //   235	240	260	java/lang/Exception
    //   245	250	260	java/lang/Exception
    //   254	258	260	java/lang/Exception
    //   21	36	264	finally
    //   40	46	270	finally
    //   50	56	270	finally
    //   60	75	270	finally
    //   79	94	270	finally
    //   98	106	270	finally
    //   110	115	270	finally
    //   118	127	270	finally
    //   130	137	270	finally
    //   145	154	270	finally
    //   167	171	280	finally
    //   176	181	294	java/lang/Exception
    //   185	189	294	java/lang/Exception
    //   194	199	294	java/lang/Exception
    //   9	21	298	java/lang/Exception
    //   21	36	311	java/lang/Exception
    //   40	46	321	java/lang/Exception
    //   50	56	321	java/lang/Exception
    //   60	75	321	java/lang/Exception
    //   79	94	321	java/lang/Exception
    //   98	106	321	java/lang/Exception
    //   110	115	321	java/lang/Exception
    //   201	206	334	java/lang/Exception
    //   210	214	334	java/lang/Exception
    //   218	222	334	java/lang/Exception
  }
  
  /* Error */
  private boolean c()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_1
    //   5: aload_0
    //   6: getfield 66	com/ireadercity/b2/e/e:i	Lcom/ireadercity/b2/bean/NetBookInfo;
    //   9: invokevirtual 205	com/ireadercity/b2/bean/NetBookInfo:h	()Ljava/lang/String;
    //   12: ifnonnull +5 -> 17
    //   15: iconst_1
    //   16: ireturn
    //   17: aload_0
    //   18: new 207	java/lang/StringBuilder
    //   21: dup
    //   22: invokespecial 208	java/lang/StringBuilder:<init>	()V
    //   25: aload_0
    //   26: getfield 66	com/ireadercity/b2/e/e:i	Lcom/ireadercity/b2/bean/NetBookInfo;
    //   29: invokevirtual 205	com/ireadercity/b2/bean/NetBookInfo:h	()Ljava/lang/String;
    //   32: invokestatic 213	com/ireadercity/b2/h/y:i	(Ljava/lang/String;)Ljava/lang/String;
    //   35: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc -37
    //   40: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: putfield 224	com/ireadercity/b2/e/e:o	Ljava/lang/String;
    //   49: new 207	java/lang/StringBuilder
    //   52: dup
    //   53: invokespecial 208	java/lang/StringBuilder:<init>	()V
    //   56: getstatic 228	com/ireadercity/b2/a:n	Ljava/lang/String;
    //   59: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: ldc -26
    //   64: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: aload_0
    //   68: getfield 224	com/ireadercity/b2/e/e:o	Ljava/lang/String;
    //   71: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: astore_3
    //   78: new 207	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 208	java/lang/StringBuilder:<init>	()V
    //   85: getstatic 231	com/ireadercity/b2/a:o	Ljava/lang/String;
    //   88: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: ldc -26
    //   93: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: aload_0
    //   97: getfield 224	com/ireadercity/b2/e/e:o	Ljava/lang/String;
    //   100: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: astore_2
    //   107: new 233	java/io/File
    //   110: dup
    //   111: aload_3
    //   112: invokespecial 234	java/io/File:<init>	(Ljava/lang/String;)V
    //   115: pop
    //   116: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   119: astore_3
    //   120: new 207	java/lang/StringBuilder
    //   123: dup
    //   124: ldc -20
    //   126: invokespecial 237	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   129: getstatic 240	com/ireadercity/b2/a:B	Ljava/lang/String;
    //   132: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: aload_0
    //   136: getfield 66	com/ireadercity/b2/e/e:i	Lcom/ireadercity/b2/bean/NetBookInfo;
    //   139: invokevirtual 205	com/ireadercity/b2/bean/NetBookInfo:h	()Ljava/lang/String;
    //   142: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   148: pop
    //   149: aload_0
    //   150: getfield 66	com/ireadercity/b2/e/e:i	Lcom/ireadercity/b2/bean/NetBookInfo;
    //   153: invokevirtual 242	com/ireadercity/b2/bean/NetBookInfo:b	()Z
    //   156: ifne +293 -> 449
    //   159: aload_0
    //   160: new 207	java/lang/StringBuilder
    //   163: dup
    //   164: invokespecial 208	java/lang/StringBuilder:<init>	()V
    //   167: getstatic 240	com/ireadercity/b2/a:B	Ljava/lang/String;
    //   170: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: aload_0
    //   174: getfield 66	com/ireadercity/b2/e/e:i	Lcom/ireadercity/b2/bean/NetBookInfo;
    //   177: invokevirtual 205	com/ireadercity/b2/bean/NetBookInfo:h	()Ljava/lang/String;
    //   180: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   186: aload_2
    //   187: invokespecial 244	com/ireadercity/b2/e/e:a	(Ljava/lang/String;Ljava/lang/String;)Z
    //   190: pop
    //   191: new 246	org/apache/http/client/methods/HttpPost
    //   194: dup
    //   195: new 207	java/lang/StringBuilder
    //   198: dup
    //   199: invokespecial 208	java/lang/StringBuilder:<init>	()V
    //   202: getstatic 249	com/ireadercity/b2/a:z	Ljava/lang/String;
    //   205: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: ldc -5
    //   210: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   216: invokespecial 252	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   219: astore_2
    //   220: aload_2
    //   221: invokestatic 255	com/ireadercity/b2/h/y:a	(Lorg/apache/http/client/methods/HttpRequestBase;)V
    //   224: invokestatic 258	com/ireadercity/b2/h/y:a	()Ljava/util/List;
    //   227: astore_3
    //   228: aload_3
    //   229: new 260	org/apache/http/message/BasicNameValuePair
    //   232: dup
    //   233: ldc_w 262
    //   236: aload_0
    //   237: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   240: invokevirtual 264	com/ireadercity/b2/bean/d:g	()Ljava/lang/String;
    //   243: invokespecial 265	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   246: invokeinterface 268 2 0
    //   251: pop
    //   252: aload_2
    //   253: new 270	org/apache/http/client/entity/UrlEncodedFormEntity
    //   256: dup
    //   257: aload_3
    //   258: ldc_w 272
    //   261: invokespecial 275	org/apache/http/client/entity/UrlEncodedFormEntity:<init>	(Ljava/util/List;Ljava/lang/String;)V
    //   264: invokevirtual 279	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   267: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   270: astore_3
    //   271: new 207	java/lang/StringBuilder
    //   274: dup
    //   275: ldc_w 281
    //   278: invokespecial 237	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   281: getstatic 283	com/ireadercity/b2/a:F	Ljava/lang/String;
    //   284: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   287: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   290: pop
    //   291: new 285	org/apache/http/params/BasicHttpParams
    //   294: dup
    //   295: invokespecial 286	org/apache/http/params/BasicHttpParams:<init>	()V
    //   298: getstatic 289	com/ireadercity/b2/a:J	I
    //   301: invokestatic 295	org/apache/http/params/HttpConnectionParams:setConnectionTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   304: invokestatic 300	com/ireadercity/b2/e/h:a	()Lorg/apache/http/impl/client/DefaultHttpClient;
    //   307: aload_2
    //   308: invokevirtual 306	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   311: astore_2
    //   312: aload_2
    //   313: invokeinterface 312 1 0
    //   318: invokeinterface 318 1 0
    //   323: sipush 200
    //   326: if_icmpne +320 -> 646
    //   329: aload_2
    //   330: invokeinterface 322 1 0
    //   335: invokeinterface 327 1 0
    //   340: astore_1
    //   341: new 329	java/io/InputStreamReader
    //   344: dup
    //   345: aload_1
    //   346: invokespecial 332	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   349: astore 4
    //   351: new 334	java/io/BufferedReader
    //   354: dup
    //   355: aload 4
    //   357: invokespecial 337	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   360: astore 5
    //   362: aload 5
    //   364: invokevirtual 340	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   367: astore_3
    //   368: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   371: astore_2
    //   372: new 207	java/lang/StringBuilder
    //   375: dup
    //   376: ldc_w 342
    //   379: invokespecial 237	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   382: aload_3
    //   383: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: ldc_w 344
    //   389: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: aload_3
    //   393: invokestatic 348	com/ireadercity/b2/b/t:d	(Ljava/lang/String;)Ljava/lang/String;
    //   396: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   402: pop
    //   403: aload_1
    //   404: astore_2
    //   405: aload_3
    //   406: astore_1
    //   407: aload 5
    //   409: ifnull +8 -> 417
    //   412: aload 5
    //   414: invokevirtual 349	java/io/BufferedReader:close	()V
    //   417: aload 4
    //   419: ifnull +8 -> 427
    //   422: aload 4
    //   424: invokevirtual 350	java/io/InputStreamReader:close	()V
    //   427: aload_2
    //   428: ifnull +7 -> 435
    //   431: aload_2
    //   432: invokevirtual 195	java/io/InputStream:close	()V
    //   435: aload_1
    //   436: aload_0
    //   437: getfield 66	com/ireadercity/b2/e/e:i	Lcom/ireadercity/b2/bean/NetBookInfo;
    //   440: invokevirtual 352	com/ireadercity/b2/bean/NetBookInfo:i	()Ljava/lang/String;
    //   443: invokestatic 353	com/ireadercity/b2/h/y:a	(Ljava/lang/String;Ljava/lang/String;)Z
    //   446: pop
    //   447: iconst_1
    //   448: ireturn
    //   449: aload_0
    //   450: aload_0
    //   451: getfield 66	com/ireadercity/b2/e/e:i	Lcom/ireadercity/b2/bean/NetBookInfo;
    //   454: invokevirtual 205	com/ireadercity/b2/bean/NetBookInfo:h	()Ljava/lang/String;
    //   457: aload_2
    //   458: invokespecial 244	com/ireadercity/b2/e/e:a	(Ljava/lang/String;Ljava/lang/String;)Z
    //   461: pop
    //   462: iconst_1
    //   463: ireturn
    //   464: astore_3
    //   465: aload_3
    //   466: invokevirtual 354	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   469: goto -202 -> 267
    //   472: astore_2
    //   473: aload_2
    //   474: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   477: goto -42 -> 435
    //   480: astore_3
    //   481: aconst_null
    //   482: astore_1
    //   483: aconst_null
    //   484: astore_2
    //   485: aload 5
    //   487: astore 4
    //   489: aload_3
    //   490: invokevirtual 126	java/lang/Exception:printStackTrace	()V
    //   493: aload_1
    //   494: ifnull +7 -> 501
    //   497: aload_1
    //   498: invokevirtual 349	java/io/BufferedReader:close	()V
    //   501: aload 4
    //   503: ifnull +8 -> 511
    //   506: aload 4
    //   508: invokevirtual 350	java/io/InputStreamReader:close	()V
    //   511: aload_2
    //   512: ifnull +7 -> 519
    //   515: aload_2
    //   516: invokevirtual 195	java/io/InputStream:close	()V
    //   519: iconst_0
    //   520: ireturn
    //   521: astore_1
    //   522: aload_1
    //   523: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   526: goto -7 -> 519
    //   529: astore_2
    //   530: aconst_null
    //   531: astore_3
    //   532: aconst_null
    //   533: astore 4
    //   535: aconst_null
    //   536: astore_1
    //   537: aload_3
    //   538: ifnull +7 -> 545
    //   541: aload_3
    //   542: invokevirtual 349	java/io/BufferedReader:close	()V
    //   545: aload 4
    //   547: ifnull +8 -> 555
    //   550: aload 4
    //   552: invokevirtual 350	java/io/InputStreamReader:close	()V
    //   555: aload_1
    //   556: ifnull +7 -> 563
    //   559: aload_1
    //   560: invokevirtual 195	java/io/InputStream:close	()V
    //   563: aload_2
    //   564: athrow
    //   565: astore_1
    //   566: aload_1
    //   567: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   570: goto -7 -> 563
    //   573: astore_2
    //   574: aconst_null
    //   575: astore_3
    //   576: aconst_null
    //   577: astore 4
    //   579: goto -42 -> 537
    //   582: astore_2
    //   583: aconst_null
    //   584: astore_3
    //   585: goto -48 -> 537
    //   588: astore_2
    //   589: aload 5
    //   591: astore_3
    //   592: goto -55 -> 537
    //   595: astore_3
    //   596: aload_2
    //   597: astore 5
    //   599: aload_3
    //   600: astore_2
    //   601: aload_1
    //   602: astore_3
    //   603: aload 5
    //   605: astore_1
    //   606: goto -69 -> 537
    //   609: astore_3
    //   610: aconst_null
    //   611: astore 4
    //   613: aload_1
    //   614: astore_2
    //   615: aload 4
    //   617: astore_1
    //   618: aload 5
    //   620: astore 4
    //   622: goto -133 -> 489
    //   625: astore_3
    //   626: aconst_null
    //   627: astore 5
    //   629: aload_1
    //   630: astore_2
    //   631: aload 5
    //   633: astore_1
    //   634: goto -145 -> 489
    //   637: astore_3
    //   638: aload_1
    //   639: astore_2
    //   640: aload 5
    //   642: astore_1
    //   643: goto -154 -> 489
    //   646: aconst_null
    //   647: astore 5
    //   649: aconst_null
    //   650: astore 4
    //   652: aconst_null
    //   653: astore_2
    //   654: goto -247 -> 407
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	657	0	this	e
    //   4	494	1	localObject1	Object
    //   521	2	1	localIOException1	java.io.IOException
    //   536	24	1	localObject2	Object
    //   565	37	1	localIOException2	java.io.IOException
    //   605	38	1	localObject3	Object
    //   106	352	2	localObject4	Object
    //   472	2	2	localIOException3	java.io.IOException
    //   484	32	2	localObject5	Object
    //   529	35	2	localObject6	Object
    //   573	1	2	localObject7	Object
    //   582	1	2	localObject8	Object
    //   588	9	2	localObject9	Object
    //   600	54	2	localObject10	Object
    //   77	329	3	localObject11	Object
    //   464	2	3	localUnsupportedEncodingException	java.io.UnsupportedEncodingException
    //   480	10	3	localException1	Exception
    //   531	61	3	localObject12	Object
    //   595	5	3	localObject13	Object
    //   602	1	3	localIOException4	java.io.IOException
    //   609	1	3	localException2	Exception
    //   625	1	3	localException3	Exception
    //   637	1	3	localException4	Exception
    //   349	302	4	localObject14	Object
    //   1	647	5	localObject15	Object
    // Exception table:
    //   from	to	target	type
    //   252	267	464	java/io/UnsupportedEncodingException
    //   412	417	472	java/io/IOException
    //   422	427	472	java/io/IOException
    //   431	435	472	java/io/IOException
    //   304	341	480	java/lang/Exception
    //   497	501	521	java/io/IOException
    //   506	511	521	java/io/IOException
    //   515	519	521	java/io/IOException
    //   304	341	529	finally
    //   541	545	565	java/io/IOException
    //   550	555	565	java/io/IOException
    //   559	563	565	java/io/IOException
    //   341	351	573	finally
    //   351	362	582	finally
    //   362	403	588	finally
    //   489	493	595	finally
    //   341	351	609	java/lang/Exception
    //   351	362	625	java/lang/Exception
    //   362	403	637	java/lang/Exception
  }
  
  /* Error */
  private boolean d()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 57	com/ireadercity/b2/e/e:p	Z
    //   4: ifeq +5 -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: iconst_2
    //   11: putfield 55	com/ireadercity/b2/e/e:g	I
    //   14: aload_0
    //   15: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   18: aload_0
    //   19: getfield 55	com/ireadercity/b2/e/e:g	I
    //   22: invokevirtual 359	com/ireadercity/b2/bean/d:a	(I)V
    //   25: aload_0
    //   26: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   29: invokevirtual 361	com/ireadercity/b2/bean/d:j	()Ljava/lang/String;
    //   32: ifnull +17 -> 49
    //   35: aload_0
    //   36: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   39: invokevirtual 364	com/ireadercity/b2/bean/d:k	()J
    //   42: ldc2_w 365
    //   45: lcmp
    //   46: ifge +372 -> 418
    //   49: aload_0
    //   50: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   53: new 207	java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial 208	java/lang/StringBuilder:<init>	()V
    //   60: getstatic 368	com/ireadercity/b2/a:l	Ljava/lang/String;
    //   63: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: ldc -26
    //   68: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: aload_0
    //   72: getfield 369	com/ireadercity/b2/e/e:n	Ljava/lang/String;
    //   75: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: ldc_w 371
    //   81: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: invokevirtual 373	com/ireadercity/b2/bean/d:g	(Ljava/lang/String;)V
    //   90: lconst_0
    //   91: lstore 6
    //   93: lload 6
    //   95: lstore_2
    //   96: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   99: astore 9
    //   101: lload 6
    //   103: lstore_2
    //   104: aload_0
    //   105: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   108: invokevirtual 158	com/ireadercity/b2/bean/d:h	()Ljava/lang/String;
    //   111: pop
    //   112: lload 6
    //   114: lstore_2
    //   115: new 136	java/net/URL
    //   118: dup
    //   119: aload_0
    //   120: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   123: invokevirtual 158	com/ireadercity/b2/bean/d:h	()Ljava/lang/String;
    //   126: invokespecial 139	java/net/URL:<init>	(Ljava/lang/String;)V
    //   129: astore 10
    //   131: iconst_0
    //   132: istore_1
    //   133: aconst_null
    //   134: astore 9
    //   136: aload 9
    //   138: ifnull +11 -> 149
    //   141: lload 6
    //   143: lstore_2
    //   144: aload 9
    //   146: invokevirtual 198	java/net/HttpURLConnection:disconnect	()V
    //   149: lload 6
    //   151: lstore_2
    //   152: aload 10
    //   154: invokevirtual 143	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   157: checkcast 145	java/net/HttpURLConnection
    //   160: astore 9
    //   162: lload 6
    //   164: lstore_2
    //   165: aload 9
    //   167: sipush 30000
    //   170: invokevirtual 150	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   173: lload 6
    //   175: lstore_2
    //   176: aload 9
    //   178: ldc -104
    //   180: invokevirtual 155	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   183: lload 6
    //   185: lstore_2
    //   186: aload_0
    //   187: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   190: invokevirtual 158	com/ireadercity/b2/bean/d:h	()Ljava/lang/String;
    //   193: ldc_w 375
    //   196: invokevirtual 164	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   199: ifeq +15 -> 214
    //   202: lload 6
    //   204: lstore_2
    //   205: aload 9
    //   207: ldc -84
    //   209: ldc -82
    //   211: invokevirtual 177	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   214: lload 6
    //   216: lstore 4
    //   218: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   221: astore 11
    //   223: lload 6
    //   225: lstore 4
    //   227: new 207	java/lang/StringBuilder
    //   230: dup
    //   231: ldc_w 377
    //   234: invokespecial 237	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   237: iload_1
    //   238: invokevirtual 380	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   241: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: pop
    //   245: lload 6
    //   247: lstore 4
    //   249: aload 9
    //   251: invokevirtual 383	java/net/HttpURLConnection:getContentLength	()I
    //   254: i2l
    //   255: lstore_2
    //   256: lload_2
    //   257: lstore 4
    //   259: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   262: astore 11
    //   264: lload_2
    //   265: lstore 4
    //   267: new 207	java/lang/StringBuilder
    //   270: dup
    //   271: ldc_w 385
    //   274: invokespecial 237	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   277: aload 9
    //   279: invokevirtual 388	java/net/HttpURLConnection:getResponseCode	()I
    //   282: invokevirtual 380	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   285: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   288: pop
    //   289: lload_2
    //   290: lstore 4
    //   292: iload_1
    //   293: iconst_1
    //   294: iadd
    //   295: istore_1
    //   296: lload 4
    //   298: ldc2_w 365
    //   301: lcmp
    //   302: ifge +9 -> 311
    //   305: iload_1
    //   306: bipush 50
    //   308: if_icmplt +1722 -> 2030
    //   311: lload 4
    //   313: ldc2_w 365
    //   316: lcmp
    //   317: iflt +99 -> 416
    //   320: lload 4
    //   322: lstore_2
    //   323: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   326: astore 9
    //   328: lload 4
    //   330: lstore_2
    //   331: new 207	java/lang/StringBuilder
    //   334: dup
    //   335: ldc_w 390
    //   338: invokespecial 237	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   341: lload 4
    //   343: invokevirtual 393	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   346: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   349: pop
    //   350: lload 4
    //   352: lstore_2
    //   353: aload_0
    //   354: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   357: lload 4
    //   359: invokevirtual 396	com/ireadercity/b2/bean/d:b	(J)V
    //   362: lload 4
    //   364: lstore_2
    //   365: goto +1672 -> 2037
    //   368: astore 11
    //   370: lload 4
    //   372: lstore_2
    //   373: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   376: astore 12
    //   378: lload 4
    //   380: lstore_2
    //   381: new 207	java/lang/StringBuilder
    //   384: dup
    //   385: ldc_w 398
    //   388: invokespecial 237	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   391: aload 11
    //   393: invokevirtual 401	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   396: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   402: pop
    //   403: goto -111 -> 292
    //   406: astore 9
    //   408: aload 9
    //   410: invokevirtual 126	java/lang/Exception:printStackTrace	()V
    //   413: goto +1624 -> 2037
    //   416: iconst_0
    //   417: ireturn
    //   418: aconst_null
    //   419: astore 12
    //   421: aconst_null
    //   422: astore 13
    //   424: aconst_null
    //   425: astore 15
    //   427: aconst_null
    //   428: astore 9
    //   430: aconst_null
    //   431: astore 21
    //   433: aconst_null
    //   434: astore 22
    //   436: aconst_null
    //   437: astore 11
    //   439: aconst_null
    //   440: astore 18
    //   442: aconst_null
    //   443: astore 19
    //   445: aconst_null
    //   446: astore 20
    //   448: aconst_null
    //   449: astore 17
    //   451: aload_0
    //   452: getfield 57	com/ireadercity/b2/e/e:p	Z
    //   455: ifeq +5 -> 460
    //   458: iconst_0
    //   459: ireturn
    //   460: new 233	java/io/File
    //   463: dup
    //   464: aload_0
    //   465: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   468: invokevirtual 361	com/ireadercity/b2/bean/d:j	()Ljava/lang/String;
    //   471: invokespecial 234	java/io/File:<init>	(Ljava/lang/String;)V
    //   474: invokevirtual 404	java/io/File:exists	()Z
    //   477: pop
    //   478: new 233	java/io/File
    //   481: dup
    //   482: aload_0
    //   483: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   486: invokevirtual 361	com/ireadercity/b2/bean/d:j	()Ljava/lang/String;
    //   489: invokespecial 234	java/io/File:<init>	(Ljava/lang/String;)V
    //   492: pop
    //   493: new 129	java/io/RandomAccessFile
    //   496: dup
    //   497: aload_0
    //   498: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   501: invokevirtual 361	com/ireadercity/b2/bean/d:j	()Ljava/lang/String;
    //   504: ldc -125
    //   506: invokespecial 134	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   509: astore 10
    //   511: aload 9
    //   513: astore 12
    //   515: aload 20
    //   517: astore 14
    //   519: aload 10
    //   521: astore 13
    //   523: aload 21
    //   525: astore 15
    //   527: aload 22
    //   529: astore 16
    //   531: aload 10
    //   533: aload_0
    //   534: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   537: invokevirtual 364	com/ireadercity/b2/bean/d:k	()J
    //   540: invokevirtual 407	java/io/RandomAccessFile:setLength	(J)V
    //   543: aload 9
    //   545: astore 12
    //   547: aload 20
    //   549: astore 14
    //   551: aload 10
    //   553: astore 13
    //   555: aload 21
    //   557: astore 15
    //   559: aload 22
    //   561: astore 16
    //   563: aload 10
    //   565: aload_0
    //   566: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   569: invokevirtual 409	com/ireadercity/b2/bean/d:l	()J
    //   572: invokevirtual 412	java/io/RandomAccessFile:seek	(J)V
    //   575: lconst_0
    //   576: lstore 4
    //   578: aload 9
    //   580: astore 12
    //   582: aload 20
    //   584: astore 14
    //   586: aload 10
    //   588: astore 13
    //   590: aload 21
    //   592: astore 15
    //   594: aload 22
    //   596: astore 16
    //   598: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   601: astore 23
    //   603: aload 9
    //   605: astore 12
    //   607: aload 20
    //   609: astore 14
    //   611: aload 10
    //   613: astore 13
    //   615: aload 21
    //   617: astore 15
    //   619: aload 22
    //   621: astore 16
    //   623: aload_0
    //   624: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   627: invokevirtual 158	com/ireadercity/b2/bean/d:h	()Ljava/lang/String;
    //   630: pop
    //   631: aload 9
    //   633: astore 12
    //   635: aload 20
    //   637: astore 14
    //   639: aload 10
    //   641: astore 13
    //   643: aload 21
    //   645: astore 15
    //   647: aload 22
    //   649: astore 16
    //   651: new 136	java/net/URL
    //   654: dup
    //   655: aload_0
    //   656: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   659: invokevirtual 158	com/ireadercity/b2/bean/d:h	()Ljava/lang/String;
    //   662: invokespecial 139	java/net/URL:<init>	(Ljava/lang/String;)V
    //   665: astore 21
    //   667: iconst_0
    //   668: istore_1
    //   669: aload 11
    //   671: ifnull +28 -> 699
    //   674: aload 11
    //   676: astore 12
    //   678: aload 20
    //   680: astore 14
    //   682: aload 10
    //   684: astore 13
    //   686: aload 11
    //   688: astore 15
    //   690: aload 11
    //   692: astore 16
    //   694: aload 11
    //   696: invokevirtual 198	java/net/HttpURLConnection:disconnect	()V
    //   699: aload 11
    //   701: astore 12
    //   703: aload 20
    //   705: astore 14
    //   707: aload 10
    //   709: astore 13
    //   711: aload 11
    //   713: astore 15
    //   715: aload 11
    //   717: astore 16
    //   719: aload 21
    //   721: invokevirtual 143	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   724: checkcast 145	java/net/HttpURLConnection
    //   727: astore 9
    //   729: aload 9
    //   731: sipush 30000
    //   734: invokevirtual 150	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   737: aload 9
    //   739: ldc -104
    //   741: invokevirtual 155	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   744: aload_0
    //   745: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   748: invokevirtual 158	com/ireadercity/b2/bean/d:h	()Ljava/lang/String;
    //   751: ldc -96
    //   753: invokevirtual 164	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   756: ifne +18 -> 774
    //   759: aload_0
    //   760: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   763: invokevirtual 158	com/ireadercity/b2/bean/d:h	()Ljava/lang/String;
    //   766: ldc -90
    //   768: invokevirtual 170	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   771: ifeq +12 -> 783
    //   774: aload 9
    //   776: ldc -84
    //   778: ldc -82
    //   780: invokevirtual 177	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   783: aload 9
    //   785: ldc_w 414
    //   788: new 207	java/lang/StringBuilder
    //   791: dup
    //   792: ldc_w 416
    //   795: invokespecial 237	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   798: aload_0
    //   799: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   802: invokevirtual 409	com/ireadercity/b2/bean/d:l	()J
    //   805: invokevirtual 393	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   808: ldc_w 418
    //   811: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   814: aload_0
    //   815: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   818: invokevirtual 364	com/ireadercity/b2/bean/d:k	()J
    //   821: invokevirtual 393	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   824: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   827: invokevirtual 421	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   830: lload 4
    //   832: lstore_2
    //   833: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   836: astore 11
    //   838: lload 4
    //   840: lstore_2
    //   841: new 207	java/lang/StringBuilder
    //   844: dup
    //   845: ldc_w 423
    //   848: invokespecial 237	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   851: iload_1
    //   852: invokevirtual 380	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   855: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   858: pop
    //   859: lload 4
    //   861: lstore_2
    //   862: aload 9
    //   864: invokevirtual 383	java/net/HttpURLConnection:getContentLength	()I
    //   867: i2l
    //   868: lstore 4
    //   870: lload 4
    //   872: lstore_2
    //   873: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   876: astore 11
    //   878: lload 4
    //   880: lstore_2
    //   881: new 207	java/lang/StringBuilder
    //   884: dup
    //   885: ldc_w 425
    //   888: invokespecial 237	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   891: aload 9
    //   893: invokevirtual 388	java/net/HttpURLConnection:getResponseCode	()I
    //   896: invokevirtual 380	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   899: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   902: pop
    //   903: lload 4
    //   905: lstore_2
    //   906: iload_1
    //   907: iconst_1
    //   908: iadd
    //   909: istore_1
    //   910: lload_2
    //   911: lconst_1
    //   912: lcmp
    //   913: ifge +9 -> 922
    //   916: iload_1
    //   917: bipush 50
    //   919: if_icmplt +1101 -> 2020
    //   922: aload_0
    //   923: getfield 57	com/ireadercity/b2/e/e:p	Z
    //   926: istore 8
    //   928: iload 8
    //   930: ifeq +116 -> 1046
    //   933: aload 9
    //   935: ifnull +8 -> 943
    //   938: aload 9
    //   940: invokevirtual 198	java/net/HttpURLConnection:disconnect	()V
    //   943: aload 10
    //   945: invokevirtual 194	java/io/RandomAccessFile:close	()V
    //   948: iconst_0
    //   949: ireturn
    //   950: astore 11
    //   952: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   955: astore 12
    //   957: new 207	java/lang/StringBuilder
    //   960: dup
    //   961: ldc_w 427
    //   964: invokespecial 237	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   967: aload 11
    //   969: invokevirtual 401	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   972: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   975: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   978: pop
    //   979: goto -73 -> 906
    //   982: astore 12
    //   984: aconst_null
    //   985: astore 13
    //   987: aload 10
    //   989: astore 11
    //   991: aload 9
    //   993: astore 10
    //   995: aload 13
    //   997: astore 9
    //   999: aload 12
    //   1001: invokevirtual 428	java/io/FileNotFoundException:printStackTrace	()V
    //   1004: aload 10
    //   1006: ifnull +8 -> 1014
    //   1009: aload 10
    //   1011: invokevirtual 198	java/net/HttpURLConnection:disconnect	()V
    //   1014: aload 9
    //   1016: ifnull +8 -> 1024
    //   1019: aload 9
    //   1021: invokevirtual 195	java/io/InputStream:close	()V
    //   1024: aload 11
    //   1026: ifnull +8 -> 1034
    //   1029: aload 11
    //   1031: invokevirtual 194	java/io/RandomAccessFile:close	()V
    //   1034: iconst_0
    //   1035: ireturn
    //   1036: astore 9
    //   1038: aload 9
    //   1040: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1043: goto -95 -> 948
    //   1046: lload_2
    //   1047: lconst_0
    //   1048: lcmp
    //   1049: ifle +162 -> 1211
    //   1052: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   1055: astore 11
    //   1057: new 207	java/lang/StringBuilder
    //   1060: dup
    //   1061: ldc_w 430
    //   1064: invokespecial 237	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1067: lload_2
    //   1068: invokevirtual 393	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1071: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1074: pop
    //   1075: aload 9
    //   1077: invokevirtual 181	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   1080: astore 11
    //   1082: getstatic 48	com/ireadercity/b2/e/e:e	I
    //   1085: iconst_4
    //   1086: imul
    //   1087: newarray <illegal type>
    //   1089: astore 12
    //   1091: aload_0
    //   1092: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   1095: invokevirtual 409	com/ireadercity/b2/bean/d:l	()J
    //   1098: lstore 4
    //   1100: lconst_0
    //   1101: lstore_2
    //   1102: aload 9
    //   1104: invokevirtual 383	java/net/HttpURLConnection:getContentLength	()I
    //   1107: i2l
    //   1108: lstore 6
    //   1110: aload 11
    //   1112: aload 12
    //   1114: invokevirtual 187	java/io/InputStream:read	([B)I
    //   1117: istore_1
    //   1118: iload_1
    //   1119: iconst_m1
    //   1120: if_icmpeq +118 -> 1238
    //   1123: aload_0
    //   1124: getfield 57	com/ireadercity/b2/e/e:p	Z
    //   1127: ifne +111 -> 1238
    //   1130: aload 10
    //   1132: aload 12
    //   1134: iconst_0
    //   1135: iload_1
    //   1136: invokevirtual 191	java/io/RandomAccessFile:write	([BII)V
    //   1139: lload_2
    //   1140: iload_1
    //   1141: i2l
    //   1142: ladd
    //   1143: lstore_2
    //   1144: aload_0
    //   1145: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   1148: lload 4
    //   1150: lload_2
    //   1151: ladd
    //   1152: invokevirtual 432	com/ireadercity/b2/bean/d:c	(J)V
    //   1155: aload_0
    //   1156: iconst_1
    //   1157: anewarray 434	java/lang/Integer
    //   1160: dup
    //   1161: iconst_0
    //   1162: lload 4
    //   1164: lload_2
    //   1165: ladd
    //   1166: ldc2_w 365
    //   1169: lmul
    //   1170: l2f
    //   1171: lload 6
    //   1173: l2f
    //   1174: fconst_0
    //   1175: fadd
    //   1176: fdiv
    //   1177: invokestatic 440	java/lang/Math:round	(F)I
    //   1180: invokestatic 444	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1183: aastore
    //   1184: invokevirtual 448	com/ireadercity/b2/e/e:publishProgress	([Ljava/lang/Object;)V
    //   1187: goto -77 -> 1110
    //   1190: astore 12
    //   1192: aload 10
    //   1194: astore 13
    //   1196: aload 9
    //   1198: astore 10
    //   1200: aload 11
    //   1202: astore 9
    //   1204: aload 13
    //   1206: astore 11
    //   1208: goto -209 -> 999
    //   1211: aload 9
    //   1213: ifnull +8 -> 1221
    //   1216: aload 9
    //   1218: invokevirtual 198	java/net/HttpURLConnection:disconnect	()V
    //   1221: aload 10
    //   1223: invokevirtual 194	java/io/RandomAccessFile:close	()V
    //   1226: iconst_0
    //   1227: ireturn
    //   1228: astore 9
    //   1230: aload 9
    //   1232: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1235: goto -9 -> 1226
    //   1238: aload 9
    //   1240: ifnull +8 -> 1248
    //   1243: aload 9
    //   1245: invokevirtual 198	java/net/HttpURLConnection:disconnect	()V
    //   1248: aload 11
    //   1250: ifnull +8 -> 1258
    //   1253: aload 11
    //   1255: invokevirtual 195	java/io/InputStream:close	()V
    //   1258: aload 10
    //   1260: invokevirtual 194	java/io/RandomAccessFile:close	()V
    //   1263: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   1266: astore 9
    //   1268: new 207	java/lang/StringBuilder
    //   1271: dup
    //   1272: invokespecial 208	java/lang/StringBuilder:<init>	()V
    //   1275: aload_0
    //   1276: getfield 369	com/ireadercity/b2/e/e:n	Ljava/lang/String;
    //   1279: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1282: ldc_w 450
    //   1285: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1288: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1291: pop
    //   1292: new 246	org/apache/http/client/methods/HttpPost
    //   1295: dup
    //   1296: new 207	java/lang/StringBuilder
    //   1299: dup
    //   1300: invokespecial 208	java/lang/StringBuilder:<init>	()V
    //   1303: getstatic 249	com/ireadercity/b2/a:z	Ljava/lang/String;
    //   1306: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1309: ldc_w 452
    //   1312: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1315: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1318: invokespecial 252	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   1321: astore 9
    //   1323: aload 9
    //   1325: invokestatic 255	com/ireadercity/b2/h/y:a	(Lorg/apache/http/client/methods/HttpRequestBase;)V
    //   1328: invokestatic 258	com/ireadercity/b2/h/y:a	()Ljava/util/List;
    //   1331: astore 10
    //   1333: aload 10
    //   1335: new 260	org/apache/http/message/BasicNameValuePair
    //   1338: dup
    //   1339: ldc_w 262
    //   1342: aload_0
    //   1343: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   1346: invokevirtual 264	com/ireadercity/b2/bean/d:g	()Ljava/lang/String;
    //   1349: invokespecial 265	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1352: invokeinterface 268 2 0
    //   1357: pop
    //   1358: aload_0
    //   1359: getfield 71	com/ireadercity/b2/e/e:l	Landroid/content/Context;
    //   1362: invokestatic 77	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   1365: astore 12
    //   1367: aload 12
    //   1369: ldc_w 454
    //   1372: aconst_null
    //   1373: invokeinterface 85 3 0
    //   1378: astore 11
    //   1380: aload 12
    //   1382: ldc_w 456
    //   1385: aconst_null
    //   1386: invokeinterface 85 3 0
    //   1391: astore 12
    //   1393: aload 11
    //   1395: invokestatic 458	com/ireadercity/b2/h/y:d	(Ljava/lang/String;)Z
    //   1398: ifne +59 -> 1457
    //   1401: aload 12
    //   1403: invokestatic 458	com/ireadercity/b2/h/y:d	(Ljava/lang/String;)Z
    //   1406: ifne +51 -> 1457
    //   1409: new 260	org/apache/http/message/BasicNameValuePair
    //   1412: dup
    //   1413: ldc_w 460
    //   1416: aload 11
    //   1418: invokespecial 265	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1421: astore 11
    //   1423: new 260	org/apache/http/message/BasicNameValuePair
    //   1426: dup
    //   1427: ldc_w 462
    //   1430: aload 12
    //   1432: invokespecial 265	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1435: astore 12
    //   1437: aload 10
    //   1439: aload 11
    //   1441: invokeinterface 268 2 0
    //   1446: pop
    //   1447: aload 10
    //   1449: aload 12
    //   1451: invokeinterface 268 2 0
    //   1456: pop
    //   1457: aload 9
    //   1459: new 270	org/apache/http/client/entity/UrlEncodedFormEntity
    //   1462: dup
    //   1463: aload 10
    //   1465: ldc_w 272
    //   1468: invokespecial 275	org/apache/http/client/entity/UrlEncodedFormEntity:<init>	(Ljava/util/List;Ljava/lang/String;)V
    //   1471: invokevirtual 279	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   1474: new 285	org/apache/http/params/BasicHttpParams
    //   1477: dup
    //   1478: invokespecial 286	org/apache/http/params/BasicHttpParams:<init>	()V
    //   1481: getstatic 289	com/ireadercity/b2/a:J	I
    //   1484: invokestatic 295	org/apache/http/params/HttpConnectionParams:setConnectionTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   1487: invokestatic 300	com/ireadercity/b2/e/h:a	()Lorg/apache/http/impl/client/DefaultHttpClient;
    //   1490: aload 9
    //   1492: invokevirtual 306	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   1495: pop
    //   1496: getstatic 37	com/ireadercity/b2/e/e:a	Ljava/lang/String;
    //   1499: astore 9
    //   1501: new 207	java/lang/StringBuilder
    //   1504: dup
    //   1505: invokespecial 208	java/lang/StringBuilder:<init>	()V
    //   1508: aload_0
    //   1509: getfield 369	com/ireadercity/b2/e/e:n	Ljava/lang/String;
    //   1512: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1515: ldc_w 464
    //   1518: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1521: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1524: pop
    //   1525: aload_0
    //   1526: getfield 71	com/ireadercity/b2/e/e:l	Landroid/content/Context;
    //   1529: invokestatic 469	com/ireadercity/b2/e/a:a	(Landroid/content/Context;)Lcom/ireadercity/b2/e/a;
    //   1532: pop
    //   1533: aload_0
    //   1534: getfield 59	com/ireadercity/b2/e/e:h	Lcom/ireadercity/b2/bean/d;
    //   1537: invokestatic 472	com/ireadercity/b2/e/a:a	(Lcom/ireadercity/b2/bean/d;)Z
    //   1540: pop
    //   1541: iconst_1
    //   1542: ireturn
    //   1543: astore 9
    //   1545: aload 9
    //   1547: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1550: goto -292 -> 1258
    //   1553: astore 9
    //   1555: aload 9
    //   1557: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1560: goto -297 -> 1263
    //   1563: astore 9
    //   1565: aload 9
    //   1567: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1570: goto -546 -> 1024
    //   1573: astore 9
    //   1575: aload 9
    //   1577: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1580: goto -546 -> 1034
    //   1583: astore 11
    //   1585: aconst_null
    //   1586: astore 10
    //   1588: aload 17
    //   1590: astore 15
    //   1592: aload 12
    //   1594: astore 9
    //   1596: aload 9
    //   1598: astore 12
    //   1600: aload 15
    //   1602: astore 14
    //   1604: aload 10
    //   1606: astore 13
    //   1608: aload 11
    //   1610: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1613: aload 9
    //   1615: ifnull +8 -> 1623
    //   1618: aload 9
    //   1620: invokevirtual 198	java/net/HttpURLConnection:disconnect	()V
    //   1623: aload 15
    //   1625: ifnull +8 -> 1633
    //   1628: aload 15
    //   1630: invokevirtual 195	java/io/InputStream:close	()V
    //   1633: aload 10
    //   1635: ifnull +8 -> 1643
    //   1638: aload 10
    //   1640: invokevirtual 194	java/io/RandomAccessFile:close	()V
    //   1643: iconst_0
    //   1644: ireturn
    //   1645: astore 9
    //   1647: aload 9
    //   1649: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1652: goto -19 -> 1633
    //   1655: astore 9
    //   1657: aload 9
    //   1659: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1662: goto -19 -> 1643
    //   1665: astore 11
    //   1667: aconst_null
    //   1668: astore 10
    //   1670: aload 18
    //   1672: astore 15
    //   1674: aload 13
    //   1676: astore 9
    //   1678: aload 9
    //   1680: astore 12
    //   1682: aload 15
    //   1684: astore 14
    //   1686: aload 10
    //   1688: astore 13
    //   1690: aload 11
    //   1692: invokevirtual 126	java/lang/Exception:printStackTrace	()V
    //   1695: aload 9
    //   1697: ifnull +8 -> 1705
    //   1700: aload 9
    //   1702: invokevirtual 198	java/net/HttpURLConnection:disconnect	()V
    //   1705: aload 15
    //   1707: ifnull +8 -> 1715
    //   1710: aload 15
    //   1712: invokevirtual 195	java/io/InputStream:close	()V
    //   1715: aload 10
    //   1717: ifnull +8 -> 1725
    //   1720: aload 10
    //   1722: invokevirtual 194	java/io/RandomAccessFile:close	()V
    //   1725: iconst_0
    //   1726: ireturn
    //   1727: astore 9
    //   1729: aload 9
    //   1731: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1734: goto -19 -> 1715
    //   1737: astore 9
    //   1739: aload 9
    //   1741: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1744: goto -19 -> 1725
    //   1747: astore 9
    //   1749: aconst_null
    //   1750: astore 10
    //   1752: aload 19
    //   1754: astore 14
    //   1756: aload 15
    //   1758: astore 12
    //   1760: aload 12
    //   1762: ifnull +8 -> 1770
    //   1765: aload 12
    //   1767: invokevirtual 198	java/net/HttpURLConnection:disconnect	()V
    //   1770: aload 14
    //   1772: ifnull +8 -> 1780
    //   1775: aload 14
    //   1777: invokevirtual 195	java/io/InputStream:close	()V
    //   1780: aload 10
    //   1782: ifnull +8 -> 1790
    //   1785: aload 10
    //   1787: invokevirtual 194	java/io/RandomAccessFile:close	()V
    //   1790: aload 9
    //   1792: athrow
    //   1793: astore 11
    //   1795: aload 11
    //   1797: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1800: goto -20 -> 1780
    //   1803: astore 10
    //   1805: aload 10
    //   1807: invokevirtual 355	java/io/IOException:printStackTrace	()V
    //   1810: goto -20 -> 1790
    //   1813: astore 9
    //   1815: aload 9
    //   1817: invokevirtual 126	java/lang/Exception:printStackTrace	()V
    //   1820: goto -324 -> 1496
    //   1823: astore 9
    //   1825: aload 9
    //   1827: invokevirtual 126	java/lang/Exception:printStackTrace	()V
    //   1830: goto -289 -> 1541
    //   1833: astore 9
    //   1835: aload 13
    //   1837: astore 10
    //   1839: goto -79 -> 1760
    //   1842: astore 11
    //   1844: aload 9
    //   1846: astore 12
    //   1848: aload 11
    //   1850: astore 9
    //   1852: aload 19
    //   1854: astore 14
    //   1856: goto -96 -> 1760
    //   1859: astore 13
    //   1861: aload 9
    //   1863: astore 12
    //   1865: aload 13
    //   1867: astore 9
    //   1869: aload 11
    //   1871: astore 14
    //   1873: goto -113 -> 1760
    //   1876: astore 12
    //   1878: aload 9
    //   1880: astore 14
    //   1882: aload 12
    //   1884: astore 9
    //   1886: aload 10
    //   1888: astore 12
    //   1890: aload 11
    //   1892: astore 10
    //   1894: goto -134 -> 1760
    //   1897: astore 11
    //   1899: aload 15
    //   1901: astore 9
    //   1903: aload 18
    //   1905: astore 15
    //   1907: goto -229 -> 1678
    //   1910: astore 11
    //   1912: aload 18
    //   1914: astore 15
    //   1916: goto -238 -> 1678
    //   1919: astore 12
    //   1921: aload 11
    //   1923: astore 15
    //   1925: aload 12
    //   1927: astore 11
    //   1929: goto -251 -> 1678
    //   1932: astore 11
    //   1934: aload 16
    //   1936: astore 9
    //   1938: aload 17
    //   1940: astore 15
    //   1942: goto -346 -> 1596
    //   1945: astore 11
    //   1947: aload 17
    //   1949: astore 15
    //   1951: goto -355 -> 1596
    //   1954: astore 12
    //   1956: aload 11
    //   1958: astore 15
    //   1960: aload 12
    //   1962: astore 11
    //   1964: goto -368 -> 1596
    //   1967: astore 12
    //   1969: aconst_null
    //   1970: astore 11
    //   1972: aconst_null
    //   1973: astore 10
    //   1975: aconst_null
    //   1976: astore 9
    //   1978: goto -979 -> 999
    //   1981: astore 12
    //   1983: aconst_null
    //   1984: astore 13
    //   1986: aload 10
    //   1988: astore 11
    //   1990: aconst_null
    //   1991: astore 9
    //   1993: aload 13
    //   1995: astore 10
    //   1997: goto -998 -> 999
    //   2000: astore 12
    //   2002: aload 10
    //   2004: astore 13
    //   2006: aconst_null
    //   2007: astore 9
    //   2009: aload 11
    //   2011: astore 10
    //   2013: aload 13
    //   2015: astore 11
    //   2017: goto -1018 -> 999
    //   2020: aload 9
    //   2022: astore 11
    //   2024: lload_2
    //   2025: lstore 4
    //   2027: goto -1358 -> 669
    //   2030: lload 4
    //   2032: lstore 6
    //   2034: goto -1898 -> 136
    //   2037: lload_2
    //   2038: ldc2_w 365
    //   2041: lcmp
    //   2042: ifge -1624 -> 418
    //   2045: iconst_0
    //   2046: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2047	0	this	e
    //   132	1009	1	i1	int
    //   95	1943	2	l1	long
    //   216	1815	4	l2	long
    //   91	1942	6	l3	long
    //   926	3	8	bool	boolean
    //   99	228	9	localObject1	Object
    //   406	3	9	localException1	Exception
    //   428	592	9	localObject2	Object
    //   1036	161	9	localIOException1	java.io.IOException
    //   1202	15	9	localObject3	Object
    //   1228	16	9	localIOException2	java.io.IOException
    //   1266	234	9	localObject4	Object
    //   1543	3	9	localIOException3	java.io.IOException
    //   1553	3	9	localIOException4	java.io.IOException
    //   1563	3	9	localIOException5	java.io.IOException
    //   1573	3	9	localIOException6	java.io.IOException
    //   1594	25	9	localObject5	Object
    //   1645	3	9	localIOException7	java.io.IOException
    //   1655	3	9	localIOException8	java.io.IOException
    //   1676	25	9	localObject6	Object
    //   1727	3	9	localIOException9	java.io.IOException
    //   1737	3	9	localIOException10	java.io.IOException
    //   1747	44	9	localObject7	Object
    //   1813	3	9	localException2	Exception
    //   1823	3	9	localException3	Exception
    //   1833	12	9	localObject8	Object
    //   1850	171	9	localObject9	Object
    //   129	1657	10	localObject10	Object
    //   1803	3	10	localIOException11	java.io.IOException
    //   1837	175	10	localObject11	Object
    //   221	42	11	str1	String
    //   368	24	11	localException4	Exception
    //   437	440	11	str2	String
    //   950	18	11	localException5	Exception
    //   989	451	11	localObject12	Object
    //   1583	26	11	localIOException12	java.io.IOException
    //   1665	26	11	localException6	Exception
    //   1793	3	11	localIOException13	java.io.IOException
    //   1842	49	11	localObject13	Object
    //   1897	1	11	localException7	Exception
    //   1910	12	11	localException8	Exception
    //   1927	1	11	localObject14	Object
    //   1932	1	11	localIOException14	java.io.IOException
    //   1945	12	11	localIOException15	java.io.IOException
    //   1962	61	11	localObject15	Object
    //   376	580	12	localObject16	Object
    //   982	18	12	localFileNotFoundException1	java.io.FileNotFoundException
    //   1089	44	12	arrayOfByte	byte[]
    //   1190	1	12	localFileNotFoundException2	java.io.FileNotFoundException
    //   1365	499	12	localObject17	Object
    //   1876	7	12	localObject18	Object
    //   1888	1	12	localObject19	Object
    //   1919	7	12	localException9	Exception
    //   1954	7	12	localIOException16	java.io.IOException
    //   1967	1	12	localFileNotFoundException3	java.io.FileNotFoundException
    //   1981	1	12	localFileNotFoundException4	java.io.FileNotFoundException
    //   2000	1	12	localFileNotFoundException5	java.io.FileNotFoundException
    //   422	1414	13	localObject20	Object
    //   1859	7	13	localObject21	Object
    //   1984	30	13	localObject22	Object
    //   517	1364	14	localObject23	Object
    //   425	1534	15	localObject24	Object
    //   529	1406	16	localObject25	Object
    //   449	1499	17	localObject26	Object
    //   440	1473	18	localObject27	Object
    //   443	1410	19	localObject28	Object
    //   446	258	20	localObject29	Object
    //   431	289	21	localURL	java.net.URL
    //   434	214	22	localObject30	Object
    //   601	1	23	str3	String
    // Exception table:
    //   from	to	target	type
    //   218	223	368	java/lang/Exception
    //   227	245	368	java/lang/Exception
    //   249	256	368	java/lang/Exception
    //   259	264	368	java/lang/Exception
    //   267	289	368	java/lang/Exception
    //   96	101	406	java/lang/Exception
    //   104	112	406	java/lang/Exception
    //   115	131	406	java/lang/Exception
    //   144	149	406	java/lang/Exception
    //   152	162	406	java/lang/Exception
    //   165	173	406	java/lang/Exception
    //   176	183	406	java/lang/Exception
    //   186	202	406	java/lang/Exception
    //   205	214	406	java/lang/Exception
    //   323	328	406	java/lang/Exception
    //   331	350	406	java/lang/Exception
    //   353	362	406	java/lang/Exception
    //   373	378	406	java/lang/Exception
    //   381	403	406	java/lang/Exception
    //   833	838	950	java/lang/Exception
    //   841	859	950	java/lang/Exception
    //   862	870	950	java/lang/Exception
    //   873	878	950	java/lang/Exception
    //   881	903	950	java/lang/Exception
    //   729	774	982	java/io/FileNotFoundException
    //   774	783	982	java/io/FileNotFoundException
    //   783	830	982	java/io/FileNotFoundException
    //   833	838	982	java/io/FileNotFoundException
    //   841	859	982	java/io/FileNotFoundException
    //   862	870	982	java/io/FileNotFoundException
    //   873	878	982	java/io/FileNotFoundException
    //   881	903	982	java/io/FileNotFoundException
    //   922	928	982	java/io/FileNotFoundException
    //   952	979	982	java/io/FileNotFoundException
    //   1052	1082	982	java/io/FileNotFoundException
    //   943	948	1036	java/io/IOException
    //   1082	1100	1190	java/io/FileNotFoundException
    //   1102	1110	1190	java/io/FileNotFoundException
    //   1110	1118	1190	java/io/FileNotFoundException
    //   1123	1139	1190	java/io/FileNotFoundException
    //   1144	1187	1190	java/io/FileNotFoundException
    //   1221	1226	1228	java/io/IOException
    //   1253	1258	1543	java/io/IOException
    //   1258	1263	1553	java/io/IOException
    //   1019	1024	1563	java/io/IOException
    //   1029	1034	1573	java/io/IOException
    //   460	511	1583	java/io/IOException
    //   1628	1633	1645	java/io/IOException
    //   1638	1643	1655	java/io/IOException
    //   460	511	1665	java/lang/Exception
    //   1710	1715	1727	java/io/IOException
    //   1720	1725	1737	java/io/IOException
    //   460	511	1747	finally
    //   1775	1780	1793	java/io/IOException
    //   1785	1790	1803	java/io/IOException
    //   1292	1457	1813	java/lang/Exception
    //   1457	1496	1813	java/lang/Exception
    //   1525	1541	1823	java/lang/Exception
    //   531	543	1833	finally
    //   563	575	1833	finally
    //   598	603	1833	finally
    //   623	631	1833	finally
    //   651	667	1833	finally
    //   694	699	1833	finally
    //   719	729	1833	finally
    //   1608	1613	1833	finally
    //   1690	1695	1833	finally
    //   729	774	1842	finally
    //   774	783	1842	finally
    //   783	830	1842	finally
    //   833	838	1842	finally
    //   841	859	1842	finally
    //   862	870	1842	finally
    //   873	878	1842	finally
    //   881	903	1842	finally
    //   922	928	1842	finally
    //   952	979	1842	finally
    //   1052	1082	1842	finally
    //   1082	1100	1859	finally
    //   1102	1110	1859	finally
    //   1110	1118	1859	finally
    //   1123	1139	1859	finally
    //   1144	1187	1859	finally
    //   999	1004	1876	finally
    //   531	543	1897	java/lang/Exception
    //   563	575	1897	java/lang/Exception
    //   598	603	1897	java/lang/Exception
    //   623	631	1897	java/lang/Exception
    //   651	667	1897	java/lang/Exception
    //   694	699	1897	java/lang/Exception
    //   719	729	1897	java/lang/Exception
    //   729	774	1910	java/lang/Exception
    //   774	783	1910	java/lang/Exception
    //   783	830	1910	java/lang/Exception
    //   922	928	1910	java/lang/Exception
    //   952	979	1910	java/lang/Exception
    //   1052	1082	1910	java/lang/Exception
    //   1082	1100	1919	java/lang/Exception
    //   1102	1110	1919	java/lang/Exception
    //   1110	1118	1919	java/lang/Exception
    //   1123	1139	1919	java/lang/Exception
    //   1144	1187	1919	java/lang/Exception
    //   531	543	1932	java/io/IOException
    //   563	575	1932	java/io/IOException
    //   598	603	1932	java/io/IOException
    //   623	631	1932	java/io/IOException
    //   651	667	1932	java/io/IOException
    //   694	699	1932	java/io/IOException
    //   719	729	1932	java/io/IOException
    //   729	774	1945	java/io/IOException
    //   774	783	1945	java/io/IOException
    //   783	830	1945	java/io/IOException
    //   833	838	1945	java/io/IOException
    //   841	859	1945	java/io/IOException
    //   862	870	1945	java/io/IOException
    //   873	878	1945	java/io/IOException
    //   881	903	1945	java/io/IOException
    //   922	928	1945	java/io/IOException
    //   952	979	1945	java/io/IOException
    //   1052	1082	1945	java/io/IOException
    //   1082	1100	1954	java/io/IOException
    //   1102	1110	1954	java/io/IOException
    //   1110	1118	1954	java/io/IOException
    //   1123	1139	1954	java/io/IOException
    //   1144	1187	1954	java/io/IOException
    //   460	511	1967	java/io/FileNotFoundException
    //   531	543	1981	java/io/FileNotFoundException
    //   563	575	1981	java/io/FileNotFoundException
    //   598	603	1981	java/io/FileNotFoundException
    //   623	631	1981	java/io/FileNotFoundException
    //   651	667	1981	java/io/FileNotFoundException
    //   694	699	2000	java/io/FileNotFoundException
    //   719	729	2000	java/io/FileNotFoundException
  }
  
  private boolean e()
  {
    if (this.p) {
      return false;
    }
    this.g = 3;
    this.h.a(this.g);
    publishProgress(new Integer[] { Integer.valueOf(0) });
    if (this.p) {
      return false;
    }
    Object localObject = com.ireadercity.b2.a.l + "/" + this.n;
    String str1 = y.e((String)localObject);
    com.ireadercity.b2.c.a locala = com.ireadercity.b2.c.a.a(this.l);
    try
    {
      if (!locala.f((String)localObject))
      {
        if (this.p) {
          return false;
        }
        str3 = v.a(this.n);
        str4 = a;
        new StringBuilder("insertBook=").append((String)localObject).toString();
        if (!this.i.b()) {
          break label258;
        }
        locala.a((String)localObject, this.h.e(), this.h.f(), this.h.d(), "", com.ireadercity.b2.a.o + "/" + this.o, "", "", 0, str3);
      }
      for (;;)
      {
        publishProgress(new Integer[] { Integer.valueOf(10) });
        if (!this.n.toLowerCase().endsWith("ylepub")) {
          break label566;
        }
        if (!this.p) {
          break;
        }
        return false;
        label258:
        locala.a((String)localObject, this.h.e(), this.h.f(), this.h.d(), "", com.ireadercity.b2.a.o + "/" + this.o, "", "", 1, str3);
      }
      localObject = com.ireadercity.b2.a.l + "/" + this.n + ".tmp";
    }
    catch (Exception localException1)
    {
      localException1.printStackTrace();
      return false;
    }
    String str3 = com.ireadercity.b2.a.n + "/" + localException1;
    String str4 = a;
    new StringBuilder().append(this.n).append(" unzip is started bookname=").append(this.n).toString();
    try
    {
      if (new File((String)localObject).exists()) {
        x.a((String)localObject, str3);
      }
      publishProgress(new Integer[] { Integer.valueOf(40) });
      if (this.p) {
        return false;
      }
    }
    catch (com.ireadercity.b2.d.a locala1)
    {
      locala1.printStackTrace();
      return false;
    }
    localObject = a;
    new StringBuilder().append(this.n).append(" unzip is done").toString();
    publishProgress(new Integer[] { Integer.valueOf(80) });
    localObject = a;
    new StringBuilder().append(this.n).append(" analysis is done").toString();
    while (this.p)
    {
      return false;
      label566:
      if (this.n.toLowerCase().endsWith("yltxt"))
      {
        try
        {
          localObject = new b();
          ((b)localObject).b(this.m);
          ((b)localObject).g(com.ireadercity.b2.a.l + "/" + this.n);
          com.ireadercity.b2.b.d.a((b)localObject);
          publishProgress(new Integer[] { Integer.valueOf(60) });
          if (this.p) {
            return false;
          }
          locala.a(locala1, this.h.e(), this.h.f(), this.h.d(), "", com.ireadercity.b2.a.o + "/" + this.o, "", "", 1, com.ireadercity.b2.a.T);
          publishProgress(new Integer[] { Integer.valueOf(80) });
        }
        catch (Exception localException2)
        {
          localException2.printStackTrace();
        }
      }
      else if (this.n.toLowerCase().endsWith("ylpdf"))
      {
        str2 = com.ireadercity.b2.a.l + "/" + this.n + ".tmp";
        str3 = com.ireadercity.b2.a.n + "/" + locala1;
        str4 = a;
        new StringBuilder().append(this.n).append(" unzip is started bookname=").append(this.n).toString();
        if (this.p) {
          return false;
        }
        try
        {
          x.a(str2, str3);
          publishProgress(new Integer[] { Integer.valueOf(70) });
          if (this.p) {
            return false;
          }
        }
        catch (com.ireadercity.b2.d.a locala2)
        {
          locala2.printStackTrace();
          return false;
        }
        str2 = a;
        new StringBuilder().append(this.n).append(" unzip is done").toString();
        locala.a(locala2, this.h.e(), this.h.f(), this.h.d());
        publishProgress(new Integer[] { Integer.valueOf(90) });
        str2 = a;
        new StringBuilder().append(this.n).append(" ======***ALL DONE***===").toString();
      }
    }
    new File(this.h.j()).renameTo(new File(com.ireadercity.b2.a.l + "/" + this.n));
    locala.d(locala2);
    locala.q(this.h.g());
    String str2 = this.h.m().d();
    a(locala.g(locala2), str2);
    publishProgress(new Integer[] { Integer.valueOf(100) });
    return true;
  }
  
  private String f()
  {
    this.n = v.a(this.h.h(), this.h.a());
    this.g = this.h.i();
    switch (this.g)
    {
    }
    try
    {
      if (c())
      {
        if (d())
        {
          if (e())
          {
            return "s";
            try
            {
              if (c())
              {
                if (d())
                {
                  if (e()) {
                    return "s";
                  }
                  return "f_handle book info failed";
                }
                return "f_download book failed";
              }
              return "f_download cover failed";
            }
            catch (Exception localException1)
            {
              localException1.printStackTrace();
              return "f_" + localException1.getStackTrace();
            }
            String str;
            try
            {
              if (d())
              {
                if (e()) {
                  return "s";
                }
                return "f_handle book info failed";
              }
              return "f_download book failed";
            }
            catch (Exception localException2)
            {
              localException2.printStackTrace();
              str = a;
              new StringBuilder().append(localException2.getStackTrace()).toString();
              return "f_" + localException2.getStackTrace();
            }
            try
            {
              if (e()) {
                return "s";
              }
              return "f_handle book info failed";
            }
            catch (Exception localException3)
            {
              localException3.printStackTrace();
              str = a;
              new StringBuilder().append(localException3.getStackTrace()).toString();
              return "f_" + localException3.getStackTrace();
            }
          }
          return "f_handle book info failed";
        }
        return "f_download book failed";
      }
      return "f_download cover failed";
    }
    catch (Exception localException4)
    {
      return "f_" + localException4.getStackTrace();
    }
  }
  
  public final void a()
  {
    this.p = true;
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      com.ireadercity.b2.bean.d locald1 = this.h;
      locald.a();
    }
  }
  
  public final void a(Context paramContext)
  {
    this.l = paramContext;
  }
  
  public final void a(ProgressBar paramProgressBar)
  {
    this.j = paramProgressBar;
  }
  
  public final void a(d paramd)
  {
    if (this.f == null) {
      this.f = new ArrayList();
    }
    if (paramd == null) {}
    while (this.f.contains(paramd)) {
      return;
    }
    this.f.add(paramd);
  }
  
  public final com.ireadercity.b2.bean.d b()
  {
    return this.h;
  }
  
  protected final void onPreExecute()
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext()) {
      ((d)localIterator.next()).a(this.h);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */