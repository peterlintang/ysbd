package com.taobao.munion.filecache;

import android.app.Application;
import android.os.Environment;
import com.taobao.munion.utils.g;
import java.io.File;

public class e
  extends com.taobao.munion.utils.e
{
  private static e d;
  private String b = null;
  private String c = null;
  private String e = "tmpcache";
  private String f = "filedir";
  private String g = "filepool";
  
  protected e(Application paramApplication) {}
  
  public static e a(Application paramApplication)
  {
    try
    {
      if (d == null) {
        d = new e(paramApplication);
      }
      d.b(paramApplication);
      paramApplication = d;
      return paramApplication;
    }
    finally {}
  }
  
  public static void a()
  {
    try
    {
      if (d != null)
      {
        d.b();
        d = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void a(String paramString1, boolean paramBoolean, String paramString2)
  {
    if (paramBoolean)
    {
      if (this.b != null)
      {
        paramString1 = new File(this.b, paramString1).getAbsolutePath();
        b(paramString2 + paramString1);
      }
      return;
    }
    paramString1 = new File(this.c, paramString1).getAbsolutePath();
    b(paramString2 + paramString1);
  }
  
  private void b(Application paramApplication)
  {
    if (g.b()) {
      this.b = (Environment.getExternalStorageDirectory().toString() + "/" + paramApplication.getPackageName());
    }
    if (paramApplication.getFilesDir() != null) {
      this.c = paramApplication.getFilesDir().getAbsolutePath();
    }
  }
  
  public d a(String paramString, boolean paramBoolean)
  {
    d locald = null;
    if (paramBoolean) {
      if (this.b != null)
      {
        paramString = new File(this.b, paramString).getAbsolutePath();
        locald = (d)super.b(this.g + paramString, Boolean.valueOf(paramBoolean));
      }
    }
    while (this.c == null) {
      return locald;
    }
    paramString = new File(this.c, paramString).getAbsolutePath();
    return (d)super.b(this.g + paramString, Boolean.valueOf(paramBoolean));
  }
  
  protected Object a(String paramString, Object paramObject)
  {
    if (paramString.indexOf(this.e) == 0) {
      return new k(new String(paramString.substring(this.e.length())), (Boolean)paramObject);
    }
    if (paramString.indexOf(this.f) == 0) {
      return new f(new String(paramString.substring(this.f.length())), (Boolean)paramObject);
    }
    return new d(new String(paramString.substring(this.g.length())), (Boolean)paramObject);
  }
  
  public void b(String paramString, boolean paramBoolean)
  {
    a(paramString, paramBoolean, this.g);
  }
  
  public f c(String paramString, boolean paramBoolean)
  {
    f localf = null;
    if (paramBoolean) {
      if (this.b != null)
      {
        paramString = new File(this.b, paramString).getAbsolutePath();
        localf = (f)super.b(this.f + paramString, Boolean.valueOf(paramBoolean));
      }
    }
    while (this.c == null) {
      return localf;
    }
    paramString = new File(this.c, paramString).getAbsolutePath();
    return (f)super.b(this.f + paramString, Boolean.valueOf(paramBoolean));
  }
  
  public void d(String paramString, boolean paramBoolean)
  {
    a(paramString, paramBoolean, this.f);
  }
  
  public k e(String paramString, boolean paramBoolean)
  {
    k localk = null;
    if (paramBoolean) {
      if (this.b != null)
      {
        paramString = new File(this.b, paramString).getAbsolutePath();
        localk = (k)super.b(this.e + paramString, Boolean.valueOf(paramBoolean));
      }
    }
    while (this.c == null) {
      return localk;
    }
    paramString = new File(this.c, paramString).getAbsolutePath();
    return (k)super.b(this.e + paramString, Boolean.valueOf(paramBoolean));
  }
  
  public void f(String paramString, boolean paramBoolean)
  {
    a(paramString, paramBoolean, this.e);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\filecache\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */