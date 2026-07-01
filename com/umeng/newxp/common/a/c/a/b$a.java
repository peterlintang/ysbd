package com.umeng.newxp.common.a.c.a;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class b$a
{
  private final boolean a;
  private final Set<String> b;
  private final Pattern c;
  
  private b$a(Pattern paramPattern, Set<String> paramSet, boolean paramBoolean)
  {
    this.c = paramPattern;
    this.b = paramSet;
    this.a = paramBoolean;
  }
  
  public final boolean a(String paramString)
  {
    return this.c.matcher(paramString).find();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */