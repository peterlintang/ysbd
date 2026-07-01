package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.a.r;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.bean.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class af
  implements View.OnClickListener
{
  af(AIReaderActivity paramAIReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    if ((AIReaderActivity.h(this.a) == null) || (AIReaderActivity.h(this.a).size() <= 0))
    {
      this.a.a("请先创建分类!");
      return;
    }
    paramView = new ArrayList();
    Object localObject1 = AIReaderActivity.f(this.a).a().keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (b)((Iterator)localObject1).next();
      new StringBuilder().append(((b)localObject2).j()).append(((b)localObject2).k()).toString();
      paramView.add(localObject2);
    }
    if (paramView.size() <= 0)
    {
      this.a.a("没有选择书籍!");
      return;
    }
    localObject1 = new ArrayList();
    Object localObject2 = AIReaderActivity.i(this.a).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      f localf = (f)((Iterator)localObject2).next();
      if ((AIReaderActivity.j(this.a) == null) || (localf.b() != AIReaderActivity.j(this.a).b()))
      {
        new StringBuilder("add to category: ").append(localf.c()).toString();
        ((List)localObject1).add(localf);
      }
    }
    this.a.a(paramView, (List)localObject1, AIReaderActivity.j(this.a));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */