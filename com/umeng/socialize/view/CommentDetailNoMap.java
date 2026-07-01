package com.umeng.socialize.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.m;

public class CommentDetailNoMap
  extends Activity
{
  private UMComment a;
  private Button b;
  private Button c;
  private TextView d;
  
  private void a()
  {
    this.b = ((Button)findViewById(b.a(this, b.a.b, "umeng_socialize_title_bar_leftBt")));
    this.b.setOnClickListener(new p(this));
    this.c = ((Button)findViewById(b.a(this, b.a.b, "umeng_socialize_title_bar_rightBt")));
    this.c.setVisibility(8);
    this.d = ((TextView)findViewById(b.a(this, b.a.b, "umeng_socialize_title_bar_middleTv")));
    this.d.setText("评论");
  }
  
  private void b()
  {
    View localView = findViewById(b.a(this, b.a.b, "umeng_socialize_comment_item"));
    localView.setBackgroundDrawable(null);
    TextView localTextView1 = (TextView)localView.findViewById(b.a(this, b.a.b, "umeng_socialize_comment_item_name"));
    TextView localTextView2 = (TextView)localView.findViewById(b.a(this, b.a.b, "umeng_socialize_comment_item_content"));
    ImageView localImageView = (ImageView)localView.findViewById(b.a(this, b.a.b, "umeng_socialize_comment_avatar"));
    int i = b.a(this, b.a.c, "umeng_socialize_default_avatar");
    if (!TextUtils.isEmpty(this.a.user_icon)) {
      com.umeng.socom.net.p.a(this, localImageView, this.a.user_icon, false, null, null, SocializeConstants.ROUNDER_ICON);
    }
    for (;;)
    {
      localTextView1.setText(this.a.uname);
      localTextView2.setText(this.a.text);
      ((TextView)localView.findViewById(b.a(this, b.a.b, "umeng_socialize_comment_item_time"))).setText(m.a(this, this.a.dt));
      localView = localView.findViewById(b.a(this, b.a.b, "umeng_socialize_comment_item_has_location"));
      if (this.a.location != null) {
        break;
      }
      localView.setVisibility(4);
      return;
      localImageView.setImageResource(i);
    }
    localView.setVisibility(0);
  }
  
  public void finish()
  {
    super.finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(b.a(this, b.a.a, "umeng_socialize_comment_detail_nomap"));
    a();
    this.a = ((UMComment)getIntent().getExtras().get("Comment"));
    b();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\CommentDetailNoMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */