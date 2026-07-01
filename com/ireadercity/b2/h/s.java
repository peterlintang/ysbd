package com.ireadercity.b2.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.ireadercity.b2.a;
import java.io.File;

public final class s
{
  public static String a(String paramString)
  {
    paramString = y.i(paramString);
    return a.o + "/" + paramString + ".pngx";
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    return paramContext.getSharedPreferences("showhelp", 0).getBoolean(paramString, true);
  }
  
  public static boolean a(File paramFile)
  {
    if (paramFile != null) {}
    for (;;)
    {
      int i;
      try
      {
        if ((!paramFile.exists()) || (!paramFile.isDirectory())) {
          break label88;
        }
        File[] arrayOfFile = paramFile.listFiles();
        i = 0;
        if (i < arrayOfFile.length) {
          if (arrayOfFile[i].isDirectory())
          {
            a(arrayOfFile[i]);
            arrayOfFile[i].delete();
          }
          else if (arrayOfFile[i].isFile())
          {
            arrayOfFile[i].delete();
          }
        }
      }
      catch (Exception paramFile)
      {
        paramFile.printStackTrace();
        return false;
      }
      paramFile.delete();
      label88:
      return true;
      i += 1;
    }
  }
  
  public static void b(Context paramContext, String paramString)
  {
    paramContext.getSharedPreferences("showhelp", 0).edit().putBoolean(paramString, false).commit();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */