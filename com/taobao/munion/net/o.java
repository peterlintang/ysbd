package com.taobao.munion.net;

import com.taobao.munion.threadpool2.d;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.FutureTask;

class o
{
  static o.a a = new o.a();
  private static HashMap<String, String> b = new HashMap();
  private static HashMap<String, String> c = new HashMap();
  private static final boolean d = true;
  
  public static String a(String paramString, long paramLong)
  {
    return paramString;
  }
  
  public static void a()
  {
    synchronized (b)
    {
      b.clear();
    }
    synchronized (b)
    {
      c.clear();
      return;
      localObject1 = finally;
      throw ((Throwable)localObject1);
    }
  }
  
  public static void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return;
    }
    synchronized (b)
    {
      if (b.containsKey(paramString)) {
        return;
      }
    }
    synchronized (c)
    {
      if (!c.containsKey(paramString))
      {
        c.put(paramString, paramString);
        new d(new Thread(new FutureTask(new o.b(paramString))), 3).b();
        return;
      }
      return;
    }
  }
  
  public static void a(List<String> paramList)
  {
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      a((String)paramList.get(i));
      i += 1;
    }
  }
  
  public static void b(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return;
    }
    synchronized (b)
    {
      b.remove(paramString);
      return;
    }
  }
  
  /* Error */
  private static String d(String paramString)
  {
    // Byte code:
    //   0: ldc 98
    //   2: astore 6
    //   4: aload 6
    //   6: astore 7
    //   8: aload 6
    //   10: astore 5
    //   12: aload 6
    //   14: astore 8
    //   16: invokestatic 104	java/lang/System:nanoTime	()J
    //   19: lstore_1
    //   20: aload 6
    //   22: astore 7
    //   24: aload 6
    //   26: astore 5
    //   28: aload 6
    //   30: astore 8
    //   32: aload_0
    //   33: invokestatic 110	java/net/InetAddress:getByName	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   36: astore 9
    //   38: aload 9
    //   40: ifnull +537 -> 577
    //   43: aload 6
    //   45: astore 7
    //   47: aload 6
    //   49: astore 5
    //   51: aload 6
    //   53: astore 8
    //   55: aload 9
    //   57: invokevirtual 114	java/net/InetAddress:getHostAddress	()Ljava/lang/String;
    //   60: astore 6
    //   62: aload 6
    //   64: astore 7
    //   66: aload 6
    //   68: astore 5
    //   70: aload 6
    //   72: astore 8
    //   74: getstatic 22	com/taobao/munion/net/o:a	Lcom/taobao/munion/net/o$a;
    //   77: astore 9
    //   79: aload 6
    //   81: astore 7
    //   83: aload 6
    //   85: astore 5
    //   87: aload 6
    //   89: astore 8
    //   91: aload 9
    //   93: monitorenter
    //   94: getstatic 22	com/taobao/munion/net/o:a	Lcom/taobao/munion/net/o$a;
    //   97: astore 5
    //   99: aload 5
    //   101: getfield 117	com/taobao/munion/net/o$a:a	J
    //   104: lstore_3
    //   105: aload 5
    //   107: invokestatic 104	java/lang/System:nanoTime	()J
    //   110: lload_1
    //   111: lsub
    //   112: ldc2_w 118
    //   115: ldiv
    //   116: lload_3
    //   117: ladd
    //   118: putfield 117	com/taobao/munion/net/o$a:a	J
    //   121: getstatic 22	com/taobao/munion/net/o:a	Lcom/taobao/munion/net/o$a;
    //   124: astore 5
    //   126: aload 5
    //   128: aload 5
    //   130: getfield 121	com/taobao/munion/net/o$a:c	J
    //   133: lconst_1
    //   134: ladd
    //   135: putfield 121	com/taobao/munion/net/o$a:c	J
    //   138: aload 9
    //   140: monitorexit
    //   141: aload 6
    //   143: astore 5
    //   145: getstatic 27	com/taobao/munion/net/o:b	Ljava/util/HashMap;
    //   148: astore 6
    //   150: aload 6
    //   152: monitorenter
    //   153: aload 5
    //   155: ifnull +21 -> 176
    //   158: aload 5
    //   160: invokevirtual 42	java/lang/String:length	()I
    //   163: ifle +13 -> 176
    //   166: getstatic 27	com/taobao/munion/net/o:b	Ljava/util/HashMap;
    //   169: aload_0
    //   170: aload 5
    //   172: invokevirtual 50	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   175: pop
    //   176: aload 6
    //   178: monitorexit
    //   179: getstatic 29	com/taobao/munion/net/o:c	Ljava/util/HashMap;
    //   182: astore 6
    //   184: aload 6
    //   186: monitorenter
    //   187: getstatic 29	com/taobao/munion/net/o:c	Ljava/util/HashMap;
    //   190: aload_0
    //   191: invokevirtual 89	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   194: pop
    //   195: aload 6
    //   197: monitorexit
    //   198: aload 5
    //   200: areturn
    //   201: astore 10
    //   203: aload 6
    //   205: astore 7
    //   207: aload 6
    //   209: astore 5
    //   211: aload 6
    //   213: astore 8
    //   215: aload 9
    //   217: monitorexit
    //   218: aload 6
    //   220: astore 7
    //   222: aload 6
    //   224: astore 5
    //   226: aload 6
    //   228: astore 8
    //   230: aload 10
    //   232: athrow
    //   233: astore 8
    //   235: aload 7
    //   237: astore 5
    //   239: getstatic 22	com/taobao/munion/net/o:a	Lcom/taobao/munion/net/o$a;
    //   242: astore 6
    //   244: aload 7
    //   246: astore 5
    //   248: aload 6
    //   250: monitorenter
    //   251: getstatic 22	com/taobao/munion/net/o:a	Lcom/taobao/munion/net/o$a;
    //   254: astore 5
    //   256: aload 5
    //   258: aload 5
    //   260: getfield 123	com/taobao/munion/net/o$a:b	J
    //   263: lconst_1
    //   264: ladd
    //   265: putfield 123	com/taobao/munion/net/o$a:b	J
    //   268: aload 6
    //   270: monitorexit
    //   271: aload 7
    //   273: astore 5
    //   275: aload 8
    //   277: invokevirtual 126	java/net/UnknownHostException:printStackTrace	()V
    //   280: getstatic 27	com/taobao/munion/net/o:b	Ljava/util/HashMap;
    //   283: astore 5
    //   285: aload 5
    //   287: monitorenter
    //   288: ldc 98
    //   290: ifnull +21 -> 311
    //   293: ldc 98
    //   295: invokevirtual 42	java/lang/String:length	()I
    //   298: ifle +13 -> 311
    //   301: getstatic 27	com/taobao/munion/net/o:b	Ljava/util/HashMap;
    //   304: aload_0
    //   305: ldc 98
    //   307: invokevirtual 50	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   310: pop
    //   311: aload 5
    //   313: monitorexit
    //   314: getstatic 29	com/taobao/munion/net/o:c	Ljava/util/HashMap;
    //   317: astore 5
    //   319: aload 5
    //   321: monitorenter
    //   322: getstatic 29	com/taobao/munion/net/o:c	Ljava/util/HashMap;
    //   325: aload_0
    //   326: invokevirtual 89	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   329: pop
    //   330: aload 5
    //   332: monitorexit
    //   333: ldc 98
    //   335: areturn
    //   336: astore_0
    //   337: aload 5
    //   339: monitorexit
    //   340: aload_0
    //   341: athrow
    //   342: astore 8
    //   344: aload 7
    //   346: astore 5
    //   348: aload 6
    //   350: monitorexit
    //   351: aload 7
    //   353: astore 5
    //   355: aload 8
    //   357: athrow
    //   358: astore 6
    //   360: getstatic 27	com/taobao/munion/net/o:b	Ljava/util/HashMap;
    //   363: astore 7
    //   365: aload 7
    //   367: monitorenter
    //   368: aload 5
    //   370: ifnull +21 -> 391
    //   373: aload 5
    //   375: invokevirtual 42	java/lang/String:length	()I
    //   378: ifle +13 -> 391
    //   381: getstatic 27	com/taobao/munion/net/o:b	Ljava/util/HashMap;
    //   384: aload_0
    //   385: aload 5
    //   387: invokevirtual 50	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   390: pop
    //   391: aload 7
    //   393: monitorexit
    //   394: getstatic 29	com/taobao/munion/net/o:c	Ljava/util/HashMap;
    //   397: astore 5
    //   399: aload 5
    //   401: monitorenter
    //   402: getstatic 29	com/taobao/munion/net/o:c	Ljava/util/HashMap;
    //   405: aload_0
    //   406: invokevirtual 89	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   409: pop
    //   410: aload 5
    //   412: monitorexit
    //   413: aload 6
    //   415: athrow
    //   416: astore 7
    //   418: aload 8
    //   420: astore 5
    //   422: getstatic 22	com/taobao/munion/net/o:a	Lcom/taobao/munion/net/o$a;
    //   425: astore 6
    //   427: aload 8
    //   429: astore 5
    //   431: aload 6
    //   433: monitorenter
    //   434: getstatic 22	com/taobao/munion/net/o:a	Lcom/taobao/munion/net/o$a;
    //   437: astore 5
    //   439: aload 5
    //   441: aload 5
    //   443: getfield 123	com/taobao/munion/net/o$a:b	J
    //   446: lconst_1
    //   447: ladd
    //   448: putfield 123	com/taobao/munion/net/o$a:b	J
    //   451: aload 6
    //   453: monitorexit
    //   454: aload 8
    //   456: astore 5
    //   458: aload 7
    //   460: invokevirtual 127	java/lang/Exception:printStackTrace	()V
    //   463: getstatic 27	com/taobao/munion/net/o:b	Ljava/util/HashMap;
    //   466: astore 5
    //   468: aload 5
    //   470: monitorenter
    //   471: ldc 98
    //   473: ifnull +21 -> 494
    //   476: ldc 98
    //   478: invokevirtual 42	java/lang/String:length	()I
    //   481: ifle +13 -> 494
    //   484: getstatic 27	com/taobao/munion/net/o:b	Ljava/util/HashMap;
    //   487: aload_0
    //   488: ldc 98
    //   490: invokevirtual 50	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   493: pop
    //   494: aload 5
    //   496: monitorexit
    //   497: getstatic 29	com/taobao/munion/net/o:c	Ljava/util/HashMap;
    //   500: astore 5
    //   502: aload 5
    //   504: monitorenter
    //   505: getstatic 29	com/taobao/munion/net/o:c	Ljava/util/HashMap;
    //   508: aload_0
    //   509: invokevirtual 89	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   512: pop
    //   513: aload 5
    //   515: monitorexit
    //   516: ldc 98
    //   518: areturn
    //   519: astore_0
    //   520: aload 5
    //   522: monitorexit
    //   523: aload_0
    //   524: athrow
    //   525: astore 7
    //   527: aload 8
    //   529: astore 5
    //   531: aload 6
    //   533: monitorexit
    //   534: aload 8
    //   536: astore 5
    //   538: aload 7
    //   540: athrow
    //   541: astore_0
    //   542: aload 7
    //   544: monitorexit
    //   545: aload_0
    //   546: athrow
    //   547: astore_0
    //   548: aload 5
    //   550: monitorexit
    //   551: aload_0
    //   552: athrow
    //   553: astore_0
    //   554: aload 5
    //   556: monitorexit
    //   557: aload_0
    //   558: athrow
    //   559: astore_0
    //   560: aload 5
    //   562: monitorexit
    //   563: aload_0
    //   564: athrow
    //   565: astore_0
    //   566: aload 6
    //   568: monitorexit
    //   569: aload_0
    //   570: athrow
    //   571: astore_0
    //   572: aload 6
    //   574: monitorexit
    //   575: aload_0
    //   576: athrow
    //   577: ldc 98
    //   579: astore 5
    //   581: goto -436 -> 145
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	584	0	paramString	String
    //   19	92	1	l1	long
    //   104	13	3	l2	long
    //   2	347	6	localObject2	Object
    //   358	56	6	localObject3	Object
    //   425	148	6	locala	o.a
    //   6	386	7	localObject4	Object
    //   416	43	7	localException	Exception
    //   525	18	7	localObject5	Object
    //   14	215	8	localObject6	Object
    //   233	43	8	localUnknownHostException	java.net.UnknownHostException
    //   342	193	8	localObject7	Object
    //   36	180	9	localObject8	Object
    //   201	30	10	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   94	141	201	finally
    //   16	20	233	java/net/UnknownHostException
    //   32	38	233	java/net/UnknownHostException
    //   55	62	233	java/net/UnknownHostException
    //   74	79	233	java/net/UnknownHostException
    //   91	94	233	java/net/UnknownHostException
    //   215	218	233	java/net/UnknownHostException
    //   230	233	233	java/net/UnknownHostException
    //   322	333	336	finally
    //   251	271	342	finally
    //   16	20	358	finally
    //   32	38	358	finally
    //   55	62	358	finally
    //   74	79	358	finally
    //   91	94	358	finally
    //   215	218	358	finally
    //   230	233	358	finally
    //   239	244	358	finally
    //   248	251	358	finally
    //   275	280	358	finally
    //   348	351	358	finally
    //   355	358	358	finally
    //   422	427	358	finally
    //   431	434	358	finally
    //   458	463	358	finally
    //   531	534	358	finally
    //   538	541	358	finally
    //   16	20	416	java/lang/Exception
    //   32	38	416	java/lang/Exception
    //   55	62	416	java/lang/Exception
    //   74	79	416	java/lang/Exception
    //   91	94	416	java/lang/Exception
    //   215	218	416	java/lang/Exception
    //   230	233	416	java/lang/Exception
    //   505	516	519	finally
    //   434	454	525	finally
    //   373	391	541	finally
    //   391	394	541	finally
    //   402	413	547	finally
    //   293	311	553	finally
    //   311	314	553	finally
    //   476	494	559	finally
    //   494	497	559	finally
    //   158	176	565	finally
    //   176	179	565	finally
    //   187	198	571	finally
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */