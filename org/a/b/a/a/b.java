package org.a.b.a.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class b
  implements Iterable<g>
{
  private final List<g> a = new LinkedList();
  private final Map<String, List<g>> b = new HashMap();
  
  public final g a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = paramString.toLowerCase(Locale.US);
    paramString = (List)this.b.get(paramString);
    if ((paramString != null) && (!paramString.isEmpty())) {
      return (g)paramString.get(0);
    }
    return null;
  }
  
  public final void a(g paramg)
  {
    if (paramg == null) {
      return;
    }
    String str = paramg.a().toLowerCase(Locale.US);
    List localList = (List)this.b.get(str);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new LinkedList();
      this.b.put(str, localObject);
    }
    ((List)localObject).add(paramg);
    this.a.add(paramg);
  }
  
  public final Iterator<g> iterator()
  {
    return Collections.unmodifiableList(this.a).iterator();
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\a\b\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */