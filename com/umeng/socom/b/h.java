package com.umeng.socom.b;

import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class h
{
  public static String a(Map<String, Object> paramMap, String paramString)
  {
    if ((paramMap == null) || (paramMap.isEmpty())) {
      return paramString;
    }
    StringBuilder localStringBuilder1 = new StringBuilder(paramString);
    Object localObject = paramMap.keySet();
    if (!paramString.endsWith("?")) {
      localStringBuilder1.append("?");
    }
    localObject = ((Set)localObject).iterator();
    if (!((Iterator)localObject).hasNext())
    {
      localStringBuilder1.deleteCharAt(localStringBuilder1.length() - 1);
      return localStringBuilder1.toString();
    }
    paramString = (String)((Iterator)localObject).next();
    StringBuilder localStringBuilder2 = new StringBuilder(String.valueOf(URLEncoder.encode(paramString))).append("=");
    if (paramMap.get(paramString) == null) {}
    for (paramString = "";; paramString = paramMap.get(paramString).toString())
    {
      localStringBuilder1.append(URLEncoder.encode(paramString) + "&");
      break;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */