package com.ireadercity.b2.opds;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class OnlineBook_Shupeng
  extends Activity
  implements View.OnClickListener
{
  WebView a;
  RelativeLayout b;
  ImageButton c;
  
  public void onClick(View paramView)
  {
    if (this.a.canGoBack())
    {
      this.a.goBack();
      return;
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903121);
    this.a = ((WebView)findViewById(2131362185));
    this.a.getSettings().setJavaScriptEnabled(true);
    this.a.getSettings().setDefaultTextEncodingName("UTF-8");
    this.a.requestFocus();
    this.a.setScrollBarStyle(33554432);
    this.a.setWebViewClient(new i(this));
    this.b = ((RelativeLayout)findViewById(2131362186));
    this.c = ((ImageButton)findViewById(2131361905));
    this.c.setOnClickListener(this);
    this.a.loadUrl("http://sxyj.shupeng.com/");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\opds\OnlineBook_Shupeng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */