package com.umeng.newxp.view.handler.umwall;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.LinearLayout.LayoutParams;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.handler.umwall.holder.f;
import com.umeng.newxp.view.widget.CYCImageView;
import java.util.ArrayList;
import java.util.List;

public class a
  extends BaseAdapter
{
  private final Context a;
  private int b = 0;
  private LinearLayout.LayoutParams c;
  private List<Promoter> d;
  private final com.umeng.newxp.view.handler.utils.c e;
  private ExchangeDataService f;
  private com.umeng.newxp.common.a g;
  
  public a(Context paramContext, List<Promoter> paramList, com.umeng.newxp.view.handler.utils.c paramc)
  {
    this.a = paramContext;
    this.d = paramList;
    this.c = new LinearLayout.LayoutParams(-1, -1);
    this.e = paramc;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    if (paramInt == this.b) {
      return;
    }
    this.b = paramInt;
    this.c = new LinearLayout.LayoutParams(-1, this.b);
    this.e.a(paramInt);
    notifyDataSetChanged();
  }
  
  public void a(com.umeng.newxp.common.a parama)
  {
    this.g = parama;
  }
  
  public void a(ExchangeDataService paramExchangeDataService)
  {
    this.f = paramExchangeDataService;
  }
  
  public void a(List<Promoter> paramList, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.d.clear();
    }
    if (this.d == null) {
      this.d = new ArrayList();
    }
    if (paramList != null) {
      this.d.addAll(com.umeng.newxp.common.c.a(this.d, paramList));
    }
  }
  
  public int getCount()
  {
    if (this.d == null) {
      return 0;
    }
    return this.d.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.d == null) {
      return null;
    }
    return (Promoter)this.d.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (paramView == null)
    {
      localObject = com.umeng.newxp.view.handler.a.a(b.a(this.g.f, this.g.e, this.f.layoutType), this.a);
      View localView = ((com.umeng.newxp.view.handler.a)localObject).a();
      paramViewGroup = (ViewGroup)localObject;
      paramView = localView;
      if ((localObject instanceof f))
      {
        ((f)localObject).b.setLayoutParams(this.c);
        paramView = localView;
      }
    }
    for (paramViewGroup = (ViewGroup)localObject;; paramViewGroup = (com.umeng.newxp.view.handler.a)paramView.getTag())
    {
      if (this.b > 0)
      {
        localObject = (f)paramViewGroup;
        if (((f)localObject).b.getLayoutParams().height != this.b) {
          ((f)localObject).b.setLayoutParams(this.c);
        }
      }
      paramViewGroup.a((Promoter)this.d.get(paramInt), new Object[] { this.e, Integer.valueOf(paramInt), this.f, this.g });
      return paramView;
    }
  }
  
  public int getViewTypeCount()
  {
    return 1;
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */