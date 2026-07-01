package com.ireadercity.b2.store;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ListView;
import com.ireadercity.b2.a.e;
import com.ireadercity.b2.e.a;

public class DownloadListActivity
  extends Activity
  implements com.ireadercity.b2.e.d
{
  public static DownloadListActivity a;
  private ImageButton b;
  private ImageButton c;
  private ListView d;
  private e e;
  
  public final void a()
  {
    this.e.notifyDataSetChanged();
  }
  
  public final void a(com.ireadercity.b2.bean.d paramd)
  {
    this.e.notifyDataSetChanged();
  }
  
  public final void b(com.ireadercity.b2.bean.d paramd)
  {
    this.e.notifyDataSetChanged();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903045);
    this.e = new e(getApplicationContext());
    this.b = ((ImageButton)findViewById(2131361817));
    this.b.setOnClickListener(new ah(this));
    this.c = ((ImageButton)findViewById(2131361864));
    this.c.setOnClickListener(new ai(this));
    this.d = ((ListView)findViewById(2131361865));
    this.d.setAdapter(this.e);
    a = this;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
    a.a(getApplicationContext());
    a.a(this);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\DownloadListActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */