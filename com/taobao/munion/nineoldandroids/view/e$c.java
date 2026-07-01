package com.taobao.munion.nineoldandroids.view;

import java.util.ArrayList;

class e$c
{
  int a;
  ArrayList<e.b> b;
  
  e$c(int paramInt, ArrayList<e.b> paramArrayList)
  {
    this.a = paramInt;
    this.b = paramArrayList;
  }
  
  boolean a(int paramInt)
  {
    if (((this.a & paramInt) != 0) && (this.b != null))
    {
      int j = this.b.size();
      int i = 0;
      while (i < j)
      {
        if (((e.b)this.b.get(i)).a == paramInt)
        {
          this.b.remove(i);
          this.a &= (paramInt ^ 0xFFFFFFFF);
          return true;
        }
        i += 1;
      }
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\view\e$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */