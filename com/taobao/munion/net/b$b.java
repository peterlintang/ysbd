package com.taobao.munion.net;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class b$b
{
  static final int a = 10;
  long b = 0L;
  long c = 0L;
  long d = 0L;
  List<b.a> e = new ArrayList();
  
  b$b(b paramb) {}
  
  Boolean a(long paramLong)
  {
    if (paramLong == 0L) {
      return Boolean.valueOf(false);
    }
    if (this.e.size() < 10) {
      return Boolean.valueOf(true);
    }
    Iterator localIterator = this.e.iterator();
    long l = 0L;
    b.a locala;
    while (localIterator.hasNext())
    {
      locala = (b.a)localIterator.next();
      if (l == 0L)
      {
        l = locala.b;
      }
      else
      {
        if (l <= locala.b) {
          break label196;
        }
        l = locala.b;
      }
    }
    label196:
    for (;;)
    {
      break;
      localIterator = this.e.iterator();
      while (localIterator.hasNext())
      {
        locala = (b.a)localIterator.next();
        if (paramLong > locala.b) {
          return Boolean.valueOf(true);
        }
        if (paramLong == locala.b)
        {
          if (locala.b > l) {
            return Boolean.valueOf(true);
          }
          if (this.e.size() < 10) {
            return Boolean.valueOf(true);
          }
        }
      }
      return Boolean.valueOf(false);
    }
  }
  
  void a()
  {
    this.d = 0L;
    this.e.clear();
  }
  
  void a(String paramString, long paramLong)
  {
    int i = 0;
    int k = this.e.size();
    b.a locala;
    if (k < 10)
    {
      locala = new b.a(this.f);
      locala.a = paramString;
      locala.b = paramLong;
      this.e.add(locala);
    }
    while (k != 10) {
      return;
    }
    int j = 0;
    long l = 0L;
    if (i < k)
    {
      locala = (b.a)this.e.get(i);
      if (l == 0L)
      {
        l = locala.b;
        j = i;
      }
    }
    for (;;)
    {
      i += 1;
      break;
      if (l > locala.b)
      {
        l = locala.b;
        j = i;
        continue;
        locala = (b.a)this.e.get(j);
        locala.a = paramString;
        locala.b = paramLong;
        return;
      }
    }
  }
  
  String b()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(String.valueOf(this.d)).append(",");
    int j = this.e.size();
    int i = 0;
    while (i < j)
    {
      b.a locala = (b.a)this.e.get(i);
      localStringBuffer.append(locala.a).append("_").append(String.valueOf(locala.b));
      if (i != j - 1) {
        localStringBuffer.append(",");
      }
      i += 1;
    }
    return localStringBuffer.toString();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\b$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */