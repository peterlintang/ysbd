package com.ireadercity.b2.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class BookRatingActivity
  extends Activity
{
  private String a;
  private RatingBar b;
  private EditText c;
  private Button d;
  private Button e;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903128);
    this.a = getIntent().getStringExtra("storeBookId");
    if (this.a == null)
    {
      finish();
      return;
    }
    this.b = ((RatingBar)findViewById(2131362224));
    this.c = ((EditText)findViewById(2131362225));
    this.e = ((Button)findViewById(2131362229));
    this.d = ((Button)findViewById(2131362228));
    this.e.setOnClickListener(new bg(this));
    this.d.setOnClickListener(new bh(this));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\BookRatingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */