package com.taobao.munion.common;

public class ProductEnvVariableBox
  implements IEnvVariableBox
{
  public String getAppKey()
  {
    return "21575933";
  }
  
  public String getAppSecret()
  {
    return "085acec05f412d48255618ef2d757e0a";
  }
  
  public String getHost()
  {
    return "http://fav.simba.taobao.com/api.htm?";
  }
  
  public String getTopHost()
  {
    return null;
  }
  
  public String getTopOauthHost()
  {
    return "https://oauth.taobao.com/authorize?response_type=code&view=wap&";
  }
  
  public String getTopOauthRedirectUrl()
  {
    return "http://www.oauth.net";
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\common\ProductEnvVariableBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */