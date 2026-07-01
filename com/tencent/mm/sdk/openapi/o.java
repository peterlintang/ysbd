package com.tencent.mm.sdk.openapi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Bundle;
import com.tencent.mm.sdk.channel.MMessage;
import com.tencent.mm.sdk.channel.b;
import com.tencent.mm.sdk.platformtools.c;

final class o
  implements e
{
  private Context a;
  private String b;
  private boolean c = false;
  
  protected o(Context paramContext, String paramString)
  {
    this(paramContext, paramString, (byte)0);
  }
  
  protected o(Context paramContext, String paramString, byte paramByte)
  {
    this.a = paramContext;
    this.b = paramString;
    this.c = false;
  }
  
  private static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length == 0) || (paramArrayOfByte2 == null) || (paramArrayOfByte2.length == 0))
    {
      c.a("MicroMsg.SDK.WXApiImplV10", "checkSumConsistent fail, invalid arguments");
      return false;
    }
    if (paramArrayOfByte1.length != paramArrayOfByte2.length)
    {
      c.a("MicroMsg.SDK.WXApiImplV10", "checkSumConsistent fail, length is different");
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayOfByte1.length) {
        break label67;
      }
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i]) {
        break;
      }
      i += 1;
    }
    label67:
    return true;
  }
  
  private boolean a(Signature[] paramArrayOfSignature)
  {
    if (!this.c)
    {
      c.c("MicroMsg.SDK.WXApiImplV10", "ignore wechat app signature validation");
      return true;
    }
    int j = paramArrayOfSignature.length;
    int i = 0;
    while (i < j)
    {
      String str = paramArrayOfSignature[i].toCharsString();
      c.c("MicroMsg.SDK.WXApiImplV10", "check signature:" + str);
      if (str.equals("308202eb30820254a00302010202044d36f7a4300d06092a864886f70d01010505003081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e74301e170d3131303131393134333933325a170d3431303131313134333933325a3081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e7430819f300d06092a864886f70d010101050003818d0030818902818100c05f34b231b083fb1323670bfbe7bdab40c0c0a6efc87ef2072a1ff0d60cc67c8edb0d0847f210bea6cbfaa241be70c86daf56be08b723c859e52428a064555d80db448cdcacc1aea2501eba06f8bad12a4fa49d85cacd7abeb68945a5cb5e061629b52e3254c373550ee4e40cb7c8ae6f7a8151ccd8df582d446f39ae0c5e930203010001300d06092a864886f70d0101050500038181009c8d9d7f2f908c42081b4c764c377109a8b2c70582422125ce545842d5f520aea69550b6bd8bfd94e987b75a3077eb04ad341f481aac266e89d3864456e69fba13df018acdc168b9a19dfd7ad9d9cc6f6ace57c746515f71234df3a053e33ba93ece5cd0fc15f3e389a3f365588a9fcb439e069d3629cd7732a13fff7b891499"))
      {
        c.c("MicroMsg.SDK.WXApiImplV10", "pass");
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  private boolean b(String paramString)
  {
    if (!this.c)
    {
      c.c("MicroMsg.SDK.WXApiImplV10", "ignore wechat app signature validation");
      return true;
    }
    try
    {
      paramString = this.a.getPackageManager().getPackageInfo(paramString, 64);
      return a(paramString.signatures);
    }
    catch (PackageManager.NameNotFoundException paramString) {}
    return false;
  }
  
  public final boolean a()
  {
    try
    {
      PackageInfo localPackageInfo = this.a.getPackageManager().getPackageInfo("com.tencent.mm", 64);
      if (localPackageInfo == null) {
        return false;
      }
      boolean bool = a(localPackageInfo.signatures);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  public final boolean a(Intent paramIntent, f paramf)
  {
    if (paramIntent == null) {
      i = 0;
    }
    while (i == 0)
    {
      return false;
      str1 = paramIntent.getStringExtra("wx_token_key");
      if ((str1 == null) || (!str1.equals("com.tencent.mm.openapi.token"))) {
        i = 0;
      } else {
        i = 1;
      }
    }
    String str1 = paramIntent.getStringExtra("_mmessage_content");
    int i = paramIntent.getIntExtra("_mmessage_sdkVersion", 0);
    String str2 = paramIntent.getStringExtra("_mmessage_appPackage");
    if ((str2 == null) || (str2.length() == 0))
    {
      c.a("MicroMsg.SDK.WXApiImplV10", "invalid argument");
      return false;
    }
    byte[] arrayOfByte = paramIntent.getByteArrayExtra("_mmessage_checksum");
    StringBuffer localStringBuffer = new StringBuffer();
    if (str1 != null) {
      localStringBuffer.append(str1);
    }
    localStringBuffer.append(i);
    localStringBuffer.append(str2);
    localStringBuffer.append("mMcShCsTr");
    if (!a(arrayOfByte, com.tencent.mm.a.a.a(localStringBuffer.toString().substring(1, 9).getBytes()).getBytes()))
    {
      c.a("MicroMsg.SDK.WXApiImplV10", "checksum fail");
      return false;
    }
    switch (paramIntent.getIntExtra("_wxapi_command_type", 0))
    {
    default: 
      return false;
    case 1: 
      paramf.a(new h(paramIntent.getExtras()));
      return true;
    case 2: 
      paramf.a(new k(paramIntent.getExtras()));
      return true;
    case 3: 
      paramf.a(new d(paramIntent.getExtras()));
      return true;
    }
    paramf.a(new m(paramIntent.getExtras()));
    return true;
  }
  
  public final boolean a(a parama)
  {
    if (!b("com.tencent.mm"))
    {
      c.a("MicroMsg.SDK.WXApiImplV10", "sendReq failed for wechat app signature check failed");
      return false;
    }
    if (!parama.b())
    {
      c.a("MicroMsg.SDK.WXApiImplV10", "sendReq checkArgs fail");
      return false;
    }
    Bundle localBundle = new Bundle();
    parama.a(localBundle);
    return b.a(this.a, "com.tencent.mm", "com.tencent.mm.plugin.base.stub.WXEntryActivity", "weixin://sendreq?appid=" + this.b, localBundle);
  }
  
  public final boolean a(String paramString)
  {
    if (!b("com.tencent.mm"))
    {
      c.a("MicroMsg.SDK.WXApiImplV10", "register app failed for wechat app signature check failed");
      return false;
    }
    if (paramString != null) {
      this.b = paramString;
    }
    c.c("MicroMsg.SDK.WXApiImplV10", "register app " + this.a.getPackageName());
    MMessage.a(this.a, "com.tencent.mm", "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER", "weixin://registerapp?appid=" + this.b);
    return true;
  }
  
  public final boolean b()
  {
    boolean bool = false;
    if (!a()) {
      c.a("MicroMsg.SDK.WXApiImplV10", "open wx app failed, not installed or signature check failed");
    }
    for (int i = 0;; i = new com.tencent.mm.sdk.a(this.a).getInt("_build_info_sdk_int_", 0))
    {
      if (i >= 553910273) {
        bool = true;
      }
      return bool;
    }
  }
  
  public final boolean c()
  {
    if (!a())
    {
      c.a("MicroMsg.SDK.WXApiImplV10", "open wx app failed, not installed or signature check failed");
      return false;
    }
    try
    {
      this.a.startActivity(this.a.getPackageManager().getLaunchIntentForPackage("com.tencent.mm"));
      return true;
    }
    catch (Exception localException)
    {
      c.a("MicroMsg.SDK.WXApiImplV10", "startActivity fail, exception = " + localException.getMessage());
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\openapi\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */