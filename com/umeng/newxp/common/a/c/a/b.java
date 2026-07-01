package com.umeng.newxp.common.a.c.a;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class b
{
  private static final Map<d, b> a = new EnumMap(d.class);
  private static final String b = "org/apache/commons/codec/language/bm/lang.txt";
  private final c c;
  private final List<b.a> d;
  
  static
  {
    d[] arrayOfd = d.values();
    int j = arrayOfd.length;
    int i = 0;
    while (i < j)
    {
      d locald = arrayOfd[i];
      a.put(locald, a("org/apache/commons/codec/language/bm/lang.txt", c.a(locald)));
      i += 1;
    }
  }
  
  private b(List<b.a> paramList, c paramc)
  {
    this.d = Collections.unmodifiableList(paramList);
    this.c = paramc;
  }
  
  public static b a(d paramd)
  {
    return (b)a.get(paramd);
  }
  
  public static b a(String paramString, c paramc)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = b.class.getClassLoader().getResourceAsStream(paramString);
    if (paramString == null) {
      throw new IllegalStateException("Unable to resolve required resource:org/apache/commons/codec/language/bm/lang.txt");
    }
    Scanner localScanner = new Scanner(paramString, "UTF-8");
    int i = 0;
    Object localObject;
    int j;
    while (localScanner.hasNextLine())
    {
      localObject = localScanner.nextLine();
      if (i != 0)
      {
        if (((String)localObject).endsWith("*/")) {
          i = 0;
        }
      }
      else if (((String)localObject).startsWith("/*"))
      {
        i = 1;
      }
      else
      {
        j = ((String)localObject).indexOf("//");
        if (j < 0) {
          break label246;
        }
      }
    }
    label246:
    for (paramString = ((String)localObject).substring(0, j);; paramString = (String)localObject)
    {
      paramString = paramString.trim();
      if (paramString.length() == 0) {
        break;
      }
      paramString = paramString.split("\\s+");
      if (paramString.length != 3)
      {
        System.err.println("Warning: malformed line '" + (String)localObject + "'");
        break;
      }
      localObject = Pattern.compile(paramString[0]);
      String[] arrayOfString = paramString[1].split("\\+");
      boolean bool = paramString[2].equals("true");
      localArrayList.add(new b.a((Pattern)localObject, new HashSet(Arrays.asList(arrayOfString)), bool, null));
      break;
      return new b(localArrayList, paramc);
    }
  }
  
  public String a(String paramString)
  {
    paramString = b(paramString);
    if (paramString.c()) {
      return paramString.a();
    }
    return "any";
  }
  
  public c.a b(String paramString)
  {
    paramString = paramString.toLowerCase(Locale.ENGLISH);
    Object localObject = new HashSet(this.c.a());
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      b.a locala = (b.a)localIterator.next();
      if (locala.a(paramString)) {
        if (b.a.a(locala)) {
          ((Set)localObject).retainAll(b.a.b(locala));
        } else {
          ((Set)localObject).removeAll(b.a.b(locala));
        }
      }
    }
    localObject = c.a.a((Set)localObject);
    paramString = (String)localObject;
    if (localObject.equals(c.b)) {
      paramString = c.c;
    }
    return paramString;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */