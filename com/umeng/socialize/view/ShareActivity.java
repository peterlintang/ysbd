package com.umeng.socialize.view;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.umeng.socialize.b.a;
import com.umeng.socialize.b.d;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.l;
import com.umeng.socialize.common.m;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.media.UMediaObject.MediaType;
import com.umeng.socialize.view.a.t;
import com.umeng.socialize.view.wigets.KeyboardListenRelativeLayout;
import com.umeng.socom.Log;

public class ShareActivity
  extends t
{
  private static final String b = ShareActivity.class.getName();
  private static final int c = 140;
  private int A;
  private boolean B = false;
  private cb C;
  private UMediaObject D;
  private boolean E = false;
  protected ImageView a;
  private Button d;
  private Button e;
  private EditText f;
  private ImageButton g;
  private ImageButton h;
  private View k;
  private View l;
  private ab m;
  private TextView n;
  private KeyboardListenRelativeLayout o;
  private SocializeListeners.SnsPostListener p;
  private SocializeListeners.SnsPostListener q;
  private SocializeEntity r;
  private ProgressDialog s;
  private Context t;
  private boolean u;
  private UMSocialService v;
  private String w;
  private SHARE_MEDIA x;
  private a y;
  private Location z;
  
  private void a(SocializeConfig paramSocializeConfig)
  {
    if (paramSocializeConfig.isDefaultShareLocation())
    {
      k();
      return;
    }
    a(false);
  }
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.h.setVisibility(8);
      this.k.setVisibility(0);
      return;
    }
    if (this.z == null)
    {
      this.h.setImageResource(b.a(this, b.a.c, "umeng_socialize_location_off"));
      this.h.setVisibility(0);
      this.k.setVisibility(8);
      return;
    }
    this.h.setImageResource(b.a(this, b.a.c, "umeng_socialize_location_on"));
    this.h.setVisibility(0);
    this.k.setVisibility(8);
  }
  
  private void f()
  {
    Log.c(b, "initLocationProvider.....");
    this.y = new a();
    d locald = new d();
    locald.a(this);
    this.y.a(locald);
    this.y.a(this);
    this.h.setImageResource(b.a(this, b.a.c, "umeng_socialize_fetch_location_disabled"));
  }
  
  private void g()
  {
    this.f = ((EditText)findViewById(b.a(this, b.a.b, "umeng_socialize_share_edittext")));
    if (!TextUtils.isEmpty(this.r.getShareContent()))
    {
      this.f.setText(this.r.getShareContent());
      this.f.setSelection(this.f.getText().length());
    }
    this.h = ((ImageButton)findViewById(b.a(this, b.a.b, "umeng_socialize_location_ic")));
    this.k = findViewById(b.a(this, b.a.b, "umeng_socialize_location_progressbar"));
    this.h.setOnClickListener(new bt(this));
    if (this.B)
    {
      ab.b = false;
      this.m = new bu(this, this.t);
      this.m.setVisibility(8);
      this.o.addView(this.m, -1, -1);
    }
    this.C = new cb(this, this.x, this.w);
    this.g = ((ImageButton)findViewById(b.a(this, b.a.b, "umeng_socialize_share_at")));
    if (!l.c(this.x)) {
      this.g.setVisibility(8);
    }
    if ((this.B) && (this.m == null)) {
      this.g.setVisibility(8);
    }
    this.g.setOnClickListener(new bv(this));
    this.n = ((TextView)findViewById(b.a(this, b.a.b, "umeng_socialize_share_word_num")));
    this.n.setText(String.valueOf(140));
    this.u = h();
    this.d = ((Button)findViewById(b.a(this, b.a.b, "umeng_socialize_title_bar_leftBt")));
    this.d.setOnClickListener(new bw(this));
    this.e = ((Button)findViewById(b.a(this, b.a.b, "umeng_socialize_title_bar_rightBt")));
    ((TextView)findViewById(b.a(this, b.a.b, "umeng_socialize_title_bar_middleTv"))).setText("分享到" + l.a(this.x));
    this.a = ((ImageView)findViewById(b.a(this, b.a.b, "umeng_socialize_share_previewImg")));
    this.l = findViewById(b.a(this, b.a.b, "umeng_socialize_share_previewImg_remove"));
    this.l.setOnClickListener(new bx(this));
    Object localObject = (ProgressBar)findViewById(b.a(this, b.a.b, "umeng_socialize_share_previewImg_progressbar"));
    int i;
    if (this.D != null)
    {
      if (this.D.getMediaType() != UMediaObject.MediaType.MUSIC) {
        break label684;
      }
      i = b.a(this.t, b.a.c, "umeng_socialize_share_music");
      this.a.setImageResource(i);
      this.a.setVisibility(0);
      this.l.setVisibility(0);
    }
    for (;;)
    {
      this.s = new ProgressDialog(this.t);
      this.s.setProgressStyle(0);
      this.s.setMessage("发送中...");
      this.s.setCancelable(false);
      localObject = new bz(this);
      this.f.addTextChangedListener((TextWatcher)localObject);
      this.q = new ca(this);
      this.v.getConfig().registerWeakRefListener(this.q, 1);
      this.p = new bk(this);
      this.e.setOnClickListener(new bl(this));
      localObject = findViewById(b.a(this, b.a.b, "umeng_socialize_post_fetch_image"));
      ((View)localObject).setOnClickListener(getReceiveImageClick());
      ((View)localObject).setVisibility(8);
      return;
      label684:
      if (this.D.getMediaType() == UMediaObject.MediaType.VEDIO)
      {
        i = b.a(this.t, b.a.c, "umeng_socialize_share_video");
        this.a.setImageResource(i);
        this.a.setVisibility(0);
        this.l.setVisibility(0);
      }
      else if (this.D.getMediaType() == UMediaObject.MediaType.IMAGE)
      {
        i = b.a(this.t, b.a.c, "umeng_socialize_share_pic");
        this.D.toByte(new by(this, (ProgressBar)localObject, i));
      }
    }
  }
  
  private boolean h()
  {
    int i = 140 - m.c(this.f.getText().toString());
    Log.c(b, "onTextChanged " + i + "   " + m.c(this.f.getText().toString()));
    if (i >= 0)
    {
      this.n.setText(i);
      return false;
    }
    this.n.setText(i);
    return true;
  }
  
  private void i()
  {
    if (this.z != null)
    {
      new AlertDialog.Builder(this).setMessage("是否删除位置信息？").setCancelable(false).setPositiveButton("是", new bn(this)).setNegativeButton("否", new bo(this)).create().show();
      return;
    }
    k();
  }
  
  private void j()
  {
    String str1;
    if (this.a.getDrawable() != null)
    {
      String str2 = "";
      str1 = str2;
      if (this.D != null) {
        switch (d()[this.D.getMediaType().ordinal()])
        {
        default: 
          str1 = str2;
        }
      }
    }
    for (;;)
    {
      new AlertDialog.Builder(this).setMessage("你确定删除" + str1 + "吗？").setCancelable(false).setPositiveButton("是", new bp(this)).setNegativeButton("否", new bq(this)).create().show();
      return;
      str1 = "音乐";
      continue;
      str1 = "图片";
      continue;
      str1 = "视频";
    }
  }
  
  private void k()
  {
    new br(this, this.y).execute(new Void[0]);
  }
  
  protected void a()
  {
    this.a.setImageDrawable(null);
    this.a.setVisibility(8);
  }
  
  protected void a(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      this.a.setImageBitmap(paramBitmap);
      this.a.setVisibility(0);
    }
  }
  
  protected void b()
  {
    if (this.A == -3)
    {
      ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(getWindow().peekDecorView().getWindowToken(), 0);
      new Handler().postDelayed(new bm(this), 500L);
      return;
    }
    finish();
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4)
    {
      if (!this.E) {
        new Handler().postDelayed(new bs(this), 400L);
      }
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void inputAt(SpannableString paramSpannableString)
  {
    int i = this.f.getSelectionStart();
    this.f.getText().insert(i, paramSpannableString);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    this.B = m.d(this);
    if (!this.B) {
      setTheme(b.a(this, b.a.d, "Theme.UMDefault"));
    }
    super.onCreate(paramBundle);
    this.t = this;
    setContentView(b.a(this, b.a.a, "umeng_socialize_post_share"));
    paramBundle = getWindow().getAttributes();
    paramBundle.softInputMode = 16;
    if (this.B)
    {
      int[] arrayOfInt = m.c(this.t);
      paramBundle.width = arrayOfInt[0];
      paramBundle.height = arrayOfInt[1];
    }
    getWindow().setAttributes(paramBundle);
    this.o = ((KeyboardListenRelativeLayout)findViewById(b.a(this, b.a.b, "umeng_socialize_share_root")));
    this.o.setOnKeyboardStateChangedListener(new bj(this));
    this.w = getIntent().getStringExtra("dc");
    this.x = SHARE_MEDIA.convertToEmun(getIntent().getStringExtra("sns"));
    if (this.x == null)
    {
      Toast.makeText(this, "出错啦！", 1).show();
      b();
    }
    if (TextUtils.isEmpty(this.w))
    {
      Log.b(b, "No EntityPool key..............");
      b();
    }
    this.v = UMServiceFactory.getUMSocialService(this.w, RequestType.SOCIAL);
    this.r = this.v.getEntity();
    this.D = this.r.getMedia();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.y != null) {
      this.y.a();
    }
    this.q = null;
  }
  
  protected void onResume()
  {
    g();
    f();
    this.f.requestFocus();
    a(this.v.getConfig());
    super.onResume();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ShareActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */