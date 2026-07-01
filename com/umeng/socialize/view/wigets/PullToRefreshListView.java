package com.umeng.socialize.view.wigets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PullToRefreshListView
  extends ListView
  implements AbsListView.OnScrollListener
{
  private static final int PULL_TO_REFRESH = 2;
  private static final int REFRESHING = 4;
  private static final int RELEASE_TO_REFRESH = 3;
  private static final String TAG = "Other";
  private static final int TAP_TO_REFRESH = 1;
  private Context context;
  private int mCurrentScrollState;
  private RotateAnimation mFlipAnimation;
  private LayoutInflater mInflater;
  private int mLastMotionY;
  private PullToRefreshListView.b mOnRefreshListener;
  private AbsListView.OnScrollListener mOnScrollListener;
  private int mRefreshOriginalTopPadding;
  private int mRefreshState;
  private RelativeLayout mRefreshView;
  private int mRefreshViewHeight;
  private ImageView mRefreshViewImage;
  private TextView mRefreshViewLastUpdated;
  private ProgressBar mRefreshViewProgress;
  private TextView mRefreshViewText;
  private RotateAnimation mReverseFlipAnimation;
  
  public PullToRefreshListView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public PullToRefreshListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public PullToRefreshListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void applyHeaderPadding(MotionEvent paramMotionEvent)
  {
    j = 1;
    int n = paramMotionEvent.getHistorySize();
    try
    {
      i = ((Integer)MotionEvent.class.getMethod("getPointerCount", new Class[0]).invoke(paramMotionEvent, new Object[0])).intValue();
      j = i;
    }
    catch (IllegalArgumentException paramMotionEvent)
    {
      throw paramMotionEvent;
    }
    catch (IllegalAccessException localIllegalAccessException1)
    {
      for (;;)
      {
        System.err.println("unexpected " + localIllegalAccessException1);
      }
    }
    catch (InvocationTargetException localInvocationTargetException1)
    {
      int i;
      int k;
      for (;;)
      {
        System.err.println("unexpected " + localInvocationTargetException1);
      }
      int m = 0;
      for (;;)
      {
        if (m < j) {
          break label124;
        }
        k += 1;
        break;
        if (this.mRefreshState != 3) {
          break label245;
        }
        if (!isVerticalFadingEdgeEnabled()) {
          break label144;
        }
        setVerticalScrollBarEnabled(false);
        try
        {
          i = ((Float)MotionEvent.class.getMethod("getHistoricalY", new Class[] { Integer.TYPE, Integer.TYPE }).invoke(paramMotionEvent, new Object[] { Integer.valueOf(m), Integer.valueOf(k) })).intValue();
          i = (int)((i - this.mLastMotionY - this.mRefreshViewHeight) / 1.7D);
          this.mRefreshView.setPadding(this.mRefreshView.getPaddingLeft(), i, this.mRefreshView.getPaddingRight(), this.mRefreshView.getPaddingBottom());
          m += 1;
        }
        catch (NoSuchMethodException localNoSuchMethodException1)
        {
          for (;;)
          {
            i = (int)paramMotionEvent.getHistoricalY(k);
          }
        }
        catch (IllegalArgumentException paramMotionEvent)
        {
          throw paramMotionEvent;
        }
        catch (IllegalAccessException localIllegalAccessException2)
        {
          for (;;)
          {
            System.err.println("unexpected " + localIllegalAccessException2);
            i = 0;
          }
        }
        catch (InvocationTargetException localInvocationTargetException2)
        {
          for (;;)
          {
            System.err.println("unexpected " + localInvocationTargetException2);
            i = 0;
          }
        }
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      for (;;) {}
    }
    k = 0;
    if (k >= n) {
      return;
    }
  }
  
  private void init(Context paramContext)
  {
    this.context = paramContext;
    this.mFlipAnimation = new RotateAnimation(0.0F, -180.0F, 1, 0.5F, 1, 0.5F);
    this.mFlipAnimation.setInterpolator(new LinearInterpolator());
    this.mFlipAnimation.setDuration(100L);
    this.mFlipAnimation.setFillAfter(true);
    this.mReverseFlipAnimation = new RotateAnimation(-180.0F, 0.0F, 1, 0.5F, 1, 0.5F);
    this.mReverseFlipAnimation.setInterpolator(new LinearInterpolator());
    this.mReverseFlipAnimation.setDuration(100L);
    this.mReverseFlipAnimation.setFillAfter(true);
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    this.mRefreshView = ((RelativeLayout)this.mInflater.inflate(b.a(paramContext, b.a.a, "umeng_socialize_pull_to_refresh_header"), this, false));
    this.mRefreshViewText = ((TextView)this.mRefreshView.findViewById(b.a(paramContext, b.a.b, "pull_to_refresh_text")));
    this.mRefreshViewImage = ((ImageView)this.mRefreshView.findViewById(b.a(paramContext, b.a.b, "pull_to_refresh_image")));
    this.mRefreshViewProgress = ((ProgressBar)this.mRefreshView.findViewById(b.a(paramContext, b.a.b, "pull_to_refresh_progress")));
    this.mRefreshViewLastUpdated = ((TextView)this.mRefreshView.findViewById(b.a(paramContext, b.a.b, "pull_to_refresh_updated_at")));
    this.mRefreshViewImage.setMinimumHeight(50);
    this.mRefreshView.setOnClickListener(new PullToRefreshListView.a(this, null));
    this.mRefreshOriginalTopPadding = this.mRefreshView.getPaddingTop();
    this.mRefreshState = 1;
    addHeaderView(this.mRefreshView);
    super.setOnScrollListener(this);
    measureView(this.mRefreshView);
    this.mRefreshViewHeight = this.mRefreshView.getMeasuredHeight();
  }
  
  private void measureView(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams2 = paramView.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null) {
      localLayoutParams1 = new ViewGroup.LayoutParams(-1, -2);
    }
    int j = ViewGroup.getChildMeasureSpec(0, 0, localLayoutParams1.width);
    int i = localLayoutParams1.height;
    if (i > 0) {}
    for (i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);; i = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(j, i);
      return;
    }
  }
  
  private void resetHeader()
  {
    if (this.mRefreshState != 1)
    {
      this.mRefreshState = 1;
      resetHeaderPadding();
      this.mRefreshViewText.setText(b.a(this.context, b.a.e, "pull_to_refresh_tap_label"));
      this.mRefreshViewImage.setImageResource(b.a(this.context, b.a.c, "umeng_socialize_pulltorefresh_arrow"));
      this.mRefreshViewImage.clearAnimation();
      this.mRefreshViewImage.setVisibility(8);
      this.mRefreshViewProgress.setVisibility(8);
    }
  }
  
  private void resetHeaderPadding()
  {
    this.mRefreshView.setPadding(this.mRefreshView.getPaddingLeft(), this.mRefreshOriginalTopPadding, this.mRefreshView.getPaddingRight(), this.mRefreshView.getPaddingBottom());
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    setSelection(1);
  }
  
  public void onRefresh()
  {
    if (this.mOnRefreshListener != null) {
      this.mOnRefreshListener.a();
    }
  }
  
  public void onRefreshComplete()
  {
    resetHeader();
    if (this.mRefreshView.getBottom() > 0)
    {
      invalidateViews();
      setSelection(1);
    }
  }
  
  public void onRefreshComplete(CharSequence paramCharSequence)
  {
    setLastUpdated(paramCharSequence);
    onRefreshComplete();
  }
  
  public void onRefreshCompleteKeepState()
  {
    resetHeader();
    if (this.mRefreshView.getBottom() > 0) {
      invalidateViews();
    }
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.mCurrentScrollState == 1) && (this.mRefreshState != 4)) {
      if (paramInt1 == 0)
      {
        this.mRefreshViewImage.setVisibility(0);
        if (((this.mRefreshView.getBottom() > this.mRefreshViewHeight + 20) || (this.mRefreshView.getTop() >= 0)) && (this.mRefreshState != 3))
        {
          this.mRefreshViewText.setText(b.a(this.context, b.a.e, "pull_to_refresh_release_label"));
          this.mRefreshViewImage.clearAnimation();
          this.mRefreshViewImage.startAnimation(this.mFlipAnimation);
          this.mRefreshState = 3;
        }
      }
    }
    for (;;)
    {
      if (this.mOnScrollListener != null) {
        this.mOnScrollListener.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
      }
      return;
      if ((this.mRefreshView.getBottom() < this.mRefreshViewHeight + 20) && (this.mRefreshState != 2))
      {
        this.mRefreshViewText.setText(b.a(this.context, b.a.e, "pull_to_refresh_pull_label"));
        if (this.mRefreshState != 1)
        {
          this.mRefreshViewImage.clearAnimation();
          this.mRefreshViewImage.startAnimation(this.mReverseFlipAnimation);
        }
        this.mRefreshState = 2;
        continue;
        this.mRefreshViewImage.setVisibility(8);
        resetHeader();
        continue;
        if ((this.mCurrentScrollState == 2) && (paramInt1 == 0) && (this.mRefreshState != 4)) {
          setSelection(1);
        }
      }
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    this.mCurrentScrollState = paramInt;
    if (this.mOnScrollListener != null) {
      this.mOnScrollListener.onScrollStateChanged(paramAbsListView, paramInt);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      if (!isVerticalScrollBarEnabled()) {
        setVerticalScrollBarEnabled(true);
      }
      if ((getFirstVisiblePosition() == 0) && (this.mRefreshState != 4)) {
        if (((this.mRefreshView.getBottom() > this.mRefreshViewHeight) || (this.mRefreshView.getTop() >= 0)) && (this.mRefreshState == 3))
        {
          this.mRefreshState = 4;
          prepareForRefresh();
          onRefresh();
        }
        else if ((this.mRefreshView.getBottom() < this.mRefreshViewHeight) || (this.mRefreshView.getTop() < 0))
        {
          resetHeader();
          setSelection(1);
          continue;
          this.mLastMotionY = i;
          continue;
          applyHeaderPadding(paramMotionEvent);
        }
      }
    }
  }
  
  public void prepareForRefresh()
  {
    resetHeaderPadding();
    this.mRefreshViewImage.setVisibility(8);
    this.mRefreshViewImage.setImageDrawable(null);
    this.mRefreshViewProgress.setVisibility(0);
    this.mRefreshViewText.setText(b.a(this.context, b.a.e, "pull_to_refresh_refreshing_label"));
    this.mRefreshState = 4;
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    super.setAdapter(paramListAdapter);
    setSelection(1);
  }
  
  public void setLastUpdated(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      this.mRefreshViewLastUpdated.setVisibility(0);
      this.mRefreshViewLastUpdated.setText(paramCharSequence);
      return;
    }
    this.mRefreshViewLastUpdated.setVisibility(8);
  }
  
  public void setOnRefreshListener(PullToRefreshListView.b paramb)
  {
    this.mOnRefreshListener = paramb;
  }
  
  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.mOnScrollListener = paramOnScrollListener;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\PullToRefreshListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */