package com.ireadercity.b2.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ireadercity.b2.a;
import com.ireadercity.b2.b.g;
import com.ireadercity.b2.bean.NetBookInfo;
import com.ireadercity.b2.ui.widget.RelatedImageView;
import java.util.List;

public final class j
  extends BaseAdapter
{
  private List<NetBookInfo> a;
  private Context b;
  private LayoutInflater c;
  private g d;
  
  public j(List<NetBookInfo> paramList, Context paramContext)
  {
    this.a = paramList;
    this.b = paramContext;
    this.d = new g(paramContext, 6);
  }
  
  public final int getCount()
  {
    if (this.a != null) {
      return this.a.size();
    }
    return 0;
  }
  
  public final Object getItem(int paramInt)
  {
    if (this.a != null) {
      return this.a.get(paramInt);
    }
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView != null)
    {
      paramViewGroup = (k)paramView.getTag();
      if (paramViewGroup != null) {
        break label225;
      }
      paramViewGroup = new k((byte)0);
    }
    label225:
    for (;;)
    {
      NetBookInfo localNetBookInfo = (NetBookInfo)this.a.get(paramInt);
      if (localNetBookInfo != null)
      {
        k.a(paramViewGroup).setText(localNetBookInfo.e());
        k.b(paramViewGroup).setTag(a.A + localNetBookInfo.h());
        k.b(paramViewGroup).setImageBitmap(g.a(this.b));
        k.b(paramViewGroup).invalidate();
        this.d.a(a.A + localNetBookInfo.h(), k.b(paramViewGroup));
      }
      return paramView;
      if (this.c == null) {
        this.c = ((LayoutInflater)this.b.getSystemService("layout_inflater"));
      }
      paramViewGroup = new k((byte)0);
      paramView = this.c.inflate(2130903049, null);
      k.a(paramViewGroup, (RelatedImageView)paramView.findViewById(2131361887));
      k.a(paramViewGroup, (TextView)paramView.findViewById(2131361888));
      paramView.setTag(paramViewGroup);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */