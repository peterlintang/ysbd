package com.ireadercity.b2.opds;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ireadercity.b2.ui.widget.RecycleableImageView;
import java.util.ArrayList;
import java.util.List;

public final class g
  extends BaseAdapter
{
  private static String g = "OnlineBookStoreListAdapter";
  k a;
  Context b;
  ArrayList<b> c;
  boolean d;
  String e;
  com.ireadercity.b2.b.g f;
  private List<View> h = new ArrayList();
  
  public g(Context paramContext, ArrayList<b> paramArrayList, boolean paramBoolean, String paramString)
  {
    this.b = paramContext;
    this.c = paramArrayList;
    this.d = paramBoolean;
    this.e = paramString;
    this.a = new k(paramContext);
    this.f = new com.ireadercity.b2.b.g(paramContext.getApplicationContext(), 2);
  }
  
  public final boolean a()
  {
    try
    {
      int i = this.h.size() - 1;
      while (i >= 0)
      {
        ((h)((View)this.h.get(i)).getTag()).a.a();
        i -= 1;
      }
      i = this.h.size() - 1;
      while (i >= 0)
      {
        this.h.remove(i);
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
  
  public final int getCount()
  {
    return this.c.size();
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
    b localb = (b)this.c.get(paramInt);
    if (paramView == null)
    {
      paramView = g;
      if (this.d) {
        if (localb.i.contains("http://tp.shucang.org/shucang/s/images/"))
        {
          paramView = LayoutInflater.from(this.b).inflate(2130903135, null);
          this.h.add(paramView);
          paramViewGroup = new h(this);
          paramViewGroup.a = ((RecycleableImageView)paramView.findViewById(2131362194));
          paramViewGroup.b = ((TextView)paramView.findViewById(2131362195));
          if (this.d) {
            paramViewGroup.c = ((TextView)paramView.findViewById(2131362196));
          }
          paramView.setTag(paramViewGroup);
          label126:
          if (("".equals(localb.i)) || (localb.i == null)) {
            break label310;
          }
          Object localObject = this.a;
          localObject = k.a(this.e, localb.i);
          paramViewGroup.a.setTag(localObject);
          paramViewGroup.a.setImageBitmap(com.ireadercity.b2.b.g.a(this.b));
          paramViewGroup.a.invalidate();
          this.f.a((String)localObject, paramViewGroup.a);
          label210:
          paramViewGroup.b.setText(localb.b);
          if (this.d) {
            paramViewGroup.c.setText(Html.fromHtml(localb.c));
          }
          if (paramInt % 2 != 0) {
            break label354;
          }
          paramView.setBackgroundColor(Color.parseColor("#F0F0F0"));
        }
      }
    }
    for (;;)
    {
      paramViewGroup = g;
      return paramView;
      paramView = LayoutInflater.from(this.b).inflate(2130903123, null);
      break;
      paramView = LayoutInflater.from(this.b).inflate(2130903124, null);
      break;
      paramViewGroup = (h)paramView.getTag();
      break label126;
      label310:
      if (!this.d)
      {
        paramViewGroup.a.a(BitmapFactory.decodeStream(this.b.getResources().openRawResource(2130837504)));
        break label210;
      }
      paramViewGroup.a.setVisibility(8);
      break label210;
      label354:
      paramView.setBackgroundColor(-1);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\opds\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */