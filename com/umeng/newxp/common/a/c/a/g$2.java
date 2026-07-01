package com.umeng.newxp.common.a.c.a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class g$2
  implements g.d
{
  Pattern a = Pattern.compile(this.b);
  
  g$2(String paramString) {}
  
  public final boolean a(CharSequence paramCharSequence)
  {
    return this.a.matcher(paramCharSequence).find();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\g$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */