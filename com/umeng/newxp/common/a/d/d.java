package com.umeng.newxp.common.a.d;

import com.umeng.newxp.common.a.a.l;
import com.umeng.newxp.common.a.e;

abstract class d
{
  protected static final char a = '?';
  protected static final String b = "?=";
  protected static final String c = "=?";
  
  protected abstract String a();
  
  protected abstract byte[] a(byte[] paramArrayOfByte);
  
  protected String b(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("=?");
    localStringBuffer.append(paramString2);
    localStringBuffer.append('?');
    localStringBuffer.append(a());
    localStringBuffer.append('?');
    localStringBuffer.append(l.b(a(paramString1.getBytes(paramString2))));
    localStringBuffer.append("?=");
    return localStringBuffer.toString();
  }
  
  protected abstract byte[] b(byte[] paramArrayOfByte);
  
  protected String c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if ((!paramString.startsWith("=?")) || (!paramString.endsWith("?="))) {
      throw new e("RFC 1522 violation: malformed encoded content");
    }
    int i = paramString.length() - 2;
    int j = paramString.indexOf('?', 2);
    if (j == i) {
      throw new e("RFC 1522 violation: charset token not found");
    }
    String str1 = paramString.substring(2, j);
    if (str1.equals("")) {
      throw new e("RFC 1522 violation: charset not specified");
    }
    j += 1;
    int k = paramString.indexOf('?', j);
    if (k == i) {
      throw new e("RFC 1522 violation: encoding token not found");
    }
    String str2 = paramString.substring(j, k);
    if (!a().equalsIgnoreCase(str2)) {
      throw new e("This codec cannot decode " + str2 + " encoded content");
    }
    i = k + 1;
    return new String(b(l.b(paramString.substring(i, paramString.indexOf('?', i)))), str1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */