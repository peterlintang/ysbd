package com.tencent.mm.sdk.openapi;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.sdk.platformtools.c;
import java.io.ByteArrayOutputStream;

public final class WXMediaMessage
{
  public static final String ACTION_WXAPPMESSAGE = "com.tencent.mm.sdk.openapi.Intent.ACTION_WXAPPMESSAGE";
  public String description;
  public q mediaObject;
  public int sdkVer;
  public byte[] thumbData;
  public String title;
  
  public WXMediaMessage()
  {
    this(null);
  }
  
  public WXMediaMessage(q paramq)
  {
    this.mediaObject = paramq;
  }
  
  final boolean checkArgs()
  {
    if ((getType() == 8) && ((this.thumbData == null) || (this.thumbData.length == 0)))
    {
      c.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, thumbData should not be null when send emoji");
      return false;
    }
    if ((this.thumbData != null) && (this.thumbData.length > 32768))
    {
      c.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, thumbData is invalid");
      return false;
    }
    if ((this.title != null) && (this.title.length() > 512))
    {
      c.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, title is invalid");
      return false;
    }
    if ((this.description != null) && (this.description.length() > 1024))
    {
      c.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, description is invalid");
      return false;
    }
    if (this.mediaObject == null)
    {
      c.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, mediaObject is null");
      return false;
    }
    return this.mediaObject.checkArgs();
  }
  
  public final int getType()
  {
    if (this.mediaObject == null) {
      return 0;
    }
    return this.mediaObject.type();
  }
  
  public final void setThumbImage(Bitmap paramBitmap)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 85, localByteArrayOutputStream);
      this.thumbData = localByteArrayOutputStream.toByteArray();
      localByteArrayOutputStream.close();
      return;
    }
    catch (Exception paramBitmap)
    {
      paramBitmap.printStackTrace();
      c.a("MicroMsg.SDK.WXMediaMessage", "put thumb failed");
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\openapi\WXMediaMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */