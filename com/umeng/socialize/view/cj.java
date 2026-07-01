package com.umeng.socialize.view;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;

public class cj
  extends RelativeLayout
{
  private Context a;
  private cj.a b;
  private View c;
  private View d;
  private TextView e;
  
  public cj(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext;
    d();
  }
  
  private void d()
  {
    this.c = inflate(this.a, b.a(this.a, b.a.a, "umeng_socialize_comment_more"), null);
    addView(this.c, -1, -1);
    this.e = ((TextView)this.c.findViewById(b.a(this.a, b.a.b, "umeng_socialize_text")));
    this.d = this.c.findViewById(b.a(this.a, b.a.b, "umeng_socialize_pb"));
    setOnClickListener(new ck(this));
  }
  
  public void a() {}
  
  public void a(cj.a parama)
  {
    new StringBuilder("Footer change status ").append(parama).toString();
    switch (c()[parama.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.c.setVisibility(4);
      setFocusable(false);
      setClickable(false);
      this.b = cj.a.a;
      return;
    case 2: 
      this.e.setText("正在加载");
      this.c.setVisibility(0);
      this.d.setVisibility(0);
      setFocusable(false);
      setClickable(false);
      this.b = cj.a.b;
      return;
    case 3: 
      this.e.setText("点击加载更多评论");
      this.c.setVisibility(0);
      setFocusable(true);
      setClickable(true);
      this.d.setVisibility(8);
      this.b = cj.a.c;
      return;
    }
    this.e.setText("回到顶部");
    this.c.setVisibility(0);
    setClickable(true);
    setFocusable(true);
    this.d.setVisibility(8);
    this.b = cj.a.d;
  }
  
  public void b() {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */