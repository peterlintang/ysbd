package com.ireadercity.b2.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.ireadercity.b2.h.o;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public final class a
{
  private Boolean a = Boolean.valueOf(true);
  
  private static Bitmap a(File paramFile, float paramFloat1, float paramFloat2)
  {
    int j = 1;
    try
    {
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeStream(new FileInputStream(paramFile), null, localOptions);
      int m = (int)(72.0F * paramFloat2);
      int n = (int)(88.0F * paramFloat1);
      new StringBuilder().append(m).toString();
      new StringBuilder().append(n).toString();
      int k = localOptions.outWidth;
      int i = localOptions.outHeight;
      new StringBuilder().append(k).append("  ").append(i).toString();
      while ((k / 2 >= n) || (i / 2 >= m))
      {
        k /= 2;
        i /= 2;
        j += 1;
      }
      localOptions = new BitmapFactory.Options();
      localOptions.inSampleSize = j;
      paramFile = BitmapFactory.decodeStream(new FileInputStream(paramFile), null, localOptions);
      return paramFile;
    }
    catch (FileNotFoundException paramFile) {}
    return null;
  }
  
  /* Error */
  public static com.ireadercity.b2.bean.b a(String paramString1, String paramString2, Context paramContext, float paramFloat1, float paramFloat2, com.ireadercity.b2.bean.b paramb)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 80	com/ireadercity/b2/c/a:a	(Landroid/content/Context;)Lcom/ireadercity/b2/c/a;
    //   4: astore 9
    //   6: new 82	java/io/File
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 85	java/io/File:<init>	(Ljava/lang/String;)V
    //   14: astore 10
    //   16: aload 10
    //   18: invokevirtual 89	java/io/File:exists	()Z
    //   21: ifeq +1072 -> 1093
    //   24: new 91	java/io/BufferedInputStream
    //   27: dup
    //   28: new 31	java/io/FileInputStream
    //   31: dup
    //   32: aload 10
    //   34: invokespecial 34	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   37: invokespecial 94	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   40: astore 11
    //   42: new 96	java/util/ArrayList
    //   45: dup
    //   46: invokespecial 97	java/util/ArrayList:<init>	()V
    //   49: pop
    //   50: invokestatic 103	javax/xml/parsers/SAXParserFactory:newInstance	()Ljavax/xml/parsers/SAXParserFactory;
    //   53: astore 8
    //   55: aconst_null
    //   56: astore 7
    //   58: aload 8
    //   60: invokevirtual 107	javax/xml/parsers/SAXParserFactory:newSAXParser	()Ljavax/xml/parsers/SAXParser;
    //   63: astore 8
    //   65: aload 8
    //   67: astore 7
    //   69: aload 7
    //   71: invokevirtual 113	javax/xml/parsers/SAXParser:getXMLReader	()Lorg/xml/sax/XMLReader;
    //   74: astore 7
    //   76: new 115	com/ireadercity/b2/h/q
    //   79: dup
    //   80: aload_0
    //   81: aload_1
    //   82: invokespecial 118	com/ireadercity/b2/h/q:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: astore 17
    //   87: aload 7
    //   89: aload 17
    //   91: invokeinterface 124 2 0
    //   96: aload 7
    //   98: new 126	org/xml/sax/InputSource
    //   101: dup
    //   102: aload 11
    //   104: invokespecial 127	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   107: invokeinterface 131 2 0
    //   112: aload 17
    //   114: invokevirtual 135	com/ireadercity/b2/h/q:c	()Ljava/util/ArrayList;
    //   117: astore 18
    //   119: aload 17
    //   121: invokevirtual 139	com/ireadercity/b2/h/q:d	()Ljava/util/HashMap;
    //   124: astore 16
    //   126: aload 17
    //   128: invokevirtual 142	com/ireadercity/b2/h/q:b	()Ljava/lang/String;
    //   131: astore 19
    //   133: aload 17
    //   135: invokevirtual 144	com/ireadercity/b2/h/q:a	()Ljava/lang/String;
    //   138: astore 7
    //   140: new 44	java/lang/StringBuilder
    //   143: dup
    //   144: ldc -110
    //   146: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   149: aload 19
    //   151: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: pop
    //   158: new 44	java/lang/StringBuilder
    //   161: dup
    //   162: ldc -107
    //   164: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   167: aload 7
    //   169: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: pop
    //   176: aload 17
    //   178: invokevirtual 152	com/ireadercity/b2/h/q:g	()Ljava/lang/String;
    //   181: astore 13
    //   183: aload 17
    //   185: invokevirtual 155	com/ireadercity/b2/h/q:e	()Ljava/lang/String;
    //   188: astore 8
    //   190: aload 17
    //   192: invokevirtual 158	com/ireadercity/b2/h/q:f	()Ljava/lang/String;
    //   195: astore 15
    //   197: aload 17
    //   199: invokevirtual 161	com/ireadercity/b2/h/q:h	()Ljava/lang/String;
    //   202: astore 12
    //   204: aload 17
    //   206: invokevirtual 164	com/ireadercity/b2/h/q:i	()Ljava/lang/String;
    //   209: astore_0
    //   210: aload 17
    //   212: invokevirtual 167	com/ireadercity/b2/h/q:j	()Ljava/lang/String;
    //   215: astore 11
    //   217: aload 17
    //   219: invokevirtual 170	com/ireadercity/b2/h/q:k	()Ljava/lang/String;
    //   222: astore 14
    //   224: aload 17
    //   226: invokevirtual 173	com/ireadercity/b2/h/q:l	()Ljava/lang/String;
    //   229: astore 17
    //   231: new 96	java/util/ArrayList
    //   234: dup
    //   235: invokespecial 97	java/util/ArrayList:<init>	()V
    //   238: pop
    //   239: new 96	java/util/ArrayList
    //   242: dup
    //   243: invokespecial 97	java/util/ArrayList:<init>	()V
    //   246: astore 21
    //   248: aload 18
    //   250: ifnull +217 -> 467
    //   253: aload 16
    //   255: ifnull +212 -> 467
    //   258: aload 18
    //   260: invokevirtual 177	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   263: astore 20
    //   265: iconst_0
    //   266: istore 6
    //   268: aload 20
    //   270: invokeinterface 182 1 0
    //   275: ifeq +192 -> 467
    //   278: aload 20
    //   280: invokeinterface 186 1 0
    //   285: checkcast 188	java/util/Map
    //   288: astore 22
    //   290: aload 22
    //   292: ifnull -24 -> 268
    //   295: aload 16
    //   297: new 44	java/lang/StringBuilder
    //   300: dup
    //   301: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   304: aload 22
    //   306: ldc -66
    //   308: invokeinterface 194 2 0
    //   313: checkcast 196	java/lang/String
    //   316: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   322: invokevirtual 199	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   325: checkcast 188	java/util/Map
    //   328: astore 23
    //   330: aload 23
    //   332: ifnull -64 -> 268
    //   335: new 198	java/util/HashMap
    //   338: dup
    //   339: invokespecial 200	java/util/HashMap:<init>	()V
    //   342: astore 22
    //   344: aload 22
    //   346: ldc -54
    //   348: aload 23
    //   350: ldc -54
    //   352: invokeinterface 194 2 0
    //   357: invokevirtual 206	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   360: pop
    //   361: aload 22
    //   363: ldc -48
    //   365: aload 23
    //   367: ldc -48
    //   369: invokeinterface 194 2 0
    //   374: invokevirtual 206	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   377: pop
    //   378: aload 22
    //   380: ldc -46
    //   382: new 44	java/lang/StringBuilder
    //   385: dup
    //   386: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   389: iload 6
    //   391: invokevirtual 49	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   394: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   397: invokevirtual 206	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   400: pop
    //   401: aload 21
    //   403: aload 22
    //   405: invokevirtual 214	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   408: pop
    //   409: iload 6
    //   411: iconst_1
    //   412: iadd
    //   413: istore 6
    //   415: goto -147 -> 268
    //   418: astore 8
    //   420: aload 8
    //   422: invokevirtual 217	javax/xml/parsers/ParserConfigurationException:printStackTrace	()V
    //   425: goto -356 -> 69
    //   428: astore 8
    //   430: aload 8
    //   432: invokevirtual 218	org/xml/sax/SAXException:printStackTrace	()V
    //   435: goto -366 -> 69
    //   438: astore 7
    //   440: aload 7
    //   442: invokevirtual 218	org/xml/sax/SAXException:printStackTrace	()V
    //   445: aconst_null
    //   446: astore 7
    //   448: goto -372 -> 76
    //   451: astore_0
    //   452: aload_0
    //   453: invokevirtual 219	java/io/IOException:printStackTrace	()V
    //   456: goto -344 -> 112
    //   459: astore_0
    //   460: aload_0
    //   461: invokevirtual 218	org/xml/sax/SAXException:printStackTrace	()V
    //   464: goto -352 -> 112
    //   467: aload 5
    //   469: aload 21
    //   471: invokevirtual 224	com/ireadercity/b2/bean/b:b	(Ljava/util/ArrayList;)V
    //   474: new 44	java/lang/StringBuilder
    //   477: dup
    //   478: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   481: aload 10
    //   483: invokevirtual 227	java/io/File:getParent	()Ljava/lang/String;
    //   486: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   489: ldc -27
    //   491: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   494: aload 19
    //   496: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   499: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   502: astore 19
    //   504: aload 5
    //   506: invokevirtual 232	com/ireadercity/b2/bean/b:r	()Ljava/lang/String;
    //   509: invokestatic 237	com/ireadercity/b2/h/y:d	(Ljava/lang/String;)Z
    //   512: ifeq +559 -> 1071
    //   515: aload 7
    //   517: ifnull +164 -> 681
    //   520: new 82	java/io/File
    //   523: dup
    //   524: new 44	java/lang/StringBuilder
    //   527: dup
    //   528: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   531: aload 10
    //   533: invokevirtual 227	java/io/File:getParent	()Ljava/lang/String;
    //   536: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: ldc -27
    //   541: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   544: aload 7
    //   546: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   549: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   552: invokespecial 85	java/io/File:<init>	(Ljava/lang/String;)V
    //   555: fload_3
    //   556: fload 4
    //   558: invokestatic 239	com/ireadercity/b2/b/a:a	(Ljava/io/File;FF)Landroid/graphics/Bitmap;
    //   561: astore_0
    //   562: new 82	java/io/File
    //   565: dup
    //   566: new 44	java/lang/StringBuilder
    //   569: dup
    //   570: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   573: getstatic 245	com/ireadercity/b2/a:o	Ljava/lang/String;
    //   576: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   579: ldc -27
    //   581: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   584: aload_1
    //   585: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   588: ldc -9
    //   590: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   593: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   596: invokespecial 85	java/io/File:<init>	(Ljava/lang/String;)V
    //   599: astore 7
    //   601: aload 7
    //   603: invokevirtual 250	java/io/File:createNewFile	()Z
    //   606: pop
    //   607: new 252	java/io/FileOutputStream
    //   610: dup
    //   611: aload 7
    //   613: invokespecial 253	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   616: astore 10
    //   618: aload_0
    //   619: getstatic 259	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   622: bipush 30
    //   624: aload 10
    //   626: invokevirtual 265	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   629: pop
    //   630: aload 10
    //   632: invokevirtual 268	java/io/FileOutputStream:flush	()V
    //   635: aload 10
    //   637: invokevirtual 271	java/io/FileOutputStream:close	()V
    //   640: aload_0
    //   641: ifnonnull +9 -> 650
    //   644: aload 7
    //   646: invokevirtual 274	java/io/File:delete	()Z
    //   649: pop
    //   650: new 44	java/lang/StringBuilder
    //   653: dup
    //   654: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   657: getstatic 245	com/ireadercity/b2/a:o	Ljava/lang/String;
    //   660: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   663: ldc -27
    //   665: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   668: aload_1
    //   669: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   672: ldc -9
    //   674: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   677: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   680: astore_0
    //   681: aconst_null
    //   682: astore 7
    //   684: new 82	java/io/File
    //   687: dup
    //   688: aload 19
    //   690: invokespecial 85	java/io/File:<init>	(Ljava/lang/String;)V
    //   693: invokevirtual 89	java/io/File:exists	()Z
    //   696: ifeq +56 -> 752
    //   699: aload 19
    //   701: aload_1
    //   702: aload_2
    //   703: invokestatic 277	com/ireadercity/b2/b/a:a	(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/util/ArrayList;
    //   706: astore_2
    //   707: new 44	java/lang/StringBuilder
    //   710: dup
    //   711: ldc_w 279
    //   714: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   717: aload_2
    //   718: invokevirtual 283	java/util/ArrayList:size	()I
    //   721: invokevirtual 49	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   724: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   727: pop
    //   728: aload_2
    //   729: ifnull +13 -> 742
    //   732: aload_2
    //   733: astore 7
    //   735: aload_2
    //   736: invokevirtual 283	java/util/ArrayList:size	()I
    //   739: ifgt +13 -> 752
    //   742: aload_1
    //   743: aload 18
    //   745: aload 16
    //   747: invokestatic 286	com/ireadercity/b2/b/a:a	(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/HashMap;)Ljava/util/ArrayList;
    //   750: astore 7
    //   752: aload 5
    //   754: aload 7
    //   756: invokevirtual 288	com/ireadercity/b2/bean/b:a	(Ljava/util/ArrayList;)V
    //   759: aload 5
    //   761: aload_1
    //   762: invokevirtual 290	com/ireadercity/b2/bean/b:e	(Ljava/lang/String;)V
    //   765: aload 5
    //   767: aload 13
    //   769: invokevirtual 292	com/ireadercity/b2/bean/b:i	(Ljava/lang/String;)V
    //   772: aload 5
    //   774: invokevirtual 293	com/ireadercity/b2/bean/b:k	()Ljava/lang/String;
    //   777: ifnull +22 -> 799
    //   780: aload 5
    //   782: invokevirtual 293	com/ireadercity/b2/bean/b:k	()Ljava/lang/String;
    //   785: invokevirtual 296	java/lang/String:length	()I
    //   788: iconst_2
    //   789: if_icmpge +10 -> 799
    //   792: aload 5
    //   794: aload 8
    //   796: invokevirtual 298	com/ireadercity/b2/bean/b:f	(Ljava/lang/String;)V
    //   799: aload 5
    //   801: invokevirtual 301	com/ireadercity/b2/bean/b:m	()Ljava/lang/String;
    //   804: ifnull +23 -> 827
    //   807: aload 5
    //   809: invokevirtual 301	com/ireadercity/b2/bean/b:m	()Ljava/lang/String;
    //   812: invokevirtual 296	java/lang/String:length	()I
    //   815: bipush 10
    //   817: if_icmpge +10 -> 827
    //   820: aload 5
    //   822: aload 15
    //   824: invokevirtual 303	com/ireadercity/b2/bean/b:h	(Ljava/lang/String;)V
    //   827: aload 5
    //   829: aload 12
    //   831: invokevirtual 305	com/ireadercity/b2/bean/b:k	(Ljava/lang/String;)V
    //   834: aload 5
    //   836: aload_0
    //   837: invokevirtual 307	com/ireadercity/b2/bean/b:l	(Ljava/lang/String;)V
    //   840: aload 5
    //   842: aload 14
    //   844: invokevirtual 310	com/ireadercity/b2/bean/b:p	(Ljava/lang/String;)V
    //   847: aload 5
    //   849: aload 11
    //   851: invokevirtual 312	com/ireadercity/b2/bean/b:j	(Ljava/lang/String;)V
    //   854: aload 5
    //   856: aload 17
    //   858: invokevirtual 314	com/ireadercity/b2/bean/b:m	(Ljava/lang/String;)V
    //   861: aload 5
    //   863: invokevirtual 317	com/ireadercity/b2/bean/b:x	()Ljava/util/ArrayList;
    //   866: ifnonnull +214 -> 1080
    //   869: iconst_0
    //   870: istore 6
    //   872: aload 9
    //   874: aload_1
    //   875: aload 8
    //   877: aload 5
    //   879: invokevirtual 301	com/ireadercity/b2/bean/b:m	()Ljava/lang/String;
    //   882: aload 5
    //   884: invokevirtual 320	com/ireadercity/b2/bean/b:n	()Ljava/lang/String;
    //   887: aload 5
    //   889: invokevirtual 322	com/ireadercity/b2/bean/b:p	()Ljava/lang/String;
    //   892: aload_0
    //   893: aload 5
    //   895: invokevirtual 325	com/ireadercity/b2/bean/b:w	()Ljava/lang/String;
    //   898: aload 5
    //   900: invokevirtual 327	com/ireadercity/b2/bean/b:o	()Ljava/lang/String;
    //   903: iconst_1
    //   904: iload 6
    //   906: invokevirtual 330	com/ireadercity/b2/c/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Z
    //   909: pop
    //   910: new 44	java/lang/StringBuilder
    //   913: dup
    //   914: ldc_w 332
    //   917: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   920: aload 5
    //   922: invokevirtual 317	com/ireadercity/b2/bean/b:x	()Ljava/util/ArrayList;
    //   925: invokevirtual 283	java/util/ArrayList:size	()I
    //   928: invokevirtual 49	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   931: ldc_w 334
    //   934: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   937: aload 5
    //   939: invokevirtual 337	com/ireadercity/b2/bean/b:q	()Ljava/util/ArrayList;
    //   942: invokevirtual 283	java/util/ArrayList:size	()I
    //   945: invokevirtual 49	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   948: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   951: pop
    //   952: aload 5
    //   954: areturn
    //   955: astore 20
    //   957: aload 20
    //   959: invokevirtual 219	java/io/IOException:printStackTrace	()V
    //   962: goto -327 -> 635
    //   965: astore 10
    //   967: aload 10
    //   969: invokevirtual 219	java/io/IOException:printStackTrace	()V
    //   972: goto -332 -> 640
    //   975: astore 7
    //   977: aload 7
    //   979: invokevirtual 338	java/io/FileNotFoundException:printStackTrace	()V
    //   982: aload_0
    //   983: getstatic 259	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   986: bipush 30
    //   988: aconst_null
    //   989: invokevirtual 265	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   992: pop
    //   993: new 340	java/lang/NullPointerException
    //   996: dup
    //   997: invokespecial 341	java/lang/NullPointerException:<init>	()V
    //   1000: athrow
    //   1001: new 340	java/lang/NullPointerException
    //   1004: dup
    //   1005: invokespecial 341	java/lang/NullPointerException:<init>	()V
    //   1008: athrow
    //   1009: astore_0
    //   1010: aload_0
    //   1011: invokevirtual 219	java/io/IOException:printStackTrace	()V
    //   1014: goto -364 -> 650
    //   1017: astore_0
    //   1018: aload_0
    //   1019: invokevirtual 219	java/io/IOException:printStackTrace	()V
    //   1022: goto -21 -> 1001
    //   1025: astore_1
    //   1026: aload_0
    //   1027: getstatic 259	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   1030: bipush 30
    //   1032: aconst_null
    //   1033: invokevirtual 265	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   1036: pop
    //   1037: new 340	java/lang/NullPointerException
    //   1040: dup
    //   1041: invokespecial 341	java/lang/NullPointerException:<init>	()V
    //   1044: athrow
    //   1045: new 340	java/lang/NullPointerException
    //   1048: dup
    //   1049: invokespecial 341	java/lang/NullPointerException:<init>	()V
    //   1052: athrow
    //   1053: aload_1
    //   1054: athrow
    //   1055: astore_0
    //   1056: aload_0
    //   1057: invokevirtual 219	java/io/IOException:printStackTrace	()V
    //   1060: goto -15 -> 1045
    //   1063: astore_0
    //   1064: aload_0
    //   1065: invokevirtual 219	java/io/IOException:printStackTrace	()V
    //   1068: goto -15 -> 1053
    //   1071: aload 5
    //   1073: invokevirtual 232	com/ireadercity/b2/bean/b:r	()Ljava/lang/String;
    //   1076: astore_0
    //   1077: goto -396 -> 681
    //   1080: aload 5
    //   1082: invokevirtual 317	com/ireadercity/b2/bean/b:x	()Ljava/util/ArrayList;
    //   1085: invokevirtual 283	java/util/ArrayList:size	()I
    //   1088: istore 6
    //   1090: goto -218 -> 872
    //   1093: new 44	java/lang/StringBuilder
    //   1096: dup
    //   1097: ldc_w 343
    //   1100: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1103: aload_0
    //   1104: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1107: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1110: pop
    //   1111: new 22	java/io/FileNotFoundException
    //   1114: dup
    //   1115: ldc_w 345
    //   1118: invokespecial 346	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   1121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1122	0	paramString1	String
    //   0	1122	1	paramString2	String
    //   0	1122	2	paramContext	Context
    //   0	1122	3	paramFloat1	float
    //   0	1122	4	paramFloat2	float
    //   0	1122	5	paramb	com.ireadercity.b2.bean.b
    //   266	823	6	i	int
    //   56	112	7	localObject1	Object
    //   438	3	7	localSAXException1	SAXException
    //   446	309	7	localObject2	Object
    //   975	3	7	localFileNotFoundException	FileNotFoundException
    //   53	136	8	localObject3	Object
    //   418	3	8	localParserConfigurationException	ParserConfigurationException
    //   428	448	8	localSAXException2	SAXException
    //   4	869	9	locala	com.ireadercity.b2.c.a
    //   14	622	10	localObject4	Object
    //   965	3	10	localIOException1	IOException
    //   40	810	11	localObject5	Object
    //   202	628	12	str1	String
    //   181	587	13	str2	String
    //   222	621	14	str3	String
    //   195	628	15	str4	String
    //   124	622	16	localHashMap	HashMap
    //   85	772	17	localObject6	Object
    //   117	627	18	localArrayList1	ArrayList
    //   131	569	19	str5	String
    //   263	16	20	localIterator	Iterator
    //   955	3	20	localIOException2	IOException
    //   246	224	21	localArrayList2	ArrayList
    //   288	116	22	localObject7	Object
    //   328	38	23	localMap	Map
    // Exception table:
    //   from	to	target	type
    //   58	65	418	javax/xml/parsers/ParserConfigurationException
    //   58	65	428	org/xml/sax/SAXException
    //   69	76	438	org/xml/sax/SAXException
    //   96	112	451	java/io/IOException
    //   96	112	459	org/xml/sax/SAXException
    //   630	635	955	java/io/IOException
    //   635	640	965	java/io/IOException
    //   607	618	975	java/io/FileNotFoundException
    //   1001	1009	1009	java/io/IOException
    //   993	1001	1017	java/io/IOException
    //   607	618	1025	finally
    //   977	982	1025	finally
    //   1037	1045	1055	java/io/IOException
    //   1045	1053	1063	java/io/IOException
  }
  
  /* Error */
  public static String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 44	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   7: aload_0
    //   8: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   11: ldc_w 351
    //   14: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   20: pop
    //   21: new 44	java/lang/StringBuilder
    //   24: dup
    //   25: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   28: aload_1
    //   29: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: ldc_w 353
    //   35: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   41: pop
    //   42: aload_0
    //   43: ifnonnull +5 -> 48
    //   46: aconst_null
    //   47: areturn
    //   48: new 82	java/io/File
    //   51: dup
    //   52: aload_0
    //   53: invokespecial 85	java/io/File:<init>	(Ljava/lang/String;)V
    //   56: astore 5
    //   58: aload 5
    //   60: invokevirtual 89	java/io/File:exists	()Z
    //   63: ifeq -17 -> 46
    //   66: aload_1
    //   67: ifnull +213 -> 280
    //   70: new 31	java/io/FileInputStream
    //   73: dup
    //   74: aload 5
    //   76: invokespecial 34	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   79: astore 7
    //   81: aload 7
    //   83: invokevirtual 356	java/io/FileInputStream:available	()I
    //   86: newarray <illegal type>
    //   88: astore 6
    //   90: aload 7
    //   92: aload 6
    //   94: invokevirtual 360	java/io/FileInputStream:read	([B)I
    //   97: pop
    //   98: aload 7
    //   100: invokevirtual 361	java/io/FileInputStream:close	()V
    //   103: aload 6
    //   105: aload_1
    //   106: iconst_0
    //   107: bipush 16
    //   109: invokevirtual 365	java/lang/String:substring	(II)Ljava/lang/String;
    //   112: invokestatic 370	com/ireadercity/b2/b/t:b	([BLjava/lang/String;)V
    //   115: new 196	java/lang/String
    //   118: dup
    //   119: aload 6
    //   121: ldc_w 372
    //   124: invokespecial 374	java/lang/String:<init>	([BLjava/lang/String;)V
    //   127: pop
    //   128: new 44	java/lang/StringBuilder
    //   131: dup
    //   132: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   135: aload 5
    //   137: invokevirtual 378	java/io/File:getAbsoluteFile	()Ljava/io/File;
    //   140: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   143: ldc_w 383
    //   146: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: aload 6
    //   154: invokestatic 388	com/ireadercity/b2/h/n:a	(Ljava/lang/String;[B)Ljava/io/File;
    //   157: pop
    //   158: new 390	java/io/BufferedReader
    //   161: dup
    //   162: new 392	java/io/FileReader
    //   165: dup
    //   166: new 44	java/lang/StringBuilder
    //   169: dup
    //   170: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   173: aload_0
    //   174: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: ldc_w 383
    //   180: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   186: invokespecial 393	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   189: invokespecial 396	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   192: astore_0
    //   193: iconst_0
    //   194: istore_2
    //   195: aload_0
    //   196: invokevirtual 399	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   199: astore_1
    //   200: aload_1
    //   201: ifnull -155 -> 46
    //   204: aload_1
    //   205: ldc_w 401
    //   208: invokevirtual 405	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   211: astore 6
    //   213: aload 6
    //   215: arraylength
    //   216: istore 4
    //   218: iconst_0
    //   219: istore_3
    //   220: iload_3
    //   221: iload 4
    //   223: if_icmpge +96 -> 319
    //   226: aload 6
    //   228: iload_3
    //   229: aaload
    //   230: astore 5
    //   232: aload 5
    //   234: ldc_w 407
    //   237: invokevirtual 411	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   240: iconst_m1
    //   241: if_icmpeq +60 -> 301
    //   244: iconst_1
    //   245: istore_3
    //   246: aload 5
    //   248: astore_1
    //   249: iload_3
    //   250: istore_2
    //   251: iload_3
    //   252: ifeq -57 -> 195
    //   255: aload_1
    //   256: ldc_w 413
    //   259: invokevirtual 405	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   262: iconst_1
    //   263: aaload
    //   264: areturn
    //   265: astore_1
    //   266: aload_1
    //   267: invokevirtual 414	java/lang/Exception:printStackTrace	()V
    //   270: goto -155 -> 115
    //   273: astore_0
    //   274: aload_0
    //   275: invokevirtual 338	java/io/FileNotFoundException:printStackTrace	()V
    //   278: aconst_null
    //   279: areturn
    //   280: new 390	java/io/BufferedReader
    //   283: dup
    //   284: new 392	java/io/FileReader
    //   287: dup
    //   288: aload_0
    //   289: invokespecial 393	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   292: invokespecial 396	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   295: astore_0
    //   296: iconst_0
    //   297: istore_2
    //   298: goto -103 -> 195
    //   301: iload_3
    //   302: iconst_1
    //   303: iadd
    //   304: istore_3
    //   305: goto -85 -> 220
    //   308: astore_0
    //   309: aload_0
    //   310: invokevirtual 219	java/io/IOException:printStackTrace	()V
    //   313: aconst_null
    //   314: areturn
    //   315: astore_1
    //   316: goto -158 -> 158
    //   319: iload_2
    //   320: istore_3
    //   321: goto -72 -> 249
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	324	0	paramString1	String
    //   0	324	1	paramString2	String
    //   194	126	2	i	int
    //   219	102	3	j	int
    //   216	8	4	k	int
    //   56	191	5	localFile	File
    //   88	139	6	localObject	Object
    //   79	20	7	localFileInputStream	FileInputStream
    // Exception table:
    //   from	to	target	type
    //   103	115	265	java/lang/Exception
    //   70	103	273	java/io/FileNotFoundException
    //   103	115	273	java/io/FileNotFoundException
    //   115	128	273	java/io/FileNotFoundException
    //   128	158	273	java/io/FileNotFoundException
    //   158	193	273	java/io/FileNotFoundException
    //   195	200	273	java/io/FileNotFoundException
    //   204	218	273	java/io/FileNotFoundException
    //   232	244	273	java/io/FileNotFoundException
    //   255	265	273	java/io/FileNotFoundException
    //   266	270	273	java/io/FileNotFoundException
    //   280	296	273	java/io/FileNotFoundException
    //   70	103	308	java/io/IOException
    //   103	115	308	java/io/IOException
    //   115	128	308	java/io/IOException
    //   128	158	308	java/io/IOException
    //   158	193	308	java/io/IOException
    //   195	200	308	java/io/IOException
    //   204	218	308	java/io/IOException
    //   232	244	308	java/io/IOException
    //   255	265	308	java/io/IOException
    //   266	270	308	java/io/IOException
    //   280	296	308	java/io/IOException
    //   128	158	315	java/lang/Exception
  }
  
  private static ArrayList<HashMap<String, String>> a(String paramString1, String paramString2, Context paramContext)
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = new File(paramString1);
      if (((File)localObject2).exists())
      {
        localObject1 = new BufferedInputStream(new FileInputStream((File)localObject2));
        localObject2 = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
        paramString1 = new o(paramContext, paramString2, paramString1);
        ((XMLReader)localObject2).setContentHandler(paramString1);
        ((XMLReader)localObject2).parse(new InputSource((InputStream)localObject1));
        localObject1 = paramString1.a();
      }
      return (ArrayList<HashMap<String, String>>)localObject1;
    }
    catch (FileNotFoundException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    catch (IOException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    catch (ParserConfigurationException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    catch (SAXException paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  private static ArrayList<HashMap<String, String>> a(String paramString, ArrayList<HashMap<String, String>> paramArrayList, HashMap<String, HashMap<String, String>> paramHashMap)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramArrayList != null) && (paramHashMap != null))
    {
      paramArrayList = paramArrayList.iterator();
      int i = 0;
      while (paramArrayList.hasNext())
      {
        Object localObject = (HashMap)paramArrayList.next();
        HashMap localHashMap = new HashMap();
        if (localObject != null)
        {
          localObject = (String)((HashMap)localObject).get("id");
          localHashMap.put("ID", paramString);
          localObject = (Map)paramHashMap.get(localObject);
          if (localObject != null)
          {
            localHashMap.put("title", ((Map)localObject).get("title"));
            localHashMap.put("src", ((Map)localObject).get("src"));
            localHashMap.put("order", i);
            localHashMap.put("playOrder", i);
            localHashMap.put("NavLevel", "0");
            localArrayList.add(localHashMap);
            i += 1;
          }
        }
      }
    }
    return localArrayList;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */