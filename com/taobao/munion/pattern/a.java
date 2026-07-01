package com.taobao.munion.pattern;

import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class a
{
  public static final int a = 5;
  public static final int b = 20;
  public static final long c = 30000L;
  public static final long d = 1000L;
  public static final int e = 4;
  public static final int f = 3;
  public static final String g = "lockscreen.password_type";
  private static final String h = "LockPatternUtils";
  private static final String i = "/system/gesture.key";
  private static final String j = "/system/password.key";
  private static String n;
  private static String o;
  private final Context k;
  private final ContentResolver l;
  private DevicePolicyManager m;
  
  public a(Context paramContext)
  {
    this.k = paramContext;
    this.l = paramContext.getContentResolver();
    if (n == null)
    {
      n = Environment.getDataDirectory().getAbsolutePath() + "/system/gesture.key";
      o = Environment.getDataDirectory().getAbsolutePath() + "/system/password.key";
    }
  }
  
  public static String a(List<LockPatternView.a> paramList)
  {
    if (paramList == null) {
      return "";
    }
    int i2 = paramList.size();
    byte[] arrayOfByte = new byte[i2];
    int i1 = 0;
    while (i1 < i2)
    {
      LockPatternView.a locala = (LockPatternView.a)paramList.get(i1);
      int i3 = locala.a();
      arrayOfByte[i1] = ((byte)(locala.b() + i3 * 3));
      i1 += 1;
    }
    return a(arrayOfByte);
  }
  
  public static final String a(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i1 = 0;
    while (i1 < paramArrayOfByte.length)
    {
      localStringBuffer.append(paramArrayOfByte[i1]);
      i1 += 1;
    }
    return localStringBuffer.toString();
  }
  
  public static List<LockPatternView.a> a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.getBytes();
    int i1 = 0;
    while (i1 < paramString.length)
    {
      int i2 = paramString[i1];
      localArrayList.add(LockPatternView.a.a(i2 / 3, i2 % 3));
      i1 += 1;
    }
    return localArrayList;
  }
  
  public DevicePolicyManager a()
  {
    if (this.m == null)
    {
      this.m = ((DevicePolicyManager)this.k.getSystemService("device_policy"));
      if (this.m == null) {
        new IllegalStateException("Stack trace:");
      }
    }
    return this.m;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\pattern\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */