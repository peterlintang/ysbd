package com.taobao.munion.ewall.ui.fragments;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.umeng.newxp.view.handler.ewall.RecyclingImageView;

class EWallPageFragment$5
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  EWallPageFragment$5(EWallPageFragment paramEWallPageFragment) {}
  
  public void onGlobalLayout()
  {
    if ((this.this$0.mImageAdapter != null) && (this.this$0.mImageAdapter.getItemHeight() == 0) && (RecyclingImageView.a > 0)) {
      this.this$0.mImageAdapter.setItemHeight(RecyclingImageView.a);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallPageFragment$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */