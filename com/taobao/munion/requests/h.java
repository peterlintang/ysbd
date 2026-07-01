package com.taobao.munion.requests;

import com.taobao.munion.net.k;
import com.taobao.munion.utils.b;

public class h
  extends k
{
  public h(String paramString)
  {
    c("com.taobao.alimama.favorite.findFavorite");
    a("itemId", paramString);
    a("type", 1L);
    a("isSync", -1L);
    a("imageSize", b.a());
  }
  
  public h(String paramString, int paramInt1, int paramInt2)
  {
    c("com.taobao.alimama.favorite.findFavorite");
    a("itemId", paramString);
    a("toPage", paramInt1);
    a("isSync", paramInt2);
    a("type", 1L);
    a("imageSize", b.a());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\requests\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */