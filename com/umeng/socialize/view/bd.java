package com.umeng.socialize.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.view.a.y.a;

class bd
  extends y.a
{
  bd(bc parambc, Context paramContext)
  {
    super(paramContext);
  }
  
  public void a(View paramView)
  {
    paramView.findViewById(b.a(bc.a(this.a), b.a.b, "umeng_socialize_title_bar_leftBt")).setOnClickListener(new be(this));
    paramView.findViewById(b.a(bc.a(this.a), b.a.b, "umeng_socialize_title_bar_rightBt")).setVisibility(8);
    ((TextView)paramView.findViewById(b.a(bc.a(this.a), b.a.b, "umeng_socialize_title_bar_middleTv"))).setText("分享到");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */