package com.umeng.newxp.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.taobao.munion.common.fragment.BaseFragment;
import com.umeng.newxp.a.c;
import com.umeng.newxp.a.d;
import com.umeng.newxp.view.common.actionbar.b;
import com.umeng.newxp.view.widget.indexlist.AlphabetIndexAdapter;
import com.umeng.newxp.view.widget.indexlist.City;
import com.umeng.newxp.view.widget.indexlist.SectionListView;
import com.umeng.newxp.view.widget.indexlist.SlideBar;
import java.util.List;

public class UMCityView
  extends FrameLayout
{
  public static boolean d = true;
  private static final String f = UMCityView.class.getName();
  public boolean a;
  public boolean b = false;
  public BaseFragment c;
  TextView e;
  private Activity g;
  private List<City> h;
  private SlideBar i;
  private AlphabetIndexAdapter j;
  
  public UMCityView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public UMCityView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public UMCityView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a()
  {
    this.g = ((Activity)getContext());
    View localView = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(d.w(this.g), this, false);
    localView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    addView(localView);
    this.i = ((SlideBar)findViewById(c.au(this.g)));
  }
  
  public void init()
  {
    this.i.setVisibility(4);
    this.h = b.d();
    this.j = new AlphabetIndexAdapter(this.g, this.h, null);
    SectionListView localSectionListView = (SectionListView)findViewById(c.at(this.g));
    localSectionListView.setVerticalScrollBarEnabled(false);
    localSectionListView.setAdapter(this.j);
    if (d) {
      this.i.setVisibility(0);
    }
    localSectionListView.a(LayoutInflater.from(this.g).inflate(d.v(this.g), localSectionListView, false));
    localSectionListView.setOnItemClickListener(new UMCityView.1(this));
    this.e = ((TextView)View.inflate(this.g, d.x(this.g), null));
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams(-2, -2, 2, 24, -3);
    if (this.e.getParent() == null) {
      this.g.getWindowManager().addView(this.e, localLayoutParams);
    }
    this.i.a(this.e);
    this.i.a(localSectionListView);
    this.a = true;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    init();
  }
  
  public void setFragment(BaseFragment paramBaseFragment)
  {
    this.c = paramBaseFragment;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\UMCityView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */