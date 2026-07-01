package com.umeng.socialize.view;

import android.view.View;
import android.view.View.OnClickListener;

class l
  implements View.OnClickListener
{
  l(CommentActivity paramCommentActivity) {}
  
  public void onClick(View paramView)
  {
    CommentActivity.a(this.a, new q(this.a, CommentActivity.l(this.a)));
    CommentActivity.m(this.a).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */