package com.umeng.socialize.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;

class q$a
{
  SHARE_MEDIA a;
  ImageButton b;
  ImageView c;
  boolean d;
  String e;
  View f;
  n g;
  
  public q$a(q paramq, Context paramContext, n paramn)
  {
    this.g = paramn;
    this.a = SHARE_MEDIA.convertToEmun(this.g.a);
    this.f = q.a(paramq).inflate(b.a(paramq.getContext(), b.a.a, "umeng_socialize_post_comment_platform"), q.b(paramq), false);
    this.b = ((ImageButton)this.f.findViewById(b.a(paramq.getContext(), b.a.b, "umeng_socialize_post_cws_ic")));
    this.c = ((ImageView)this.f.findViewById(b.a(paramq.getContext(), b.a.b, "umeng_socialize_post_cws_selected")));
    paramq = new z(this);
    this.b.setOnClickListener(new aa(this, paramq));
  }
  
  public void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      this.e = paramString;
      this.d = true;
    }
  }
  
  public boolean a()
  {
    return (this.d) && (!TextUtils.isEmpty(this.e)) && (this.c.getVisibility() == 0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\q$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */