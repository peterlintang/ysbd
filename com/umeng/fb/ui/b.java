package com.umeng.fb.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.umeng.fb.a.b;
import com.umeng.fb.b.c;
import com.umeng.fb.b.d;
import com.umeng.fb.b.e;
import java.util.List;

public class b
  extends BaseAdapter
{
  Context a;
  LayoutInflater b;
  String c;
  String d = "FeedbackAdapter";
  com.umeng.fb.b e;
  
  public b(Context paramContext, com.umeng.fb.b paramb)
  {
    this.a = paramContext;
    this.e = paramb;
    this.b = LayoutInflater.from(paramContext);
  }
  
  private void a(com.umeng.fb.a parama, TextView paramTextView)
  {
    switch (b.1.a[parama.g.ordinal()])
    {
    default: 
      parama = com.umeng.fb.util.a.b(parama.e, this.a);
      if ("".equals(parama))
      {
        paramTextView.setText("");
        return;
      }
      break;
    case 1: 
      paramTextView.setText(this.a.getString(e.t(this.a)));
      paramTextView.setTextColor(-7829368);
      return;
    case 2: 
      paramTextView.setText(this.a.getString(e.u(this.a)));
      paramTextView.setTextColor(-65536);
      return;
    case 3: 
      paramTextView.setText(this.a.getString(e.v(this.a)));
      paramTextView.setTextColor(-65536);
      return;
    }
    paramTextView.setText(parama);
    paramTextView.setTextColor(-7829368);
  }
  
  public void a(com.umeng.fb.b paramb)
  {
    this.e = paramb;
  }
  
  public int getCount()
  {
    if (this.e == null) {
      return 0;
    }
    return this.e.f.size();
  }
  
  public Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = this.b.inflate(d.e(this.a), null);
      paramViewGroup = new b.a(this);
      paramViewGroup.a = ((LinearLayout)paramView.findViewById(c.p(this.a)));
      paramViewGroup.b = ((RelativeLayout)paramViewGroup.a.findViewById(c.q(this.a)));
      paramViewGroup.c = ((TextView)paramViewGroup.a.findViewById(c.r(this.a)));
      paramViewGroup.d = ((TextView)paramViewGroup.a.findViewById(c.s(this.a)));
      paramViewGroup.e = paramView.findViewById(c.t(this.a));
      paramViewGroup.f = paramView.findViewById(c.u(this.a));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      com.umeng.fb.a locala = this.e.a(paramInt);
      a(locala, paramViewGroup.d);
      paramViewGroup.c.setText(locala.a());
      if (locala.f != a.b.c) {
        break;
      }
      paramViewGroup.a.setGravity(5);
      paramViewGroup.b.setBackgroundResource(com.umeng.fb.b.b.b(this.a));
      paramViewGroup.f.setVisibility(8);
      paramViewGroup.e.setVisibility(0);
      return paramView;
      paramViewGroup = (b.a)paramView.getTag();
    }
    paramViewGroup.a.setGravity(3);
    paramViewGroup.b.setBackgroundResource(com.umeng.fb.b.b.c(this.a));
    paramViewGroup.f.setVisibility(0);
    paramViewGroup.e.setVisibility(8);
    return paramView;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */