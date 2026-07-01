package com.ireadercity.b2.a;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.net.URLDecoder;
import java.util.List;

public final class c
  extends BaseAdapter
{
  private List<com.ireadercity.b2.bean.c> a;
  private LayoutInflater b;
  private Context c;
  
  public c(List<com.ireadercity.b2.bean.c> paramList, LayoutInflater paramLayoutInflater, Context paramContext)
  {
    this.a = paramList;
    this.b = paramLayoutInflater;
    this.c = paramContext;
  }
  
  public final void a(List<com.ireadercity.b2.bean.c> paramList)
  {
    this.a = paramList;
    notifyDataSetChanged();
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
    return this.a.get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (paramView == null)
    {
      localObject = new d(this);
      paramViewGroup = this.b.inflate(2130903043, null);
      ((d)localObject).d = ((TextView)paramViewGroup.findViewById(2131361831));
      ((d)localObject).c = ((TextView)paramViewGroup.findViewById(2131361830));
      ((d)localObject).a = ((TextView)paramViewGroup.findViewById(2131361829));
      ((d)localObject).b = ((ImageView)paramViewGroup.findViewById(2131361828));
      paramViewGroup.setTag(localObject);
    }
    for (;;)
    {
      try
      {
        paramView = (com.ireadercity.b2.bean.c)this.a.get(paramInt);
        String str = URLDecoder.decode(paramView.b());
        ((d)localObject).d.setText(str);
        ((d)localObject).c.setText(paramView.d());
        ((d)localObject).a.setText(paramView.c());
        localObject = ((d)localObject).b;
        switch (paramView.a() / 2)
        {
        case 0: 
          ((ImageView)localObject).setImageBitmap(paramView);
          return paramViewGroup;
        }
      }
      catch (Exception paramView)
      {
        paramView.printStackTrace();
        return paramViewGroup;
      }
      localObject = (d)paramView.getTag();
      paramViewGroup = paramView;
      continue;
      paramView = BitmapFactory.decodeResource(this.c.getResources(), 2130837923);
      continue;
      paramView = BitmapFactory.decodeResource(this.c.getResources(), 2130837918);
      continue;
      paramView = BitmapFactory.decodeResource(this.c.getResources(), 2130837919);
      continue;
      paramView = BitmapFactory.decodeResource(this.c.getResources(), 2130837920);
      continue;
      paramView = BitmapFactory.decodeResource(this.c.getResources(), 2130837921);
      continue;
      paramView = BitmapFactory.decodeResource(this.c.getResources(), 2130837922);
      continue;
      paramView = null;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */