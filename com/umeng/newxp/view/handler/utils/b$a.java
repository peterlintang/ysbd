package com.umeng.newxp.view.handler.utils;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import java.io.File;

public class b$a
{
  public int a = 5120;
  public int b = 10485760;
  public File c;
  public Bitmap.CompressFormat d = b.f();
  public int e = 70;
  public boolean f = true;
  public boolean g = true;
  public boolean h = false;
  
  public b$a(Context paramContext, String paramString)
  {
    this.c = b.a(paramContext, paramString);
  }
  
  public void a(float paramFloat)
  {
    if ((paramFloat < 0.05F) || (paramFloat > 0.8F)) {
      throw new IllegalArgumentException("setMemCacheSizePercent - percent must be between 0.05 and 0.8 (inclusive)");
    }
    this.a = Math.round((float)Runtime.getRuntime().maxMemory() * paramFloat / 1024.0F);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */