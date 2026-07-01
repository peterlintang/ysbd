package com.umeng.socialize.view.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.umeng.socialize.bean.SnsAccount;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.j.b;
import com.umeng.socialize.common.j.d;
import com.umeng.socialize.view.controller.d;
import com.umeng.socialize.view.wigets.SwitchButton;
import com.umeng.socom.b.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ag
  extends RelativeLayout
{
  private static final String b = ag.class.getName();
  public View a;
  private d c;
  private Context d;
  private LinearLayout e;
  private ImageView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private at.b j;
  private View k;
  private View l;
  private ViewFlipper m;
  private String n;
  private String o;
  private int p;
  private Map<n, ag.a> q;
  
  public ag(Context paramContext, d paramd, int paramInt)
  {
    super(paramContext);
    this.d = paramContext;
    this.c = paramd;
    this.p = paramInt;
    d();
    paramContext = new ah(this);
    this.c.a(paramContext);
  }
  
  private void a(n paramn, TextView paramTextView)
  {
    if (paramn.e)
    {
      if ((paramn.h != null) && (!TextUtils.isEmpty(paramn.h.getUserName())))
      {
        paramTextView.setText(paramn.h.getUserName());
        return;
      }
      paramTextView.setText("已授权");
      return;
    }
    paramTextView.setText("未授权");
  }
  
  /* Error */
  private void a(SwitchButton paramSwitchButton, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual 108	com/umeng/socialize/view/wigets/SwitchButton:getOnCheckedChangeListener	()Landroid/widget/CompoundButton$OnCheckedChangeListener;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull +21 -> 29
    //   11: aload_1
    //   12: aconst_null
    //   13: invokevirtual 112	com/umeng/socialize/view/wigets/SwitchButton:setOnCheckedChangeListener	(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    //   16: aload_1
    //   17: iload_2
    //   18: invokevirtual 116	com/umeng/socialize/view/wigets/SwitchButton:setChecked	(Z)V
    //   21: aload_1
    //   22: aload_3
    //   23: invokevirtual 112	com/umeng/socialize/view/wigets/SwitchButton:setOnCheckedChangeListener	(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_1
    //   30: iload_2
    //   31: invokevirtual 116	com/umeng/socialize/view/wigets/SwitchButton:setChecked	(Z)V
    //   34: goto -8 -> 26
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	ag
    //   0	42	1	paramSwitchButton	SwitchButton
    //   0	42	2	paramBoolean	boolean
    //   6	17	3	localOnCheckedChangeListener	android.widget.CompoundButton.OnCheckedChangeListener
    // Exception table:
    //   from	to	target	type
    //   2	7	37	finally
    //   11	26	37	finally
    //   29	34	37	finally
  }
  
  private void d()
  {
    View localView = View.inflate(this.d, b.a(this.d, b.a.a, "umeng_socialize_ucenter"), null);
    this.k = localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_title_bar_leftBt"));
    localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_title_bar_rightBt")).setVisibility(8);
    ((TextView)localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_title_bar_middleTv"))).setText("个人中心");
    this.e = ((LinearLayout)localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_share_config_area")));
    c();
    addView(localView, new RelativeLayout.LayoutParams(-1, -1));
    Object localObject = localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_ucenter_info"));
    if (16 == (this.p & 0xF0)) {
      ((View)localObject).setVisibility(8);
    }
    localObject = localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_share_area"));
    if (32 == (this.p & 0xF0)) {
      ((View)localObject).setVisibility(8);
    }
    this.f = ((ImageView)localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_ic")));
    this.g = ((TextView)localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_loginNm")));
    this.h = ((TextView)localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_loginAddr")));
    this.m = ((ViewFlipper)localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_login_switch")));
    this.i = ((TextView)localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_title_tv")));
    this.n = this.d.getString(b.a(this.d, b.a.e, "umeng_socialize_ucenter_login_title_guide"));
    this.o = this.d.getString(b.a(this.d, b.a.e, "umeng_socialize_ucenter_login_title_platform"));
    this.i.setText(this.o);
    localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_loginButton")).setOnClickListener(new an(this, new am(this)));
    this.a = View.inflate(this.d, b.a(this.d, b.a.a, "umeng_socialize_full_curtain"), null);
    localObject = new RelativeLayout.LayoutParams(-1, -1);
    addView(this.a, (ViewGroup.LayoutParams)localObject);
    this.a.setClickable(false);
    this.a.setOnTouchListener(new ao(this));
    this.j = new ap(this, this.d);
    this.l = localView.findViewById(b.a(this.d, b.a.b, "umeng_socialize_load_error"));
    this.l.setVisibility(8);
    this.l.setOnClickListener(new ar(this));
  }
  
  public void a()
  {
    this.l.setVisibility(8);
    this.c.a(new ai(this));
  }
  
  public void a(View.OnClickListener paramOnClickListener)
  {
    this.k.setOnClickListener(paramOnClickListener);
  }
  
  protected void a(SnsAccount paramSnsAccount)
  {
    if (paramSnsAccount != null)
    {
      this.g.setText(paramSnsAccount.getUserName());
      Object localObject = paramSnsAccount.getAccount_icon_url();
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        int i1 = b.a(this.d, b.a.c, "umeng_socialize_default_avatar");
        localObject = new j.b(this.d, this.f, (String)localObject).a(i1).a(true);
        String str = paramSnsAccount.getPlatform();
        if ((str != null) && ("qzone".equals(str))) {
          ((j.b)localObject).a(j.d.c);
        }
        ((j.b)localObject).a();
      }
      this.h.setText(paramSnsAccount.getProfileUrl());
      this.i.setText(this.o);
    }
  }
  
  protected void b()
  {
    Iterator localIterator = this.q.keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        invalidate();
        return;
      }
      n localn = (n)localIterator.next();
      ag.a locala = (ag.a)this.q.get(localn);
      SwitchButton localSwitchButton = locala.a;
      TextView localTextView = locala.b;
      localSwitchButton.a = true;
      localSwitchButton.setChecked(localn.e);
      localSwitchButton.a = false;
      String str = b;
      new StringBuilder("set oauth status ").append(localn.b).append("  ").append(localn.e).toString();
      a(localn, localTextView);
      if (locala.a.getOnCheckedChangeListener() == null)
      {
        localSwitchButton.setOnCheckedChangeListener(new aj(this, localSwitchButton, localn));
        localSwitchButton.setOnTouchListener(new al(this, localSwitchButton));
      }
    }
  }
  
  public void c()
  {
    List localList = this.c.a();
    this.q = new HashMap();
    new i(this.d);
    int i2 = i.a(46.0F);
    int i1 = 0;
    for (;;)
    {
      if (i1 >= localList.size()) {
        return;
      }
      n localn = (n)localList.get(i1);
      View localView1 = View.inflate(this.d, b.a(this.d, b.a.a, "umeng_socialize_ucenter_platform_item"), null);
      TextView localTextView = (TextView)localView1.findViewById(b.a(this.d, b.a.b, "umeng_socialize_msg"));
      ((ImageView)localView1.findViewById(b.a(this.d, b.a.b, "umeng_socialize_icon"))).setImageResource(localn.c);
      SwitchButton localSwitchButton = (SwitchButton)localView1.findViewById(b.a(this.d, b.a.b, "umeng_socialize_toggle"));
      localTextView.setText(localn.b);
      if (i1 == localList.size() - 1)
      {
        ViewGroup localViewGroup = (ViewGroup)localView1;
        View localView2 = localViewGroup.findViewById(b.a(this.d, b.a.b, "umeng_socialize_divider"));
        if (localView2 != null) {
          localViewGroup.removeView(localView2);
        }
      }
      this.q.put(localn, new ag.a(localSwitchButton, localTextView));
      this.e.addView(localView1, new RelativeLayout.LayoutParams(-1, i2));
      i1 += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */