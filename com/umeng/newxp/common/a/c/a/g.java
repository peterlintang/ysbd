package com.umeng.newxp.common.a.c.a;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class g
{
  public static final g.d a = new g.1();
  public static final String b = "ALL";
  private static final String c = "\"";
  private static final String d = "#include";
  private static final Map<d, Map<h, Map<String, List<g>>>> e = new EnumMap(d.class);
  private final g.d f;
  private final String g;
  private final g.b h;
  private final g.d i;
  
  static
  {
    d[] arrayOfd = d.values();
    int m = arrayOfd.length;
    int j = 0;
    while (j < m)
    {
      d locald = arrayOfd[j];
      EnumMap localEnumMap = new EnumMap(h.class);
      h[] arrayOfh = h.values();
      int n = arrayOfh.length;
      int k = 0;
      while (k < n)
      {
        h localh = arrayOfh[k];
        HashMap localHashMap = new HashMap();
        Iterator localIterator = c.a(locald).a().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          try
          {
            localHashMap.put(str, a(c(locald, localh, str), b(locald, localh, str)));
          }
          catch (IllegalStateException localIllegalStateException)
          {
            throw new IllegalStateException("Problem processing " + b(locald, localh, str), localIllegalStateException);
          }
        }
        if (!localh.equals(h.c)) {
          localHashMap.put("common", a(c(locald, localh, "common"), b(locald, localh, "common")));
        }
        localEnumMap.put(localh, Collections.unmodifiableMap(localHashMap));
        k += 1;
      }
      e.put(locald, Collections.unmodifiableMap(localEnumMap));
      j += 1;
    }
  }
  
  public g(String paramString1, String paramString2, String paramString3, g.b paramb)
  {
    this.g = paramString1;
    this.f = d(paramString2 + "$");
    this.i = d("^" + paramString3);
    this.h = paramb;
  }
  
  public static List<g> a(d paramd, h paramh, c.a parama)
  {
    if (parama.c()) {
      return a(paramd, paramh, parama.a());
    }
    return a(paramd, paramh, "any");
  }
  
  public static List<g> a(d paramd, h paramh, String paramString)
  {
    List localList = (List)((Map)((Map)e.get(paramd)).get(paramh)).get(paramString);
    if (localList == null) {
      throw new IllegalArgumentException(String.format("No rules found for %s, %s, %s.", new Object[] { paramd.a(), paramh.a(), paramString }));
    }
    return localList;
  }
  
  private static List<g> a(Scanner paramScanner, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int j = 0;
    int k = 0;
    int m;
    String str;
    while (paramScanner.hasNextLine())
    {
      m = k + 1;
      str = paramScanner.nextLine();
      if (j != 0)
      {
        k = m;
        if (str.endsWith("*/"))
        {
          j = 0;
          k = m;
        }
      }
      else if (str.startsWith("/*"))
      {
        j = 1;
        k = m;
      }
      else
      {
        k = str.indexOf("//");
        if (k < 0) {
          break label364;
        }
      }
    }
    label364:
    for (Object localObject = str.substring(0, k);; localObject = str)
    {
      localObject = ((String)localObject).trim();
      k = m;
      if (((String)localObject).length() == 0) {
        break;
      }
      if (((String)localObject).startsWith("#include"))
      {
        localObject = ((String)localObject).substring(8).trim();
        if (((String)localObject).contains(" "))
        {
          System.err.println("Warining: malformed import statement: " + str);
          k = m;
          break;
        }
        localArrayList.addAll(a(a((String)localObject), paramString + "->" + (String)localObject));
        k = m;
        break;
      }
      localObject = ((String)localObject).split("\\s+");
      if (localObject.length != 4)
      {
        System.err.println("Warning: malformed rule statement split into " + localObject.length + " parts: " + str);
        k = m;
        break;
      }
      try
      {
        localArrayList.add(new g.3(e(localObject[0]), e(localObject[1]), e(localObject[2]), c(e(localObject[3])), m, paramString));
        k = m;
      }
      catch (IllegalArgumentException paramScanner)
      {
        throw new IllegalStateException("Problem parsing line " + m, paramScanner);
      }
      return localArrayList;
    }
  }
  
  private static Scanner a(String paramString)
  {
    paramString = String.format("org/apache/commons/codec/language/bm/%s.txt", new Object[] { paramString });
    InputStream localInputStream = c.class.getClassLoader().getResourceAsStream(paramString);
    if (localInputStream == null) {
      throw new IllegalArgumentException("Unable to load resource: " + paramString);
    }
    return new Scanner(localInputStream, "UTF-8");
  }
  
  private static g.a b(String paramString)
  {
    int j = paramString.indexOf("[");
    if (j >= 0)
    {
      if (!paramString.endsWith("]")) {
        throw new IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
      }
      return new g.a(paramString.substring(0, j), c.a.a(new HashSet(Arrays.asList(paramString.substring(j + 1, paramString.length() - 1).split("[+]")))));
    }
    return new g.a(paramString, c.c);
  }
  
  private static String b(d paramd, h paramh, String paramString)
  {
    return String.format("org/apache/commons/codec/language/bm/%s_%s_%s.txt", new Object[] { paramd.a(), paramh.a(), paramString });
  }
  
  private static boolean b(CharSequence paramCharSequence, char paramChar)
  {
    boolean bool2 = false;
    int j = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (j < paramCharSequence.length())
      {
        if (paramCharSequence.charAt(j) == paramChar) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      j += 1;
    }
  }
  
  private static g.b c(String paramString)
  {
    if (paramString.startsWith("("))
    {
      if (!paramString.endsWith(")")) {
        throw new IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
      }
      ArrayList localArrayList = new ArrayList();
      paramString = paramString.substring(1, paramString.length() - 1);
      String[] arrayOfString = paramString.split("[|]");
      int k = arrayOfString.length;
      int j = 0;
      while (j < k)
      {
        localArrayList.add(b(arrayOfString[j]));
        j += 1;
      }
      if ((paramString.startsWith("|")) || (paramString.endsWith("|"))) {
        localArrayList.add(new g.a("", c.c));
      }
      return new g.c(localArrayList);
    }
    return b(paramString);
  }
  
  private static Scanner c(d paramd, h paramh, String paramString)
  {
    paramd = b(paramd, paramh, paramString);
    paramh = c.class.getClassLoader().getResourceAsStream(paramd);
    if (paramh == null) {
      throw new IllegalArgumentException("Unable to load resource: " + paramd);
    }
    return new Scanner(paramh, "UTF-8");
  }
  
  private static boolean c(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if (paramCharSequence2.length() > paramCharSequence1.length()) {
      return false;
    }
    int k = paramCharSequence1.length() - 1;
    int j = paramCharSequence2.length() - 1;
    for (;;)
    {
      if (j < 0) {
        break label67;
      }
      if (paramCharSequence1.charAt(k) != paramCharSequence2.charAt(j)) {
        break;
      }
      k -= 1;
      j -= 1;
    }
    label67:
    return true;
  }
  
  private static g.d d(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = paramString.startsWith("^");
    boolean bool3 = paramString.endsWith("$");
    int j;
    if (bool2)
    {
      j = 1;
      if (!bool3) {
        break label87;
      }
    }
    String str;
    label87:
    for (int k = paramString.length() - 1;; k = paramString.length())
    {
      str = paramString.substring(j, k);
      if (str.contains("[")) {
        break label157;
      }
      if ((!bool2) || (!bool3)) {
        break label105;
      }
      if (str.length() != 0) {
        break label95;
      }
      return new g.4();
      j = 0;
      break;
    }
    label95:
    return new g.5(str);
    label105:
    if (((bool2) || (bool3)) && (str.length() == 0)) {
      return a;
    }
    if (bool2) {
      return new g.6(str);
    }
    label157:
    boolean bool4;
    if (bool3)
    {
      return new g.7(str);
      bool4 = str.startsWith("[");
      boolean bool5 = str.endsWith("]");
      if ((bool4) && (bool5))
      {
        str = str.substring(1, str.length() - 1);
        if (!str.contains("["))
        {
          bool4 = str.startsWith("^");
          if (!bool4) {
            break label307;
          }
          str = str.substring(1);
        }
      }
    }
    label307:
    for (;;)
    {
      if (!bool4) {}
      while ((bool2) && (bool3))
      {
        return new g.8(str, bool1);
        bool1 = false;
      }
      if (bool2) {
        return new g.9(str, bool1);
      }
      if (bool3) {
        return new g.10(str, bool1);
      }
      return new g.2(paramString);
    }
  }
  
  private static boolean d(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if (paramCharSequence2.length() > paramCharSequence1.length()) {
      return false;
    }
    int j = 0;
    for (;;)
    {
      if (j >= paramCharSequence2.length()) {
        break label53;
      }
      if (paramCharSequence1.charAt(j) != paramCharSequence2.charAt(j)) {
        break;
      }
      j += 1;
    }
    label53:
    return true;
  }
  
  private static String e(String paramString)
  {
    String str = paramString;
    if (paramString.startsWith("\"")) {
      str = paramString.substring(1);
    }
    paramString = str;
    if (str.endsWith("\"")) {
      paramString = str.substring(0, str.length() - 1);
    }
    return paramString;
  }
  
  public g.d a()
  {
    return this.f;
  }
  
  public boolean a(CharSequence paramCharSequence, int paramInt)
  {
    if (paramInt < 0) {
      throw new IndexOutOfBoundsException("Can not match pattern at negative indexes");
    }
    int j = this.g.length() + paramInt;
    if (j > paramCharSequence.length()) {}
    boolean bool1;
    boolean bool2;
    boolean bool3;
    do
    {
      return false;
      bool1 = paramCharSequence.subSequence(paramInt, j).equals(this.g);
      bool2 = this.i.a(paramCharSequence.subSequence(j, paramCharSequence.length()));
      bool3 = this.f.a(paramCharSequence.subSequence(0, paramInt));
    } while ((!bool1) || (!bool2) || (!bool3));
    return true;
  }
  
  public String b()
  {
    return this.g;
  }
  
  public g.b c()
  {
    return this.h;
  }
  
  public g.d d()
  {
    return this.i;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */