package com.taobao.munion.requests;

import com.taobao.munion.net.k;
import com.taobao.munion.utils.b;

public class i
  extends k
{
  public static final String c = "toPage";
  public static final String d = "isSync";
  public static final String e = "orderStr";
  public static final String f = "modified_time";
  
  public i(int paramInt1, int paramInt2)
  {
    c("com.taobao.alimama.favorite.findFavorite");
    a("toPage", paramInt1);
    a("isSync", paramInt2);
    a("type", 1L);
    a("imageSize", b.a());
  }
  
  public i(int paramInt1, int paramInt2, String paramString)
  {
    c("com.taobao.alimama.favorite.findFavorite");
    a("toPage", paramInt1);
    a("isSync", paramInt2);
    a("type", 1L);
    a("imageSize", b.a());
    String str = paramString;
    if (paramString == null) {
      str = "modified_time";
    }
    a("orderStr", str);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\requests\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */