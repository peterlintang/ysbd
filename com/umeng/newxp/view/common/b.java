package com.umeng.newxp.view.common;

import android.app.Dialog;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a.c;
import com.umeng.newxp.a.d;
import com.umeng.newxp.a.e;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.controller.ExchangeDataService;

public class b
  extends Dialog
{
  static int a;
  private Context b;
  private int c;
  private b.a d;
  
  public b(Context paramContext, Promoter paramPromoter, int paramInt1, int paramInt2, ExchangeDataService paramExchangeDataService, int paramInt3, b.a parama)
  {
    super(paramContext, paramInt3);
    this.b = paramContext;
    this.c = paramInt1;
    this.d = parama;
    setContentView(d.d(paramContext));
    ((TextView)findViewById(c.s(this.b))).setText(" 开发:" + paramPromoter.provider);
    ((TextView)findViewById(c.t(this.b))).setText(" 名称:" + paramPromoter.title);
    paramContext = (TextView)findViewById(c.p(this.b));
    if (ExchangeConstants.show_size)
    {
      paramContext.setText(com.umeng.common.ufp.util.g.a(this.b, paramPromoter.size));
      paramContext = (TextView)findViewById(c.v(this.b));
      paramContext.setText(paramPromoter.description);
      paramContext.setMovementMethod(ScrollingMovementMethod.getInstance());
      paramContext = (ImageView)findViewById(c.m(this.b));
      com.umeng.common.ufp.net.g.a(this.b, paramContext, paramPromoter.icon, false);
      paramContext = (Button)findViewById(c.k(this.b));
      switch (b.3.a[parama.ordinal()])
      {
      }
    }
    for (;;)
    {
      paramContext.setOnClickListener(new b.1(this, paramPromoter, paramInt2, paramExchangeDataService));
      ((Button)findViewById(c.j(this.b))).setOnClickListener(new b.2(this));
      return;
      paramContext.setVisibility(8);
      break;
      paramContext.setText(e.m(this.b));
      continue;
      paramContext.setText(e.n(this.b));
    }
  }
  
  public static int a(Context paramContext, int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 6: 
    case 8: 
    case 9: 
    default: 
      return 2;
    case 7: 
      return 3;
    }
    return 3;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */