package com.taobao.munion.ewall.ui.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.taobao.munion.model.f;
import com.taobao.munion.restool.a;
import java.util.ArrayList;

class GoodsDetailFragment$TagListAdapter
  extends BaseAdapter
{
  int chooseItemId = -1;
  boolean manualSelect = false;
  
  GoodsDetailFragment$TagListAdapter(GoodsDetailFragment paramGoodsDetailFragment) {}
  
  public int getChooseItemId()
  {
    return this.chooseItemId;
  }
  
  public int getCount()
  {
    return GoodsDetailFragment.access$400(this.this$0).size();
  }
  
  public Object getItem(int paramInt)
  {
    return GoodsDetailFragment.access$400(this.this$0).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new GoodsDetailFragment.TagListHolder(this.this$0);
      if (GoodsDetailFragment.access$500(this.this$0) == null) {
        GoodsDetailFragment.access$502(this.this$0, LayoutInflater.from(this.this$0.getActivity()));
      }
      paramView = GoodsDetailFragment.access$500(this.this$0).inflate(a.i("munion_goods_detail_dialog_item"), null);
      paramViewGroup.icon = ((ImageView)paramView.findViewById(a.c("goods_detail_item_icon")));
      paramViewGroup.title = ((TextView)paramView.findViewById(a.c("goods_detail_item_tag")));
      paramViewGroup.isChooseIcon = ((ImageView)paramView.findViewById(a.c("goods_detail_item_check_icon")));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      if ((GoodsDetailFragment.access$400(this.this$0) != null) && (GoodsDetailFragment.access$400(this.this$0).size() > 0))
      {
        f localf = (f)GoodsDetailFragment.access$400(this.this$0).get(paramInt);
        paramViewGroup.title.setText(localf.c());
        if ((localf.d()) && (!this.manualSelect)) {
          this.chooseItemId = paramInt;
        }
        if (this.chooseItemId != paramInt) {
          break;
        }
        paramViewGroup.isChooseIcon.setVisibility(0);
      }
      return paramView;
      paramViewGroup = (GoodsDetailFragment.TagListHolder)paramView.getTag();
    }
    paramViewGroup.isChooseIcon.setVisibility(4);
    return paramView;
  }
  
  public void setChooseItemId(int paramInt)
  {
    this.chooseItemId = paramInt;
    this.manualSelect = true;
    notifyDataSetChanged();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\GoodsDetailFragment$TagListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */