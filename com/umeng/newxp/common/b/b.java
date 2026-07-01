package com.umeng.newxp.common.b;

import com.umeng.newxp.common.a.a.d;
import com.umeng.newxp.common.c.a;
import java.util.Random;

public class b
{
  private static Random b = new Random();
  private String a = "XwYp8WL8bm6S4wu6yEYmLGy4RRRdJDIhxCBdk3CiNZTwGoj1bScVZEeVp9vBiiIsgwDtqZHP8QLoFM6o6MRYjW8QqyrZBI654mqoUk5SOLDyzordzOU5QhYguEJh54q3K1KqMEXpdEQJJjs1Urqjm2s4jgPfCZ4hMuIjAMRrEQluA7FeoqWMJOwghcLcPVleQ8PLzAcaKidybmwhvNAxIyKRpbZlcDjNCcUvsJYvyzEA9VUIaHkIAJ62lpA3EE3H";
  
  public static String a()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < 24)
    {
      localStringBuffer.append((char)(b.nextInt(25) + 65));
      i += 1;
    }
    return localStringBuffer.toString();
  }
  
  public String a(String paramString)
  {
    paramString = a.b(this.a, paramString);
    if (paramString != null) {
      return paramString;
    }
    return a();
  }
  
  public String a(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = d.f(paramArrayOfByte);
    return a.a(this.a, paramArrayOfByte);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */