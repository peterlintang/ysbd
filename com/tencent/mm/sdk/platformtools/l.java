package com.tencent.mm.sdk.platformtools;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

final class l
{
  private static int a = 10000;
  private static int b = 10000;
  private TelephonyManager c;
  private int d;
  private PhoneStateListener e = new m(this);
  
  /* Error */
  public static java.util.List<h> a(android.content.Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 38
    //   3: invokevirtual 44	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   6: checkcast 46	android/telephony/TelephonyManager
    //   9: astore 7
    //   11: new 48	java/util/LinkedList
    //   14: dup
    //   15: invokespecial 49	java/util/LinkedList:<init>	()V
    //   18: astore 6
    //   20: ldc 51
    //   22: astore 4
    //   24: ldc 53
    //   26: astore 5
    //   28: aload 7
    //   30: invokevirtual 57	android/telephony/TelephonyManager:getNetworkOperator	()Ljava/lang/String;
    //   33: astore_3
    //   34: aload_3
    //   35: ifnull +172 -> 207
    //   38: aload_3
    //   39: ldc 53
    //   41: invokevirtual 63	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   44: ifne +163 -> 207
    //   47: aload_3
    //   48: iconst_0
    //   49: iconst_3
    //   50: invokevirtual 67	java/lang/String:substring	(II)Ljava/lang/String;
    //   53: astore_0
    //   54: aload_3
    //   55: iconst_3
    //   56: iconst_5
    //   57: invokevirtual 67	java/lang/String:substring	(II)Ljava/lang/String;
    //   60: astore_3
    //   61: aload 7
    //   63: invokevirtual 71	android/telephony/TelephonyManager:getPhoneType	()I
    //   66: iconst_2
    //   67: if_icmpne +484 -> 551
    //   70: aload 7
    //   72: invokevirtual 75	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   75: checkcast 77	android/telephony/cdma/CdmaCellLocation
    //   78: astore 5
    //   80: aload 5
    //   82: ifnull +122 -> 204
    //   85: getstatic 18	com/tencent/mm/sdk/platformtools/l:b	I
    //   88: getstatic 16	com/tencent/mm/sdk/platformtools/l:a	I
    //   91: if_icmpne +177 -> 268
    //   94: ldc 53
    //   96: astore 4
    //   98: aload 5
    //   100: invokevirtual 80	android/telephony/cdma/CdmaCellLocation:getBaseStationId	()I
    //   103: iconst_m1
    //   104: if_icmpeq +100 -> 204
    //   107: aload 5
    //   109: invokevirtual 83	android/telephony/cdma/CdmaCellLocation:getNetworkId	()I
    //   112: iconst_m1
    //   113: if_icmpeq +91 -> 204
    //   116: aload 5
    //   118: invokevirtual 86	android/telephony/cdma/CdmaCellLocation:getSystemId	()I
    //   121: iconst_m1
    //   122: if_icmpeq +82 -> 204
    //   125: aload 6
    //   127: new 88	com/tencent/mm/sdk/platformtools/h
    //   130: dup
    //   131: aload_0
    //   132: aload_3
    //   133: ldc 53
    //   135: ldc 53
    //   137: aload 4
    //   139: ldc 90
    //   141: new 92	java/lang/StringBuilder
    //   144: dup
    //   145: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   148: aload 5
    //   150: invokevirtual 80	android/telephony/cdma/CdmaCellLocation:getBaseStationId	()I
    //   153: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   156: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: new 92	java/lang/StringBuilder
    //   162: dup
    //   163: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   166: aload 5
    //   168: invokevirtual 83	android/telephony/cdma/CdmaCellLocation:getNetworkId	()I
    //   171: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   174: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   177: new 92	java/lang/StringBuilder
    //   180: dup
    //   181: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   184: aload 5
    //   186: invokevirtual 86	android/telephony/cdma/CdmaCellLocation:getSystemId	()I
    //   189: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   192: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   195: invokespecial 103	com/tencent/mm/sdk/platformtools/h:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   198: invokeinterface 108 2 0
    //   203: pop
    //   204: aload 6
    //   206: areturn
    //   207: aload 7
    //   209: invokevirtual 111	android/telephony/TelephonyManager:getSimOperator	()Ljava/lang/String;
    //   212: astore 8
    //   214: aload 5
    //   216: astore_3
    //   217: aload 4
    //   219: astore_0
    //   220: aload 8
    //   222: ifnull +35 -> 257
    //   225: aload 5
    //   227: astore_3
    //   228: aload 4
    //   230: astore_0
    //   231: aload 8
    //   233: ldc 53
    //   235: invokevirtual 63	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   238: ifne +19 -> 257
    //   241: aload 8
    //   243: iconst_0
    //   244: iconst_3
    //   245: invokevirtual 67	java/lang/String:substring	(II)Ljava/lang/String;
    //   248: astore_0
    //   249: aload 8
    //   251: iconst_3
    //   252: iconst_5
    //   253: invokevirtual 67	java/lang/String:substring	(II)Ljava/lang/String;
    //   256: astore_3
    //   257: goto -196 -> 61
    //   260: astore_0
    //   261: aload_0
    //   262: invokevirtual 114	java/lang/Exception:printStackTrace	()V
    //   265: aload 6
    //   267: areturn
    //   268: new 92	java/lang/StringBuilder
    //   271: dup
    //   272: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   275: getstatic 18	com/tencent/mm/sdk/platformtools/l:b	I
    //   278: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   281: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   284: astore 4
    //   286: goto -188 -> 98
    //   289: astore 4
    //   291: aload 7
    //   293: invokevirtual 75	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   296: checkcast 116	android/telephony/gsm/GsmCellLocation
    //   299: astore 4
    //   301: aload 4
    //   303: ifnull +66 -> 369
    //   306: aload 4
    //   308: invokevirtual 119	android/telephony/gsm/GsmCellLocation:getCid	()I
    //   311: istore_1
    //   312: aload 4
    //   314: invokevirtual 122	android/telephony/gsm/GsmCellLocation:getLac	()I
    //   317: istore_2
    //   318: iload_2
    //   319: ldc 123
    //   321: if_icmpge +48 -> 369
    //   324: iload_2
    //   325: iconst_m1
    //   326: if_icmpeq +43 -> 369
    //   329: iload_1
    //   330: iconst_m1
    //   331: if_icmpeq +38 -> 369
    //   334: aload 6
    //   336: new 88	com/tencent/mm/sdk/platformtools/h
    //   339: dup
    //   340: aload_0
    //   341: aload_3
    //   342: iload_2
    //   343: invokestatic 127	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   346: iload_1
    //   347: invokestatic 127	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   350: ldc 53
    //   352: ldc -127
    //   354: ldc 53
    //   356: ldc 53
    //   358: ldc 53
    //   360: invokespecial 103	com/tencent/mm/sdk/platformtools/h:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   363: invokeinterface 108 2 0
    //   368: pop
    //   369: aload 7
    //   371: invokevirtual 133	android/telephony/TelephonyManager:getNeighboringCellInfo	()Ljava/util/List;
    //   374: astore 4
    //   376: aload 4
    //   378: ifnull -174 -> 204
    //   381: aload 4
    //   383: invokeinterface 136 1 0
    //   388: ifle -184 -> 204
    //   391: aload 4
    //   393: invokeinterface 140 1 0
    //   398: astore 4
    //   400: aload 4
    //   402: invokeinterface 146 1 0
    //   407: ifeq -203 -> 204
    //   410: aload 4
    //   412: invokeinterface 150 1 0
    //   417: checkcast 152	android/telephony/NeighboringCellInfo
    //   420: astore 5
    //   422: aload 5
    //   424: invokevirtual 153	android/telephony/NeighboringCellInfo:getCid	()I
    //   427: iconst_m1
    //   428: if_icmpeq -28 -> 400
    //   431: aload 5
    //   433: invokevirtual 154	android/telephony/NeighboringCellInfo:getLac	()I
    //   436: ldc 123
    //   438: if_icmpgt -38 -> 400
    //   441: aload 5
    //   443: invokevirtual 154	android/telephony/NeighboringCellInfo:getLac	()I
    //   446: iconst_m1
    //   447: if_icmpeq -47 -> 400
    //   450: new 92	java/lang/StringBuilder
    //   453: dup
    //   454: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   457: aload 5
    //   459: invokevirtual 157	android/telephony/NeighboringCellInfo:getRssi	()I
    //   462: iconst_2
    //   463: imul
    //   464: bipush 113
    //   466: isub
    //   467: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   470: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   473: astore 7
    //   475: aload 6
    //   477: new 88	com/tencent/mm/sdk/platformtools/h
    //   480: dup
    //   481: aload_0
    //   482: aload_3
    //   483: new 92	java/lang/StringBuilder
    //   486: dup
    //   487: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   490: aload 5
    //   492: invokevirtual 154	android/telephony/NeighboringCellInfo:getLac	()I
    //   495: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   498: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   501: new 92	java/lang/StringBuilder
    //   504: dup
    //   505: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   508: aload 5
    //   510: invokevirtual 153	android/telephony/NeighboringCellInfo:getCid	()I
    //   513: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   516: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   519: aload 7
    //   521: ldc -127
    //   523: ldc 53
    //   525: ldc 53
    //   527: ldc 53
    //   529: invokespecial 103	com/tencent/mm/sdk/platformtools/h:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   532: invokeinterface 108 2 0
    //   537: pop
    //   538: goto -138 -> 400
    //   541: astore 4
    //   543: aload 4
    //   545: invokevirtual 114	java/lang/Exception:printStackTrace	()V
    //   548: goto -179 -> 369
    //   551: aload 7
    //   553: invokevirtual 75	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   556: checkcast 116	android/telephony/gsm/GsmCellLocation
    //   559: astore 4
    //   561: aload 4
    //   563: ifnull +79 -> 642
    //   566: aload 4
    //   568: invokevirtual 119	android/telephony/gsm/GsmCellLocation:getCid	()I
    //   571: istore_1
    //   572: aload 4
    //   574: invokevirtual 122	android/telephony/gsm/GsmCellLocation:getLac	()I
    //   577: istore_2
    //   578: iload_2
    //   579: ldc 123
    //   581: if_icmpge +61 -> 642
    //   584: iload_2
    //   585: iconst_m1
    //   586: if_icmpeq +56 -> 642
    //   589: iload_1
    //   590: iconst_m1
    //   591: if_icmpeq +51 -> 642
    //   594: getstatic 18	com/tencent/mm/sdk/platformtools/l:b	I
    //   597: getstatic 16	com/tencent/mm/sdk/platformtools/l:a	I
    //   600: if_icmpne +253 -> 853
    //   603: ldc 53
    //   605: astore 4
    //   607: aload 6
    //   609: new 88	com/tencent/mm/sdk/platformtools/h
    //   612: dup
    //   613: aload_0
    //   614: aload_3
    //   615: iload_2
    //   616: invokestatic 127	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   619: iload_1
    //   620: invokestatic 127	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   623: aload 4
    //   625: ldc -127
    //   627: ldc 53
    //   629: ldc 53
    //   631: ldc 53
    //   633: invokespecial 103	com/tencent/mm/sdk/platformtools/h:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   636: invokeinterface 108 2 0
    //   641: pop
    //   642: aload 7
    //   644: invokevirtual 133	android/telephony/TelephonyManager:getNeighboringCellInfo	()Ljava/util/List;
    //   647: astore 4
    //   649: aload 4
    //   651: ifnull -447 -> 204
    //   654: aload 4
    //   656: invokeinterface 136 1 0
    //   661: ifle -457 -> 204
    //   664: aload 4
    //   666: invokeinterface 140 1 0
    //   671: astore 4
    //   673: aload 4
    //   675: invokeinterface 146 1 0
    //   680: ifeq -476 -> 204
    //   683: aload 4
    //   685: invokeinterface 150 1 0
    //   690: checkcast 152	android/telephony/NeighboringCellInfo
    //   693: astore 5
    //   695: aload 5
    //   697: invokevirtual 153	android/telephony/NeighboringCellInfo:getCid	()I
    //   700: iconst_m1
    //   701: if_icmpeq -28 -> 673
    //   704: aload 5
    //   706: invokevirtual 154	android/telephony/NeighboringCellInfo:getLac	()I
    //   709: ldc 123
    //   711: if_icmpgt -38 -> 673
    //   714: new 92	java/lang/StringBuilder
    //   717: dup
    //   718: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   721: aload 5
    //   723: invokevirtual 157	android/telephony/NeighboringCellInfo:getRssi	()I
    //   726: iconst_2
    //   727: imul
    //   728: bipush 113
    //   730: isub
    //   731: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   734: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   737: astore 7
    //   739: ldc -97
    //   741: new 92	java/lang/StringBuilder
    //   744: dup
    //   745: ldc -95
    //   747: invokespecial 164	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   750: aload 5
    //   752: invokevirtual 154	android/telephony/NeighboringCellInfo:getLac	()I
    //   755: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   758: ldc -90
    //   760: invokevirtual 169	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   763: aload 5
    //   765: invokevirtual 153	android/telephony/NeighboringCellInfo:getCid	()I
    //   768: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   771: ldc -85
    //   773: invokevirtual 169	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   776: aload 7
    //   778: invokevirtual 169	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   781: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   784: invokestatic 176	com/tencent/mm/sdk/platformtools/c:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   787: aload 6
    //   789: new 88	com/tencent/mm/sdk/platformtools/h
    //   792: dup
    //   793: aload_0
    //   794: aload_3
    //   795: new 92	java/lang/StringBuilder
    //   798: dup
    //   799: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   802: aload 5
    //   804: invokevirtual 154	android/telephony/NeighboringCellInfo:getLac	()I
    //   807: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   810: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   813: new 92	java/lang/StringBuilder
    //   816: dup
    //   817: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   820: aload 5
    //   822: invokevirtual 153	android/telephony/NeighboringCellInfo:getCid	()I
    //   825: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   828: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   831: aload 7
    //   833: ldc -127
    //   835: ldc 53
    //   837: ldc 53
    //   839: ldc 53
    //   841: invokespecial 103	com/tencent/mm/sdk/platformtools/h:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   844: invokeinterface 108 2 0
    //   849: pop
    //   850: goto -177 -> 673
    //   853: new 92	java/lang/StringBuilder
    //   856: dup
    //   857: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   860: getstatic 18	com/tencent/mm/sdk/platformtools/l:b	I
    //   863: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   866: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   869: astore 4
    //   871: goto -264 -> 607
    //   874: astore 4
    //   876: aload 4
    //   878: invokevirtual 114	java/lang/Exception:printStackTrace	()V
    //   881: goto -239 -> 642
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	884	0	paramContext	android.content.Context
    //   311	309	1	i	int
    //   317	299	2	j	int
    //   33	762	3	localObject1	Object
    //   22	263	4	str1	String
    //   289	1	4	localException1	Exception
    //   299	112	4	localObject2	Object
    //   541	3	4	localException2	Exception
    //   559	311	4	localObject3	Object
    //   874	3	4	localException3	Exception
    //   26	795	5	localObject4	Object
    //   18	770	6	localLinkedList	java.util.LinkedList
    //   9	823	7	localObject5	Object
    //   212	38	8	str2	String
    // Exception table:
    //   from	to	target	type
    //   28	34	260	java/lang/Exception
    //   38	61	260	java/lang/Exception
    //   207	214	260	java/lang/Exception
    //   231	257	260	java/lang/Exception
    //   70	80	289	java/lang/Exception
    //   85	94	289	java/lang/Exception
    //   98	204	289	java/lang/Exception
    //   268	286	289	java/lang/Exception
    //   291	301	541	java/lang/Exception
    //   306	318	541	java/lang/Exception
    //   334	369	541	java/lang/Exception
    //   551	561	874	java/lang/Exception
    //   566	578	874	java/lang/Exception
    //   594	603	874	java/lang/Exception
    //   607	642	874	java/lang/Exception
    //   853	871	874	java/lang/Exception
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */