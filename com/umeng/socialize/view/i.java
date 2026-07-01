package com.umeng.socialize.view;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.common.b.b;
import com.umeng.socialize.common.m;
import com.umeng.socom.net.p;
import java.util.List;
import java.util.Map;

class i
  extends BaseAdapter
{
  i(CommentActivity paramCommentActivity, int paramInt1, int paramInt2) {}
  
  public int getCount()
  {
    if (this.a.commentsData == null) {
      return 0;
    }
    return this.a.commentsData.size();
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(((b.b)this.a.b.get(CommentActivity.d(this.a))).d, null);
    }
    paramView = (UMComment)this.a.commentsData.get(paramInt);
    Object localObject = (TextView)paramViewGroup.findViewById(((b.b)this.a.b.get(CommentActivity.e(this.a))).d);
    TextView localTextView = (TextView)paramViewGroup.findViewById(((b.b)this.a.b.get(CommentActivity.f(this.a))).d);
    ((TextView)localObject).setText(paramView.uname);
    localTextView.setText(paramView.text);
    localObject = (ImageView)paramViewGroup.findViewById(((b.b)this.a.b.get(CommentActivity.g(this.a))).d);
    ((ImageView)localObject).setImageResource(this.b);
    if (!TextUtils.isEmpty(paramView.user_icon)) {
      p.a(this.a, (ImageView)localObject, paramView.user_icon, false, null, null, SocializeConstants.ROUNDER_ICON);
    }
    ((TextView)paramViewGroup.findViewById(((b.b)this.a.b.get(CommentActivity.h(this.a))).d)).setText(m.a(this.a, paramView.dt));
    localObject = paramViewGroup.findViewById(((b.b)this.a.b.get(CommentActivity.i(this.a))).d);
    if (paramView.location == null) {
      ((View)localObject).setVisibility(4);
    }
    for (;;)
    {
      paramViewGroup.setLayoutParams(new AbsListView.LayoutParams(-1, this.c));
      return paramViewGroup;
      ((View)localObject).setVisibility(0);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */