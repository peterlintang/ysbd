package com.umeng.newxp.net;

import com.umeng.common.ufp.net.i;
import com.umeng.common.ufp.util.g;
import java.net.URL;

public abstract class a
  extends i
{
  String d = "3961067BBD610B2D8FA189B89398C4F9";
  
  public a(String paramString)
  {
    super(paramString);
  }
  
  public String e()
  {
    try
    {
      Object localObject = b() + "&secret=" + this.d;
      String str = new URL((String)localObject).getPath();
      String[] arrayOfString = ((String)localObject).split(str);
      localObject = str;
      if (arrayOfString != null)
      {
        int i = 1;
        for (;;)
        {
          localObject = str;
          if (i >= arrayOfString.length) {
            break;
          }
          str = str + arrayOfString[i];
          i += 1;
        }
      }
      str = g.a((String)localObject).toUpperCase();
      return str;
    }
    catch (Exception localException) {}
    return "";
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */