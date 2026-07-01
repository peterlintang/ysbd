package com.taobao.munion.ewall.ui.fragments;

import android.support.v4.app.FragmentActivity;
import com.taobao.munion.ewall.EWallContainerActivity;
import com.taobao.munion.model.b;
import com.taobao.munion.net.j;
import com.taobao.munion.net.l;
import com.taobao.munion.net.t;
import com.taobao.munion.utils.k;
import com.umeng.newxp.controller.ExchangeDataService;
import org.json.JSONArray;
import org.json.JSONException;

class EWallMainFragment$GetInitDataTask
  extends j
{
  EWallMainFragment$GetInitDataTask(EWallMainFragment paramEWallMainFragment) {}
  
  protected void onHttpFailed(int paramInt, t paramt)
  {
    this.this$0.setDefaultFailedStatus();
  }
  
  protected void onHttpLoading(int paramInt)
  {
    this.this$0.startLoadingStatus(new boolean[0]);
    super.onHttpLoading(paramInt);
  }
  
  protected void onHttpSucceed(int paramInt, l paraml)
  {
    if ((this.this$0.getActivity() == null) || (this.this$0.getActivity().isFinishing()) || (!this.this$0.isAdded())) {}
    for (;;)
    {
      return;
      try
      {
        this.this$0.sEWallMainBean = new b(paraml.c());
        this.this$0.sEWallMainBean.a(EWallContainerActivity.mExchangeDataService.slot_id);
        this.this$0.sEWallMainBean.a((JSONArray)paraml.b("promoters"));
        this.this$0.sEWallMainBean.b(EWallContainerActivity.mExchangeDataService.layoutType);
        EWallMainFragment.access$400(this.this$0);
        paraml = (JSONArray)paraml.b("tabs");
        if (paraml != null)
        {
          EWallMainFragment.access$500(this.this$0, paraml);
          EWallMainFragment.access$600(this.this$0);
          this.this$0.stopLoadingStatus();
          return;
        }
      }
      catch (JSONException paraml)
      {
        k.b("load ewall page e = " + paraml.toString());
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallMainFragment$GetInitDataTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */