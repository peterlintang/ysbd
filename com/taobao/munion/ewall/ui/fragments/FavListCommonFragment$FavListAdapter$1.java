package com.taobao.munion.ewall.ui.fragments;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.taobao.munion.model.d;
import java.util.LinkedHashSet;

class FavListCommonFragment$FavListAdapter$1
  implements CompoundButton.OnCheckedChangeListener
{
  FavListCommonFragment$FavListAdapter$1(FavListCommonFragment.FavListAdapter paramFavListAdapter, d paramd, int paramInt) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    this.val$bean.a(paramBoolean);
    if (paramBoolean)
    {
      this.this$1.this$0.mSelectedPositions.add(Integer.valueOf(this.val$position));
      return;
    }
    this.this$1.this$0.mSelectedPositions.remove(Integer.valueOf(this.val$position));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavListCommonFragment$FavListAdapter$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */