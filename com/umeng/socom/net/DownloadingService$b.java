package com.umeng.socom.net;

import android.content.Context;
import android.os.Environment;
import com.umeng.socom.Log;
import com.umeng.socom.b;
import java.io.File;
import java.util.Map;

class DownloadingService$b
  extends Thread
{
  private Context b;
  private String c;
  private int d = 0;
  private long e = -1L;
  private long f = -1L;
  private int g = -1;
  private int h;
  private DownloadingService.a i;
  private a.a j;
  
  public DownloadingService$b(DownloadingService paramDownloadingService, Context paramContext, a.a parama, int paramInt1, int paramInt2, DownloadingService.a parama1)
  {
    try
    {
      this.b = paramContext;
      this.j = parama;
      this.d = paramInt2;
      if (DownloadingService.c().containsKey(Integer.valueOf(paramInt1)))
      {
        paramDownloadingService = ((DownloadingService.d)DownloadingService.c().get(Integer.valueOf(paramInt1))).f;
        if ((paramDownloadingService != null) && (paramDownloadingService.length > 1))
        {
          this.e = paramDownloadingService[0];
          this.f = paramDownloadingService[1];
        }
      }
      this.i = parama1;
      this.h = paramInt1;
      if (b.b())
      {
        this.c = Environment.getExternalStorageDirectory().getCanonicalPath();
        new File(this.c).mkdirs();
      }
      for (;;)
      {
        this.c += "/download/.um/apk";
        new File(this.c).mkdirs();
        return;
        this.c = this.b.getFilesDir().getAbsolutePath();
      }
      return;
    }
    catch (Exception paramDownloadingService)
    {
      Log.c(DownloadingService.a(), paramDownloadingService.getMessage(), paramDownloadingService);
      this.i.a(this.h, paramDownloadingService);
    }
  }
  
  private void a(Exception paramException)
  {
    Log.b(DownloadingService.a(), "can not install. " + paramException.getMessage());
    if (this.i != null) {
      this.i.a(this.h, paramException);
    }
    DownloadingService.a(this.a, this.j, this.e, this.f, this.d);
  }
  
  /* Error */
  private void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: new 101	java/lang/StringBuilder
    //   3: dup
    //   4: aload_0
    //   5: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   8: getfield 162	com/umeng/socom/net/a$a:c	Ljava/lang/String;
    //   11: invokestatic 167	com/umeng/socom/b/g:a	(Ljava/lang/String;)Ljava/lang/String;
    //   14: invokestatic 106	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   17: invokespecial 107	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: ldc -87
    //   22: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: astore 7
    //   30: invokestatic 79	com/umeng/socom/b:b	()Z
    //   33: ifeq +543 -> 576
    //   36: new 87	java/io/File
    //   39: dup
    //   40: aload_0
    //   41: getfield 93	com/umeng/socom/net/DownloadingService$b:c	Ljava/lang/String;
    //   44: aload 7
    //   46: invokespecial 171	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   49: astore 8
    //   51: new 173	java/io/FileOutputStream
    //   54: dup
    //   55: aload 8
    //   57: iconst_1
    //   58: invokespecial 176	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   61: astore 6
    //   63: invokestatic 126	com/umeng/socom/net/DownloadingService:a	()Ljava/lang/String;
    //   66: ldc -78
    //   68: iconst_2
    //   69: anewarray 180	java/lang/Object
    //   72: dup
    //   73: iconst_0
    //   74: aload_0
    //   75: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   78: getfield 162	com/umeng/socom/net/a$a:c	Ljava/lang/String;
    //   81: aastore
    //   82: dup
    //   83: iconst_1
    //   84: aload 8
    //   86: invokevirtual 124	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   89: aastore
    //   90: invokestatic 184	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   93: invokestatic 186	com/umeng/socom/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   96: new 188	java/net/URL
    //   99: dup
    //   100: aload_0
    //   101: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   104: getfield 162	com/umeng/socom/net/a$a:c	Ljava/lang/String;
    //   107: invokespecial 189	java/net/URL:<init>	(Ljava/lang/String;)V
    //   110: invokevirtual 193	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   113: checkcast 195	java/net/HttpURLConnection
    //   116: astore 9
    //   118: aload 9
    //   120: ldc -59
    //   122: invokevirtual 200	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   125: aload 9
    //   127: ldc -54
    //   129: ldc -52
    //   131: invokevirtual 207	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: aload 9
    //   136: ldc -47
    //   138: ldc -45
    //   140: invokevirtual 214	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   143: aload 9
    //   145: sipush 5000
    //   148: invokevirtual 218	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   151: aload 9
    //   153: sipush 10000
    //   156: invokevirtual 221	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   159: aload 8
    //   161: invokevirtual 224	java/io/File:exists	()Z
    //   164: ifeq +45 -> 209
    //   167: aload 8
    //   169: invokevirtual 228	java/io/File:length	()J
    //   172: lconst_0
    //   173: lcmp
    //   174: ifle +35 -> 209
    //   177: aload 9
    //   179: ldc -26
    //   181: new 101	java/lang/StringBuilder
    //   184: dup
    //   185: ldc -24
    //   187: invokespecial 107	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   190: aload 8
    //   192: invokevirtual 228	java/io/File:length	()J
    //   195: invokevirtual 235	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   198: ldc -19
    //   200: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: invokevirtual 207	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   209: aload 9
    //   211: invokevirtual 240	java/net/HttpURLConnection:connect	()V
    //   214: aload 9
    //   216: invokevirtual 244	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   219: astore 7
    //   221: iload_1
    //   222: ifne +67 -> 289
    //   225: aload 6
    //   227: astore 11
    //   229: aload 7
    //   231: astore 10
    //   233: aload_0
    //   234: lconst_0
    //   235: putfield 36	com/umeng/socom/net/DownloadingService$b:e	J
    //   238: aload 6
    //   240: astore 11
    //   242: aload 7
    //   244: astore 10
    //   246: aload_0
    //   247: aload 9
    //   249: invokevirtual 248	java/net/HttpURLConnection:getContentLength	()I
    //   252: i2l
    //   253: putfield 38	com/umeng/socom/net/DownloadingService$b:f	J
    //   256: aload 6
    //   258: astore 11
    //   260: aload 7
    //   262: astore 10
    //   264: invokestatic 126	com/umeng/socom/net/DownloadingService:a	()Ljava/lang/String;
    //   267: ldc -6
    //   269: iconst_1
    //   270: anewarray 180	java/lang/Object
    //   273: dup
    //   274: iconst_0
    //   275: aload_0
    //   276: getfield 38	com/umeng/socom/net/DownloadingService$b:f	J
    //   279: invokestatic 255	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   282: aastore
    //   283: invokestatic 184	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   286: invokestatic 186	com/umeng/socom/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   289: aload 6
    //   291: astore 11
    //   293: aload 7
    //   295: astore 10
    //   297: sipush 4096
    //   300: newarray <illegal type>
    //   302: astore 9
    //   304: iconst_0
    //   305: istore_2
    //   306: aload 6
    //   308: astore 11
    //   310: aload 7
    //   312: astore 10
    //   314: invokestatic 126	com/umeng/socom/net/DownloadingService:a	()Ljava/lang/String;
    //   317: new 101	java/lang/StringBuilder
    //   320: dup
    //   321: aload_0
    //   322: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   325: getfield 257	com/umeng/socom/net/a$a:b	Ljava/lang/String;
    //   328: invokestatic 106	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   331: invokespecial 107	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   334: ldc_w 259
    //   337: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: aload_0
    //   341: getfield 38	com/umeng/socom/net/DownloadingService$b:f	J
    //   344: invokestatic 262	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   347: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: invokestatic 186	com/umeng/socom/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   356: aload 6
    //   358: astore 11
    //   360: aload 7
    //   362: astore 10
    //   364: aload_0
    //   365: getfield 42	com/umeng/socom/net/DownloadingService$b:b	Landroid/content/Context;
    //   368: invokestatic 267	com/umeng/socom/net/c:a	(Landroid/content/Context;)Lcom/umeng/socom/net/c;
    //   371: aload_0
    //   372: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   375: getfield 269	com/umeng/socom/net/a$a:a	Ljava/lang/String;
    //   378: aload_0
    //   379: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   382: getfield 162	com/umeng/socom/net/a$a:c	Ljava/lang/String;
    //   385: invokevirtual 272	com/umeng/socom/net/c:a	(Ljava/lang/String;Ljava/lang/String;)Z
    //   388: pop
    //   389: aload 6
    //   391: astore 11
    //   393: aload 7
    //   395: astore 10
    //   397: aload_0
    //   398: getfield 40	com/umeng/socom/net/DownloadingService$b:g	I
    //   401: ifge +2106 -> 2507
    //   404: aload 6
    //   406: astore 11
    //   408: aload 7
    //   410: astore 10
    //   412: aload 7
    //   414: aload 9
    //   416: invokevirtual 278	java/io/InputStream:read	([B)I
    //   419: istore_3
    //   420: iload_3
    //   421: ifgt +197 -> 618
    //   424: goto +2083 -> 2507
    //   427: aload 6
    //   429: astore 11
    //   431: aload 7
    //   433: astore 10
    //   435: aload 7
    //   437: invokevirtual 281	java/io/InputStream:close	()V
    //   440: aload 6
    //   442: astore 11
    //   444: aload 7
    //   446: astore 10
    //   448: aload 6
    //   450: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   453: aload 6
    //   455: astore 11
    //   457: aload 7
    //   459: astore 10
    //   461: aload_0
    //   462: getfield 40	com/umeng/socom/net/DownloadingService$b:g	I
    //   465: iconst_1
    //   466: if_icmpne +656 -> 1122
    //   469: aload 6
    //   471: astore 11
    //   473: aload 7
    //   475: astore 10
    //   477: invokestatic 49	com/umeng/socom/net/DownloadingService:c	()Ljava/util/Map;
    //   480: aload_0
    //   481: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   484: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   487: invokeinterface 65 2 0
    //   492: checkcast 67	com/umeng/socom/net/DownloadingService$d
    //   495: astore 8
    //   497: aload 6
    //   499: astore 11
    //   501: aload 7
    //   503: astore 10
    //   505: aload 8
    //   507: getfield 70	com/umeng/socom/net/DownloadingService$d:f	[J
    //   510: iconst_0
    //   511: aload_0
    //   512: getfield 36	com/umeng/socom/net/DownloadingService$b:e	J
    //   515: lastore
    //   516: aload 6
    //   518: astore 11
    //   520: aload 7
    //   522: astore 10
    //   524: aload 8
    //   526: getfield 70	com/umeng/socom/net/DownloadingService$d:f	[J
    //   529: iconst_1
    //   530: aload_0
    //   531: getfield 38	com/umeng/socom/net/DownloadingService$b:f	J
    //   534: lastore
    //   535: aload 6
    //   537: astore 11
    //   539: aload 7
    //   541: astore 10
    //   543: aload 8
    //   545: getfield 70	com/umeng/socom/net/DownloadingService$d:f	[J
    //   548: iconst_2
    //   549: aload_0
    //   550: getfield 32	com/umeng/socom/net/DownloadingService$b:d	I
    //   553: i2l
    //   554: lastore
    //   555: aload 7
    //   557: ifnull +8 -> 565
    //   560: aload 7
    //   562: invokevirtual 281	java/io/InputStream:close	()V
    //   565: aload 6
    //   567: ifnull +8 -> 575
    //   570: aload 6
    //   572: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   575: return
    //   576: aload_0
    //   577: aload_0
    //   578: getfield 42	com/umeng/socom/net/DownloadingService$b:b	Landroid/content/Context;
    //   581: invokevirtual 121	android/content/Context:getFilesDir	()Ljava/io/File;
    //   584: invokevirtual 124	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   587: putfield 93	com/umeng/socom/net/DownloadingService$b:c	Ljava/lang/String;
    //   590: aload_0
    //   591: getfield 42	com/umeng/socom/net/DownloadingService$b:b	Landroid/content/Context;
    //   594: aload 7
    //   596: ldc_w 283
    //   599: invokevirtual 287	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   602: astore 6
    //   604: aload_0
    //   605: getfield 42	com/umeng/socom/net/DownloadingService$b:b	Landroid/content/Context;
    //   608: aload 7
    //   610: invokevirtual 291	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   613: astore 8
    //   615: goto -552 -> 63
    //   618: aload 6
    //   620: astore 11
    //   622: aload 7
    //   624: astore 10
    //   626: aload 6
    //   628: aload 9
    //   630: iconst_0
    //   631: iload_3
    //   632: invokevirtual 295	java/io/FileOutputStream:write	([BII)V
    //   635: aload 6
    //   637: astore 11
    //   639: aload 7
    //   641: astore 10
    //   643: aload_0
    //   644: getfield 36	com/umeng/socom/net/DownloadingService$b:e	J
    //   647: lstore 4
    //   649: aload 6
    //   651: astore 11
    //   653: aload 7
    //   655: astore 10
    //   657: aload_0
    //   658: iload_3
    //   659: i2l
    //   660: lload 4
    //   662: ladd
    //   663: putfield 36	com/umeng/socom/net/DownloadingService$b:e	J
    //   666: iload_2
    //   667: bipush 50
    //   669: irem
    //   670: ifne +1842 -> 2512
    //   673: aload 6
    //   675: astore 11
    //   677: aload 7
    //   679: astore 10
    //   681: aload_0
    //   682: getfield 42	com/umeng/socom/net/DownloadingService$b:b	Landroid/content/Context;
    //   685: invokestatic 299	com/umeng/socom/b:m	(Landroid/content/Context;)Z
    //   688: ifne +8 -> 696
    //   691: iconst_0
    //   692: istore_2
    //   693: goto -266 -> 427
    //   696: aload 6
    //   698: astore 11
    //   700: aload 7
    //   702: astore 10
    //   704: aload_0
    //   705: getfield 36	com/umeng/socom/net/DownloadingService$b:e	J
    //   708: l2f
    //   709: ldc_w 300
    //   712: fmul
    //   713: aload_0
    //   714: getfield 38	com/umeng/socom/net/DownloadingService$b:f	J
    //   717: l2f
    //   718: fdiv
    //   719: f2i
    //   720: istore_3
    //   721: iload_3
    //   722: bipush 100
    //   724: if_icmple +1780 -> 2504
    //   727: bipush 99
    //   729: istore_3
    //   730: aload 6
    //   732: astore 11
    //   734: aload 7
    //   736: astore 10
    //   738: aload_0
    //   739: getfield 72	com/umeng/socom/net/DownloadingService$b:i	Lcom/umeng/socom/net/DownloadingService$a;
    //   742: ifnull +25 -> 767
    //   745: aload 6
    //   747: astore 11
    //   749: aload 7
    //   751: astore 10
    //   753: aload_0
    //   754: getfield 72	com/umeng/socom/net/DownloadingService$b:i	Lcom/umeng/socom/net/DownloadingService$a;
    //   757: aload_0
    //   758: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   761: iload_3
    //   762: invokeinterface 303 3 0
    //   767: aload 6
    //   769: astore 11
    //   771: aload 7
    //   773: astore 10
    //   775: invokestatic 305	com/umeng/socom/net/DownloadingService:b	()Ljava/util/Map;
    //   778: aload_0
    //   779: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   782: invokeinterface 65 2 0
    //   787: ifnull +36 -> 823
    //   790: aload 6
    //   792: astore 11
    //   794: aload 7
    //   796: astore 10
    //   798: invokestatic 305	com/umeng/socom/net/DownloadingService:b	()Ljava/util/Map;
    //   801: aload_0
    //   802: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   805: invokeinterface 65 2 0
    //   810: checkcast 307	android/os/Messenger
    //   813: aconst_null
    //   814: iconst_3
    //   815: iload_3
    //   816: iconst_0
    //   817: invokestatic 313	android/os/Message:obtain	(Landroid/os/Handler;III)Landroid/os/Message;
    //   820: invokevirtual 317	android/os/Messenger:send	(Landroid/os/Message;)V
    //   823: aload 6
    //   825: astore 11
    //   827: aload 7
    //   829: astore 10
    //   831: aload_0
    //   832: getfield 42	com/umeng/socom/net/DownloadingService$b:b	Landroid/content/Context;
    //   835: invokestatic 267	com/umeng/socom/net/c:a	(Landroid/content/Context;)Lcom/umeng/socom/net/c;
    //   838: aload_0
    //   839: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   842: getfield 269	com/umeng/socom/net/a$a:a	Ljava/lang/String;
    //   845: aload_0
    //   846: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   849: getfield 162	com/umeng/socom/net/a$a:c	Ljava/lang/String;
    //   852: iload_3
    //   853: invokevirtual 320	com/umeng/socom/net/c:a	(Ljava/lang/String;Ljava/lang/String;I)V
    //   856: goto +1656 -> 2512
    //   859: astore 10
    //   861: aload 6
    //   863: astore 11
    //   865: aload 7
    //   867: astore 10
    //   869: invokestatic 126	com/umeng/socom/net/DownloadingService:a	()Ljava/lang/String;
    //   872: ldc_w 322
    //   875: iconst_1
    //   876: anewarray 180	java/lang/Object
    //   879: dup
    //   880: iconst_0
    //   881: aload_0
    //   882: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   885: getfield 257	com/umeng/socom/net/a$a:b	Ljava/lang/String;
    //   888: aastore
    //   889: invokestatic 184	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   892: invokestatic 147	com/umeng/socom/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   895: aload 6
    //   897: astore 11
    //   899: aload 7
    //   901: astore 10
    //   903: invokestatic 305	com/umeng/socom/net/DownloadingService:b	()Ljava/util/Map;
    //   906: aload_0
    //   907: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   910: aconst_null
    //   911: invokeinterface 326 3 0
    //   916: pop
    //   917: goto -94 -> 823
    //   920: astore 8
    //   922: invokestatic 126	com/umeng/socom/net/DownloadingService:a	()Ljava/lang/String;
    //   925: aload 8
    //   927: invokevirtual 327	java/io/IOException:getMessage	()Ljava/lang/String;
    //   930: aload 8
    //   932: invokestatic 134	com/umeng/socom/Log:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   935: aload_0
    //   936: getfield 32	com/umeng/socom/net/DownloadingService$b:d	I
    //   939: iconst_1
    //   940: iadd
    //   941: istore_2
    //   942: aload_0
    //   943: iload_2
    //   944: putfield 32	com/umeng/socom/net/DownloadingService$b:d	I
    //   947: iload_2
    //   948: iconst_3
    //   949: if_icmple +922 -> 1871
    //   952: aload_0
    //   953: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   956: getfield 330	com/umeng/socom/net/a$a:e	Z
    //   959: istore_1
    //   960: iload_1
    //   961: ifne +910 -> 1871
    //   964: invokestatic 126	com/umeng/socom/net/DownloadingService:a	()Ljava/lang/String;
    //   967: ldc_w 332
    //   970: invokestatic 147	com/umeng/socom/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   973: invokestatic 305	com/umeng/socom/net/DownloadingService:b	()Ljava/util/Map;
    //   976: aload_0
    //   977: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   980: invokeinterface 65 2 0
    //   985: checkcast 307	android/os/Messenger
    //   988: aconst_null
    //   989: iconst_5
    //   990: iconst_0
    //   991: iconst_0
    //   992: invokestatic 313	android/os/Message:obtain	(Landroid/os/Handler;III)Landroid/os/Message;
    //   995: invokevirtual 317	android/os/Messenger:send	(Landroid/os/Message;)V
    //   998: aload_0
    //   999: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   1002: aload_0
    //   1003: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   1006: invokestatic 335	com/umeng/socom/net/DownloadingService:a	(Lcom/umeng/socom/net/DownloadingService;I)V
    //   1009: aload_0
    //   1010: aload 8
    //   1012: invokespecial 337	com/umeng/socom/net/DownloadingService$b:a	(Ljava/lang/Exception;)V
    //   1015: aload_0
    //   1016: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   1019: invokestatic 340	com/umeng/socom/net/DownloadingService:c	(Lcom/umeng/socom/net/DownloadingService;)Landroid/os/Handler;
    //   1022: new 342	com/umeng/socom/net/j
    //   1025: dup
    //   1026: aload_0
    //   1027: invokespecial 345	com/umeng/socom/net/j:<init>	(Lcom/umeng/socom/net/DownloadingService$b;)V
    //   1030: invokevirtual 351	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   1033: pop
    //   1034: aload 7
    //   1036: ifnull +8 -> 1044
    //   1039: aload 7
    //   1041: invokevirtual 281	java/io/InputStream:close	()V
    //   1044: aload 6
    //   1046: ifnull -471 -> 575
    //   1049: aload 6
    //   1051: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   1054: return
    //   1055: astore 6
    //   1057: aload 6
    //   1059: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1062: return
    //   1063: astore 7
    //   1065: aload 7
    //   1067: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1070: aload 6
    //   1072: ifnull -497 -> 575
    //   1075: aload 6
    //   1077: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   1080: return
    //   1081: astore 6
    //   1083: aload 6
    //   1085: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1088: return
    //   1089: astore 7
    //   1091: aload 6
    //   1093: ifnull +8 -> 1101
    //   1096: aload 6
    //   1098: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   1101: aload 7
    //   1103: athrow
    //   1104: astore 6
    //   1106: aload 6
    //   1108: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1111: goto -10 -> 1101
    //   1114: astore 6
    //   1116: aload 6
    //   1118: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1121: return
    //   1122: aload 6
    //   1124: astore 11
    //   1126: aload 7
    //   1128: astore 10
    //   1130: aload_0
    //   1131: getfield 40	com/umeng/socom/net/DownloadingService$b:g	I
    //   1134: iconst_2
    //   1135: if_icmpne +137 -> 1272
    //   1138: aload 6
    //   1140: astore 11
    //   1142: aload 7
    //   1144: astore 10
    //   1146: aload_0
    //   1147: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   1150: aload_0
    //   1151: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   1154: aload_0
    //   1155: getfield 36	com/umeng/socom/net/DownloadingService$b:e	J
    //   1158: aload_0
    //   1159: getfield 38	com/umeng/socom/net/DownloadingService$b:f	J
    //   1162: aload_0
    //   1163: getfield 32	com/umeng/socom/net/DownloadingService$b:d	I
    //   1166: i2l
    //   1167: invokestatic 150	com/umeng/socom/net/DownloadingService:a	(Lcom/umeng/socom/net/DownloadingService;Lcom/umeng/socom/net/a$a;JJJ)V
    //   1170: aload 6
    //   1172: astore 11
    //   1174: aload 7
    //   1176: astore 10
    //   1178: aload_0
    //   1179: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   1182: invokestatic 357	com/umeng/socom/net/DownloadingService:b	(Lcom/umeng/socom/net/DownloadingService;)Landroid/app/NotificationManager;
    //   1185: aload_0
    //   1186: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   1189: invokevirtual 362	android/app/NotificationManager:cancel	(I)V
    //   1192: aload 7
    //   1194: ifnull +8 -> 1202
    //   1197: aload 7
    //   1199: invokevirtual 281	java/io/InputStream:close	()V
    //   1202: aload 6
    //   1204: ifnull -629 -> 575
    //   1207: aload 6
    //   1209: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   1212: return
    //   1213: astore 6
    //   1215: aload 6
    //   1217: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1220: return
    //   1221: astore 7
    //   1223: aload 7
    //   1225: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1228: aload 6
    //   1230: ifnull -655 -> 575
    //   1233: aload 6
    //   1235: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   1238: return
    //   1239: astore 6
    //   1241: aload 6
    //   1243: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1246: return
    //   1247: astore 7
    //   1249: aload 6
    //   1251: ifnull +8 -> 1259
    //   1254: aload 6
    //   1256: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   1259: aload 7
    //   1261: athrow
    //   1262: astore 6
    //   1264: aload 6
    //   1266: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1269: goto -10 -> 1259
    //   1272: iload_2
    //   1273: ifne +206 -> 1479
    //   1276: aload 6
    //   1278: astore 11
    //   1280: aload 7
    //   1282: astore 10
    //   1284: invokestatic 126	com/umeng/socom/net/DownloadingService:a	()Ljava/lang/String;
    //   1287: new 101	java/lang/StringBuilder
    //   1290: dup
    //   1291: ldc_w 364
    //   1294: invokespecial 107	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1297: aload_0
    //   1298: getfield 32	com/umeng/socom/net/DownloadingService$b:d	I
    //   1301: invokevirtual 367	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1304: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1307: invokestatic 147	com/umeng/socom/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   1310: aload 6
    //   1312: astore 11
    //   1314: aload 7
    //   1316: astore 10
    //   1318: invokestatic 305	com/umeng/socom/net/DownloadingService:b	()Ljava/util/Map;
    //   1321: aload_0
    //   1322: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   1325: invokeinterface 65 2 0
    //   1330: checkcast 307	android/os/Messenger
    //   1333: aconst_null
    //   1334: iconst_5
    //   1335: iconst_0
    //   1336: iconst_0
    //   1337: invokestatic 313	android/os/Message:obtain	(Landroid/os/Handler;III)Landroid/os/Message;
    //   1340: invokevirtual 317	android/os/Messenger:send	(Landroid/os/Message;)V
    //   1343: aload 6
    //   1345: astore 11
    //   1347: aload 7
    //   1349: astore 10
    //   1351: aload_0
    //   1352: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   1355: aload_0
    //   1356: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   1359: invokestatic 335	com/umeng/socom/net/DownloadingService:a	(Lcom/umeng/socom/net/DownloadingService;I)V
    //   1362: aload 6
    //   1364: astore 11
    //   1366: aload 7
    //   1368: astore 10
    //   1370: aload_0
    //   1371: getfield 72	com/umeng/socom/net/DownloadingService$b:i	Lcom/umeng/socom/net/DownloadingService$a;
    //   1374: ifnull +25 -> 1399
    //   1377: aload 6
    //   1379: astore 11
    //   1381: aload 7
    //   1383: astore 10
    //   1385: aload_0
    //   1386: getfield 72	com/umeng/socom/net/DownloadingService$b:i	Lcom/umeng/socom/net/DownloadingService$a;
    //   1389: aload_0
    //   1390: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   1393: aconst_null
    //   1394: invokeinterface 139 3 0
    //   1399: aload 7
    //   1401: ifnull +8 -> 1409
    //   1404: aload 7
    //   1406: invokevirtual 281	java/io/InputStream:close	()V
    //   1409: aload 6
    //   1411: ifnull -836 -> 575
    //   1414: aload 6
    //   1416: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   1419: return
    //   1420: astore 6
    //   1422: aload 6
    //   1424: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1427: return
    //   1428: astore 7
    //   1430: aload 7
    //   1432: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1435: aload 6
    //   1437: ifnull -862 -> 575
    //   1440: aload 6
    //   1442: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   1445: return
    //   1446: astore 6
    //   1448: aload 6
    //   1450: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1453: return
    //   1454: astore 7
    //   1456: aload 6
    //   1458: ifnull +8 -> 1466
    //   1461: aload 6
    //   1463: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   1466: aload 7
    //   1468: athrow
    //   1469: astore 6
    //   1471: aload 6
    //   1473: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1476: goto -10 -> 1466
    //   1479: aload 6
    //   1481: astore 11
    //   1483: aload 7
    //   1485: astore 10
    //   1487: aload_0
    //   1488: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   1491: getfield 370	com/umeng/socom/net/a$a:d	[Ljava/lang/String;
    //   1494: ifnull +123 -> 1617
    //   1497: aload 6
    //   1499: astore 11
    //   1501: aload 7
    //   1503: astore 10
    //   1505: new 372	java/util/HashMap
    //   1508: dup
    //   1509: invokespecial 373	java/util/HashMap:<init>	()V
    //   1512: astore 9
    //   1514: aload 6
    //   1516: astore 11
    //   1518: aload 7
    //   1520: astore 10
    //   1522: aload 9
    //   1524: ldc_w 375
    //   1527: aload_0
    //   1528: getfield 38	com/umeng/socom/net/DownloadingService$b:f	J
    //   1531: invokestatic 262	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   1534: invokeinterface 326 3 0
    //   1539: pop
    //   1540: aload 6
    //   1542: astore 11
    //   1544: aload 7
    //   1546: astore 10
    //   1548: aload 9
    //   1550: ldc_w 377
    //   1553: invokestatic 378	com/umeng/socom/b/g:a	()Ljava/lang/String;
    //   1556: ldc_w 380
    //   1559: invokevirtual 384	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1562: iconst_1
    //   1563: aaload
    //   1564: invokeinterface 326 3 0
    //   1569: pop
    //   1570: aload 6
    //   1572: astore 11
    //   1574: aload 7
    //   1576: astore 10
    //   1578: aload 9
    //   1580: ldc_w 386
    //   1583: aload_0
    //   1584: getfield 32	com/umeng/socom/net/DownloadingService$b:d	I
    //   1587: invokestatic 389	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1590: invokeinterface 326 3 0
    //   1595: pop
    //   1596: aload 6
    //   1598: astore 11
    //   1600: aload 7
    //   1602: astore 10
    //   1604: aload 9
    //   1606: iconst_1
    //   1607: aload_0
    //   1608: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   1611: getfield 370	com/umeng/socom/net/a$a:d	[Ljava/lang/String;
    //   1614: invokestatic 392	com/umeng/socom/net/DownloadingService:a	(Ljava/util/Map;Z[Ljava/lang/String;)V
    //   1617: aload 6
    //   1619: astore 11
    //   1621: aload 7
    //   1623: astore 10
    //   1625: new 87	java/io/File
    //   1628: dup
    //   1629: aload 8
    //   1631: invokevirtual 395	java/io/File:getParent	()Ljava/lang/String;
    //   1634: aload 8
    //   1636: invokevirtual 398	java/io/File:getName	()Ljava/lang/String;
    //   1639: ldc_w 400
    //   1642: ldc_w 402
    //   1645: invokevirtual 406	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1648: invokespecial 171	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1651: astore 9
    //   1653: aload 6
    //   1655: astore 11
    //   1657: aload 7
    //   1659: astore 10
    //   1661: aload 8
    //   1663: aload 9
    //   1665: invokevirtual 410	java/io/File:renameTo	(Ljava/io/File;)Z
    //   1668: pop
    //   1669: aload 6
    //   1671: astore 11
    //   1673: aload 7
    //   1675: astore 10
    //   1677: aload 9
    //   1679: invokevirtual 124	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1682: astore 8
    //   1684: aload 6
    //   1686: astore 11
    //   1688: aload 7
    //   1690: astore 10
    //   1692: aload_0
    //   1693: getfield 72	com/umeng/socom/net/DownloadingService$b:i	Lcom/umeng/socom/net/DownloadingService$a;
    //   1696: ifnull +26 -> 1722
    //   1699: aload 6
    //   1701: astore 11
    //   1703: aload 7
    //   1705: astore 10
    //   1707: aload_0
    //   1708: getfield 72	com/umeng/socom/net/DownloadingService$b:i	Lcom/umeng/socom/net/DownloadingService$a;
    //   1711: aload_0
    //   1712: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   1715: aload 8
    //   1717: invokeinterface 413 3 0
    //   1722: aload 7
    //   1724: ifnull +8 -> 1732
    //   1727: aload 7
    //   1729: invokevirtual 281	java/io/InputStream:close	()V
    //   1732: aload 6
    //   1734: ifnull -1159 -> 575
    //   1737: aload 6
    //   1739: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   1742: return
    //   1743: astore 6
    //   1745: aload 6
    //   1747: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   1750: return
    //   1751: astore 9
    //   1753: aload 9
    //   1755: invokevirtual 414	android/os/RemoteException:printStackTrace	()V
    //   1758: aload_0
    //   1759: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   1762: aload_0
    //   1763: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   1766: invokestatic 335	com/umeng/socom/net/DownloadingService:a	(Lcom/umeng/socom/net/DownloadingService;I)V
    //   1769: aload_0
    //   1770: aload 8
    //   1772: invokespecial 337	com/umeng/socom/net/DownloadingService$b:a	(Ljava/lang/Exception;)V
    //   1775: aload_0
    //   1776: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   1779: invokestatic 340	com/umeng/socom/net/DownloadingService:c	(Lcom/umeng/socom/net/DownloadingService;)Landroid/os/Handler;
    //   1782: new 342	com/umeng/socom/net/j
    //   1785: dup
    //   1786: aload_0
    //   1787: invokespecial 345	com/umeng/socom/net/j:<init>	(Lcom/umeng/socom/net/DownloadingService$b;)V
    //   1790: invokevirtual 351	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   1793: pop
    //   1794: goto -760 -> 1034
    //   1797: astore 9
    //   1799: aload 7
    //   1801: astore 8
    //   1803: aload 9
    //   1805: astore 7
    //   1807: aload 8
    //   1809: ifnull +8 -> 1817
    //   1812: aload 8
    //   1814: invokevirtual 281	java/io/InputStream:close	()V
    //   1817: aload 6
    //   1819: ifnull +8 -> 1827
    //   1822: aload 6
    //   1824: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   1827: aload 7
    //   1829: athrow
    //   1830: astore 9
    //   1832: aload_0
    //   1833: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   1836: aload_0
    //   1837: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   1840: invokestatic 335	com/umeng/socom/net/DownloadingService:a	(Lcom/umeng/socom/net/DownloadingService;I)V
    //   1843: aload_0
    //   1844: aload 8
    //   1846: invokespecial 337	com/umeng/socom/net/DownloadingService$b:a	(Ljava/lang/Exception;)V
    //   1849: aload_0
    //   1850: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   1853: invokestatic 340	com/umeng/socom/net/DownloadingService:c	(Lcom/umeng/socom/net/DownloadingService;)Landroid/os/Handler;
    //   1856: new 342	com/umeng/socom/net/j
    //   1859: dup
    //   1860: aload_0
    //   1861: invokespecial 345	com/umeng/socom/net/j:<init>	(Lcom/umeng/socom/net/DownloadingService$b;)V
    //   1864: invokevirtual 351	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   1867: pop
    //   1868: aload 9
    //   1870: athrow
    //   1871: invokestatic 126	com/umeng/socom/net/DownloadingService:a	()Ljava/lang/String;
    //   1874: new 101	java/lang/StringBuilder
    //   1877: dup
    //   1878: ldc_w 416
    //   1881: invokespecial 107	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1884: aload_0
    //   1885: getfield 32	com/umeng/socom/net/DownloadingService$b:d	I
    //   1888: invokevirtual 367	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1891: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1894: invokestatic 186	com/umeng/socom/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   1897: aload_0
    //   1898: getfield 44	com/umeng/socom/net/DownloadingService$b:j	Lcom/umeng/socom/net/a$a;
    //   1901: getfield 330	com/umeng/socom/net/a$a:e	Z
    //   1904: ifne +56 -> 1960
    //   1907: ldc2_w 417
    //   1910: invokestatic 422	java/lang/Thread:sleep	(J)V
    //   1913: aload_0
    //   1914: getfield 38	com/umeng/socom/net/DownloadingService$b:f	J
    //   1917: lconst_1
    //   1918: lcmp
    //   1919: ifge +33 -> 1952
    //   1922: aload_0
    //   1923: iconst_0
    //   1924: invokespecial 424	com/umeng/socom/net/DownloadingService$b:a	(Z)V
    //   1927: goto -893 -> 1034
    //   1930: astore 8
    //   1932: aload_0
    //   1933: aload 8
    //   1935: invokespecial 337	com/umeng/socom/net/DownloadingService$b:a	(Ljava/lang/Exception;)V
    //   1938: aload_0
    //   1939: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   1942: aload_0
    //   1943: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   1946: invokestatic 335	com/umeng/socom/net/DownloadingService:a	(Lcom/umeng/socom/net/DownloadingService;I)V
    //   1949: goto -915 -> 1034
    //   1952: aload_0
    //   1953: iconst_1
    //   1954: invokespecial 424	com/umeng/socom/net/DownloadingService$b:a	(Z)V
    //   1957: goto -923 -> 1034
    //   1960: invokestatic 49	com/umeng/socom/net/DownloadingService:c	()Ljava/util/Map;
    //   1963: aload_0
    //   1964: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   1967: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1970: invokeinterface 65 2 0
    //   1975: checkcast 67	com/umeng/socom/net/DownloadingService$d
    //   1978: astore 8
    //   1980: aload 8
    //   1982: getfield 70	com/umeng/socom/net/DownloadingService$d:f	[J
    //   1985: iconst_0
    //   1986: aload_0
    //   1987: getfield 36	com/umeng/socom/net/DownloadingService$b:e	J
    //   1990: lastore
    //   1991: aload 8
    //   1993: getfield 70	com/umeng/socom/net/DownloadingService$d:f	[J
    //   1996: iconst_1
    //   1997: aload_0
    //   1998: getfield 38	com/umeng/socom/net/DownloadingService$b:f	J
    //   2001: lastore
    //   2002: aload 8
    //   2004: getfield 70	com/umeng/socom/net/DownloadingService$d:f	[J
    //   2007: iconst_2
    //   2008: aload_0
    //   2009: getfield 32	com/umeng/socom/net/DownloadingService$b:d	I
    //   2012: i2l
    //   2013: lastore
    //   2014: aload_0
    //   2015: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   2018: ldc_w 426
    //   2021: invokestatic 431	com/umeng/socom/net/l:a	(ILjava/lang/String;)Ljava/lang/String;
    //   2024: astore 8
    //   2026: new 433	android/content/Intent
    //   2029: dup
    //   2030: aload_0
    //   2031: getfield 42	com/umeng/socom/net/DownloadingService$b:b	Landroid/content/Context;
    //   2034: ldc 46
    //   2036: invokespecial 436	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   2039: astore 9
    //   2041: aload 9
    //   2043: ldc_w 438
    //   2046: aload 8
    //   2048: invokevirtual 442	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   2051: pop
    //   2052: aload_0
    //   2053: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   2056: aload_0
    //   2057: getfield 42	com/umeng/socom/net/DownloadingService$b:b	Landroid/content/Context;
    //   2060: aload 9
    //   2062: invokestatic 445	com/umeng/socom/net/DownloadingService:a	(Lcom/umeng/socom/net/DownloadingService;Landroid/content/Context;Landroid/content/Intent;)Z
    //   2065: pop
    //   2066: aload_0
    //   2067: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   2070: aload_0
    //   2071: getfield 42	com/umeng/socom/net/DownloadingService$b:b	Landroid/content/Context;
    //   2074: aload_0
    //   2075: getfield 42	com/umeng/socom/net/DownloadingService$b:b	Landroid/content/Context;
    //   2078: invokestatic 450	com/umeng/socom/c:a	(Landroid/content/Context;)Lcom/umeng/socom/c;
    //   2081: ldc_w 452
    //   2084: invokevirtual 455	com/umeng/socom/c:f	(Ljava/lang/String;)I
    //   2087: invokevirtual 458	android/content/Context:getString	(I)Ljava/lang/String;
    //   2090: invokevirtual 460	com/umeng/socom/net/DownloadingService:a	(Ljava/lang/String;)V
    //   2093: invokestatic 126	com/umeng/socom/net/DownloadingService:a	()Ljava/lang/String;
    //   2096: ldc_w 462
    //   2099: invokestatic 186	com/umeng/socom/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   2102: goto -1068 -> 1034
    //   2105: astore 7
    //   2107: aload 7
    //   2109: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2112: aload 6
    //   2114: ifnull -1539 -> 575
    //   2117: aload 6
    //   2119: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   2122: return
    //   2123: astore 6
    //   2125: aload 6
    //   2127: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2130: return
    //   2131: astore 7
    //   2133: aload 6
    //   2135: ifnull +8 -> 2143
    //   2138: aload 6
    //   2140: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   2143: aload 7
    //   2145: athrow
    //   2146: astore 6
    //   2148: aload 6
    //   2150: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2153: goto -10 -> 2143
    //   2156: astore 9
    //   2158: aconst_null
    //   2159: astore 8
    //   2161: aconst_null
    //   2162: astore 6
    //   2164: aload 8
    //   2166: astore 11
    //   2168: aload 6
    //   2170: astore 10
    //   2172: aload_0
    //   2173: getfield 27	com/umeng/socom/net/DownloadingService$b:a	Lcom/umeng/socom/net/DownloadingService;
    //   2176: aload_0
    //   2177: getfield 74	com/umeng/socom/net/DownloadingService$b:h	I
    //   2180: invokestatic 335	com/umeng/socom/net/DownloadingService:a	(Lcom/umeng/socom/net/DownloadingService;I)V
    //   2183: aload 8
    //   2185: astore 11
    //   2187: aload 6
    //   2189: astore 10
    //   2191: aload 9
    //   2193: invokevirtual 414	android/os/RemoteException:printStackTrace	()V
    //   2196: aload 6
    //   2198: ifnull +8 -> 2206
    //   2201: aload 6
    //   2203: invokevirtual 281	java/io/InputStream:close	()V
    //   2206: aload 8
    //   2208: ifnull -1633 -> 575
    //   2211: aload 8
    //   2213: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   2216: return
    //   2217: astore 6
    //   2219: aload 6
    //   2221: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2224: return
    //   2225: astore 6
    //   2227: aload 6
    //   2229: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2232: aload 8
    //   2234: ifnull -1659 -> 575
    //   2237: aload 8
    //   2239: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   2242: return
    //   2243: astore 6
    //   2245: aload 6
    //   2247: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2250: return
    //   2251: astore 6
    //   2253: aload 8
    //   2255: ifnull +8 -> 2263
    //   2258: aload 8
    //   2260: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   2263: aload 6
    //   2265: athrow
    //   2266: astore 7
    //   2268: aload 7
    //   2270: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2273: goto -10 -> 2263
    //   2276: astore 8
    //   2278: aload 8
    //   2280: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2283: aload 6
    //   2285: ifnull -458 -> 1827
    //   2288: aload 6
    //   2290: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   2293: goto -466 -> 1827
    //   2296: astore 6
    //   2298: aload 6
    //   2300: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2303: goto -476 -> 1827
    //   2306: astore 7
    //   2308: aload 6
    //   2310: ifnull +8 -> 2318
    //   2313: aload 6
    //   2315: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   2318: aload 7
    //   2320: athrow
    //   2321: astore 6
    //   2323: aload 6
    //   2325: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2328: goto -10 -> 2318
    //   2331: astore 6
    //   2333: aload 6
    //   2335: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2338: goto -511 -> 1827
    //   2341: astore 7
    //   2343: aload 7
    //   2345: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2348: aload 6
    //   2350: ifnull -1775 -> 575
    //   2353: aload 6
    //   2355: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   2358: return
    //   2359: astore 6
    //   2361: aload 6
    //   2363: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2366: return
    //   2367: astore 7
    //   2369: aload 6
    //   2371: ifnull +8 -> 2379
    //   2374: aload 6
    //   2376: invokevirtual 282	java/io/FileOutputStream:close	()V
    //   2379: aload 7
    //   2381: athrow
    //   2382: astore 6
    //   2384: aload 6
    //   2386: invokevirtual 354	java/io/IOException:printStackTrace	()V
    //   2389: goto -10 -> 2379
    //   2392: astore 7
    //   2394: aconst_null
    //   2395: astore 6
    //   2397: aconst_null
    //   2398: astore 8
    //   2400: goto -593 -> 1807
    //   2403: astore 7
    //   2405: aconst_null
    //   2406: astore 8
    //   2408: goto -601 -> 1807
    //   2411: astore 7
    //   2413: aconst_null
    //   2414: astore 8
    //   2416: goto -609 -> 1807
    //   2419: astore 7
    //   2421: aload 11
    //   2423: astore 6
    //   2425: aload 10
    //   2427: astore 8
    //   2429: goto -622 -> 1807
    //   2432: astore 9
    //   2434: aconst_null
    //   2435: astore 7
    //   2437: aload 6
    //   2439: astore 8
    //   2441: aload 7
    //   2443: astore 6
    //   2445: goto -281 -> 2164
    //   2448: astore 9
    //   2450: aconst_null
    //   2451: astore 7
    //   2453: aload 6
    //   2455: astore 8
    //   2457: aload 7
    //   2459: astore 6
    //   2461: goto -297 -> 2164
    //   2464: astore 9
    //   2466: aload 6
    //   2468: astore 8
    //   2470: aload 7
    //   2472: astore 6
    //   2474: goto -310 -> 2164
    //   2477: astore 8
    //   2479: aconst_null
    //   2480: astore 7
    //   2482: aconst_null
    //   2483: astore 6
    //   2485: goto -1563 -> 922
    //   2488: astore 8
    //   2490: aconst_null
    //   2491: astore 7
    //   2493: goto -1571 -> 922
    //   2496: astore 8
    //   2498: aconst_null
    //   2499: astore 7
    //   2501: goto -1579 -> 922
    //   2504: goto -1774 -> 730
    //   2507: iconst_1
    //   2508: istore_2
    //   2509: goto -2082 -> 427
    //   2512: iload_2
    //   2513: iconst_1
    //   2514: iadd
    //   2515: istore_2
    //   2516: goto -2127 -> 389
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2519	0	this	b
    //   0	2519	1	paramBoolean	boolean
    //   305	2211	2	k	int
    //   419	434	3	m	int
    //   647	14	4	l	long
    //   61	989	6	localFileOutputStream	java.io.FileOutputStream
    //   1055	21	6	localIOException1	java.io.IOException
    //   1081	16	6	localIOException2	java.io.IOException
    //   1104	3	6	localIOException3	java.io.IOException
    //   1114	94	6	localIOException4	java.io.IOException
    //   1213	21	6	localIOException5	java.io.IOException
    //   1239	16	6	localIOException6	java.io.IOException
    //   1262	153	6	localIOException7	java.io.IOException
    //   1420	21	6	localIOException8	java.io.IOException
    //   1446	16	6	localIOException9	java.io.IOException
    //   1469	269	6	localIOException10	java.io.IOException
    //   1743	375	6	localIOException11	java.io.IOException
    //   2123	16	6	localIOException12	java.io.IOException
    //   2146	3	6	localIOException13	java.io.IOException
    //   2162	40	6	localObject1	Object
    //   2217	3	6	localIOException14	java.io.IOException
    //   2225	3	6	localIOException15	java.io.IOException
    //   2243	3	6	localIOException16	java.io.IOException
    //   2251	38	6	localObject2	Object
    //   2296	18	6	localIOException17	java.io.IOException
    //   2321	3	6	localIOException18	java.io.IOException
    //   2331	23	6	localIOException19	java.io.IOException
    //   2359	16	6	localIOException20	java.io.IOException
    //   2382	3	6	localIOException21	java.io.IOException
    //   2395	89	6	localObject3	Object
    //   28	1012	7	localObject4	Object
    //   1063	3	7	localIOException22	java.io.IOException
    //   1089	109	7	localObject5	Object
    //   1221	3	7	localIOException23	java.io.IOException
    //   1247	158	7	localObject6	Object
    //   1428	3	7	localIOException24	java.io.IOException
    //   1454	346	7	localObject7	Object
    //   1805	23	7	localObject8	Object
    //   2105	3	7	localIOException25	java.io.IOException
    //   2131	13	7	localObject9	Object
    //   2266	3	7	localIOException26	java.io.IOException
    //   2306	13	7	localObject10	Object
    //   2341	3	7	localIOException27	java.io.IOException
    //   2367	13	7	localObject11	Object
    //   2392	1	7	localObject12	Object
    //   2403	1	7	localObject13	Object
    //   2411	1	7	localObject14	Object
    //   2419	1	7	localObject15	Object
    //   2435	65	7	localObject16	Object
    //   49	565	8	localObject17	Object
    //   920	742	8	localIOException28	java.io.IOException
    //   1682	163	8	localObject18	Object
    //   1930	4	8	localInterruptedException	InterruptedException
    //   1978	281	8	localObject19	Object
    //   2276	3	8	localIOException29	java.io.IOException
    //   2398	71	8	localObject20	Object
    //   2477	1	8	localIOException30	java.io.IOException
    //   2488	1	8	localIOException31	java.io.IOException
    //   2496	1	8	localIOException32	java.io.IOException
    //   116	1562	9	localObject21	Object
    //   1751	3	9	localRemoteException1	android.os.RemoteException
    //   1797	7	9	localObject22	Object
    //   1830	39	9	localObject23	Object
    //   2039	22	9	localIntent	android.content.Intent
    //   2156	36	9	localRemoteException2	android.os.RemoteException
    //   2432	1	9	localRemoteException3	android.os.RemoteException
    //   2448	1	9	localRemoteException4	android.os.RemoteException
    //   2464	1	9	localRemoteException5	android.os.RemoteException
    //   231	599	10	localObject24	Object
    //   859	1	10	localDeadObjectException	android.os.DeadObjectException
    //   867	1559	10	localObject25	Object
    //   227	2195	11	localObject26	Object
    // Exception table:
    //   from	to	target	type
    //   775	790	859	android/os/DeadObjectException
    //   798	823	859	android/os/DeadObjectException
    //   233	238	920	java/io/IOException
    //   246	256	920	java/io/IOException
    //   264	289	920	java/io/IOException
    //   297	304	920	java/io/IOException
    //   314	356	920	java/io/IOException
    //   364	389	920	java/io/IOException
    //   397	404	920	java/io/IOException
    //   412	420	920	java/io/IOException
    //   435	440	920	java/io/IOException
    //   448	453	920	java/io/IOException
    //   461	469	920	java/io/IOException
    //   477	497	920	java/io/IOException
    //   505	516	920	java/io/IOException
    //   524	535	920	java/io/IOException
    //   543	555	920	java/io/IOException
    //   626	635	920	java/io/IOException
    //   643	649	920	java/io/IOException
    //   657	666	920	java/io/IOException
    //   681	691	920	java/io/IOException
    //   704	721	920	java/io/IOException
    //   738	745	920	java/io/IOException
    //   753	767	920	java/io/IOException
    //   775	790	920	java/io/IOException
    //   798	823	920	java/io/IOException
    //   831	856	920	java/io/IOException
    //   869	895	920	java/io/IOException
    //   903	917	920	java/io/IOException
    //   1130	1138	920	java/io/IOException
    //   1146	1170	920	java/io/IOException
    //   1178	1192	920	java/io/IOException
    //   1284	1310	920	java/io/IOException
    //   1318	1343	920	java/io/IOException
    //   1351	1362	920	java/io/IOException
    //   1370	1377	920	java/io/IOException
    //   1385	1399	920	java/io/IOException
    //   1487	1497	920	java/io/IOException
    //   1505	1514	920	java/io/IOException
    //   1522	1540	920	java/io/IOException
    //   1548	1570	920	java/io/IOException
    //   1578	1596	920	java/io/IOException
    //   1604	1617	920	java/io/IOException
    //   1625	1653	920	java/io/IOException
    //   1661	1669	920	java/io/IOException
    //   1677	1684	920	java/io/IOException
    //   1692	1699	920	java/io/IOException
    //   1707	1722	920	java/io/IOException
    //   1049	1054	1055	java/io/IOException
    //   560	565	1063	java/io/IOException
    //   1075	1080	1081	java/io/IOException
    //   560	565	1089	finally
    //   1065	1070	1089	finally
    //   1096	1101	1104	java/io/IOException
    //   570	575	1114	java/io/IOException
    //   1207	1212	1213	java/io/IOException
    //   1197	1202	1221	java/io/IOException
    //   1233	1238	1239	java/io/IOException
    //   1197	1202	1247	finally
    //   1223	1228	1247	finally
    //   1254	1259	1262	java/io/IOException
    //   1414	1419	1420	java/io/IOException
    //   1404	1409	1428	java/io/IOException
    //   1440	1445	1446	java/io/IOException
    //   1404	1409	1454	finally
    //   1430	1435	1454	finally
    //   1461	1466	1469	java/io/IOException
    //   1737	1742	1743	java/io/IOException
    //   964	998	1751	android/os/RemoteException
    //   922	947	1797	finally
    //   952	960	1797	finally
    //   998	1034	1797	finally
    //   1758	1794	1797	finally
    //   1832	1871	1797	finally
    //   1871	1897	1797	finally
    //   1897	1927	1797	finally
    //   1932	1949	1797	finally
    //   1952	1957	1797	finally
    //   1960	2102	1797	finally
    //   964	998	1830	finally
    //   1753	1758	1830	finally
    //   1897	1927	1930	java/lang/InterruptedException
    //   1952	1957	1930	java/lang/InterruptedException
    //   1960	2102	1930	java/lang/InterruptedException
    //   1039	1044	2105	java/io/IOException
    //   2117	2122	2123	java/io/IOException
    //   1039	1044	2131	finally
    //   2107	2112	2131	finally
    //   2138	2143	2146	java/io/IOException
    //   0	63	2156	android/os/RemoteException
    //   576	604	2156	android/os/RemoteException
    //   2211	2216	2217	java/io/IOException
    //   2201	2206	2225	java/io/IOException
    //   2237	2242	2243	java/io/IOException
    //   2201	2206	2251	finally
    //   2227	2232	2251	finally
    //   2258	2263	2266	java/io/IOException
    //   1812	1817	2276	java/io/IOException
    //   2288	2293	2296	java/io/IOException
    //   1812	1817	2306	finally
    //   2278	2283	2306	finally
    //   2313	2318	2321	java/io/IOException
    //   1822	1827	2331	java/io/IOException
    //   1727	1732	2341	java/io/IOException
    //   2353	2358	2359	java/io/IOException
    //   1727	1732	2367	finally
    //   2343	2348	2367	finally
    //   2374	2379	2382	java/io/IOException
    //   0	63	2392	finally
    //   576	604	2392	finally
    //   604	615	2403	finally
    //   63	209	2411	finally
    //   209	221	2411	finally
    //   233	238	2419	finally
    //   246	256	2419	finally
    //   264	289	2419	finally
    //   297	304	2419	finally
    //   314	356	2419	finally
    //   364	389	2419	finally
    //   397	404	2419	finally
    //   412	420	2419	finally
    //   435	440	2419	finally
    //   448	453	2419	finally
    //   461	469	2419	finally
    //   477	497	2419	finally
    //   505	516	2419	finally
    //   524	535	2419	finally
    //   543	555	2419	finally
    //   626	635	2419	finally
    //   643	649	2419	finally
    //   657	666	2419	finally
    //   681	691	2419	finally
    //   704	721	2419	finally
    //   738	745	2419	finally
    //   753	767	2419	finally
    //   775	790	2419	finally
    //   798	823	2419	finally
    //   831	856	2419	finally
    //   869	895	2419	finally
    //   903	917	2419	finally
    //   1130	1138	2419	finally
    //   1146	1170	2419	finally
    //   1178	1192	2419	finally
    //   1284	1310	2419	finally
    //   1318	1343	2419	finally
    //   1351	1362	2419	finally
    //   1370	1377	2419	finally
    //   1385	1399	2419	finally
    //   1487	1497	2419	finally
    //   1505	1514	2419	finally
    //   1522	1540	2419	finally
    //   1548	1570	2419	finally
    //   1578	1596	2419	finally
    //   1604	1617	2419	finally
    //   1625	1653	2419	finally
    //   1661	1669	2419	finally
    //   1677	1684	2419	finally
    //   1692	1699	2419	finally
    //   1707	1722	2419	finally
    //   2172	2183	2419	finally
    //   2191	2196	2419	finally
    //   604	615	2432	android/os/RemoteException
    //   63	209	2448	android/os/RemoteException
    //   209	221	2448	android/os/RemoteException
    //   233	238	2464	android/os/RemoteException
    //   246	256	2464	android/os/RemoteException
    //   264	289	2464	android/os/RemoteException
    //   297	304	2464	android/os/RemoteException
    //   314	356	2464	android/os/RemoteException
    //   364	389	2464	android/os/RemoteException
    //   397	404	2464	android/os/RemoteException
    //   412	420	2464	android/os/RemoteException
    //   435	440	2464	android/os/RemoteException
    //   448	453	2464	android/os/RemoteException
    //   461	469	2464	android/os/RemoteException
    //   477	497	2464	android/os/RemoteException
    //   505	516	2464	android/os/RemoteException
    //   524	535	2464	android/os/RemoteException
    //   543	555	2464	android/os/RemoteException
    //   626	635	2464	android/os/RemoteException
    //   643	649	2464	android/os/RemoteException
    //   657	666	2464	android/os/RemoteException
    //   681	691	2464	android/os/RemoteException
    //   704	721	2464	android/os/RemoteException
    //   738	745	2464	android/os/RemoteException
    //   753	767	2464	android/os/RemoteException
    //   775	790	2464	android/os/RemoteException
    //   798	823	2464	android/os/RemoteException
    //   831	856	2464	android/os/RemoteException
    //   869	895	2464	android/os/RemoteException
    //   903	917	2464	android/os/RemoteException
    //   1130	1138	2464	android/os/RemoteException
    //   1146	1170	2464	android/os/RemoteException
    //   1178	1192	2464	android/os/RemoteException
    //   1284	1310	2464	android/os/RemoteException
    //   1318	1343	2464	android/os/RemoteException
    //   1351	1362	2464	android/os/RemoteException
    //   1370	1377	2464	android/os/RemoteException
    //   1385	1399	2464	android/os/RemoteException
    //   1487	1497	2464	android/os/RemoteException
    //   1505	1514	2464	android/os/RemoteException
    //   1522	1540	2464	android/os/RemoteException
    //   1548	1570	2464	android/os/RemoteException
    //   1578	1596	2464	android/os/RemoteException
    //   1604	1617	2464	android/os/RemoteException
    //   1625	1653	2464	android/os/RemoteException
    //   1661	1669	2464	android/os/RemoteException
    //   1677	1684	2464	android/os/RemoteException
    //   1692	1699	2464	android/os/RemoteException
    //   1707	1722	2464	android/os/RemoteException
    //   0	63	2477	java/io/IOException
    //   576	604	2477	java/io/IOException
    //   604	615	2488	java/io/IOException
    //   63	209	2496	java/io/IOException
    //   209	221	2496	java/io/IOException
  }
  
  public void a(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void run()
  {
    boolean bool = false;
    this.d = 0;
    try
    {
      if (this.i != null) {
        this.i.a(this.h);
      }
      if (this.e > 0L) {
        bool = true;
      }
      a(bool);
      if (DownloadingService.b().size() <= 0) {
        this.a.stopSelf();
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\DownloadingService$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */