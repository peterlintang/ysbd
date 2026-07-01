package org.jsoup.helper;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Request;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.parser.TokenQueue;

public class HttpConnection$Response
  extends HttpConnection.Base<Connection.Response>
  implements Connection.Response
{
  private static final int MAX_REDIRECTS = 20;
  private ByteBuffer byteData;
  private String charset;
  private String contentType;
  private boolean executed = false;
  private int numRedirects = 0;
  private Connection.Request req;
  private int statusCode;
  private String statusMessage;
  
  HttpConnection$Response()
  {
    super(null);
  }
  
  private HttpConnection$Response(Response paramResponse)
  {
    super(null);
    if (paramResponse != null)
    {
      paramResponse.numRedirects += 1;
      if (this.numRedirects >= 20) {
        throw new IOException(String.format("Too many redirects occurred trying to load URL %s", new Object[] { paramResponse.url() }));
      }
    }
  }
  
  private static HttpURLConnection createConnection(Connection.Request paramRequest)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramRequest.url().openConnection();
    localHttpURLConnection.setRequestMethod(paramRequest.method().name());
    localHttpURLConnection.setInstanceFollowRedirects(false);
    localHttpURLConnection.setConnectTimeout(paramRequest.timeout());
    localHttpURLConnection.setReadTimeout(paramRequest.timeout());
    if (paramRequest.method() == Connection.Method.POST) {
      localHttpURLConnection.setDoOutput(true);
    }
    if (paramRequest.cookies().size() > 0) {
      localHttpURLConnection.addRequestProperty("Cookie", getRequestCookieString(paramRequest));
    }
    paramRequest = paramRequest.headers().entrySet().iterator();
    while (paramRequest.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramRequest.next();
      localHttpURLConnection.addRequestProperty((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    return localHttpURLConnection;
  }
  
  static Response execute(Connection.Request paramRequest)
  {
    return execute(paramRequest, null);
  }
  
  /* Error */
  static Response execute(Connection.Request paramRequest, Response paramResponse)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: aload_0
    //   7: ldc -99
    //   9: invokestatic 163	org/jsoup/helper/Validate:notNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: invokeinterface 57 1 0
    //   18: invokevirtual 166	java/net/URL:getProtocol	()Ljava/lang/String;
    //   21: astore 7
    //   23: aload 7
    //   25: ldc -88
    //   27: invokevirtual 172	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   30: ifne +23 -> 53
    //   33: aload 7
    //   35: ldc -82
    //   37: invokevirtual 172	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   40: ifne +13 -> 53
    //   43: new 176	java/net/MalformedURLException
    //   46: dup
    //   47: ldc -78
    //   49: invokespecial 179	java/net/MalformedURLException:<init>	(Ljava/lang/String;)V
    //   52: athrow
    //   53: aload_0
    //   54: invokeinterface 69 1 0
    //   59: getstatic 182	org/jsoup/Connection$Method:GET	Lorg/jsoup/Connection$Method;
    //   62: if_acmpne +21 -> 83
    //   65: aload_0
    //   66: invokeinterface 186 1 0
    //   71: invokeinterface 189 1 0
    //   76: ifle +7 -> 83
    //   79: aload_0
    //   80: invokestatic 193	org/jsoup/helper/HttpConnection$Response:serialiseRequestUrl	(Lorg/jsoup/Connection$Request;)V
    //   83: aload_0
    //   84: invokestatic 195	org/jsoup/helper/HttpConnection$Response:createConnection	(Lorg/jsoup/Connection$Request;)Ljava/net/HttpURLConnection;
    //   87: astore 7
    //   89: aload 7
    //   91: invokevirtual 198	java/net/HttpURLConnection:connect	()V
    //   94: aload_0
    //   95: invokeinterface 69 1 0
    //   100: getstatic 97	org/jsoup/Connection$Method:POST	Lorg/jsoup/Connection$Method;
    //   103: if_acmpne +17 -> 120
    //   106: aload_0
    //   107: invokeinterface 186 1 0
    //   112: aload 7
    //   114: invokevirtual 202	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   117: invokestatic 206	org/jsoup/helper/HttpConnection$Response:writePost	(Ljava/util/Collection;Ljava/io/OutputStream;)V
    //   120: aload 7
    //   122: invokevirtual 209	java/net/HttpURLConnection:getResponseCode	()I
    //   125: istore 4
    //   127: iconst_0
    //   128: istore_3
    //   129: iload_3
    //   130: istore_2
    //   131: iload 4
    //   133: sipush 200
    //   136: if_icmpeq +30 -> 166
    //   139: iload 4
    //   141: sipush 302
    //   144: if_icmpeq +484 -> 628
    //   147: iload 4
    //   149: sipush 301
    //   152: if_icmpeq +476 -> 628
    //   155: iload 4
    //   157: sipush 303
    //   160: if_icmpne +159 -> 319
    //   163: goto +465 -> 628
    //   166: new 2	org/jsoup/helper/HttpConnection$Response
    //   169: dup
    //   170: aload_1
    //   171: invokespecial 211	org/jsoup/helper/HttpConnection$Response:<init>	(Lorg/jsoup/helper/HttpConnection$Response;)V
    //   174: astore 8
    //   176: aload 8
    //   178: aload 7
    //   180: aload_1
    //   181: invokespecial 215	org/jsoup/helper/HttpConnection$Response:setupFromConnection	(Ljava/net/HttpURLConnection;Lorg/jsoup/Connection$Response;)V
    //   184: iload_2
    //   185: ifeq +180 -> 365
    //   188: aload_0
    //   189: invokeinterface 218 1 0
    //   194: ifeq +171 -> 365
    //   197: aload_0
    //   198: getstatic 182	org/jsoup/Connection$Method:GET	Lorg/jsoup/Connection$Method;
    //   201: invokeinterface 221 2 0
    //   206: pop
    //   207: aload_0
    //   208: invokeinterface 186 1 0
    //   213: invokeinterface 224 1 0
    //   218: aload_0
    //   219: new 59	java/net/URL
    //   222: dup
    //   223: aload_0
    //   224: invokeinterface 57 1 0
    //   229: aload 8
    //   231: ldc -30
    //   233: invokevirtual 230	org/jsoup/helper/HttpConnection$Response:header	(Ljava/lang/String;)Ljava/lang/String;
    //   236: invokespecial 233	java/net/URL:<init>	(Ljava/net/URL;Ljava/lang/String;)V
    //   239: invokeinterface 236 2 0
    //   244: pop
    //   245: aload 8
    //   247: getfield 239	org/jsoup/helper/HttpConnection$Response:cookies	Ljava/util/Map;
    //   250: invokeinterface 126 1 0
    //   255: invokeinterface 132 1 0
    //   260: astore_1
    //   261: aload_1
    //   262: invokeinterface 138 1 0
    //   267: ifeq +84 -> 351
    //   270: aload_1
    //   271: invokeinterface 142 1 0
    //   276: checkcast 144	java/util/Map$Entry
    //   279: astore 5
    //   281: aload_0
    //   282: aload 5
    //   284: invokeinterface 147 1 0
    //   289: checkcast 45	java/lang/String
    //   292: aload 5
    //   294: invokeinterface 150 1 0
    //   299: checkcast 45	java/lang/String
    //   302: invokeinterface 243 3 0
    //   307: pop
    //   308: goto -47 -> 261
    //   311: astore_0
    //   312: aload 7
    //   314: invokevirtual 246	java/net/HttpURLConnection:disconnect	()V
    //   317: aload_0
    //   318: athrow
    //   319: iload_3
    //   320: istore_2
    //   321: aload_0
    //   322: invokeinterface 249 1 0
    //   327: ifne -161 -> 166
    //   330: new 251	org/jsoup/HttpStatusException
    //   333: dup
    //   334: ldc -3
    //   336: iload 4
    //   338: aload_0
    //   339: invokeinterface 57 1 0
    //   344: invokevirtual 256	java/net/URL:toString	()Ljava/lang/String;
    //   347: invokespecial 259	org/jsoup/HttpStatusException:<init>	(Ljava/lang/String;ILjava/lang/String;)V
    //   350: athrow
    //   351: aload_0
    //   352: aload 8
    //   354: invokestatic 155	org/jsoup/helper/HttpConnection$Response:execute	(Lorg/jsoup/Connection$Request;Lorg/jsoup/helper/HttpConnection$Response;)Lorg/jsoup/helper/HttpConnection$Response;
    //   357: astore_0
    //   358: aload 7
    //   360: invokevirtual 246	java/net/HttpURLConnection:disconnect	()V
    //   363: aload_0
    //   364: areturn
    //   365: aload 8
    //   367: aload_0
    //   368: putfield 261	org/jsoup/helper/HttpConnection$Response:req	Lorg/jsoup/Connection$Request;
    //   371: aload 8
    //   373: invokevirtual 263	org/jsoup/helper/HttpConnection$Response:contentType	()Ljava/lang/String;
    //   376: astore_1
    //   377: aload_1
    //   378: ifnull +63 -> 441
    //   381: aload_0
    //   382: invokeinterface 266 1 0
    //   387: ifne +54 -> 441
    //   390: aload_1
    //   391: ldc_w 268
    //   394: invokevirtual 272	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   397: ifne +44 -> 441
    //   400: aload_1
    //   401: ldc_w 274
    //   404: invokevirtual 272	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   407: ifne +34 -> 441
    //   410: aload_1
    //   411: ldc_w 276
    //   414: invokevirtual 272	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   417: ifne +24 -> 441
    //   420: new 278	org/jsoup/UnsupportedMimeTypeException
    //   423: dup
    //   424: ldc_w 280
    //   427: aload_1
    //   428: aload_0
    //   429: invokeinterface 57 1 0
    //   434: invokevirtual 256	java/net/URL:toString	()Ljava/lang/String;
    //   437: invokespecial 283	org/jsoup/UnsupportedMimeTypeException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   440: athrow
    //   441: aload 7
    //   443: invokevirtual 287	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   446: ifnull +119 -> 565
    //   449: aload 7
    //   451: invokevirtual 287	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   454: astore_1
    //   455: aload 5
    //   457: astore_0
    //   458: aload 8
    //   460: ldc_w 289
    //   463: invokevirtual 292	org/jsoup/helper/HttpConnection$Response:hasHeader	(Ljava/lang/String;)Z
    //   466: ifeq +108 -> 574
    //   469: aload 5
    //   471: astore_0
    //   472: aload 8
    //   474: ldc_w 289
    //   477: invokevirtual 230	org/jsoup/helper/HttpConnection$Response:header	(Ljava/lang/String;)Ljava/lang/String;
    //   480: ldc_w 294
    //   483: invokevirtual 297	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   486: ifeq +88 -> 574
    //   489: aload 5
    //   491: astore_0
    //   492: new 299	java/io/BufferedInputStream
    //   495: dup
    //   496: new 301	java/util/zip/GZIPInputStream
    //   499: dup
    //   500: aload_1
    //   501: invokespecial 304	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   504: invokespecial 305	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   507: astore 5
    //   509: aload 5
    //   511: astore_0
    //   512: aload 8
    //   514: aload 5
    //   516: invokestatic 311	org/jsoup/helper/DataUtil:readToByteBuffer	(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;
    //   519: putfield 313	org/jsoup/helper/HttpConnection$Response:byteData	Ljava/nio/ByteBuffer;
    //   522: aload 5
    //   524: astore_0
    //   525: aload 8
    //   527: aload 8
    //   529: getfield 315	org/jsoup/helper/HttpConnection$Response:contentType	Ljava/lang/String;
    //   532: invokestatic 318	org/jsoup/helper/DataUtil:getCharsetFromContentType	(Ljava/lang/String;)Ljava/lang/String;
    //   535: putfield 320	org/jsoup/helper/HttpConnection$Response:charset	Ljava/lang/String;
    //   538: aload 5
    //   540: invokevirtual 325	java/io/InputStream:close	()V
    //   543: aload_1
    //   544: ifnull +7 -> 551
    //   547: aload_1
    //   548: invokevirtual 325	java/io/InputStream:close	()V
    //   551: aload 7
    //   553: invokevirtual 246	java/net/HttpURLConnection:disconnect	()V
    //   556: aload 8
    //   558: iconst_1
    //   559: putfield 29	org/jsoup/helper/HttpConnection$Response:executed	Z
    //   562: aload 8
    //   564: areturn
    //   565: aload 7
    //   567: invokevirtual 328	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   570: astore_1
    //   571: goto -116 -> 455
    //   574: aload 5
    //   576: astore_0
    //   577: new 299	java/io/BufferedInputStream
    //   580: dup
    //   581: aload_1
    //   582: invokespecial 305	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   585: astore 5
    //   587: goto -78 -> 509
    //   590: astore_1
    //   591: aconst_null
    //   592: astore 5
    //   594: aload 6
    //   596: astore_0
    //   597: aload_0
    //   598: ifnull +7 -> 605
    //   601: aload_0
    //   602: invokevirtual 325	java/io/InputStream:close	()V
    //   605: aload 5
    //   607: ifnull +8 -> 615
    //   610: aload 5
    //   612: invokevirtual 325	java/io/InputStream:close	()V
    //   615: aload_1
    //   616: athrow
    //   617: astore 6
    //   619: aload_1
    //   620: astore 5
    //   622: aload 6
    //   624: astore_1
    //   625: goto -28 -> 597
    //   628: iconst_1
    //   629: istore_2
    //   630: goto -464 -> 166
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	633	0	paramRequest	Connection.Request
    //   0	633	1	paramResponse	Response
    //   130	500	2	i	int
    //   128	192	3	j	int
    //   125	212	4	k	int
    //   1	620	5	localObject1	Object
    //   4	591	6	localObject2	Object
    //   617	6	6	localObject3	Object
    //   21	545	7	localObject4	Object
    //   174	389	8	localResponse	Response
    // Exception table:
    //   from	to	target	type
    //   89	120	311	finally
    //   120	127	311	finally
    //   166	184	311	finally
    //   188	261	311	finally
    //   261	308	311	finally
    //   321	351	311	finally
    //   351	358	311	finally
    //   365	377	311	finally
    //   381	441	311	finally
    //   538	543	311	finally
    //   547	551	311	finally
    //   601	605	311	finally
    //   610	615	311	finally
    //   615	617	311	finally
    //   441	455	590	finally
    //   565	571	590	finally
    //   458	469	617	finally
    //   472	489	617	finally
    //   492	509	617	finally
    //   512	522	617	finally
    //   525	538	617	finally
    //   577	587	617	finally
  }
  
  private static String getRequestCookieString(Connection.Request paramRequest)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    paramRequest = paramRequest.cookies().entrySet().iterator();
    int i = 1;
    if (paramRequest.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramRequest.next();
      if (i == 0) {
        localStringBuilder.append("; ");
      }
      for (;;)
      {
        localStringBuilder.append((String)localEntry.getKey()).append('=').append((String)localEntry.getValue());
        break;
        i = 0;
      }
    }
    return localStringBuilder.toString();
  }
  
  private static void serialiseRequestUrl(Connection.Request paramRequest)
  {
    Object localObject = paramRequest.url();
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 1;
    localStringBuilder.append(((URL)localObject).getProtocol()).append("://").append(((URL)localObject).getAuthority()).append(((URL)localObject).getPath()).append("?");
    if (((URL)localObject).getQuery() != null)
    {
      localStringBuilder.append(((URL)localObject).getQuery());
      i = 0;
    }
    localObject = paramRequest.data().iterator();
    if (((Iterator)localObject).hasNext())
    {
      Connection.KeyVal localKeyVal = (Connection.KeyVal)((Iterator)localObject).next();
      if (i == 0) {
        localStringBuilder.append('&');
      }
      for (;;)
      {
        localStringBuilder.append(URLEncoder.encode(localKeyVal.key(), "UTF-8")).append('=').append(URLEncoder.encode(localKeyVal.value(), "UTF-8"));
        break;
        i = 0;
      }
    }
    paramRequest.url(new URL(localStringBuilder.toString()));
    paramRequest.data().clear();
  }
  
  private void setupFromConnection(HttpURLConnection paramHttpURLConnection, Connection.Response paramResponse)
  {
    this.method = Connection.Method.valueOf(paramHttpURLConnection.getRequestMethod());
    this.url = paramHttpURLConnection.getURL();
    this.statusCode = paramHttpURLConnection.getResponseCode();
    this.statusMessage = paramHttpURLConnection.getResponseMessage();
    this.contentType = paramHttpURLConnection.getContentType();
    processResponseHeaders(paramHttpURLConnection.getHeaderFields());
    if (paramResponse != null)
    {
      paramHttpURLConnection = paramResponse.cookies().entrySet().iterator();
      while (paramHttpURLConnection.hasNext())
      {
        paramResponse = (Map.Entry)paramHttpURLConnection.next();
        if (!hasCookie((String)paramResponse.getKey())) {
          cookie((String)paramResponse.getKey(), (String)paramResponse.getValue());
        }
      }
    }
  }
  
  private static void writePost(Collection<Connection.KeyVal> paramCollection, OutputStream paramOutputStream)
  {
    paramOutputStream = new OutputStreamWriter(paramOutputStream, "UTF-8");
    paramCollection = paramCollection.iterator();
    int i = 1;
    if (paramCollection.hasNext())
    {
      Connection.KeyVal localKeyVal = (Connection.KeyVal)paramCollection.next();
      if (i == 0) {
        paramOutputStream.append('&');
      }
      for (;;)
      {
        paramOutputStream.write(URLEncoder.encode(localKeyVal.key(), "UTF-8"));
        paramOutputStream.write(61);
        paramOutputStream.write(URLEncoder.encode(localKeyVal.value(), "UTF-8"));
        break;
        i = 0;
      }
    }
    paramOutputStream.close();
  }
  
  public String body()
  {
    Validate.isTrue(this.executed, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
    if (this.charset == null) {}
    for (String str = Charset.forName("UTF-8").decode(this.byteData).toString();; str = Charset.forName(this.charset).decode(this.byteData).toString())
    {
      this.byteData.rewind();
      return str;
    }
  }
  
  public byte[] bodyAsBytes()
  {
    Validate.isTrue(this.executed, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
    return this.byteData.array();
  }
  
  public String charset()
  {
    return this.charset;
  }
  
  public String contentType()
  {
    return this.contentType;
  }
  
  public Document parse()
  {
    Validate.isTrue(this.executed, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
    Document localDocument = DataUtil.parseByteData(this.byteData, this.charset, this.url.toExternalForm(), this.req.parser());
    this.byteData.rewind();
    this.charset = localDocument.outputSettings().charset().name();
    return localDocument;
  }
  
  void processResponseHeaders(Map<String, List<String>> paramMap)
  {
    Iterator localIterator1 = paramMap.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Object localObject = (Map.Entry)localIterator1.next();
      paramMap = (String)((Map.Entry)localObject).getKey();
      if (paramMap != null)
      {
        localObject = (List)((Map.Entry)localObject).getValue();
        if (paramMap.equalsIgnoreCase("Set-Cookie"))
        {
          Iterator localIterator2 = ((List)localObject).iterator();
          while (localIterator2.hasNext())
          {
            paramMap = (String)localIterator2.next();
            if (paramMap != null)
            {
              paramMap = new TokenQueue(paramMap);
              String str = paramMap.chompTo("=").trim();
              localObject = paramMap.consumeTo(";").trim();
              paramMap = (Map<String, List<String>>)localObject;
              if (localObject == null) {
                paramMap = "";
              }
              if ((str != null) && (str.length() > 0)) {
                cookie(str, paramMap);
              }
            }
          }
        }
        else if (!((List)localObject).isEmpty())
        {
          header(paramMap, (String)((List)localObject).get(0));
        }
      }
    }
  }
  
  public int statusCode()
  {
    return this.statusCode;
  }
  
  public String statusMessage()
  {
    return this.statusMessage;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\helper\HttpConnection$Response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */