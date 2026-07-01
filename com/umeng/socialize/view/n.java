package com.umeng.socialize.view;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.common.m;
import com.umeng.socialize.view.wigets.PullToRefreshListView;
import java.util.List;

class n
  implements AdapterView.OnItemClickListener
{
  n(CommentActivity paramCommentActivity) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramInt -= CommentActivity.k(this.a).getHeaderViewsCount();
    if ((this.a.commentsData == null) || (paramInt == this.a.commentsData.size())) {
      return;
    }
    paramView = (UMComment)this.a.commentsData.get(paramInt);
    if (m.a()) {}
    for (paramAdapterView = new Intent(this.a, CommentDetail.class);; paramAdapterView = new Intent(this.a, CommentDetailNoMap.class))
    {
      paramAdapterView.putExtra("Comment", paramView);
      this.a.startActivity(paramAdapterView);
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */