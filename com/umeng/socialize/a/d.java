package com.umeng.socialize.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.l;
import java.util.HashMap;
import java.util.Map;

public class d
{
  private static final String a = d.class.getName();
  
  public static Map<SHARE_MEDIA, String> a(Context paramContext)
  {
    HashMap localHashMap = new HashMap();
    for (;;)
    {
      int i;
      try
      {
        SHARE_MEDIA[] arrayOfSHARE_MEDIA = SHARE_MEDIA.values();
        int j = arrayOfSHARE_MEDIA.length;
        i = 0;
        if (i >= j)
        {
          paramContext = a;
          new StringBuilder("found platform count ").append(localHashMap.size()).toString();
          return localHashMap;
        }
        SHARE_MEDIA localSHARE_MEDIA = arrayOfSHARE_MEDIA[i];
        String str1;
        if (a(paramContext, localSHARE_MEDIA))
        {
          str1 = b(paramContext, localSHARE_MEDIA);
          localHashMap.put(localSHARE_MEDIA, str1);
          String str2 = a;
          new StringBuilder("found platform ").append(localSHARE_MEDIA.toString()).append(" usid=").append(str1).toString();
        }
        else
        {
          str1 = a;
          new StringBuilder("No found oauthed platform ").append(localSHARE_MEDIA.toString()).toString();
        }
      }
      catch (NullPointerException paramContext)
      {
        paramContext = a;
        return null;
      }
      i += 1;
    }
  }
  
  public static void a(Context arg0, SHARE_MEDIA paramSHARE_MEDIA, String paramString)
  {
    synchronized (???.getSharedPreferences("umeng_socialize", 1))
    {
      Object localObject = ???.edit();
      paramSHARE_MEDIA = l.b(paramSHARE_MEDIA);
      if (!TextUtils.isEmpty(paramSHARE_MEDIA))
      {
        ((SharedPreferences.Editor)localObject).putString(paramSHARE_MEDIA, paramString);
        ((SharedPreferences.Editor)localObject).commit();
        localObject = a;
        new StringBuilder("Save platform ").append(paramSHARE_MEDIA).append("   ").append(paramString).toString();
      }
      return;
    }
  }
  
  public static void a(Context arg0, SHARE_MEDIA paramSHARE_MEDIA, String paramString1, String paramString2)
  {
    synchronized (???.getSharedPreferences("umeng_socialize", 1))
    {
      SharedPreferences.Editor localEditor = ???.edit();
      paramSHARE_MEDIA = l.b(paramSHARE_MEDIA);
      if (!TextUtils.isEmpty(paramSHARE_MEDIA))
      {
        localEditor.putString(paramSHARE_MEDIA + "_ak", paramString1);
        localEditor.putString(paramSHARE_MEDIA + "_as", paramString2);
        localEditor.commit();
        paramSHARE_MEDIA = a;
        new StringBuilder("Save access_key=").append(paramString1).append("  access_secret=").append(paramString2).toString();
      }
      return;
    }
  }
  
  public static boolean a(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA)
  {
    return !TextUtils.isEmpty(b(paramContext, paramSHARE_MEDIA));
  }
  
  public static String b(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA)
  {
    return paramContext.getSharedPreferences("umeng_socialize", 1).getString(l.b(paramSHARE_MEDIA), "");
  }
  
  public static String[] c(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA)
  {
    paramContext = paramContext.getSharedPreferences("umeng_socialize", 1);
    String str = l.b(paramSHARE_MEDIA);
    paramSHARE_MEDIA = str + "_ak";
    str = str + "_as";
    if ((paramContext.contains(paramSHARE_MEDIA)) && (paramContext.contains(str))) {
      return new String[] { paramContext.getString(paramSHARE_MEDIA, ""), paramContext.getString(str, "") };
    }
    return new String[0];
  }
  
  public static void d(Context arg0, SHARE_MEDIA paramSHARE_MEDIA)
  {
    synchronized (???.getSharedPreferences("umeng_socialize", 1))
    {
      Object localObject = ???.edit();
      ((SharedPreferences.Editor)localObject).remove(paramSHARE_MEDIA.toString());
      ((SharedPreferences.Editor)localObject).remove(paramSHARE_MEDIA.toString() + "_ak");
      ((SharedPreferences.Editor)localObject).remove(paramSHARE_MEDIA.toString() + "_as");
      ((SharedPreferences.Editor)localObject).commit();
      localObject = a;
      new StringBuilder("Remove platform ").append(paramSHARE_MEDIA.toString()).toString();
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */