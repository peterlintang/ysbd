package com.umeng.socialize.view;

import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.view.a.b.a;
import java.util.Iterator;
import java.util.List;

class f
  implements b.a
{
  f(CommentActivity paramCommentActivity) {}
  
  public void a()
  {
    this.a.runOnUiThread(new h(this));
  }
  
  public void a(List<UMComment> paramList)
  {
    if (this.a.commentsData == null)
    {
      this.a.commentsData = paramList;
      this.a.runOnUiThread(new g(this));
      return;
    }
    List localList = this.a.commentsData;
    if (paramList != null) {}
    for (;;)
    {
      try
      {
        paramList = paramList.iterator();
        if (!paramList.hasNext()) {
          break;
        }
      }
      finally {}
      UMComment localUMComment = (UMComment)paramList.next();
      this.a.commentsData.add(localUMComment);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */