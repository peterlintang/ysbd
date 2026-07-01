package com.youloft.natize;

public class PDF$Size
  implements Cloneable
{
  public int height;
  public int width;
  
  public PDF$Size()
  {
    this.width = 0;
    this.height = 0;
  }
  
  public PDF$Size(int paramInt1, int paramInt2)
  {
    this.width = paramInt1;
    this.height = paramInt2;
  }
  
  public Size clone()
  {
    return new Size(this.width, this.height);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\youloft\natize\PDF$Size.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */