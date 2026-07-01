package com.tencent.mm.sdk.openapi;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.c;

public final class p
{
  public static Bundle a(WXMediaMessage paramWXMediaMessage)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("_wxobject_sdkVer", paramWXMediaMessage.sdkVer);
    localBundle.putString("_wxobject_title", paramWXMediaMessage.title);
    localBundle.putString("_wxobject_description", paramWXMediaMessage.description);
    localBundle.putByteArray("_wxobject_thumbdata", paramWXMediaMessage.thumbData);
    if (paramWXMediaMessage.mediaObject != null)
    {
      localBundle.putString("_wxobject_identifier_", paramWXMediaMessage.mediaObject.getClass().getName());
      paramWXMediaMessage.mediaObject.serialize(localBundle);
    }
    return localBundle;
  }
  
  public static WXMediaMessage a(Bundle paramBundle)
  {
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.sdkVer = paramBundle.getInt("_wxobject_sdkVer");
    localWXMediaMessage.title = paramBundle.getString("_wxobject_title");
    localWXMediaMessage.description = paramBundle.getString("_wxobject_description");
    localWXMediaMessage.thumbData = paramBundle.getByteArray("_wxobject_thumbdata");
    String str = paramBundle.getString("_wxobject_identifier_");
    if ((str == null) || (str.length() <= 0)) {
      return localWXMediaMessage;
    }
    try
    {
      localWXMediaMessage.mediaObject = ((q)Class.forName(str).newInstance());
      localWXMediaMessage.mediaObject.unserialize(paramBundle);
      return localWXMediaMessage;
    }
    catch (Exception paramBundle)
    {
      paramBundle.printStackTrace();
      c.a("MicroMsg.SDK.WXMediaMessage", "get media object from bundle failed: unknown ident " + str);
    }
    return localWXMediaMessage;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\openapi\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */