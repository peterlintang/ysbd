package com.umeng.socialize.view.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;

public class y$b
{
  private View a;
  private ImageView b;
  private TextView c;
  
  public y$b(Context paramContext)
  {
    this.a = View.inflate(paramContext, b.a(paramContext, b.a.a, "umeng_socialize_full_alert_dialog_item"), null);
    this.b = ((ImageView)this.a.findViewById(b.a(paramContext, b.a.b, "umeng_socialize_full_alert_dialog_item_icon")));
    this.c = ((TextView)this.a.findViewById(b.a(paramContext, b.a.b, "umeng_socialize_full_alert_dialog_item_text")));
  }
  
  public View a()
  {
    return this.a;
  }
  
  public b a(int paramInt)
  {
    this.b.setImageResource(paramInt);
    return this;
  }
  
  public b a(View.OnClickListener paramOnClickListener)
  {
    this.a.setOnClickListener(paramOnClickListener);
    return this;
  }
  
  public b a(String paramString)
  {
    this.c.setText(paramString);
    return this;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\y$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */