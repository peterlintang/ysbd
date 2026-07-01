package com.umeng.socialize.bean;

import com.umeng.socialize.controller.listener.SocializeListeners.OnCustomPlatformClickListener;

public class CustomPlatform
{
  public SocializeListeners.OnCustomPlatformClickListener clickListener;
  public int grayIcon;
  public int icon;
  public String showWord;
  public String tag;
  
  public CustomPlatform(String paramString, int paramInt)
  {
    this.showWord = paramString;
    this.icon = paramInt;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\CustomPlatform.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */