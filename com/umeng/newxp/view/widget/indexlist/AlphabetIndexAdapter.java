package com.umeng.newxp.view.widget.indexlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.umeng.newxp.a.c;
import com.umeng.newxp.a.d;
import java.util.ArrayList;
import java.util.List;

public class AlphabetIndexAdapter
  extends BaseAdapter
  implements AbsListView.OnScrollListener, Filterable
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  private int d = 0;
  private Context e;
  private List<City> f;
  private List<City> g;
  private List<City> h;
  private AlphabetIndexAdapter.PinyinFilter i;
  
  public AlphabetIndexAdapter(Context paramContext, List<City> paramList1, List<City> paramList2)
  {
    this.e = paramContext;
    a(paramList1, paramList2);
    this.i = new AlphabetIndexAdapter.PinyinFilter(this);
  }
  
  private char b(int paramInt)
  {
    return ((City)this.h.get(paramInt)).a();
  }
  
  public int a(int paramInt)
  {
    return this.d;
  }
  
  public int a(String paramString)
  {
    int j = 0;
    int k = 0;
    while (j < this.h.size())
    {
      City localCity = (City)this.h.get(j);
      if (localCity.d(paramString)) {
        k = 1;
      }
      if ((k != 0) && (!localCity.d(paramString))) {
        return j;
      }
      j += 1;
    }
    return -1;
  }
  
  public List<City> a()
  {
    ArrayList localArrayList = new ArrayList(this.g);
    localArrayList.addAll(this.f);
    return localArrayList;
  }
  
  public void a(View paramView, int paramInt1, int paramInt2)
  {
    City localCity = (City)this.h.get(paramInt1);
    ((TextView)paramView).setText(String.valueOf(localCity.a()));
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    this.i.a(paramBoolean);
    this.i.filter(paramString);
  }
  
  public void a(List<City> paramList1, List<City> paramList2)
  {
    this.f = paramList1;
    this.g = paramList2;
    if (this.g == null) {
      this.g = new ArrayList();
    }
    this.h = new ArrayList(this.g);
    this.h.addAll(this.f);
  }
  
  public boolean a(City paramCity, String paramString)
  {
    return paramCity.d().toLowerCase().contains(paramString.toLowerCase());
  }
  
  public Object[] b()
  {
    return null;
  }
  
  public int getCount()
  {
    return this.h.size();
  }
  
  public Filter getFilter()
  {
    if (this.i == null) {
      this.i = new AlphabetIndexAdapter.PinyinFilter(this);
    }
    return this.i;
  }
  
  public Object getItem(int paramInt)
  {
    return this.h.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = "456";
    City localCity = (City)this.h.get(paramInt);
    if (paramInt > 0) {}
    for (int j = ((City)this.h.get(paramInt - 1)).a();; j = 0)
    {
      char c1 = localCity.a();
      if ((paramInt == 0) || (c1 != j)) {
        paramViewGroup = "123";
      }
      View localView = paramView;
      if (paramView == null) {
        localView = ((Activity)this.e).getLayoutInflater().inflate(d.y(this.e), null);
      }
      if (paramViewGroup.equals("123"))
      {
        paramView = (TextView)localView.findViewById(c.av(this.e));
        paramView.setText(String.valueOf(c1));
        paramView.setVisibility(0);
      }
      for (;;)
      {
        ((TextView)localView.findViewById(c.aw(this.e))).setText(localCity.d());
        return localView;
        if (paramViewGroup.equals("456")) {
          ((TextView)localView.findViewById(c.av(this.e))).setVisibility(8);
        }
      }
    }
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 < 0) || (paramInt3 == 0))
    {
      this.d = 0;
      return;
    }
    if (a(String.valueOf(b(paramInt1))) == paramInt1 + 1) {}
    for (this.d = 2;; this.d = 1)
    {
      ((SectionListView)paramAbsListView).a(paramInt1);
      return;
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\indexlist\AlphabetIndexAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */