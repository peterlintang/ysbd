package com.ireadercity.b2.store;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.ireadercity.b2.h.y;
import com.ireadercity.b2.ui.widget.FriendlyScrollLayout;
import com.ireadercity.b2.ui.widget.SegmentedRadioGroup;
import com.ireadercity.b2.ui.widget.ToolSlider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloudStoreActivity
  extends CloudStoreBaseActivity
{
  public static ao a;
  private static ListView k = null;
  private com.ireadercity.b2.ui.widget.e A;
  private View.OnClickListener B = null;
  private boolean C = false;
  private int D = -1;
  private Handler E = new q(this);
  private Handler F = new d(this);
  private ViewGroup b;
  private ViewGroup c;
  private ViewGroup d;
  private ViewGroup e;
  private ViewGroup f;
  private Button g;
  private Button h;
  private Button i;
  private Button j;
  private ImageButton l;
  private ImageButton m;
  private ImageButton n;
  private ImageButton o;
  private EditText p;
  private ImageButton q;
  private RelativeLayout r;
  private LinearLayout s;
  private RelativeLayout t;
  private View u;
  private FrameLayout v;
  private FriendlyScrollLayout w;
  private ToolSlider x;
  private LayoutInflater y;
  private Toast z;
  
  static
  {
    if (a == null) {
      a = new ao();
    }
  }
  
  private AlertDialog.Builder a(int paramInt, View paramView)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    paramView = new AlertDialog.Builder(this).setTitle(getResources().getText(2131230901)).setView(paramView).setCancelable(false).setPositiveButton(getResources().getText(2131230902), new i(this, paramView));
    Resources localResources = getResources();
    if (paramInt == 1) {}
    for (int i1 = 2131230904;; i1 = 2131230905) {
      return paramView.setNeutralButton(localResources.getText(i1), new h(this, paramInt, localSharedPreferences)).setNegativeButton(getResources().getText(2131230903), new g(this));
    }
  }
  
  private Button a(String paramString, TableRow paramTableRow)
  {
    TableRow.LayoutParams localLayoutParams = new TableRow.LayoutParams(-2, -2);
    localLayoutParams.leftMargin = 30;
    localLayoutParams.width = ((com.ireadercity.b2.a.D - 90) / 2);
    Button localButton = new Button(this);
    localButton.setTextColor(-16777216);
    localButton.setBackgroundResource(2130837867);
    localButton.setGravity(17);
    localButton.setTextSize(17.0F);
    localButton.setText(paramString);
    localButton.setPadding(5, 10, 5, 10);
    paramTableRow.addView(localButton, localLayoutParams);
    localButton.setOnClickListener(new b(this, paramString));
    return localButton;
  }
  
  public static void a(Activity paramActivity, ViewGroup paramViewGroup, int paramInt, String paramString)
  {
    new StringBuilder("decorateVGFor3ListViews on vg").append(paramViewGroup).append("taborder").append(paramInt).toString();
    ListView localListView1 = (ListView)paramViewGroup.findViewById(2131362324);
    ListView localListView2 = (ListView)paramViewGroup.findViewById(2131362334);
    ListView localListView3 = (ListView)paramViewGroup.findViewById(2131362335);
    Object localObject1 = (RadioButton)paramViewGroup.findViewById(2131362331);
    Object localObject2 = (RadioButton)paramViewGroup.findViewById(2131362332);
    RadioButton localRadioButton = (RadioButton)paramViewGroup.findViewById(2131362333);
    switch (paramInt)
    {
    }
    for (;;)
    {
      localListView2.setVisibility(4);
      localListView3.setVisibility(4);
      localObject1 = new ak(paramActivity, localListView1, paramInt * 10 + 1);
      if (paramString != null) {
        ((ak)localObject1).c(paramString);
      }
      localListView1.setTag(localObject1);
      ((ak)localObject1).b();
      ((ak)localObject1).c();
      localObject2 = new ak(paramActivity, localListView2, paramInt * 10 + 2);
      if (paramString != null) {
        ((ak)localObject2).c(paramString);
      }
      localListView2.setTag(localObject2);
      ((ak)localObject2).b();
      paramActivity = new ak(paramActivity, localListView3, paramInt * 10 + 3);
      if (paramString != null) {
        paramActivity.c(paramString);
      }
      localListView3.setTag(paramActivity);
      paramActivity.b();
      paramViewGroup = (SegmentedRadioGroup)paramViewGroup.findViewById(2131362330);
      paramViewGroup.setOnCheckedChangeListener(new e(paramViewGroup, localListView1, (ak)localObject1, localListView2, localListView3, (ak)localObject2, paramActivity));
      return;
      View localView = paramViewGroup.findViewById(2131362336);
      localListView1.setEmptyView(localView);
      localListView2.setEmptyView(localView);
      localListView3.setEmptyView(localView);
      ((RadioButton)localObject1).setText("最热排行");
      ((RadioButton)localObject2).setText("最新分享");
      localRadioButton.setText("评分排行");
      localObject1 = paramViewGroup.findViewById(2131362338);
      localListView1.setEmptyView((View)localObject1);
      localListView2.setEmptyView((View)localObject1);
      localListView3.setEmptyView((View)localObject1);
      continue;
      ((RadioButton)localObject1).setText("我的上传");
      ((RadioButton)localObject2).setText("我的下载");
      localRadioButton.setText("我的收藏");
      localObject1 = paramViewGroup.findViewById(2131362336);
      localListView1.setEmptyView((View)localObject1);
      localListView2.setEmptyView((View)localObject1);
      localListView3.setEmptyView((View)localObject1);
    }
  }
  
  public static void a(ViewGroup paramViewGroup)
  {
    new StringBuilder("decorateVGFor3ListViews on vg").append(paramViewGroup).toString();
    Object localObject2 = (ListView)paramViewGroup.findViewById(2131362324);
    Object localObject1 = (ListView)paramViewGroup.findViewById(2131362334);
    paramViewGroup = (ListView)paramViewGroup.findViewById(2131362335);
    localObject2 = (com.ireadercity.b2.a.h)((ListView)localObject2).getAdapter();
    if (localObject2 != null)
    {
      ((com.ireadercity.b2.a.h)localObject2).clear();
      ((com.ireadercity.b2.a.h)localObject2).notifyDataSetChanged();
    }
    localObject1 = (com.ireadercity.b2.a.h)((ListView)localObject1).getAdapter();
    if (localObject1 != null)
    {
      ((com.ireadercity.b2.a.h)localObject1).clear();
      ((com.ireadercity.b2.a.h)localObject1).notifyDataSetChanged();
    }
    paramViewGroup = (com.ireadercity.b2.a.h)paramViewGroup.getAdapter();
    if (paramViewGroup != null)
    {
      paramViewGroup.clear();
      paramViewGroup.notifyDataSetChanged();
    }
  }
  
  public static void a(ListView paramListView)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramListView == null) {
      if (paramListView == null) {}
    }
    for (;;)
    {
      try
      {
        paramListView.reclaimViews(localArrayList);
        return;
      }
      catch (Exception paramListView)
      {
        paramListView.printStackTrace();
        return;
      }
      try
      {
        Object localObject1 = paramListView.getAdapter();
        if (localObject1 == null)
        {
          if (paramListView == null) {
            continue;
          }
          try
          {
            paramListView.reclaimViews(localArrayList);
            return;
          }
          catch (Exception paramListView)
          {
            paramListView.printStackTrace();
            return;
          }
        }
        int i1 = 0;
        while (i1 < paramListView.getAdapter().getCount())
        {
          localArrayList.add(paramListView.getChildAt(i1));
          i1 += 1;
        }
        localObject1 = (com.ireadercity.b2.a.h)paramListView.getAdapter();
        if (localObject1 != null) {
          ((com.ireadercity.b2.a.h)localObject1).a();
        }
        if (paramListView != null) {
          try
          {
            paramListView.reclaimViews(localArrayList);
            return;
          }
          catch (Exception paramListView)
          {
            paramListView.printStackTrace();
            return;
          }
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        if (paramListView != null) {
          try
          {
            paramListView.reclaimViews(localArrayList);
            return;
          }
          catch (Exception paramListView)
          {
            paramListView.printStackTrace();
            return;
          }
        }
      }
      finally
      {
        if (paramListView == null) {}
      }
    }
    try
    {
      paramListView.reclaimViews(localArrayList);
      throw ((Throwable)localObject2);
    }
    catch (Exception paramListView)
    {
      for (;;)
      {
        paramListView.printStackTrace();
      }
    }
  }
  
  private void a(TextView paramTextView)
  {
    paramTextView.setTextColor(-16711936);
    paramTextView.getPaint().setFlags(8);
    paramTextView.getPaint().setAntiAlias(true);
    paramTextView.setOnClickListener(new f(this));
    paramTextView.setVisibility(8);
  }
  
  private static void b(ViewGroup paramViewGroup)
  {
    switch (((SegmentedRadioGroup)paramViewGroup.findViewById(2131362330)).getCheckedRadioButtonId())
    {
    default: 
      paramViewGroup = null;
    }
    for (;;)
    {
      if (paramViewGroup != null)
      {
        paramViewGroup.a();
        paramViewGroup.c();
      }
      return;
      paramViewGroup = (ak)paramViewGroup.findViewById(2131362324).getTag();
      continue;
      paramViewGroup = (ak)paramViewGroup.findViewById(2131362334).getTag();
      continue;
      paramViewGroup = (ak)paramViewGroup.findViewById(2131362335).getTag();
    }
  }
  
  private void c(ViewGroup paramViewGroup)
  {
    new StringBuilder("decorateVGFor1ListViews on vg").append(paramViewGroup).toString();
    ListView localListView = (ListView)paramViewGroup.findViewById(2131362324);
    localListView.setEmptyView(paramViewGroup.findViewById(2131362325));
    paramViewGroup = new ak(this, localListView, 21);
    localListView.setTag(paramViewGroup);
    paramViewGroup.b();
  }
  
  public final void a(String paramString)
  {
    if (!y.d(paramString))
    {
      Intent localIntent = new Intent(this, CloudStoreResultListActivity.class);
      Bundle localBundle = new Bundle();
      localBundle.putString("keywords", paramString);
      localIntent.putExtras(localBundle);
      startActivityForResult(localIntent, 0);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.C) {
      return;
    }
    Object localObject = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    String str = ((SharedPreferences)localObject).getString("userName", null);
    if (str == null)
    {
      localObject = getLayoutInflater().inflate(2130903051, null);
      a((TextView)((View)localObject).findViewById(2131361898));
      a(1, (View)localObject).show();
      this.C = true;
      ((EditText)((View)localObject).findViewById(2131361896)).requestFocus();
      return;
    }
    if (paramBoolean)
    {
      View localView = getLayoutInflater().inflate(2130903051, null);
      a((TextView)localView.findViewById(2131361898));
      a(2, localView).show();
      this.C = true;
      EditText localEditText = (EditText)localView.findViewById(2131361896);
      localEditText.setText(str);
      localEditText.requestFocus();
      ((EditText)localView.findViewById(2131361899)).setText(((SharedPreferences)localObject).getString("password", ""));
      return;
    }
    try
    {
      localObject = (SegmentedRadioGroup)this.f.findViewById(2131362330);
      ((SegmentedRadioGroup)localObject).check(((SegmentedRadioGroup)localObject).getChildAt(0).getId());
      a(this, this.f, 9, null);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public final boolean a()
  {
    this.s.setVisibility(8);
    this.r.setVisibility(0);
    this.t.setVisibility(8);
    this.w.setVisibility(8);
    this.p.setFocusable(true);
    this.p.requestFocus();
    return true;
  }
  
  public final void b()
  {
    int i1 = 0;
    if (this.r.getVisibility() == 0)
    {
      this.s.setVisibility(0);
      this.r.setVisibility(8);
      this.t.setVisibility(0);
      this.w.setVisibility(0);
      i1 = 1;
    }
    if (i1 == 0) {
      finish();
    }
  }
  
  public final void b(String paramString)
  {
    TableLayout localTableLayout = (TableLayout)this.e.findViewById(2131362344);
    paramString = paramString.split(":::");
    int i1 = 0;
    while (i1 < paramString.length)
    {
      TableLayout.LayoutParams localLayoutParams = new TableLayout.LayoutParams(-1, -2);
      localLayoutParams.bottomMargin = 5;
      localLayoutParams.topMargin = 5;
      TableRow localTableRow = new TableRow(this);
      localTableLayout.addView(localTableRow, localLayoutParams);
      a(paramString[i1], localTableRow);
      i1 += 1;
      if (paramString.length > i1) {
        a(paramString[i1], localTableRow);
      }
      i1 += 1;
    }
  }
  
  public final Boolean c(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return Boolean.valueOf(false);
    }
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.split("\n");
    int i2 = paramString.length;
    int i1 = 0;
    while (i1 < i2)
    {
      String[] arrayOfString = paramString[i1];
      if ((arrayOfString != null) && (arrayOfString.length() != 0))
      {
        HashMap localHashMap = new HashMap();
        arrayOfString = arrayOfString.split(":::");
        try
        {
          localHashMap.put("code", arrayOfString[0]);
          localHashMap.put("title", arrayOfString[1]);
          localHashMap.put("icon", arrayOfString[2]);
          localArrayList.add(localHashMap);
          i1 += 1;
        }
        catch (ArrayIndexOutOfBoundsException paramString)
        {
          paramString.printStackTrace();
          return Boolean.valueOf(false);
        }
      }
    }
    paramString = (GridView)this.d.findViewById(2131362340);
    paramString.setAdapter(new com.ireadercity.b2.a.a(this, localArrayList));
    paramString.setOnItemClickListener(new c(this, paramString));
    return Boolean.valueOf(true);
  }
  
  protected void finalize()
  {
    super.finalize();
    com.ireadercity.b2.a.d();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903059);
    this.A = new o(this);
    this.B = new p(this);
    this.z = Toast.makeText(this, "", 0);
    this.z.setGravity(17, 0, 0);
    this.y = LayoutInflater.from(this);
    this.b = ((ViewGroup)this.y.inflate(2130903145, null));
    this.c = ((ViewGroup)this.y.inflate(2130903143, null));
    this.d = ((ViewGroup)this.y.inflate(2130903147, null));
    this.e = ((ViewGroup)this.y.inflate(2130903148, null));
    this.f = ((ViewGroup)this.y.inflate(2130903145, null));
    a.a = this.b.findViewById(2131362337);
    a.g = this.b.findViewById(2131362336);
    a.b = this.c.findViewById(2131362326);
    a.h = this.c.findViewById(2131362325);
    a.d = this.d.findViewById(2131362342);
    a.j = this.d.findViewById(2131362341);
    a.f = this.f.findViewById(2131362337);
    a.l = this.f.findViewById(2131362336);
    new StringBuilder("start---------------").append(System.currentTimeMillis()).toString();
    a(this, this.b, 1, null);
    c(this.c);
    paramBundle = this.d;
    paramBundle = com.ireadercity.b2.a.z + "/iOSservices/GetAllCategories.aspx";
    new com.ireadercity.b2.e.g(this.F).a(paramBundle);
    this.z.setText(getResources().getString(2131230908));
    paramBundle = this.e;
    paramBundle = com.ireadercity.b2.a.z + "/iOSservices/hotkeys.aspx";
    new com.ireadercity.b2.e.g(this.E).a(paramBundle);
    new StringBuilder("end---------------").append(System.currentTimeMillis()).toString();
    this.w = ((FriendlyScrollLayout)findViewById(2131361937));
    this.w.a(this.A);
    this.w.addView(this.d);
    this.w.addView(this.b);
    this.w.addView(this.c);
    this.w.addView(this.f);
    paramBundle = this.w;
    FriendlyScrollLayout.b();
    this.u = findViewById(2131361929);
    this.v = ((FrameLayout)findViewById(2131361936));
    paramBundle = new FrameLayout.LayoutParams(-1, -1);
    this.v.addView(this.e, paramBundle);
    this.w.bringToFront();
    this.x = ((ToolSlider)findViewById(2131361935));
    this.x.a(com.ireadercity.b2.a.D, com.ireadercity.b2.a.D / 4);
    paramBundle = new RelativeLayout.LayoutParams(com.ireadercity.b2.a.D / 4, 12);
    paramBundle.addRule(12);
    this.x.setLayoutParams(paramBundle);
    this.x.a(1, this.u);
    this.h = ((Button)findViewById(2131361932));
    this.g = ((Button)findViewById(2131361931));
    this.j = ((Button)findViewById(2131361934));
    this.i = ((Button)findViewById(2131361933));
    this.h.setOnClickListener(this.B);
    this.g.setOnClickListener(this.B);
    this.j.setOnClickListener(this.B);
    this.i.setOnClickListener(this.B);
    this.l = ((ImageButton)findViewById(2131361817));
    this.o = ((ImageButton)findViewById(2131361926));
    this.o.setOnClickListener(new a(this));
    this.n = ((ImageButton)findViewById(2131361927));
    this.m = ((ImageButton)findViewById(2131361925));
    this.r = ((RelativeLayout)findViewById(2131361832));
    this.s = ((LinearLayout)findViewById(2131361818));
    this.t = ((RelativeLayout)findViewById(2131361928));
    this.l.setOnClickListener(new j(this));
    this.n.setOnClickListener(new k(this));
    this.m.setOnClickListener(new l(this));
    this.p = ((EditText)findViewById(2131361833));
    this.p.setOnEditorActionListener(new m(this));
    this.q = ((ImageButton)findViewById(2131361924));
    this.q.setOnClickListener(new n(this));
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    paramMenu.add(0, 0, 0, "下载列表");
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    try
    {
      ListView localListView1 = (ListView)this.b.findViewById(2131362324);
      ListView localListView2 = (ListView)this.b.findViewById(2131362334);
      ListView localListView3 = (ListView)this.b.findViewById(2131362335);
      a(localListView1);
      a(localListView2);
      a(localListView3);
      localListView1 = (ListView)this.f.findViewById(2131362324);
      localListView2 = (ListView)this.f.findViewById(2131362334);
      localListView3 = (ListView)this.f.findViewById(2131362335);
      a(localListView1);
      a(localListView2);
      a(localListView3);
      localListView1 = (ListView)this.d.findViewById(2131362324);
      localListView2 = (ListView)this.d.findViewById(2131362334);
      localListView3 = (ListView)this.d.findViewById(2131362335);
      a(localListView1);
      a(localListView2);
      a(localListView3);
      localListView1 = (ListView)this.e.findViewById(2131362324);
      localListView2 = (ListView)this.c.findViewById(2131362324);
      a(localListView1);
      a(localListView2);
      try
      {
        finalize();
        return;
      }
      catch (Throwable localThrowable1)
      {
        localThrowable1.printStackTrace();
        return;
      }
      return;
    }
    catch (Throwable localThrowable2)
    {
      localThrowable2.printStackTrace();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84)
    {
      a();
      return true;
    }
    if (paramInt == 4)
    {
      b();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 0) {
      startActivityForResult(new Intent(this, DownloadListActivity.class), 0);
    }
    return super.onMenuItemSelected(paramInt, paramMenuItem);
  }
  
  protected void onResume()
  {
    super.onResume();
    if (com.ireadercity.b2.a.k == null) {
      com.ireadercity.b2.a.b(this);
    }
  }
  
  protected void onStop()
  {
    super.onStop();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\CloudStoreActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */