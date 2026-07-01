package com.umeng.socialize.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Environment;
import com.umeng.socom.Log;
import com.umeng.socom.b;
import com.umeng.socom.b.g;
import java.io.File;
import java.util.Date;
import java.util.Stack;

public class j
{
  public static boolean a = false;
  private static final String b = j.class.getName();
  private static final long c = 104857600L;
  private static final long d = 10485760L;
  private static final String e = "/download/.um/";
  
  private static long a(File paramFile)
  {
    long l1 = 0L;
    long l2 = l1;
    if (paramFile != null)
    {
      l2 = l1;
      if (paramFile.exists())
      {
        if (paramFile.isDirectory()) {
          break label32;
        }
        l2 = l1;
      }
    }
    return l2;
    label32:
    Stack localStack = new Stack();
    localStack.clear();
    localStack.push(paramFile);
    int i;
    do
    {
      l2 = l1;
      if (localStack.isEmpty()) {
        break;
      }
      paramFile = ((File)localStack.pop()).listFiles();
      i = 0;
      l2 = l1;
      l1 = l2;
    } while (i >= paramFile.length);
    if (paramFile[i].isDirectory()) {
      localStack.push(paramFile[i]);
    }
    for (;;)
    {
      i += 1;
      break;
      l2 += paramFile[i].length();
    }
  }
  
  public static String a(Context paramContext, String paramString)
  {
    if (g.c(paramString)) {}
    Object localObject;
    do
    {
      return null;
      for (;;)
      {
        try
        {
          localObject = a(paramString) + ".tmp";
          if (b.b())
          {
            paramContext = Environment.getExternalStorageDirectory().getCanonicalPath();
            l = 104857600L;
            paramContext = new File(paramContext + "/download/.um/");
            if (!paramContext.exists()) {
              continue;
            }
            if (a(paramContext.getCanonicalFile()) > l) {
              b(paramContext);
            }
            localObject = new File(paramContext, (String)localObject);
          }
        }
        catch (Exception paramContext)
        {
          long l;
          localObject = null;
        }
        try
        {
          ((File)localObject).createNewFile();
          a(paramString, (File)localObject);
          paramContext = new File(((File)localObject).getParent(), ((File)localObject).getName().replace(".tmp", ""));
          ((File)localObject).renameTo(paramContext);
          Log.a(b, "download img[" + paramString + "]  to " + paramContext.getCanonicalPath());
          paramContext = paramContext.getCanonicalPath();
          return paramContext;
        }
        catch (Exception paramContext)
        {
          for (;;) {}
        }
        paramContext = paramContext.getCacheDir().getCanonicalPath();
        l = 10485760L;
        continue;
        if (!paramContext.mkdirs()) {
          Log.b(b, "Failed to create directory" + paramContext.getAbsolutePath() + ". Check permission. Make sure WRITE_EXTERNAL_STORAGE is added in your Manifest.xml");
        }
      }
      Log.a(b, paramContext.getStackTrace().toString() + "\t url:\t" + g.a + paramString);
    } while ((localObject == null) || (!((File)localObject).exists()));
    ((File)localObject).deleteOnExit();
    return null;
  }
  
  private static String a(String paramString)
  {
    return g.a(paramString);
  }
  
  /* Error */
  private static void a(String paramString, File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aconst_null
    //   6: astore 5
    //   8: new 194	java/io/FileOutputStream
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 196	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   16: astore_1
    //   17: aload 4
    //   19: astore_3
    //   20: aload_1
    //   21: astore 4
    //   23: new 198	java/net/URL
    //   26: dup
    //   27: aload_0
    //   28: invokespecial 199	java/net/URL:<init>	(Ljava/lang/String;)V
    //   31: invokevirtual 203	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   34: invokevirtual 208	java/net/URLConnection:getContent	()Ljava/lang/Object;
    //   37: checkcast 210	java/io/InputStream
    //   40: astore_0
    //   41: sipush 4096
    //   44: newarray <illegal type>
    //   46: astore_3
    //   47: aload_0
    //   48: aload_3
    //   49: invokevirtual 214	java/io/InputStream:read	([B)I
    //   52: istore_2
    //   53: iload_2
    //   54: iconst_m1
    //   55: if_icmpne +20 -> 75
    //   58: aload_1
    //   59: invokevirtual 217	java/io/FileOutputStream:flush	()V
    //   62: aload_0
    //   63: ifnull +11 -> 74
    //   66: aload_0
    //   67: invokevirtual 220	java/io/InputStream:close	()V
    //   70: aload_1
    //   71: invokevirtual 221	java/io/FileOutputStream:close	()V
    //   74: return
    //   75: aload_1
    //   76: aload_3
    //   77: iconst_0
    //   78: iload_2
    //   79: invokevirtual 225	java/io/FileOutputStream:write	([BII)V
    //   82: goto -35 -> 47
    //   85: astore 4
    //   87: aload_0
    //   88: astore_3
    //   89: aload 4
    //   91: astore_0
    //   92: aload_1
    //   93: astore 4
    //   95: new 227	java/lang/RuntimeException
    //   98: dup
    //   99: aload_0
    //   100: invokespecial 230	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   103: athrow
    //   104: astore_0
    //   105: aload 4
    //   107: astore_1
    //   108: aload_3
    //   109: ifnull +15 -> 124
    //   112: aload_3
    //   113: invokevirtual 220	java/io/InputStream:close	()V
    //   116: aload_1
    //   117: ifnull +7 -> 124
    //   120: aload_1
    //   121: invokevirtual 221	java/io/FileOutputStream:close	()V
    //   124: aload_0
    //   125: athrow
    //   126: astore_3
    //   127: aload_1
    //   128: ifnull -4 -> 124
    //   131: aload_1
    //   132: invokevirtual 221	java/io/FileOutputStream:close	()V
    //   135: goto -11 -> 124
    //   138: astore_1
    //   139: goto -15 -> 124
    //   142: astore_0
    //   143: aload_1
    //   144: ifnull +7 -> 151
    //   147: aload_1
    //   148: invokevirtual 221	java/io/FileOutputStream:close	()V
    //   151: aload_0
    //   152: athrow
    //   153: astore_0
    //   154: aload_1
    //   155: invokevirtual 221	java/io/FileOutputStream:close	()V
    //   158: return
    //   159: astore_0
    //   160: return
    //   161: astore_0
    //   162: aload_1
    //   163: invokevirtual 221	java/io/FileOutputStream:close	()V
    //   166: aload_0
    //   167: athrow
    //   168: astore_1
    //   169: goto -18 -> 151
    //   172: astore_1
    //   173: goto -49 -> 124
    //   176: astore_1
    //   177: goto -11 -> 166
    //   180: astore_0
    //   181: return
    //   182: astore_0
    //   183: aconst_null
    //   184: astore_1
    //   185: goto -77 -> 108
    //   188: astore 4
    //   190: aload_0
    //   191: astore_3
    //   192: aload 4
    //   194: astore_0
    //   195: goto -87 -> 108
    //   198: astore_0
    //   199: aconst_null
    //   200: astore_1
    //   201: aload 5
    //   203: astore_3
    //   204: goto -112 -> 92
    //   207: astore_0
    //   208: aload 5
    //   210: astore_3
    //   211: goto -119 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	214	0	paramString	String
    //   0	214	1	paramFile	File
    //   52	27	2	i	int
    //   4	109	3	localObject1	Object
    //   126	1	3	localIOException	java.io.IOException
    //   191	20	3	localObject2	Object
    //   1	21	4	localFile1	File
    //   85	5	4	localException	Exception
    //   93	13	4	localFile2	File
    //   188	5	4	localObject3	Object
    //   6	203	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   41	47	85	java/lang/Exception
    //   47	53	85	java/lang/Exception
    //   58	62	85	java/lang/Exception
    //   75	82	85	java/lang/Exception
    //   23	41	104	finally
    //   95	104	104	finally
    //   112	116	126	java/io/IOException
    //   131	135	138	java/io/IOException
    //   112	116	142	finally
    //   66	70	153	java/io/IOException
    //   154	158	159	java/io/IOException
    //   66	70	161	finally
    //   147	151	168	java/io/IOException
    //   120	124	172	java/io/IOException
    //   162	166	176	java/io/IOException
    //   70	74	180	java/io/IOException
    //   8	17	182	finally
    //   41	47	188	finally
    //   47	53	188	finally
    //   58	62	188	finally
    //   75	82	188	finally
    //   8	17	198	java/lang/Exception
    //   23	41	207	java/lang/Exception
  }
  
  private static Bitmap b(Bitmap paramBitmap)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    Rect localRect = new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
    RectF localRectF = new RectF(localRect);
    localPaint.setAntiAlias(true);
    localCanvas.drawARGB(0, 0, 0, 0);
    localPaint.setColor(-12434878);
    if (a) {
      localCanvas.drawRoundRect(localRectF, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2, localPaint);
    }
    for (;;)
    {
      localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      localCanvas.drawBitmap(paramBitmap, localRect, localRect, localPaint);
      paramBitmap.recycle();
      return localBitmap;
      localCanvas.drawRoundRect(localRectF, paramBitmap.getWidth() / 6, paramBitmap.getHeight() / 6, localPaint);
    }
  }
  
  protected static File b(Context paramContext, String paramString)
  {
    paramString = a(paramString);
    if (b.b()) {}
    for (paramContext = Environment.getExternalStorageDirectory().getCanonicalPath();; paramContext = paramContext.getCacheDir().getCanonicalPath())
    {
      paramContext = new File(new File(paramContext + "/download/.um/"), paramString);
      if (!paramContext.exists()) {
        break;
      }
      return paramContext;
    }
    return null;
  }
  
  private static void b(File paramFile)
  {
    if ((paramFile == null) || (!paramFile.exists()) || (!paramFile.canWrite()) || (!paramFile.isDirectory())) {
      return;
    }
    paramFile = paramFile.listFiles();
    int i = 0;
    label33:
    if (i < paramFile.length)
    {
      if (!paramFile[i].isDirectory()) {
        break label61;
      }
      b(paramFile[i]);
    }
    for (;;)
    {
      i += 1;
      break label33;
      break;
      label61:
      if (new Date().getTime() - paramFile[i].lastModified() > 1800L) {
        paramFile[i].delete();
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\common\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */