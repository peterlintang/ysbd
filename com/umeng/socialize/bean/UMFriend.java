package com.umeng.socialize.bean;

public class UMFriend
{
  private int a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private UMFriend.a g;
  public char group;
  private long h;
  private boolean i = true;
  
  public String getFid()
  {
    return this.b;
  }
  
  public String getIcon()
  {
    return this.e;
  }
  
  public int getId()
  {
    return this.a;
  }
  
  public long getLast_at_time()
  {
    return this.h;
  }
  
  public String getLink_name()
  {
    return this.d;
  }
  
  public String getName()
  {
    return this.c;
  }
  
  public UMFriend.a getPinyin()
  {
    return this.g;
  }
  
  public String getUsid()
  {
    return this.f;
  }
  
  public boolean isAlive()
  {
    return this.i;
  }
  
  public boolean isEquals(String paramString)
  {
    return (paramString != null) && (paramString.equals(Character.valueOf(this.group)));
  }
  
  public final boolean isUpdate(UMFriend paramUMFriend)
  {
    if (paramUMFriend == null) {}
    do
    {
      return false;
      if (paramUMFriend.getLast_at_time() > this.h) {
        return true;
      }
      if (paramUMFriend.isAlive() != isAlive()) {
        return true;
      }
      if (!paramUMFriend.getName().equals(this.c)) {
        return true;
      }
    } while ((paramUMFriend.getIcon() == null) || (paramUMFriend.getIcon().equals(this.e)));
    return true;
  }
  
  public void setAlive(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public void setFid(String paramString)
  {
    this.b = paramString;
  }
  
  public void setIcon(String paramString)
  {
    this.e = paramString;
  }
  
  public void setId(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void setLast_at_time(long paramLong)
  {
    this.h = paramLong;
  }
  
  public void setLink_name(String paramString)
  {
    this.d = paramString;
  }
  
  public void setName(String paramString)
  {
    this.c = paramString;
  }
  
  public void setPinyin(UMFriend.a parama)
  {
    this.g = parama;
    if (parama != null) {
      this.group = parama.b.charAt(0);
    }
  }
  
  public void setUsid(String paramString)
  {
    this.f = paramString;
  }
  
  public char upGroup()
  {
    if ((this.group == 0) && (this.g != null)) {
      this.group = this.g.b.charAt(0);
    }
    if (this.group != 0)
    {
      char c1 = this.group;
      if ((('@' < c1) && (c1 < '[')) || (('`' < c1) && (c1 < '{'))) {}
      while (c1 == "常".charAt(0)) {
        return c1;
      }
    }
    return "符".charAt(0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\UMFriend.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */