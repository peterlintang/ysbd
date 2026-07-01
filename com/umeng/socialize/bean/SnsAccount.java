package com.umeng.socialize.bean;

public class SnsAccount
{
  private String a;
  private String b;
  private Gender c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  
  public SnsAccount(String paramString1, Gender paramGender, String paramString2, String paramString3)
  {
    this.b = paramString1;
    this.c = paramGender;
    this.d = paramString2;
    this.e = paramString3;
  }
  
  public String getAccount_icon_url()
  {
    return this.d;
  }
  
  public String getBirthday()
  {
    return this.g;
  }
  
  public String getExtendArgs()
  {
    return this.h;
  }
  
  public Gender getGender()
  {
    return this.c;
  }
  
  public String getPlatform()
  {
    return this.a;
  }
  
  public String getProfileUrl()
  {
    return this.f;
  }
  
  public String getUserName()
  {
    return this.b;
  }
  
  public String getUsid()
  {
    return this.e;
  }
  
  public void setAccount_icon_url(String paramString)
  {
    this.d = paramString;
  }
  
  public void setBirthday(String paramString)
  {
    this.g = paramString;
  }
  
  public void setExtendArgs(String paramString)
  {
    this.h = paramString;
  }
  
  public void setGender(Gender paramGender)
  {
    this.c = paramGender;
  }
  
  public void setPlatform(String paramString)
  {
    this.a = paramString;
  }
  
  public void setProfileUrl(String paramString)
  {
    this.f = paramString;
  }
  
  public void setUserName(String paramString)
  {
    this.b = paramString;
  }
  
  public void setUsid(String paramString)
  {
    this.e = paramString;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\SnsAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */