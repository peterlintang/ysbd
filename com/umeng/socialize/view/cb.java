package com.umeng.socialize.view;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.m;
import com.umeng.socialize.view.wigets.SearchBox;
import com.umeng.socialize.view.wigets.SectionListView;
import com.umeng.socialize.view.wigets.SlideBar;
import java.util.List;

public class cb
  extends Dialog
{
  private ShareActivity a;
  private Button b;
  private Button c;
  private ProgressBar d;
  private View e;
  private List<UMFriend> f;
  private List<UMFriend> g;
  private SearchBox h;
  private SlideBar i;
  private com.umeng.socialize.view.controller.a j;
  private com.umeng.socialize.view.wigets.a k;
  
  public cb(ShareActivity paramShareActivity, SHARE_MEDIA paramSHARE_MEDIA, String paramString)
  {
    super(paramShareActivity, 16973840);
    this.a = paramShareActivity;
    this.j = new com.umeng.socialize.view.controller.a(this.a, paramSHARE_MEDIA, paramString);
    this.j.a(new cc(this));
  }
  
  private void a(UMFriend paramUMFriend)
  {
    paramUMFriend.setLast_at_time(System.currentTimeMillis());
    paramUMFriend.getName();
    Object localObject = paramUMFriend.getLink_name();
    localObject = new SpannableString("@" + (String)localObject + " ");
    this.a.inputAt((SpannableString)localObject);
    new Thread(new ci(this, paramUMFriend)).start();
    m.a(this);
  }
  
  private void a(SearchBox paramSearchBox)
  {
    if (paramSearchBox != null)
    {
      paramSearchBox.setText("");
      paramSearchBox.clearFocus();
      paramSearchBox.setInputType(0);
      InputMethodManager localInputMethodManager = (InputMethodManager)this.a.getSystemService("input_method");
      localInputMethodManager.hideSoftInputFromWindow(this.h.getWindowToken(), 0);
      paramSearchBox.setOnTouchListener(new ch(this, paramSearchBox, localInputMethodManager));
    }
  }
  
  private void b()
  {
    setContentView(b.a(this.a, b.a.a, "umeng_socialize_at_view"));
    Object localObject = getWindow().getAttributes();
    ((WindowManager.LayoutParams)localObject).height = -1;
    ((WindowManager.LayoutParams)localObject).width = -1;
    ((WindowManager.LayoutParams)localObject).softInputMode = 32;
    getWindow().setAttributes((WindowManager.LayoutParams)localObject);
    this.b = ((Button)findViewById(b.a(this.a, b.a.b, "umeng_socialize_title_bar_leftBt")));
    this.b.setOnClickListener(new cf(this));
    this.c = ((Button)findViewById(b.a(this.a, b.a.b, "umeng_socialize_title_bar_rightBt")));
    this.c.setText("刷新");
    this.c.setVisibility(0);
    this.c.setVisibility(0);
    this.c.setOnClickListener(new cg(this));
    this.d = ((ProgressBar)findViewById(b.a(this.a, b.a.b, "umeng_socialize_title_bar_rightBt_progress")));
    this.e = findViewById(b.a(this.a, b.a.b, "umeng_socialize_progress"));
    localObject = (TextView)findViewById(b.a(getContext(), b.a.b, "umeng_socialize_title_bar_middleTv"));
    ((TextView)localObject).setVisibility(0);
    ((TextView)localObject).setText("好友列表");
    findViewById(b.a(this.a, b.a.b, "umeng_socialize_title_bar_middle_tab")).setVisibility(8);
    this.i = ((SlideBar)findViewById(b.a(getContext(), b.a.b, "slideBar")));
  }
  
  private void c()
  {
    this.i.setVisibility(4);
    this.e.setVisibility(0);
  }
  
  protected void a()
  {
    if (this.a.isFinishing()) {
      return;
    }
    this.k = new com.umeng.socialize.view.wigets.a(this.a, this.f, this.g);
    SectionListView localSectionListView = (SectionListView)findViewById(b.a(getContext(), b.a.b, "listView"));
    localSectionListView.setVerticalScrollBarEnabled(false);
    localSectionListView.setAdapter(this.k);
    this.i.setVisibility(0);
    this.e.setVisibility(8);
    localSectionListView.setPinnedHeaderView(LayoutInflater.from(this.a).inflate(b.a(getContext(), b.a.a, "umeng_socialize_composer_header"), localSectionListView, false));
    localSectionListView.setOnItemClickListener(new cd(this));
    TextView localTextView = (TextView)View.inflate(this.a, b.a(getContext(), b.a.a, "umeng_socialize_at_overlay"), null);
    this.a.getWindowManager().addView(localTextView, new WindowManager.LayoutParams(-2, -2, 2, 24, -3));
    this.i.setOverlay(localTextView);
    this.i.setListView(localSectionListView);
    this.h = ((SearchBox)findViewById(b.a(getContext(), b.a.b, "search_text")));
    this.h.setListView(localSectionListView);
    a(this.h);
    this.h.setSearchResultListener(new ce(this));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().getAttributes().windowAnimations = b.a(getContext(), b.a.d, "umeng_socialize_dialog_animations");
    b();
  }
  
  public void show()
  {
    super.show();
    a(this.h);
    c();
    this.j.a();
    this.b.setClickable(true);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */