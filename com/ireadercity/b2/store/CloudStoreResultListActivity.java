package com.ireadercity.b2.store;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class CloudStoreResultListActivity
  extends CloudStoreBaseActivity
{
  private final String a = "BookListActivity";
  private String b;
  private String c;
  private String d;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getExtras();
    this.b = paramBundle.getString("categoryCode");
    this.d = paramBundle.getString("keywords");
    new StringBuilder().append(this.d).toString();
    this.d = Uri.encode(this.d);
    this.c = paramBundle.getString("categoryTitle");
    new StringBuilder("categoryCode=").append(this.b).append(" keywords=").append(this.d).toString();
    if (this.b != null)
    {
      setContentView(2130903146);
      paramBundle = (ViewGroup)findViewById(2131361894);
      CloudStoreActivity.a.e = paramBundle.findViewById(2131362339);
      CloudStoreActivity.a.k = paramBundle.findViewById(2131362338);
      CloudStoreActivity.a(this, paramBundle, 3, this.b);
      paramBundle = (TextView)findViewById(2131361822);
      if (this.b == null) {
        break label298;
      }
      paramBundle.setText(this.c);
    }
    for (;;)
    {
      ((ImageButton)findViewById(2131362030)).setOnClickListener(new ag(this));
      return;
      if (this.d == null) {
        break;
      }
      setContentView(2130903144);
      Object localObject = (ViewGroup)findViewById(2131361894);
      paramBundle = (ListView)((ViewGroup)localObject).findViewById(2131362324);
      CloudStoreActivity.a.c = ((ViewGroup)localObject).findViewById(2131362328);
      CloudStoreActivity.a.i = ((ViewGroup)localObject).findViewById(2131362327);
      localObject = new ak(this, paramBundle, this.d);
      paramBundle.setTag(localObject);
      ((ak)localObject).b();
      ((ak)localObject).a(this.d);
      break;
      label298:
      if (this.d != null) {
        paramBundle.setText(2131230897);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\CloudStoreResultListActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */