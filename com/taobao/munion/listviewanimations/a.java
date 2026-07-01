package com.taobao.munion.listviewanimations;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;

public abstract class a
  extends BaseAdapter
{
  private AbsListView a;
  protected final BaseAdapter b;
  
  public a(BaseAdapter paramBaseAdapter)
  {
    this.b = paramBaseAdapter;
  }
  
  public void a(AbsListView paramAbsListView)
  {
    this.a = paramAbsListView;
    if ((this.b instanceof a)) {
      ((a)this.b).a(paramAbsListView);
    }
  }
  
  public boolean areAllItemsEnabled()
  {
    return this.b.areAllItemsEnabled();
  }
  
  public void b(AbsListView paramAbsListView)
  {
    this.a = paramAbsListView;
    if ((this.b instanceof a)) {
      ((a)this.b).b(paramAbsListView);
    }
  }
  
  public AbsListView g()
  {
    return this.a;
  }
  
  public int getCount()
  {
    return this.b.getCount();
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return this.b.getDropDownView(paramInt, paramView, paramViewGroup);
  }
  
  public Object getItem(int paramInt)
  {
    return this.b.getItem(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return this.b.getItemId(paramInt);
  }
  
  public int getItemViewType(int paramInt)
  {
    return this.b.getItemViewType(paramInt);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return this.b.getView(paramInt, paramView, paramViewGroup);
  }
  
  public int getViewTypeCount()
  {
    return this.b.getViewTypeCount();
  }
  
  public AbsListView h()
  {
    return this.a;
  }
  
  public boolean hasStableIds()
  {
    return this.b.hasStableIds();
  }
  
  public BaseAdapter i()
  {
    return this.b;
  }
  
  public boolean isEmpty()
  {
    return this.b.isEmpty();
  }
  
  public boolean isEnabled(int paramInt)
  {
    return this.b.isEnabled(paramInt);
  }
  
  public void notifyDataSetChanged()
  {
    this.b.notifyDataSetChanged();
  }
  
  public void notifyDataSetInvalidated()
  {
    this.b.notifyDataSetInvalidated();
  }
  
  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.b.registerDataSetObserver(paramDataSetObserver);
  }
  
  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.b.unregisterDataSetObserver(paramDataSetObserver);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\listviewanimations\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */