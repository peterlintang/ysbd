package com.umeng.socialize.exception;

public class SocializeException
  extends RuntimeException
{
  private static final long b = -4656673116019167471L;
  protected int a = 5000;
  private String c = "";
  
  public SocializeException(int paramInt, String paramString)
  {
    super(paramString);
    this.a = paramInt;
    this.c = paramString;
  }
  
  public SocializeException(String paramString)
  {
    super(paramString);
    this.c = paramString;
  }
  
  public SocializeException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    this.c = paramString;
  }
  
  public int getErrorCode()
  {
    return this.a;
  }
  
  public String getMessage()
  {
    return this.c;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\exception\SocializeException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */