package com.umeng.socialize.view.wigets;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socom.net.p;
import java.util.ArrayList;
import java.util.List;

public class a
  extends BaseAdapter
  implements AbsListView.OnScrollListener, Filterable
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  private int d = 0;
  private Context e;
  private List<UMFriend> f;
  private List<UMFriend> g;
  private List<UMFriend> h;
  private int i;
  private a.a j;
  
  public a(Context paramContext, List<UMFriend> paramList1, List<UMFriend> paramList2)
  {
    this.e = paramContext;
    a(paramList1, paramList2);
    this.j = new a.a(this);
    this.i = b.a(this.e, b.a.c, "umeng_socialize_default_avatar");
  }
  
  private char b(int paramInt)
  {
    return ((UMFriend)this.h.get(paramInt)).upGroup();
  }
  
  public int a(int paramInt)
  {
    return this.d;
  }
  
  public int a(String paramString)
  {
    int k = 0;
    int m;
    for (int n = 0;; n = m)
    {
      if (k >= this.h.size()) {
        n = -1;
      }
      UMFriend localUMFriend;
      do
      {
        return n;
        localUMFriend = (UMFriend)this.h.get(k);
        m = n;
        if (localUMFriend.getPinyin() != null)
        {
          m = n;
          if (localUMFriend.isEquals(paramString)) {
            m = 1;
          }
        }
        if (m == 0) {
          break;
        }
        n = k;
      } while (!localUMFriend.isEquals(paramString));
      k += 1;
    }
  }
  
  public List<UMFriend> a()
  {
    ArrayList localArrayList = new ArrayList(this.g);
    localArrayList.addAll(this.f);
    return localArrayList;
  }
  
  public void a(View paramView, int paramInt1, int paramInt2)
  {
    UMFriend localUMFriend = (UMFriend)this.h.get(paramInt1);
    paramView = (TextView)paramView;
    paramView.setText(String.valueOf(localUMFriend.upGroup()));
    paramView.setTextColor(-1);
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    this.j.a(paramBoolean);
    this.j.filter(paramString);
  }
  
  public void a(List<UMFriend> paramList1, List<UMFriend> paramList2)
  {
    this.f = paramList1;
    this.g = paramList2;
    this.h = new ArrayList(this.g);
    this.h.addAll(this.f);
  }
  
  public boolean a(UMFriend paramUMFriend, String paramString)
  {
    return paramUMFriend.getName().toLowerCase().contains(paramString.toLowerCase());
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
    if (this.j == null) {
      this.j = new a.a(this);
    }
    return this.j;
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
    Object localObject = "456";
    UMFriend localUMFriend = (UMFriend)this.h.get(paramInt);
    if (paramInt > 0) {}
    for (int k = ((UMFriend)this.h.get(paramInt - 1)).upGroup();; k = 0)
    {
      char c1 = localUMFriend.upGroup();
      if ((paramInt == 0) || (c1 != k)) {
        localObject = "123";
      }
      paramViewGroup = paramView;
      if (paramView == null) {
        paramViewGroup = ((Activity)this.e).getLayoutInflater().inflate(b.a(this.e, b.a.a, "umeng_socialize_at_item"), null);
      }
      if (localObject == "123")
      {
        paramView = (TextView)paramViewGroup.findViewById(b.a(this.e, b.a.b, "section"));
        paramView.setText(String.valueOf(c1));
        paramView.setVisibility(0);
      }
      for (;;)
      {
        paramView = (TextView)paramViewGroup.findViewById(b.a(this.e, b.a.b, "umeng_socialize_text_view"));
        localObject = (ImageView)paramViewGroup.findViewById(b.a(this.e, b.a.b, "umeng_socialize_avatar_imv"));
        ((ImageView)localObject).setImageResource(b.a(this.e, b.a.c, "umeng_socialize_default_avatar"));
        paramView.setText(localUMFriend.getName());
        if (TextUtils.isEmpty(localUMFriend.getIcon())) {
          break;
        }
        p.a(this.e, (ImageView)localObject, localUMFriend.getIcon(), false, null, null, SocializeConstants.ROUNDER_ICON);
        return paramViewGroup;
        if (localObject == "456") {
          ((TextView)paramViewGroup.findViewById(b.a(this.e, b.a.b, "section"))).setVisibility(8);
        }
      }
      ((ImageView)localObject).setImageResource(this.i);
      return paramViewGroup;
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
      ((SectionListView)paramAbsListView).configureHeaderView(paramInt1);
      return;
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */