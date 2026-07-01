package com.iflytek.speech;

class SpeechUtility$HttpGetThread
  extends Thread
{
  private SpeechUtility.RequestComponentUrlListener mListener;
  private String mUrl;
  
  public SpeechUtility$HttpGetThread(SpeechUtility paramSpeechUtility, String paramString, SpeechUtility.RequestComponentUrlListener paramRequestComponentUrlListener)
  {
    this.mUrl = paramString;
    this.mListener = paramRequestComponentUrlListener;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: new 29	org/apache/http/impl/client/DefaultHttpClient
    //   3: dup
    //   4: invokespecial 30	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   7: new 32	org/apache/http/client/methods/HttpGet
    //   10: dup
    //   11: aload_0
    //   12: getfield 19	com/iflytek/speech/SpeechUtility$HttpGetThread:mUrl	Ljava/lang/String;
    //   15: invokevirtual 38	java/lang/String:toString	()Ljava/lang/String;
    //   18: invokespecial 41	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   21: invokeinterface 47 2 0
    //   26: astore_1
    //   27: aload_1
    //   28: invokeinterface 53 1 0
    //   33: invokeinterface 59 1 0
    //   38: sipush 200
    //   41: if_icmpne +60 -> 101
    //   44: new 61	java/io/BufferedReader
    //   47: dup
    //   48: new 63	java/io/InputStreamReader
    //   51: dup
    //   52: aload_1
    //   53: invokeinterface 67 1 0
    //   58: invokeinterface 73 1 0
    //   63: invokespecial 76	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   66: invokespecial 79	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   69: astore_1
    //   70: new 81	java/lang/StringBuffer
    //   73: dup
    //   74: invokespecial 82	java/lang/StringBuffer:<init>	()V
    //   77: astore_2
    //   78: aload_1
    //   79: invokevirtual 85	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   82: astore_3
    //   83: aload_3
    //   84: ifnull +38 -> 122
    //   87: aload_2
    //   88: aload_3
    //   89: invokevirtual 89	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   92: pop
    //   93: goto -15 -> 78
    //   96: astore_1
    //   97: aload_1
    //   98: invokevirtual 92	org/apache/http/client/ClientProtocolException:printStackTrace	()V
    //   101: aload_0
    //   102: getfield 21	com/iflytek/speech/SpeechUtility$HttpGetThread:mListener	Lcom/iflytek/speech/SpeechUtility$RequestComponentUrlListener;
    //   105: ifnull +16 -> 121
    //   108: aload_0
    //   109: getfield 21	com/iflytek/speech/SpeechUtility$HttpGetThread:mListener	Lcom/iflytek/speech/SpeechUtility$RequestComponentUrlListener;
    //   112: aconst_null
    //   113: sipush 20003
    //   116: invokeinterface 98 3 0
    //   121: return
    //   122: aload_2
    //   123: invokevirtual 99	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   126: astore_1
    //   127: aload_0
    //   128: getfield 21	com/iflytek/speech/SpeechUtility$HttpGetThread:mListener	Lcom/iflytek/speech/SpeechUtility$RequestComponentUrlListener;
    //   131: ifnull -10 -> 121
    //   134: aload_0
    //   135: getfield 21	com/iflytek/speech/SpeechUtility$HttpGetThread:mListener	Lcom/iflytek/speech/SpeechUtility$RequestComponentUrlListener;
    //   138: aload_1
    //   139: iconst_0
    //   140: invokeinterface 98 3 0
    //   145: return
    //   146: astore_1
    //   147: aload_1
    //   148: invokevirtual 100	java/io/IOException:printStackTrace	()V
    //   151: goto -50 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	154	0	this	HttpGetThread
    //   26	53	1	localObject	Object
    //   96	2	1	localClientProtocolException	org.apache.http.client.ClientProtocolException
    //   126	13	1	str1	String
    //   146	2	1	localIOException	java.io.IOException
    //   77	46	2	localStringBuffer	StringBuffer
    //   82	7	3	str2	String
    // Exception table:
    //   from	to	target	type
    //   0	78	96	org/apache/http/client/ClientProtocolException
    //   78	83	96	org/apache/http/client/ClientProtocolException
    //   87	93	96	org/apache/http/client/ClientProtocolException
    //   122	145	96	org/apache/http/client/ClientProtocolException
    //   0	78	146	java/io/IOException
    //   78	83	146	java/io/IOException
    //   87	93	146	java/io/IOException
    //   122	145	146	java/io/IOException
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\SpeechUtility$HttpGetThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */