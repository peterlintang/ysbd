package com.taobao.munion.actionbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.taobao.munion.restool.a;

public class ActionBar
  extends RelativeLayout
  implements View.OnClickListener
{
  private static final String l = "action_bar_progress";
  private LayoutInflater a;
  private RelativeLayout b;
  private View c;
  private View d;
  private TextView e;
  private ImageView f;
  private LinearLayout g;
  private LinearLayout h;
  private View i;
  private ImageButton j;
  private View.OnClickListener k = null;
  private View m;
  
  public ActionBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    this.b = ((RelativeLayout)this.a.inflate(a.i("munion_actionbar"), null));
    addView(this.b);
    this.h = ((LinearLayout)this.b.findViewById(a.c("actionbar_home_left")));
    this.c = ((ImageView)this.b.findViewById(a.c("actionbar_home_is_back")));
    this.e = ((TextView)this.b.findViewById(a.c("actionbar_title")));
    this.d = this.b.findViewById(a.c("actionbar_title_view"));
    this.f = ((ImageView)this.b.findViewById(a.c("actionbar_title_indicator")));
    this.d.setOnClickListener(new ActionBar.1(this));
    this.g = ((LinearLayout)this.b.findViewById(a.c("actionbar_actions")));
  }
  
  private View e(ActionBar.b paramb)
  {
    View localView1 = paramb.b();
    Object localObject;
    if (localView1 != null) {
      if (paramb.c())
      {
        View localView2 = localView1.findViewById(a.c("standalone_action"));
        localObject = localView2;
        if (localView2 == null) {
          localObject = localView1;
        }
        ((View)localObject).setTag(paramb);
        ((View)localObject).setOnClickListener(this);
        paramb = localView1;
      }
    }
    for (;;)
    {
      this.m = paramb;
      return paramb;
      localObject = this.a.inflate(a.i("munion_actionbar_view_item"), this.g, false);
      ((ViewGroup)((View)localObject).findViewById(a.c("actionbar_item"))).addView(localView1);
      localView1.setTag(paramb);
      localView1.setOnClickListener(this);
      paramb = (ActionBar.b)localObject;
      continue;
      localView1 = this.a.inflate(a.i("munion_actionbar_image_item"), this.g, false);
      localObject = (ImageView)localView1.findViewById(a.c("actionbar_item"));
      ((ImageView)localObject).setImageResource(paramb.a());
      ((ImageView)localObject).setTag(paramb);
      ((ImageView)localObject).setOnClickListener(this);
      paramb = localView1;
    }
  }
  
  public void a()
  {
    this.h.setVisibility(8);
  }
  
  public void a(int paramInt)
  {
    if (this.h != null) {
      this.h.setVisibility(paramInt);
    }
  }
  
  public void a(View.OnClickListener paramOnClickListener)
  {
    this.k = paramOnClickListener;
  }
  
  public void a(ActionBar.b paramb)
  {
    if (paramb != null)
    {
      if (!paramb.c()) {
        break label88;
      }
      View localView = paramb.b();
      if (localView != null)
      {
        this.h.removeAllViews();
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        localLayoutParams.gravity = 17;
        this.h.addView(localView, localLayoutParams);
        this.c = localView;
      }
    }
    for (;;)
    {
      this.c.setOnClickListener(this);
      this.c.setTag(paramb);
      this.h.setVisibility(0);
      return;
      label88:
      if (paramb.a() != 0) {
        ((ImageView)this.c).setImageResource(paramb.a());
      }
    }
  }
  
  public void a(ActionBar.b paramb, int paramInt)
  {
    this.g.addView(e(paramb), paramInt);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.e.setText(paramCharSequence);
  }
  
  public int b()
  {
    return 0;
  }
  
  public void b(int paramInt)
  {
    if (this.m != null) {
      this.m.setVisibility(paramInt);
    }
  }
  
  public void b(View.OnClickListener paramOnClickListener)
  {
    this.k = paramOnClickListener;
  }
  
  public void b(ActionBar.b paramb)
  {
    int i1 = this.g.getChildCount();
    int n = 0;
    while (n < i1)
    {
      Object localObject = this.g.getChildAt(n);
      if (localObject != null)
      {
        localObject = ((View)localObject).getTag();
        if (((localObject instanceof String)) && (((String)localObject).equals("action_bar_progress")))
        {
          this.g.removeViewAt(n);
          if (paramb != null) {
            a(paramb, n);
          }
        }
      }
      n += 1;
    }
  }
  
  public void b(ActionBar.b paramb, int paramInt)
  {
    int i1 = this.g.getChildCount();
    int n = 0;
    while (n < i1)
    {
      Object localObject1 = this.g.getChildAt(n);
      if (localObject1 != null)
      {
        localObject1 = (ImageView)((View)localObject1).findViewById(a.c("actionbar_item"));
        if (localObject1 != null)
        {
          Object localObject2 = ((ImageView)localObject1).getTag();
          if (((localObject2 instanceof ActionBar.b)) && (localObject2.equals(paramb))) {
            ((ImageView)localObject1).setImageResource(paramInt);
          }
        }
      }
      n += 1;
    }
  }
  
  public void c()
  {
    this.g.removeAllViews();
  }
  
  public void c(int paramInt)
  {
    this.f.setImageResource(paramInt);
  }
  
  public void c(ActionBar.b paramb)
  {
    a(paramb, this.g.getChildCount());
  }
  
  public int d()
  {
    return this.g.getChildCount();
  }
  
  public void d(int paramInt)
  {
    this.e.setText(paramInt);
  }
  
  public void d(ActionBar.b paramb)
  {
    int i1 = this.g.getChildCount();
    int n = 0;
    while (n < i1)
    {
      View localView = this.g.getChildAt(n);
      if (localView != null)
      {
        Object localObject = (ImageButton)localView.findViewById(a.c("actionbar_item"));
        if (localObject != null)
        {
          localObject = ((ImageButton)localObject).getTag();
          if (((localObject instanceof ActionBar.b)) && (localObject.equals(paramb))) {
            this.g.removeView(localView);
          }
        }
      }
      n += 1;
    }
  }
  
  public View e()
  {
    return this.m;
  }
  
  public void e(int paramInt) {}
  
  public void f(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.g.getChildCount())) {
      this.g.removeViewAt(paramInt);
    }
  }
  
  public void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if ((localObject instanceof ActionBar.b)) {
      ((ActionBar.b)localObject).a(paramView);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\actionbar\ActionBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */