package com.umeng.socialize.view;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.b.b;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.view.wigets.PullToRefreshListView;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentActivity
  extends com.umeng.socialize.view.a.b
{
  protected static final String a = CommentActivity.class.getName();
  private String A = "comment_list";
  private String B = "comment_list_progress";
  private String C = "comment_write";
  private String D = "title_bar_leftBt";
  private String E = "title_bar_rightBt";
  private String F = "title_bar_middleTv";
  private String G = "comment_avatar";
  Map<String, b.b> b;
  int c = -1;
  public List<UMComment> commentsData;
  boolean d = false;
  private Button k;
  private Button l;
  private TextView m;
  private PullToRefreshListView n;
  private View o;
  private View p;
  private cj q;
  private BaseAdapter r;
  private int s = 10;
  private q t;
  private String u = "contentLayout";
  private String v = "comment_item_name";
  private String w = "comment_item_content";
  private String x = "comment_item_layout";
  private String y = "comment_item_time";
  private String z = "comment_item_has_location";
  
  private void b()
  {
    this.n = ((PullToRefreshListView)findViewById(((b.b)this.b.get(this.A)).d));
    this.o = findViewById(((b.b)this.b.get(this.B)).d);
    this.p = findViewById(((b.b)this.b.get(this.C)).d);
    this.q = new j(this, this);
    int i = com.umeng.socialize.common.b.a(this, b.a.f, "umeng_socialize_comments_bg");
    this.q.setBackgroundColor(getResources().getColor(i));
    this.q.a(cj.a.a);
    this.k = ((Button)findViewById(((b.b)this.b.get(this.D)).d));
    this.k.setOnClickListener(new k(this));
    this.l = ((Button)findViewById(((b.b)this.b.get(this.E)).d));
    this.l.setVisibility(8);
    this.m = ((TextView)findViewById(((b.b)this.b.get(this.F)).d));
    this.m.setText("评论列表");
    this.p.setOnClickListener(new l(this));
    this.n.setOnRefreshListener(new m(this));
    this.n.setOnItemClickListener(new n(this));
  }
  
  private void c()
  {
    int j = 0;
    int i;
    if (this.commentsData == null)
    {
      i = 0;
      if (i >= this.s) {
        break label73;
      }
      i = 1;
      label21:
      if (i == 0) {
        break label78;
      }
      this.q.a(cj.a.a);
    }
    for (;;)
    {
      i = j;
      if (this.commentsData != null) {
        i = this.commentsData.size();
      }
      this.c = i;
      return;
      i = this.commentsData.size();
      break;
      label73:
      i = 0;
      break label21;
      label78:
      if ((this.commentsData == null) || (this.commentsData.size() > this.c))
      {
        this.q.a(cj.a.c);
      }
      else
      {
        this.d = true;
        this.q.a(cj.a.d);
      }
    }
  }
  
  private void d()
  {
    this.n.setVisibility(8);
    this.o.setVisibility(0);
  }
  
  private void f()
  {
    this.n.setVisibility(0);
    this.o.setVisibility(8);
  }
  
  protected void a()
  {
    this.t.a();
  }
  
  protected void a(Bitmap paramBitmap)
  {
    if ((paramBitmap != null) && (this.t != null) && (this.t.isShowing())) {
      this.t.a(paramBitmap);
    }
  }
  
  public void commentsChanged()
  {
    Object localObject = a;
    if (this.n.getAdapter() == null)
    {
      new com.umeng.socom.b.i(this);
      localObject = new AbsListView.LayoutParams(-1, com.umeng.socom.b.i.a(55.0F));
      this.q.setLayoutParams((ViewGroup.LayoutParams)localObject);
      if (this.commentsData != null) {
        this.commentsData.size();
      }
      this.n.addFooterView(this.q);
      this.n.setAdapter(this.r);
    }
    for (;;)
    {
      this.n.onRefreshCompleteKeepState();
      localObject = "更新于：" + new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Long.valueOf(System.currentTimeMillis()));
      this.n.setLastUpdated((CharSequence)localObject);
      if (this.n.getFirstVisiblePosition() == 0) {
        this.n.setSelection(1);
      }
      return;
      this.r.notifyDataSetChanged();
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4) {
      finish();
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public BaseAdapter getAdapter()
  {
    new com.umeng.socom.b.i(this);
    int i = com.umeng.socom.b.i.a(60.0F);
    return new i(this, com.umeng.socialize.common.b.a(this, b.a.c, "umeng_socialize_default_avatar"), i);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    paramBundle = new HashMap();
    paramBundle.put(this.u, new b.b(b.a.a, "umeng_socialize_comment_view"));
    paramBundle.put(this.x, new b.b(b.a.a, "umeng_socialize_comment_item"));
    paramBundle.put(this.v, new b.b(b.a.b, "umeng_socialize_comment_item_name"));
    paramBundle.put(this.w, new b.b(b.a.b, "umeng_socialize_comment_item_content"));
    paramBundle.put(this.y, new b.b(b.a.b, "umeng_socialize_comment_item_time"));
    paramBundle.put(this.z, new b.b(b.a.b, "umeng_socialize_comment_item_has_location"));
    paramBundle.put(this.A, new b.b(b.a.b, "umeng_socialize_comment_list"));
    paramBundle.put(this.B, new b.b(b.a.b, "umeng_socialize_comment_list_progress"));
    paramBundle.put(this.C, new b.b(b.a.b, "umeng_socialize_comment_write"));
    paramBundle.put(this.D, new b.b(b.a.b, "umeng_socialize_title_bar_leftBt"));
    paramBundle.put(this.E, new b.b(b.a.b, "umeng_socialize_title_bar_rightBt"));
    paramBundle.put(this.F, new b.b(b.a.b, "umeng_socialize_title_bar_middleTv"));
    paramBundle.put(this.G, new b.b(b.a.b, "umeng_socialize_comment_avatar"));
    this.b = new c(this, this, paramBundle).a();
    setContentView(((b.b)this.b.get(this.u)).d);
    paramBundle = this.f.getMedia();
    e locale = new e(this, paramBundle);
    if ((paramBundle != null) && (!paramBundle.isUrlMedia())) {
      paramBundle.toByte(locale);
    }
    b();
    this.r = getAdapter();
    this.h = new f(this);
    fetchFormNet(this.h, -1L);
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  protected void onStop()
  {
    super.onStop();
  }
  
  public void reflushData()
  {
    fetchFormNet(new d(this), -1L);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\CommentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */