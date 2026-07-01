package com.umeng.socialize.view.controller;

import java.util.Iterator;
import java.util.List;

class e
  implements d.b
{
  e(d paramd) {}
  
  public void a(d.c paramc)
  {
    Iterator localIterator;
    if (d.a(this.a) != null) {
      localIterator = d.a(this.a).iterator();
    }
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      ((d.b)localIterator.next()).a(paramc);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\controller\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */