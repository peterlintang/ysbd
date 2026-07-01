package com.umeng.socialize.common;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.umeng.socom.Log;
import java.io.File;
import java.io.IOException;

class k
  extends AsyncTask<Object, Integer, Drawable>
{
  k(j.b paramb) {}
  
  protected Drawable a(Object... paramVarArgs)
  {
    try
    {
      if (j.a) {
        Thread.sleep(3000L);
      }
      publishProgress(new Integer[] { Integer.valueOf(0) });
      j.a(this.a.a, this.a.c);
      Object localObject = null;
      Drawable localDrawable2 = null;
      paramVarArgs = (Object[])localObject;
      try
      {
        publishProgress(new Integer[] { Integer.valueOf(1) });
        paramVarArgs = (Object[])localObject;
        File localFile = j.b(this.a.a, this.a.c);
        Drawable localDrawable1 = localDrawable2;
        if (localFile != null)
        {
          localDrawable1 = localDrawable2;
          paramVarArgs = (Object[])localObject;
          if (localFile.exists())
          {
            paramVarArgs = (Object[])localObject;
            localDrawable2 = Drawable.createFromPath(localFile.getAbsolutePath());
            localDrawable1 = localDrawable2;
            if (localDrawable2 == null)
            {
              paramVarArgs = localDrawable2;
              localFile.delete();
              localDrawable1 = localDrawable2;
            }
          }
        }
        return localDrawable1;
      }
      catch (IOException localIOException)
      {
        Log.e(j.a(), localIOException.toString());
        return paramVarArgs;
      }
    }
    catch (InterruptedException paramVarArgs)
    {
      for (;;) {}
    }
  }
  
  protected void a(Drawable paramDrawable)
  {
    j.b.a(this.a, this.a.a, this.a.b, paramDrawable, this.a.i, this.a.d, this.a.f, this.a.h, this.a.e);
  }
  
  protected void a(Integer... paramVarArgs)
  {
    super.onProgressUpdate(paramVarArgs);
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0)) {}
    do
    {
      do
      {
        return;
        switch (paramVarArgs[0].intValue())
        {
        default: 
          return;
        }
      } while (this.a.d == null);
      this.a.d.a(j.c.b);
      return;
    } while (this.a.d == null);
    this.a.d.a(j.c.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\common\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */