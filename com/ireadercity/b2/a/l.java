package com.ireadercity.b2.a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.ireadercity.b2.b.g;
import com.ireadercity.b2.bean.e;
import com.ireadercity.b2.ui.widget.RecycleableImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class l
  extends BaseAdapter
{
  private static String a = "CloudProgressListAdapter";
  private Context b;
  private Activity c;
  private List<e> d;
  private View.OnClickListener e;
  private g f;
  private List<View> g = new ArrayList();
  
  public l(Context paramContext)
  {
    this.b = paramContext;
    this.f = new g(this.b, 2);
    this.e = new m(this);
  }
  
  private boolean a(String paramString)
  {
    try
    {
      Object localObject = PreferenceManager.getDefaultSharedPreferences(this.b);
      String str = ((SharedPreferences)localObject).getString("DeleteSyncIDs", "");
      paramString = str + paramString + ";";
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).putString("DeleteSyncIDs", paramString);
      ((SharedPreferences.Editor)localObject).commit();
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  private void c()
  {
    String str = PreferenceManager.getDefaultSharedPreferences(this.b).getString("DeleteSyncIDs", "");
    int i = this.d.size() - 1;
    while (i >= 0)
    {
      e locale = (e)this.d.get(i);
      if (str.indexOf(locale.a) >= 0) {
        this.d.remove(locale);
      }
      i -= 1;
    }
  }
  
  public final void a(Activity paramActivity)
  {
    this.c = paramActivity;
  }
  
  public final void a(List<e> paramList)
  {
    this.d = paramList;
    c();
  }
  
  public final boolean a()
  {
    try
    {
      int i = this.g.size() - 1;
      while (i >= 0)
      {
        ((q)((View)this.g.get(i)).getTag()).a.a();
        i -= 1;
      }
      i = this.g.size() - 1;
      while (i >= 0)
      {
        this.g.remove(i);
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
    return this.d.size();
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
    label251:
    float f1;
    if (paramView != null)
    {
      paramViewGroup = (q)paramView.getTag();
      e locale = (e)this.d.get(paramInt);
      Object localObject2 = com.ireadercity.b2.c.a.a(this.b);
      Object localObject1 = locale.k.substring(locale.k.lastIndexOf('/') + 1, locale.k.length());
      boolean bool = ((com.ireadercity.b2.c.a)localObject2).f(com.ireadercity.b2.a.l + "/" + (String)localObject1);
      localObject2 = new File(com.ireadercity.b2.a.l + "/" + (String)localObject1);
      String str = a;
      new StringBuilder().append(locale.f).append(" path=").append(com.ireadercity.b2.a.l).append("/").append((String)localObject1).toString();
      paramViewGroup.f.setTag(locale);
      if ((!bool) || (!((File)localObject2).exists())) {
        break label588;
      }
      localObject1 = a;
      paramViewGroup.f.setText("  已经下载  ");
      paramViewGroup.f.setClickable(false);
      paramViewGroup.f.setEnabled(false);
      paramViewGroup.f.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      paramViewGroup.f.setBackgroundResource(2130837570);
      localObject2 = locale.h;
      localObject1 = localObject2;
      if (!((String)localObject2).startsWith("http")) {
        localObject1 = com.ireadercity.b2.a.B + (String)localObject2;
      }
      paramViewGroup.a.setTag(localObject1);
      paramViewGroup.a.setImageBitmap(g.a(this.b));
      paramViewGroup.a.invalidate();
      this.f.a((String)localObject1, paramViewGroup.a);
      paramViewGroup.b.setText(locale.f);
      paramViewGroup.c.setText("作者：" + locale.g);
      paramViewGroup.d.setTag(locale);
      paramViewGroup.d.setOnClickListener(this.e);
      paramViewGroup = paramViewGroup.e;
      f1 = locale.d;
      if (f1 != 0.0F) {
        break label640;
      }
      paramInt = 2130838197;
    }
    for (;;)
    {
      paramViewGroup.setImageResource(paramInt);
      return paramView;
      paramView = ((LayoutInflater)this.b.getSystemService("layout_inflater")).inflate(2130903151, null);
      this.g.add(paramView);
      paramViewGroup = new q();
      paramViewGroup.a = ((RecycleableImageView)paramView.findViewById(2131361889));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131361866));
      paramViewGroup.c = ((TextView)paramView.findViewById(2131362352));
      paramViewGroup.d = ((ImageButton)paramView.findViewById(2131361869));
      paramViewGroup.e = ((ImageView)paramView.findViewById(2131362353));
      paramViewGroup.f = ((TextView)paramView.findViewById(2131361846));
      paramViewGroup.f.setOnClickListener(new p(this));
      paramView.setTag(paramViewGroup);
      break;
      label588:
      paramViewGroup.f.setText("  免费下载   ");
      paramViewGroup.f.setEnabled(true);
      paramViewGroup.f.setClickable(true);
      paramViewGroup.f.setCompoundDrawablesWithIntrinsicBounds(2130837709, 0, 0, 0);
      paramViewGroup.f.setBackgroundResource(2130837573);
      break label251;
      label640:
      if ((f1 > 0.0F) && (f1 <= 10.0F)) {
        paramInt = 2130837859;
      } else if ((f1 > 10.0F) && (f1 <= 20.0F)) {
        paramInt = 2130837960;
      } else if ((f1 > 20.0F) && (f1 <= 30.0F)) {
        paramInt = 2130837956;
      } else if ((f1 > 30.0F) && (f1 <= 40.0F)) {
        paramInt = 2130837702;
      } else if ((f1 > 40.0F) && (f1 <= 50.0F)) {
        paramInt = 2130837701;
      } else if ((f1 > 50.0F) && (f1 <= 60.0F)) {
        paramInt = 2130837906;
      } else if ((f1 > 60.0F) && (f1 <= 70.0F)) {
        paramInt = 2130837897;
      } else if ((f1 > 70.0F) && (f1 <= 80.0F)) {
        paramInt = 2130837605;
      } else if ((f1 > 80.0F) && (f1 <= 90.0F)) {
        paramInt = 2130837854;
      } else if ((f1 > 90.0F) && (f1 <= 100.0F)) {
        paramInt = 2130837928;
      } else {
        paramInt = 0;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */