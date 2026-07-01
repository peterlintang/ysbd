package org.jsoup;

import org.jsoup.nodes.Document;

public abstract interface Connection$Response
  extends Connection.Base<Response>
{
  public abstract String body();
  
  public abstract byte[] bodyAsBytes();
  
  public abstract String charset();
  
  public abstract String contentType();
  
  public abstract Document parse();
  
  public abstract int statusCode();
  
  public abstract String statusMessage();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\Connection$Response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */