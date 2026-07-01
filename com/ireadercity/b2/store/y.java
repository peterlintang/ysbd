package com.ireadercity.b2.store;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.ireadercity.b2.bean.NetBookInfo;

final class y
  implements View.OnClickListener
{
  y(CloudStoreBookDetailActivity paramCloudStoreBookDetailActivity) {}
  
  public final void onClick(View paramView)
  {
    try
    {
      paramView = new Intent("android.intent.action.SEND");
      paramView.setType("text/plain");
      paramView.putExtra("android.intent.extra.SUBJECT", "#书香云集书分享# 书名：" + CloudStoreBookDetailActivity.b(this.a).e() + " 作者：" + CloudStoreBookDetailActivity.b(this.a).g());
      paramView.putExtra("android.intent.extra.TEXT", "#书香云集书分享# @书香云集 简介：" + CloudStoreBookDetailActivity.b(this.a).f());
      this.a.startActivity(Intent.createChooser(paramView, this.a.getText(2131230934)));
      return;
    }
    catch (Exception paramView)
    {
      paramView.printStackTrace();
      CloudStoreBookDetailActivity.c(this.a).setText("分享失败");
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */