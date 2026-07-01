package com.taobao.munion.ewall.ui.fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.taobao.munion.utils.k;
import com.taobao.munion.utils.l;
import com.taobao.munion.webview.b;

class GoodsDetailFragment$2
  implements b
{
  GoodsDetailFragment$2(GoodsDetailFragment paramGoodsDetailFragment) {}
  
  public boolean doFilter(String paramString)
  {
    try
    {
      k.a(paramString);
      Uri localUri = Uri.parse(paramString);
      String str = localUri.getScheme();
      if ((!l.b(str)) && (!str.equals("http")) && (!str.equals("https")) && (this.this$0.isAdded()))
      {
        paramString = new Intent();
        paramString.setData(localUri);
        this.this$0.startActivity(paramString);
        return true;
      }
    }
    catch (ActivityNotFoundException paramString)
    {
      paramString.printStackTrace();
      GoodsDetailFragment.access$200(this.this$0, "请下载最新淘宝客户端");
      return true;
    }
    GoodsDetailFragment.access$300(this.this$0, paramString);
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\GoodsDetailFragment$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */