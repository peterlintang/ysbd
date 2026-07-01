package com.umeng.newxp.view.feed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.HorizontalStrip;
import com.umeng.newxp.view.HorizontalStrip.a;
import com.umeng.newxp.view.c;
import com.umeng.newxp.view.e;
import java.util.List;

public class d
  implements e
{
  List<Promoter> a;
  int b;
  ExchangeDataService c;
  
  public d(List<Promoter> paramList, int paramInt, ExchangeDataService paramExchangeDataService)
  {
    this.a = paramList;
    this.b = paramInt;
    this.c = paramExchangeDataService;
  }
  
  public int a()
  {
    return this.a.size();
  }
  
  public Drawable a(int paramInt)
  {
    return null;
  }
  
  public View a(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    return null;
  }
  
  public View a(Context paramContext, HorizontalStrip paramHorizontalStrip, int paramInt)
  {
    paramContext = new a(paramContext, (Promoter)this.a.get(paramInt));
    paramContext.a(this.c);
    paramContext.setLayoutParams(new ViewGroup.LayoutParams(this.b, -1));
    return paramContext;
  }
  
  public void a(int paramInt, c paramc, float paramFloat) {}
  
  public void a(HorizontalStrip.a parama) {}
  
  public void b(int paramInt) {}
  
  public boolean b()
  {
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */