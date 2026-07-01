package com.umeng.socom.net;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.umeng.socom.Log;
import com.umeng.socom.b;
import com.umeng.socom.b.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Stack;
import java.util.WeakHashMap;

public class p
{
  public static boolean a = false;
  private static final String b = p.class.getName();
  private static final long c = 104857600L;
  private static final long d = 10485760L;
  private static final Map<ImageView, String> e = Collections.synchronizedMap(new WeakHashMap());
  
  private static Bitmap a(Bitmap paramBitmap)
  {
    try
    {
      Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      Paint localPaint = new Paint();
      Rect localRect = new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
      RectF localRectF = new RectF(localRect);
      localPaint.setAntiAlias(true);
      localCanvas.drawARGB(0, 0, 0, 0);
      localPaint.setColor(-12434878);
      localCanvas.drawRoundRect(localRectF, paramBitmap.getWidth() / 6, paramBitmap.getHeight() / 6, localPaint);
      localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      localCanvas.drawBitmap(paramBitmap, localRect, localRect, localPaint);
      paramBitmap.recycle();
      return localBitmap;
    }
    catch (OutOfMemoryError paramBitmap)
    {
      Log.e(b, "Cant`t create round corner bitmap. [OutOfMemoryError] ");
    }
    return null;
  }
  
  public static String a(Context paramContext, String paramString)
  {
    if (g.c(paramString)) {
      return null;
    }
    for (;;)
    {
      Object localObject;
      byte[] arrayOfByte;
      int i;
      try
      {
        localObject = b(paramString) + ".tmp";
        if (b.b())
        {
          paramContext = Environment.getExternalStorageDirectory().getCanonicalPath();
          l = 104857600L;
          paramContext = new File(paramContext + "/download/.um");
          if (!paramContext.exists()) {
            continue;
          }
          if (b(paramContext.getCanonicalFile()) > l) {
            new Thread(new q(paramContext)).start();
          }
          localObject = new File(paramContext, (String)localObject);
        }
      }
      catch (Exception paramContext)
      {
        long l;
        InputStream localInputStream;
        localObject = null;
      }
      try
      {
        ((File)localObject).createNewFile();
        paramContext = new FileOutputStream((File)localObject);
        localInputStream = (InputStream)new URL(paramString).openConnection().getContent();
        arrayOfByte = new byte['က'];
        i = localInputStream.read(arrayOfByte);
        if (i != -1) {
          break label392;
        }
        paramContext.flush();
        localInputStream.close();
        paramContext.close();
        paramContext = new File(((File)localObject).getParent(), ((File)localObject).getName().replace(".tmp", ""));
        ((File)localObject).renameTo(paramContext);
        Log.a(b, "download img[" + paramString + "]  to " + paramContext.getCanonicalPath());
        paramContext = paramContext.getCanonicalPath();
        return paramContext;
      }
      catch (Exception paramContext)
      {
        label392:
        for (;;) {}
      }
      paramContext = paramContext.getCacheDir().getCanonicalPath();
      l = 10485760L;
      continue;
      if (!paramContext.mkdirs())
      {
        Log.b(b, "Failed to create directory" + paramContext.getAbsolutePath() + ". Check permission. Make sure WRITE_EXTERNAL_STORAGE is added in your Manifest.xml");
        continue;
        Log.a(b, paramContext.getStackTrace().toString() + "\t url:\t" + g.a + paramString);
        if ((localObject != null) && (((File)localObject).exists())) {
          ((File)localObject).deleteOnExit();
        }
        return null;
        paramContext.write(arrayOfByte, 0, i);
      }
    }
  }
  
  public static void a(Context paramContext, ImageView paramImageView, String paramString, boolean paramBoolean)
  {
    a(paramContext, paramImageView, paramString, paramBoolean, null, null, false);
  }
  
  public static void a(Context paramContext, ImageView paramImageView, String paramString, boolean paramBoolean, p.a parama)
  {
    a(paramContext, paramImageView, paramString, paramBoolean, parama, null, false);
  }
  
  public static void a(Context paramContext, ImageView paramImageView, String paramString, boolean paramBoolean, p.a parama, Animation paramAnimation)
  {
    a(paramContext, paramImageView, paramString, paramBoolean, parama, null, false);
  }
  
  public static void a(Context paramContext, ImageView paramImageView, String paramString, boolean paramBoolean1, p.a parama, Animation paramAnimation, boolean paramBoolean2)
  {
    if (paramImageView == null) {}
    do
    {
      return;
      e.put(paramImageView, paramString);
      try
      {
        File localFile = b(paramContext, paramString);
        if ((localFile == null) || (!localFile.exists()) || (a)) {
          break;
        }
        if (parama != null) {
          parama.a(p.b.a);
        }
        Drawable localDrawable = c(localFile.getAbsolutePath());
        if (localDrawable == null) {
          localFile.delete();
        }
        b(paramContext, paramImageView, localDrawable, paramBoolean1, parama, paramAnimation, paramBoolean2, paramString);
        return;
      }
      catch (Exception paramContext)
      {
        Log.b(b, "", paramContext);
      }
    } while (parama == null);
    parama.a(o.a.b);
    return;
    new p.c(paramContext, paramImageView, paramString, p.b.b, null, paramBoolean1, parama, paramAnimation, paramBoolean2).execute(new Object[0]);
  }
  
  private static boolean a(ImageView paramImageView, String paramString)
  {
    paramImageView = (String)e.get(paramImageView);
    return (paramImageView != null) && (!paramImageView.equals(paramString));
  }
  
  private static long b(File paramFile)
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
  
  protected static File b(Context paramContext, String paramString)
  {
    paramString = b(paramString);
    if (b.b()) {}
    for (paramContext = Environment.getExternalStorageDirectory().getCanonicalPath();; paramContext = paramContext.getCacheDir().getCanonicalPath())
    {
      paramContext = new File(new File(paramContext + "/download/.um"), paramString);
      if (!paramContext.exists()) {
        break;
      }
      return paramContext;
    }
    return null;
  }
  
  private static String b(String paramString)
  {
    int i = paramString.lastIndexOf(".");
    if (i >= 0) {
      paramString.substring(i);
    }
    return g.a(paramString);
  }
  
  private static void b(Context paramContext, ImageView paramImageView, Drawable paramDrawable, boolean paramBoolean1, p.a parama, Animation paramAnimation, boolean paramBoolean2, String paramString)
  {
    paramContext = paramDrawable;
    if (paramBoolean2)
    {
      paramContext = paramDrawable;
      if (paramDrawable == null) {}
    }
    for (;;)
    {
      try
      {
        paramContext = new BitmapDrawable(a(((BitmapDrawable)paramDrawable).getBitmap()));
      }
      catch (Exception paramContext)
      {
        Log.b(b, "bind failed", paramContext);
        if (parama == null) {
          continue;
        }
        parama.a(o.a.b);
        continue;
      }
      finally {}
      if (parama != null) {
        parama.a(o.a.b);
      }
      Log.e(b, "bind drawable failed. drawable [" + paramContext + "]  imageView[+" + paramImageView + "+]");
      return;
      if (a(paramImageView, paramString))
      {
        if (parama != null) {
          parama.a(o.a.b);
        }
      }
      else
      {
        if (paramBoolean1) {
          paramImageView.setBackgroundDrawable(paramContext);
        }
        for (;;)
        {
          if (paramAnimation != null) {
            paramImageView.startAnimation(paramAnimation);
          }
          if (parama == null) {
            break;
          }
          parama.a(o.a.a);
          break;
          paramImageView.setImageDrawable(paramContext);
        }
        if (paramContext != null) {
          if (paramImageView != null) {}
        }
      }
    }
  }
  
  private static Drawable c(String paramString)
  {
    try
    {
      paramString = Drawable.createFromPath(paramString);
      return paramString;
    }
    catch (OutOfMemoryError paramString)
    {
      Log.e(b, "Resutil fetchImage OutOfMemoryError:" + paramString.toString());
    }
    return null;
  }
  
  private static void c(File paramFile)
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
      c(paramFile[i]);
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */