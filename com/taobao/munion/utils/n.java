package com.taobao.munion.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class n
{
  private static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  
  public static String a(Map<String, Object> paramMap, String paramString)
  {
    try
    {
      Object localObject = new TreeMap(new n.1());
      ((TreeMap)localObject).putAll(paramMap);
      paramMap = new StringBuilder(paramString);
      localObject = ((TreeMap)localObject).entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        paramMap.append((String)localEntry.getKey());
        paramMap.append(localEntry.getValue());
      }
      paramMap.append(paramString);
    }
    finally {}
    try
    {
      paramMap = b(paramMap.toString().getBytes("UTF-8"));
      return paramMap;
    }
    catch (UnsupportedEncodingException paramMap)
    {
      throw new RuntimeException("Charset not supported...", paramMap);
    }
  }
  
  private static MessageDigest a()
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      return localMessageDigest;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException(localNoSuchAlgorithmException);
    }
  }
  
  public static char[] a(byte[] paramArrayOfByte)
  {
    int j = 0;
    int k = paramArrayOfByte.length;
    char[] arrayOfChar = new char[k << 1];
    int i = 0;
    while (i < k)
    {
      int m = j + 1;
      arrayOfChar[j] = a[((paramArrayOfByte[i] & 0xF0) >>> 4)];
      j = m + 1;
      arrayOfChar[m] = a[(paramArrayOfByte[i] & 0xF)];
      i += 1;
    }
    return arrayOfChar;
  }
  
  private static String b(byte[] paramArrayOfByte)
  {
    return new String(a(a().digest(paramArrayOfByte)));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */