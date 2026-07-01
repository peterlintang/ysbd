package com.ireadercity.b2.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.widget.ImageView;
import com.ireadercity.b2.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Stack;

public final class g
{
  public static Bitmap a;
  public static Bitmap b;
  public boolean c = true;
  public ArrayList<Thread> d = new ArrayList();
  private File e;
  private k f = new k(this, (byte)0);
  private int g = 1;
  
  public g(Context paramContext, int paramInt)
  {
    this.g = paramInt;
    if (Environment.getExternalStorageState().equals("mounted")) {
      Environment.getExternalStorageDirectory();
    }
    for (this.e = new File(a.p);; this.e = paramContext.getCacheDir())
    {
      if (!this.e.exists()) {
        this.e.mkdirs();
      }
      return;
    }
  }
  
  public static Bitmap a(Context paramContext)
  {
    if ((a == null) || (a.isRecycled())) {}
    try
    {
      a = BitmapFactory.decodeResource(paramContext.getResources(), 2130837602);
      return a;
    }
    catch (OutOfMemoryError paramContext)
    {
      for (;;)
      {
        a = null;
        paramContext.printStackTrace();
        a.d();
      }
    }
  }
  
  /* Error */
  private Bitmap a(File paramFile)
  {
    // Byte code:
    //   0: new 118	java/lang/StringBuilder
    //   3: dup
    //   4: ldc 120
    //   6: invokespecial 121	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   9: aload_1
    //   10: invokevirtual 124	java/io/File:getPath	()Ljava/lang/String;
    //   13: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   19: pop
    //   20: new 133	java/io/FileInputStream
    //   23: dup
    //   24: aload_1
    //   25: invokespecial 136	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   28: astore_3
    //   29: new 138	android/graphics/BitmapFactory$Options
    //   32: dup
    //   33: invokespecial 139	android/graphics/BitmapFactory$Options:<init>	()V
    //   36: astore_1
    //   37: aload_1
    //   38: iconst_0
    //   39: putfield 142	android/graphics/BitmapFactory$Options:inDither	Z
    //   42: aload_1
    //   43: iconst_1
    //   44: putfield 145	android/graphics/BitmapFactory$Options:inPurgeable	Z
    //   47: aload_1
    //   48: bipush 16
    //   50: aload_0
    //   51: getfield 39	com/ireadercity/b2/b/g:g	I
    //   54: idiv
    //   55: sipush 1024
    //   58: imul
    //   59: newarray <illegal type>
    //   61: putfield 149	android/graphics/BitmapFactory$Options:inTempStorage	[B
    //   64: aload_1
    //   65: aload_0
    //   66: getfield 39	com/ireadercity/b2/b/g:g	I
    //   69: putfield 152	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   72: aload_3
    //   73: invokevirtual 156	java/io/FileInputStream:getFD	()Ljava/io/FileDescriptor;
    //   76: aconst_null
    //   77: aload_1
    //   78: invokestatic 160	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   81: astore_1
    //   82: aload_3
    //   83: invokevirtual 163	java/io/FileInputStream:close	()V
    //   86: aload_1
    //   87: areturn
    //   88: astore_2
    //   89: aconst_null
    //   90: astore_1
    //   91: aload_2
    //   92: invokevirtual 164	java/lang/Exception:printStackTrace	()V
    //   95: aload_1
    //   96: areturn
    //   97: astore_2
    //   98: aconst_null
    //   99: astore_3
    //   100: aconst_null
    //   101: astore_1
    //   102: aload_3
    //   103: ifnull +7 -> 110
    //   106: aload_3
    //   107: invokevirtual 163	java/io/FileInputStream:close	()V
    //   110: invokestatic 109	com/ireadercity/b2/a:d	()V
    //   113: aload_2
    //   114: invokevirtual 107	java/lang/OutOfMemoryError:printStackTrace	()V
    //   117: aload_1
    //   118: areturn
    //   119: astore_3
    //   120: goto -10 -> 110
    //   123: astore_2
    //   124: aconst_null
    //   125: astore_1
    //   126: goto -24 -> 102
    //   129: astore_2
    //   130: goto -28 -> 102
    //   133: astore_2
    //   134: goto -43 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	g
    //   0	137	1	paramFile	File
    //   88	4	2	localException1	Exception
    //   97	17	2	localOutOfMemoryError1	OutOfMemoryError
    //   123	1	2	localOutOfMemoryError2	OutOfMemoryError
    //   129	1	2	localOutOfMemoryError3	OutOfMemoryError
    //   133	1	2	localException2	Exception
    //   28	79	3	localFileInputStream	java.io.FileInputStream
    //   119	1	3	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   20	29	88	java/lang/Exception
    //   29	82	88	java/lang/Exception
    //   20	29	97	java/lang/OutOfMemoryError
    //   106	110	119	java/lang/Exception
    //   29	82	123	java/lang/OutOfMemoryError
    //   82	86	129	java/lang/OutOfMemoryError
    //   82	86	133	java/lang/Exception
  }
  
  /* Error */
  public static Bitmap a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 6
    //   9: aload 4
    //   11: astore_2
    //   12: aload 5
    //   14: astore_3
    //   15: new 118	java/lang/StringBuilder
    //   18: dup
    //   19: ldc -90
    //   21: invokespecial 121	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   24: aload_0
    //   25: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   31: pop
    //   32: new 133	java/io/FileInputStream
    //   35: dup
    //   36: new 59	java/io/File
    //   39: dup
    //   40: aload_0
    //   41: invokespecial 68	java/io/File:<init>	(Ljava/lang/String;)V
    //   44: invokespecial 136	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   47: astore_1
    //   48: aload_1
    //   49: astore_0
    //   50: new 138	android/graphics/BitmapFactory$Options
    //   53: dup
    //   54: invokespecial 139	android/graphics/BitmapFactory$Options:<init>	()V
    //   57: astore_2
    //   58: aload_1
    //   59: astore_0
    //   60: aload_2
    //   61: iconst_0
    //   62: putfield 142	android/graphics/BitmapFactory$Options:inDither	Z
    //   65: aload_1
    //   66: astore_0
    //   67: aload_2
    //   68: iconst_1
    //   69: putfield 145	android/graphics/BitmapFactory$Options:inPurgeable	Z
    //   72: aload_1
    //   73: astore_0
    //   74: aload_2
    //   75: sipush 16384
    //   78: newarray <illegal type>
    //   80: putfield 149	android/graphics/BitmapFactory$Options:inTempStorage	[B
    //   83: aload_1
    //   84: astore_0
    //   85: aload_2
    //   86: iconst_1
    //   87: putfield 152	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   90: aload_1
    //   91: astore_0
    //   92: aload_1
    //   93: invokevirtual 156	java/io/FileInputStream:getFD	()Ljava/io/FileDescriptor;
    //   96: aconst_null
    //   97: aload_2
    //   98: invokestatic 160	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   101: astore_2
    //   102: aload_2
    //   103: astore_0
    //   104: aload_0
    //   105: astore_2
    //   106: aload_0
    //   107: astore_3
    //   108: aload_1
    //   109: invokevirtual 163	java/io/FileInputStream:close	()V
    //   112: aload_0
    //   113: areturn
    //   114: astore_2
    //   115: aconst_null
    //   116: astore_1
    //   117: aload_1
    //   118: astore_0
    //   119: aload_2
    //   120: invokevirtual 164	java/lang/Exception:printStackTrace	()V
    //   123: aload 6
    //   125: astore_0
    //   126: aload_1
    //   127: ifnull -15 -> 112
    //   130: aload 4
    //   132: astore_2
    //   133: aload 5
    //   135: astore_3
    //   136: aload_1
    //   137: invokevirtual 163	java/io/FileInputStream:close	()V
    //   140: aconst_null
    //   141: areturn
    //   142: astore_0
    //   143: aload_0
    //   144: invokevirtual 164	java/lang/Exception:printStackTrace	()V
    //   147: aload_2
    //   148: areturn
    //   149: astore_2
    //   150: aconst_null
    //   151: astore_1
    //   152: aload_1
    //   153: astore_0
    //   154: invokestatic 109	com/ireadercity/b2/a:d	()V
    //   157: aload_1
    //   158: astore_0
    //   159: aload_2
    //   160: invokevirtual 107	java/lang/OutOfMemoryError:printStackTrace	()V
    //   163: aload 6
    //   165: astore_0
    //   166: aload_1
    //   167: ifnull -55 -> 112
    //   170: aload 4
    //   172: astore_2
    //   173: aload 5
    //   175: astore_3
    //   176: aload_1
    //   177: invokevirtual 163	java/io/FileInputStream:close	()V
    //   180: aconst_null
    //   181: areturn
    //   182: astore_0
    //   183: aload_0
    //   184: invokevirtual 107	java/lang/OutOfMemoryError:printStackTrace	()V
    //   187: invokestatic 109	com/ireadercity/b2/a:d	()V
    //   190: invokestatic 109	com/ireadercity/b2/a:d	()V
    //   193: invokestatic 109	com/ireadercity/b2/a:d	()V
    //   196: aload_3
    //   197: areturn
    //   198: astore_1
    //   199: aconst_null
    //   200: astore_0
    //   201: aload_0
    //   202: ifnull +13 -> 215
    //   205: aload 4
    //   207: astore_2
    //   208: aload 5
    //   210: astore_3
    //   211: aload_0
    //   212: invokevirtual 163	java/io/FileInputStream:close	()V
    //   215: aload 4
    //   217: astore_2
    //   218: aload 5
    //   220: astore_3
    //   221: aload_1
    //   222: athrow
    //   223: astore_1
    //   224: goto -23 -> 201
    //   227: astore_2
    //   228: goto -76 -> 152
    //   231: astore_2
    //   232: goto -115 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	paramString	String
    //   47	130	1	localFileInputStream	java.io.FileInputStream
    //   198	24	1	localObject1	Object
    //   223	1	1	localObject2	Object
    //   11	95	2	localObject3	Object
    //   114	6	2	localException1	Exception
    //   132	16	2	localObject4	Object
    //   149	11	2	localOutOfMemoryError1	OutOfMemoryError
    //   172	46	2	localObject5	Object
    //   227	1	2	localOutOfMemoryError2	OutOfMemoryError
    //   231	1	2	localException2	Exception
    //   14	207	3	localObject6	Object
    //   1	215	4	localObject7	Object
    //   4	215	5	localObject8	Object
    //   7	157	6	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   32	48	114	java/lang/Exception
    //   15	32	142	java/lang/Exception
    //   108	112	142	java/lang/Exception
    //   136	140	142	java/lang/Exception
    //   176	180	142	java/lang/Exception
    //   211	215	142	java/lang/Exception
    //   221	223	142	java/lang/Exception
    //   32	48	149	java/lang/OutOfMemoryError
    //   15	32	182	java/lang/OutOfMemoryError
    //   108	112	182	java/lang/OutOfMemoryError
    //   136	140	182	java/lang/OutOfMemoryError
    //   176	180	182	java/lang/OutOfMemoryError
    //   211	215	182	java/lang/OutOfMemoryError
    //   221	223	182	java/lang/OutOfMemoryError
    //   32	48	198	finally
    //   50	58	223	finally
    //   60	65	223	finally
    //   67	72	223	finally
    //   74	83	223	finally
    //   85	90	223	finally
    //   92	102	223	finally
    //   119	123	223	finally
    //   154	157	223	finally
    //   159	163	223	finally
    //   50	58	227	java/lang/OutOfMemoryError
    //   60	65	227	java/lang/OutOfMemoryError
    //   67	72	227	java/lang/OutOfMemoryError
    //   74	83	227	java/lang/OutOfMemoryError
    //   85	90	227	java/lang/OutOfMemoryError
    //   92	102	227	java/lang/OutOfMemoryError
    //   50	58	231	java/lang/Exception
    //   60	65	231	java/lang/Exception
    //   67	72	231	java/lang/Exception
    //   74	83	231	java/lang/Exception
    //   85	90	231	java/lang/Exception
    //   92	102	231	java/lang/Exception
  }
  
  public static boolean a(Bitmap paramBitmap, ImageView paramImageView)
  {
    if (paramBitmap == null) {
      return false;
    }
    try
    {
      int i = paramImageView.getWidth();
      paramImageView.getHeight();
      int j = paramBitmap.getWidth();
      new StringBuilder("BitMap.size w=").append(paramBitmap.getWidth()).append(" h=").append(paramBitmap.getHeight()).append(" imageView=").append(paramImageView.getWidth()).append(" h=").append(paramImageView.getHeight()).toString();
      if ((i != 0) && (j > 1.5D * i))
      {
        paramImageView.setImageBitmap(Bitmap.createScaledBitmap(paramBitmap, paramImageView.getWidth(), paramImageView.getHeight(), false));
        paramBitmap.recycle();
      }
      else
      {
        paramImageView.setImageBitmap(paramBitmap);
      }
    }
    catch (Exception paramBitmap)
    {
      paramBitmap.printStackTrace();
      return false;
    }
    return true;
  }
  
  public static boolean a(File paramFile, ImageView paramImageView)
  {
    if (!paramFile.exists()) {
      return false;
    }
    try
    {
      int i = paramImageView.getWidth();
      paramImageView.getHeight();
      paramFile = BitmapFactory.decodeFile(paramFile.getPath());
      int j = paramFile.getWidth();
      new StringBuilder("coverFile.size w=").append(paramFile.getWidth()).append(" h=").append(paramFile.getHeight()).append(" imageView=").append(paramImageView.getWidth()).append(" h=").append(paramImageView.getHeight()).toString();
      if ((i != 0) && (j > 1.5D * i))
      {
        paramImageView.setImageBitmap(Bitmap.createScaledBitmap(paramFile, paramImageView.getWidth(), paramImageView.getHeight(), false));
        paramFile.recycle();
      }
      else
      {
        paramImageView.setImageBitmap(paramFile);
      }
    }
    catch (Exception paramFile)
    {
      paramFile.printStackTrace();
      return false;
    }
    return true;
  }
  
  public static Bitmap b(Context paramContext)
  {
    if ((b == null) || (b.isRecycled())) {}
    try
    {
      b = BitmapFactory.decodeResource(paramContext.getResources(), 2130837552);
      return b;
    }
    catch (OutOfMemoryError paramContext)
    {
      for (;;)
      {
        b = null;
        paramContext.printStackTrace();
        a.d();
      }
    }
  }
  
  /* Error */
  private Bitmap b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: aload_1
    //   4: ldc -44
    //   6: invokevirtual 216	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   9: iconst_1
    //   10: iadd
    //   11: aload_1
    //   12: invokevirtual 219	java/lang/String:length	()I
    //   15: invokevirtual 223	java/lang/String:substring	(II)Ljava/lang/String;
    //   18: astore_2
    //   19: new 118	java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial 224	java/lang/StringBuilder:<init>	()V
    //   26: aload_2
    //   27: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: ldc -30
    //   32: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: astore_2
    //   39: new 59	java/io/File
    //   42: dup
    //   43: aload_0
    //   44: getfield 70	com/ireadercity/b2/b/g:e	Ljava/io/File;
    //   47: aload_2
    //   48: invokespecial 229	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   51: astore 6
    //   53: aload 6
    //   55: invokevirtual 74	java/io/File:exists	()Z
    //   58: ifne +131 -> 189
    //   61: aload_1
    //   62: astore_2
    //   63: aload_1
    //   64: ldc -25
    //   66: invokevirtual 235	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   69: ifne +24 -> 93
    //   72: new 118	java/lang/StringBuilder
    //   75: dup
    //   76: invokespecial 224	java/lang/StringBuilder:<init>	()V
    //   79: getstatic 238	com/ireadercity/b2/a:A	Ljava/lang/String;
    //   82: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: aload_1
    //   86: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: astore_2
    //   93: new 240	java/net/URL
    //   96: dup
    //   97: aload_2
    //   98: invokespecial 241	java/net/URL:<init>	(Ljava/lang/String;)V
    //   101: invokevirtual 245	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   104: checkcast 247	java/net/HttpURLConnection
    //   107: astore_1
    //   108: aload_1
    //   109: invokevirtual 251	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   112: invokestatic 255	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   115: astore_2
    //   116: new 257	java/io/FileOutputStream
    //   119: dup
    //   120: aload 6
    //   122: invokespecial 258	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   125: astore 5
    //   127: aload 5
    //   129: astore_3
    //   130: aload 6
    //   132: invokevirtual 124	java/io/File:getPath	()Ljava/lang/String;
    //   135: invokevirtual 261	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   138: ldc_w 263
    //   141: invokevirtual 266	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   144: ifeq +52 -> 196
    //   147: aload 5
    //   149: astore_3
    //   150: aload_2
    //   151: getstatic 272	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   154: bipush 50
    //   156: aload 5
    //   158: invokevirtual 276	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   161: pop
    //   162: aload_1
    //   163: astore 4
    //   165: aload_2
    //   166: astore_3
    //   167: aload 5
    //   169: invokevirtual 277	java/io/FileOutputStream:close	()V
    //   172: aload_1
    //   173: astore 4
    //   175: aload_2
    //   176: astore_3
    //   177: aload_2
    //   178: invokevirtual 201	android/graphics/Bitmap:recycle	()V
    //   181: aload_1
    //   182: ifnull +7 -> 189
    //   185: aload_1
    //   186: invokevirtual 280	java/net/HttpURLConnection:disconnect	()V
    //   189: aload_0
    //   190: aload 6
    //   192: invokespecial 282	com/ireadercity/b2/b/g:a	(Ljava/io/File;)Landroid/graphics/Bitmap;
    //   195: areturn
    //   196: aload 5
    //   198: astore_3
    //   199: aload_2
    //   200: getstatic 285	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   203: bipush 50
    //   205: aload 5
    //   207: invokevirtual 276	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   210: pop
    //   211: goto -49 -> 162
    //   214: astore 4
    //   216: aload 5
    //   218: astore_3
    //   219: aload 4
    //   221: invokevirtual 164	java/lang/Exception:printStackTrace	()V
    //   224: aload 5
    //   226: ifnull -54 -> 172
    //   229: aload_1
    //   230: astore 4
    //   232: aload_2
    //   233: astore_3
    //   234: aload 5
    //   236: invokevirtual 277	java/io/FileOutputStream:close	()V
    //   239: goto -67 -> 172
    //   242: astore_3
    //   243: goto -71 -> 172
    //   246: astore 5
    //   248: aconst_null
    //   249: astore 6
    //   251: aload 6
    //   253: ifnull +13 -> 266
    //   256: aload_1
    //   257: astore 4
    //   259: aload_2
    //   260: astore_3
    //   261: aload 6
    //   263: invokevirtual 277	java/io/FileOutputStream:close	()V
    //   266: aload_1
    //   267: astore 4
    //   269: aload_2
    //   270: astore_3
    //   271: aload 5
    //   273: athrow
    //   274: astore_3
    //   275: aload_3
    //   276: invokevirtual 164	java/lang/Exception:printStackTrace	()V
    //   279: aload_1
    //   280: ifnull +7 -> 287
    //   283: aload_1
    //   284: invokevirtual 280	java/net/HttpURLConnection:disconnect	()V
    //   287: aload_2
    //   288: ifnull +7 -> 295
    //   291: aload_2
    //   292: invokevirtual 201	android/graphics/Bitmap:recycle	()V
    //   295: aconst_null
    //   296: areturn
    //   297: astore_1
    //   298: aconst_null
    //   299: astore_2
    //   300: aconst_null
    //   301: astore_1
    //   302: aload_1
    //   303: astore 4
    //   305: aload_2
    //   306: astore_3
    //   307: invokestatic 109	com/ireadercity/b2/a:d	()V
    //   310: aload_1
    //   311: ifnull +7 -> 318
    //   314: aload_1
    //   315: invokevirtual 280	java/net/HttpURLConnection:disconnect	()V
    //   318: aload_2
    //   319: ifnull +7 -> 326
    //   322: aload_2
    //   323: invokevirtual 201	android/graphics/Bitmap:recycle	()V
    //   326: aconst_null
    //   327: areturn
    //   328: astore_2
    //   329: aconst_null
    //   330: astore_1
    //   331: aload_1
    //   332: ifnull +7 -> 339
    //   335: aload_1
    //   336: invokevirtual 280	java/net/HttpURLConnection:disconnect	()V
    //   339: aload_3
    //   340: ifnull +7 -> 347
    //   343: aload_3
    //   344: invokevirtual 201	android/graphics/Bitmap:recycle	()V
    //   347: aload_2
    //   348: athrow
    //   349: astore_3
    //   350: goto -178 -> 172
    //   353: astore_3
    //   354: goto -88 -> 266
    //   357: astore_2
    //   358: goto -27 -> 331
    //   361: astore_2
    //   362: aload 4
    //   364: astore_1
    //   365: goto -34 -> 331
    //   368: astore 4
    //   370: aload_2
    //   371: astore_3
    //   372: aload 4
    //   374: astore_2
    //   375: goto -44 -> 331
    //   378: astore_2
    //   379: aconst_null
    //   380: astore_2
    //   381: goto -79 -> 302
    //   384: astore_3
    //   385: goto -83 -> 302
    //   388: astore_3
    //   389: aconst_null
    //   390: astore_2
    //   391: aconst_null
    //   392: astore_1
    //   393: goto -118 -> 275
    //   396: astore_3
    //   397: aconst_null
    //   398: astore_2
    //   399: goto -124 -> 275
    //   402: astore 5
    //   404: aload_3
    //   405: astore 6
    //   407: goto -156 -> 251
    //   410: astore 4
    //   412: aconst_null
    //   413: astore 5
    //   415: goto -199 -> 216
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	418	0	this	g
    //   0	418	1	paramString	String
    //   18	305	2	localObject1	Object
    //   328	20	2	localObject2	Object
    //   357	1	2	localObject3	Object
    //   361	10	2	localObject4	Object
    //   374	1	2	localObject5	Object
    //   378	1	2	localOutOfMemoryError1	OutOfMemoryError
    //   380	19	2	localObject6	Object
    //   1	233	3	localObject7	Object
    //   242	1	3	localException1	Exception
    //   260	11	3	localObject8	Object
    //   274	2	3	localException2	Exception
    //   306	38	3	localObject9	Object
    //   349	1	3	localException3	Exception
    //   353	1	3	localException4	Exception
    //   371	1	3	localObject10	Object
    //   384	1	3	localOutOfMemoryError2	OutOfMemoryError
    //   388	1	3	localException5	Exception
    //   396	9	3	localException6	Exception
    //   163	11	4	str1	String
    //   214	6	4	localException7	Exception
    //   230	133	4	str2	String
    //   368	5	4	localObject11	Object
    //   410	1	4	localException8	Exception
    //   125	110	5	localFileOutputStream	java.io.FileOutputStream
    //   246	26	5	localObject12	Object
    //   402	1	5	localObject13	Object
    //   413	1	5	localObject14	Object
    //   51	355	6	localObject15	Object
    // Exception table:
    //   from	to	target	type
    //   130	147	214	java/lang/Exception
    //   150	162	214	java/lang/Exception
    //   199	211	214	java/lang/Exception
    //   234	239	242	java/lang/Exception
    //   116	127	246	finally
    //   177	181	274	java/lang/Exception
    //   271	274	274	java/lang/Exception
    //   63	93	297	java/lang/OutOfMemoryError
    //   93	108	297	java/lang/OutOfMemoryError
    //   63	93	328	finally
    //   93	108	328	finally
    //   167	172	349	java/lang/Exception
    //   261	266	353	java/lang/Exception
    //   108	116	357	finally
    //   167	172	361	finally
    //   177	181	361	finally
    //   234	239	361	finally
    //   261	266	361	finally
    //   271	274	361	finally
    //   307	310	361	finally
    //   275	279	368	finally
    //   108	116	378	java/lang/OutOfMemoryError
    //   167	172	384	java/lang/OutOfMemoryError
    //   177	181	384	java/lang/OutOfMemoryError
    //   234	239	384	java/lang/OutOfMemoryError
    //   261	266	384	java/lang/OutOfMemoryError
    //   271	274	384	java/lang/OutOfMemoryError
    //   63	93	388	java/lang/Exception
    //   93	108	388	java/lang/Exception
    //   108	116	396	java/lang/Exception
    //   130	147	402	finally
    //   150	162	402	finally
    //   199	211	402	finally
    //   219	224	402	finally
    //   116	127	410	java/lang/Exception
  }
  
  private void b(String paramString, ImageView arg2)
  {
    this.f.a(???);
    m localm = new m(this, paramString, ???);
    new StringBuilder("queueImage=").append(paramString).toString();
    synchronized (k.a(this.f))
    {
      k.a(this.f).push(localm);
      k.a(this.f).notifyAll();
      new StringBuilder("notifyAll Main").append(Thread.currentThread().getId()).append("=").append(paramString).append(" imageQueue.imageRefs=").append(k.a(this.f).hashCode()).toString();
      if (this.c)
      {
        int i = 0;
        if (i < 4)
        {
          paramString = new Thread(new l(this, (byte)0));
          paramString.setPriority(4);
          if (paramString.getState() == Thread.State.NEW) {
            paramString.start();
          }
          this.d.add(paramString);
          i += 1;
        }
      }
    }
  }
  
  public final void a(String paramString, Context paramContext, ImageView paramImageView, j paramj)
  {
    Object localObject = paramString.substring(paramString.lastIndexOf("/") + 1, paramString.length());
    localObject = (String)localObject + "x";
    localObject = new File(this.e, (String)localObject);
    if (((File)localObject).exists())
    {
      a((File)localObject, paramImageView);
      return;
    }
    b(paramString, paramImageView);
    switch (h.a[paramj.ordinal()])
    {
    default: 
      paramImageView.setImageBitmap(a(paramContext));
      return;
    case 1: 
      paramImageView.setImageBitmap(a(paramContext));
      return;
    }
    paramImageView.setImageResource(2130837704);
  }
  
  public final void a(String paramString, ImageView paramImageView)
  {
    Object localObject = paramString.substring(paramString.lastIndexOf("/") + 1, paramString.length());
    localObject = (String)localObject + "x";
    localObject = new File(this.e, (String)localObject);
    if (((File)localObject).exists())
    {
      a((File)localObject, paramImageView);
      return;
    }
    b(paramString, paramImageView);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */