package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import java.util.ArrayList;

public class FragmentTabHost
  extends TabHost
  implements TabHost.OnTabChangeListener
{
  private boolean mAttached;
  private int mContainerId;
  private Context mContext;
  private FragmentManager mFragmentManager;
  private FragmentTabHost.TabInfo mLastTab;
  private TabHost.OnTabChangeListener mOnTabChangeListener;
  private FrameLayout mRealTabContent;
  private final ArrayList<FragmentTabHost.TabInfo> mTabs = new ArrayList();
  
  public FragmentTabHost(Context paramContext)
  {
    super(paramContext, null);
    initFragmentTabHost(paramContext, null);
  }
  
  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initFragmentTabHost(paramContext, paramAttributeSet);
  }
  
  private FragmentTransaction doTabChanged(String paramString, FragmentTransaction paramFragmentTransaction)
  {
    Object localObject = null;
    int i = 0;
    if (i < this.mTabs.size())
    {
      FragmentTabHost.TabInfo localTabInfo = (FragmentTabHost.TabInfo)this.mTabs.get(i);
      if (!FragmentTabHost.TabInfo.access$200(localTabInfo).equals(paramString)) {
        break label214;
      }
      localObject = localTabInfo;
    }
    label201:
    label214:
    for (;;)
    {
      i += 1;
      break;
      if (localObject == null) {
        throw new IllegalStateException("No tab known for tag " + paramString);
      }
      paramString = paramFragmentTransaction;
      if (this.mLastTab != localObject)
      {
        paramString = paramFragmentTransaction;
        if (paramFragmentTransaction == null) {
          paramString = this.mFragmentManager.beginTransaction();
        }
        if ((this.mLastTab != null) && (FragmentTabHost.TabInfo.access$100(this.mLastTab) != null)) {
          paramString.detach(FragmentTabHost.TabInfo.access$100(this.mLastTab));
        }
        if (localObject != null)
        {
          if (FragmentTabHost.TabInfo.access$100((FragmentTabHost.TabInfo)localObject) != null) {
            break label201;
          }
          FragmentTabHost.TabInfo.access$102((FragmentTabHost.TabInfo)localObject, Fragment.instantiate(this.mContext, FragmentTabHost.TabInfo.access$300((FragmentTabHost.TabInfo)localObject).getName(), FragmentTabHost.TabInfo.access$400((FragmentTabHost.TabInfo)localObject)));
          paramString.add(this.mContainerId, FragmentTabHost.TabInfo.access$100((FragmentTabHost.TabInfo)localObject), FragmentTabHost.TabInfo.access$200((FragmentTabHost.TabInfo)localObject));
        }
      }
      for (;;)
      {
        this.mLastTab = ((FragmentTabHost.TabInfo)localObject);
        return paramString;
        paramString.attach(FragmentTabHost.TabInfo.access$100((FragmentTabHost.TabInfo)localObject));
      }
    }
  }
  
  private void ensureContent()
  {
    if (this.mRealTabContent == null)
    {
      this.mRealTabContent = ((FrameLayout)findViewById(this.mContainerId));
      if (this.mRealTabContent == null) {
        throw new IllegalStateException("No tab content FrameLayout found for id " + this.mContainerId);
      }
    }
  }
  
  private void ensureHierarchy(Context paramContext)
  {
    if (findViewById(16908307) == null)
    {
      LinearLayout localLinearLayout = new LinearLayout(paramContext);
      localLinearLayout.setOrientation(1);
      addView(localLinearLayout, new FrameLayout.LayoutParams(-1, -1));
      Object localObject = new TabWidget(paramContext);
      ((TabWidget)localObject).setId(16908307);
      ((TabWidget)localObject).setOrientation(0);
      localLinearLayout.addView((View)localObject, new LinearLayout.LayoutParams(-1, -2, 0.0F));
      localObject = new FrameLayout(paramContext);
      ((FrameLayout)localObject).setId(16908305);
      localLinearLayout.addView((View)localObject, new LinearLayout.LayoutParams(0, 0, 0.0F));
      paramContext = new FrameLayout(paramContext);
      this.mRealTabContent = paramContext;
      this.mRealTabContent.setId(this.mContainerId);
      localLinearLayout.addView(paramContext, new LinearLayout.LayoutParams(-1, 0, 1.0F));
    }
  }
  
  private void initFragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    this.mContainerId = paramContext.getResourceId(0, 0);
    paramContext.recycle();
    super.setOnTabChangedListener(this);
  }
  
  public void addTab(TabHost.TabSpec paramTabSpec, Class<?> paramClass, Bundle paramBundle)
  {
    paramTabSpec.setContent(new FragmentTabHost.DummyTabFactory(this.mContext));
    String str = paramTabSpec.getTag();
    paramClass = new FragmentTabHost.TabInfo(str, paramClass, paramBundle);
    if (this.mAttached)
    {
      FragmentTabHost.TabInfo.access$102(paramClass, this.mFragmentManager.findFragmentByTag(str));
      if ((FragmentTabHost.TabInfo.access$100(paramClass) != null) && (!FragmentTabHost.TabInfo.access$100(paramClass).isDetached()))
      {
        paramBundle = this.mFragmentManager.beginTransaction();
        paramBundle.detach(FragmentTabHost.TabInfo.access$100(paramClass));
        paramBundle.commit();
      }
    }
    this.mTabs.add(paramClass);
    addTab(paramTabSpec);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    Object localObject1 = null;
    int i = 0;
    if (i < this.mTabs.size())
    {
      FragmentTabHost.TabInfo localTabInfo = (FragmentTabHost.TabInfo)this.mTabs.get(i);
      FragmentTabHost.TabInfo.access$102(localTabInfo, this.mFragmentManager.findFragmentByTag(FragmentTabHost.TabInfo.access$200(localTabInfo)));
      Object localObject2 = localObject1;
      if (FragmentTabHost.TabInfo.access$100(localTabInfo) != null)
      {
        localObject2 = localObject1;
        if (!FragmentTabHost.TabInfo.access$100(localTabInfo).isDetached())
        {
          if (!FragmentTabHost.TabInfo.access$200(localTabInfo).equals(str)) {
            break label109;
          }
          this.mLastTab = localTabInfo;
          localObject2 = localObject1;
        }
      }
      for (;;)
      {
        i += 1;
        localObject1 = localObject2;
        break;
        label109:
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = this.mFragmentManager.beginTransaction();
        }
        ((FragmentTransaction)localObject2).detach(FragmentTabHost.TabInfo.access$100(localTabInfo));
      }
    }
    this.mAttached = true;
    localObject1 = doTabChanged(str, (FragmentTransaction)localObject1);
    if (localObject1 != null)
    {
      ((FragmentTransaction)localObject1).commit();
      this.mFragmentManager.executePendingTransactions();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.mAttached = false;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (FragmentTabHost.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    setCurrentTabByTag(paramParcelable.curTab);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    FragmentTabHost.SavedState localSavedState = new FragmentTabHost.SavedState(super.onSaveInstanceState());
    localSavedState.curTab = getCurrentTabTag();
    return localSavedState;
  }
  
  public void onTabChanged(String paramString)
  {
    if (this.mAttached)
    {
      FragmentTransaction localFragmentTransaction = doTabChanged(paramString, null);
      if (localFragmentTransaction != null) {
        localFragmentTransaction.commit();
      }
    }
    if (this.mOnTabChangeListener != null) {
      this.mOnTabChangeListener.onTabChanged(paramString);
    }
  }
  
  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    this.mOnTabChangeListener = paramOnTabChangeListener;
  }
  
  @Deprecated
  public void setup()
  {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
  
  public void setup(Context paramContext, FragmentManager paramFragmentManager)
  {
    ensureHierarchy(paramContext);
    super.setup();
    this.mContext = paramContext;
    this.mFragmentManager = paramFragmentManager;
    ensureContent();
  }
  
  public void setup(Context paramContext, FragmentManager paramFragmentManager, int paramInt)
  {
    ensureHierarchy(paramContext);
    super.setup();
    this.mContext = paramContext;
    this.mFragmentManager = paramFragmentManager;
    this.mContainerId = paramInt;
    ensureContent();
    this.mRealTabContent.setId(paramInt);
    if (getId() == -1) {
      setId(16908306);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\FragmentTabHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */