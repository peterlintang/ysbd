package com.umeng.socom.net;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.umeng.socom.Log;
import java.io.File;

class p$c
  extends AsyncTask<Object, Integer, Drawable>
{
  private Context a;
  private String b;
  private ImageView c;
  private p.b d;
  private boolean e;
  private p.a f;
  private Animation g;
  private boolean h;
  private File i;
  
  public p$c(Context paramContext, ImageView paramImageView, String paramString, p.b paramb, File paramFile, boolean paramBoolean1, p.a parama, Animation paramAnimation, boolean paramBoolean2)
  {
    this.i = paramFile;
    this.a = paramContext;
    this.b = paramString;
    this.f = parama;
    this.d = paramb;
    this.e = paramBoolean1;
    this.g = paramAnimation;
    this.c = paramImageView;
    this.h = paramBoolean2;
  }
  
  protected Drawable a(Object... paramVarArgs)
  {
    if (p.a) {}
    try
    {
      Thread.sleep(3000L);
      if ((this.i != null) && (this.i.exists()))
      {
        paramVarArgs = p.a(this.i.getAbsolutePath());
        if (paramVarArgs == null) {
          this.i.delete();
        }
        Log.c(p.a(), "get drawable from cacheFile.");
        return paramVarArgs;
      }
    }
    catch (InterruptedException paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs.printStackTrace();
      }
    }
    for (;;)
    {
      try
      {
        p.a(this.a, this.b);
        paramVarArgs = p.b(this.a, this.b);
        if ((paramVarArgs != null) && (paramVarArgs.exists()))
        {
          paramVarArgs = p.a(paramVarArgs.getAbsolutePath());
          Log.c(p.a(), "get drawable from net else file.");
          return paramVarArgs;
        }
      }
      catch (Exception paramVarArgs)
      {
        Log.e(p.a(), paramVarArgs.toString(), paramVarArgs);
        return null;
      }
      paramVarArgs = null;
    }
  }
  
  protected void a(Drawable paramDrawable)
  {
    p.a(this.a, this.c, paramDrawable, this.e, this.f, this.g, this.h, this.b);
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if (this.f != null) {
      this.f.a(this.d);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\p$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */