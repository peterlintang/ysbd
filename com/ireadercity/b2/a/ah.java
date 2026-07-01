package com.ireadercity.b2.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public final class ah
{
  Context a;
  String[] b;
  int c;
  ak d;
  List<View> e;
  
  public ah(Context paramContext, String[] paramArrayOfString, int paramInt, ak paramak)
  {
    this.a = paramContext;
    this.b = paramArrayOfString;
    this.c = paramInt;
    this.d = paramak;
    this.e = new ArrayList();
    d();
  }
  
  private void d()
  {
    int k = 0;
    int i = 0;
    int j = k;
    if (i < this.b.length)
    {
      List localList = this.e;
      View localView = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(2130903091, null);
      Object localObject = new aj(this);
      ((aj)localObject).b = localView.findViewById(2131362054);
      ((aj)localObject).a = ((TextView)localView.findViewById(2131362053));
      localView.setTag(localObject);
      String str = this.b[i];
      if (str != null)
      {
        ((aj)localObject).a.setText(str);
        if (this.c != i) {
          break label179;
        }
        ((aj)localObject).a.setTextColor(this.a.getResources().getColor(2131099672));
        label136:
        localObject = ((aj)localObject).b;
        if (i + 1 != this.b.length) {
          break label202;
        }
      }
      label179:
      label202:
      for (j = 4;; j = 0)
      {
        ((View)localObject).setVisibility(j);
        localList.add(localView);
        i += 1;
        break;
        ((aj)localObject).a.setTextColor(this.a.getResources().getColor(2131099673));
        break label136;
      }
    }
    while (j < this.b.length)
    {
      ((View)this.e.get(j)).setOnClickListener(new ai(this, j));
      j += 1;
    }
  }
  
  public final List<View> a()
  {
    return this.e;
  }
  
  public final void b()
  {
    int i = this.b.length - 1;
    while (i >= 0)
    {
      aj localaj = (aj)((View)this.e.get(i)).getTag();
      localaj.a = null;
      localaj.b = null;
      this.e.get(i);
      this.e.remove(i);
      i -= 1;
    }
    this.e = null;
  }
  
  public final int c()
  {
    return this.b.length;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */