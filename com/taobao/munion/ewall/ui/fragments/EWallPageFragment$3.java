package com.taobao.munion.ewall.ui.fragments;

import android.view.View;
import android.view.View.OnClickListener;
import com.taobao.munion.requests.e;

class EWallPageFragment$3
  implements View.OnClickListener
{
  EWallPageFragment$3(EWallPageFragment paramEWallPageFragment) {}
  
  public void onClick(View paramView)
  {
    this.this$0.mErrorPage.setVisibility(8);
    this.this$0.mPageLoadView.setVisibility(0);
    new EWallPageFragment.GetPageDataTask(this.this$0, true, false).loadHttpContent(new e(this.this$0.mParent.sEWallMainBean, this.this$0.mEWallTabBean));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallPageFragment$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */