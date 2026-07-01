package com.umeng.common.ufp.net;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.umeng.common.ufp.Log;
import java.io.File;

abstract class g$d
  extends AsyncTask<Object, Integer, Drawable>
{
  private Context a;
  private String b;
  private File c;
  int h = 0;
  
  public g$d(Context paramContext, String paramString, File paramFile)
  {
    this.c = paramFile;
    this.a = paramContext;
    this.b = paramString;
  }
  
  protected Drawable a(Object... paramVarArgs)
  {
    if (g.a) {}
    try
    {
      Thread.sleep(3000L);
      if (1 == this.h)
      {
        paramVarArgs = g.a(this.c.getAbsolutePath());
        if (paramVarArgs == null) {
          this.c.delete();
        }
        Log.c(g.a(), "get drawable from cacheFile.");
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
        g.a(this.a, this.b);
        paramVarArgs = g.b(this.a, this.b);
        if ((paramVarArgs != null) && (paramVarArgs.exists()))
        {
          paramVarArgs = g.a(paramVarArgs.getAbsolutePath());
          Log.c(g.a(), "get drawable from net else file.");
          return paramVarArgs;
        }
      }
      catch (Exception paramVarArgs)
      {
        Log.e(g.a(), paramVarArgs.toString(), paramVarArgs);
        return null;
      }
      paramVarArgs = null;
    }
  }
  
  public abstract void a(Drawable paramDrawable);
  
  protected void b(Drawable paramDrawable)
  {
    a(paramDrawable);
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if ((this.c != null) && (this.c.exists())) {
      this.h = 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\g$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */