package com.umeng.newxp.view.handler.ewall;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.umeng.newxp.common.a;
import java.util.List;

public class b$b
  extends FragmentPagerAdapter
{
  List<a> a;
  
  public b$b(FragmentManager paramFragmentManager, List<a> paramList)
  {
    super(paramList);
    List localList;
    this.a = localList;
  }
  
  public int a()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.size();
  }
  
  public Fragment a(int paramInt)
  {
    b localb = this.b;
    if (paramInt == 0) {}
    for (int i = 0;; i = 1)
    {
      localb.a(i, (a)this.a.get(paramInt));
      this.a.get(paramInt);
      return null;
    }
  }
  
  public CharSequence b(int paramInt)
  {
    return ((a)this.a.get(paramInt)).b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\b$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */