package com.umeng.newxp.common.a.c.a;

import java.io.InputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class c
{
  public static final String a = "any";
  public static final c.a b = new c.1();
  public static final c.a c = new c.2();
  private static final Map<d, c> d = new EnumMap(d.class);
  private final Set<String> e;
  
  static
  {
    d[] arrayOfd = d.values();
    int j = arrayOfd.length;
    int i = 0;
    while (i < j)
    {
      d locald = arrayOfd[i];
      d.put(locald, a(b(locald)));
      i += 1;
    }
  }
  
  private c(Set<String> paramSet)
  {
    this.e = paramSet;
  }
  
  public static c a(d paramd)
  {
    return (c)d.get(paramd);
  }
  
  public static c a(String paramString)
  {
    HashSet localHashSet = new HashSet();
    Object localObject = c.class.getClassLoader().getResourceAsStream(paramString);
    if (localObject == null) {
      throw new IllegalArgumentException("Unable to resolve required resource: " + paramString);
    }
    paramString = new Scanner((InputStream)localObject, "UTF-8");
    int i = 0;
    while (paramString.hasNextLine())
    {
      localObject = paramString.nextLine().trim();
      if (i != 0)
      {
        if (((String)localObject).endsWith("*/")) {
          i = 0;
        }
      }
      else if (((String)localObject).startsWith("/*")) {
        i = 1;
      } else if (((String)localObject).length() > 0) {
        localHashSet.add(localObject);
      }
    }
    return new c(Collections.unmodifiableSet(localHashSet));
  }
  
  private static String b(d paramd)
  {
    return String.format("org/apache/commons/codec/language/bm/%s_languages.txt", new Object[] { paramd.a() });
  }
  
  public Set<String> a()
  {
    return this.e;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */