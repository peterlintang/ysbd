package com.umeng.newxp.view.common.actionbar;

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

public class ActionBar
  extends RelativeLayout
  implements View.OnClickListener
{
  private static final String m = "action_bar_progress";
  private LayoutInflater a;
  private RelativeLayout b;
  private View c;
  private View d;
  private TextView e;
  private ImageView f;
  private LinearLayout g;
  private LinearLayout h;
  private LinearLayout i;
  private View j;
  private ImageButton k;
  private View.OnClickListener l = null;
  private View n;
  
  public ActionBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    this.b = ((RelativeLayout)this.a.inflate(c.i("umeng_xp_cm_actionbar"), null));
    addView(this.b);
    this.i = ((LinearLayout)this.b.findViewById(c.c("actionbar_home_left")));
    this.c = ((ImageView)this.b.findViewById(c.c("actionbar_home_is_back")));
    this.e = ((TextView)this.b.findViewById(c.c("actionbar_title")));
    this.d = this.b.findViewById(c.c("actionbar_title_view"));
    this.f = ((ImageView)this.b.findViewById(c.c("actionbar_title_indicator")));
    this.d.setOnClickListener(new ActionBar.1(this));
    this.g = ((LinearLayout)this.b.findViewById(c.c("actionbar_actions")));
    this.h = ((LinearLayout)this.b.findViewById(c.c("actionbar_title_right")));
  }
  
  private View a(ActionBar.c paramc)
  {
    View localView = paramc.b();
    Object localObject2;
    Object localObject1;
    if (localView != null) {
      if (paramc.c())
      {
        localObject2 = localView.findViewById(c.c("standalone_action"));
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = localView;
        }
        ((View)localObject1).setTag(paramc);
        ((View)localObject1).setOnClickListener(this);
        paramc = localView;
      }
    }
    for (;;)
    {
      this.n = paramc;
      return paramc;
      localObject1 = this.a.inflate(c.i("umeng_xp_cm_actionbar_view_item"), this.g, false);
      localObject2 = (ViewGroup)((View)localObject1).findViewById(c.c("actionbar_item"));
      ((ViewGroup)localObject2).addView(localView);
      ((ViewGroup)localObject2).setTag(paramc);
      ((ViewGroup)localObject2).setOnClickListener(this);
      paramc = (ActionBar.c)localObject1;
      continue;
      localView = this.a.inflate(c.i("munion_actionbar_image_item"), this.g, false);
      localObject1 = (ImageView)localView.findViewById(c.c("actionbar_item"));
      ((ImageView)localObject1).setImageResource(paramc.a());
      ((ImageView)localObject1).setTag(paramc);
      ((ImageView)localObject1).setOnClickListener(this);
      paramc = localView;
    }
  }
  
  public void addAction(ActionBar.c paramc, int paramInt, ActionBar.a parama)
  {
    switch (ActionBar.2.a[parama.ordinal()])
    {
    default: 
      this.g.addView(a(paramc), paramInt);
      return;
    }
    this.h.addView(a(paramc), paramInt);
  }
  
  public void addAction(ActionBar.c paramc, ActionBar.a parama)
  {
    switch (ActionBar.2.a[parama.ordinal()])
    {
    default: 
      addAction(paramc, this.g.getChildCount(), parama);
      return;
    }
    addAction(paramc, this.h.getChildCount(), parama);
  }
  
  public void clearLeftAction()
  {
    this.i.setVisibility(8);
  }
  
  public int getActionCount()
  {
    return this.g.getChildCount();
  }
  
  public int getProgressBarVisibility()
  {
    return 0;
  }
  
  public View getRightView()
  {
    return this.n;
  }
  
  public void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if ((localObject instanceof ActionBar.c)) {
      ((ActionBar.c)localObject).a(paramView);
    }
  }
  
  public void removeAction(ActionBar.c paramc)
  {
    int i3 = 0;
    int i4 = this.g.getChildCount();
    int i1 = 0;
    int i2;
    View localView;
    Object localObject;
    for (;;)
    {
      i2 = i3;
      if (i1 >= i4) {
        break;
      }
      localView = this.g.getChildAt(i1);
      if (localView != null)
      {
        localObject = localView.findViewById(c.c("actionbar_item"));
        if (localObject != null)
        {
          localObject = ((View)localObject).getTag();
          if (((localObject instanceof ActionBar.c)) && (localObject.equals(paramc))) {
            this.g.removeView(localView);
          }
        }
      }
      i1 += 1;
    }
    while (i2 < this.h.getChildCount())
    {
      localView = this.h.getChildAt(i2);
      if (localView != null)
      {
        localObject = localView.findViewById(c.c("actionbar_item"));
        if (localObject != null)
        {
          localObject = ((View)localObject).getTag();
          if (((localObject instanceof ActionBar.c)) && (localObject.equals(paramc))) {
            this.h.removeView(localView);
          }
        }
      }
      i2 += 1;
    }
  }
  
  public void removeActionAt(int paramInt, ActionBar.a parama)
  {
    switch (ActionBar.2.a[parama.ordinal()])
    {
    default: 
      if ((paramInt >= 0) && (paramInt < this.g.getChildCount())) {
        this.g.removeViewAt(paramInt);
      }
      break;
    }
    do
    {
      return;
    } while ((paramInt < 0) || (paramInt >= this.h.getChildCount()));
    this.g.removeViewAt(paramInt);
  }
  
  public void removeAllActions()
  {
    this.g.removeAllViews();
    this.h.removeAllViews();
  }
  
  public void replaceProgress(ActionBar.c paramc)
  {
    int i2 = this.g.getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      Object localObject = this.g.getChildAt(i1);
      if (localObject != null)
      {
        localObject = ((View)localObject).getTag();
        if (((localObject instanceof String)) && (((String)localObject).equals("action_bar_progress")))
        {
          this.g.removeViewAt(i1);
          if (paramc != null) {
            addAction(paramc, i1, ActionBar.a.a);
          }
        }
      }
      i1 += 1;
    }
  }
  
  public void setLeftAction(ActionBar.c paramc)
  {
    if (paramc != null)
    {
      if (!paramc.c()) {
        break label88;
      }
      View localView = paramc.b();
      if (localView != null)
      {
        this.i.removeAllViews();
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        localLayoutParams.gravity = 17;
        this.i.addView(localView, localLayoutParams);
        this.c = localView;
      }
    }
    for (;;)
    {
      this.c.setOnClickListener(this);
      this.c.setTag(paramc);
      this.i.setVisibility(0);
      return;
      label88:
      if (paramc.a() != 0) {
        ((ImageView)this.c).setImageResource(paramc.a());
      }
    }
  }
  
  public void setLeftIconVisibility(int paramInt)
  {
    if (this.i != null) {
      this.i.setVisibility(paramInt);
    }
  }
  
  public void setOnTitleClickListener(View.OnClickListener paramOnClickListener)
  {
    this.l = paramOnClickListener;
  }
  
  public void setProgressBarVisibility(int paramInt) {}
  
  public void setRightIconVisibility(int paramInt)
  {
    if (this.n != null) {
      this.n.setVisibility(paramInt);
    }
  }
  
  public void setTitle(int paramInt)
  {
    this.e.setText(paramInt);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.e.setText(paramCharSequence);
  }
  
  public void setTitleBarListener(View.OnClickListener paramOnClickListener)
  {
    this.l = paramOnClickListener;
  }
  
  public void setTitleIcon(int paramInt)
  {
    this.f.setImageResource(paramInt);
  }
  
  public void updateActionIcon(ActionBar.c paramc, int paramInt)
  {
    int i2 = this.g.getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      Object localObject1 = this.g.getChildAt(i1);
      if (localObject1 != null)
      {
        localObject1 = (ImageView)((View)localObject1).findViewById(c.c("actionbar_item"));
        if (localObject1 != null)
        {
          Object localObject2 = ((ImageView)localObject1).getTag();
          if (((localObject2 instanceof ActionBar.c)) && (localObject2.equals(paramc))) {
            ((ImageView)localObject1).setImageResource(paramInt);
          }
        }
      }
      i1 += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\actionbar\ActionBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */