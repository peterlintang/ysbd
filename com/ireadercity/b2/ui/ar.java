package com.ireadercity.b2.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import com.ireadercity.b2.h.v;

final class ar
  implements View.OnClickListener
{
  ar(AboutUsActivity paramAboutUsActivity) {}
  
  public final void onClick(View paramView)
  {
    Object localObject2 = AboutUsActivity.c(this.a).getText().toString();
    Object localObject1 = "";
    String[] arrayOfString;
    switch (paramView.getId())
    {
    case 2131361902: 
    case 2131361903: 
    case 2131361904: 
    default: 
      return;
    case 2131361905: 
      this.a.finish();
      return;
    case 2131361906: 
      if (AboutUsActivity.d(this.a).getVisibility() == 0)
      {
        AboutUsActivity.d(this.a).setVisibility(8);
        return;
      }
      AboutUsActivity.a(this.a).setVisibility(0);
      AboutUsActivity.d(this.a).setVisibility(0);
      AboutUsActivity.d(this.a).loadUrl(AboutUsActivity.e(this.a));
      new StringBuilder("RATINGURL=").append(AboutUsActivity.e(this.a)).toString();
      return;
    case 2131361907: 
      arrayOfString = new String[0];
      localObject1 = "我正在用书香云集看书,发现这软件不错,推荐给你";
      paramView = "书香云集是个不错的读书软件,我正在使用,你可以去这里下载" + AboutUsActivity.e(this.a);
    }
    for (;;)
    {
      try
      {
        localObject2 = new Intent("android.intent.action.SEND");
        ((Intent)localObject2).setType("plain/text");
        ((Intent)localObject2).putExtra("android.intent.extra.EMAIL", arrayOfString);
        ((Intent)localObject2).putExtra("android.intent.extra.SUBJECT", (String)localObject1);
        ((Intent)localObject2).putExtra("android.intent.extra.TEXT", paramView);
        this.a.startActivity((Intent)localObject2);
        return;
      }
      catch (ActivityNotFoundException paramView)
      {
        Toast.makeText(this.a, "没有默认的邮件客户端!请您检查手机设置,谢谢!", 1).show();
        return;
      }
      arrayOfString = new String[1];
      arrayOfString[0] = localObject2;
      localObject2 = "我正在用书香云集(android _v " + v.a(this.a.getApplicationContext()) + "版),发现问题";
      paramView = (View)localObject1;
      localObject1 = localObject2;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */