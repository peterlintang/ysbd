package com.ireadercity.b2.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.ireadercity.b2.bean.k;
import java.util.ArrayList;
import java.util.List;

public final class al
{
  Context a;
  List<k> b;
  int c;
  List<View> d;
  ao e;
  
  public al(Context paramContext, List<k> paramList, int paramInt, ao paramao)
  {
    this.a = paramContext;
    this.b = paramList;
    this.c = paramInt;
    this.e = paramao;
    this.d = new ArrayList();
    f();
  }
  
  private void f()
  {
    int k = 0;
    int i = 0;
    int j = k;
    if (i < e())
    {
      List localList = this.d;
      View localView = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(2130903093, null);
      an localan = new an(this);
      localan.a = ((Button)localView.findViewById(2131362087));
      localan.b = ((RelativeLayout)localView.findViewById(2131362086));
      localView.setTag(localan);
      k localk = (k)this.b.get(i);
      if (localk != null)
      {
        localan.a.setText(localk.c());
        localan.a.setBackgroundColor(Color.parseColor(localk.f()));
        localan.a.setTextColor(Color.parseColor(localk.d()));
        if (this.c != i) {
          break label197;
        }
        localan.b.setBackgroundColor(this.a.getResources().getColor(2131099672));
      }
      for (;;)
      {
        localList.add(localView);
        i += 1;
        break;
        label197:
        localan.b.setBackgroundColor(this.a.getResources().getColor(2131099673));
      }
    }
    while (j < e())
    {
      ((an)((View)this.d.get(j)).getTag()).a.setOnClickListener(new am(this, j));
      j += 1;
    }
  }
  
  public final int a()
  {
    return this.c;
  }
  
  public final int b()
  {
    return (int)(this.a.getResources().getDisplayMetrics().density * 46.0F + 0.5F);
  }
  
  public final List<View> c()
  {
    return this.d;
  }
  
  public final void d()
  {
    int i = e() - 1;
    while (i >= 0)
    {
      an localan = (an)((View)this.d.get(i)).getTag();
      localan.a = null;
      localan.b = null;
      this.d.get(i);
      this.d.remove(i);
      i -= 1;
    }
    this.d = null;
  }
  
  public final int e()
  {
    return this.b.size();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */