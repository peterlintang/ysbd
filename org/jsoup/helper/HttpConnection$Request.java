package org.jsoup.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Request;
import org.jsoup.parser.Parser;

public class HttpConnection$Request
  extends HttpConnection.Base<Connection.Request>
  implements Connection.Request
{
  private Collection<Connection.KeyVal> data = new ArrayList();
  private boolean followRedirects = true;
  private boolean ignoreContentType = false;
  private boolean ignoreHttpErrors = false;
  private Parser parser;
  private int timeoutMilliseconds = 3000;
  
  private HttpConnection$Request()
  {
    super(null);
    this.method = Connection.Method.GET;
    this.headers.put("Accept-Encoding", "gzip");
    this.parser = Parser.htmlParser();
  }
  
  public Collection<Connection.KeyVal> data()
  {
    return this.data;
  }
  
  public Request data(Connection.KeyVal paramKeyVal)
  {
    Validate.notNull(paramKeyVal, "Key val must not be null");
    this.data.add(paramKeyVal);
    return this;
  }
  
  public Connection.Request followRedirects(boolean paramBoolean)
  {
    this.followRedirects = paramBoolean;
    return this;
  }
  
  public boolean followRedirects()
  {
    return this.followRedirects;
  }
  
  public Connection.Request ignoreContentType(boolean paramBoolean)
  {
    this.ignoreContentType = paramBoolean;
    return this;
  }
  
  public boolean ignoreContentType()
  {
    return this.ignoreContentType;
  }
  
  public Connection.Request ignoreHttpErrors(boolean paramBoolean)
  {
    this.ignoreHttpErrors = paramBoolean;
    return this;
  }
  
  public boolean ignoreHttpErrors()
  {
    return this.ignoreHttpErrors;
  }
  
  public Request parser(Parser paramParser)
  {
    this.parser = paramParser;
    return this;
  }
  
  public Parser parser()
  {
    return this.parser;
  }
  
  public int timeout()
  {
    return this.timeoutMilliseconds;
  }
  
  public Request timeout(int paramInt)
  {
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      Validate.isTrue(bool, "Timeout milliseconds must be 0 (infinite) or greater");
      this.timeoutMilliseconds = paramInt;
      return this;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\helper\HttpConnection$Request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */