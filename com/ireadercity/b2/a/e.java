package com.ireadercity.b2.a;

import android.content.Context;
import android.os.AsyncTask.Status;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ireadercity.b2.bean.d;
import com.ireadercity.b2.e.a;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class e
  extends BaseAdapter
{
  private static String a = "BookStoreDownloadListAdapter";
  private Context b;
  private View.OnClickListener c;
  
  public e(Context paramContext)
  {
    this.b = paramContext;
    this.c = new f(this);
  }
  
  public final int getCount()
  {
    String str = a;
    return a.a(this.b).b().size();
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
    d locald = null;
    if (paramView != null) {
      paramViewGroup = (g)paramView.getTag();
    }
    for (;;)
    {
      if (a.a(this.b).b().size() > paramInt) {
        locald = (d)a.a(this.b).b().get(paramInt);
      }
      if (locald != null) {
        break;
      }
      paramViewGroup = a;
      return paramView;
      paramView = ((LayoutInflater)this.b.getSystemService("layout_inflater")).inflate(2130903046, null);
      paramViewGroup = new g();
      paramViewGroup.a = ((TextView)paramView.findViewById(2131361866));
      paramViewGroup.d = ((ImageButton)paramView.findViewById(2131361869));
      paramViewGroup.c = ((ImageButton)paramView.findViewById(2131361868));
      paramViewGroup.b = ((ProgressBar)paramView.findViewById(2131361867));
      paramView.setTag(paramViewGroup);
    }
    paramViewGroup.a.setText(locald.e());
    paramViewGroup.d.setTag(locald);
    paramViewGroup.c.setTag(locald);
    paramViewGroup.d.setOnClickListener(this.c);
    paramViewGroup.c.setOnClickListener(this.c);
    Object localObject = (com.ireadercity.b2.e.e)a.b.get(locald.g());
    if (localObject != null)
    {
      ((com.ireadercity.b2.e.e)localObject).a(paramViewGroup.b);
      if (((com.ireadercity.b2.e.e)localObject).getStatus().equals(AsyncTask.Status.RUNNING)) {
        paramViewGroup.c.setImageResource(2130837763);
      }
    }
    for (;;)
    {
      localObject = (Integer)a.c.get(locald.g());
      if (localObject == null) {
        break;
      }
      paramViewGroup.b.setProgress(((Integer)localObject).intValue());
      return paramView;
      paramViewGroup.c.setImageResource(2130837762);
      continue;
      paramViewGroup.c.setImageResource(2130837762);
    }
    paramViewGroup.b.setProgress(a.d(locald));
    return paramView;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */