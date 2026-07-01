package com.ireadercity.b2.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.ireadercity.b2.a;
import com.ireadercity.b2.h.v;

public class AboutUsActivity
  extends Activity
{
  private String a = "";
  private String b = "support@ireadercity.com";
  private final String c = "AboutUsActivity";
  private WebView d;
  private WebView e;
  private TextView f;
  private TextView g;
  private View h;
  private ImageButton i;
  private Button j;
  private Button k;
  private ar l;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903052);
    this.a = "https://play.google.com/store/apps/details?id=com.ireadercity&hl=zh_TW";
    this.l = new ar(this);
    this.j = ((Button)findViewById(2131361906));
    this.k = ((Button)findViewById(2131361907));
    this.d = ((WebView)findViewById(2131361902));
    this.e = ((WebView)findViewById(2131361903));
    this.g = ((TextView)findViewById(2131361900));
    this.f = ((TextView)findViewById(2131361901));
    this.f.setText(Html.fromHtml("<u><i>" + this.b + "</i></u>"));
    this.f.setOnClickListener(this.l);
    this.h = findViewById(2131361904);
    this.i = ((ImageButton)findViewById(2131361905));
    this.i.setOnClickListener(this.l);
    this.e.getSettings().setJavaScriptEnabled(true);
    this.e.getSettings().setSupportZoom(true);
    this.e.getSettings().setBuiltInZoomControls(true);
    this.d.getSettings().setJavaScriptEnabled(true);
    this.d.getSettings().setSupportZoom(true);
    this.d.getSettings().setBuiltInZoomControls(true);
    this.h.setVisibility(0);
    this.j.setOnClickListener(this.l);
    this.k.setOnClickListener(this.l);
    this.g.setText(this.g.getText().toString() + v.a(getApplicationContext()));
    this.d.setWebChromeClient(new an(this));
    this.e.setWebChromeClient(new ao(this));
    this.d.setWebViewClient(new ap(this));
    this.d.loadUrl("http://" + a.y + "/about_and/index.html");
    this.e.setWebViewClient(new aq(this));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\AboutUsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */