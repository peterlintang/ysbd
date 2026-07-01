package com.ireadercity.b2.b;

import org.mozilla.intl.chardet.nsICharsetDetectionObserver;

final class e
  implements nsICharsetDetectionObserver
{
  public final void Notify(String paramString)
  {
    org.mozilla.intl.chardet.HtmlCharsetDetector.found = true;
    d.b(paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */