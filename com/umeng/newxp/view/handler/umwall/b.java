package com.umeng.newxp.view.handler.umwall;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import com.umeng.newxp.view.handler.umwall.holder.d;
import com.umeng.newxp.view.handler.umwall.holder.e;
import com.umeng.newxp.view.handler.umwall.holder.f;
import com.umeng.newxp.view.widget.PullToRefreshGridView;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class b
{
  private static final String a = b.class.getName();
  
  public static AttributeSet a(Context paramContext, String paramString, int paramInt)
  {
    paramContext = paramContext.getResources().getXml(paramInt);
    for (;;)
    {
      try
      {
        paramInt = paramContext.next();
        if ((paramInt == 2) && (paramContext.getName().equals(paramString)))
        {
          paramContext = Xml.asAttributeSet(paramContext);
          return paramContext;
        }
      }
      catch (XmlPullParserException paramContext)
      {
        paramContext.printStackTrace();
        paramContext = a;
        return null;
      }
      catch (IOException paramContext)
      {
        paramContext.printStackTrace();
        continue;
      }
      if (paramInt != 1) {}
    }
  }
  
  public static View a(Context paramContext, com.umeng.newxp.c paramc)
  {
    switch (b.1.a[paramc.ordinal()])
    {
    default: 
      return View.inflate(paramContext, UMWallRes.layout_umeng_xp_hl_template_list(paramContext), null);
    case 1: 
      return new PullToRefreshGridView(paramContext, a(paramContext, "com.umeng.newxp.view.widget.PullToRefreshGridView", UMWallRes.layout_umeng_xp_hl_template_grid_waterflow(paramContext)));
    }
    return new PullToRefreshGridView(paramContext, a(paramContext, "com.umeng.newxp.view.widget.PullToRefreshGridView", UMWallRes.layout_umeng_xp_hl_template_grid_app(paramContext)));
  }
  
  public static Class<? extends com.umeng.newxp.view.handler.a> a(com.umeng.newxp.c paramc, com.umeng.newxp.b paramb, int paramInt)
  {
    switch (b.1.a[paramc.ordinal()])
    {
    default: 
      return com.umeng.newxp.view.handler.umwall.holder.a.class;
    case 1: 
      return f.class;
    case 3: 
      return com.umeng.newxp.view.handler.umwall.holder.b.class;
    case 2: 
      return com.umeng.newxp.view.handler.umwall.holder.c.class;
    }
    switch (b.1.b[paramb.ordinal()])
    {
    default: 
      return com.umeng.newxp.view.handler.umwall.holder.a.class;
    }
    if (10 == paramInt) {
      return e.class;
    }
    return d.class;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */