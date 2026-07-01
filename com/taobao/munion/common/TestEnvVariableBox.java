package com.taobao.munion.common;

public class TestEnvVariableBox
  implements IEnvVariableBox
{
  public String getAppKey()
  {
    return "604720";
  }
  
  public String getAppSecret()
  {
    return "085acec05f412d48255618ef2d757e0a";
  }
  
  public String getHost()
  {
    return "http://10.232.135.91:18081/api.htm?";
  }
  
  public String getTopHost()
  {
    return null;
  }
  
  public String getTopOauthHost()
  {
    return "https://oauth.daily.taobao.net/authorize?response_type=code&";
  }
  
  public String getTopOauthRedirectUrl()
  {
    return "http://www.oauth.net";
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\common\TestEnvVariableBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */