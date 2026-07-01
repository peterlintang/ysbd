package com.ireadercity.b2.b;

import java.io.File;
import java.io.FilenameFilter;

final class p
  implements FilenameFilter
{
  p(n paramn) {}
  
  public final boolean accept(File paramFile, String paramString)
  {
    return paramString.toLowerCase().endsWith("pdf");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */