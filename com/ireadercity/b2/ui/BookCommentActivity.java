package com.ireadercity.b2.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;

public class BookCommentActivity
  extends Activity
{
  private ListView a;
  private ImageButton b;
  private ImageButton c;
  private ImageButton d;
  private TextView e;
  private com.ireadercity.b2.a.c f;
  private View g;
  private View h;
  private String i;
  private String j;
  private List<com.ireadercity.b2.bean.c> k;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == -1) {
      new av(this).execute(new String[] { this.i });
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.i = getIntent().getStringExtra("storeBookId");
    this.j = getIntent().getStringExtra("storeBookName");
    if (this.i == null)
    {
      finish();
      return;
    }
    setContentView(2130903042);
    this.g = findViewById(2131361826);
    this.h = findViewById(2131361824);
    this.a = ((ListView)findViewById(2131361823));
    this.f = new com.ireadercity.b2.a.c(this.k, getLayoutInflater(), getApplicationContext());
    this.a.setAdapter(this.f);
    this.b = ((ImageButton)findViewById(2131361819));
    this.b.setOnClickListener(new as(this));
    this.d = ((ImageButton)findViewById(2131361820));
    this.d.setOnClickListener(new at(this));
    this.c = ((ImageButton)findViewById(2131361817));
    this.c.setOnClickListener(new au(this));
    this.e = ((TextView)findViewById(2131361822));
    this.e.setText("  " + this.j);
    new av(this).execute(new String[] { this.i });
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\BookCommentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */