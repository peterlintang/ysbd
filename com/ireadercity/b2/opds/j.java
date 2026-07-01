package com.ireadercity.b2.opds;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public final class j
  extends DefaultHandler
{
  boolean a = false;
  private ArrayList<b> b;
  private b c;
  private String d;
  
  public static ArrayList<b> a(InputStream paramInputStream)
  {
    try
    {
      SAXParser localSAXParser = SAXParserFactory.newInstance().newSAXParser();
      j localj = new j();
      if (paramInputStream != null)
      {
        localSAXParser.parse(paramInputStream, localj);
        paramInputStream = localj.b;
        return paramInputStream;
      }
    }
    catch (ParserConfigurationException paramInputStream)
    {
      paramInputStream.printStackTrace();
      return null;
    }
    catch (SAXException paramInputStream)
    {
      for (;;)
      {
        paramInputStream.printStackTrace();
      }
    }
    catch (IOException paramInputStream)
    {
      for (;;)
      {
        paramInputStream.printStackTrace();
      }
    }
  }
  
  public static ArrayList<b> a(String paramString)
  {
    try
    {
      SAXParser localSAXParser = SAXParserFactory.newInstance().newSAXParser();
      j localj = new j();
      paramString = b(paramString);
      if (paramString != null)
      {
        localSAXParser.parse(paramString, localj);
        paramString = localj.b;
        return paramString;
      }
    }
    catch (ParserConfigurationException paramString)
    {
      paramString.printStackTrace();
      return null;
    }
    catch (SAXException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  private static InputStream b(String paramString)
  {
    Object localObject = new URL(paramString);
    try
    {
      localObject = (HttpURLConnection)((URL)localObject).openConnection();
      if (paramString.startsWith("http://www.shucang.org")) {
        ((HttpURLConnection)localObject).setRequestProperty("User-Agent", "iReader by YouLoft");
      }
      ((HttpURLConnection)localObject).connect();
      paramString = ((HttpURLConnection)localObject).getInputStream();
      return paramString;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public final void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if ((this.d != null) && (this.c != null))
    {
      paramArrayOfChar = new String(paramArrayOfChar, paramInt1, paramInt2);
      if (!this.a) {
        break label58;
      }
      if (this.d.equals("div"))
      {
        this.c.b = paramArrayOfChar;
        this.a = false;
      }
    }
    label58:
    do
    {
      return;
      if (this.d.equals("title"))
      {
        if (this.c.b != null)
        {
          this.c.b += paramArrayOfChar;
          return;
        }
        this.c.b = paramArrayOfChar;
        return;
      }
      if (this.d.equals("name"))
      {
        if (this.c.k != null)
        {
          this.c.k += paramArrayOfChar;
          return;
        }
        this.c.k = paramArrayOfChar;
        return;
      }
      if (this.d.equals("content"))
      {
        if (this.c.c != null)
        {
          this.c.c += paramArrayOfChar;
          return;
        }
        this.c.c = paramArrayOfChar;
        return;
      }
      if (this.d.equals("dcterms:language"))
      {
        this.c.f = paramArrayOfChar;
        return;
      }
      if (this.d.equals("dcterms:issued"))
      {
        this.c.n = paramArrayOfChar;
        return;
      }
      if (this.d.equals("dcterms:publisher"))
      {
        this.c.o = paramArrayOfChar;
        return;
      }
    } while (!this.d.equals("id"));
    this.c.a = paramArrayOfChar;
  }
  
  public final void endDocument() {}
  
  public final void endElement(String paramString1, String paramString2, String paramString3)
  {
    if (paramString3.equals("entry")) {
      this.b.add(this.c);
    }
    this.d = null;
  }
  
  public final void startDocument()
  {
    this.b = new ArrayList();
  }
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    if (paramString3.equals("entry")) {
      this.c = new b();
    }
    for (;;)
    {
      this.d = paramString3;
      return;
      if ((paramString3.equals("link")) && (this.c != null))
      {
        paramString1 = paramAttributes.getValue("type");
        if ("application/pdf".equals(paramString1))
        {
          this.c.g = paramAttributes.getValue("href");
          this.c.p = true;
        }
        else if ("application/epub+zip".equals(paramString1))
        {
          this.c.h = paramAttributes.getValue("href");
          this.c.p = true;
        }
        else if ((("image/jpeg".equals(paramString1)) || ("image/png".equals(paramString1))) && ((this.c.i == null) || ("".equals(this.c.i))))
        {
          this.c.i = paramAttributes.getValue("href");
        }
        else if (("application/atom+xml".equals(paramString1)) || (paramString1.contains("application/atom+xml")) || (paramString1.contains("text/html")))
        {
          this.c.e = paramAttributes.getValue("href");
        }
      }
      else if ((paramString3.equals("title")) && (paramAttributes.getValue("type") != null))
      {
        this.a = true;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\opds\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */