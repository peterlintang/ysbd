package com.taobao.munion.ewall.ui.fragments;

import android.view.View;
import android.view.ViewGroup;
import com.taobao.munion.model.a;
import com.umeng.newxp.view.handler.utils.c;
import java.util.ArrayList;
import java.util.List;

public class EWallPageFragment$GaiGaiImageAdapter
  extends EWallPageFragment.ImageAdapter
{
  public EWallPageFragment$GaiGaiImageAdapter(List<a> paramList, c paramc, int paramInt)
  {
    super(paramList, paramc, paramInt, i);
  }
  
  public void addPromoters(List<a> paramList, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.mPromoters = null;
    }
    if (this.mPromoters == null) {
      this.mPromoters = new ArrayList();
    }
    if (paramList != null) {
      this.mPromoters.addAll(paramList);
    }
  }
  
  public int getCount()
  {
    if (this.mPromoters == null) {
      return 0;
    }
    return this.mPromoters.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.mPromoters == null) {
      return null;
    }
    return (a)this.mPromoters.get(paramInt);
  }
  
  public int getItemHeight()
  {
    return this.mItemHeight;
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
    View localView;
    if (paramView == null)
    {
      paramView = new EWallPageFragment.GaiItemHolder(this.this$0);
      paramView.inflate(this.this$0.getActivity());
      localView = paramView.contentView;
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.cosmetics((a)this.mPromoters.get(paramInt), new Object[] { this.this$0.getImageFetcher(), Integer.valueOf(paramInt), this.this$0.mParent.sEWallMainBean, this.this$0.mEWallTabBean });
      return localView;
      paramViewGroup = (EWallPageFragment.GaiItemHolder)paramView.getTag();
      localView = paramView;
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
  
  public void setItemHeight(int paramInt)
  {
    if (paramInt == this.mItemHeight) {
      return;
    }
    this.mItemHeight = paramInt;
    this.this$0.getImageFetcher().a(paramInt);
    notifyDataSetChanged();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallPageFragment$GaiGaiImageAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */