package com.umeng.socialize.view;

import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.view.a.b.a;
import java.util.List;

class d
  implements b.a
{
  d(CommentActivity paramCommentActivity) {}
  
  public void a() {}
  
  public void a(List<UMComment> paramList)
  {
    this.a.d = false;
    this.a.c = -1;
    this.a.commentsData = paramList;
    this.a.commentsChanged();
    CommentActivity.b(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */