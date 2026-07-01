package com.umeng.xp.view.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.umeng.common.Log;
import com.umeng.common.b.i;
import com.umeng.xp.view.GridTemplateConfig;
import java.util.ArrayList;
import java.util.List;

public class a
  extends RelativeLayout
{
  private static final String a = "GridPage";
  private a.a b;
  private GridTemplateConfig c;
  private Context d;
  private int e = 0;
  private List<LinearLayout> f;
  
  public a(Context paramContext, a.a parama, GridTemplateConfig paramGridTemplateConfig)
  {
    super(paramContext);
    this.d = paramContext;
    new i(this.d);
    this.b = parama;
    this.c = paramGridTemplateConfig;
    this.f = new ArrayList();
    a();
  }
  
  private void a()
  {
    int i1 = this.b.a();
    int i2 = this.c.numColumns;
    int i3 = i.a(this.c.verticalSpacing);
    Log.c("GridPage", "GridPage init params numColums=" + i2 + "   verticalSpacing=" + i3);
    int k;
    int m;
    if (i1 % i2 == 0)
    {
      k = i1 / i2;
      m = 0;
    }
    int j;
    for (int i = 0;; i = j)
    {
      if (m >= k) {
        return;
      }
      LinearLayout localLinearLayout = new LinearLayout(this.d);
      Object localObject = new RelativeLayout.LayoutParams(-1, -2);
      localLinearLayout.setId(m + 10);
      if (m > 0) {
        ((RelativeLayout.LayoutParams)localObject).addRule(3, localLinearLayout.getId() - 1);
      }
      if ((i3 > 0) && (m > 0)) {
        ((RelativeLayout.LayoutParams)localObject).topMargin = i3;
      }
      localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localLinearLayout.setOrientation(0);
      int n = i;
      j = i;
      for (;;)
      {
        if (n < i + i2)
        {
          localObject = new RelativeLayout(this.d);
          LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
          localLayoutParams.weight = 1.0F;
          ((RelativeLayout)localObject).setLayoutParams(localLayoutParams);
          if (j < i1) {
            ((RelativeLayout)localObject).addView(this.b.a(n));
          }
          localLinearLayout.addView((View)localObject);
          n += 1;
          j += 1;
          continue;
          k = i1 / i2 + 1;
          break;
        }
      }
      this.f.add(localLinearLayout);
      addView(localLinearLayout);
      this.e = i1;
      m += 1;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      if (this.e != this.b.a())
      {
        removeAllViews();
        a();
        Log.c("GridPage", "data has changed..");
        return;
      }
      Log.c("GridPage", "data has no changed..");
      return;
    }
    removeAllViews();
    Log.c("GridPage", "pre cast change page.." + getChildCount());
    a();
    Log.c("GridPage", "cast change page.." + getChildCount());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */