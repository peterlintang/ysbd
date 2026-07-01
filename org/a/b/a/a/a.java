package org.a.b.a.a;

import org.a.b.a.a.a.c;

public final class a
{
  private final String a;
  private final b b;
  private final c c;
  
  public a(String paramString, c paramc)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Name may not be null");
    }
    if (paramc == null) {
      throw new IllegalArgumentException("Body may not be null");
    }
    this.a = paramString;
    this.c = paramc;
    this.b = new b();
    paramString = new StringBuilder();
    paramString.append("form-data; name=\"");
    paramString.append(this.a);
    paramString.append("\"");
    if (paramc.b() != null)
    {
      paramString.append("; filename=\"");
      paramString.append(paramc.b());
      paramString.append("\"");
    }
    a("Content-Disposition", paramString.toString());
    paramString = new StringBuilder();
    paramString.append(paramc.a());
    if (paramc.c() != null)
    {
      paramString.append("; charset=");
      paramString.append(paramc.c());
    }
    a("Content-Type", paramString.toString());
    a("Content-Transfer-Encoding", paramc.d());
  }
  
  private void a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      throw new IllegalArgumentException("Field name may not be null");
    }
    this.b.a(new g(paramString1, paramString2));
  }
  
  public final c a()
  {
    return this.c;
  }
  
  public final b b()
  {
    return this.b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\a\b\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */