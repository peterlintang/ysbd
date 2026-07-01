package com.umeng.fb.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.common.b.g;
import com.umeng.fb.a.a;
import com.umeng.fb.a.b;
import com.umeng.fb.b.a;
import com.umeng.fb.b.e;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;

public class d
  extends BaseAdapter
{
  LayoutInflater a;
  Context b;
  List<com.umeng.fb.b> c;
  JSONArray d;
  String[] e;
  String f = "";
  String g = "FeedbackListAdapter";
  
  public d(Context paramContext, List<com.umeng.fb.b> paramList)
  {
    this.b = paramContext;
    this.a = LayoutInflater.from(paramContext);
    Collections.sort(paramList);
    this.c = paramList;
  }
  
  private String a(com.umeng.fb.b paramb)
  {
    return paramb.d.a();
  }
  
  private String b(com.umeng.fb.b paramb)
  {
    if (paramb.b == b.a.d)
    {
      int i = paramb.f.size() - 1;
      while (i >= 0)
      {
        a.a locala = paramb.a(i).g;
        if (locala == a.a.a) {
          return this.b.getString(e.g(this.b));
        }
        if (locala == a.a.b) {
          return this.b.getString(e.h(this.b));
        }
        if (locala == a.a.d) {
          return this.b.getString(e.i(this.b));
        }
        i -= 1;
      }
    }
    if (paramb.b == b.a.b) {
      return this.b.getString(e.j(this.b));
    }
    if (paramb.b == b.a.a) {
      return this.b.getString(e.g(this.b));
    }
    return "";
  }
  
  private String c(com.umeng.fb.b paramb)
  {
    if ((paramb.f.size() != 1) && (paramb.e.f == a.b.c)) {
      return paramb.e.a();
    }
    return null;
  }
  
  private String d(com.umeng.fb.b paramb)
  {
    return com.umeng.fb.util.a.a(paramb.e.e, this.b);
  }
  
  public b.a a(int paramInt)
  {
    return ((com.umeng.fb.b)this.c.get(paramInt)).b;
  }
  
  public void a(List<com.umeng.fb.b> paramList)
  {
    Collections.sort(paramList);
    this.c = paramList;
  }
  
  public com.umeng.fb.b b(int paramInt)
  {
    return (com.umeng.fb.b)this.c.get(paramInt);
  }
  
  public int getCount()
  {
    return this.c.size();
  }
  
  public Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    com.umeng.fb.b localb;
    String str2;
    String str3;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = this.a.inflate(com.umeng.fb.b.d.b(this.b), null);
      paramViewGroup = new d.a(this);
      paramViewGroup.a = ((ImageView)paramView.findViewById(com.umeng.fb.b.c.g(this.b)));
      paramViewGroup.b = ((TextView)paramView.findViewById(com.umeng.fb.b.c.h(this.b)));
      paramViewGroup.c = ((TextView)paramView.findViewById(com.umeng.fb.b.c.i(this.b)));
      paramViewGroup.d = ((TextView)paramView.findViewById(com.umeng.fb.b.c.j(this.b)));
      paramView.setTag(paramViewGroup);
      localb = (com.umeng.fb.b)this.c.get(paramInt);
      String str1 = a(localb);
      str2 = c(localb);
      str3 = b(localb);
      String str4 = d(localb);
      paramViewGroup.b.setText(str1);
      if (str2 != null) {
        break label247;
      }
      paramViewGroup.c.setVisibility(8);
      label183:
      if (!g.c(str3)) {
        break label267;
      }
      paramViewGroup.d.setText(str4);
    }
    for (;;)
    {
      if (!com.umeng.fb.util.c.a(this.b, localb)) {
        break label279;
      }
      paramViewGroup.a.setVisibility(0);
      paramViewGroup.a.setBackgroundResource(com.umeng.fb.b.b.a(this.b));
      return paramView;
      paramViewGroup = (d.a)paramView.getTag();
      break;
      label247:
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText(str2);
      break label183;
      label267:
      paramViewGroup.d.setText(str3);
    }
    label279:
    paramViewGroup.a.setVisibility(4);
    return paramView;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */