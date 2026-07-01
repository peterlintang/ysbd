package com.tencent.mm.sdk.openapi;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.c;

public class WXTextObject
  implements q
{
  public String text;
  
  public WXTextObject()
  {
    this(null);
  }
  
  public WXTextObject(String paramString)
  {
    this.text = paramString;
  }
  
  public boolean checkArgs()
  {
    if ((this.text == null) || (this.text.length() == 0) || (this.text.length() > 10240))
    {
      c.a("MicroMsg.SDK.WXTextObject", "checkArgs fail, text is invalid");
      return false;
    }
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    paramBundle.putString("_wxtextobject_text", this.text);
  }
  
  public int type()
  {
    return 1;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    this.text = paramBundle.getString("_wxtextobject_text");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\openapi\WXTextObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */