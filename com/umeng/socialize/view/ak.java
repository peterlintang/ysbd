package com.umeng.socialize.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.view.a.y.a;

class ak
  extends y.a
{
  ak(aj paramaj, Context paramContext1, Context paramContext2)
  {
    super(paramContext1);
  }
  
  public void a(View paramView)
  {
    paramView.findViewById(b.a(this.b, b.a.b, "umeng_socialize_title_bar_leftBt")).setOnClickListener(new al(this));
    paramView.findViewById(b.a(this.b, b.a.b, "umeng_socialize_title_bar_rightBt")).setVisibility(8);
    ((TextView)paramView.findViewById(b.a(this.b, b.a.b, "umeng_socialize_title_bar_middleTv"))).setText("登录");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */