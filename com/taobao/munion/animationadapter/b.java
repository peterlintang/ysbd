package com.taobao.munion.animationadapter;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.taobao.munion.nineoldandroids.animation.d;
import com.taobao.munion.nineoldandroids.animation.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b
  extends com.taobao.munion.listviewanimations.a
  implements a.a
{
  public com.taobao.munion.listviewanimations.itemmanipulation.contextualundo.b a;
  private final int c;
  private final int d;
  private final int e;
  private final int f = 150;
  private long g;
  private Map<View, com.taobao.munion.nineoldandroids.animation.a> h = new ConcurrentHashMap();
  private b.a i;
  private com.taobao.munion.listviewanimations.itemmanipulation.a j;
  private a k;
  
  public b(BaseAdapter paramBaseAdapter, int paramInt1, int paramInt2, int paramInt3, com.taobao.munion.listviewanimations.itemmanipulation.a parama)
  {
    super(paramBaseAdapter);
    this.e = paramInt3;
    this.c = paramInt1;
    this.d = paramInt2;
    this.g = -1L;
    this.j = parama;
  }
  
  private com.taobao.munion.nineoldandroids.animation.a a(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    q localq = q.b(new int[] { paramView.getHeight(), 0 });
    localq.a(new b.2(this, localLayoutParams, paramView));
    localq.a(new b.3(this, localLayoutParams, paramView));
    return localq;
  }
  
  private void a(com.taobao.munion.listviewanimations.itemmanipulation.contextualundo.b paramb)
  {
    this.a = paramb;
    this.g = paramb.b();
  }
  
  private void b(View paramView)
  {
    com.taobao.munion.nineoldandroids.view.a.a(paramView, 1.0F);
    com.taobao.munion.nineoldandroids.view.a.i(paramView, 0.0F);
  }
  
  private void b(Collection<Integer> paramCollection)
  {
    paramCollection = new ArrayList(paramCollection);
    Collections.sort(paramCollection);
    int[] arrayOfInt = new int[paramCollection.size()];
    int m = 0;
    while (m < paramCollection.size())
    {
      arrayOfInt[m] = ((Integer)paramCollection.get(paramCollection.size() - 1 - m)).intValue();
      m += 1;
    }
    this.j.onDismiss(h(), arrayOfInt);
  }
  
  private List<View> c(Collection<Integer> paramCollection)
  {
    ArrayList localArrayList = new ArrayList();
    int m = 0;
    while (m < h().getChildCount())
    {
      View localView = h().getChildAt(m);
      if (paramCollection.contains(Integer.valueOf(h().getPositionForView(localView)))) {
        localArrayList.add(localView);
      }
      m += 1;
    }
    return localArrayList;
  }
  
  private void j()
  {
    if (this.a != null)
    {
      this.a.e();
      com.taobao.munion.nineoldandroids.view.a.i(this.a, this.a.getWidth());
      com.taobao.munion.nineoldandroids.view.b.a(this.a).k(0.0F).a(150L).a(null);
      d();
    }
  }
  
  private void k()
  {
    if (this.a != null) {
      e();
    }
  }
  
  public void a()
  {
    j();
  }
  
  public void a(int paramInt)
  {
    a(Arrays.asList(new Integer[] { Integer.valueOf(paramInt) }));
  }
  
  public void a(Parcelable paramParcelable)
  {
    this.g = ((Bundle)paramParcelable).getLong("mCurrentRemovedId", -1L);
  }
  
  public void a(View paramView, int paramInt)
  {
    paramView = (com.taobao.munion.listviewanimations.itemmanipulation.contextualundo.b)paramView;
    if (paramView.c())
    {
      b(paramView);
      paramView.d();
      j();
      a(paramView);
    }
    while (this.a == null) {
      return;
    }
    j();
  }
  
  public void a(AbsListView paramAbsListView)
  {
    super.a(paramAbsListView);
    this.k = new a(paramAbsListView, this);
    paramAbsListView.setOnTouchListener(this.k);
    paramAbsListView.setOnScrollListener(this.k.a());
    paramAbsListView.setRecyclerListener(new b.b(this, null));
  }
  
  public void a(b.a parama)
  {
    this.i = parama;
  }
  
  public void a(b.e parame)
  {
    this.k.a(parame);
  }
  
  public void a(Collection<Integer> paramCollection)
  {
    paramCollection = new ArrayList(paramCollection);
    if (h() == null) {
      throw new IllegalStateException("Call setListView() on this AnimateDismissAdapter before calling setAdapter()!");
    }
    Object localObject = c(paramCollection);
    if (!((List)localObject).isEmpty())
    {
      ArrayList localArrayList = new ArrayList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        localArrayList.add(a((View)((Iterator)localObject).next()));
      }
      localObject = new d();
      com.taobao.munion.nineoldandroids.animation.a[] arrayOfa = new com.taobao.munion.nineoldandroids.animation.a[localArrayList.size()];
      int m = 0;
      while (m < arrayOfa.length)
      {
        arrayOfa[m] = ((com.taobao.munion.nineoldandroids.animation.a)localArrayList.get(m));
        m += 1;
      }
      ((d)localObject).a(arrayOfa);
      ((d)localObject).a(new b.1(this, paramCollection));
      ((d)localObject).a();
      return;
    }
    b(paramCollection);
  }
  
  public void b()
  {
    AbsListView localAbsListView = h();
    if (localAbsListView != null)
    {
      d();
      localAbsListView.setOnTouchListener(null);
    }
  }
  
  public void c()
  {
    AbsListView localAbsListView = h();
    if (localAbsListView != null) {
      localAbsListView.setOnTouchListener(this.k);
    }
  }
  
  public void d()
  {
    this.a = null;
    this.g = -1L;
  }
  
  public void e()
  {
    com.taobao.munion.listviewanimations.itemmanipulation.contextualundo.b localb = this.a;
    AbsListView localAbsListView = h();
    int m = 0;
    if (localAbsListView != null) {
      m = localAbsListView.getPositionForView(localb);
    }
    this.i.deleteItem(m);
    d();
  }
  
  public Parcelable f()
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("mCurrentRemovedId", this.g);
    return localBundle;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    com.taobao.munion.listviewanimations.itemmanipulation.contextualundo.b localb = (com.taobao.munion.listviewanimations.itemmanipulation.contextualundo.b)paramView;
    paramView = localb;
    if (localb == null)
    {
      paramView = new com.taobao.munion.listviewanimations.itemmanipulation.contextualundo.b(paramViewGroup.getContext(), this.c);
      paramView.findViewById(this.d).setOnClickListener(new b.f(this, paramView));
    }
    paramView.a(super.getView(paramInt, paramView.a(), paramViewGroup));
    paramView.findViewById(this.e).setOnClickListener(new b.4(this, paramInt));
    long l = getItemId(paramInt);
    if (l == this.g)
    {
      paramView.d();
      this.a = paramView;
    }
    for (;;)
    {
      paramView.a(l);
      return paramView;
      paramView.e();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\animationadapter\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */