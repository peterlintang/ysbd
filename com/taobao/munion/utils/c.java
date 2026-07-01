package com.taobao.munion.utils;

import android.app.Application;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;

public class c
{
  public static void a(Application paramApplication)
  {
    if (paramApplication == null) {}
    do
    {
      return;
      paramApplication = paramApplication.getResources();
    } while (paramApplication == null);
    try
    {
      paramApplication.getInteger(0);
      return;
    }
    catch (Resources.NotFoundException paramApplication) {}
  }
  
  public static boolean b(Application paramApplication)
  {
    if (paramApplication == null) {}
    do
    {
      return false;
      paramApplication = paramApplication.getResources();
    } while (paramApplication == null);
    try
    {
      paramApplication.getInteger(-1);
      return true;
    }
    catch (Resources.NotFoundException paramApplication) {}
    return false;
  }
  
  public static int c(Application paramApplication)
  {
    if (paramApplication == null) {}
    do
    {
      return 0;
      paramApplication = paramApplication.getResources();
    } while (paramApplication == null);
    try
    {
      int i = paramApplication.getInteger(-2);
      return i;
    }
    catch (Resources.NotFoundException paramApplication) {}
    return 0;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */