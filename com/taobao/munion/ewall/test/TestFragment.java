package com.taobao.munion.ewall.test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.restool.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestFragment
  extends BaseFragment
{
  public static final String MAP_KEY = "mapKey";
  private List<Map<String, String>> mData;
  
  private void initGridView(View paramView)
  {
    paramView = (GridView)paramView.findViewById(a.c("gridview"));
    paramView.setAdapter(new SimpleAdapter(getActivity(), this.mData, 17367043, new String[] { "mapKey" }, new int[] { 16908308 }));
    paramView.setOnItemClickListener(new TestFragment.1(this));
  }
  
  private void initMapData()
  {
    this.mData = new ArrayList();
    HashMap localHashMap = new HashMap();
    localHashMap.put("mapKey", "详情入口");
    this.mData.add(localHashMap);
    localHashMap = new HashMap();
    localHashMap.put("mapKey", "愿望清单");
    this.mData.add(localHashMap);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(a.i("munion_test_main, container"), null);
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initMapData();
    initGridView(paramView);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\test\TestFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */