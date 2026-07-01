package com.umeng.newxp.common.persistence;

import android.util.Xml;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

class e
{
  public static final int a(CharSequence paramCharSequence)
  {
    int j = 16;
    paramCharSequence = paramCharSequence.toString();
    int i = paramCharSequence.length();
    if ('0' == paramCharSequence.charAt(0))
    {
      if (i - 1 == 0) {
        return 0;
      }
      i = paramCharSequence.charAt(1);
      if ((120 == i) || (88 == i)) {
        i = 2;
      }
    }
    for (;;)
    {
      return (int)Long.parseLong(paramCharSequence.substring(i), j);
      j = 8;
      i = 1;
      continue;
      if ('#' == paramCharSequence.charAt(0))
      {
        i = 1;
      }
      else
      {
        j = 10;
        i = 0;
      }
    }
  }
  
  public static final int a(CharSequence paramCharSequence, int paramInt)
  {
    int i = 1;
    if (paramCharSequence == null) {
      return paramInt;
    }
    paramCharSequence = paramCharSequence.toString();
    int k = paramCharSequence.length();
    int j;
    if ('-' == paramCharSequence.charAt(0)) {
      j = -1;
    }
    for (paramInt = i;; paramInt = 0)
    {
      if ('0' == paramCharSequence.charAt(paramInt))
      {
        if (paramInt == k - 1) {
          return 0;
        }
        i = paramCharSequence.charAt(paramInt + 1);
        if ((120 == i) || (88 == i))
        {
          i = paramInt + 2;
          paramInt = 16;
        }
      }
      for (;;)
      {
        return Integer.parseInt(paramCharSequence.substring(i), paramInt) * j;
        i = paramInt + 1;
        paramInt = 8;
        continue;
        if ('#' == paramCharSequence.charAt(paramInt))
        {
          i = paramInt + 1;
          paramInt = 16;
        }
        else
        {
          i = paramInt;
          paramInt = 10;
        }
      }
      j = 1;
    }
  }
  
  public static final int a(CharSequence paramCharSequence, String[] paramArrayOfString, int paramInt)
  {
    if (paramCharSequence != null)
    {
      int i = 0;
      while (i < paramArrayOfString.length)
      {
        if (paramCharSequence.equals(paramArrayOfString[i])) {
          return i;
        }
        i += 1;
      }
    }
    return paramInt;
  }
  
  public static final int a(String paramString, int paramInt)
  {
    if (paramString == null) {
      return paramInt;
    }
    return a(paramString);
  }
  
  public static final Object a(XmlPullParser paramXmlPullParser, String[] paramArrayOfString)
  {
    int i = paramXmlPullParser.getEventType();
    for (;;)
    {
      if (i == 2) {
        return b(paramXmlPullParser, paramArrayOfString);
      }
      if (i == 3) {
        throw new XmlPullParserException("Unexpected end tag at: " + paramXmlPullParser.getName());
      }
      if (i == 4) {
        throw new XmlPullParserException("Unexpected text: " + paramXmlPullParser.getText());
      }
      try
      {
        int j = paramXmlPullParser.next();
        i = j;
        if (j != 1) {
          continue;
        }
        throw new XmlPullParserException("Unexpected end of document");
      }
      catch (Exception paramArrayOfString)
      {
        throw new XmlPullParserException("Unexpected call next(): " + paramXmlPullParser.getName());
      }
    }
  }
  
  public static final HashMap a(InputStream paramInputStream)
  {
    XmlPullParser localXmlPullParser = Xml.newPullParser();
    localXmlPullParser.setInput(paramInputStream, null);
    return (HashMap)a(localXmlPullParser, new String[1]);
  }
  
  public static final HashMap a(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    HashMap localHashMap = new HashMap();
    int i = paramXmlPullParser.getEventType();
    if (i == 2)
    {
      localObject = b(paramXmlPullParser, paramArrayOfString);
      if (paramArrayOfString[0] != null) {
        localHashMap.put(paramArrayOfString[0], localObject);
      }
    }
    while (i != 3)
    {
      Object localObject;
      int j = paramXmlPullParser.next();
      i = j;
      if (j != 1) {
        break;
      }
      throw new XmlPullParserException("Document ended before " + paramString + " end tag");
      throw new XmlPullParserException("Map value without name attribute: " + paramXmlPullParser.getName());
    }
    if (paramXmlPullParser.getName().equals(paramString)) {
      return localHashMap;
    }
    throw new XmlPullParserException("Expected " + paramString + " end tag at: " + paramXmlPullParser.getName());
  }
  
  public static final void a(Object paramObject, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramObject == null)
    {
      paramXmlSerializer.startTag(null, "null");
      if (paramString != null) {
        paramXmlSerializer.attribute(null, "name", paramString);
      }
      paramXmlSerializer.endTag(null, "null");
      return;
    }
    if ((paramObject instanceof String))
    {
      paramXmlSerializer.startTag(null, "string");
      if (paramString != null) {
        paramXmlSerializer.attribute(null, "name", paramString);
      }
      paramXmlSerializer.text(paramObject.toString());
      paramXmlSerializer.endTag(null, "string");
      return;
    }
    String str;
    if ((paramObject instanceof Integer)) {
      str = "int";
    }
    for (;;)
    {
      paramXmlSerializer.startTag(null, str);
      if (paramString != null) {
        paramXmlSerializer.attribute(null, "name", paramString);
      }
      paramXmlSerializer.attribute(null, "value", paramObject.toString());
      paramXmlSerializer.endTag(null, str);
      return;
      if ((paramObject instanceof Long))
      {
        str = "long";
      }
      else if ((paramObject instanceof Float))
      {
        str = "float";
      }
      else if ((paramObject instanceof Double))
      {
        str = "double";
      }
      else
      {
        if (!(paramObject instanceof Boolean)) {
          break;
        }
        str = "boolean";
      }
    }
    if ((paramObject instanceof byte[]))
    {
      a((byte[])paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof int[]))
    {
      a((int[])paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof Map))
    {
      a((Map)paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof List))
    {
      a((List)paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof CharSequence))
    {
      paramXmlSerializer.startTag(null, "string");
      if (paramString != null) {
        paramXmlSerializer.attribute(null, "name", paramString);
      }
      paramXmlSerializer.text(paramObject.toString());
      paramXmlSerializer.endTag(null, "string");
      return;
    }
    throw new RuntimeException("writeValueXml: unable to write value " + paramObject);
  }
  
  public static final void a(List paramList, OutputStream paramOutputStream)
  {
    XmlSerializer localXmlSerializer = Xml.newSerializer();
    localXmlSerializer.setOutput(paramOutputStream, "utf-8");
    localXmlSerializer.startDocument(null, Boolean.valueOf(true));
    localXmlSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
    a(paramList, null, localXmlSerializer);
    localXmlSerializer.endDocument();
  }
  
  public static final void a(List paramList, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramList == null)
    {
      paramXmlSerializer.startTag(null, "null");
      paramXmlSerializer.endTag(null, "null");
      return;
    }
    paramXmlSerializer.startTag(null, "list");
    if (paramString != null) {
      paramXmlSerializer.attribute(null, "name", paramString);
    }
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      a(paramList.get(i), null, paramXmlSerializer);
      i += 1;
    }
    paramXmlSerializer.endTag(null, "list");
  }
  
  public static final void a(Map paramMap, OutputStream paramOutputStream)
  {
    a locala = new a();
    locala.setOutput(paramOutputStream, "utf-8");
    locala.startDocument(null, Boolean.valueOf(true));
    locala.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
    a(paramMap, null, locala);
    locala.endDocument();
  }
  
  public static final void a(Map paramMap, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramMap == null)
    {
      paramXmlSerializer.startTag(null, "null");
      paramXmlSerializer.endTag(null, "null");
      return;
    }
    paramMap = paramMap.entrySet().iterator();
    paramXmlSerializer.startTag(null, "map");
    if (paramString != null) {
      paramXmlSerializer.attribute(null, "name", paramString);
    }
    while (paramMap.hasNext())
    {
      paramString = (Map.Entry)paramMap.next();
      a(paramString.getValue(), (String)paramString.getKey(), paramXmlSerializer);
    }
    paramXmlSerializer.endTag(null, "map");
  }
  
  public static void a(XmlPullParser paramXmlPullParser)
  {
    int i = paramXmlPullParser.getDepth();
    int j;
    do
    {
      j = paramXmlPullParser.next();
    } while ((j != 1) && ((j != 3) || (paramXmlPullParser.getDepth() > i)));
  }
  
  public static final void a(XmlPullParser paramXmlPullParser, String paramString)
  {
    int i;
    do
    {
      i = paramXmlPullParser.next();
    } while ((i != 2) && (i != 1));
    if (i != 2) {
      throw new XmlPullParserException("No start tag found");
    }
    if (!paramXmlPullParser.getName().equals(paramString)) {
      throw new XmlPullParserException("Unexpected start tag: found " + paramXmlPullParser.getName() + ", expected " + paramString);
    }
  }
  
  public static final void a(byte[] paramArrayOfByte, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramArrayOfByte == null)
    {
      paramXmlSerializer.startTag(null, "null");
      paramXmlSerializer.endTag(null, "null");
      return;
    }
    paramXmlSerializer.startTag(null, "byte-array");
    if (paramString != null) {
      paramXmlSerializer.attribute(null, "name", paramString);
    }
    int k = paramArrayOfByte.length;
    paramXmlSerializer.attribute(null, "num", Integer.toString(k));
    paramString = new StringBuilder(paramArrayOfByte.length * 2);
    int i = 0;
    if (i < k)
    {
      int m = paramArrayOfByte[i];
      int j = m >> 4;
      if (j >= 10)
      {
        j = j + 97 - 10;
        label119:
        paramString.append(j);
        j = m & 0xFF;
        if (j < 10) {
          break label175;
        }
        j = j + 97 - 10;
      }
      for (;;)
      {
        paramString.append(j);
        i += 1;
        break;
        j += 48;
        break label119;
        label175:
        j += 48;
      }
    }
    paramXmlSerializer.text(paramString.toString());
    paramXmlSerializer.endTag(null, "byte-array");
  }
  
  public static final void a(int[] paramArrayOfInt, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramArrayOfInt == null)
    {
      paramXmlSerializer.startTag(null, "null");
      paramXmlSerializer.endTag(null, "null");
      return;
    }
    paramXmlSerializer.startTag(null, "int-array");
    if (paramString != null) {
      paramXmlSerializer.attribute(null, "name", paramString);
    }
    int j = paramArrayOfInt.length;
    paramXmlSerializer.attribute(null, "num", Integer.toString(j));
    int i = 0;
    while (i < j)
    {
      paramXmlSerializer.startTag(null, "item");
      paramXmlSerializer.attribute(null, "value", Integer.toString(paramArrayOfInt[i]));
      paramXmlSerializer.endTag(null, "item");
      i += 1;
    }
    paramXmlSerializer.endTag(null, "int-array");
  }
  
  public static final boolean a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    boolean bool = false;
    if (paramCharSequence == null) {
      return paramBoolean;
    }
    if ((!paramCharSequence.equals("1")) && (!paramCharSequence.equals("true")))
    {
      paramBoolean = bool;
      if (!paramCharSequence.equals("TRUE")) {}
    }
    else
    {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  private static final Object b(XmlPullParser paramXmlPullParser, String[] paramArrayOfString)
  {
    Object localObject = null;
    String str1 = paramXmlPullParser.getAttributeValue(null, "name");
    String str2 = paramXmlPullParser.getName();
    if (str2.equals("null")) {}
    int i;
    label218:
    label494:
    label535:
    do
    {
      for (;;)
      {
        i = paramXmlPullParser.next();
        if (i == 1) {
          break label627;
        }
        if (i != 3) {
          break label535;
        }
        if (!paramXmlPullParser.getName().equals(str2)) {
          break label494;
        }
        paramArrayOfString[0] = str1;
        return localObject;
        if (str2.equals("string"))
        {
          localObject = "";
          do
          {
            for (;;)
            {
              i = paramXmlPullParser.next();
              if (i == 1) {
                break label218;
              }
              if (i == 3)
              {
                if (paramXmlPullParser.getName().equals("string"))
                {
                  paramArrayOfString[0] = str1;
                  return localObject;
                }
                throw new XmlPullParserException("Unexpected end tag in <string>: " + paramXmlPullParser.getName());
              }
              if (i != 4) {
                break;
              }
              localObject = (String)localObject + paramXmlPullParser.getText();
            }
          } while (i != 2);
          throw new XmlPullParserException("Unexpected start tag in <string>: " + paramXmlPullParser.getName());
          throw new XmlPullParserException("Unexpected end of document in <string>");
        }
        if (str2.equals("int"))
        {
          localObject = Integer.valueOf(Integer.parseInt(paramXmlPullParser.getAttributeValue(null, "value")));
        }
        else if (str2.equals("long"))
        {
          localObject = Long.valueOf(paramXmlPullParser.getAttributeValue(null, "value"));
        }
        else if (str2.equals("float"))
        {
          localObject = new Float(paramXmlPullParser.getAttributeValue(null, "value"));
        }
        else if (str2.equals("double"))
        {
          localObject = new Double(paramXmlPullParser.getAttributeValue(null, "value"));
        }
        else
        {
          if (!str2.equals("boolean")) {
            break;
          }
          localObject = Boolean.valueOf(paramXmlPullParser.getAttributeValue(null, "value"));
        }
      }
      if (str2.equals("int-array"))
      {
        paramXmlPullParser.next();
        paramXmlPullParser = c(paramXmlPullParser, "int-array", paramArrayOfString);
        paramArrayOfString[0] = str1;
        return paramXmlPullParser;
      }
      if (str2.equals("map"))
      {
        paramXmlPullParser.next();
        paramXmlPullParser = a(paramXmlPullParser, "map", paramArrayOfString);
        paramArrayOfString[0] = str1;
        return paramXmlPullParser;
      }
      if (str2.equals("list"))
      {
        paramXmlPullParser.next();
        paramXmlPullParser = b(paramXmlPullParser, "list", paramArrayOfString);
        paramArrayOfString[0] = str1;
        return paramXmlPullParser;
      }
      throw new XmlPullParserException("Unknown tag: " + str2);
      throw new XmlPullParserException("Unexpected end tag in <" + str2 + ">: " + paramXmlPullParser.getName());
      if (i == 4) {
        throw new XmlPullParserException("Unexpected text in <" + str2 + ">: " + paramXmlPullParser.getName());
      }
    } while (i != 2);
    throw new XmlPullParserException("Unexpected start tag in <" + str2 + ">: " + paramXmlPullParser.getName());
    label627:
    throw new XmlPullParserException("Unexpected end of document in <" + str2 + ">");
  }
  
  public static final ArrayList b(InputStream paramInputStream)
  {
    XmlPullParser localXmlPullParser = Xml.newPullParser();
    localXmlPullParser.setInput(paramInputStream, null);
    return (ArrayList)a(localXmlPullParser, new String[1]);
  }
  
  public static final ArrayList b(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramXmlPullParser.getEventType();
    if (i == 2) {
      localArrayList.add(b(paramXmlPullParser, paramArrayOfString));
    }
    while (i != 3)
    {
      int j = paramXmlPullParser.next();
      i = j;
      if (j != 1) {
        break;
      }
      throw new XmlPullParserException("Document ended before " + paramString + " end tag");
    }
    if (paramXmlPullParser.getName().equals(paramString)) {
      return localArrayList;
    }
    throw new XmlPullParserException("Expected " + paramString + " end tag at: " + paramXmlPullParser.getName());
  }
  
  public static final void b(XmlPullParser paramXmlPullParser)
  {
    int i;
    do
    {
      i = paramXmlPullParser.next();
    } while ((i != 2) && (i != 1));
  }
  
  public static final int[] c(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    int i;
    int j;
    try
    {
      i = Integer.parseInt(paramXmlPullParser.getAttributeValue(null, "num"));
      paramArrayOfString = new int[i];
      i = paramXmlPullParser.getEventType();
      j = 0;
    }
    catch (NullPointerException paramXmlPullParser)
    {
      try
      {
        do
        {
          paramArrayOfString[j] = Integer.parseInt(paramXmlPullParser.getAttributeValue(null, "value"));
          k = j;
          m = paramXmlPullParser.next();
          j = k;
          i = m;
        } while (m != 1);
        throw new XmlPullParserException("Document ended before " + paramString + " end tag");
      }
      catch (NullPointerException paramXmlPullParser)
      {
        throw new XmlPullParserException("Need value attribute in item");
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        throw new XmlPullParserException("Not a number in value attribute in item");
      }
      paramXmlPullParser = paramXmlPullParser;
      throw new XmlPullParserException("Need num attribute in byte-array");
    }
    catch (NumberFormatException paramXmlPullParser)
    {
      throw new XmlPullParserException("Not a number in num attribute in byte-array");
    }
    if (i == 2) {
      if (!paramXmlPullParser.getName().equals("item")) {}
    }
    for (;;)
    {
      int m;
      throw new XmlPullParserException("Expected item tag at: " + paramXmlPullParser.getName());
      int k = j;
      if (i == 3)
      {
        if (paramXmlPullParser.getName().equals(paramString)) {
          return paramArrayOfString;
        }
        if (!paramXmlPullParser.getName().equals("item")) {
          break;
        }
        k = j + 1;
      }
    }
    throw new XmlPullParserException("Expected " + paramString + " end tag at: " + paramXmlPullParser.getName());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\persistence\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */