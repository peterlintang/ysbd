package com.umeng.socialize.view.a;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.f.a;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;

public abstract class h
  extends a
{
  private View d;
  private View e;
  private View f;
  private View g;
  private View h;
  private View i;
  private View j;
  private ImageView k;
  private ImageView l;
  private ImageView m;
  private ImageView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private TextView r;
  
  public h(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public h(Context paramContext, String paramString)
  {
    super(paramContext, paramString);
  }
  
  private void b(View paramView)
  {
    Context localContext = getContext();
    this.f = paramView.findViewById(b.a(getContext(), b.a.b, "umeng_socialize_like_bt"));
    this.e = paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_like_bt_show"));
    this.d = paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_like_bt_progress"));
    this.k = ((ImageView)paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_like_icon")));
    this.l = ((ImageView)paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_action_share_im")));
    this.m = ((ImageView)paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_action_comment_im")));
    this.o = ((TextView)paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_action_like_tv")));
    this.p = ((TextView)paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_action_share_tv")));
    this.q = ((TextView)paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_action_comment_tv")));
    this.r = ((TextView)paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_action_pv_tv")));
    this.g = paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_comment_bt"));
    this.h = paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_share_bt"));
    this.i = paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_user_center_bt"));
    this.n = ((ImageView)paramView.findViewById(b.a(localContext, b.a.b, "umeng_socialize_action_user_center_im")));
  }
  
  public View getErrorView()
  {
    RelativeLayout localRelativeLayout = new RelativeLayout(getContext());
    localRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    localRelativeLayout.setBackgroundResource(b.a(getContext(), b.a.c, "umeng_socialize_actionbar_bg"));
    TextView localTextView = new TextView(getContext());
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(13);
    localTextView.setGravity(17);
    localTextView.setTextSize(2, 16.0F);
    localTextView.setText("网络异常，数据加载失败");
    localRelativeLayout.addView(localTextView, localLayoutParams);
    return localRelativeLayout;
  }
  
  public View getLoadingView()
  {
    com.umeng.socialize.view.a locala = new com.umeng.socialize.view.a(getContext());
    locala.a(getActivity());
    return locala;
  }
  
  public View getView()
  {
    if (this.j != null)
    {
      onViewUpdate();
      return this.j;
    }
    this.j = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(b.a(getContext(), b.a.a, "umeng_socialize_actionbar"), null);
    b(this.j);
    onViewUpdate();
    Handler localHandler = new Handler();
    i locali = new i(this, (SocializeListeners.SocializeClientListener[])this.b.getConfig().getListener(SocializeListeners.SocializeClientListener.class));
    this.f.setOnClickListener(new j(this, localHandler, locali));
    this.h.setOnClickListener(new l(this, localHandler));
    this.h.setOnTouchListener(new n(this));
    this.g.setOnClickListener(new o(this));
    this.g.setOnTouchListener(new p(this));
    this.i.setOnClickListener(new q(this, localHandler));
    this.i.setOnTouchListener(new s(this));
    return this.j;
  }
  
  public void onViewUpdate()
  {
    super.onViewUpdate();
    Object localObject = this.a;
    localObject = this.b.getEntity();
    if (localObject == null) {
      return;
    }
    if (((SocializeEntity)localObject).getIlike() == f.a.a) {
      this.k.setImageResource(b.a(getContext(), b.a.c, "umeng_socialize_action_like"));
    }
    for (;;)
    {
      this.o.setText(String.valueOf(((SocializeEntity)localObject).getLike_count()));
      this.p.setText(String.valueOf(((SocializeEntity)localObject).getShare_count()));
      this.q.setText(String.valueOf(((SocializeEntity)localObject).getComment_count()));
      this.r.setText(String.valueOf(((SocializeEntity)localObject).getPv()));
      return;
      this.k.setImageResource(b.a(getContext(), b.a.c, "umeng_socialize_action_unlike"));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */