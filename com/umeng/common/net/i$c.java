package com.umeng.common.net;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.umeng.common.Log;
import java.io.File;
import java.io.IOException;

class i$c
  extends AsyncTask<Object, Integer, Drawable>
{
  private Context a;
  private String b;
  private ImageView c;
  private i.b d;
  private boolean e;
  private i.a f;
  private Animation g;
  private boolean h;
  
  public i$c(Context paramContext, ImageView paramImageView, String paramString, i.b paramb, boolean paramBoolean1, i.a parama, Animation paramAnimation, boolean paramBoolean2)
  {
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
    if (i.a) {}
    try
    {
      Thread.sleep(3000L);
      i.a(this.a, this.b);
      localObject = null;
    }
    catch (InterruptedException paramVarArgs)
    {
      for (;;)
      {
        try
        {
          Object localObject;
          File localFile = i.b(this.a, this.b);
          paramVarArgs = (Object[])localObject;
          if (localFile != null)
          {
            paramVarArgs = (Object[])localObject;
            if (localFile.exists()) {
              paramVarArgs = i.a(localFile.getAbsolutePath());
            }
          }
          return paramVarArgs;
        }
        catch (IOException paramVarArgs)
        {
          Log.e(i.a(), paramVarArgs.toString());
        }
        paramVarArgs = paramVarArgs;
        paramVarArgs.printStackTrace();
      }
    }
    return null;
  }
  
  protected void a(Drawable paramDrawable)
  {
    i.a(this.a, this.c, paramDrawable, this.e, this.f, this.g, this.h);
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if (this.f != null) {
      this.f.a(this.d);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\i$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */