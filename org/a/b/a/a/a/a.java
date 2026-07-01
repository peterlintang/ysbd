package org.a.b.a.a.a;

public abstract class a
  implements c
{
  private final String a;
  private final String b;
  private final String c;
  
  public a(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("MIME type may not be null");
    }
    this.a = paramString;
    int i = paramString.indexOf('/');
    if (i != -1)
    {
      this.b = paramString.substring(0, i);
      this.c = paramString.substring(i + 1);
      return;
    }
    this.b = paramString;
    this.c = null;
  }
  
  public final String a()
  {
    return this.a;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\a\b\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */