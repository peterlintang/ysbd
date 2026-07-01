package com.umeng.common.ufp.net;

import android.content.Context;
import android.os.Environment;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.b;
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
      if (b.g())
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
    //   4: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   7: aload_0
    //   8: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   11: getfield 158	com/umeng/common/ufp/net/a$a:c	Ljava/lang/String;
    //   14: invokestatic 163	com/umeng/common/ufp/util/g:a	(Ljava/lang/String;)Ljava/lang/String;
    //   17: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: ldc -91
    //   22: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: astore 7
    //   30: aload_0
    //   31: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   34: getfield 167	com/umeng/common/ufp/net/a$a:a	Ljava/lang/String;
    //   37: ldc -87
    //   39: invokevirtual 175	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   42: ifeq +3074 -> 3116
    //   45: aload 7
    //   47: ldc -79
    //   49: ldc -77
    //   51: invokevirtual 183	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   54: astore 7
    //   56: invokestatic 79	com/umeng/common/ufp/b:g	()Z
    //   59: ifeq +620 -> 679
    //   62: new 87	java/io/File
    //   65: dup
    //   66: aload_0
    //   67: getfield 93	com/umeng/common/ufp/net/DownloadingService$b:c	Ljava/lang/String;
    //   70: aload 7
    //   72: invokespecial 185	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   75: astore 8
    //   77: new 187	java/io/FileOutputStream
    //   80: dup
    //   81: aload 8
    //   83: iconst_1
    //   84: invokespecial 190	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   87: astore 6
    //   89: invokestatic 121	com/umeng/common/ufp/net/DownloadingService:a	()Ljava/lang/String;
    //   92: ldc -64
    //   94: iconst_2
    //   95: anewarray 194	java/lang/Object
    //   98: dup
    //   99: iconst_0
    //   100: aload_0
    //   101: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   104: getfield 158	com/umeng/common/ufp/net/a$a:c	Ljava/lang/String;
    //   107: aastore
    //   108: dup
    //   109: iconst_1
    //   110: aload 8
    //   112: invokevirtual 119	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   115: aastore
    //   116: invokestatic 198	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   119: invokestatic 200	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   122: new 202	java/net/URL
    //   125: dup
    //   126: aload_0
    //   127: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   130: getfield 158	com/umeng/common/ufp/net/a$a:c	Ljava/lang/String;
    //   133: invokespecial 203	java/net/URL:<init>	(Ljava/lang/String;)V
    //   136: invokevirtual 207	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   139: checkcast 209	java/net/HttpURLConnection
    //   142: astore 11
    //   144: aload 11
    //   146: ldc -45
    //   148: invokevirtual 214	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   151: aload 11
    //   153: ldc -40
    //   155: ldc -38
    //   157: invokevirtual 221	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   160: aload 11
    //   162: ldc -33
    //   164: ldc -31
    //   166: invokevirtual 228	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   169: aload 11
    //   171: sipush 5000
    //   174: invokevirtual 232	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   177: aload 11
    //   179: sipush 10000
    //   182: invokevirtual 235	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   185: aload 8
    //   187: invokevirtual 238	java/io/File:exists	()Z
    //   190: ifeq +45 -> 235
    //   193: aload 8
    //   195: invokevirtual 242	java/io/File:length	()J
    //   198: lconst_0
    //   199: lcmp
    //   200: ifle +35 -> 235
    //   203: aload 11
    //   205: ldc -12
    //   207: new 101	java/lang/StringBuilder
    //   210: dup
    //   211: ldc -10
    //   213: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   216: aload 8
    //   218: invokevirtual 242	java/io/File:length	()J
    //   221: invokevirtual 249	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   224: ldc -5
    //   226: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   232: invokevirtual 221	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   235: aload 11
    //   237: invokevirtual 254	java/net/HttpURLConnection:connect	()V
    //   240: aload 11
    //   242: invokevirtual 258	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   245: astore 7
    //   247: iload_1
    //   248: ifne +68 -> 316
    //   251: aload 6
    //   253: astore 10
    //   255: aload 7
    //   257: astore 9
    //   259: aload_0
    //   260: lconst_0
    //   261: putfield 36	com/umeng/common/ufp/net/DownloadingService$b:e	J
    //   264: aload 6
    //   266: astore 10
    //   268: aload 7
    //   270: astore 9
    //   272: aload_0
    //   273: aload 11
    //   275: invokevirtual 262	java/net/HttpURLConnection:getContentLength	()I
    //   278: i2l
    //   279: putfield 38	com/umeng/common/ufp/net/DownloadingService$b:f	J
    //   282: aload 6
    //   284: astore 10
    //   286: aload 7
    //   288: astore 9
    //   290: invokestatic 121	com/umeng/common/ufp/net/DownloadingService:a	()Ljava/lang/String;
    //   293: ldc_w 264
    //   296: iconst_1
    //   297: anewarray 194	java/lang/Object
    //   300: dup
    //   301: iconst_0
    //   302: aload_0
    //   303: getfield 38	com/umeng/common/ufp/net/DownloadingService$b:f	J
    //   306: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   309: aastore
    //   310: invokestatic 198	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   313: invokestatic 200	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   316: aload 6
    //   318: astore 10
    //   320: aload 7
    //   322: astore 9
    //   324: sipush 4096
    //   327: newarray <illegal type>
    //   329: astore 11
    //   331: aload 6
    //   333: astore 10
    //   335: aload 7
    //   337: astore 9
    //   339: invokestatic 121	com/umeng/common/ufp/net/DownloadingService:a	()Ljava/lang/String;
    //   342: new 101	java/lang/StringBuilder
    //   345: dup
    //   346: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   349: aload_0
    //   350: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   353: getfield 271	com/umeng/common/ufp/net/a$a:b	Ljava/lang/String;
    //   356: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: ldc_w 273
    //   362: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: aload_0
    //   366: getfield 38	com/umeng/common/ufp/net/DownloadingService$b:f	J
    //   369: invokestatic 276	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   372: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   378: invokestatic 200	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   381: aload 6
    //   383: astore 10
    //   385: aload 7
    //   387: astore 9
    //   389: aload_0
    //   390: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   393: invokestatic 281	com/umeng/common/ufp/net/b:a	(Landroid/content/Context;)Lcom/umeng/common/ufp/net/b;
    //   396: aload_0
    //   397: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   400: getfield 167	com/umeng/common/ufp/net/a$a:a	Ljava/lang/String;
    //   403: aload_0
    //   404: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   407: getfield 158	com/umeng/common/ufp/net/a$a:c	Ljava/lang/String;
    //   410: invokevirtual 284	com/umeng/common/ufp/net/b:a	(Ljava/lang/String;Ljava/lang/String;)Z
    //   413: pop
    //   414: iconst_0
    //   415: istore_2
    //   416: aload 6
    //   418: astore 10
    //   420: aload 7
    //   422: astore 9
    //   424: aload_0
    //   425: getfield 40	com/umeng/common/ufp/net/DownloadingService$b:g	I
    //   428: ifge +2683 -> 3111
    //   431: aload 6
    //   433: astore 10
    //   435: aload 7
    //   437: astore 9
    //   439: aload 7
    //   441: aload 11
    //   443: invokevirtual 290	java/io/InputStream:read	([B)I
    //   446: istore_3
    //   447: iload_3
    //   448: ifle +2663 -> 3111
    //   451: aload 6
    //   453: astore 10
    //   455: aload 7
    //   457: astore 9
    //   459: aload 6
    //   461: aload 11
    //   463: iconst_0
    //   464: iload_3
    //   465: invokevirtual 294	java/io/FileOutputStream:write	([BII)V
    //   468: aload 6
    //   470: astore 10
    //   472: aload 7
    //   474: astore 9
    //   476: aload_0
    //   477: getfield 36	com/umeng/common/ufp/net/DownloadingService$b:e	J
    //   480: lstore 4
    //   482: aload 6
    //   484: astore 10
    //   486: aload 7
    //   488: astore 9
    //   490: aload_0
    //   491: iload_3
    //   492: i2l
    //   493: lload 4
    //   495: ladd
    //   496: putfield 36	com/umeng/common/ufp/net/DownloadingService$b:e	J
    //   499: iload_2
    //   500: iconst_1
    //   501: iadd
    //   502: istore_3
    //   503: iload_2
    //   504: bipush 50
    //   506: irem
    //   507: ifne +2599 -> 3106
    //   510: aload 6
    //   512: astore 10
    //   514: aload 7
    //   516: astore 9
    //   518: aload_0
    //   519: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   522: invokestatic 298	com/umeng/common/ufp/b:z	(Landroid/content/Context;)Z
    //   525: ifne +196 -> 721
    //   528: iconst_0
    //   529: istore_2
    //   530: aload 6
    //   532: astore 10
    //   534: aload 7
    //   536: astore 9
    //   538: aload 7
    //   540: invokevirtual 301	java/io/InputStream:close	()V
    //   543: aload 6
    //   545: astore 10
    //   547: aload 7
    //   549: astore 9
    //   551: aload 6
    //   553: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   556: aload 6
    //   558: astore 10
    //   560: aload 7
    //   562: astore 9
    //   564: aload_0
    //   565: getfield 40	com/umeng/common/ufp/net/DownloadingService$b:g	I
    //   568: iconst_1
    //   569: if_icmpne +521 -> 1090
    //   572: aload 6
    //   574: astore 10
    //   576: aload 7
    //   578: astore 9
    //   580: invokestatic 49	com/umeng/common/ufp/net/DownloadingService:c	()Ljava/util/Map;
    //   583: aload_0
    //   584: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   587: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   590: invokeinterface 65 2 0
    //   595: checkcast 67	com/umeng/common/ufp/net/DownloadingService$d
    //   598: astore 8
    //   600: aload 6
    //   602: astore 10
    //   604: aload 7
    //   606: astore 9
    //   608: aload 8
    //   610: getfield 70	com/umeng/common/ufp/net/DownloadingService$d:f	[J
    //   613: iconst_0
    //   614: aload_0
    //   615: getfield 36	com/umeng/common/ufp/net/DownloadingService$b:e	J
    //   618: lastore
    //   619: aload 6
    //   621: astore 10
    //   623: aload 7
    //   625: astore 9
    //   627: aload 8
    //   629: getfield 70	com/umeng/common/ufp/net/DownloadingService$d:f	[J
    //   632: iconst_1
    //   633: aload_0
    //   634: getfield 38	com/umeng/common/ufp/net/DownloadingService$b:f	J
    //   637: lastore
    //   638: aload 6
    //   640: astore 10
    //   642: aload 7
    //   644: astore 9
    //   646: aload 8
    //   648: getfield 70	com/umeng/common/ufp/net/DownloadingService$d:f	[J
    //   651: iconst_2
    //   652: aload_0
    //   653: getfield 32	com/umeng/common/ufp/net/DownloadingService$b:d	I
    //   656: i2l
    //   657: lastore
    //   658: aload 7
    //   660: ifnull +8 -> 668
    //   663: aload 7
    //   665: invokevirtual 301	java/io/InputStream:close	()V
    //   668: aload 6
    //   670: ifnull +8 -> 678
    //   673: aload 6
    //   675: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   678: return
    //   679: aload_0
    //   680: aload_0
    //   681: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   684: invokevirtual 116	android/content/Context:getFilesDir	()Ljava/io/File;
    //   687: invokevirtual 119	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   690: putfield 93	com/umeng/common/ufp/net/DownloadingService$b:c	Ljava/lang/String;
    //   693: aload_0
    //   694: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   697: aload 7
    //   699: ldc_w 303
    //   702: invokevirtual 307	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   705: astore 6
    //   707: aload_0
    //   708: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   711: aload 7
    //   713: invokevirtual 311	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   716: astore 8
    //   718: goto -629 -> 89
    //   721: aload 6
    //   723: astore 10
    //   725: aload 7
    //   727: astore 9
    //   729: aload_0
    //   730: getfield 36	com/umeng/common/ufp/net/DownloadingService$b:e	J
    //   733: l2f
    //   734: ldc_w 312
    //   737: fmul
    //   738: aload_0
    //   739: getfield 38	com/umeng/common/ufp/net/DownloadingService$b:f	J
    //   742: l2f
    //   743: fdiv
    //   744: f2i
    //   745: istore_2
    //   746: iload_2
    //   747: bipush 100
    //   749: if_icmple +2354 -> 3103
    //   752: bipush 99
    //   754: istore_2
    //   755: aload 6
    //   757: astore 10
    //   759: aload 7
    //   761: astore 9
    //   763: aload_0
    //   764: getfield 72	com/umeng/common/ufp/net/DownloadingService$b:i	Lcom/umeng/common/ufp/net/DownloadingService$a;
    //   767: ifnull +25 -> 792
    //   770: aload 6
    //   772: astore 10
    //   774: aload 7
    //   776: astore 9
    //   778: aload_0
    //   779: getfield 72	com/umeng/common/ufp/net/DownloadingService$b:i	Lcom/umeng/common/ufp/net/DownloadingService$a;
    //   782: aload_0
    //   783: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   786: iload_2
    //   787: invokeinterface 315 3 0
    //   792: aload 6
    //   794: astore 10
    //   796: aload 7
    //   798: astore 9
    //   800: invokestatic 317	com/umeng/common/ufp/net/DownloadingService:b	()Ljava/util/Map;
    //   803: aload_0
    //   804: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   807: invokeinterface 65 2 0
    //   812: ifnull +36 -> 848
    //   815: aload 6
    //   817: astore 10
    //   819: aload 7
    //   821: astore 9
    //   823: invokestatic 317	com/umeng/common/ufp/net/DownloadingService:b	()Ljava/util/Map;
    //   826: aload_0
    //   827: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   830: invokeinterface 65 2 0
    //   835: checkcast 319	android/os/Messenger
    //   838: aconst_null
    //   839: iconst_3
    //   840: iload_2
    //   841: iconst_0
    //   842: invokestatic 325	android/os/Message:obtain	(Landroid/os/Handler;III)Landroid/os/Message;
    //   845: invokevirtual 329	android/os/Messenger:send	(Landroid/os/Message;)V
    //   848: aload 6
    //   850: astore 10
    //   852: aload 7
    //   854: astore 9
    //   856: aload_0
    //   857: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   860: invokestatic 281	com/umeng/common/ufp/net/b:a	(Landroid/content/Context;)Lcom/umeng/common/ufp/net/b;
    //   863: aload_0
    //   864: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   867: getfield 167	com/umeng/common/ufp/net/a$a:a	Ljava/lang/String;
    //   870: aload_0
    //   871: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   874: getfield 158	com/umeng/common/ufp/net/a$a:c	Ljava/lang/String;
    //   877: iload_2
    //   878: invokevirtual 332	com/umeng/common/ufp/net/b:a	(Ljava/lang/String;Ljava/lang/String;I)V
    //   881: iload_3
    //   882: istore_2
    //   883: goto -467 -> 416
    //   886: astore 9
    //   888: aload 6
    //   890: astore 10
    //   892: aload 7
    //   894: astore 9
    //   896: invokestatic 121	com/umeng/common/ufp/net/DownloadingService:a	()Ljava/lang/String;
    //   899: ldc_w 334
    //   902: iconst_1
    //   903: anewarray 194	java/lang/Object
    //   906: dup
    //   907: iconst_0
    //   908: aload_0
    //   909: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   912: getfield 271	com/umeng/common/ufp/net/a$a:b	Ljava/lang/String;
    //   915: aastore
    //   916: invokestatic 198	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   919: invokestatic 143	com/umeng/common/ufp/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   922: aload 6
    //   924: astore 10
    //   926: aload 7
    //   928: astore 9
    //   930: invokestatic 317	com/umeng/common/ufp/net/DownloadingService:b	()Ljava/util/Map;
    //   933: aload_0
    //   934: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   937: aconst_null
    //   938: invokeinterface 338 3 0
    //   943: pop
    //   944: goto -96 -> 848
    //   947: astore 8
    //   949: invokestatic 121	com/umeng/common/ufp/net/DownloadingService:a	()Ljava/lang/String;
    //   952: aload 8
    //   954: invokevirtual 339	java/io/IOException:getMessage	()Ljava/lang/String;
    //   957: aload 8
    //   959: invokestatic 129	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   962: aload_0
    //   963: getfield 32	com/umeng/common/ufp/net/DownloadingService$b:d	I
    //   966: iconst_1
    //   967: iadd
    //   968: istore_2
    //   969: aload_0
    //   970: iload_2
    //   971: putfield 32	com/umeng/common/ufp/net/DownloadingService$b:d	I
    //   974: iload_2
    //   975: iconst_3
    //   976: if_icmple +1356 -> 2332
    //   979: aload_0
    //   980: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   983: getfield 342	com/umeng/common/ufp/net/a$a:g	Z
    //   986: istore_1
    //   987: iload_1
    //   988: ifne +1344 -> 2332
    //   991: invokestatic 121	com/umeng/common/ufp/net/DownloadingService:a	()Ljava/lang/String;
    //   994: ldc_w 344
    //   997: invokestatic 143	com/umeng/common/ufp/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   1000: invokestatic 317	com/umeng/common/ufp/net/DownloadingService:b	()Ljava/util/Map;
    //   1003: aload_0
    //   1004: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   1007: invokeinterface 65 2 0
    //   1012: checkcast 319	android/os/Messenger
    //   1015: aconst_null
    //   1016: iconst_5
    //   1017: iconst_0
    //   1018: iconst_0
    //   1019: invokestatic 325	android/os/Message:obtain	(Landroid/os/Handler;III)Landroid/os/Message;
    //   1022: invokevirtual 329	android/os/Messenger:send	(Landroid/os/Message;)V
    //   1025: aload_0
    //   1026: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   1029: aload_0
    //   1030: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   1033: invokestatic 347	com/umeng/common/ufp/net/DownloadingService:a	(Lcom/umeng/common/ufp/net/DownloadingService;I)V
    //   1036: aload_0
    //   1037: aload 8
    //   1039: invokespecial 349	com/umeng/common/ufp/net/DownloadingService$b:a	(Ljava/lang/Exception;)V
    //   1042: aload_0
    //   1043: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   1046: invokestatic 352	com/umeng/common/ufp/net/DownloadingService:c	(Lcom/umeng/common/ufp/net/DownloadingService;)Landroid/os/Handler;
    //   1049: new 354	com/umeng/common/ufp/net/DownloadingService$b$1
    //   1052: dup
    //   1053: aload_0
    //   1054: invokespecial 357	com/umeng/common/ufp/net/DownloadingService$b$1:<init>	(Lcom/umeng/common/ufp/net/DownloadingService$b;)V
    //   1057: invokevirtual 363	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   1060: pop
    //   1061: aload 7
    //   1063: ifnull +8 -> 1071
    //   1066: aload 7
    //   1068: invokevirtual 301	java/io/InputStream:close	()V
    //   1071: aload 6
    //   1073: ifnull -395 -> 678
    //   1076: aload 6
    //   1078: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   1081: return
    //   1082: astore 6
    //   1084: aload 6
    //   1086: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   1089: return
    //   1090: aload 6
    //   1092: astore 10
    //   1094: aload 7
    //   1096: astore 9
    //   1098: aload_0
    //   1099: getfield 40	com/umeng/common/ufp/net/DownloadingService$b:g	I
    //   1102: iconst_2
    //   1103: if_icmpne +83 -> 1186
    //   1106: aload 6
    //   1108: astore 10
    //   1110: aload 7
    //   1112: astore 9
    //   1114: aload_0
    //   1115: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   1118: aload_0
    //   1119: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   1122: aload_0
    //   1123: getfield 36	com/umeng/common/ufp/net/DownloadingService$b:e	J
    //   1126: aload_0
    //   1127: getfield 38	com/umeng/common/ufp/net/DownloadingService$b:f	J
    //   1130: aload_0
    //   1131: getfield 32	com/umeng/common/ufp/net/DownloadingService$b:d	I
    //   1134: i2l
    //   1135: invokestatic 146	com/umeng/common/ufp/net/DownloadingService:a	(Lcom/umeng/common/ufp/net/DownloadingService;Lcom/umeng/common/ufp/net/a$a;JJJ)V
    //   1138: aload 6
    //   1140: astore 10
    //   1142: aload 7
    //   1144: astore 9
    //   1146: aload_0
    //   1147: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   1150: invokestatic 369	com/umeng/common/ufp/net/DownloadingService:b	(Lcom/umeng/common/ufp/net/DownloadingService;)Landroid/app/NotificationManager;
    //   1153: aload_0
    //   1154: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   1157: invokevirtual 374	android/app/NotificationManager:cancel	(I)V
    //   1160: aload 7
    //   1162: ifnull +8 -> 1170
    //   1165: aload 7
    //   1167: invokevirtual 301	java/io/InputStream:close	()V
    //   1170: aload 6
    //   1172: ifnull -494 -> 678
    //   1175: aload 6
    //   1177: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   1180: return
    //   1181: astore 6
    //   1183: goto -99 -> 1084
    //   1186: iload_2
    //   1187: ifne +152 -> 1339
    //   1190: aload 6
    //   1192: astore 10
    //   1194: aload 7
    //   1196: astore 9
    //   1198: invokestatic 121	com/umeng/common/ufp/net/DownloadingService:a	()Ljava/lang/String;
    //   1201: new 101	java/lang/StringBuilder
    //   1204: dup
    //   1205: ldc_w 376
    //   1208: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1211: aload_0
    //   1212: getfield 32	com/umeng/common/ufp/net/DownloadingService$b:d	I
    //   1215: invokevirtual 379	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1218: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1221: invokestatic 143	com/umeng/common/ufp/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   1224: aload 6
    //   1226: astore 10
    //   1228: aload 7
    //   1230: astore 9
    //   1232: invokestatic 317	com/umeng/common/ufp/net/DownloadingService:b	()Ljava/util/Map;
    //   1235: aload_0
    //   1236: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   1239: invokeinterface 65 2 0
    //   1244: checkcast 319	android/os/Messenger
    //   1247: aconst_null
    //   1248: iconst_5
    //   1249: iconst_0
    //   1250: iconst_0
    //   1251: invokestatic 325	android/os/Message:obtain	(Landroid/os/Handler;III)Landroid/os/Message;
    //   1254: invokevirtual 329	android/os/Messenger:send	(Landroid/os/Message;)V
    //   1257: aload 6
    //   1259: astore 10
    //   1261: aload 7
    //   1263: astore 9
    //   1265: aload_0
    //   1266: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   1269: aload_0
    //   1270: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   1273: invokestatic 347	com/umeng/common/ufp/net/DownloadingService:a	(Lcom/umeng/common/ufp/net/DownloadingService;I)V
    //   1276: aload 6
    //   1278: astore 10
    //   1280: aload 7
    //   1282: astore 9
    //   1284: aload_0
    //   1285: getfield 72	com/umeng/common/ufp/net/DownloadingService$b:i	Lcom/umeng/common/ufp/net/DownloadingService$a;
    //   1288: ifnull +25 -> 1313
    //   1291: aload 6
    //   1293: astore 10
    //   1295: aload 7
    //   1297: astore 9
    //   1299: aload_0
    //   1300: getfield 72	com/umeng/common/ufp/net/DownloadingService$b:i	Lcom/umeng/common/ufp/net/DownloadingService$a;
    //   1303: aload_0
    //   1304: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   1307: aconst_null
    //   1308: invokeinterface 134 3 0
    //   1313: aload 7
    //   1315: ifnull +8 -> 1323
    //   1318: aload 7
    //   1320: invokevirtual 301	java/io/InputStream:close	()V
    //   1323: aload 6
    //   1325: ifnull -647 -> 678
    //   1328: aload 6
    //   1330: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   1333: return
    //   1334: astore 6
    //   1336: goto -252 -> 1084
    //   1339: aload 6
    //   1341: astore 10
    //   1343: aload 7
    //   1345: astore 9
    //   1347: aload_0
    //   1348: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   1351: getfield 382	com/umeng/common/ufp/net/a$a:f	[Ljava/lang/String;
    //   1354: ifnull +123 -> 1477
    //   1357: aload 6
    //   1359: astore 10
    //   1361: aload 7
    //   1363: astore 9
    //   1365: new 384	java/util/HashMap
    //   1368: dup
    //   1369: invokespecial 385	java/util/HashMap:<init>	()V
    //   1372: astore 11
    //   1374: aload 6
    //   1376: astore 10
    //   1378: aload 7
    //   1380: astore 9
    //   1382: aload 11
    //   1384: ldc_w 387
    //   1387: aload_0
    //   1388: getfield 38	com/umeng/common/ufp/net/DownloadingService$b:f	J
    //   1391: invokestatic 276	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   1394: invokeinterface 338 3 0
    //   1399: pop
    //   1400: aload 6
    //   1402: astore 10
    //   1404: aload 7
    //   1406: astore 9
    //   1408: aload 11
    //   1410: ldc_w 389
    //   1413: invokestatic 390	com/umeng/common/ufp/util/g:a	()Ljava/lang/String;
    //   1416: ldc_w 392
    //   1419: invokevirtual 396	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1422: iconst_1
    //   1423: aaload
    //   1424: invokeinterface 338 3 0
    //   1429: pop
    //   1430: aload 6
    //   1432: astore 10
    //   1434: aload 7
    //   1436: astore 9
    //   1438: aload 11
    //   1440: ldc_w 398
    //   1443: aload_0
    //   1444: getfield 32	com/umeng/common/ufp/net/DownloadingService$b:d	I
    //   1447: invokestatic 401	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1450: invokeinterface 338 3 0
    //   1455: pop
    //   1456: aload 6
    //   1458: astore 10
    //   1460: aload 7
    //   1462: astore 9
    //   1464: aload 11
    //   1466: iconst_1
    //   1467: aload_0
    //   1468: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   1471: getfield 382	com/umeng/common/ufp/net/a$a:f	[Ljava/lang/String;
    //   1474: invokestatic 404	com/umeng/common/ufp/net/DownloadingService:a	(Ljava/util/Map;Z[Ljava/lang/String;)V
    //   1477: aload 6
    //   1479: astore 10
    //   1481: aload 7
    //   1483: astore 9
    //   1485: new 87	java/io/File
    //   1488: dup
    //   1489: aload 8
    //   1491: invokevirtual 407	java/io/File:getParent	()Ljava/lang/String;
    //   1494: aload 8
    //   1496: invokevirtual 410	java/io/File:getName	()Ljava/lang/String;
    //   1499: ldc_w 412
    //   1502: ldc_w 414
    //   1505: invokevirtual 183	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1508: invokespecial 185	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1511: astore 11
    //   1513: aload 6
    //   1515: astore 10
    //   1517: aload 7
    //   1519: astore 9
    //   1521: aload 8
    //   1523: aload 11
    //   1525: invokevirtual 418	java/io/File:renameTo	(Ljava/io/File;)Z
    //   1528: pop
    //   1529: aload 6
    //   1531: astore 10
    //   1533: aload 7
    //   1535: astore 9
    //   1537: aload 11
    //   1539: invokevirtual 119	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1542: astore 8
    //   1544: aload 6
    //   1546: astore 10
    //   1548: aload 7
    //   1550: astore 9
    //   1552: aload_0
    //   1553: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   1556: getfield 420	com/umeng/common/ufp/net/a$a:d	Ljava/lang/String;
    //   1559: ifnull +589 -> 2148
    //   1562: aload 6
    //   1564: astore 10
    //   1566: aload 7
    //   1568: astore 9
    //   1570: aload_0
    //   1571: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   1574: getfield 420	com/umeng/common/ufp/net/a$a:d	Ljava/lang/String;
    //   1577: aload 11
    //   1579: invokestatic 423	com/umeng/common/ufp/util/g:a	(Ljava/io/File;)Ljava/lang/String;
    //   1582: invokevirtual 175	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1585: ifne +563 -> 2148
    //   1588: aload 6
    //   1590: astore 10
    //   1592: aload 7
    //   1594: astore 9
    //   1596: aload_0
    //   1597: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   1600: getfield 167	com/umeng/common/ufp/net/a$a:a	Ljava/lang/String;
    //   1603: ldc -87
    //   1605: invokevirtual 175	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1608: ifeq +313 -> 1921
    //   1611: aload 6
    //   1613: astore 10
    //   1615: aload 7
    //   1617: astore 9
    //   1619: aload_0
    //   1620: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   1623: invokestatic 369	com/umeng/common/ufp/net/DownloadingService:b	(Lcom/umeng/common/ufp/net/DownloadingService;)Landroid/app/NotificationManager;
    //   1626: aload_0
    //   1627: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   1630: invokevirtual 374	android/app/NotificationManager:cancel	(I)V
    //   1633: aload 6
    //   1635: astore 10
    //   1637: aload 7
    //   1639: astore 9
    //   1641: new 425	android/os/Bundle
    //   1644: dup
    //   1645: invokespecial 426	android/os/Bundle:<init>	()V
    //   1648: astore 11
    //   1650: aload 6
    //   1652: astore 10
    //   1654: aload 7
    //   1656: astore 9
    //   1658: aload 11
    //   1660: ldc_w 428
    //   1663: aload 8
    //   1665: invokevirtual 431	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   1668: aload 6
    //   1670: astore 10
    //   1672: aload 7
    //   1674: astore 9
    //   1676: invokestatic 434	android/os/Message:obtain	()Landroid/os/Message;
    //   1679: astore 8
    //   1681: aload 6
    //   1683: astore 10
    //   1685: aload 7
    //   1687: astore 9
    //   1689: aload 8
    //   1691: iconst_5
    //   1692: putfield 437	android/os/Message:what	I
    //   1695: aload 6
    //   1697: astore 10
    //   1699: aload 7
    //   1701: astore 9
    //   1703: aload 8
    //   1705: iconst_3
    //   1706: putfield 440	android/os/Message:arg1	I
    //   1709: aload 6
    //   1711: astore 10
    //   1713: aload 7
    //   1715: astore 9
    //   1717: aload 8
    //   1719: aload_0
    //   1720: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   1723: putfield 443	android/os/Message:arg2	I
    //   1726: aload 6
    //   1728: astore 10
    //   1730: aload 7
    //   1732: astore 9
    //   1734: aload 8
    //   1736: aload 11
    //   1738: invokevirtual 447	android/os/Message:setData	(Landroid/os/Bundle;)V
    //   1741: aload 6
    //   1743: astore 10
    //   1745: aload 7
    //   1747: astore 9
    //   1749: invokestatic 317	com/umeng/common/ufp/net/DownloadingService:b	()Ljava/util/Map;
    //   1752: aload_0
    //   1753: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   1756: invokeinterface 65 2 0
    //   1761: ifnull +31 -> 1792
    //   1764: aload 6
    //   1766: astore 10
    //   1768: aload 7
    //   1770: astore 9
    //   1772: invokestatic 317	com/umeng/common/ufp/net/DownloadingService:b	()Ljava/util/Map;
    //   1775: aload_0
    //   1776: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   1779: invokeinterface 65 2 0
    //   1784: checkcast 319	android/os/Messenger
    //   1787: aload 8
    //   1789: invokevirtual 329	android/os/Messenger:send	(Landroid/os/Message;)V
    //   1792: aload 6
    //   1794: astore 10
    //   1796: aload 7
    //   1798: astore 9
    //   1800: aload_0
    //   1801: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   1804: aload_0
    //   1805: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   1808: invokestatic 347	com/umeng/common/ufp/net/DownloadingService:a	(Lcom/umeng/common/ufp/net/DownloadingService;I)V
    //   1811: aload 7
    //   1813: ifnull +8 -> 1821
    //   1816: aload 7
    //   1818: invokevirtual 301	java/io/InputStream:close	()V
    //   1821: aload 6
    //   1823: ifnull -1145 -> 678
    //   1826: aload 6
    //   1828: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   1831: return
    //   1832: astore 6
    //   1834: goto -750 -> 1084
    //   1837: astore 8
    //   1839: aload 6
    //   1841: astore 10
    //   1843: aload 7
    //   1845: astore 9
    //   1847: aload_0
    //   1848: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   1851: aload_0
    //   1852: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   1855: invokestatic 347	com/umeng/common/ufp/net/DownloadingService:a	(Lcom/umeng/common/ufp/net/DownloadingService;I)V
    //   1858: goto -47 -> 1811
    //   1861: astore 8
    //   1863: aload 6
    //   1865: astore 10
    //   1867: aload 7
    //   1869: astore 9
    //   1871: aload_0
    //   1872: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   1875: aload_0
    //   1876: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   1879: invokestatic 347	com/umeng/common/ufp/net/DownloadingService:a	(Lcom/umeng/common/ufp/net/DownloadingService;I)V
    //   1882: aload 6
    //   1884: astore 10
    //   1886: aload 7
    //   1888: astore 9
    //   1890: aload 8
    //   1892: invokevirtual 448	android/os/RemoteException:printStackTrace	()V
    //   1895: aload 7
    //   1897: ifnull +8 -> 1905
    //   1900: aload 7
    //   1902: invokevirtual 301	java/io/InputStream:close	()V
    //   1905: aload 6
    //   1907: ifnull -1229 -> 678
    //   1910: aload 6
    //   1912: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   1915: return
    //   1916: astore 6
    //   1918: goto -834 -> 1084
    //   1921: aload 6
    //   1923: astore 10
    //   1925: aload 7
    //   1927: astore 9
    //   1929: invokestatic 317	com/umeng/common/ufp/net/DownloadingService:b	()Ljava/util/Map;
    //   1932: aload_0
    //   1933: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   1936: invokeinterface 65 2 0
    //   1941: checkcast 319	android/os/Messenger
    //   1944: aconst_null
    //   1945: iconst_5
    //   1946: iconst_0
    //   1947: iconst_0
    //   1948: invokestatic 325	android/os/Message:obtain	(Landroid/os/Handler;III)Landroid/os/Message;
    //   1951: invokevirtual 329	android/os/Messenger:send	(Landroid/os/Message;)V
    //   1954: aload 6
    //   1956: astore 10
    //   1958: aload 7
    //   1960: astore 9
    //   1962: aload_0
    //   1963: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   1966: aload_0
    //   1967: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   1970: invokestatic 347	com/umeng/common/ufp/net/DownloadingService:a	(Lcom/umeng/common/ufp/net/DownloadingService;I)V
    //   1973: aload 6
    //   1975: astore 10
    //   1977: aload 7
    //   1979: astore 9
    //   1981: new 450	android/app/Notification
    //   1984: dup
    //   1985: ldc_w 451
    //   1988: ldc_w 453
    //   1991: invokestatic 458	java/lang/System:currentTimeMillis	()J
    //   1994: invokespecial 461	android/app/Notification:<init>	(ILjava/lang/CharSequence;J)V
    //   1997: astore 8
    //   1999: aload 6
    //   2001: astore 10
    //   2003: aload 7
    //   2005: astore 9
    //   2007: aload_0
    //   2008: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   2011: iconst_0
    //   2012: new 463	android/content/Intent
    //   2015: dup
    //   2016: invokespecial 464	android/content/Intent:<init>	()V
    //   2019: iconst_0
    //   2020: invokestatic 470	android/app/PendingIntent:getActivity	(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   2023: astore 11
    //   2025: aload 6
    //   2027: astore 10
    //   2029: aload 7
    //   2031: astore 9
    //   2033: aload 8
    //   2035: aload_0
    //   2036: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   2039: aload_0
    //   2040: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   2043: invokestatic 473	com/umeng/common/ufp/b:I	(Landroid/content/Context;)Ljava/lang/String;
    //   2046: new 101	java/lang/StringBuilder
    //   2049: dup
    //   2050: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   2053: aload_0
    //   2054: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   2057: getfield 271	com/umeng/common/ufp/net/a$a:b	Ljava/lang/String;
    //   2060: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2063: ldc_w 453
    //   2066: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2069: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2072: aload 11
    //   2074: invokevirtual 477	android/app/Notification:setLatestEventInfo	(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
    //   2077: aload 6
    //   2079: astore 10
    //   2081: aload 7
    //   2083: astore 9
    //   2085: aload 8
    //   2087: aload 8
    //   2089: getfield 480	android/app/Notification:flags	I
    //   2092: bipush 16
    //   2094: ior
    //   2095: putfield 480	android/app/Notification:flags	I
    //   2098: aload 6
    //   2100: astore 10
    //   2102: aload 7
    //   2104: astore 9
    //   2106: aload_0
    //   2107: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   2110: invokestatic 369	com/umeng/common/ufp/net/DownloadingService:b	(Lcom/umeng/common/ufp/net/DownloadingService;)Landroid/app/NotificationManager;
    //   2113: aload_0
    //   2114: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   2117: aload 8
    //   2119: invokevirtual 484	android/app/NotificationManager:notify	(ILandroid/app/Notification;)V
    //   2122: aload 7
    //   2124: ifnull +8 -> 2132
    //   2127: aload 7
    //   2129: invokevirtual 301	java/io/InputStream:close	()V
    //   2132: aload 6
    //   2134: ifnull -1456 -> 678
    //   2137: aload 6
    //   2139: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2142: return
    //   2143: astore 6
    //   2145: goto -1061 -> 1084
    //   2148: aload 6
    //   2150: astore 10
    //   2152: aload 7
    //   2154: astore 9
    //   2156: aload_0
    //   2157: getfield 72	com/umeng/common/ufp/net/DownloadingService$b:i	Lcom/umeng/common/ufp/net/DownloadingService$a;
    //   2160: ifnull +26 -> 2186
    //   2163: aload 6
    //   2165: astore 10
    //   2167: aload 7
    //   2169: astore 9
    //   2171: aload_0
    //   2172: getfield 72	com/umeng/common/ufp/net/DownloadingService$b:i	Lcom/umeng/common/ufp/net/DownloadingService$a;
    //   2175: aload_0
    //   2176: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   2179: aload 8
    //   2181: invokeinterface 487 3 0
    //   2186: aload 7
    //   2188: ifnull +8 -> 2196
    //   2191: aload 7
    //   2193: invokevirtual 301	java/io/InputStream:close	()V
    //   2196: aload 6
    //   2198: ifnull -1520 -> 678
    //   2201: aload 6
    //   2203: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2206: return
    //   2207: astore 6
    //   2209: goto -1125 -> 1084
    //   2212: astore 9
    //   2214: aload 9
    //   2216: invokevirtual 448	android/os/RemoteException:printStackTrace	()V
    //   2219: aload_0
    //   2220: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   2223: aload_0
    //   2224: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   2227: invokestatic 347	com/umeng/common/ufp/net/DownloadingService:a	(Lcom/umeng/common/ufp/net/DownloadingService;I)V
    //   2230: aload_0
    //   2231: aload 8
    //   2233: invokespecial 349	com/umeng/common/ufp/net/DownloadingService$b:a	(Ljava/lang/Exception;)V
    //   2236: aload_0
    //   2237: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   2240: invokestatic 352	com/umeng/common/ufp/net/DownloadingService:c	(Lcom/umeng/common/ufp/net/DownloadingService;)Landroid/os/Handler;
    //   2243: new 354	com/umeng/common/ufp/net/DownloadingService$b$1
    //   2246: dup
    //   2247: aload_0
    //   2248: invokespecial 357	com/umeng/common/ufp/net/DownloadingService$b$1:<init>	(Lcom/umeng/common/ufp/net/DownloadingService$b;)V
    //   2251: invokevirtual 363	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   2254: pop
    //   2255: goto -1194 -> 1061
    //   2258: astore 9
    //   2260: aload 7
    //   2262: astore 8
    //   2264: aload 9
    //   2266: astore 7
    //   2268: aload 8
    //   2270: ifnull +8 -> 2278
    //   2273: aload 8
    //   2275: invokevirtual 301	java/io/InputStream:close	()V
    //   2278: aload 6
    //   2280: ifnull +8 -> 2288
    //   2283: aload 6
    //   2285: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2288: aload 7
    //   2290: athrow
    //   2291: astore 9
    //   2293: aload_0
    //   2294: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   2297: aload_0
    //   2298: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   2301: invokestatic 347	com/umeng/common/ufp/net/DownloadingService:a	(Lcom/umeng/common/ufp/net/DownloadingService;I)V
    //   2304: aload_0
    //   2305: aload 8
    //   2307: invokespecial 349	com/umeng/common/ufp/net/DownloadingService$b:a	(Ljava/lang/Exception;)V
    //   2310: aload_0
    //   2311: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   2314: invokestatic 352	com/umeng/common/ufp/net/DownloadingService:c	(Lcom/umeng/common/ufp/net/DownloadingService;)Landroid/os/Handler;
    //   2317: new 354	com/umeng/common/ufp/net/DownloadingService$b$1
    //   2320: dup
    //   2321: aload_0
    //   2322: invokespecial 357	com/umeng/common/ufp/net/DownloadingService$b$1:<init>	(Lcom/umeng/common/ufp/net/DownloadingService$b;)V
    //   2325: invokevirtual 363	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   2328: pop
    //   2329: aload 9
    //   2331: athrow
    //   2332: invokestatic 121	com/umeng/common/ufp/net/DownloadingService:a	()Ljava/lang/String;
    //   2335: new 101	java/lang/StringBuilder
    //   2338: dup
    //   2339: ldc_w 489
    //   2342: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2345: aload_0
    //   2346: getfield 32	com/umeng/common/ufp/net/DownloadingService$b:d	I
    //   2349: invokevirtual 379	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2352: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2355: invokestatic 200	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   2358: aload_0
    //   2359: getfield 44	com/umeng/common/ufp/net/DownloadingService$b:j	Lcom/umeng/common/ufp/net/a$a;
    //   2362: getfield 342	com/umeng/common/ufp/net/a$a:g	Z
    //   2365: ifne +56 -> 2421
    //   2368: ldc2_w 490
    //   2371: invokestatic 495	java/lang/Thread:sleep	(J)V
    //   2374: aload_0
    //   2375: getfield 38	com/umeng/common/ufp/net/DownloadingService$b:f	J
    //   2378: lconst_1
    //   2379: lcmp
    //   2380: ifge +33 -> 2413
    //   2383: aload_0
    //   2384: iconst_0
    //   2385: invokespecial 497	com/umeng/common/ufp/net/DownloadingService$b:a	(Z)V
    //   2388: goto -1327 -> 1061
    //   2391: astore 8
    //   2393: aload_0
    //   2394: aload 8
    //   2396: invokespecial 349	com/umeng/common/ufp/net/DownloadingService$b:a	(Ljava/lang/Exception;)V
    //   2399: aload_0
    //   2400: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   2403: aload_0
    //   2404: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   2407: invokestatic 347	com/umeng/common/ufp/net/DownloadingService:a	(Lcom/umeng/common/ufp/net/DownloadingService;I)V
    //   2410: goto -1349 -> 1061
    //   2413: aload_0
    //   2414: iconst_1
    //   2415: invokespecial 497	com/umeng/common/ufp/net/DownloadingService$b:a	(Z)V
    //   2418: goto -1357 -> 1061
    //   2421: invokestatic 49	com/umeng/common/ufp/net/DownloadingService:c	()Ljava/util/Map;
    //   2424: aload_0
    //   2425: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   2428: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2431: invokeinterface 65 2 0
    //   2436: checkcast 67	com/umeng/common/ufp/net/DownloadingService$d
    //   2439: astore 8
    //   2441: aload 8
    //   2443: getfield 70	com/umeng/common/ufp/net/DownloadingService$d:f	[J
    //   2446: iconst_0
    //   2447: aload_0
    //   2448: getfield 36	com/umeng/common/ufp/net/DownloadingService$b:e	J
    //   2451: lastore
    //   2452: aload 8
    //   2454: getfield 70	com/umeng/common/ufp/net/DownloadingService$d:f	[J
    //   2457: iconst_1
    //   2458: aload_0
    //   2459: getfield 38	com/umeng/common/ufp/net/DownloadingService$b:f	J
    //   2462: lastore
    //   2463: aload 8
    //   2465: getfield 70	com/umeng/common/ufp/net/DownloadingService$d:f	[J
    //   2468: iconst_2
    //   2469: aload_0
    //   2470: getfield 32	com/umeng/common/ufp/net/DownloadingService$b:d	I
    //   2473: i2l
    //   2474: lastore
    //   2475: aload_0
    //   2476: getfield 74	com/umeng/common/ufp/net/DownloadingService$b:h	I
    //   2479: ldc_w 499
    //   2482: invokestatic 504	com/umeng/common/ufp/net/d:a	(ILjava/lang/String;)Ljava/lang/String;
    //   2485: astore 8
    //   2487: new 463	android/content/Intent
    //   2490: dup
    //   2491: aload_0
    //   2492: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   2495: ldc 46
    //   2497: invokespecial 507	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   2500: astore 9
    //   2502: aload 9
    //   2504: ldc_w 509
    //   2507: aload 8
    //   2509: invokevirtual 513	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   2512: pop
    //   2513: aload_0
    //   2514: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   2517: aload_0
    //   2518: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   2521: aload 9
    //   2523: invokestatic 516	com/umeng/common/ufp/net/DownloadingService:a	(Lcom/umeng/common/ufp/net/DownloadingService;Landroid/content/Context;Landroid/content/Intent;)Z
    //   2526: pop
    //   2527: aload_0
    //   2528: getfield 27	com/umeng/common/ufp/net/DownloadingService$b:a	Lcom/umeng/common/ufp/net/DownloadingService;
    //   2531: aload_0
    //   2532: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   2535: aload_0
    //   2536: getfield 42	com/umeng/common/ufp/net/DownloadingService$b:b	Landroid/content/Context;
    //   2539: invokestatic 521	com/umeng/common/ufp/a/c:c	(Landroid/content/Context;)I
    //   2542: invokevirtual 524	android/content/Context:getString	(I)Ljava/lang/String;
    //   2545: invokevirtual 526	com/umeng/common/ufp/net/DownloadingService:a	(Ljava/lang/String;)V
    //   2548: invokestatic 121	com/umeng/common/ufp/net/DownloadingService:a	()Ljava/lang/String;
    //   2551: ldc_w 528
    //   2554: invokestatic 200	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   2557: goto -1496 -> 1061
    //   2560: astore 8
    //   2562: aload 8
    //   2564: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2567: aload 6
    //   2569: ifnull -281 -> 2288
    //   2572: aload 6
    //   2574: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2577: goto -289 -> 2288
    //   2580: astore 6
    //   2582: aload 6
    //   2584: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2587: goto -299 -> 2288
    //   2590: astore 6
    //   2592: goto -10 -> 2582
    //   2595: astore 7
    //   2597: aload 6
    //   2599: ifnull +8 -> 2607
    //   2602: aload 6
    //   2604: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2607: aload 7
    //   2609: athrow
    //   2610: astore 6
    //   2612: aload 6
    //   2614: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2617: goto -10 -> 2607
    //   2620: astore 7
    //   2622: aload 7
    //   2624: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2627: aload 6
    //   2629: ifnull -1951 -> 678
    //   2632: aload 6
    //   2634: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2637: return
    //   2638: astore 6
    //   2640: goto -1556 -> 1084
    //   2643: astore 7
    //   2645: aload 6
    //   2647: ifnull +8 -> 2655
    //   2650: aload 6
    //   2652: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2655: aload 7
    //   2657: athrow
    //   2658: astore 6
    //   2660: aload 6
    //   2662: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2665: goto -10 -> 2655
    //   2668: astore 7
    //   2670: aload 7
    //   2672: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2675: aload 6
    //   2677: ifnull -1999 -> 678
    //   2680: aload 6
    //   2682: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2685: return
    //   2686: astore 6
    //   2688: goto -1604 -> 1084
    //   2691: astore 7
    //   2693: aload 6
    //   2695: ifnull +8 -> 2703
    //   2698: aload 6
    //   2700: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2703: aload 7
    //   2705: athrow
    //   2706: astore 6
    //   2708: aload 6
    //   2710: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2713: goto -10 -> 2703
    //   2716: astore 7
    //   2718: aload 7
    //   2720: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2723: aload 6
    //   2725: ifnull -2047 -> 678
    //   2728: aload 6
    //   2730: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2733: return
    //   2734: astore 6
    //   2736: goto -1652 -> 1084
    //   2739: astore 6
    //   2741: goto -1657 -> 1084
    //   2744: astore 7
    //   2746: aload 6
    //   2748: ifnull +8 -> 2756
    //   2751: aload 6
    //   2753: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2756: aload 7
    //   2758: athrow
    //   2759: astore 6
    //   2761: aload 6
    //   2763: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2766: goto -10 -> 2756
    //   2769: astore 7
    //   2771: aload 7
    //   2773: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2776: aload 6
    //   2778: ifnull -2100 -> 678
    //   2781: aload 6
    //   2783: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2786: return
    //   2787: astore 6
    //   2789: goto -1705 -> 1084
    //   2792: astore 7
    //   2794: aload 6
    //   2796: ifnull +8 -> 2804
    //   2799: aload 6
    //   2801: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2804: aload 7
    //   2806: athrow
    //   2807: astore 6
    //   2809: aload 6
    //   2811: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2814: goto -10 -> 2804
    //   2817: astore 7
    //   2819: aload 7
    //   2821: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2824: aload 6
    //   2826: ifnull -2148 -> 678
    //   2829: aload 6
    //   2831: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2834: return
    //   2835: astore 6
    //   2837: goto -1753 -> 1084
    //   2840: astore 7
    //   2842: aload 6
    //   2844: ifnull +8 -> 2852
    //   2847: aload 6
    //   2849: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2852: aload 7
    //   2854: athrow
    //   2855: astore 6
    //   2857: aload 6
    //   2859: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2862: goto -10 -> 2852
    //   2865: astore 7
    //   2867: aload 7
    //   2869: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2872: aload 6
    //   2874: ifnull -2196 -> 678
    //   2877: aload 6
    //   2879: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2882: return
    //   2883: astore 6
    //   2885: goto -1801 -> 1084
    //   2888: astore 7
    //   2890: aload 6
    //   2892: ifnull +8 -> 2900
    //   2895: aload 6
    //   2897: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2900: aload 7
    //   2902: athrow
    //   2903: astore 6
    //   2905: aload 6
    //   2907: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2910: goto -10 -> 2900
    //   2913: astore 7
    //   2915: aload 7
    //   2917: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2920: aload 6
    //   2922: ifnull -2244 -> 678
    //   2925: aload 6
    //   2927: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2930: return
    //   2931: astore 6
    //   2933: goto -1849 -> 1084
    //   2936: astore 7
    //   2938: aload 6
    //   2940: ifnull +8 -> 2948
    //   2943: aload 6
    //   2945: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2948: aload 7
    //   2950: athrow
    //   2951: astore 6
    //   2953: aload 6
    //   2955: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2958: goto -10 -> 2948
    //   2961: astore 7
    //   2963: aload 7
    //   2965: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   2968: aload 6
    //   2970: ifnull -2292 -> 678
    //   2973: aload 6
    //   2975: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2978: return
    //   2979: astore 6
    //   2981: goto -1897 -> 1084
    //   2984: astore 7
    //   2986: aload 6
    //   2988: ifnull +8 -> 2996
    //   2991: aload 6
    //   2993: invokevirtual 302	java/io/FileOutputStream:close	()V
    //   2996: aload 7
    //   2998: athrow
    //   2999: astore 6
    //   3001: aload 6
    //   3003: invokevirtual 366	java/io/IOException:printStackTrace	()V
    //   3006: goto -10 -> 2996
    //   3009: astore 7
    //   3011: aconst_null
    //   3012: astore 6
    //   3014: aconst_null
    //   3015: astore 8
    //   3017: goto -749 -> 2268
    //   3020: astore 7
    //   3022: aconst_null
    //   3023: astore 8
    //   3025: goto -757 -> 2268
    //   3028: astore 7
    //   3030: aconst_null
    //   3031: astore 8
    //   3033: goto -765 -> 2268
    //   3036: astore 7
    //   3038: aload 10
    //   3040: astore 6
    //   3042: aload 9
    //   3044: astore 8
    //   3046: goto -778 -> 2268
    //   3049: astore 8
    //   3051: aconst_null
    //   3052: astore 6
    //   3054: aconst_null
    //   3055: astore 7
    //   3057: goto -1194 -> 1863
    //   3060: astore 8
    //   3062: aconst_null
    //   3063: astore 7
    //   3065: goto -1202 -> 1863
    //   3068: astore 8
    //   3070: aconst_null
    //   3071: astore 7
    //   3073: goto -1210 -> 1863
    //   3076: astore 8
    //   3078: aconst_null
    //   3079: astore 6
    //   3081: aconst_null
    //   3082: astore 7
    //   3084: goto -2135 -> 949
    //   3087: astore 8
    //   3089: aconst_null
    //   3090: astore 7
    //   3092: goto -2143 -> 949
    //   3095: astore 8
    //   3097: aconst_null
    //   3098: astore 7
    //   3100: goto -2151 -> 949
    //   3103: goto -2348 -> 755
    //   3106: iload_3
    //   3107: istore_2
    //   3108: goto -2692 -> 416
    //   3111: iconst_1
    //   3112: istore_2
    //   3113: goto -2583 -> 530
    //   3116: goto -3060 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	3119	0	this	b
    //   0	3119	1	paramBoolean	boolean
    //   415	2698	2	k	int
    //   446	2661	3	m	int
    //   480	14	4	l	long
    //   87	990	6	localFileOutputStream	java.io.FileOutputStream
    //   1082	94	6	localIOException1	java.io.IOException
    //   1181	148	6	localIOException2	java.io.IOException
    //   1334	493	6	localIOException3	java.io.IOException
    //   1832	79	6	localIOException4	java.io.IOException
    //   1916	222	6	localIOException5	java.io.IOException
    //   2143	59	6	localIOException6	java.io.IOException
    //   2207	366	6	localIOException7	java.io.IOException
    //   2580	3	6	localIOException8	java.io.IOException
    //   2590	13	6	localIOException9	java.io.IOException
    //   2610	23	6	localIOException10	java.io.IOException
    //   2638	13	6	localIOException11	java.io.IOException
    //   2658	23	6	localIOException12	java.io.IOException
    //   2686	13	6	localIOException13	java.io.IOException
    //   2706	23	6	localIOException14	java.io.IOException
    //   2734	1	6	localIOException15	java.io.IOException
    //   2739	13	6	localIOException16	java.io.IOException
    //   2759	23	6	localIOException17	java.io.IOException
    //   2787	13	6	localIOException18	java.io.IOException
    //   2807	23	6	localIOException19	java.io.IOException
    //   2835	13	6	localIOException20	java.io.IOException
    //   2855	23	6	localIOException21	java.io.IOException
    //   2883	13	6	localIOException22	java.io.IOException
    //   2903	23	6	localIOException23	java.io.IOException
    //   2931	13	6	localIOException24	java.io.IOException
    //   2951	23	6	localIOException25	java.io.IOException
    //   2979	13	6	localIOException26	java.io.IOException
    //   2999	3	6	localIOException27	java.io.IOException
    //   3012	68	6	localObject1	Object
    //   28	2261	7	localObject2	Object
    //   2595	13	7	localObject3	Object
    //   2620	3	7	localIOException28	java.io.IOException
    //   2643	13	7	localObject4	Object
    //   2668	3	7	localIOException29	java.io.IOException
    //   2691	13	7	localObject5	Object
    //   2716	3	7	localIOException30	java.io.IOException
    //   2744	13	7	localObject6	Object
    //   2769	3	7	localIOException31	java.io.IOException
    //   2792	13	7	localObject7	Object
    //   2817	3	7	localIOException32	java.io.IOException
    //   2840	13	7	localObject8	Object
    //   2865	3	7	localIOException33	java.io.IOException
    //   2888	13	7	localObject9	Object
    //   2913	3	7	localIOException34	java.io.IOException
    //   2936	13	7	localObject10	Object
    //   2961	3	7	localIOException35	java.io.IOException
    //   2984	13	7	localObject11	Object
    //   3009	1	7	localObject12	Object
    //   3020	1	7	localObject13	Object
    //   3028	1	7	localObject14	Object
    //   3036	1	7	localObject15	Object
    //   3055	44	7	localObject16	Object
    //   75	642	8	localObject17	Object
    //   947	575	8	localIOException36	java.io.IOException
    //   1542	246	8	localObject18	Object
    //   1837	1	8	localRemoteException1	android.os.RemoteException
    //   1861	30	8	localRemoteException2	android.os.RemoteException
    //   1997	309	8	localObject19	Object
    //   2391	4	8	localInterruptedException	InterruptedException
    //   2439	69	8	localObject20	Object
    //   2560	3	8	localIOException37	java.io.IOException
    //   3015	30	8	localObject21	Object
    //   3049	1	8	localRemoteException3	android.os.RemoteException
    //   3060	1	8	localRemoteException4	android.os.RemoteException
    //   3068	1	8	localRemoteException5	android.os.RemoteException
    //   3076	1	8	localIOException38	java.io.IOException
    //   3087	1	8	localIOException39	java.io.IOException
    //   3095	1	8	localIOException40	java.io.IOException
    //   257	598	9	localObject22	Object
    //   886	1	9	localDeadObjectException	android.os.DeadObjectException
    //   894	1276	9	localObject23	Object
    //   2212	3	9	localRemoteException6	android.os.RemoteException
    //   2258	7	9	localObject24	Object
    //   2291	39	9	localObject25	Object
    //   2500	543	9	localIntent	android.content.Intent
    //   253	2786	10	localObject26	Object
    //   142	1931	11	localObject27	Object
    // Exception table:
    //   from	to	target	type
    //   800	815	886	android/os/DeadObjectException
    //   823	848	886	android/os/DeadObjectException
    //   259	264	947	java/io/IOException
    //   272	282	947	java/io/IOException
    //   290	316	947	java/io/IOException
    //   324	331	947	java/io/IOException
    //   339	381	947	java/io/IOException
    //   389	414	947	java/io/IOException
    //   424	431	947	java/io/IOException
    //   439	447	947	java/io/IOException
    //   459	468	947	java/io/IOException
    //   476	482	947	java/io/IOException
    //   490	499	947	java/io/IOException
    //   518	528	947	java/io/IOException
    //   538	543	947	java/io/IOException
    //   551	556	947	java/io/IOException
    //   564	572	947	java/io/IOException
    //   580	600	947	java/io/IOException
    //   608	619	947	java/io/IOException
    //   627	638	947	java/io/IOException
    //   646	658	947	java/io/IOException
    //   729	746	947	java/io/IOException
    //   763	770	947	java/io/IOException
    //   778	792	947	java/io/IOException
    //   800	815	947	java/io/IOException
    //   823	848	947	java/io/IOException
    //   856	881	947	java/io/IOException
    //   896	922	947	java/io/IOException
    //   930	944	947	java/io/IOException
    //   1098	1106	947	java/io/IOException
    //   1114	1138	947	java/io/IOException
    //   1146	1160	947	java/io/IOException
    //   1198	1224	947	java/io/IOException
    //   1232	1257	947	java/io/IOException
    //   1265	1276	947	java/io/IOException
    //   1284	1291	947	java/io/IOException
    //   1299	1313	947	java/io/IOException
    //   1347	1357	947	java/io/IOException
    //   1365	1374	947	java/io/IOException
    //   1382	1400	947	java/io/IOException
    //   1408	1430	947	java/io/IOException
    //   1438	1456	947	java/io/IOException
    //   1464	1477	947	java/io/IOException
    //   1485	1513	947	java/io/IOException
    //   1521	1529	947	java/io/IOException
    //   1537	1544	947	java/io/IOException
    //   1552	1562	947	java/io/IOException
    //   1570	1588	947	java/io/IOException
    //   1596	1611	947	java/io/IOException
    //   1619	1633	947	java/io/IOException
    //   1641	1650	947	java/io/IOException
    //   1658	1668	947	java/io/IOException
    //   1676	1681	947	java/io/IOException
    //   1689	1695	947	java/io/IOException
    //   1703	1709	947	java/io/IOException
    //   1717	1726	947	java/io/IOException
    //   1734	1741	947	java/io/IOException
    //   1749	1764	947	java/io/IOException
    //   1772	1792	947	java/io/IOException
    //   1800	1811	947	java/io/IOException
    //   1847	1858	947	java/io/IOException
    //   1929	1954	947	java/io/IOException
    //   1962	1973	947	java/io/IOException
    //   1981	1999	947	java/io/IOException
    //   2007	2025	947	java/io/IOException
    //   2033	2077	947	java/io/IOException
    //   2085	2098	947	java/io/IOException
    //   2106	2122	947	java/io/IOException
    //   2156	2163	947	java/io/IOException
    //   2171	2186	947	java/io/IOException
    //   1076	1081	1082	java/io/IOException
    //   1175	1180	1181	java/io/IOException
    //   1328	1333	1334	java/io/IOException
    //   1826	1831	1832	java/io/IOException
    //   1749	1764	1837	android/os/RemoteException
    //   1772	1792	1837	android/os/RemoteException
    //   1800	1811	1837	android/os/RemoteException
    //   259	264	1861	android/os/RemoteException
    //   272	282	1861	android/os/RemoteException
    //   290	316	1861	android/os/RemoteException
    //   324	331	1861	android/os/RemoteException
    //   339	381	1861	android/os/RemoteException
    //   389	414	1861	android/os/RemoteException
    //   424	431	1861	android/os/RemoteException
    //   439	447	1861	android/os/RemoteException
    //   459	468	1861	android/os/RemoteException
    //   476	482	1861	android/os/RemoteException
    //   490	499	1861	android/os/RemoteException
    //   518	528	1861	android/os/RemoteException
    //   538	543	1861	android/os/RemoteException
    //   551	556	1861	android/os/RemoteException
    //   564	572	1861	android/os/RemoteException
    //   580	600	1861	android/os/RemoteException
    //   608	619	1861	android/os/RemoteException
    //   627	638	1861	android/os/RemoteException
    //   646	658	1861	android/os/RemoteException
    //   729	746	1861	android/os/RemoteException
    //   763	770	1861	android/os/RemoteException
    //   778	792	1861	android/os/RemoteException
    //   800	815	1861	android/os/RemoteException
    //   823	848	1861	android/os/RemoteException
    //   856	881	1861	android/os/RemoteException
    //   896	922	1861	android/os/RemoteException
    //   930	944	1861	android/os/RemoteException
    //   1098	1106	1861	android/os/RemoteException
    //   1114	1138	1861	android/os/RemoteException
    //   1146	1160	1861	android/os/RemoteException
    //   1198	1224	1861	android/os/RemoteException
    //   1232	1257	1861	android/os/RemoteException
    //   1265	1276	1861	android/os/RemoteException
    //   1284	1291	1861	android/os/RemoteException
    //   1299	1313	1861	android/os/RemoteException
    //   1347	1357	1861	android/os/RemoteException
    //   1365	1374	1861	android/os/RemoteException
    //   1382	1400	1861	android/os/RemoteException
    //   1408	1430	1861	android/os/RemoteException
    //   1438	1456	1861	android/os/RemoteException
    //   1464	1477	1861	android/os/RemoteException
    //   1485	1513	1861	android/os/RemoteException
    //   1521	1529	1861	android/os/RemoteException
    //   1537	1544	1861	android/os/RemoteException
    //   1552	1562	1861	android/os/RemoteException
    //   1570	1588	1861	android/os/RemoteException
    //   1596	1611	1861	android/os/RemoteException
    //   1619	1633	1861	android/os/RemoteException
    //   1641	1650	1861	android/os/RemoteException
    //   1658	1668	1861	android/os/RemoteException
    //   1676	1681	1861	android/os/RemoteException
    //   1689	1695	1861	android/os/RemoteException
    //   1703	1709	1861	android/os/RemoteException
    //   1717	1726	1861	android/os/RemoteException
    //   1734	1741	1861	android/os/RemoteException
    //   1847	1858	1861	android/os/RemoteException
    //   1929	1954	1861	android/os/RemoteException
    //   1962	1973	1861	android/os/RemoteException
    //   1981	1999	1861	android/os/RemoteException
    //   2007	2025	1861	android/os/RemoteException
    //   2033	2077	1861	android/os/RemoteException
    //   2085	2098	1861	android/os/RemoteException
    //   2106	2122	1861	android/os/RemoteException
    //   2156	2163	1861	android/os/RemoteException
    //   2171	2186	1861	android/os/RemoteException
    //   1910	1915	1916	java/io/IOException
    //   2137	2142	2143	java/io/IOException
    //   2201	2206	2207	java/io/IOException
    //   991	1025	2212	android/os/RemoteException
    //   949	974	2258	finally
    //   979	987	2258	finally
    //   1025	1061	2258	finally
    //   2219	2255	2258	finally
    //   2293	2332	2258	finally
    //   2332	2358	2258	finally
    //   2358	2388	2258	finally
    //   2393	2410	2258	finally
    //   2413	2418	2258	finally
    //   2421	2557	2258	finally
    //   991	1025	2291	finally
    //   2214	2219	2291	finally
    //   2358	2388	2391	java/lang/InterruptedException
    //   2413	2418	2391	java/lang/InterruptedException
    //   2421	2557	2391	java/lang/InterruptedException
    //   2273	2278	2560	java/io/IOException
    //   2572	2577	2580	java/io/IOException
    //   2283	2288	2590	java/io/IOException
    //   2273	2278	2595	finally
    //   2562	2567	2595	finally
    //   2602	2607	2610	java/io/IOException
    //   1066	1071	2620	java/io/IOException
    //   2632	2637	2638	java/io/IOException
    //   1066	1071	2643	finally
    //   2622	2627	2643	finally
    //   2650	2655	2658	java/io/IOException
    //   1900	1905	2668	java/io/IOException
    //   2680	2685	2686	java/io/IOException
    //   1900	1905	2691	finally
    //   2670	2675	2691	finally
    //   2698	2703	2706	java/io/IOException
    //   663	668	2716	java/io/IOException
    //   2728	2733	2734	java/io/IOException
    //   673	678	2739	java/io/IOException
    //   663	668	2744	finally
    //   2718	2723	2744	finally
    //   2751	2756	2759	java/io/IOException
    //   1165	1170	2769	java/io/IOException
    //   2781	2786	2787	java/io/IOException
    //   1165	1170	2792	finally
    //   2771	2776	2792	finally
    //   2799	2804	2807	java/io/IOException
    //   1318	1323	2817	java/io/IOException
    //   2829	2834	2835	java/io/IOException
    //   1318	1323	2840	finally
    //   2819	2824	2840	finally
    //   2847	2852	2855	java/io/IOException
    //   1816	1821	2865	java/io/IOException
    //   2877	2882	2883	java/io/IOException
    //   1816	1821	2888	finally
    //   2867	2872	2888	finally
    //   2895	2900	2903	java/io/IOException
    //   2127	2132	2913	java/io/IOException
    //   2925	2930	2931	java/io/IOException
    //   2127	2132	2936	finally
    //   2915	2920	2936	finally
    //   2943	2948	2951	java/io/IOException
    //   2191	2196	2961	java/io/IOException
    //   2973	2978	2979	java/io/IOException
    //   2191	2196	2984	finally
    //   2963	2968	2984	finally
    //   2991	2996	2999	java/io/IOException
    //   0	56	3009	finally
    //   56	89	3009	finally
    //   679	707	3009	finally
    //   707	718	3020	finally
    //   89	235	3028	finally
    //   235	247	3028	finally
    //   259	264	3036	finally
    //   272	282	3036	finally
    //   290	316	3036	finally
    //   324	331	3036	finally
    //   339	381	3036	finally
    //   389	414	3036	finally
    //   424	431	3036	finally
    //   439	447	3036	finally
    //   459	468	3036	finally
    //   476	482	3036	finally
    //   490	499	3036	finally
    //   518	528	3036	finally
    //   538	543	3036	finally
    //   551	556	3036	finally
    //   564	572	3036	finally
    //   580	600	3036	finally
    //   608	619	3036	finally
    //   627	638	3036	finally
    //   646	658	3036	finally
    //   729	746	3036	finally
    //   763	770	3036	finally
    //   778	792	3036	finally
    //   800	815	3036	finally
    //   823	848	3036	finally
    //   856	881	3036	finally
    //   896	922	3036	finally
    //   930	944	3036	finally
    //   1098	1106	3036	finally
    //   1114	1138	3036	finally
    //   1146	1160	3036	finally
    //   1198	1224	3036	finally
    //   1232	1257	3036	finally
    //   1265	1276	3036	finally
    //   1284	1291	3036	finally
    //   1299	1313	3036	finally
    //   1347	1357	3036	finally
    //   1365	1374	3036	finally
    //   1382	1400	3036	finally
    //   1408	1430	3036	finally
    //   1438	1456	3036	finally
    //   1464	1477	3036	finally
    //   1485	1513	3036	finally
    //   1521	1529	3036	finally
    //   1537	1544	3036	finally
    //   1552	1562	3036	finally
    //   1570	1588	3036	finally
    //   1596	1611	3036	finally
    //   1619	1633	3036	finally
    //   1641	1650	3036	finally
    //   1658	1668	3036	finally
    //   1676	1681	3036	finally
    //   1689	1695	3036	finally
    //   1703	1709	3036	finally
    //   1717	1726	3036	finally
    //   1734	1741	3036	finally
    //   1749	1764	3036	finally
    //   1772	1792	3036	finally
    //   1800	1811	3036	finally
    //   1847	1858	3036	finally
    //   1871	1882	3036	finally
    //   1890	1895	3036	finally
    //   1929	1954	3036	finally
    //   1962	1973	3036	finally
    //   1981	1999	3036	finally
    //   2007	2025	3036	finally
    //   2033	2077	3036	finally
    //   2085	2098	3036	finally
    //   2106	2122	3036	finally
    //   2156	2163	3036	finally
    //   2171	2186	3036	finally
    //   0	56	3049	android/os/RemoteException
    //   56	89	3049	android/os/RemoteException
    //   679	707	3049	android/os/RemoteException
    //   707	718	3060	android/os/RemoteException
    //   89	235	3068	android/os/RemoteException
    //   235	247	3068	android/os/RemoteException
    //   0	56	3076	java/io/IOException
    //   56	89	3076	java/io/IOException
    //   679	707	3076	java/io/IOException
    //   707	718	3087	java/io/IOException
    //   89	235	3095	java/io/IOException
    //   235	247	3095	java/io/IOException
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\DownloadingService$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */