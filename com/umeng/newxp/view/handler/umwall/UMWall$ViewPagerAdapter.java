package com.umeng.newxp.view.handler.umwall;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.umeng.newxp.common.a;
import com.umeng.newxp.controller.ExchangeDataService;
import java.util.List;

public class UMWall$ViewPagerAdapter
  extends FragmentPagerAdapter
{
  List<a> a;
  
  public UMWall$ViewPagerAdapter(FragmentManager paramFragmentManager, List<a> paramList)
  {
    super(paramList);
    List localList;
    this.a = localList;
  }
  
  public int getCount()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.size();
  }
  
  public Fragment getItem(int paramInt)
  {
    Object localObject = this.b;
    if (paramInt == 0) {}
    for (int i = 0;; i = 1)
    {
      localObject = ((UMWall)localObject).getTabExchangeDataService(i, (a)this.a.get(paramInt));
      a locala = (a)this.a.get(paramInt);
      ((ExchangeDataService)localObject).tabId = locala.d;
      return UMWallFragment.newInstance((ExchangeDataService)localObject, locala, paramInt);
    }
  }
  
  public CharSequence getPageTitle(int paramInt)
  {
    return ((a)this.a.get(paramInt)).b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\UMWall$ViewPagerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */