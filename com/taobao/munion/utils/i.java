package com.taobao.munion.utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class i
{
  public static int a(Fragment paramFragment, String paramString, int paramInt)
  {
    int i = -1;
    paramFragment = paramFragment.getArguments();
    if (paramFragment != null) {
      i = paramFragment.getInt(paramString, paramInt);
    }
    return i;
  }
  
  public static String a(Fragment paramFragment, String paramString)
  {
    String str = "";
    Bundle localBundle = paramFragment.getArguments();
    paramFragment = str;
    if (localBundle != null) {
      paramFragment = localBundle.getString(paramString);
    }
    return paramFragment;
  }
  
  public static String a(Fragment paramFragment, String paramString1, String paramString2)
  {
    String str = "";
    Bundle localBundle = paramFragment.getArguments();
    paramFragment = str;
    if (localBundle != null) {
      paramFragment = localBundle.getString(paramString1, paramString2);
    }
    return paramFragment;
  }
  
  public static int b(Fragment paramFragment, String paramString)
  {
    int i = -1;
    paramFragment = paramFragment.getArguments();
    if (paramFragment != null) {
      i = paramFragment.getInt(paramString);
    }
    return i;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */