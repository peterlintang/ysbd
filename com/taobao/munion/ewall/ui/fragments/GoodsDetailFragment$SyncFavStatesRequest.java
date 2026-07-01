package com.taobao.munion.ewall.ui.fragments;

import android.support.v4.app.Fragment;
import android.widget.ImageButton;
import com.taobao.munion.model.d;
import com.taobao.munion.net.l;
import com.taobao.munion.net.s;
import com.taobao.munion.net.t;
import com.taobao.munion.restool.a;
import com.taobao.munion.utils.k;
import org.json.JSONArray;

class GoodsDetailFragment$SyncFavStatesRequest
  extends s
{
  public GoodsDetailFragment$SyncFavStatesRequest(GoodsDetailFragment paramGoodsDetailFragment, Fragment paramFragment)
  {
    super(paramFragment);
  }
  
  public void doHttpFailed(int paramInt, t paramt)
  {
    k.a(paramt.b());
  }
  
  public void doHttpsuccsed(int paramInt, l paraml)
  {
    try
    {
      paraml = (JSONArray)paraml.b("result");
      if ((paraml != null) && (paraml.length() > 0))
      {
        paramInt = 0;
        if (paramInt >= paraml.length()) {}
      }
    }
    catch (Exception paraml)
    {
      for (;;)
      {
        try
        {
          GoodsDetailFragment.access$002(this.this$0, d.a(paraml.getJSONObject(paramInt)));
          if (GoodsDetailFragment.access$000(this.this$0) == null) {
            break;
          }
          GoodsDetailFragment.access$602(this.this$0, true);
          GoodsDetailFragment.access$700(this.this$0).setImageResource(a.e("munion_goods_detail_like_button_selector"));
          return;
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
          paramInt += 1;
        }
        paraml = paraml;
        paraml.printStackTrace();
        paraml = null;
      }
      GoodsDetailFragment.access$602(this.this$0, false);
      GoodsDetailFragment.access$700(this.this$0).setImageResource(a.e("munion_goods_detail_like_not_button_selector"));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\GoodsDetailFragment$SyncFavStatesRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */