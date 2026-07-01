package com.taobao.munion.ewall.ui.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.taobao.munion.model.d;
import com.taobao.munion.restool.a;
import com.umeng.newxp.view.handler.utils.c;
import java.util.ArrayList;

class FavListCommonFragment$FavListAdapter
  extends BaseAdapter
{
  private ArrayList<d> labelDetailList;
  private boolean multiChooseMode;
  
  public FavListCommonFragment$FavListAdapter(ArrayList<d> paramArrayList)
  {
    ArrayList localArrayList;
    this.labelDetailList = localArrayList;
  }
  
  public int getCount()
  {
    return this.labelDetailList.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.labelDetailList.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.this$0.getActivity()).inflate(a.i("munion_fav_list_item"), null);
      paramViewGroup = new FavListCommonFragment.LabelDetailHolder(this.this$0);
      paramViewGroup.labelDetailImage = ((ImageView)paramView.findViewById(a.c("label_detail_item_image")));
      paramViewGroup.labelDetailTitle = ((TextView)paramView.findViewById(a.c("label_detail_item_title")));
      paramViewGroup.labelDetailPrice = ((TextView)paramView.findViewById(a.c("label_detail_item_price")));
      paramViewGroup.labelDetailPastDue = ((TextView)paramView.findViewById(a.c("label_detail_item_past_due")));
      paramViewGroup.labelDetailCheckbox = ((CheckBox)paramView.findViewById(a.c("label_list_checkbox")));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      if ((this.labelDetailList != null) && (this.labelDetailList.size() > 0))
      {
        d locald = (d)this.labelDetailList.get(paramInt);
        paramViewGroup.labelDetailTitle.setText(locald.g());
        paramViewGroup.labelDetailPrice.setText(locald.h());
        paramViewGroup.labelDetailCheckbox.setOnCheckedChangeListener(new FavListCommonFragment.FavListAdapter.1(this, locald, paramInt));
        this.this$0.getImageFetcher().a(locald.d(), paramViewGroup.labelDetailImage);
        paramViewGroup.labelDetailCheckbox.setChecked(locald.j());
        if (!this.multiChooseMode) {
          break;
        }
        paramViewGroup.labelDetailCheckbox.setVisibility(0);
      }
      return paramView;
      paramViewGroup = (FavListCommonFragment.LabelDetailHolder)paramView.getTag();
    }
    paramViewGroup.labelDetailCheckbox.setVisibility(8);
    return paramView;
  }
  
  public boolean isMultiChooseMode()
  {
    return this.multiChooseMode;
  }
  
  public void setList(ArrayList<d> paramArrayList)
  {
    this.labelDetailList = paramArrayList;
    if (paramArrayList != null) {
      notifyDataSetChanged();
    }
  }
  
  public void setMultiChooseMode(boolean paramBoolean)
  {
    this.multiChooseMode = paramBoolean;
    notifyDataSetChanged();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavListCommonFragment$FavListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */