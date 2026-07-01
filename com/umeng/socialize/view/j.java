package com.umeng.socialize.view;

import android.content.Context;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.view.a.b.a;
import com.umeng.socialize.view.wigets.PullToRefreshListView;
import java.util.List;

class j
  extends cj
{
  j(CommentActivity paramCommentActivity, Context paramContext)
  {
    super(paramContext);
  }
  
  public void a()
  {
    super.a();
    CommentActivity localCommentActivity = this.a;
    b.a locala = CommentActivity.j(this.a);
    if (this.a.commentsData == null) {}
    for (long l = -1L;; l = ((UMComment)this.a.commentsData.get(this.a.commentsData.size() - 1)).dt)
    {
      localCommentActivity.fetchFormNet(locala, l);
      return;
    }
  }
  
  public void b()
  {
    super.b();
    int i = CommentActivity.k(this.a).getHeaderViewsCount();
    CommentActivity.k(this.a).setSelection(i);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */