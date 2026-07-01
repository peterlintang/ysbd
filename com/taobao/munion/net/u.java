package com.taobao.munion.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

class u
  extends SSLSocketFactory
{
  private SSLSocketFactory a;
  private String b;
  private int c;
  private String d;
  
  public u(String paramString1, int paramInt, SSLSocketFactory paramSSLSocketFactory, String paramString2)
  {
    this.b = paramString1;
    this.c = paramInt;
    if (paramSSLSocketFactory != null) {}
    for (this.a = paramSSLSocketFactory;; this.a = ((SSLSocketFactory)SSLSocketFactory.getDefault()))
    {
      this.d = paramString2;
      return;
    }
  }
  
  private void a(Socket paramSocket, String paramString, int paramInt)
  {
    OutputStream localOutputStream = paramSocket.getOutputStream();
    String str = "CONNECT " + paramString + ":" + paramInt + " HTTP/1.1\nUser-Agent: " + this.d + "\nHost:" + paramString + "\r\n\r\n";
    try
    {
      paramString = str.getBytes("ASCII7");
      localOutputStream.write(paramString);
      localOutputStream.flush();
      paramString = new byte['È'];
      paramSocket = paramSocket.getInputStream();
      i = 0;
      paramInt = 0;
      j = 0;
      if (paramInt < 2)
      {
        k = paramSocket.read();
        if (k < 0) {
          throw new IOException("Unexpected EOF from proxy");
        }
      }
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        int i;
        int j;
        int k;
        paramString = str.getBytes();
        continue;
        if (k == 10)
        {
          i = 1;
          paramInt += 1;
        }
        else if (k != 13)
        {
          if ((i == 0) && (j < paramString.length))
          {
            paramString[j] = ((byte)k);
            j += 1;
            paramInt = 0;
            continue;
            try
            {
              paramSocket = new String(paramString, 0, j, "ASCII7");
              if (paramSocket.toLowerCase().indexOf("200 connection established") == -1) {
                throw new IOException("Unable to tunnel through " + this.b + ":" + this.c + ".  Proxy returns \"" + paramSocket + "\"");
              }
            }
            catch (UnsupportedEncodingException paramSocket)
            {
              for (;;)
              {
                paramSocket = new String(paramString, 0, j);
              }
            }
          }
          else
          {
            paramInt = 0;
          }
        }
      }
    }
  }
  
  public Socket createSocket(String paramString, int paramInt)
  {
    return createSocket(null, paramString, paramInt, true);
  }
  
  public Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2)
  {
    return createSocket(null, paramString, paramInt1, true);
  }
  
  public Socket createSocket(InetAddress paramInetAddress, int paramInt)
  {
    return createSocket(null, paramInetAddress.getHostName(), paramInt, true);
  }
  
  public Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2)
  {
    return createSocket(null, paramInetAddress1.getHostName(), paramInt1, true);
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    paramSocket = new Socket(this.b, this.c);
    a(paramSocket, paramString, paramInt);
    paramSocket = (SSLSocket)this.a.createSocket(paramSocket, paramString, paramInt, paramBoolean);
    paramSocket.addHandshakeCompletedListener(new u.1(this));
    paramSocket.startHandshake();
    return paramSocket;
  }
  
  public String[] getDefaultCipherSuites()
  {
    return this.a.getDefaultCipherSuites();
  }
  
  public String[] getSupportedCipherSuites()
  {
    return this.a.getSupportedCipherSuites();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */