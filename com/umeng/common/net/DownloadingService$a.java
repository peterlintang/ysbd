package com.umeng.common.net;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.os.Handler;
import android.widget.RemoteViews;
import com.umeng.common.Log;
import com.umeng.common.a.a;
import java.io.File;
import java.util.Map;

class DownloadingService$a
  extends Thread
{
  private static final long j = 30000L;
  private Context b;
  private String c;
  private Notification d;
  private int e;
  private int f = 0;
  private int g = -1;
  private int h = -1;
  private a.a i;
  private Handler k = new d(this);
  
  public DownloadingService$a(DownloadingService paramDownloadingService, Context paramContext, a.a parama)
  {
    try
    {
      this.b = paramContext;
      this.i = parama;
      if (com.umeng.common.b.b())
      {
        this.c = Environment.getExternalStorageDirectory().getCanonicalPath();
        new File(this.c).mkdirs();
      }
      for (;;)
      {
        this.c += "/download/.um/apk";
        new File(this.c).mkdirs();
        this.d = new Notification(17301633, "正在下载应用", 1L);
        paramContext = new RemoteViews(this.b.getPackageName(), com.umeng.common.a.b.a(this.b));
        paramContext.setProgressBar(a.c(this.b), 100, 0, false);
        paramContext.setTextViewText(a.b(this.b), "0%");
        paramContext.setTextViewText(a.d(this.b), "正在下载应用" + this.i.b);
        paramContext.setTextViewText(a.a(this.b), "");
        paramContext.setImageViewResource(a.e(this.b), 17301633);
        this.d.contentView = paramContext;
        this.d.contentIntent = PendingIntent.getActivity(this.b, 0, new Intent(), 134217728);
        this.e = ((int)System.currentTimeMillis());
        if (this.e < 0) {
          this.e = (-this.e);
        }
        DownloadingService.a(paramDownloadingService).notify(this.e, this.d);
        return;
        this.c = this.b.getFilesDir().getAbsolutePath();
      }
      return;
    }
    catch (Exception paramContext)
    {
      Log.c(DownloadingService.a(), paramContext.getMessage(), paramContext);
      DownloadingService.a(paramDownloadingService).cancel(this.e);
    }
  }
  
  private void a(Exception paramException)
  {
    Log.b(DownloadingService.a(), "can not install. " + paramException.getMessage());
    this.d.contentView.setTextViewText(a.d(this.b), this.i.b + " 下载失败，请检查网络。");
    DownloadingService.a(this.a).notify(this.e, this.d);
    DownloadingService.a(this.a).cancel(this.e);
    DownloadingService.b().remove(this.i);
  }
  
  /* Error */
  private void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 9
    //   3: aconst_null
    //   4: astore 11
    //   6: aconst_null
    //   7: astore 12
    //   9: aconst_null
    //   10: astore 6
    //   12: new 78	java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial 79	java/lang/StringBuilder:<init>	()V
    //   19: aload_0
    //   20: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   23: getfield 231	com/umeng/common/net/a$a:c	Ljava/lang/String;
    //   26: invokestatic 236	com/umeng/common/b/g:a	(Ljava/lang/String;)Ljava/lang/String;
    //   29: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: ldc -18
    //   34: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: astore 10
    //   42: invokestatic 56	com/umeng/common/b:b	()Z
    //   45: ifeq +966 -> 1011
    //   48: new 64	java/io/File
    //   51: dup
    //   52: aload_0
    //   53: getfield 70	com/umeng/common/net/DownloadingService$a:c	Ljava/lang/String;
    //   56: aload 10
    //   58: invokespecial 240	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: astore 10
    //   63: new 242	java/io/FileOutputStream
    //   66: dup
    //   67: aload 10
    //   69: iconst_1
    //   70: invokespecial 245	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   73: astore 4
    //   75: aload 11
    //   77: astore 6
    //   79: aload 4
    //   81: astore 5
    //   83: aload 12
    //   85: astore 9
    //   87: aload 4
    //   89: astore 8
    //   91: aload 4
    //   93: astore 7
    //   95: invokestatic 190	com/umeng/common/net/DownloadingService:a	()Ljava/lang/String;
    //   98: ldc -9
    //   100: iconst_2
    //   101: anewarray 249	java/lang/Object
    //   104: dup
    //   105: iconst_0
    //   106: aload_0
    //   107: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   110: getfield 231	com/umeng/common/net/a$a:c	Ljava/lang/String;
    //   113: aastore
    //   114: dup
    //   115: iconst_1
    //   116: aload 10
    //   118: invokevirtual 188	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   121: aastore
    //   122: invokestatic 255	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   125: invokestatic 257	com/umeng/common/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload 11
    //   130: astore 6
    //   132: aload 4
    //   134: astore 5
    //   136: aload 12
    //   138: astore 9
    //   140: aload 4
    //   142: astore 8
    //   144: aload 4
    //   146: astore 7
    //   148: new 259	java/net/URL
    //   151: dup
    //   152: aload_0
    //   153: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   156: getfield 231	com/umeng/common/net/a$a:c	Ljava/lang/String;
    //   159: invokespecial 260	java/net/URL:<init>	(Ljava/lang/String;)V
    //   162: invokevirtual 264	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   165: checkcast 266	java/net/HttpURLConnection
    //   168: astore 13
    //   170: aload 11
    //   172: astore 6
    //   174: aload 4
    //   176: astore 5
    //   178: aload 12
    //   180: astore 9
    //   182: aload 4
    //   184: astore 8
    //   186: aload 4
    //   188: astore 7
    //   190: aload 13
    //   192: ldc_w 268
    //   195: invokevirtual 271	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   198: aload 11
    //   200: astore 6
    //   202: aload 4
    //   204: astore 5
    //   206: aload 12
    //   208: astore 9
    //   210: aload 4
    //   212: astore 8
    //   214: aload 4
    //   216: astore 7
    //   218: aload 13
    //   220: ldc_w 273
    //   223: ldc_w 275
    //   226: invokevirtual 278	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   229: aload 11
    //   231: astore 6
    //   233: aload 4
    //   235: astore 5
    //   237: aload 12
    //   239: astore 9
    //   241: aload 4
    //   243: astore 8
    //   245: aload 4
    //   247: astore 7
    //   249: aload 13
    //   251: ldc_w 280
    //   254: ldc_w 282
    //   257: invokevirtual 285	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   260: aload 11
    //   262: astore 6
    //   264: aload 4
    //   266: astore 5
    //   268: aload 12
    //   270: astore 9
    //   272: aload 4
    //   274: astore 8
    //   276: aload 4
    //   278: astore 7
    //   280: aload 13
    //   282: sipush 5000
    //   285: invokevirtual 288	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   288: aload 11
    //   290: astore 6
    //   292: aload 4
    //   294: astore 5
    //   296: aload 12
    //   298: astore 9
    //   300: aload 4
    //   302: astore 8
    //   304: aload 4
    //   306: astore 7
    //   308: aload 13
    //   310: sipush 10000
    //   313: invokevirtual 291	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   316: aload 11
    //   318: astore 6
    //   320: aload 4
    //   322: astore 5
    //   324: aload 12
    //   326: astore 9
    //   328: aload 4
    //   330: astore 8
    //   332: aload 4
    //   334: astore 7
    //   336: aload 10
    //   338: invokevirtual 294	java/io/File:exists	()Z
    //   341: ifeq +88 -> 429
    //   344: aload 11
    //   346: astore 6
    //   348: aload 4
    //   350: astore 5
    //   352: aload 12
    //   354: astore 9
    //   356: aload 4
    //   358: astore 8
    //   360: aload 4
    //   362: astore 7
    //   364: aload 10
    //   366: invokevirtual 297	java/io/File:length	()J
    //   369: lconst_0
    //   370: lcmp
    //   371: ifle +58 -> 429
    //   374: aload 11
    //   376: astore 6
    //   378: aload 4
    //   380: astore 5
    //   382: aload 12
    //   384: astore 9
    //   386: aload 4
    //   388: astore 8
    //   390: aload 4
    //   392: astore 7
    //   394: aload 13
    //   396: ldc_w 299
    //   399: new 78	java/lang/StringBuilder
    //   402: dup
    //   403: ldc_w 301
    //   406: invokespecial 132	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   409: aload 10
    //   411: invokevirtual 297	java/io/File:length	()J
    //   414: invokevirtual 304	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   417: ldc_w 306
    //   420: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   423: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   426: invokevirtual 278	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   429: aload 11
    //   431: astore 6
    //   433: aload 4
    //   435: astore 5
    //   437: aload 12
    //   439: astore 9
    //   441: aload 4
    //   443: astore 8
    //   445: aload 4
    //   447: astore 7
    //   449: aload 13
    //   451: invokevirtual 309	java/net/HttpURLConnection:connect	()V
    //   454: aload 11
    //   456: astore 6
    //   458: aload 4
    //   460: astore 5
    //   462: aload 12
    //   464: astore 9
    //   466: aload 4
    //   468: astore 8
    //   470: aload 4
    //   472: astore 7
    //   474: aload 13
    //   476: invokevirtual 313	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   479: astore 11
    //   481: aload 11
    //   483: astore 7
    //   485: iload_1
    //   486: ifne +91 -> 577
    //   489: aload 7
    //   491: astore 6
    //   493: aload 4
    //   495: astore 5
    //   497: aload 7
    //   499: astore 9
    //   501: aload 4
    //   503: astore 8
    //   505: aload_0
    //   506: iconst_0
    //   507: putfield 38	com/umeng/common/net/DownloadingService$a:g	I
    //   510: aload 7
    //   512: astore 6
    //   514: aload 4
    //   516: astore 5
    //   518: aload 7
    //   520: astore 9
    //   522: aload 4
    //   524: astore 8
    //   526: aload_0
    //   527: aload 13
    //   529: invokevirtual 317	java/net/HttpURLConnection:getContentLength	()I
    //   532: putfield 40	com/umeng/common/net/DownloadingService$a:h	I
    //   535: aload 7
    //   537: astore 6
    //   539: aload 4
    //   541: astore 5
    //   543: aload 7
    //   545: astore 9
    //   547: aload 4
    //   549: astore 8
    //   551: invokestatic 190	com/umeng/common/net/DownloadingService:a	()Ljava/lang/String;
    //   554: ldc_w 319
    //   557: iconst_1
    //   558: anewarray 249	java/lang/Object
    //   561: dup
    //   562: iconst_0
    //   563: aload_0
    //   564: getfield 40	com/umeng/common/net/DownloadingService$a:h	I
    //   567: invokestatic 325	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   570: aastore
    //   571: invokestatic 255	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   574: invokestatic 257	com/umeng/common/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   577: aload 7
    //   579: astore 6
    //   581: aload 4
    //   583: astore 5
    //   585: aload 7
    //   587: astore 9
    //   589: aload 4
    //   591: astore 8
    //   593: sipush 4096
    //   596: newarray <illegal type>
    //   598: astore 11
    //   600: aload 7
    //   602: astore 6
    //   604: aload 4
    //   606: astore 5
    //   608: aload 7
    //   610: astore 9
    //   612: aload 4
    //   614: astore 8
    //   616: invokestatic 190	com/umeng/common/net/DownloadingService:a	()Ljava/lang/String;
    //   619: new 78	java/lang/StringBuilder
    //   622: dup
    //   623: invokespecial 79	java/lang/StringBuilder:<init>	()V
    //   626: aload_0
    //   627: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   630: getfield 136	com/umeng/common/net/a$a:b	Ljava/lang/String;
    //   633: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   636: ldc_w 327
    //   639: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   642: aload_0
    //   643: getfield 40	com/umeng/common/net/DownloadingService$a:h	I
    //   646: invokestatic 330	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   649: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   652: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   655: invokestatic 257	com/umeng/common/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   658: aload 7
    //   660: astore 6
    //   662: aload 4
    //   664: astore 5
    //   666: aload 7
    //   668: astore 9
    //   670: aload 4
    //   672: astore 8
    //   674: aload_0
    //   675: getfield 49	com/umeng/common/net/DownloadingService$a:b	Landroid/content/Context;
    //   678: invokestatic 335	com/umeng/common/net/c:a	(Landroid/content/Context;)Lcom/umeng/common/net/c;
    //   681: aload_0
    //   682: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   685: getfield 337	com/umeng/common/net/a$a:a	Ljava/lang/String;
    //   688: aload_0
    //   689: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   692: getfield 231	com/umeng/common/net/a$a:c	Ljava/lang/String;
    //   695: invokevirtual 340	com/umeng/common/net/c:a	(Ljava/lang/String;Ljava/lang/String;)Z
    //   698: pop
    //   699: iconst_0
    //   700: istore_2
    //   701: aload 7
    //   703: astore 6
    //   705: aload 4
    //   707: astore 5
    //   709: aload 7
    //   711: astore 9
    //   713: aload 4
    //   715: astore 8
    //   717: aload 7
    //   719: aload 11
    //   721: invokevirtual 346	java/io/InputStream:read	([B)I
    //   724: istore_3
    //   725: iload_3
    //   726: ifle +2002 -> 2728
    //   729: aload 7
    //   731: astore 6
    //   733: aload 4
    //   735: astore 5
    //   737: aload 7
    //   739: astore 9
    //   741: aload 4
    //   743: astore 8
    //   745: aload 4
    //   747: aload 11
    //   749: iconst_0
    //   750: iload_3
    //   751: invokevirtual 350	java/io/FileOutputStream:write	([BII)V
    //   754: aload 7
    //   756: astore 6
    //   758: aload 4
    //   760: astore 5
    //   762: aload 7
    //   764: astore 9
    //   766: aload 4
    //   768: astore 8
    //   770: aload_0
    //   771: iload_3
    //   772: aload_0
    //   773: getfield 38	com/umeng/common/net/DownloadingService$a:g	I
    //   776: iadd
    //   777: putfield 38	com/umeng/common/net/DownloadingService$a:g	I
    //   780: iload_2
    //   781: iconst_1
    //   782: iadd
    //   783: istore_3
    //   784: iload_2
    //   785: bipush 50
    //   787: irem
    //   788: ifne +1935 -> 2723
    //   791: aload 7
    //   793: astore 6
    //   795: aload 4
    //   797: astore 5
    //   799: aload 7
    //   801: astore 9
    //   803: aload 4
    //   805: astore 8
    //   807: aload_0
    //   808: getfield 49	com/umeng/common/net/DownloadingService$a:b	Landroid/content/Context;
    //   811: invokestatic 354	com/umeng/common/b:m	(Landroid/content/Context;)Z
    //   814: ifne +259 -> 1073
    //   817: iconst_0
    //   818: istore_2
    //   819: aload 7
    //   821: astore 6
    //   823: aload 4
    //   825: astore 5
    //   827: aload 7
    //   829: astore 9
    //   831: aload 4
    //   833: astore 8
    //   835: aload 7
    //   837: invokevirtual 357	java/io/InputStream:close	()V
    //   840: aload 7
    //   842: astore 6
    //   844: aload 4
    //   846: astore 5
    //   848: aload 7
    //   850: astore 9
    //   852: aload 4
    //   854: astore 8
    //   856: aload 4
    //   858: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   861: iload_2
    //   862: ifne +789 -> 1651
    //   865: aload 7
    //   867: astore 6
    //   869: aload 4
    //   871: astore 5
    //   873: aload 7
    //   875: astore 9
    //   877: aload 4
    //   879: astore 8
    //   881: aload_0
    //   882: getfield 31	com/umeng/common/net/DownloadingService$a:a	Lcom/umeng/common/net/DownloadingService;
    //   885: invokestatic 176	com/umeng/common/net/DownloadingService:a	(Lcom/umeng/common/net/DownloadingService;)Landroid/app/NotificationManager;
    //   888: aload_0
    //   889: getfield 171	com/umeng/common/net/DownloadingService$a:e	I
    //   892: invokevirtual 202	android/app/NotificationManager:cancel	(I)V
    //   895: aload 7
    //   897: astore 6
    //   899: aload 4
    //   901: astore 5
    //   903: aload 7
    //   905: astore 9
    //   907: aload 4
    //   909: astore 8
    //   911: invokestatic 190	com/umeng/common/net/DownloadingService:a	()Ljava/lang/String;
    //   914: ldc_w 360
    //   917: invokestatic 210	com/umeng/common/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   920: aload 7
    //   922: astore 6
    //   924: aload 4
    //   926: astore 5
    //   928: aload 7
    //   930: astore 9
    //   932: aload 4
    //   934: astore 8
    //   936: invokestatic 215	com/umeng/common/net/DownloadingService:b	()Ljava/util/Map;
    //   939: aload_0
    //   940: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   943: invokeinterface 363 2 0
    //   948: checkcast 365	android/os/Messenger
    //   951: aconst_null
    //   952: iconst_5
    //   953: iconst_0
    //   954: iconst_0
    //   955: invokestatic 371	android/os/Message:obtain	(Landroid/os/Handler;III)Landroid/os/Message;
    //   958: invokevirtual 375	android/os/Messenger:send	(Landroid/os/Message;)V
    //   961: aload 7
    //   963: astore 6
    //   965: aload 4
    //   967: astore 5
    //   969: aload 7
    //   971: astore 9
    //   973: aload 4
    //   975: astore 8
    //   977: invokestatic 215	com/umeng/common/net/DownloadingService:b	()Ljava/util/Map;
    //   980: aload_0
    //   981: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   984: invokeinterface 221 2 0
    //   989: pop
    //   990: aload 7
    //   992: ifnull +8 -> 1000
    //   995: aload 7
    //   997: invokevirtual 357	java/io/InputStream:close	()V
    //   1000: aload 4
    //   1002: ifnull +8 -> 1010
    //   1005: aload 4
    //   1007: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   1010: return
    //   1011: aload_0
    //   1012: aload_0
    //   1013: getfield 49	com/umeng/common/net/DownloadingService$a:b	Landroid/content/Context;
    //   1016: invokevirtual 185	android/content/Context:getFilesDir	()Ljava/io/File;
    //   1019: invokevirtual 188	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1022: putfield 70	com/umeng/common/net/DownloadingService$a:c	Ljava/lang/String;
    //   1025: aload_0
    //   1026: getfield 49	com/umeng/common/net/DownloadingService$a:b	Landroid/content/Context;
    //   1029: aload 10
    //   1031: ldc_w 376
    //   1034: invokevirtual 380	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   1037: astore 4
    //   1039: aload 11
    //   1041: astore 6
    //   1043: aload 4
    //   1045: astore 5
    //   1047: aload 12
    //   1049: astore 9
    //   1051: aload 4
    //   1053: astore 8
    //   1055: aload 4
    //   1057: astore 7
    //   1059: aload_0
    //   1060: getfield 49	com/umeng/common/net/DownloadingService$a:b	Landroid/content/Context;
    //   1063: aload 10
    //   1065: invokevirtual 384	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   1068: astore 10
    //   1070: goto -995 -> 75
    //   1073: aload 7
    //   1075: astore 6
    //   1077: aload 4
    //   1079: astore 5
    //   1081: aload 7
    //   1083: astore 9
    //   1085: aload 4
    //   1087: astore 8
    //   1089: aload_0
    //   1090: getfield 38	com/umeng/common/net/DownloadingService$a:g	I
    //   1093: i2f
    //   1094: ldc_w 385
    //   1097: fmul
    //   1098: aload_0
    //   1099: getfield 40	com/umeng/common/net/DownloadingService$a:h	I
    //   1102: i2f
    //   1103: fdiv
    //   1104: f2i
    //   1105: istore_2
    //   1106: aload 7
    //   1108: astore 6
    //   1110: aload 4
    //   1112: astore 5
    //   1114: aload 7
    //   1116: astore 9
    //   1118: aload 4
    //   1120: astore 8
    //   1122: aload_0
    //   1123: getfield 98	com/umeng/common/net/DownloadingService$a:d	Landroid/app/Notification;
    //   1126: getfield 149	android/app/Notification:contentView	Landroid/widget/RemoteViews;
    //   1129: aload_0
    //   1130: getfield 49	com/umeng/common/net/DownloadingService$a:b	Landroid/content/Context;
    //   1133: invokestatic 117	com/umeng/common/a/a:c	(Landroid/content/Context;)I
    //   1136: bipush 100
    //   1138: iload_2
    //   1139: iconst_0
    //   1140: invokevirtual 121	android/widget/RemoteViews:setProgressBar	(IIIZ)V
    //   1143: aload 7
    //   1145: astore 6
    //   1147: aload 4
    //   1149: astore 5
    //   1151: aload 7
    //   1153: astore 9
    //   1155: aload 4
    //   1157: astore 8
    //   1159: aload_0
    //   1160: getfield 98	com/umeng/common/net/DownloadingService$a:d	Landroid/app/Notification;
    //   1163: getfield 149	android/app/Notification:contentView	Landroid/widget/RemoteViews;
    //   1166: aload_0
    //   1167: getfield 49	com/umeng/common/net/DownloadingService$a:b	Landroid/content/Context;
    //   1170: invokestatic 123	com/umeng/common/a/a:b	(Landroid/content/Context;)I
    //   1173: new 78	java/lang/StringBuilder
    //   1176: dup
    //   1177: invokespecial 79	java/lang/StringBuilder:<init>	()V
    //   1180: iload_2
    //   1181: invokestatic 330	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1184: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1187: ldc_w 387
    //   1190: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1193: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1196: invokevirtual 129	android/widget/RemoteViews:setTextViewText	(ILjava/lang/CharSequence;)V
    //   1199: aload 7
    //   1201: astore 6
    //   1203: aload 4
    //   1205: astore 5
    //   1207: aload 7
    //   1209: astore 9
    //   1211: aload 4
    //   1213: astore 8
    //   1215: aload_0
    //   1216: getfield 31	com/umeng/common/net/DownloadingService$a:a	Lcom/umeng/common/net/DownloadingService;
    //   1219: invokestatic 176	com/umeng/common/net/DownloadingService:a	(Lcom/umeng/common/net/DownloadingService;)Landroid/app/NotificationManager;
    //   1222: aload_0
    //   1223: getfield 171	com/umeng/common/net/DownloadingService$a:e	I
    //   1226: aload_0
    //   1227: getfield 98	com/umeng/common/net/DownloadingService$a:d	Landroid/app/Notification;
    //   1230: invokevirtual 182	android/app/NotificationManager:notify	(ILandroid/app/Notification;)V
    //   1233: aload 7
    //   1235: astore 6
    //   1237: aload 4
    //   1239: astore 5
    //   1241: aload 7
    //   1243: astore 9
    //   1245: aload 4
    //   1247: astore 8
    //   1249: invokestatic 190	com/umeng/common/net/DownloadingService:a	()Ljava/lang/String;
    //   1252: ldc_w 389
    //   1255: iconst_3
    //   1256: anewarray 249	java/lang/Object
    //   1259: dup
    //   1260: iconst_0
    //   1261: aload_0
    //   1262: getfield 171	com/umeng/common/net/DownloadingService$a:e	I
    //   1265: invokestatic 325	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1268: aastore
    //   1269: dup
    //   1270: iconst_1
    //   1271: iload_2
    //   1272: invokestatic 325	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1275: aastore
    //   1276: dup
    //   1277: iconst_2
    //   1278: aload_0
    //   1279: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   1282: getfield 136	com/umeng/common/net/a$a:b	Ljava/lang/String;
    //   1285: aastore
    //   1286: invokestatic 255	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1289: invokestatic 257	com/umeng/common/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   1292: aload 7
    //   1294: astore 6
    //   1296: aload 4
    //   1298: astore 5
    //   1300: aload 7
    //   1302: astore 9
    //   1304: aload 4
    //   1306: astore 8
    //   1308: invokestatic 215	com/umeng/common/net/DownloadingService:b	()Ljava/util/Map;
    //   1311: aload_0
    //   1312: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   1315: invokeinterface 363 2 0
    //   1320: ifnull +44 -> 1364
    //   1323: aload 7
    //   1325: astore 6
    //   1327: aload 4
    //   1329: astore 5
    //   1331: aload 7
    //   1333: astore 9
    //   1335: aload 4
    //   1337: astore 8
    //   1339: invokestatic 215	com/umeng/common/net/DownloadingService:b	()Ljava/util/Map;
    //   1342: aload_0
    //   1343: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   1346: invokeinterface 363 2 0
    //   1351: checkcast 365	android/os/Messenger
    //   1354: aconst_null
    //   1355: iconst_3
    //   1356: iload_2
    //   1357: iconst_0
    //   1358: invokestatic 371	android/os/Message:obtain	(Landroid/os/Handler;III)Landroid/os/Message;
    //   1361: invokevirtual 375	android/os/Messenger:send	(Landroid/os/Message;)V
    //   1364: aload 7
    //   1366: astore 6
    //   1368: aload 4
    //   1370: astore 5
    //   1372: aload 7
    //   1374: astore 9
    //   1376: aload 4
    //   1378: astore 8
    //   1380: aload_0
    //   1381: getfield 49	com/umeng/common/net/DownloadingService$a:b	Landroid/content/Context;
    //   1384: invokestatic 335	com/umeng/common/net/c:a	(Landroid/content/Context;)Lcom/umeng/common/net/c;
    //   1387: aload_0
    //   1388: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   1391: getfield 337	com/umeng/common/net/a$a:a	Ljava/lang/String;
    //   1394: aload_0
    //   1395: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   1398: getfield 231	com/umeng/common/net/a$a:c	Ljava/lang/String;
    //   1401: iload_2
    //   1402: invokevirtual 392	com/umeng/common/net/c:a	(Ljava/lang/String;Ljava/lang/String;I)V
    //   1405: iload_3
    //   1406: istore_2
    //   1407: goto -706 -> 701
    //   1410: astore 5
    //   1412: aload 7
    //   1414: astore 6
    //   1416: aload 4
    //   1418: astore 5
    //   1420: aload 7
    //   1422: astore 9
    //   1424: aload 4
    //   1426: astore 8
    //   1428: invokestatic 190	com/umeng/common/net/DownloadingService:a	()Ljava/lang/String;
    //   1431: ldc_w 394
    //   1434: iconst_1
    //   1435: anewarray 249	java/lang/Object
    //   1438: dup
    //   1439: iconst_0
    //   1440: aload_0
    //   1441: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   1444: getfield 136	com/umeng/common/net/a$a:b	Ljava/lang/String;
    //   1447: aastore
    //   1448: invokestatic 255	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1451: invokestatic 210	com/umeng/common/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   1454: aload 7
    //   1456: astore 6
    //   1458: aload 4
    //   1460: astore 5
    //   1462: aload 7
    //   1464: astore 9
    //   1466: aload 4
    //   1468: astore 8
    //   1470: invokestatic 215	com/umeng/common/net/DownloadingService:b	()Ljava/util/Map;
    //   1473: aload_0
    //   1474: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   1477: aconst_null
    //   1478: invokeinterface 398 3 0
    //   1483: pop
    //   1484: goto -120 -> 1364
    //   1487: astore 6
    //   1489: aload 7
    //   1491: astore 5
    //   1493: invokestatic 190	com/umeng/common/net/DownloadingService:a	()Ljava/lang/String;
    //   1496: aload 6
    //   1498: invokevirtual 399	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1501: aload 6
    //   1503: invokestatic 198	com/umeng/common/Log:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   1506: aload_0
    //   1507: getfield 36	com/umeng/common/net/DownloadingService$a:f	I
    //   1510: iconst_1
    //   1511: iadd
    //   1512: istore_2
    //   1513: aload_0
    //   1514: iload_2
    //   1515: putfield 36	com/umeng/common/net/DownloadingService$a:f	I
    //   1518: iload_2
    //   1519: iconst_3
    //   1520: if_icmple +861 -> 2381
    //   1523: invokestatic 190	com/umeng/common/net/DownloadingService:a	()Ljava/lang/String;
    //   1526: ldc_w 360
    //   1529: invokestatic 210	com/umeng/common/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   1532: invokestatic 215	com/umeng/common/net/DownloadingService:b	()Ljava/util/Map;
    //   1535: aload_0
    //   1536: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   1539: invokeinterface 363 2 0
    //   1544: checkcast 365	android/os/Messenger
    //   1547: aconst_null
    //   1548: iconst_5
    //   1549: iconst_0
    //   1550: iconst_0
    //   1551: invokestatic 371	android/os/Message:obtain	(Landroid/os/Handler;III)Landroid/os/Message;
    //   1554: invokevirtual 375	android/os/Messenger:send	(Landroid/os/Message;)V
    //   1557: aload_0
    //   1558: aload 6
    //   1560: invokespecial 401	com/umeng/common/net/DownloadingService$a:a	(Ljava/lang/Exception;)V
    //   1563: aload 5
    //   1565: ifnull +8 -> 1573
    //   1568: aload 5
    //   1570: invokevirtual 357	java/io/InputStream:close	()V
    //   1573: aload 4
    //   1575: ifnull -565 -> 1010
    //   1578: aload 4
    //   1580: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   1583: return
    //   1584: astore 4
    //   1586: aload 4
    //   1588: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   1591: return
    //   1592: astore 4
    //   1594: aload 4
    //   1596: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   1599: return
    //   1600: astore 5
    //   1602: aload 5
    //   1604: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   1607: aload 4
    //   1609: ifnull -599 -> 1010
    //   1612: aload 4
    //   1614: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   1617: return
    //   1618: astore 4
    //   1620: aload 4
    //   1622: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   1625: return
    //   1626: astore 5
    //   1628: aload 4
    //   1630: ifnull +8 -> 1638
    //   1633: aload 4
    //   1635: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   1638: aload 5
    //   1640: athrow
    //   1641: astore 4
    //   1643: aload 4
    //   1645: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   1648: goto -10 -> 1638
    //   1651: aload 7
    //   1653: astore 6
    //   1655: aload 4
    //   1657: astore 5
    //   1659: aload 7
    //   1661: astore 9
    //   1663: aload 4
    //   1665: astore 8
    //   1667: aload_0
    //   1668: getfield 31	com/umeng/common/net/DownloadingService$a:a	Lcom/umeng/common/net/DownloadingService;
    //   1671: invokestatic 407	com/umeng/common/net/DownloadingService:b	(Lcom/umeng/common/net/DownloadingService;)[Ljava/lang/String;
    //   1674: ifnull +29 -> 1703
    //   1677: aload 7
    //   1679: astore 6
    //   1681: aload 4
    //   1683: astore 5
    //   1685: aload 7
    //   1687: astore 9
    //   1689: aload 4
    //   1691: astore 8
    //   1693: aload_0
    //   1694: getfield 31	com/umeng/common/net/DownloadingService$a:a	Lcom/umeng/common/net/DownloadingService;
    //   1697: invokestatic 407	com/umeng/common/net/DownloadingService:b	(Lcom/umeng/common/net/DownloadingService;)[Ljava/lang/String;
    //   1700: invokestatic 410	com/umeng/common/net/DownloadingService:a	([Ljava/lang/String;)V
    //   1703: aload 7
    //   1705: astore 6
    //   1707: aload 4
    //   1709: astore 5
    //   1711: aload 7
    //   1713: astore 9
    //   1715: aload 4
    //   1717: astore 8
    //   1719: aload_0
    //   1720: getfield 98	com/umeng/common/net/DownloadingService$a:d	Landroid/app/Notification;
    //   1723: getfield 149	android/app/Notification:contentView	Landroid/widget/RemoteViews;
    //   1726: aload_0
    //   1727: getfield 49	com/umeng/common/net/DownloadingService$a:b	Landroid/content/Context;
    //   1730: invokestatic 123	com/umeng/common/a/a:b	(Landroid/content/Context;)I
    //   1733: new 78	java/lang/StringBuilder
    //   1736: dup
    //   1737: invokespecial 79	java/lang/StringBuilder:<init>	()V
    //   1740: bipush 100
    //   1742: invokestatic 330	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1745: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1748: ldc_w 387
    //   1751: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1754: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1757: invokevirtual 129	android/widget/RemoteViews:setTextViewText	(ILjava/lang/CharSequence;)V
    //   1760: aload 7
    //   1762: astore 6
    //   1764: aload 4
    //   1766: astore 5
    //   1768: aload 7
    //   1770: astore 9
    //   1772: aload 4
    //   1774: astore 8
    //   1776: aload_0
    //   1777: getfield 49	com/umeng/common/net/DownloadingService$a:b	Landroid/content/Context;
    //   1780: invokestatic 335	com/umeng/common/net/c:a	(Landroid/content/Context;)Lcom/umeng/common/net/c;
    //   1783: aload_0
    //   1784: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   1787: getfield 337	com/umeng/common/net/a$a:a	Ljava/lang/String;
    //   1790: aload_0
    //   1791: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   1794: getfield 231	com/umeng/common/net/a$a:c	Ljava/lang/String;
    //   1797: bipush 100
    //   1799: invokevirtual 392	com/umeng/common/net/c:a	(Ljava/lang/String;Ljava/lang/String;I)V
    //   1802: aload 7
    //   1804: astore 6
    //   1806: aload 4
    //   1808: astore 5
    //   1810: aload 7
    //   1812: astore 9
    //   1814: aload 4
    //   1816: astore 8
    //   1818: new 64	java/io/File
    //   1821: dup
    //   1822: aload 10
    //   1824: invokevirtual 413	java/io/File:getParent	()Ljava/lang/String;
    //   1827: aload 10
    //   1829: invokevirtual 416	java/io/File:getName	()Ljava/lang/String;
    //   1832: ldc_w 418
    //   1835: ldc -117
    //   1837: invokevirtual 422	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1840: invokespecial 240	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1843: astore 11
    //   1845: aload 7
    //   1847: astore 6
    //   1849: aload 4
    //   1851: astore 5
    //   1853: aload 7
    //   1855: astore 9
    //   1857: aload 4
    //   1859: astore 8
    //   1861: aload 10
    //   1863: aload 11
    //   1865: invokevirtual 426	java/io/File:renameTo	(Ljava/io/File;)Z
    //   1868: pop
    //   1869: aload 7
    //   1871: astore 6
    //   1873: aload 4
    //   1875: astore 5
    //   1877: aload 7
    //   1879: astore 9
    //   1881: aload 4
    //   1883: astore 8
    //   1885: aload 11
    //   1887: invokevirtual 188	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1890: astore 11
    //   1892: aload 7
    //   1894: astore 6
    //   1896: aload 4
    //   1898: astore 5
    //   1900: aload 7
    //   1902: astore 9
    //   1904: aload 4
    //   1906: astore 8
    //   1908: new 428	android/os/Bundle
    //   1911: dup
    //   1912: invokespecial 429	android/os/Bundle:<init>	()V
    //   1915: astore 10
    //   1917: aload 7
    //   1919: astore 6
    //   1921: aload 4
    //   1923: astore 5
    //   1925: aload 7
    //   1927: astore 9
    //   1929: aload 4
    //   1931: astore 8
    //   1933: aload 10
    //   1935: ldc_w 431
    //   1938: aload 11
    //   1940: invokevirtual 434	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   1943: aload 7
    //   1945: astore 6
    //   1947: aload 4
    //   1949: astore 5
    //   1951: aload 7
    //   1953: astore 9
    //   1955: aload 4
    //   1957: astore 8
    //   1959: invokestatic 437	android/os/Message:obtain	()Landroid/os/Message;
    //   1962: astore 11
    //   1964: aload 7
    //   1966: astore 6
    //   1968: aload 4
    //   1970: astore 5
    //   1972: aload 7
    //   1974: astore 9
    //   1976: aload 4
    //   1978: astore 8
    //   1980: aload 11
    //   1982: iconst_5
    //   1983: putfield 440	android/os/Message:what	I
    //   1986: aload 7
    //   1988: astore 6
    //   1990: aload 4
    //   1992: astore 5
    //   1994: aload 7
    //   1996: astore 9
    //   1998: aload 4
    //   2000: astore 8
    //   2002: aload 11
    //   2004: iconst_1
    //   2005: putfield 443	android/os/Message:arg1	I
    //   2008: aload 7
    //   2010: astore 6
    //   2012: aload 4
    //   2014: astore 5
    //   2016: aload 7
    //   2018: astore 9
    //   2020: aload 4
    //   2022: astore 8
    //   2024: aload 11
    //   2026: aload 10
    //   2028: invokevirtual 447	android/os/Message:setData	(Landroid/os/Bundle;)V
    //   2031: aload 7
    //   2033: astore 6
    //   2035: aload 4
    //   2037: astore 5
    //   2039: aload 7
    //   2041: astore 9
    //   2043: aload 4
    //   2045: astore 8
    //   2047: aload_0
    //   2048: getfield 47	com/umeng/common/net/DownloadingService$a:k	Landroid/os/Handler;
    //   2051: aload 11
    //   2053: invokevirtual 453	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   2056: pop
    //   2057: aload 7
    //   2059: astore 6
    //   2061: aload 4
    //   2063: astore 5
    //   2065: aload 7
    //   2067: astore 9
    //   2069: aload 4
    //   2071: astore 8
    //   2073: invokestatic 437	android/os/Message:obtain	()Landroid/os/Message;
    //   2076: astore 11
    //   2078: aload 7
    //   2080: astore 6
    //   2082: aload 4
    //   2084: astore 5
    //   2086: aload 7
    //   2088: astore 9
    //   2090: aload 4
    //   2092: astore 8
    //   2094: aload 11
    //   2096: iconst_5
    //   2097: putfield 440	android/os/Message:what	I
    //   2100: aload 7
    //   2102: astore 6
    //   2104: aload 4
    //   2106: astore 5
    //   2108: aload 7
    //   2110: astore 9
    //   2112: aload 4
    //   2114: astore 8
    //   2116: aload 11
    //   2118: iconst_1
    //   2119: putfield 443	android/os/Message:arg1	I
    //   2122: aload 7
    //   2124: astore 6
    //   2126: aload 4
    //   2128: astore 5
    //   2130: aload 7
    //   2132: astore 9
    //   2134: aload 4
    //   2136: astore 8
    //   2138: aload 11
    //   2140: aload 10
    //   2142: invokevirtual 447	android/os/Message:setData	(Landroid/os/Bundle;)V
    //   2145: aload 7
    //   2147: astore 6
    //   2149: aload 4
    //   2151: astore 5
    //   2153: aload 7
    //   2155: astore 9
    //   2157: aload 4
    //   2159: astore 8
    //   2161: invokestatic 215	com/umeng/common/net/DownloadingService:b	()Ljava/util/Map;
    //   2164: aload_0
    //   2165: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   2168: invokeinterface 363 2 0
    //   2173: ifnull +39 -> 2212
    //   2176: aload 7
    //   2178: astore 6
    //   2180: aload 4
    //   2182: astore 5
    //   2184: aload 7
    //   2186: astore 9
    //   2188: aload 4
    //   2190: astore 8
    //   2192: invokestatic 215	com/umeng/common/net/DownloadingService:b	()Ljava/util/Map;
    //   2195: aload_0
    //   2196: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   2199: invokeinterface 363 2 0
    //   2204: checkcast 365	android/os/Messenger
    //   2207: aload 11
    //   2209: invokevirtual 375	android/os/Messenger:send	(Landroid/os/Message;)V
    //   2212: aload 7
    //   2214: astore 6
    //   2216: aload 4
    //   2218: astore 5
    //   2220: aload 7
    //   2222: astore 9
    //   2224: aload 4
    //   2226: astore 8
    //   2228: invokestatic 215	com/umeng/common/net/DownloadingService:b	()Ljava/util/Map;
    //   2231: aload_0
    //   2232: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   2235: invokeinterface 221 2 0
    //   2240: pop
    //   2241: aload 7
    //   2243: ifnull +8 -> 2251
    //   2246: aload 7
    //   2248: invokevirtual 357	java/io/InputStream:close	()V
    //   2251: aload 4
    //   2253: ifnull -1243 -> 1010
    //   2256: aload 4
    //   2258: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   2261: return
    //   2262: astore 4
    //   2264: aload 4
    //   2266: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2269: return
    //   2270: astore 5
    //   2272: aload 5
    //   2274: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2277: aload 4
    //   2279: ifnull -1269 -> 1010
    //   2282: aload 4
    //   2284: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   2287: return
    //   2288: astore 4
    //   2290: aload 4
    //   2292: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2295: return
    //   2296: astore 5
    //   2298: aload 4
    //   2300: ifnull +8 -> 2308
    //   2303: aload 4
    //   2305: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   2308: aload 5
    //   2310: athrow
    //   2311: astore 4
    //   2313: aload 4
    //   2315: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2318: goto -10 -> 2308
    //   2321: astore 7
    //   2323: aload 7
    //   2325: invokevirtual 454	android/os/RemoteException:printStackTrace	()V
    //   2328: invokestatic 215	com/umeng/common/net/DownloadingService:b	()Ljava/util/Map;
    //   2331: aload_0
    //   2332: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   2335: invokeinterface 221 2 0
    //   2340: pop
    //   2341: goto -784 -> 1557
    //   2344: astore 7
    //   2346: aload 5
    //   2348: astore 6
    //   2350: aload 4
    //   2352: astore 5
    //   2354: aload 7
    //   2356: astore 4
    //   2358: aload 6
    //   2360: ifnull +8 -> 2368
    //   2363: aload 6
    //   2365: invokevirtual 357	java/io/InputStream:close	()V
    //   2368: aload 5
    //   2370: ifnull +8 -> 2378
    //   2373: aload 5
    //   2375: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   2378: aload 4
    //   2380: athrow
    //   2381: invokestatic 190	com/umeng/common/net/DownloadingService:a	()Ljava/lang/String;
    //   2384: new 78	java/lang/StringBuilder
    //   2387: dup
    //   2388: ldc_w 456
    //   2391: invokespecial 132	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2394: aload_0
    //   2395: getfield 36	com/umeng/common/net/DownloadingService$a:f	I
    //   2398: invokevirtual 459	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2401: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2404: invokestatic 257	com/umeng/common/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   2407: ldc2_w 7
    //   2410: invokestatic 463	java/lang/Thread:sleep	(J)V
    //   2413: aload_0
    //   2414: getfield 40	com/umeng/common/net/DownloadingService$a:h	I
    //   2417: ifgt +22 -> 2439
    //   2420: aload_0
    //   2421: iconst_0
    //   2422: invokespecial 465	com/umeng/common/net/DownloadingService$a:a	(Z)V
    //   2425: goto -862 -> 1563
    //   2428: astore 6
    //   2430: aload_0
    //   2431: aload 6
    //   2433: invokespecial 401	com/umeng/common/net/DownloadingService$a:a	(Ljava/lang/Exception;)V
    //   2436: goto -873 -> 1563
    //   2439: aload_0
    //   2440: iconst_1
    //   2441: invokespecial 465	com/umeng/common/net/DownloadingService$a:a	(Z)V
    //   2444: goto -881 -> 1563
    //   2447: astore 5
    //   2449: aload 5
    //   2451: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2454: aload 4
    //   2456: ifnull -1446 -> 1010
    //   2459: aload 4
    //   2461: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   2464: return
    //   2465: astore 4
    //   2467: aload 4
    //   2469: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2472: return
    //   2473: astore 5
    //   2475: aload 4
    //   2477: ifnull +8 -> 2485
    //   2480: aload 4
    //   2482: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   2485: aload 5
    //   2487: athrow
    //   2488: astore 4
    //   2490: aload 4
    //   2492: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2495: goto -10 -> 2485
    //   2498: astore 4
    //   2500: aconst_null
    //   2501: astore 8
    //   2503: aload 9
    //   2505: astore 6
    //   2507: aload 8
    //   2509: astore 5
    //   2511: invokestatic 215	com/umeng/common/net/DownloadingService:b	()Ljava/util/Map;
    //   2514: aload_0
    //   2515: getfield 51	com/umeng/common/net/DownloadingService$a:i	Lcom/umeng/common/net/a$a;
    //   2518: invokeinterface 221 2 0
    //   2523: pop
    //   2524: aload 9
    //   2526: astore 6
    //   2528: aload 8
    //   2530: astore 5
    //   2532: aload 4
    //   2534: invokevirtual 454	android/os/RemoteException:printStackTrace	()V
    //   2537: aload 9
    //   2539: ifnull +8 -> 2547
    //   2542: aload 9
    //   2544: invokevirtual 357	java/io/InputStream:close	()V
    //   2547: aload 8
    //   2549: ifnull -1539 -> 1010
    //   2552: aload 8
    //   2554: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   2557: return
    //   2558: astore 4
    //   2560: aload 4
    //   2562: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2565: return
    //   2566: astore 4
    //   2568: aload 4
    //   2570: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2573: aload 8
    //   2575: ifnull -1565 -> 1010
    //   2578: aload 8
    //   2580: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   2583: return
    //   2584: astore 4
    //   2586: aload 4
    //   2588: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2591: return
    //   2592: astore 4
    //   2594: aload 8
    //   2596: ifnull +8 -> 2604
    //   2599: aload 8
    //   2601: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   2604: aload 4
    //   2606: athrow
    //   2607: astore 5
    //   2609: aload 5
    //   2611: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2614: goto -10 -> 2604
    //   2617: astore 5
    //   2619: aload 5
    //   2621: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2624: goto -246 -> 2378
    //   2627: astore 6
    //   2629: aload 6
    //   2631: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2634: aload 5
    //   2636: ifnull -258 -> 2378
    //   2639: aload 5
    //   2641: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   2644: goto -266 -> 2378
    //   2647: astore 5
    //   2649: aload 5
    //   2651: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2654: goto -276 -> 2378
    //   2657: astore 4
    //   2659: aload 5
    //   2661: ifnull +8 -> 2669
    //   2664: aload 5
    //   2666: invokevirtual 358	java/io/FileOutputStream:close	()V
    //   2669: aload 4
    //   2671: athrow
    //   2672: astore 5
    //   2674: aload 5
    //   2676: invokevirtual 404	java/io/IOException:printStackTrace	()V
    //   2679: goto -10 -> 2669
    //   2682: astore 4
    //   2684: aconst_null
    //   2685: astore 5
    //   2687: goto -329 -> 2358
    //   2690: astore 4
    //   2692: goto -334 -> 2358
    //   2695: astore 4
    //   2697: goto -194 -> 2503
    //   2700: astore 6
    //   2702: aconst_null
    //   2703: astore 4
    //   2705: aconst_null
    //   2706: astore 5
    //   2708: goto -1215 -> 1493
    //   2711: astore 6
    //   2713: aconst_null
    //   2714: astore 5
    //   2716: aload 7
    //   2718: astore 4
    //   2720: goto -1227 -> 1493
    //   2723: iload_3
    //   2724: istore_2
    //   2725: goto -2024 -> 701
    //   2728: iconst_1
    //   2729: istore_2
    //   2730: goto -1911 -> 819
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2733	0	this	a
    //   0	2733	1	paramBoolean	boolean
    //   700	2030	2	m	int
    //   724	2000	3	n	int
    //   73	1506	4	localFileOutputStream1	java.io.FileOutputStream
    //   1584	3	4	localIOException1	java.io.IOException
    //   1592	21	4	localIOException2	java.io.IOException
    //   1618	16	4	localIOException3	java.io.IOException
    //   1641	616	4	localIOException4	java.io.IOException
    //   2262	21	4	localIOException5	java.io.IOException
    //   2288	16	4	localIOException6	java.io.IOException
    //   2311	40	4	localIOException7	java.io.IOException
    //   2356	104	4	localObject1	Object
    //   2465	16	4	localIOException8	java.io.IOException
    //   2488	3	4	localIOException9	java.io.IOException
    //   2498	35	4	localRemoteException1	android.os.RemoteException
    //   2558	3	4	localIOException10	java.io.IOException
    //   2566	3	4	localIOException11	java.io.IOException
    //   2584	3	4	localIOException12	java.io.IOException
    //   2592	13	4	localObject2	Object
    //   2657	13	4	localObject3	Object
    //   2682	1	4	localObject4	Object
    //   2690	1	4	localObject5	Object
    //   2695	1	4	localRemoteException2	android.os.RemoteException
    //   2703	16	4	localObject6	Object
    //   81	1290	5	localFileOutputStream2	java.io.FileOutputStream
    //   1410	1	5	localDeadObjectException	android.os.DeadObjectException
    //   1418	151	5	localObject7	Object
    //   1600	3	5	localIOException13	java.io.IOException
    //   1626	13	5	localObject8	Object
    //   1657	562	5	localIOException14	java.io.IOException
    //   2270	3	5	localIOException15	java.io.IOException
    //   2296	51	5	localObject9	Object
    //   2352	22	5	localIOException16	java.io.IOException
    //   2447	3	5	localIOException17	java.io.IOException
    //   2473	13	5	localObject10	Object
    //   2509	22	5	localObject11	Object
    //   2607	3	5	localIOException18	java.io.IOException
    //   2617	23	5	localIOException19	java.io.IOException
    //   2647	18	5	localIOException20	java.io.IOException
    //   2672	3	5	localIOException21	java.io.IOException
    //   2685	30	5	localObject12	Object
    //   10	1447	6	localObject13	Object
    //   1487	72	6	localIOException22	java.io.IOException
    //   1653	711	6	localObject14	Object
    //   2428	4	6	localInterruptedException	InterruptedException
    //   2505	22	6	localObject15	Object
    //   2627	3	6	localIOException23	java.io.IOException
    //   2700	1	6	localIOException24	java.io.IOException
    //   2711	1	6	localIOException25	java.io.IOException
    //   93	2154	7	localObject16	Object
    //   2321	3	7	localRemoteException3	android.os.RemoteException
    //   2344	373	7	localObject17	Object
    //   89	2511	8	localObject18	Object
    //   1	2542	9	localObject19	Object
    //   40	2101	10	localObject20	Object
    //   4	2204	11	localObject21	Object
    //   7	1041	12	localObject22	Object
    //   168	360	13	localHttpURLConnection	java.net.HttpURLConnection
    // Exception table:
    //   from	to	target	type
    //   1308	1323	1410	android/os/DeadObjectException
    //   1339	1364	1410	android/os/DeadObjectException
    //   505	510	1487	java/io/IOException
    //   526	535	1487	java/io/IOException
    //   551	577	1487	java/io/IOException
    //   593	600	1487	java/io/IOException
    //   616	658	1487	java/io/IOException
    //   674	699	1487	java/io/IOException
    //   717	725	1487	java/io/IOException
    //   745	754	1487	java/io/IOException
    //   770	780	1487	java/io/IOException
    //   807	817	1487	java/io/IOException
    //   835	840	1487	java/io/IOException
    //   856	861	1487	java/io/IOException
    //   881	895	1487	java/io/IOException
    //   911	920	1487	java/io/IOException
    //   936	961	1487	java/io/IOException
    //   977	990	1487	java/io/IOException
    //   1089	1106	1487	java/io/IOException
    //   1122	1143	1487	java/io/IOException
    //   1159	1199	1487	java/io/IOException
    //   1215	1233	1487	java/io/IOException
    //   1249	1292	1487	java/io/IOException
    //   1308	1323	1487	java/io/IOException
    //   1339	1364	1487	java/io/IOException
    //   1380	1405	1487	java/io/IOException
    //   1428	1454	1487	java/io/IOException
    //   1470	1484	1487	java/io/IOException
    //   1667	1677	1487	java/io/IOException
    //   1693	1703	1487	java/io/IOException
    //   1719	1760	1487	java/io/IOException
    //   1776	1802	1487	java/io/IOException
    //   1818	1845	1487	java/io/IOException
    //   1861	1869	1487	java/io/IOException
    //   1885	1892	1487	java/io/IOException
    //   1908	1917	1487	java/io/IOException
    //   1933	1943	1487	java/io/IOException
    //   1959	1964	1487	java/io/IOException
    //   1980	1986	1487	java/io/IOException
    //   2002	2008	1487	java/io/IOException
    //   2024	2031	1487	java/io/IOException
    //   2047	2057	1487	java/io/IOException
    //   2073	2078	1487	java/io/IOException
    //   2094	2100	1487	java/io/IOException
    //   2116	2122	1487	java/io/IOException
    //   2138	2145	1487	java/io/IOException
    //   2161	2176	1487	java/io/IOException
    //   2192	2212	1487	java/io/IOException
    //   2228	2241	1487	java/io/IOException
    //   1578	1583	1584	java/io/IOException
    //   1005	1010	1592	java/io/IOException
    //   995	1000	1600	java/io/IOException
    //   1612	1617	1618	java/io/IOException
    //   995	1000	1626	finally
    //   1602	1607	1626	finally
    //   1633	1638	1641	java/io/IOException
    //   2256	2261	2262	java/io/IOException
    //   2246	2251	2270	java/io/IOException
    //   2282	2287	2288	java/io/IOException
    //   2246	2251	2296	finally
    //   2272	2277	2296	finally
    //   2303	2308	2311	java/io/IOException
    //   1523	1557	2321	android/os/RemoteException
    //   1493	1518	2344	finally
    //   1523	1557	2344	finally
    //   1557	1563	2344	finally
    //   2323	2341	2344	finally
    //   2381	2407	2344	finally
    //   2407	2425	2344	finally
    //   2430	2436	2344	finally
    //   2439	2444	2344	finally
    //   2407	2425	2428	java/lang/InterruptedException
    //   2439	2444	2428	java/lang/InterruptedException
    //   1568	1573	2447	java/io/IOException
    //   2459	2464	2465	java/io/IOException
    //   1568	1573	2473	finally
    //   2449	2454	2473	finally
    //   2480	2485	2488	java/io/IOException
    //   12	75	2498	android/os/RemoteException
    //   1011	1039	2498	android/os/RemoteException
    //   2552	2557	2558	java/io/IOException
    //   2542	2547	2566	java/io/IOException
    //   2578	2583	2584	java/io/IOException
    //   2542	2547	2592	finally
    //   2568	2573	2592	finally
    //   2599	2604	2607	java/io/IOException
    //   2373	2378	2617	java/io/IOException
    //   2363	2368	2627	java/io/IOException
    //   2639	2644	2647	java/io/IOException
    //   2363	2368	2657	finally
    //   2629	2634	2657	finally
    //   2664	2669	2672	java/io/IOException
    //   12	75	2682	finally
    //   1011	1039	2682	finally
    //   95	128	2690	finally
    //   148	170	2690	finally
    //   190	198	2690	finally
    //   218	229	2690	finally
    //   249	260	2690	finally
    //   280	288	2690	finally
    //   308	316	2690	finally
    //   336	344	2690	finally
    //   364	374	2690	finally
    //   394	429	2690	finally
    //   449	454	2690	finally
    //   474	481	2690	finally
    //   505	510	2690	finally
    //   526	535	2690	finally
    //   551	577	2690	finally
    //   593	600	2690	finally
    //   616	658	2690	finally
    //   674	699	2690	finally
    //   717	725	2690	finally
    //   745	754	2690	finally
    //   770	780	2690	finally
    //   807	817	2690	finally
    //   835	840	2690	finally
    //   856	861	2690	finally
    //   881	895	2690	finally
    //   911	920	2690	finally
    //   936	961	2690	finally
    //   977	990	2690	finally
    //   1059	1070	2690	finally
    //   1089	1106	2690	finally
    //   1122	1143	2690	finally
    //   1159	1199	2690	finally
    //   1215	1233	2690	finally
    //   1249	1292	2690	finally
    //   1308	1323	2690	finally
    //   1339	1364	2690	finally
    //   1380	1405	2690	finally
    //   1428	1454	2690	finally
    //   1470	1484	2690	finally
    //   1667	1677	2690	finally
    //   1693	1703	2690	finally
    //   1719	1760	2690	finally
    //   1776	1802	2690	finally
    //   1818	1845	2690	finally
    //   1861	1869	2690	finally
    //   1885	1892	2690	finally
    //   1908	1917	2690	finally
    //   1933	1943	2690	finally
    //   1959	1964	2690	finally
    //   1980	1986	2690	finally
    //   2002	2008	2690	finally
    //   2024	2031	2690	finally
    //   2047	2057	2690	finally
    //   2073	2078	2690	finally
    //   2094	2100	2690	finally
    //   2116	2122	2690	finally
    //   2138	2145	2690	finally
    //   2161	2176	2690	finally
    //   2192	2212	2690	finally
    //   2228	2241	2690	finally
    //   2511	2524	2690	finally
    //   2532	2537	2690	finally
    //   95	128	2695	android/os/RemoteException
    //   148	170	2695	android/os/RemoteException
    //   190	198	2695	android/os/RemoteException
    //   218	229	2695	android/os/RemoteException
    //   249	260	2695	android/os/RemoteException
    //   280	288	2695	android/os/RemoteException
    //   308	316	2695	android/os/RemoteException
    //   336	344	2695	android/os/RemoteException
    //   364	374	2695	android/os/RemoteException
    //   394	429	2695	android/os/RemoteException
    //   449	454	2695	android/os/RemoteException
    //   474	481	2695	android/os/RemoteException
    //   505	510	2695	android/os/RemoteException
    //   526	535	2695	android/os/RemoteException
    //   551	577	2695	android/os/RemoteException
    //   593	600	2695	android/os/RemoteException
    //   616	658	2695	android/os/RemoteException
    //   674	699	2695	android/os/RemoteException
    //   717	725	2695	android/os/RemoteException
    //   745	754	2695	android/os/RemoteException
    //   770	780	2695	android/os/RemoteException
    //   807	817	2695	android/os/RemoteException
    //   835	840	2695	android/os/RemoteException
    //   856	861	2695	android/os/RemoteException
    //   881	895	2695	android/os/RemoteException
    //   911	920	2695	android/os/RemoteException
    //   936	961	2695	android/os/RemoteException
    //   977	990	2695	android/os/RemoteException
    //   1059	1070	2695	android/os/RemoteException
    //   1089	1106	2695	android/os/RemoteException
    //   1122	1143	2695	android/os/RemoteException
    //   1159	1199	2695	android/os/RemoteException
    //   1215	1233	2695	android/os/RemoteException
    //   1249	1292	2695	android/os/RemoteException
    //   1308	1323	2695	android/os/RemoteException
    //   1339	1364	2695	android/os/RemoteException
    //   1380	1405	2695	android/os/RemoteException
    //   1428	1454	2695	android/os/RemoteException
    //   1470	1484	2695	android/os/RemoteException
    //   1667	1677	2695	android/os/RemoteException
    //   1693	1703	2695	android/os/RemoteException
    //   1719	1760	2695	android/os/RemoteException
    //   1776	1802	2695	android/os/RemoteException
    //   1818	1845	2695	android/os/RemoteException
    //   1861	1869	2695	android/os/RemoteException
    //   1885	1892	2695	android/os/RemoteException
    //   1908	1917	2695	android/os/RemoteException
    //   1933	1943	2695	android/os/RemoteException
    //   1959	1964	2695	android/os/RemoteException
    //   1980	1986	2695	android/os/RemoteException
    //   2002	2008	2695	android/os/RemoteException
    //   2024	2031	2695	android/os/RemoteException
    //   2047	2057	2695	android/os/RemoteException
    //   2073	2078	2695	android/os/RemoteException
    //   2094	2100	2695	android/os/RemoteException
    //   2116	2122	2695	android/os/RemoteException
    //   2138	2145	2695	android/os/RemoteException
    //   2161	2176	2695	android/os/RemoteException
    //   2192	2212	2695	android/os/RemoteException
    //   2228	2241	2695	android/os/RemoteException
    //   12	75	2700	java/io/IOException
    //   1011	1039	2700	java/io/IOException
    //   95	128	2711	java/io/IOException
    //   148	170	2711	java/io/IOException
    //   190	198	2711	java/io/IOException
    //   218	229	2711	java/io/IOException
    //   249	260	2711	java/io/IOException
    //   280	288	2711	java/io/IOException
    //   308	316	2711	java/io/IOException
    //   336	344	2711	java/io/IOException
    //   364	374	2711	java/io/IOException
    //   394	429	2711	java/io/IOException
    //   449	454	2711	java/io/IOException
    //   474	481	2711	java/io/IOException
    //   1059	1070	2711	java/io/IOException
  }
  
  public void run()
  {
    this.f = 0;
    try
    {
      a(false);
      DownloadingService.b().remove(this.i);
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\DownloadingService$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */