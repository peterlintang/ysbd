package com.umeng.socialize.bean;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socom.Log;

public class o
{
  public static final int a = 200;
  public static final int b = 5027;
  public static final int c = 5028;
  public static final int d = 5016;
  public static final int e = 505;
  public static final int f = -101;
  public static final int g = -102;
  public static final int h = -103;
  public static final int i = -104;
  public static final int j = -105;
  
  public static int a(Context paramContext, int paramInt, String paramString)
  {
    if (paramInt == 200) {
      Log.e("SOCIAL", "call show error msg but error_code is " + paramInt);
    }
    do
    {
      return paramInt;
      if (paramInt == 505)
      {
        if (SocializeConstants.SHOW_ERROR_CODE) {}
        for (paramString = " [" + paramInt + "]";; paramString = "")
        {
          Toast.makeText(paramContext, paramContext.getString(b.a(paramContext, b.a.e, "umeng_socialize_tip_blacklist")) + paramString, 1).show();
          return paramInt;
        }
      }
      if ((paramInt == 5027) || (5028 == paramInt))
      {
        Toast.makeText(paramContext, "授权失效，请重新授权。。", 0).show();
        return paramInt;
      }
      if (paramInt == 5016)
      {
        Toast.makeText(paramContext, "分享内容重复。", 0).show();
        return paramInt;
      }
    } while (TextUtils.isEmpty(paramString));
    Toast.makeText(paramContext, paramString + " [" + paramInt + "]", 1).show();
    return paramInt;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */