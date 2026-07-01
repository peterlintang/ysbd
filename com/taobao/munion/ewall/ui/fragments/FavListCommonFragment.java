package com.taobao.munion.ewall.ui.fragments;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.taobao.munion.animationadapter.b;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.common.fragment.FragmentViewBase;
import com.taobao.munion.model.d;
import com.taobao.munion.requests.c;
import com.taobao.munion.requests.i;
import com.taobao.munion.restool.a;
import com.taobao.munion.utils.k;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public abstract class FavListCommonFragment
  extends BaseFragment
{
  protected static final int ACTION_SYNC = 1;
  public static final int DIALOG_DELETE = 1;
  public static final int DIALOG_GREATER_THAN_MAX_DELETE = 2;
  public static final int DIALOG_GREATER_THAN_MAX_SYNC = 3;
  protected FavListCommonFragment.BottomButtonState currentState;
  protected boolean isNoLoadMore = false;
  protected int isSync;
  protected FavListCommonFragment.FavListAdapter mAdapter;
  protected RelativeLayout mBottomDeleteButton;
  protected RelativeLayout mBottomDeleteStartButton;
  protected RelativeLayout mBottomSelectAllButton;
  protected RelativeLayout mBottomSyncButton;
  protected LinearLayout mBottomSyncStartButton;
  protected FavListCommonFragment.ListViewState mCurrentListViewState;
  protected int mCurrentPage;
  protected c mDeleteFavoriteRequest;
  protected FavListCommonFragment.SendDeleteTask mDeleteTask;
  protected AlertDialog mDialog;
  protected int mDialogType;
  protected int mFirstItemTop;
  protected View mFooterView;
  protected i mGetGoodsListRequest;
  protected ArrayList<d> mList;
  protected ListView mListView;
  protected int mPosition;
  protected TextView mSelectTextView;
  protected LinkedHashSet<Integer> mSelectedPositions;
  protected b mTaobaoAnimationAdapter;
  protected LinkedHashSet<Integer> mTempSelectedPositions;
  protected boolean selectAllFlag;
  protected int visibleLastIndex;
  
  private void invokeDialogClick(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
    case 2: 
      invokeDelete();
      return;
    }
    invokeSync();
  }
  
  private void setListPositions()
  {
    if ((this.mList != null) && (this.mList.size() > 0))
    {
      int i = 0;
      while (i < this.mList.size())
      {
        if (((d)this.mList.get(i)).j()) {
          this.mSelectedPositions.add(Integer.valueOf(i));
        }
        i += 1;
      }
    }
  }
  
  private void startGoodsDetail(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("goods_url", paramString1);
    localBundle.putString("goods_id", paramString2);
    localBundle.putBoolean("hidden_fav_bar", true);
    localBundle.putBoolean("direct_webview_load", true);
    FragmentPageManager.getInstance().pushPage(GoodsDetailFragment.class.getName(), localBundle);
  }
  
  /* Error */
  protected String getItemsByCheckedId()
  {
    // Byte code:
    //   0: new 160	java/lang/StringBuffer
    //   3: dup
    //   4: invokespecial 161	java/lang/StringBuffer:<init>	()V
    //   7: astore 5
    //   9: aload_0
    //   10: getfield 107	com/taobao/munion/ewall/ui/fragments/FavListCommonFragment:mSelectedPositions	Ljava/util/LinkedHashSet;
    //   13: invokevirtual 165	java/util/LinkedHashSet:iterator	()Ljava/util/Iterator;
    //   16: astore_3
    //   17: aload_0
    //   18: getfield 167	com/taobao/munion/ewall/ui/fragments/FavListCommonFragment:mTempSelectedPositions	Ljava/util/LinkedHashSet;
    //   21: invokevirtual 170	java/util/LinkedHashSet:clear	()V
    //   24: iconst_1
    //   25: istore_1
    //   26: aload_3
    //   27: invokeinterface 175 1 0
    //   32: ifeq +66 -> 98
    //   35: iload_1
    //   36: bipush 50
    //   38: if_icmpgt +60 -> 98
    //   41: aload_3
    //   42: invokeinterface 179 1 0
    //   47: checkcast 109	java/lang/Integer
    //   50: invokevirtual 182	java/lang/Integer:intValue	()I
    //   53: istore_2
    //   54: aload 5
    //   56: aload_0
    //   57: getfield 89	com/taobao/munion/ewall/ui/fragments/FavListCommonFragment:mList	Ljava/util/ArrayList;
    //   60: iload_2
    //   61: invokevirtual 99	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   64: checkcast 101	com/taobao/munion/model/d
    //   67: invokevirtual 185	com/taobao/munion/model/d:a	()Ljava/lang/String;
    //   70: invokevirtual 189	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   73: ldc -65
    //   75: invokevirtual 189	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   78: pop
    //   79: aload_0
    //   80: getfield 167	com/taobao/munion/ewall/ui/fragments/FavListCommonFragment:mTempSelectedPositions	Ljava/util/LinkedHashSet;
    //   83: iload_2
    //   84: invokestatic 113	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   87: invokevirtual 119	java/util/LinkedHashSet:add	(Ljava/lang/Object;)Z
    //   90: pop
    //   91: iload_1
    //   92: iconst_1
    //   93: iadd
    //   94: istore_1
    //   95: goto -69 -> 26
    //   98: aload 5
    //   100: invokevirtual 194	java/lang/StringBuffer:length	()I
    //   103: ifle +52 -> 155
    //   106: aload 5
    //   108: invokevirtual 197	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   111: astore_3
    //   112: aload_3
    //   113: astore 4
    //   115: aload_3
    //   116: invokevirtual 200	java/lang/String:length	()I
    //   119: ifle +17 -> 136
    //   122: aload_3
    //   123: iconst_0
    //   124: aload 5
    //   126: ldc -65
    //   128: invokevirtual 204	java/lang/StringBuffer:lastIndexOf	(Ljava/lang/String;)I
    //   131: invokevirtual 208	java/lang/String:substring	(II)Ljava/lang/String;
    //   134: astore 4
    //   136: aload 4
    //   138: areturn
    //   139: astore 4
    //   141: aconst_null
    //   142: astore_3
    //   143: aload 4
    //   145: invokevirtual 211	java/lang/Exception:printStackTrace	()V
    //   148: aload_3
    //   149: areturn
    //   150: astore 4
    //   152: goto -9 -> 143
    //   155: aconst_null
    //   156: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	157	0	this	FavListCommonFragment
    //   25	70	1	i	int
    //   53	31	2	j	int
    //   16	133	3	localObject1	Object
    //   113	24	4	localObject2	Object
    //   139	5	4	localException1	Exception
    //   150	1	4	localException2	Exception
    //   7	118	5	localStringBuffer	StringBuffer
    // Exception table:
    //   from	to	target	type
    //   9	24	139	java/lang/Exception
    //   26	35	139	java/lang/Exception
    //   41	91	139	java/lang/Exception
    //   98	112	139	java/lang/Exception
    //   115	136	150	java/lang/Exception
  }
  
  protected void hiddenDialog()
  {
    if (this.mDialog != null) {
      this.mDialog.dismiss();
    }
  }
  
  protected void invokeDelete()
  {
    String str = getItemsByCheckedId();
    if ((str == null) || ("".equals(str))) {
      return;
    }
    sendDeleteRequest(str);
  }
  
  protected void invokeSync() {}
  
  protected void makeDialog(int paramInt)
  {
    Object localObject1 = null;
    this.mDialogType = paramInt;
    Object localObject2;
    switch (paramInt)
    {
    default: 
      localObject2 = null;
      if (this.mDialog == null) {
        this.mDialog = new AlertDialog.Builder(getActivity()).setTitle((CharSequence)localObject2).setMessage((CharSequence)localObject1).setNegativeButton(17039360, new FavListCommonFragment.3(this)).setPositiveButton(17039370, new FavListCommonFragment.2(this)).create();
      }
      break;
    }
    for (;;)
    {
      this.mDialog.show();
      return;
      localObject2 = "删除提示";
      localObject1 = "您是否要删除?";
      break;
      localObject2 = "大于最大删除项";
      localObject1 = "您所选择的商品大于50条，系统将只删除前50条，是否继续?";
      break;
      localObject2 = "大于最大同步项";
      localObject1 = "您所选择的商品大于50条，系统将只同步前50条，是否继续?";
      break;
      this.mDialog.setTitle((CharSequence)localObject2);
      this.mDialog.setMessage((CharSequence)localObject1);
    }
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    int i = paramView.getId();
    boolean bool;
    if (i == a.c("label_detail_bottom_banner_button_select_all")) {
      if (!this.selectAllFlag)
      {
        bool = true;
        toggleSelect(bool);
      }
    }
    do
    {
      return;
      bool = false;
      break;
      if (i == a.c("label_detail_bottom_banner_button_delete"))
      {
        switchBottomButtonState(FavListCommonFragment.BottomButtonState.delete);
        return;
      }
      if (i == a.c("label_detail_bottom_banner_button_sync"))
      {
        switchBottomButtonState(FavListCommonFragment.BottomButtonState.sync);
        return;
      }
    } while (i != a.c("label_detail_bottom_banner_button_delete_start"));
    startDelete();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.mMainView = ((FragmentViewBase)paramLayoutInflater.inflate(a.i("munion_fav_list_view"), null));
    this.currentState = FavListCommonFragment.BottomButtonState.normal;
    this.mCurrentListViewState = FavListCommonFragment.ListViewState.notSyncList;
    this.mSelectedPositions = new LinkedHashSet();
    this.mTempSelectedPositions = new LinkedHashSet();
    this.mBottomSyncButton = ((RelativeLayout)this.mMainView.findViewById(a.c("label_detail_bottom_banner_button_sync")));
    this.mBottomDeleteButton = ((RelativeLayout)this.mMainView.findViewById(a.c("label_detail_bottom_banner_button_delete")));
    this.mBottomDeleteStartButton = ((RelativeLayout)this.mMainView.findViewById(a.c("label_detail_bottom_banner_button_delete_start")));
    this.mBottomSyncStartButton = ((LinearLayout)this.mMainView.findViewById(a.c("label_detail_bottom_banner_button_sync_start")));
    this.mBottomSelectAllButton = ((RelativeLayout)this.mMainView.findViewById(a.c("label_detail_bottom_banner_button_select_all")));
    this.mListView = ((ListView)this.mMainView.findViewById(a.c("fav_listview")));
    this.mFooterView = this.mMainView.findViewById(a.c("fav_footer"));
    this.mSelectTextView = ((TextView)this.mMainView.findViewById(a.c("munion_select_button")));
    this.mBottomSyncButton.setOnClickListener(this);
    this.mBottomDeleteButton.setOnClickListener(this);
    this.mBottomDeleteStartButton.setOnClickListener(this);
    this.mBottomSyncStartButton.setOnClickListener(this);
    this.mBottomSelectAllButton.setOnClickListener(this);
    this.mListView.setOnItemClickListener(new FavListCommonFragment.1(this));
    return this.mMainView;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    k.a("state =  " + this.currentState.toString());
    if ((paramInt == 4) && (this.currentState != FavListCommonFragment.BottomButtonState.normal))
    {
      switchBottomButtonState(FavListCommonFragment.BottomButtonState.normal);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void recoverSlidDelete()
  {
    if (this.mTaobaoAnimationAdapter != null) {
      this.mTaobaoAnimationAdapter.c();
    }
  }
  
  protected void refreshList() {}
  
  protected void removeFooterView()
  {
    this.mFooterView.setVisibility(8);
  }
  
  public void removeSlidDelete()
  {
    if (this.mTaobaoAnimationAdapter != null) {
      this.mTaobaoAnimationAdapter.b();
    }
  }
  
  protected void sendDeleteRequest(String paramString)
  {
    this.mDeleteFavoriteRequest = new c(paramString);
    k.a(paramString);
    startLoadingStatus(new boolean[] { true });
    new FavListCommonFragment.SendDeleteTask(this, this).loadHttpContent(this.mDeleteFavoriteRequest);
  }
  
  protected void setAdapters(FavListCommonFragment.ListViewState paramListViewState, ArrayList<d> paramArrayList)
  {
    if ((paramArrayList != null) && (paramArrayList.size() > 0))
    {
      stopFailedStatus();
      if (this.mAdapter == null)
      {
        this.mList = paramArrayList;
        this.mAdapter = new FavListCommonFragment.FavListAdapter(this, this.mList);
        this.mTaobaoAnimationAdapter = new b(this.mAdapter, a.i("munion_undo_row"), a.c("undo_row_undobutton"), a.c("undo_row_texttv"), new FavListCommonFragment.4(this));
        this.mTaobaoAnimationAdapter.a(new FavListCommonFragment.5(this));
        this.mTaobaoAnimationAdapter.a(this.mListView);
        this.mListView.setAdapter(this.mTaobaoAnimationAdapter);
      }
    }
    for (;;)
    {
      stopLoadingStatus();
      return;
      this.mList.addAll(paramArrayList);
      this.mAdapter.setList(this.mList);
      continue;
      this.isNoLoadMore = true;
      if (this.mCurrentPage <= 0) {
        showErrorPage(paramListViewState);
      }
      if (this.mCurrentPage > 0) {
        this.mCurrentPage -= 1;
      }
    }
  }
  
  protected void setFooterView()
  {
    this.mFooterView.setVisibility(0);
  }
  
  protected void showErrorPage(FavListCommonFragment.ListViewState paramListViewState)
  {
    stopFailedStatus();
    switch (FavListCommonFragment.6.$SwitchMap$com$taobao$munion$ewall$ui$fragments$FavListCommonFragment$ListViewState[paramListViewState.ordinal()])
    {
    default: 
      return;
    case 1: 
      setFailedStatus(getString(a.k("munion_label_list_no_not_sync_goods")), null, false, -1.0F);
      return;
    }
    setFailedStatus(getString(a.k("munion_label_list_no_sync_goods")), null, false, -1.0F);
  }
  
  protected void startDelete()
  {
    int i = 0;
    if (this.mSelectedPositions.size() == 0)
    {
      Toast.makeText(getActivity(), "请勾选需要删除的宝贝", 0).show();
      return;
    }
    if (this.mSelectedPositions.size() > 50) {
      i = 1;
    }
    if (i != 0)
    {
      makeDialog(2);
      return;
    }
    makeDialog(1);
  }
  
  protected abstract void switchBottomButtonState(FavListCommonFragment.BottomButtonState paramBottomButtonState);
  
  protected void toggleMultiChooseMode(FavListCommonFragment.BottomButtonState paramBottomButtonState)
  {
    if (this.mAdapter == null) {}
    do
    {
      do
      {
        return;
        switch (FavListCommonFragment.6.$SwitchMap$com$taobao$munion$ewall$ui$fragments$FavListCommonFragment$BottomButtonState[paramBottomButtonState.ordinal()])
        {
        default: 
          return;
        }
      } while (!this.mAdapter.isMultiChooseMode());
      this.mAdapter.setMultiChooseMode(false);
      return;
    } while (this.mAdapter.isMultiChooseMode());
    this.mAdapter.setMultiChooseMode(true);
  }
  
  protected void toggleSelect(boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.selectAllFlag = true;
      this.mSelectTextView.setText(a.k("munion_label_detail_select_none"));
      if (this.mList != null) {}
    }
    do
    {
      return;
      while (i < this.mList.size())
      {
        ((d)this.mList.get(i)).a(true);
        this.mSelectedPositions.add(Integer.valueOf(i));
        i += 1;
      }
      this.mSelectTextView.setText(a.k("munion_label_detail_select_all"));
      this.selectAllFlag = false;
      if (this.mSelectedPositions != null) {
        this.mSelectedPositions.clear();
      }
    } while (this.mList == null);
    i = 0;
    while (i < this.mList.size())
    {
      ((d)this.mList.get(i)).a(false);
      i += 1;
    }
    this.mAdapter.notifyDataSetChanged();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavListCommonFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */