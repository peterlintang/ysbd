package com.ireadercity.b2.opds;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public final class a
{
  public static InputStream a(String paramString)
  {
    paramString = new URL(paramString);
    try
    {
      paramString = paramString.openConnection();
      paramString.connect();
      paramString = paramString.getInputStream();
      return paramString;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\opds\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */