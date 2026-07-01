package org.mozilla.intl.chardet;

import java.io.PrintStream;

final class a
  implements nsICharsetDetectionObserver
{
  public final void Notify(String paramString)
  {
    HtmlCharsetDetector.found = true;
    System.out.println("CHARSET = " + paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\mozilla\intl\chardet\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */