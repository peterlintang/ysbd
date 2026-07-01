package com.taobao.munion.ewall.ui.fragments;

import android.support.v4.app.Fragment;
import android.widget.Toast;
import com.taobao.munion.animationadapter.b;
import com.taobao.munion.net.l;
import com.taobao.munion.net.s;
import com.taobao.munion.net.t;

class FavListCommonFragment$SendDeleteTask
  extends s
{
  public FavListCommonFragment$SendDeleteTask(FavListCommonFragment paramFavListCommonFragment, Fragment paramFragment)
  {
    super(paramFragment);
  }
  
  public void doHttpFailed(int paramInt, t paramt)
  {
    this.this$0.stopLoadingStatus();
    Toast.makeText(this.this$0.getActivity(), "删除请求失败", 0).show();
  }
  
  public void doHttpsuccsed(int paramInt, l paraml)
  {
    this.this$0.stopLoadingStatus();
    if (this.this$0.mTaobaoAnimationAdapter != null)
    {
      this.this$0.mTaobaoAnimationAdapter.d();
      this.this$0.mTaobaoAnimationAdapter.a(this.this$0.mTempSelectedPositions);
    }
    Toast.makeText(this.this$0.getActivity(), "删除成功", 0).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavListCommonFragment$SendDeleteTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */