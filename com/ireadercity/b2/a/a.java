package com.ireadercity.b2.a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.ireadercity.b2.b.g;
import com.ireadercity.b2.b.j;
import java.util.HashMap;
import java.util.List;

public final class a
  extends ArrayAdapter<HashMap<String, String>>
{
  private int[] a = { 11184810, 13421772, 14548991 };
  private List<HashMap<String, String>> b;
  private Activity c;
  private g d;
  
  public a(Activity paramActivity, List<HashMap<String, String>> paramList)
  {
    super(paramActivity, 0, paramList);
    this.c = paramActivity;
    this.b = paramList;
    this.d = new g(paramActivity.getApplicationContext(), 1);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.c.getSystemService("layout_inflater")).inflate(2130903055, null);
      paramViewGroup = new b();
      paramViewGroup.a = ((ImageView)paramView.findViewById(2131361920));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131361921));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      Object localObject = (HashMap)this.b.get(paramInt);
      if (localObject != null)
      {
        paramView.setBackgroundColor(this.a[(paramInt % 3)]);
        paramViewGroup.b.setText((CharSequence)((HashMap)localObject).get("title"));
        localObject = com.ireadercity.b2.a.A + "/" + (String)((HashMap)localObject).get("icon");
        paramViewGroup.a.setTag(localObject);
        this.d.a((String)localObject, this.c, paramViewGroup.a, j.b);
      }
      return paramView;
      paramViewGroup = (b)paramView.getTag();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */