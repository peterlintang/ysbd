package com.umeng.fb.ui;

import android.app.ListActivity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ImageButton;
import android.widget.ListView;
import com.umeng.fb.UMFeedbackService;
import com.umeng.fb.b;
import com.umeng.fb.b.a;
import com.umeng.fb.util.ActivityStarter;

public class FeedbackConversations
  extends ListActivity
{
  private static final int c = 0;
  private static final int d = 1;
  private static final int e = 2;
  private static final int f = 3;
  private static final int g = 4;
  FeedbackConversations.a a;
  ImageButton b;
  
  private void a()
  {
    d locald = (d)getListAdapter();
    locald.a(com.umeng.fb.util.c.a(this));
    locald.notifyDataSetChanged();
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    int i = ((AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo()).position;
    b localb = ((d)getListAdapter()).b(i);
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      return super.onContextItemSelected(paramMenuItem);
      com.umeng.fb.util.c.a(this, localb.c);
      ActivityStarter.openDetailActivity(this, localb);
      continue;
      com.umeng.fb.util.c.c(this, localb.c);
      a();
      continue;
      com.umeng.fb.util.c.c(this, localb.c);
      a();
      continue;
      ActivityStarter.openSendFeedbackActivity(this, localb);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(com.umeng.fb.b.d.c(this));
    this.b = ((ImageButton)findViewById(com.umeng.fb.b.c.k(this)));
    if (this.b != null) {
      this.b.setOnClickListener(new c(this));
    }
    if (!UMFeedbackService.getHasCheckedReply())
    {
      new com.umeng.fb.a.e(this).start();
      new com.umeng.fb.a.d(this).start();
    }
    registerForContextMenu(getListView());
    setListAdapter(new d(this, com.umeng.fb.util.c.a(this)));
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    int i = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).position;
    paramView = ((d)getListAdapter()).b(i).b;
    if (paramView == b.a.d)
    {
      paramContextMenu.add(0, 0, 0, getString(com.umeng.fb.b.e.l(this)));
      paramContextMenu.add(0, 1, 0, getString(com.umeng.fb.b.e.m(this)));
    }
    do
    {
      return;
      if (paramView == b.a.a)
      {
        paramContextMenu.add(0, 2, 0, getString(com.umeng.fb.b.e.n(this)));
        paramContextMenu.add(0, 4, 0, getString(com.umeng.fb.b.e.o(this)));
        return;
      }
    } while (paramView != b.a.b);
    paramContextMenu.add(0, 3, 0, getString(com.umeng.fb.b.e.p(this)));
    paramContextMenu.add(0, 4, 0, getString(com.umeng.fb.b.e.o(this)));
  }
  
  protected void onListItemClick(ListView arg1, View paramView, int paramInt, long paramLong)
  {
    super.onListItemClick(???, paramView, paramInt, paramLong);
    for (;;)
    {
      synchronized (((d)getListAdapter()).b(paramInt))
      {
        paramView = ((d)getListAdapter()).b(paramInt);
        b.a locala = paramView.b;
        com.umeng.fb.util.c.a(this, paramView.c);
        switch (FeedbackConversations.1.a[locala.ordinal()])
        {
        case 1: 
          ActivityStarter.openDetailActivity(this, paramView);
          return;
          ActivityStarter.openSendFeedbackActivity(this, paramView);
        }
      }
    }
  }
  
  protected void onRestart()
  {
    super.onRestart();
    a();
  }
  
  protected void onStart()
  {
    super.onStart();
    this.a = new FeedbackConversations.a(this, (d)getListAdapter());
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("postFeedbackFinished");
    localIntentFilter.addAction("RetrieveReplyBroadcast");
    registerReceiver(this.a, localIntentFilter);
  }
  
  protected void onStop()
  {
    super.onStop();
    unregisterReceiver(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\FeedbackConversations.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */