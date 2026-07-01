package com.umeng.newxp.common.a.c.a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class e
{
  private static final Map<d, Set<String>> a;
  private final b b;
  private final d c;
  private final h d;
  private final boolean e;
  
  static
  {
    EnumMap localEnumMap = new EnumMap(d.class);
    a = localEnumMap;
    localEnumMap.put(d.a, Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "bar", "ben", "da", "de", "van", "von" }))));
    a.put(d.c, Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von" }))));
    a.put(d.b, Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von" }))));
  }
  
  public e(d paramd, h paramh, boolean paramBoolean)
  {
    if (paramh == h.c) {
      throw new IllegalArgumentException("ruleType must not be " + h.c);
    }
    this.c = paramd;
    this.d = paramh;
    this.e = paramBoolean;
    this.b = b.a(paramd);
  }
  
  private e.a a(e.a parama, List<g> paramList)
  {
    if (paramList == null) {
      throw new NullPointerException("finalRules can not be null");
    }
    if (paramList.isEmpty()) {
      return parama;
    }
    TreeSet localTreeSet = new TreeSet(g.a.a);
    Iterator localIterator = parama.a().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (g.a)localIterator.next();
      parama = e.a.a(((g.a)localObject).a());
      CharSequence localCharSequence = a(((g.a)localObject).c());
      e.b localb;
      for (int i = 0; i < localCharSequence.length(); i = localb.a())
      {
        localb = new e.b(paramList, localCharSequence, parama, i).c();
        boolean bool = localb.d();
        localObject = localb.b();
        parama = (e.a)localObject;
        if (!bool) {
          parama = ((e.a)localObject).a(localCharSequence.subSequence(i, i + 1));
        }
      }
      localTreeSet.addAll(parama.a());
    }
    return new e.a(localTreeSet, null);
  }
  
  private static CharSequence a(CharSequence paramCharSequence)
  {
    return new e.1(paramCharSequence, (CharSequence[][])Array.newInstance(CharSequence.class, new int[] { paramCharSequence.length(), paramCharSequence.length() }));
  }
  
  private static String a(Iterable<String> paramIterable, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    paramIterable = paramIterable.iterator();
    if (paramIterable.hasNext()) {
      localStringBuilder.append((String)paramIterable.next());
    }
    while (paramIterable.hasNext()) {
      localStringBuilder.append(paramString).append((String)paramIterable.next());
    }
    return localStringBuilder.toString();
  }
  
  public b a()
  {
    return this.b;
  }
  
  public String a(String paramString)
  {
    return a(paramString, this.b.b(paramString));
  }
  
  public String a(String paramString, c.a parama)
  {
    Object localObject1 = g.a(this.c, h.c, parama);
    List localList1 = g.a(this.c, this.d, "common");
    List localList2 = g.a(this.c, this.d, parama);
    Object localObject2 = paramString.toLowerCase(Locale.ENGLISH).replace('-', ' ').trim();
    Iterator localIterator;
    if (this.c == d.b)
    {
      if ((((String)localObject2).length() >= 2) && (((String)localObject2).substring(0, 2).equals("d'")))
      {
        paramString = ((String)localObject2).substring(2);
        parama = "d" + paramString;
        return "(" + a(paramString) + ")-(" + a(parama) + ")";
      }
      localIterator = ((Set)a.get(this.c)).iterator();
      while (localIterator.hasNext())
      {
        paramString = (String)localIterator.next();
        if (((String)localObject2).startsWith(paramString + " "))
        {
          parama = ((String)localObject2).substring(paramString.length() + 1);
          paramString = paramString + parama;
          return "(" + a(parama) + ")-(" + a(paramString) + ")";
        }
      }
    }
    localObject2 = Arrays.asList(((String)localObject2).split("\\s+"));
    paramString = new ArrayList();
    switch (e.2.a[this.c.ordinal()])
    {
    default: 
      throw new IllegalStateException("Unreachable case: " + this.c);
    case 1: 
      localIterator = ((List)localObject2).iterator();
      while (localIterator.hasNext())
      {
        String[] arrayOfString = ((String)localIterator.next()).split("'");
        paramString.add(arrayOfString[(arrayOfString.length - 1)]);
      }
      paramString.removeAll((Collection)a.get(this.c));
      if (!this.e) {
        break;
      }
    }
    for (paramString = a(paramString, " ");; paramString = (String)((List)localObject2).iterator().next())
    {
      parama = e.a.a(parama);
      localObject2 = a(paramString);
      paramString = parama;
      int i = 0;
      while (i < ((CharSequence)localObject2).length())
      {
        paramString = new e.b((List)localObject1, (CharSequence)localObject2, paramString, i).c();
        i = paramString.a();
        paramString = paramString.b();
      }
      paramString.addAll((Collection)localObject2);
      paramString.removeAll((Collection)a.get(this.c));
      break;
      paramString.addAll((Collection)localObject2);
      break;
      if (paramString.size() != 1) {
        break label619;
      }
    }
    label619:
    parama = new StringBuilder();
    paramString = paramString.iterator();
    while (paramString.hasNext())
    {
      localObject1 = (String)paramString.next();
      parama.append("-").append(a((String)localObject1));
    }
    return parama.substring(1);
    return a(a(paramString, localList1), localList2).b();
  }
  
  public d b()
  {
    return this.c;
  }
  
  public h c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    return this.e;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */