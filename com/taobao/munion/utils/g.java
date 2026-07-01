package com.taobao.munion.utils;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public class g
{
  public static final int a = -1;
  
  public static long a()
  {
    StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
    long l = localStatFs.getBlockSize();
    return localStatFs.getAvailableBlocks() * l;
  }
  
  public static boolean b()
  {
    String str = Environment.getExternalStorageState();
    return (str != null) && (str.equals("mounted"));
  }
  
  public static long c()
  {
    StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
    long l = localStatFs.getBlockSize();
    return localStatFs.getAvailableBlocks() * l;
  }
  
  public static long d()
  {
    if (e())
    {
      StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
      long l = localStatFs.getBlockSize();
      return localStatFs.getAvailableBlocks() * l;
    }
    return -1L;
  }
  
  public static boolean e()
  {
    return Environment.getExternalStorageState().equals("mounted");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */