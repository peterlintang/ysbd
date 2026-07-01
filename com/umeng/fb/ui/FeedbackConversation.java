package com.umeng.fb.ui;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.umeng.fb.a.a;
import com.umeng.fb.a.b;
import com.umeng.fb.b.a;
import com.umeng.fb.b.d;
import com.umeng.fb.b.e;
import com.umeng.fb.util.ActivityStarter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FeedbackConversation
  extends ListActivity
{
  static Context a = null;
  static final String c = FeedbackConversation.class.getSimpleName();
  static boolean d = true;
  public static ExecutorService executorService = Executors.newFixedThreadPool(3);
  boolean b = false;
  private com.umeng.fb.b e;
  private b f;
  private TextView g;
  private EditText h;
  private Button i;
  private FeedbackConversation.a j;
  
  private void a()
  {
    this.g.setText(getString(e.r(this)));
    this.i.setText(getString(e.s(this)));
  }
  
  public static void setUserContext(Context paramContext)
  {
    a = paramContext;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(d.d(this));
    paramBundle = getIntent().getStringExtra("feedback_id");
    if (paramBundle != null) {
      this.e = com.umeng.fb.util.c.b(this, paramBundle);
    }
    try
    {
      this.f = new b(this, this.e);
      setListAdapter(this.f);
      setSelection(this.f.getCount() - 1);
      this.g = ((TextView)findViewById(com.umeng.fb.b.c.m(this)));
      this.h = ((EditText)findViewById(com.umeng.fb.b.c.n(this)));
      this.i = ((Button)findViewById(com.umeng.fb.b.c.o(this)));
      this.i.setOnClickListener(new a(this));
      this.h.requestFocus();
      registerForContextMenu(getListView());
      a();
      if (this.e.b != b.a.d)
      {
        this.h.setEnabled(false);
        this.i.setEnabled(false);
      }
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        paramBundle = c;
        finish();
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (a != null) {
        ActivityStarter.openFeedbackListActivity(a);
      }
      for (;;)
      {
        finish();
        return true;
        ActivityStarter.openFeedbackListActivity(this);
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    super.onListItemClick(paramListView, paramView, paramInt, paramLong);
    paramListView = this.e.a(paramInt);
    if (paramListView.g == a.a.b)
    {
      if (paramListView.f == a.b.a)
      {
        ActivityStarter.openSendFeedbackActivity(this, this.e);
        finish();
      }
    }
    else {
      return;
    }
    paramListView = paramListView.a();
    this.h.setText(paramListView);
    this.h.setEnabled(true);
    this.i.setEnabled(true);
    com.umeng.fb.util.c.a(this, this.e, paramInt);
    this.f.a(this.e);
    this.f.notifyDataSetChanged();
  }
  
  protected void onStart()
  {
    super.onStart();
    this.j = new FeedbackConversation.a(this, null);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("postFeedbackFinished");
    localIntentFilter.addAction("RetrieveReplyBroadcast");
    registerReceiver(this.j, localIntentFilter);
  }
  
  protected void onStop()
  {
    super.onStop();
    unregisterReceiver(this.j);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\FeedbackConversation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */