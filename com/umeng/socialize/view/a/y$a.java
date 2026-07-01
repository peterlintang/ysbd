package com.umeng.socialize.view.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;

public abstract class y$a
{
  private Context a;
  private View b;
  private ViewGroup c;
  private ViewGroup d;
  private View e;
  private int[] f;
  
  public y$a(Context paramContext)
  {
    this.a = paramContext;
    this.b = View.inflate(paramContext, b.a(paramContext, b.a.a, "umeng_socialize_full_alert_dialog"), null);
    this.c = ((ViewGroup)this.b.findViewById(b.a(paramContext, b.a.b, "umeng_socialize_first_area")));
    this.d = ((ViewGroup)this.b.findViewById(b.a(paramContext, b.a.b, "umeng_socialize_second_area")));
    this.e = this.b.findViewById(b.a(paramContext, b.a.b, "umeng_socialize_title"));
    a(this.e);
  }
  
  public a a(int paramInt)
  {
    this.c.setVisibility(paramInt);
    ((TextView)this.b.findViewById(b.a(this.a, b.a.b, "umeng_socialize_first_area_title"))).setVisibility(paramInt);
    return this;
  }
  
  public a a(int paramInt1, int paramInt2)
  {
    this.f = new int[] { paramInt1, paramInt2 };
    return this;
  }
  
  public a a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams == null)
    {
      this.c.addView(paramView);
      return this;
    }
    this.c.addView(paramView, paramLayoutParams);
    return this;
  }
  
  public a a(String paramString)
  {
    TextView localTextView = (TextView)this.b.findViewById(b.a(this.a, b.a.b, "umeng_socialize_first_area_title"));
    if (TextUtils.isEmpty(paramString))
    {
      localTextView.setVisibility(8);
      return this;
    }
    localTextView.setText(paramString);
    return this;
  }
  
  public y a()
  {
    ViewGroup localViewGroup;
    if (this.c.getChildCount() > 0)
    {
      localViewGroup = (ViewGroup)this.c.getChildAt(this.c.getChildCount() - 1);
      localViewGroup.removeView(localViewGroup.findViewById(b.a(this.a, b.a.b, "umeng_socialize_full_alert_dialog_divider")));
    }
    if (this.d.getChildCount() > 0)
    {
      localViewGroup = (ViewGroup)this.d.getChildAt(this.d.getChildCount() - 1);
      localViewGroup.removeView(localViewGroup.findViewById(b.a(this.a, b.a.b, "umeng_socialize_full_alert_dialog_divider")));
    }
    return new y(this.a, this.b, this.f);
  }
  
  public abstract void a(View paramView);
  
  public a b(int paramInt)
  {
    this.d.setVisibility(paramInt);
    ((TextView)this.b.findViewById(b.a(this.a, b.a.b, "umeng_socialize_second_area_title"))).setVisibility(paramInt);
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
  
  public a b(String paramString)
  {
    TextView localTextView = (TextView)this.b.findViewById(b.a(this.a, b.a.b, "umeng_socialize_second_area_title"));
    if (TextUtils.isEmpty(paramString))
    {
      localTextView.setVisibility(8);
      return this;
    }
    localTextView.setText(paramString);
    return this;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\y$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */