package com.ireadercity.b2.ui;

import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import java.util.Date;

final class gk
  implements View.OnClickListener
{
  gk(SyncCloudInfoActivity paramSyncCloudInfoActivity) {}
  
  public final void onClick(View paramView)
  {
    long l = PreferenceManager.getDefaultSharedPreferences(this.a.getApplicationContext()).getLong("lastSyncProgressTime", 0L);
    if (new Date().getTime() - l < 20000L)
    {
      Toast.makeText(this.a.getApplicationContext(), "我了减少服务压力，20秒内只能同步一次！", 0).show();
      return;
    }
    paramView = new AlertDialog.Builder(this.a);
    paramView.setTitle(2131230798);
    paramView.setMessage("你确定要同步云端的阅读记录吗？-同步云端记录可以同步你在各种设备上的阅读记录（包括iPhone/iPad/iPod, Android设备及桌面Air版）");
    paramView.setPositiveButton("确认", new gl(this));
    paramView.setNegativeButton("取消", new gm(this));
    paramView.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\gk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */