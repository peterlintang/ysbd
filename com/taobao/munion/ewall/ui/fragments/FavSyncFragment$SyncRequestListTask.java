package com.taobao.munion.ewall.ui.fragments;

import android.support.v4.app.Fragment;
import com.taobao.munion.animationadapter.b;
import com.taobao.munion.model.d;
import com.taobao.munion.net.l;
import com.taobao.munion.net.s;
import com.taobao.munion.net.t;
import org.json.JSONArray;

class FavSyncFragment$SyncRequestListTask
  extends s
{
  public FavSyncFragment$SyncRequestListTask(FavSyncFragment paramFavSyncFragment, Fragment paramFragment)
  {
    super(paramFragment);
  }
  
  public void doHttpFailed(int paramInt, t paramt)
  {
    FavSyncFragment.access$200(this.this$0);
  }
  
  public void doHttpsuccsed(int paramInt, l paraml)
  {
    FavSyncFragment.access$000(this.this$0);
    try
    {
      paraml = (JSONArray)paraml.b("result");
      paraml = d.a(paraml);
      this.this$0.setAdapters(FavListCommonFragment.ListViewState.syncList, paraml);
      if ((this.this$0.mCurrentPage <= 0) && (this.this$0.mTaobaoAnimationAdapter != null)) {
        this.this$0.mTaobaoAnimationAdapter.a(new FavSyncFragment.SyncRequestListTask.1(this));
      }
      return;
    }
    catch (Exception paraml)
    {
      for (;;)
      {
        paraml.printStackTrace();
        paraml = null;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavSyncFragment$SyncRequestListTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */