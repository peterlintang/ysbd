package com.taobao.munion.ewall.ui.fragments;

import android.support.v4.app.Fragment;
import android.widget.ImageButton;
import android.widget.Toast;
import com.taobao.munion.net.l;
import com.taobao.munion.net.s;
import com.taobao.munion.net.t;
import com.taobao.munion.restool.a;

class GoodsDetailFragment$ToggleFavRequest
  extends s
{
  boolean isRequesting;
  
  public GoodsDetailFragment$ToggleFavRequest(GoodsDetailFragment paramGoodsDetailFragment, Fragment paramFragment)
  {
    super(paramFragment);
  }
  
  public void doHttpFailed(int paramInt, t paramt)
  {
    this.isRequesting = false;
    com.taobao.munion.utils.k.a(paramt.b());
    if (GoodsDetailFragment.access$600(this.this$0))
    {
      Toast.makeText(this.this$0.getActivity(), "删除收藏失败,请重试", 0).show();
      return;
    }
    if (paramt.a() == 728)
    {
      Toast.makeText(this.this$0.getActivity(), "收藏夹已满", 0).show();
      return;
    }
    Toast.makeText(this.this$0.getActivity(), "收藏失败，请重试", 0).show();
  }
  
  public void doHttpsuccsed(int paramInt, l paraml)
  {
    if (GoodsDetailFragment.access$600(this.this$0))
    {
      Toast.makeText(this.this$0.getActivity(), "取消收藏", 0).show();
      GoodsDetailFragment.access$700(this.this$0).setImageResource(a.e("munion_goods_detail_like_not_button_selector"));
      this.isRequesting = false;
      GoodsDetailFragment.access$602(this.this$0, false);
      return;
    }
    Toast.makeText(this.this$0.getActivity(), "收藏成功", 0).show();
    GoodsDetailFragment.access$700(this.this$0).setImageResource(a.e("munion_goods_detail_like_button_selector"));
    this.isRequesting = false;
    GoodsDetailFragment.access$602(this.this$0, true);
  }
  
  public void loadHttpContent(com.taobao.munion.net.k paramk)
  {
    if (!this.isRequesting)
    {
      this.isRequesting = true;
      super.loadHttpContent(paramk);
      return;
    }
    Toast.makeText(this.this$0.getActivity(), "正在请求中...", 0).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\GoodsDetailFragment$ToggleFavRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */