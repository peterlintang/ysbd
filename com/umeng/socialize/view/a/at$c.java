package com.umeng.socialize.view.a;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class at$c
{
  public Dialog a;
  private Context b;
  private List<n> c;
  private Map<n, View> d;
  private View e;
  
  public at$c(Context paramContext, List<n> paramList)
  {
    this.b = paramContext;
    this.c = paramList;
    this.d = new HashMap();
    b();
  }
  
  private void b()
  {
    aa.a locala = new aa.a(this.b);
    Object localObject1 = this.c.iterator();
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        this.e = View.inflate(this.b, b.a(this.b, b.a.a, "umeng_socialize_base_alert_dialog_button"), null);
        localObject1 = (Button)this.e.findViewById(b.a(this.b, b.a.b, "umeng_socialize_alert_button"));
        ((Button)localObject1).setText("使用匿名账号");
        ((Button)localObject1).setBackgroundResource(b.a(this.b, b.a.c, "umeng_socialize_button_white_blue"));
        ((Button)localObject1).setOnClickListener(new bc(this));
        locala.a(this.e, null);
        localObject1 = View.inflate(this.b, b.a(this.b, b.a.a, "umeng_socialize_base_alert_dialog_button"), null);
        localObject2 = (Button)((View)localObject1).findViewById(b.a(this.b, b.a.b, "umeng_socialize_alert_button"));
        ((Button)localObject2).setText("取消");
        ((Button)localObject2).setBackgroundResource(b.a(this.b, b.a.c, "umeng_socialize_button_grey_blue"));
        ((Button)localObject2).setOnClickListener(new bd(this));
        locala.b((View)localObject1, null);
        this.a = locala.a();
        return;
      }
      Object localObject2 = (n)((Iterator)localObject1).next();
      View localView = View.inflate(this.b, b.a(this.b, b.a.a, "umeng_socialize_base_alert_dialog_button"), null);
      Button localButton = (Button)localView.findViewById(b.a(this.b, b.a.b, "umeng_socialize_alert_button"));
      localButton.setText("使用" + ((n)localObject2).b + "账号");
      localButton.setBackgroundResource(b.a(this.b, b.a.c, "umeng_socialize_button_white_blue"));
      localButton.setOnClickListener(new bb(this, (n)localObject2));
      locala.a(localView, null);
      this.d.put(localObject2, localView);
    }
  }
  
  public void a()
  {
    this.e.setVisibility(8);
    Iterator localIterator;
    int i;
    if (!this.a.isShowing())
    {
      localIterator = this.d.keySet().iterator();
      i = 0;
      if (!localIterator.hasNext())
      {
        if (i == 0) {
          break label147;
        }
        m.a(this.a, false);
      }
    }
    else
    {
      return;
    }
    n localn = (n)localIterator.next();
    if ((!localn.f) && (localn.e)) {
      ((View)this.d.get(localn)).setVisibility(0);
    }
    for (;;)
    {
      if (localn.f) {
        this.e.setVisibility(0);
      }
      if (!localn.e) {
        break;
      }
      i = 1;
      break;
      ((View)this.d.get(localn)).setVisibility(8);
    }
    label147:
    Toast.makeText(this.b, "请先授权分享平台.", 1).show();
  }
  
  public abstract void a(n paramn);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\at$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */