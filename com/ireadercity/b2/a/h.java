package com.ireadercity.b2.a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;
import com.ireadercity.b2.a;
import com.ireadercity.b2.b.g;
import com.ireadercity.b2.bean.NetBookInfo;
import com.ireadercity.b2.ui.widget.RecycleableImageView;
import java.util.ArrayList;
import java.util.List;

public final class h
  extends ArrayAdapter<NetBookInfo>
{
  private int[] a = { -16777216, -13421773 };
  private List<View> b = new ArrayList();
  private List<NetBookInfo> c;
  private Activity d;
  private g e;
  
  public h(Activity paramActivity, List<NetBookInfo> paramList)
  {
    super(paramActivity, 0, paramList);
    this.d = paramActivity;
    this.c = paramList;
    this.e = new g(paramActivity.getApplicationContext(), 2);
  }
  
  public final boolean a()
  {
    try
    {
      int i = this.b.size() - 1;
      while (i >= 0)
      {
        ((i)((View)this.b.get(i)).getTag()).a.a();
        i -= 1;
      }
      i = this.b.size() - 1;
      while (i >= 0)
      {
        this.b.remove(i);
        i -= 1;
      }
      return true;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
      return false;
    }
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    String str;
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.d.getSystemService("layout_inflater")).inflate(2130903050, null);
      this.b.add(paramView);
      paramViewGroup = new i();
      paramViewGroup.a = ((RecycleableImageView)paramView.findViewById(2131361889));
      paramViewGroup.b = ((RatingBar)paramView.findViewById(2131361893));
      paramViewGroup.c = ((TextView)paramView.findViewById(2131361891));
      paramViewGroup.d = ((TextView)paramView.findViewById(2131361892));
      paramView.setTag(paramViewGroup);
      NetBookInfo localNetBookInfo = (NetBookInfo)this.c.get(paramInt);
      if (localNetBookInfo != null)
      {
        paramViewGroup.b.setRating(localNetBookInfo.k() / 2.0F);
        paramViewGroup.c.setText(localNetBookInfo.e());
        str = localNetBookInfo.f();
        paramViewGroup.d.setText(str);
        str = localNetBookInfo.h();
        if (str.startsWith("http")) {
          break label260;
        }
        str = a.B + localNetBookInfo.h();
      }
    }
    label260:
    for (;;)
    {
      paramViewGroup.a.setTag(str);
      paramViewGroup.a.setImageBitmap(g.a(this.d));
      paramViewGroup.a.invalidate();
      this.e.a(str, paramViewGroup.a);
      return paramView;
      paramViewGroup = (i)paramView.getTag();
      break;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */