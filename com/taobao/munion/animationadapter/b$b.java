package com.taobao.munion.animationadapter;

import android.view.View;
import android.widget.AbsListView.RecyclerListener;
import com.taobao.munion.nineoldandroids.animation.a;
import java.util.Map;

class b$b
  implements AbsListView.RecyclerListener
{
  private b$b(b paramb) {}
  
  public void onMovedToScrapHeap(View paramView)
  {
    paramView = (a)b.b(this.a).get(paramView);
    if (paramView != null) {
      paramView.b();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\animationadapter\b$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */