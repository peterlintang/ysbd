package com.taobao.munion.ewall.ui.fragments;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.taobao.munion.model.a;
import com.taobao.munion.model.c;
import com.taobao.munion.net.j;
import com.taobao.munion.net.t;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

class EWallPageFragment$GetPageDataTask
  extends j
{
  private boolean mFirstPage;
  
  public EWallPageFragment$GetPageDataTask(EWallPageFragment paramEWallPageFragment, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.mFirstPage = paramBoolean1;
    if ((paramBoolean2) || ((this.mFirstPage) && (paramEWallPageFragment.mEWallTabBean.f() > 0))) {
      paramEWallPageFragment.mEWallTabBean.g("");
    }
  }
  
  public void loadHttpContent(com.taobao.munion.net.k paramk)
  {
    if (!EWallPageFragment.access$000(this.this$0))
    {
      EWallPageFragment.access$002(this.this$0, true);
      super.loadHttpContent(paramk);
    }
  }
  
  protected void onHttpFailed(int paramInt, t paramt)
  {
    if (this.mFirstPage)
    {
      this.this$0.mImageAdapter = null;
      this.this$0.onErrorView();
    }
    for (;;)
    {
      EWallPageFragment.access$002(this.this$0, false);
      return;
      this.this$0.mFootView.setVisibility(8);
      this.this$0.isNoMore = true;
    }
  }
  
  protected void onHttpSucceed(int paramInt, com.taobao.munion.net.l paraml)
  {
    EWallPageFragment.access$002(this.this$0, false);
    if ((this.this$0.getActivity() == null) || (this.this$0.getActivity().isFinishing())) {
      return;
    }
    for (;;)
    {
      try
      {
        Object localObject = paraml.b("sid");
        if (!com.taobao.munion.utils.l.b(localObject)) {
          this.this$0.mEWallTabBean.g((String)localObject);
        }
        paraml = (JSONArray)paraml.b("promoters");
        if ((paraml == null) || (paraml.length() <= 0)) {
          continue;
        }
        EWallPageFragment.access$100(this.this$0);
        localObject = new ArrayList();
        paramInt = 0;
        if (paramInt < paraml.length())
        {
          ((List)localObject).add(new a(paraml.getJSONObject(paramInt)));
          paramInt += 1;
          continue;
        }
        if (((List)localObject).size() > 0)
        {
          EWallPageFragment.access$200(this.this$0, (List)localObject, this.mFirstPage);
          this.this$0.mPageLoadView.setVisibility(8);
          this.this$0.mFootView.setVisibility(8);
        }
      }
      catch (JSONException paraml)
      {
        com.taobao.munion.utils.k.b("load ewall page e = " + paraml.toString());
        continue;
        this.this$0.mFootView.setVisibility(8);
        this.this$0.isNoMore = true;
        continue;
      }
      if (this.this$0.mPullToREfreshView != null) {
        this.this$0.mPullToREfreshView.o();
      }
      EWallPageFragment.access$002(this.this$0, false);
      return;
      if (!this.mFirstPage) {
        continue;
      }
      this.this$0.mImageAdapter = null;
      this.this$0.onErrorView();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallPageFragment$GetPageDataTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */