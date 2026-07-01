package com.umeng.newxp.view.widget.pulltorefresh;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.umeng.newxp.view.widget.pulltorefresh.internal.LoadingLayout;
import java.util.HashSet;
import java.util.Iterator;

public class LoadingLayoutProxy
  implements ILoadingLayout
{
  private final HashSet<LoadingLayout> a = new HashSet();
  
  public void a(Typeface paramTypeface)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((LoadingLayout)localIterator.next()).a(paramTypeface);
    }
  }
  
  public void a(Drawable paramDrawable)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((LoadingLayout)localIterator.next()).a(paramDrawable);
    }
  }
  
  public void a(LoadingLayout paramLoadingLayout)
  {
    if (paramLoadingLayout != null) {
      this.a.add(paramLoadingLayout);
    }
  }
  
  public void a(CharSequence paramCharSequence)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((LoadingLayout)localIterator.next()).a(paramCharSequence);
    }
  }
  
  public void b(CharSequence paramCharSequence)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((LoadingLayout)localIterator.next()).b(paramCharSequence);
    }
  }
  
  public void c(CharSequence paramCharSequence)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((LoadingLayout)localIterator.next()).c(paramCharSequence);
    }
  }
  
  public void d(CharSequence paramCharSequence)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((LoadingLayout)localIterator.next()).d(paramCharSequence);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\LoadingLayoutProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */