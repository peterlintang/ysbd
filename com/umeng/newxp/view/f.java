package com.umeng.newxp.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.umeng.common.ufp.Log;
import java.util.ArrayList;
import java.util.List;

public class f
  implements e
{
  static Drawable[] a;
  static int b = 0;
  private static final String e = f.class.getSimpleName();
  int c;
  List<f.a> d;
  
  public static f a(List<f.a> paramList)
  {
    f localf = new f();
    localf.d = paramList;
    if ((paramList == null) && (a != null))
    {
      paramList = new ArrayList();
      Drawable[] arrayOfDrawable = a;
      int j = arrayOfDrawable.length;
      int i = 0;
      while (i < j)
      {
        paramList.add(new f.a(null, arrayOfDrawable[i]));
        i += 1;
      }
    }
    return localf;
  }
  
  public int a()
  {
    return this.d.size();
  }
  
  public Drawable a(int paramInt)
  {
    return ((f.a)this.d.get(paramInt)).b;
  }
  
  public View a(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    Drawable localDrawable = a(paramInt3);
    paramInt1 -= 10;
    paramInt3 = localDrawable.getIntrinsicHeight();
    int i = localDrawable.getIntrinsicWidth();
    RelativeLayout localRelativeLayout = new RelativeLayout(paramContext);
    localRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    RelativeLayout.LayoutParams localLayoutParams;
    if (i > paramInt3)
    {
      float f = paramInt1 / i;
      localLayoutParams = new RelativeLayout.LayoutParams(paramInt1, (int)(paramInt3 * f));
      localLayoutParams.addRule(14);
    }
    for (;;)
    {
      localLayoutParams.addRule(15);
      paramContext = new h(paramContext);
      paramContext.a(localDrawable);
      localRelativeLayout.addView(paramContext, localLayoutParams);
      return localRelativeLayout;
      localLayoutParams = new RelativeLayout.LayoutParams((int)(paramInt2 / paramInt3 * i), paramInt2);
      localLayoutParams.addRule(14);
    }
  }
  
  public View a(Context paramContext, HorizontalStrip paramHorizontalStrip, int paramInt)
  {
    h localh = new h(paramContext);
    Drawable localDrawable = a(paramInt);
    int i = localDrawable.getIntrinsicHeight();
    int j = localDrawable.getIntrinsicWidth();
    float f = this.c / i;
    j = (int)(j * f);
    localh.setLayoutParams(new ViewGroup.LayoutParams(j, -1));
    Log.a(e, "getView at pos=" + paramInt + " viewWidth=" + j + "    dh=" + i + " totalH=" + this.c);
    localh.setBackgroundColor(-12303292);
    localh.setOnClickListener(new f.1(this, paramContext, paramHorizontalStrip, paramInt));
    return localh;
  }
  
  public void a(int paramInt, c paramc, float paramFloat)
  {
    Drawable localDrawable = a(paramInt);
    paramc.b(localDrawable.getIntrinsicHeight());
    paramc.a(localDrawable.getIntrinsicWidth());
  }
  
  public void a(HorizontalStrip.a parama) {}
  
  public void b(int paramInt)
  {
    this.c = paramInt;
  }
  
  public boolean b()
  {
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */