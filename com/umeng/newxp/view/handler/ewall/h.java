package com.umeng.newxp.view.handler.ewall;

import android.content.Context;
import android.view.View;
import com.umeng.newxp.b;

public final class h
{
  public static View a(Context paramContext, com.umeng.newxp.c paramc)
  {
    switch (h.1.a[paramc.ordinal()])
    {
    default: 
      return View.inflate(paramContext, c.g(paramContext), null);
    case 1: 
      return View.inflate(paramContext, c.f(paramContext), null);
    }
    return View.inflate(paramContext, c.g(paramContext), null);
  }
  
  public static Class<? extends com.umeng.newxp.view.handler.a> a(com.umeng.newxp.c paramc, b paramb)
  {
    switch (h.1.a[paramc.ordinal()])
    {
    default: 
      return a.class;
    }
    return a.class;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */