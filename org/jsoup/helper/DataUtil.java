package org.jsoup.helper;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

public class DataUtil
{
  private static final int bufferSize = 131072;
  private static final Pattern charsetPattern = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)");
  static final String defaultCharset = "UTF-8";
  
  static String getCharsetFromContentType(String paramString)
  {
    if (paramString == null) {}
    do
    {
      do
      {
        return null;
        paramString = charsetPattern.matcher(paramString);
      } while (!paramString.find());
      paramString = paramString.group(1).trim();
      if (Charset.isSupported(paramString)) {
        return paramString;
      }
      paramString = paramString.toUpperCase(Locale.ENGLISH);
    } while (!Charset.isSupported(paramString));
    return paramString;
  }
  
  public static Document load(File paramFile, String paramString1, String paramString2)
  {
    try
    {
      localFileInputStream = new FileInputStream(paramFile);
      if (paramString1 == null) {
        break label39;
      }
    }
    finally
    {
      try
      {
        paramFile = parseByteData(readToByteBuffer(localFileInputStream), paramString1, paramString2, Parser.htmlParser());
        localFileInputStream.close();
        return paramFile;
      }
      finally
      {
        FileInputStream localFileInputStream;
        paramString1 = localFileInputStream;
      }
      paramFile = finally;
      paramString1 = null;
    }
    paramString1.close();
    label39:
    throw paramFile;
  }
  
  public static Document load(InputStream paramInputStream, String paramString1, String paramString2)
  {
    return parseByteData(readToByteBuffer(paramInputStream), paramString1, paramString2, Parser.htmlParser());
  }
  
  public static Document load(InputStream paramInputStream, String paramString1, String paramString2, Parser paramParser)
  {
    return parseByteData(readToByteBuffer(paramInputStream), paramString1, paramString2, paramParser);
  }
  
  static Document parseByteData(ByteBuffer paramByteBuffer, String paramString1, String paramString2, Parser paramParser)
  {
    ByteBuffer localByteBuffer = null;
    String str;
    Document localDocument;
    Object localObject;
    if (paramString1 == null)
    {
      str = Charset.forName("UTF-8").decode(paramByteBuffer).toString();
      localDocument = paramParser.parseInput(str, paramString2);
      localObject = localDocument.select("meta[http-equiv=content-type], meta[charset]").first();
      if (localObject == null) {
        break label218;
      }
      if (((Element)localObject).hasAttr("http-equiv"))
      {
        localObject = getCharsetFromContentType(((Element)localObject).attr("content"));
        if ((localObject == null) || (((String)localObject).length() == 0) || (((String)localObject).equals("UTF-8"))) {
          break label218;
        }
        paramByteBuffer.rewind();
        paramByteBuffer = Charset.forName((String)localObject).decode(paramByteBuffer).toString();
        paramString1 = (String)localObject;
        localObject = paramByteBuffer;
        paramByteBuffer = localByteBuffer;
      }
    }
    for (;;)
    {
      localByteBuffer = paramByteBuffer;
      paramByteBuffer = (ByteBuffer)localObject;
      for (;;)
      {
        if (localByteBuffer != null) {
          break label215;
        }
        localObject = paramByteBuffer;
        if (paramByteBuffer.length() > 0)
        {
          localObject = paramByteBuffer;
          if (paramByteBuffer.charAt(0) == 65279) {
            localObject = paramByteBuffer.substring(1);
          }
        }
        paramByteBuffer = paramParser.parseInput((String)localObject, paramString2);
        paramByteBuffer.outputSettings().charset(paramString1);
        return paramByteBuffer;
        localObject = ((Element)localObject).attr("charset");
        break;
        Validate.notEmpty(paramString1, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        paramByteBuffer = Charset.forName(paramString1).decode(paramByteBuffer).toString();
        localByteBuffer = null;
      }
      label215:
      return localByteBuffer;
      label218:
      paramByteBuffer = localDocument;
      localObject = str;
    }
  }
  
  static ByteBuffer readToByteBuffer(InputStream paramInputStream)
  {
    byte[] arrayOfByte = new byte[131072];
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(131072);
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    return ByteBuffer.wrap(localByteArrayOutputStream.toByteArray());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\helper\DataUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */