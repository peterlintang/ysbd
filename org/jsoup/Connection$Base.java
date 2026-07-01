package org.jsoup;

import java.net.URL;
import java.util.Map;

public abstract interface Connection$Base<T extends Base>
{
  public abstract String cookie(String paramString);
  
  public abstract T cookie(String paramString1, String paramString2);
  
  public abstract Map<String, String> cookies();
  
  public abstract boolean hasCookie(String paramString);
  
  public abstract boolean hasHeader(String paramString);
  
  public abstract String header(String paramString);
  
  public abstract T header(String paramString1, String paramString2);
  
  public abstract Map<String, String> headers();
  
  public abstract T method(Connection.Method paramMethod);
  
  public abstract Connection.Method method();
  
  public abstract T removeCookie(String paramString);
  
  public abstract T removeHeader(String paramString);
  
  public abstract URL url();
  
  public abstract T url(URL paramURL);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\Connection$Base.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */