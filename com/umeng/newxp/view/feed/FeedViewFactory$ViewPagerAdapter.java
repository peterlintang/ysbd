package com.umeng.newxp.view.feed;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class FeedViewFactory$ViewPagerAdapter
  extends PagerAdapter
{
  List<View> a;
  
  public FeedViewFactory$ViewPagerAdapter(List<View> paramList)
  {
    this.a = paramList;
  }
  
  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup.removeView((View)this.a.get(paramInt));
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = (View)this.a.get(paramInt);
    paramViewGroup.addView(localView);
    return localView;
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\FeedViewFactory$ViewPagerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */