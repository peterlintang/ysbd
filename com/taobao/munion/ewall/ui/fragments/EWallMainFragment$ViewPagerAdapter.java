package com.taobao.munion.ewall.ui.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.taobao.munion.model.c;
import java.util.List;

public class EWallMainFragment$ViewPagerAdapter
  extends FragmentPagerAdapter
{
  List<c> mTabs;
  
  public EWallMainFragment$ViewPagerAdapter(FragmentManager paramFragmentManager, List<c> paramList)
  {
    super(paramList);
    List localList;
    this.mTabs = localList;
  }
  
  public int getCount()
  {
    if ((this.this$0.sEWallMainBean == null) || (this.mTabs == null)) {
      return 0;
    }
    return this.mTabs.size();
  }
  
  public Fragment getItem(int paramInt)
  {
    if ((this.this$0.sEWallMainBean != null) && (this.mTabs != null)) {
      return EWallPageFragment.newInstance((c)this.mTabs.get(paramInt), this.this$0);
    }
    return null;
  }
  
  public CharSequence getPageTitle(int paramInt)
  {
    return ((c)this.mTabs.get(paramInt)).a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallMainFragment$ViewPagerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */