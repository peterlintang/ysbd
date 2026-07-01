package com.umeng.socialize.view.a;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.m;

public abstract class at$b
{
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  private Dialog a;
  private Context e;
  private n f = null;
  private int g;
  private View h;
  private boolean i = false;
  private boolean j = false;
  private AlertDialog.Builder k;
  
  public at$b(Context paramContext)
  {
    this.e = paramContext;
    this.j = m.d(paramContext);
    if (!this.j)
    {
      this.a = b(this.e);
      return;
    }
    this.a = a(this.e);
  }
  
  private Dialog a(Context paramContext)
  {
    this.k = new AlertDialog.Builder(paramContext).setCancelable(false).setPositiveButton("是", new av(this)).setNegativeButton("否", new aw(this)).setOnCancelListener(new ax(this));
    return this.k.create();
  }
  
  private Dialog b(Context paramContext)
  {
    this.h = View.inflate(paramContext, b.a(paramContext, b.a.a, "umeng_socialize_base_alert_dialog_button"), null);
    Button localButton1 = (Button)this.h.findViewById(b.a(paramContext, b.a.b, "umeng_socialize_alert_button"));
    View localView = View.inflate(paramContext, b.a(paramContext, b.a.a, "umeng_socialize_base_alert_dialog_button"), null);
    Button localButton2 = (Button)localView.findViewById(b.a(paramContext, b.a.b, "umeng_socialize_alert_button"));
    localButton2.setText("取消");
    localButton2.setBackgroundResource(b.a(paramContext, b.a.c, "umeng_socialize_button_grey_blue"));
    localButton2.setOnClickListener(new ay(this));
    localButton1.setOnClickListener(new az(this));
    paramContext = new aa.a(paramContext);
    paramContext.b(this.h, null);
    paramContext.b(localView, null);
    paramContext = (aa)paramContext.a();
    paramContext.a(new ba(this));
    return paramContext;
  }
  
  public abstract void a(n paramn);
  
  public void a(n paramn, int paramInt)
  {
    this.f = paramn;
    if (this.g != paramInt)
    {
      this.g = paramInt;
      switch (paramInt)
      {
      }
    }
    for (;;)
    {
      m.a(this.a, false);
      return;
      if (this.j)
      {
        this.a = this.k.setMessage("你确定绑定" + paramn.b + "?").create();
      }
      else
      {
        paramn = (Button)this.h.findViewById(b.a(this.e, b.a.b, "umeng_socialize_alert_button"));
        paramn.setText("绑定");
        paramn.setBackgroundResource(b.a(this.e, b.a.c, "umeng_socialize_button_white_blue"));
        continue;
        if (this.j)
        {
          this.a = this.k.setMessage("你确定解除" + paramn.b + "绑定?").create();
        }
        else
        {
          paramn = (Button)this.h.findViewById(b.a(this.e, b.a.b, "umeng_socialize_alert_button"));
          paramn.setText("解除绑定");
          paramn.setBackgroundResource(b.a(this.e, b.a.c, "umeng_socialize_button_red_blue"));
          continue;
          if (this.j)
          {
            this.a = this.k.setMessage("你确定解除" + paramn.b + "授权?").create();
          }
          else
          {
            paramn = (Button)this.h.findViewById(b.a(this.e, b.a.b, "umeng_socialize_alert_button"));
            paramn.setText("解除授权");
            paramn.setBackgroundResource(b.a(this.e, b.a.c, "umeng_socialize_button_red_blue"));
          }
        }
      }
    }
  }
  
  protected void a(n paramn, boolean paramBoolean) {}
  
  public abstract void b(n paramn);
  
  public abstract void c(n paramn);
  
  protected void d(n paramn)
  {
    this.i = false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\at$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */