package com.umeng.common.net;

import android.os.Bundle;

class a$a
{
  public String a;
  public String b;
  public String c;
  
  public a$a(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
  }
  
  public static a a(Bundle paramBundle)
  {
    return new a(paramBundle.getString("mComponentName"), paramBundle.getString("mTitle"), paramBundle.getString("mUrl"));
  }
  
  public Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("mComponentName", this.a);
    localBundle.putString("mTitle", this.b);
    localBundle.putString("mUrl", this.c);
    return localBundle;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */