package com.taobao.munion.ewall.ui.fragments;

import com.taobao.munion.animationadapter.b.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;

class FavListCommonFragment$5
  implements b.a
{
  FavListCommonFragment$5(FavListCommonFragment paramFavListCommonFragment) {}
  
  public void deleteItem(int paramInt)
  {
    if ((this.this$0.mList != null) && (paramInt < this.this$0.mList.size()))
    {
      this.this$0.mSelectedPositions.add(Integer.valueOf(paramInt));
      this.this$0.mTempSelectedPositions.clear();
      this.this$0.mTempSelectedPositions.add(Integer.valueOf(paramInt));
      this.this$0.invokeDelete();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavListCommonFragment$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */