package com.ireadercity.b2.share;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ireadercity.b2.a;
import com.ireadercity.b2.ui.widget.RecycleableImageView;
import java.util.ArrayList;
import java.util.List;

public final class c
  extends BaseAdapter
{
  private static String c = "MeachilShareListAdapter";
  Context a;
  ArrayList<e> b;
  private List<View> d = new ArrayList();
  
  public c(Context paramContext, ArrayList<e> paramArrayList)
  {
    this.a = paramContext;
    this.b = paramArrayList;
  }
  
  public final int getCount()
  {
    return this.b.size();
  }
  
  public final Object getItem(int paramInt)
  {
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    e locale = (e)this.b.get(paramInt);
    if (paramView == null)
    {
      paramView = c;
      if (locale.c())
      {
        paramView = LayoutInflater.from(this.a).inflate(2130903135, null);
        this.d.add(paramView);
        paramViewGroup = new d(this);
        paramViewGroup.a = ((RecycleableImageView)paramView.findViewById(2131362194));
        paramViewGroup.b = ((TextView)paramView.findViewById(2131362195));
        if (locale.c()) {
          paramViewGroup.c = ((TextView)paramView.findViewById(2131362196));
        }
        paramView.setTag(paramViewGroup);
        label115:
        paramViewGroup.a.a(BitmapFactory.decodeStream(this.a.getResources().openRawResource(locale.b())));
        paramViewGroup.b.setText(locale.a());
        if (locale.c()) {
          paramViewGroup.c.setText("第一次分享得" + a.f + "积分");
        }
        if (paramInt % 2 != 0) {
          break label239;
        }
        paramView.setBackgroundColor(Color.parseColor("#F0F0F0"));
      }
    }
    for (;;)
    {
      paramViewGroup = c;
      return paramView;
      paramView = LayoutInflater.from(this.a).inflate(2130903136, null);
      break;
      paramViewGroup = (d)paramView.getTag();
      break label115;
      label239:
      paramView.setBackgroundColor(-1);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\share\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */