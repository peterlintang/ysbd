package com.umeng.socialize.view;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.view.wigets.SearchBox;
import com.umeng.socialize.view.wigets.SectionListView;
import com.umeng.socialize.view.wigets.SlideBar;
import java.util.List;

public class ab
  extends FrameLayout
{
  public static boolean b = true;
  private static final String c = ab.class.getName();
  public boolean a = false;
  private ShareActivity d;
  private Button e;
  private Button f;
  private ProgressBar g;
  private View h;
  private List<UMFriend> i;
  private List<UMFriend> j;
  private SearchBox k;
  private SlideBar l;
  private com.umeng.socialize.view.controller.a m;
  private com.umeng.socialize.view.wigets.a n;
  
  public ab(Context paramContext)
  {
    super(paramContext);
    e();
  }
  
  public ab(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    e();
  }
  
  public ab(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    e();
  }
  
  private void a(UMFriend paramUMFriend)
  {
    paramUMFriend.setLast_at_time(System.currentTimeMillis());
    paramUMFriend.getName();
    Object localObject = paramUMFriend.getLink_name();
    localObject = new SpannableString("@" + (String)localObject + " ");
    this.d.inputAt((SpannableString)localObject);
    new Thread(new ai(this, paramUMFriend)).start();
    a();
  }
  
  private void a(SearchBox paramSearchBox)
  {
    if (paramSearchBox != null)
    {
      paramSearchBox.setText("");
      paramSearchBox.clearFocus();
      paramSearchBox.setInputType(0);
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      localInputMethodManager.hideSoftInputFromWindow(this.k.getWindowToken(), 0);
      paramSearchBox.setOnTouchListener(new ah(this, paramSearchBox, localInputMethodManager));
    }
  }
  
  private void e()
  {
    Object localObject = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(b.a(getContext(), b.a.a, "umeng_socialize_at_view"), this, false);
    ((View)localObject).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    addView((View)localObject);
    this.e = ((Button)findViewById(b.a(getContext(), b.a.b, "umeng_socialize_title_bar_leftBt")));
    this.e.setOnClickListener(new ac(this));
    this.f = ((Button)findViewById(b.a(getContext(), b.a.b, "umeng_socialize_title_bar_rightBt")));
    this.f.setText("刷新");
    this.f.setVisibility(0);
    this.f.setVisibility(0);
    this.f.setOnClickListener(new ad(this));
    this.g = ((ProgressBar)findViewById(b.a(getContext(), b.a.b, "umeng_socialize_title_bar_rightBt_progress")));
    this.h = findViewById(b.a(getContext(), b.a.b, "umeng_socialize_progress"));
    localObject = (TextView)findViewById(b.a(getContext(), b.a.b, "umeng_socialize_title_bar_middleTv"));
    ((TextView)localObject).setVisibility(0);
    ((TextView)localObject).setText("好友列表");
    findViewById(b.a(getContext(), b.a.b, "umeng_socialize_title_bar_middle_tab")).setVisibility(8);
    this.l = ((SlideBar)findViewById(b.a(getContext(), b.a.b, "slideBar")));
  }
  
  private void f()
  {
    this.l.setVisibility(4);
    this.h.setVisibility(0);
  }
  
  public void a() {}
  
  public void a(ShareActivity paramShareActivity, SHARE_MEDIA paramSHARE_MEDIA, String paramString)
  {
    this.d = paramShareActivity;
    this.m = new com.umeng.socialize.view.controller.a(this.d, paramSHARE_MEDIA, paramString);
    this.m.a(new ae(this));
    this.a = true;
  }
  
  public void b()
  {
    a(this.k);
    f();
    this.m.a();
    this.e.setClickable(true);
  }
  
  protected void c()
  {
    if (this.d.isFinishing()) {
      return;
    }
    this.n = new com.umeng.socialize.view.wigets.a(this.d, this.i, this.j);
    SectionListView localSectionListView = (SectionListView)findViewById(b.a(getContext(), b.a.b, "listView"));
    localSectionListView.setVerticalScrollBarEnabled(false);
    localSectionListView.setAdapter(this.n);
    if (b) {
      this.l.setVisibility(0);
    }
    this.h.setVisibility(8);
    localSectionListView.setPinnedHeaderView(LayoutInflater.from(this.d).inflate(b.a(getContext(), b.a.a, "umeng_socialize_composer_header"), localSectionListView, false));
    localSectionListView.setOnItemClickListener(new af(this));
    TextView localTextView = (TextView)View.inflate(this.d, b.a(getContext(), b.a.a, "umeng_socialize_at_overlay"), null);
    this.d.getWindowManager().addView(localTextView, new WindowManager.LayoutParams(-2, -2, 2, 24, -3));
    this.l.setOverlay(localTextView);
    this.l.setListView(localSectionListView);
    this.k = ((SearchBox)findViewById(b.a(getContext(), b.a.b, "search_text")));
    this.k.setListView(localSectionListView);
    a(this.k);
    this.k.setSearchResultListener(new ag(this));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */