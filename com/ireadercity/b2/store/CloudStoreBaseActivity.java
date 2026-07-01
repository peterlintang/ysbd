package com.ireadercity.b2.store;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.widget.Toast;
import com.ireadercity.b2.bean.NetBookInfo;
import com.ireadercity.b2.bean.d;
import com.ireadercity.b2.h.v;
import com.ireadercity.b2.h.y;

public class CloudStoreBaseActivity
  extends Activity
{
  private static String a = "CloudStoreBaseActivity";
  private Toast b;
  
  private void b(NetBookInfo paramNetBookInfo)
  {
    if (this.b == null)
    {
      this.b = Toast.makeText(getApplicationContext(), "", 0);
      this.b.setGravity(17, 0, 0);
    }
    String str2 = paramNetBookInfo.i();
    String str1 = v.a(str2, "");
    Object localObject = a;
    new StringBuilder("bookURL").append(str2).toString();
    localObject = a;
    new StringBuilder("bookFileName").append(str1).toString();
    if (!com.ireadercity.b2.c.a.a(getApplicationContext()).f(com.ireadercity.b2.a.l + "/" + str1))
    {
      if (com.ireadercity.b2.e.a.a(paramNetBookInfo.d()) == null)
      {
        localObject = new d();
        str1 = str2;
        if (!str2.startsWith("http://")) {
          str1 = com.ireadercity.b2.a.B + str2;
        }
        ((d)localObject).f(str1);
        ((d)localObject).e(paramNetBookInfo.d());
        ((d)localObject).b(paramNetBookInfo.g());
        ((d)localObject).d(paramNetBookInfo.f());
        ((d)localObject).c(paramNetBookInfo.e());
        ((d)localObject).a(paramNetBookInfo);
        paramNetBookInfo.l();
        com.ireadercity.b2.e.a.a(getApplicationContext()).b((d)localObject);
        return;
      }
      this.b.setText("你已加入过本书到下载列表!");
      this.b.show();
      return;
    }
    this.b.setText("书架上已经有此书，不用重复下载!");
    this.b.show();
  }
  
  public final void a(NetBookInfo paramNetBookInfo)
  {
    if (this.b == null)
    {
      this.b = Toast.makeText(getApplicationContext(), "", 0);
      this.b.setGravity(17, 0, 0);
    }
    if (!y.a(this).booleanValue())
    {
      this.b.setText("无可用网络，不能下载！");
      this.b.show();
      return;
    }
    s locals = new s(this, paramNetBookInfo);
    if ((y.a(this).booleanValue()) && (!y.b(this).booleanValue()) && (paramNetBookInfo.a() > 1000000L))
    {
      new AlertDialog.Builder(this).setMessage("你当前的网络连接不是WiFi网络，下载本文件需要较多流量，可能会产生一定的运营商的流量费用，继续下载？").setPositiveButton("确定", locals).setNegativeButton("取消", locals).show();
      return;
    }
    b(paramNetBookInfo);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\CloudStoreBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */