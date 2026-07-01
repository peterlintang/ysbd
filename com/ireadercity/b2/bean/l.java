package com.ireadercity.b2.bean;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class l
{
  static List<k> a = null;
  static List<k> b = null;
  static List<k> c = null;
  
  public static int a(int paramInt, List<k> paramList)
  {
    Iterator localIterator = paramList.iterator();
    int i = 0;
    if (localIterator.hasNext()) {
      if (((k)localIterator.next()).a != paramInt) {}
    }
    while (i != paramList.size())
    {
      return i;
      i += 1;
      break;
    }
    return i - 1;
  }
  
  public static k a(int paramInt)
  {
    k localk = null;
    if (a == null) {
      a(null);
    }
    if (paramInt <= a.size()) {
      localk = (k)a.get(paramInt - 1);
    }
    return localk;
  }
  
  public static List<k> a()
  {
    return b;
  }
  
  public static void a(Context paramContext)
  {
    a = new ArrayList();
    b = new ArrayList();
    c = new ArrayList();
    Object localObject = new k(1, 2131230855, "#331500", 2130837955, "#f5f5f5", 0);
    a.add(localObject);
    b.add(localObject);
    localObject = new k(2, 2131230856, "#737554", 2130837939, "#dfdbc3", 0);
    a.add(localObject);
    b.add(localObject);
    localObject = new k(3, 2131230857, "#331500", 2130837948, "#efe2b6", 0);
    a.add(localObject);
    b.add(localObject);
    localObject = new k(4, 2131230858, "#CCCCCC", 2130837950, "#782d24", 0);
    a.add(localObject);
    b.add(localObject);
    localObject = new k(5, 2131230861, "#CCCCCC", 2130837949, "#3662c9", 0);
    a.add(localObject);
    b.add(localObject);
    localObject = new k(6, 2131230864, "#7b7979", 2130837935, "#111111", 1);
    a.add(localObject);
    c.add(localObject);
    localObject = new k(7, 2131230865, "#7b7979", 2130837952, "#1b447a", 1);
    a.add(localObject);
    c.add(localObject);
    localObject = new k(8, 2131230859, "#28FF14", 2130837935, "#111111", 0);
    a.add(localObject);
    b.add(localObject);
    c.add(localObject);
    localObject = new k(9, 2131230860, "#4D2F2E", 2130837939, "#dfdbc3", 0);
    a.add(localObject);
    b.add(localObject);
    c.add(localObject);
    localObject = new k(10, 2131230863, "#D7C9A7", 2130837950, "#782d24", 0);
    a.add(localObject);
    b.add(localObject);
    c.add(localObject);
    localObject = new k(11, 2131230866, "#331500", 2130837932, "#fff8e5", 0);
    a.add(localObject);
    b.add(localObject);
    localObject = new k(12, 2131230868, "#331500", 2130837934, "#c1ad78", 0);
    a.add(localObject);
    b.add(localObject);
    localObject = new k(13, 2131230872, "#7b7979", 2130837942, "#ccbf92", 1);
    a.add(localObject);
    c.add(localObject);
    localObject = new k(14, 2131230875, "#7b7979", 2130837945, "#1c1c1e", 1);
    a.add(localObject);
    c.add(localObject);
    localObject = new k(15, 2131230876, "#7b7979", 2130837947, "#2c1d18", 1);
    a.add(localObject);
    c.add(localObject);
    localObject = new k(16, 2131230877, "#321d00", 2130837528, "#f6e9d9", 0);
    a.add(localObject);
    b.add(localObject);
    localObject = new k(17, 2131230878, "#000000", 2130837529, "#f5f5f5", 0);
    a.add(localObject);
    b.add(localObject);
    localObject = new k(18, 2131230879, "#333333", 2130837530, "#f5f2ed", 0);
    a.add(localObject);
    b.add(localObject);
    localObject = new k(19, 2131230880, "#333333", 2130837531, "#e0e0e0", 0);
    a.add(localObject);
    b.add(localObject);
    localObject = new k(20, 2131230881, "#333333", 2130837532, "#eeeeee", 0);
    a.add(localObject);
    b.add(localObject);
    localObject = new k(21, 2131230882, "#dcdcdc", 2130837533, "#9e744e", 1);
    a.add(localObject);
    c.add(localObject);
    localObject = new k(22, 2131230883, "#979797", 2130837534, "#1c1c1e", 1);
    a.add(localObject);
    c.add(localObject);
    localObject = new k(23, 2131230884, "#b0b0b0", 2130837535, "#232323", 1);
    a.add(localObject);
    c.add(localObject);
    localObject = new k(24, 2131230885, "#b0b0b0", 2130837536, "#252525", 1);
    a.add(localObject);
    c.add(localObject);
    localObject = new k(25, 2131230886, "#b0b0b0", 2130837537, "#020202", 1);
    a.add(localObject);
    c.add(localObject);
    if (paramContext != null)
    {
      localObject = a.iterator();
      while (((Iterator)localObject).hasNext())
      {
        k localk = (k)((Iterator)localObject).next();
        localk.c = paramContext.getResources().getString(localk.b);
      }
    }
  }
  
  public static List<k> b()
  {
    return c;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\bean\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */