package com.taobao.munion.ewall.ui.fragments;

import android.support.v4.app.Fragment;
import com.taobao.munion.net.e;
import com.taobao.munion.net.s;
import com.taobao.munion.net.t;
import com.taobao.munion.utils.k;
import com.taobao.munion.webview.MunionWebview;
import java.util.Map;

class GoodsDetailFragment$ClickRequestTask
  extends s
{
  public GoodsDetailFragment$ClickRequestTask(GoodsDetailFragment paramGoodsDetailFragment, Fragment paramFragment)
  {
    super(paramFragment);
  }
  
  public void doHttpFailed(int paramInt, t paramt)
  {
    this.this$0.showErrorView();
  }
  
  public void doHttpsuccsed(int paramInt, com.taobao.munion.net.l paraml)
  {
    this.this$0.stopLoadingStatus();
    paraml = paraml.e().k();
    k.a("succeed header " + (String)paraml.get("location"));
    paraml = (String)paraml.get("location");
    if (!com.taobao.munion.utils.l.b(paraml)) {
      GoodsDetailFragment.access$800(this.this$0).loadUrl(paraml);
    }
  }
  
  protected void onHttpLoading(int paramInt)
  {
    if (!this.this$0.isAdded()) {
      return;
    }
    this.this$0.startLoadingStatus(new boolean[0]);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\GoodsDetailFragment$ClickRequestTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */