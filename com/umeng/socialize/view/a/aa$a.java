package com.umeng.socialize.view.a;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;

public class aa$a
{
  private Context a;
  private View b;
  private TextView c;
  private ViewGroup d;
  private ViewGroup e;
  
  public aa$a(Context paramContext)
  {
    this.a = paramContext;
    this.b = View.inflate(paramContext, b.a(paramContext, b.a.a, "umeng_socialize_base_alert_dialog"), null);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(12);
    this.b.setLayoutParams(localLayoutParams);
    this.d = ((ViewGroup)this.b.findViewById(b.a(paramContext, b.a.b, "umeng_socialize_alert_footer")));
    this.e = ((ViewGroup)this.b.findViewById(b.a(paramContext, b.a.b, "umeng_socialize_alert_body")));
    this.c = ((TextView)this.b.findViewById(b.a(paramContext, b.a.b, "umeng_socialize_tipinfo")));
  }
  
  public Dialog a()
  {
    return new aa(this.a, this.b);
  }
  
  public a a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams == null)
    {
      this.e.addView(paramView);
      return this;
    }
    this.e.addView(paramView, paramLayoutParams);
    return this;
  }
  
  public a a(String paramString)
  {
    this.c.setText(paramString);
    this.c.setVisibility(0);
    return this;
  }
  
  public a b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams == null)
    {
      this.d.addView(paramView);
      return this;
    }
    this.d.addView(paramView, paramLayoutParams);
    return this;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\aa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */