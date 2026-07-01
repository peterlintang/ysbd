package com.taobao.munion.common.fragment;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.taobao.munion.ewall.actorframework.ActorBinder;
import com.taobao.munion.restool.a;
import com.umeng.newxp.view.handler.utils.b.a;
import com.umeng.newxp.view.handler.utils.c;

public abstract class BaseFragment
  extends Fragment
  implements View.OnClickListener
{
  public static final int RESULT_CANCELED = 0;
  public static final int RESULT_OK = -1;
  private LayoutInflater inflater;
  protected ActorBinder mActorBinder;
  private View mFailedView;
  private c mImageFetcher;
  private View mLoadingView;
  protected FragmentViewBase mMainView;
  private BaseFragment.OnFragmentFinishListener mOnFragmentFinishListener;
  private int mRequireCode;
  private Intent mResultBundle;
  private int mResultCode = 0;
  private Button retry;
  private TextView tvGuide;
  private TextView tvNote;
  
  protected ActorBinder createActorBinderDelegate()
  {
    return null;
  }
  
  public BaseFragment.OnFragmentFinishListener getFragmentFinishListener()
  {
    return this.mOnFragmentFinishListener;
  }
  
  public c getImageFetcher()
  {
    if (this.mImageFetcher == null)
    {
      this.mImageFetcher = new c(getActivity(), getResources().getDimensionPixelSize(a.f("munion_default_image_size")));
      b.a locala = new b.a(getActivity(), "thumbs");
      locala.a(0.2F);
      this.mImageFetcher.a(getActivity().getSupportFragmentManager(), locala);
    }
    return this.mImageFetcher;
  }
  
  public int getRequireCode()
  {
    return this.mRequireCode;
  }
  
  public void initAndsetImageFetcherSize(int paramInt)
  {
    this.mImageFetcher = new c(getActivity(), paramInt);
    b.a locala = new b.a(getActivity(), "thumbs");
    locala.a(0.2F);
    this.mImageFetcher.a(getActivity().getSupportFragmentManager(), locala);
  }
  
  public void onClick(View paramView)
  {
    if (a.c("retry") == paramView.getId()) {
      onRetry();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mActorBinder = createActorBinderDelegate();
    this.inflater = getActivity().getLayoutInflater();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.mActorBinder != null) {
      this.mActorBinder.destroy();
    }
    if ((this.mOnFragmentFinishListener == null) || (getRequireCode() == -1)) {
      return;
    }
    this.mOnFragmentFinishListener.onFragmentResult(getRequireCode(), this.mResultCode, this.mResultBundle);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public void onPause()
  {
    super.onPause();
    if (this.mImageFetcher != null)
    {
      this.mImageFetcher.c(false);
      this.mImageFetcher.b(true);
      this.mImageFetcher.h();
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.mImageFetcher != null) {
      this.mImageFetcher.b(false);
    }
  }
  
  protected void onRetry()
  {
    stopFailedStatus();
  }
  
  public void setDefaultFailedStatus()
  {
    setFailedStatus(getResources().getString(a.k("munion_webview_error_common_title")), getResources().getString(a.k("munion_webview_error_common_subtitle")), true, -1.0F);
  }
  
  public void setDefaultFailedStatus(float paramFloat)
  {
    setFailedStatus(getResources().getString(a.k("munion_webview_error_common_title")), getResources().getString(a.k("munion_webview_error_common_subtitle")), true, paramFloat);
  }
  
  public void setFailedStatus(String paramString1, String paramString2, boolean paramBoolean, float paramFloat)
  {
    stopFailedStatus();
    if (this.mFailedView == null)
    {
      this.mFailedView = this.inflater.inflate(a.i("munion_failed_mask"), null);
      this.mMainView.addView(this.mFailedView, new FrameLayout.LayoutParams(-1, -1));
    }
    if ((paramFloat != 0.0F) || (paramFloat != -1.0F))
    {
      View localView = this.mFailedView.findViewById(a.c("error_layout"));
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
      localLayoutParams.topMargin = Math.round(paramFloat);
      localView.setLayoutParams(localLayoutParams);
    }
    if ((paramString1 != null) && (!"".equals(paramString1)))
    {
      if (this.tvNote == null) {
        this.tvNote = ((TextView)this.mFailedView.findViewById(a.c("common_mask_tips")));
      }
      this.tvNote.setText(paramString1);
    }
    if ((paramString2 != null) && (!"".equals(paramString2)))
    {
      if (this.tvGuide == null) {
        this.tvGuide = ((TextView)this.mFailedView.findViewById(a.c("common_mask_guide")));
      }
      this.tvGuide.setText(paramString2);
    }
    if (this.retry == null)
    {
      this.retry = ((Button)this.mFailedView.findViewById(a.c("retry")));
      this.retry.setOnClickListener(this);
    }
    if (paramBoolean) {
      this.retry.setVisibility(0);
    }
    for (;;)
    {
      this.mFailedView.setVisibility(0);
      return;
      this.retry.setVisibility(4);
    }
  }
  
  public void setFragmentFinishListener(BaseFragment.OnFragmentFinishListener paramOnFragmentFinishListener)
  {
    this.mOnFragmentFinishListener = paramOnFragmentFinishListener;
  }
  
  public void setRequireCode(int paramInt)
  {
    this.mRequireCode = paramInt;
  }
  
  public void setResult(int paramInt)
  {
    this.mResultCode = paramInt;
    this.mResultBundle = null;
  }
  
  public void setResult(int paramInt, Intent paramIntent)
  {
    this.mResultBundle = paramIntent;
    this.mResultCode = paramInt;
  }
  
  public void startLoadingStatus(boolean... paramVarArgs)
  {
    if (this.mLoadingView == null)
    {
      this.mLoadingView = this.inflater.inflate(a.i("munion_loading_mask"), null);
      this.mMainView.addView(this.mLoadingView, new FrameLayout.LayoutParams(-1, -1));
    }
    if ((paramVarArgs.length > 0) && (paramVarArgs[0] == 1))
    {
      paramVarArgs = this.mLoadingView.findViewById(a.c("loading_body"));
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramVarArgs.getLayoutParams();
      localLayoutParams.topMargin = 0;
      paramVarArgs.setLayoutParams(localLayoutParams);
    }
    if (this.mLoadingView.getVisibility() != 0) {
      this.mLoadingView.setVisibility(0);
    }
  }
  
  public void stopFailedStatus()
  {
    if (this.mFailedView != null) {
      this.mFailedView.setVisibility(8);
    }
  }
  
  public void stopLoadingStatus()
  {
    if ((this.mLoadingView != null) && (this.mLoadingView.getVisibility() != 8)) {
      this.mLoadingView.setVisibility(8);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\common\fragment\BaseFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */