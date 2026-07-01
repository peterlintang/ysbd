package com.taobao.munion.ewall.ui.fragments;

import android.widget.BaseAdapter;
import com.taobao.munion.model.a;
import com.umeng.newxp.view.handler.utils.c;
import java.util.ArrayList;
import java.util.List;

public abstract class EWallPageFragment$ImageAdapter
  extends BaseAdapter
{
  private final c mImageFetcher;
  int mItemHeight = 0;
  protected List<a> mPromoters;
  
  public EWallPageFragment$ImageAdapter(List<a> paramList, c paramc, int paramInt)
  {
    this.mPromoters = paramc;
    int i;
    this.mItemHeight = i;
    this.mImageFetcher = paramInt;
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
    this.mImageFetcher.a(paramInt);
    notifyDataSetChanged();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallPageFragment$ImageAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */