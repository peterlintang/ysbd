package com.umeng.xp.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.umeng.common.net.i;
import com.umeng.xp.Promoter;
import com.umeng.xp.a.c;
import com.umeng.xp.a.d;
import com.umeng.xp.controller.a.a;
import java.util.List;

public class aw$b
  extends BaseAdapter
{
  public List<a.a> a;
  public int b = -1;
  private Context d;
  
  public aw$b(Context paramContext, List<a.a> paramList, int paramInt)
  {
    this.d = paramList;
    this.a = paramInt;
    int i;
    this.b = i;
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return ((a.a)this.a.get(paramInt)).b;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramView = (ViewGroup)LinearLayout.inflate(this.d, d.A(this.d), null);
    paramViewGroup = (ImageView)paramView.findViewById(c.b(this.d));
    TextView localTextView = (TextView)paramView.findViewById(c.c(this.d));
    localTextView.setSelected(true);
    a.a locala = (a.a)this.a.get(paramInt);
    i.a(this.d, paramViewGroup, locala.a.icon, false, null, aw.d(this.c));
    localTextView.setText(locala.a.title);
    return paramView;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\aw$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */