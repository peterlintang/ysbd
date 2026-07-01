package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v4.content.Loader.OnLoadCompleteListener;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class LoaderManagerImpl$LoaderInfo
  implements Loader.OnLoadCompleteListener<Object>
{
  final Bundle mArgs;
  LoaderManager.LoaderCallbacks<Object> mCallbacks;
  Object mData;
  boolean mDeliveredData;
  boolean mDestroyed;
  boolean mHaveData;
  final int mId;
  boolean mListenerRegistered;
  Loader<Object> mLoader;
  LoaderInfo mPendingLoader;
  boolean mReportNextStart;
  boolean mRetaining;
  boolean mRetainingStarted;
  boolean mStarted;
  
  public LoaderManagerImpl$LoaderInfo(int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks<Object> paramLoaderCallbacks)
  {
    this.mId = paramBundle;
    this.mArgs = paramLoaderCallbacks;
    LoaderManager.LoaderCallbacks localLoaderCallbacks;
    this.mCallbacks = localLoaderCallbacks;
  }
  
  final void callOnLoadFinished(Loader<Object> paramLoader, Object paramObject)
  {
    String str;
    if (this.mCallbacks != null)
    {
      if (this.this$0.mActivity == null) {
        break label150;
      }
      str = this.this$0.mActivity.mFragments.mNoTransactionsBecause;
      this.this$0.mActivity.mFragments.mNoTransactionsBecause = "onLoadFinished";
    }
    for (;;)
    {
      try
      {
        if (LoaderManagerImpl.DEBUG) {
          new StringBuilder("  onLoadFinished in ").append(paramLoader).append(": ").append(paramLoader.dataToString(paramObject)).toString();
        }
        this.mCallbacks.onLoadFinished(paramLoader, paramObject);
        if (this.this$0.mActivity != null) {
          this.this$0.mActivity.mFragments.mNoTransactionsBecause = str;
        }
        this.mDeliveredData = true;
        return;
      }
      finally
      {
        if (this.this$0.mActivity != null) {
          this.this$0.mActivity.mFragments.mNoTransactionsBecause = str;
        }
      }
      label150:
      str = null;
    }
  }
  
  /* Error */
  final void destroy()
  {
    // Byte code:
    //   0: aload_0
    //   1: astore_2
    //   2: getstatic 73	android/support/v4/app/LoaderManagerImpl:DEBUG	Z
    //   5: ifeq +20 -> 25
    //   8: new 75	java/lang/StringBuilder
    //   11: dup
    //   12: ldc 109
    //   14: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   17: aload_2
    //   18: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   21: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: pop
    //   25: aload_2
    //   26: iconst_1
    //   27: putfield 111	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mDestroyed	Z
    //   30: aload_2
    //   31: getfield 105	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mDeliveredData	Z
    //   34: istore_1
    //   35: aload_2
    //   36: iconst_0
    //   37: putfield 105	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mDeliveredData	Z
    //   40: aload_2
    //   41: getfield 45	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mCallbacks	Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
    //   44: ifnull +120 -> 164
    //   47: aload_2
    //   48: getfield 113	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mLoader	Landroid/support/v4/content/Loader;
    //   51: ifnull +113 -> 164
    //   54: aload_2
    //   55: getfield 115	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mHaveData	Z
    //   58: ifeq +106 -> 164
    //   61: iload_1
    //   62: ifeq +102 -> 164
    //   65: getstatic 73	android/support/v4/app/LoaderManagerImpl:DEBUG	Z
    //   68: ifeq +20 -> 88
    //   71: new 75	java/lang/StringBuilder
    //   74: dup
    //   75: ldc 117
    //   77: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   80: aload_2
    //   81: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   84: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: pop
    //   88: aload_2
    //   89: getfield 36	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   92: getfield 56	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   95: ifnull +163 -> 258
    //   98: aload_2
    //   99: getfield 36	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   102: getfield 56	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   105: getfield 62	android/support/v4/app/FragmentActivity:mFragments	Landroid/support/v4/app/FragmentManagerImpl;
    //   108: getfield 68	android/support/v4/app/FragmentManagerImpl:mNoTransactionsBecause	Ljava/lang/String;
    //   111: astore_3
    //   112: aload_2
    //   113: getfield 36	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   116: getfield 56	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   119: getfield 62	android/support/v4/app/FragmentActivity:mFragments	Landroid/support/v4/app/FragmentManagerImpl;
    //   122: ldc 119
    //   124: putfield 68	android/support/v4/app/FragmentManagerImpl:mNoTransactionsBecause	Ljava/lang/String;
    //   127: aload_2
    //   128: getfield 45	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mCallbacks	Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
    //   131: aload_2
    //   132: getfield 113	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mLoader	Landroid/support/v4/content/Loader;
    //   135: invokeinterface 122 2 0
    //   140: aload_2
    //   141: getfield 36	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   144: getfield 56	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   147: ifnull +17 -> 164
    //   150: aload_2
    //   151: getfield 36	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   154: getfield 56	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   157: getfield 62	android/support/v4/app/FragmentActivity:mFragments	Landroid/support/v4/app/FragmentManagerImpl;
    //   160: aload_3
    //   161: putfield 68	android/support/v4/app/FragmentManagerImpl:mNoTransactionsBecause	Ljava/lang/String;
    //   164: aload_2
    //   165: aconst_null
    //   166: putfield 45	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mCallbacks	Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
    //   169: aload_2
    //   170: aconst_null
    //   171: putfield 124	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mData	Ljava/lang/Object;
    //   174: aload_2
    //   175: iconst_0
    //   176: putfield 115	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mHaveData	Z
    //   179: aload_2
    //   180: getfield 113	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mLoader	Landroid/support/v4/content/Loader;
    //   183: ifnull +30 -> 213
    //   186: aload_2
    //   187: getfield 126	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mListenerRegistered	Z
    //   190: ifeq +16 -> 206
    //   193: aload_2
    //   194: iconst_0
    //   195: putfield 126	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mListenerRegistered	Z
    //   198: aload_2
    //   199: getfield 113	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mLoader	Landroid/support/v4/content/Loader;
    //   202: aload_2
    //   203: invokevirtual 130	android/support/v4/content/Loader:unregisterListener	(Landroid/support/v4/content/Loader$OnLoadCompleteListener;)V
    //   206: aload_2
    //   207: getfield 113	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mLoader	Landroid/support/v4/content/Loader;
    //   210: invokevirtual 133	android/support/v4/content/Loader:reset	()V
    //   213: aload_2
    //   214: getfield 135	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mPendingLoader	Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
    //   217: ifnull +40 -> 257
    //   220: aload_2
    //   221: getfield 135	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mPendingLoader	Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
    //   224: astore_2
    //   225: goto -223 -> 2
    //   228: astore 4
    //   230: aload_2
    //   231: getfield 36	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   234: getfield 56	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   237: ifnull +17 -> 254
    //   240: aload_2
    //   241: getfield 36	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   244: getfield 56	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   247: getfield 62	android/support/v4/app/FragmentActivity:mFragments	Landroid/support/v4/app/FragmentManagerImpl;
    //   250: aload_3
    //   251: putfield 68	android/support/v4/app/FragmentManagerImpl:mNoTransactionsBecause	Ljava/lang/String;
    //   254: aload 4
    //   256: athrow
    //   257: return
    //   258: aconst_null
    //   259: astore_3
    //   260: goto -133 -> 127
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	263	0	this	LoaderInfo
    //   34	28	1	bool	boolean
    //   1	240	2	localLoaderInfo	LoaderInfo
    //   111	149	3	str	String
    //   228	27	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   127	140	228	finally
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    String str = paramString;
    paramString = this;
    for (;;)
    {
      paramPrintWriter.print(str);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(paramString.mId);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(paramString.mArgs);
      paramPrintWriter.print(str);
      paramPrintWriter.print("mCallbacks=");
      paramPrintWriter.println(paramString.mCallbacks);
      paramPrintWriter.print(str);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(paramString.mLoader);
      if (paramString.mLoader != null) {
        paramString.mLoader.dump(str + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
      if ((paramString.mHaveData) || (paramString.mDeliveredData))
      {
        paramPrintWriter.print(str);
        paramPrintWriter.print("mHaveData=");
        paramPrintWriter.print(paramString.mHaveData);
        paramPrintWriter.print("  mDeliveredData=");
        paramPrintWriter.println(paramString.mDeliveredData);
        paramPrintWriter.print(str);
        paramPrintWriter.print("mData=");
        paramPrintWriter.println(paramString.mData);
      }
      paramPrintWriter.print(str);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(paramString.mStarted);
      paramPrintWriter.print(" mReportNextStart=");
      paramPrintWriter.print(paramString.mReportNextStart);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(paramString.mDestroyed);
      paramPrintWriter.print(str);
      paramPrintWriter.print("mRetaining=");
      paramPrintWriter.print(paramString.mRetaining);
      paramPrintWriter.print(" mRetainingStarted=");
      paramPrintWriter.print(paramString.mRetainingStarted);
      paramPrintWriter.print(" mListenerRegistered=");
      paramPrintWriter.println(paramString.mListenerRegistered);
      if (paramString.mPendingLoader == null) {
        break;
      }
      paramPrintWriter.print(str);
      paramPrintWriter.println("Pending Loader ");
      paramPrintWriter.print(paramString.mPendingLoader);
      paramPrintWriter.println(":");
      paramString = paramString.mPendingLoader;
      str = str + "  ";
    }
  }
  
  final void finishRetain()
  {
    if (this.mRetaining)
    {
      if (LoaderManagerImpl.DEBUG) {
        new StringBuilder("  Finished Retaining: ").append(this).toString();
      }
      this.mRetaining = false;
      if ((this.mStarted != this.mRetainingStarted) && (!this.mStarted)) {
        stop();
      }
    }
    if ((this.mStarted) && (this.mHaveData) && (!this.mReportNextStart)) {
      callOnLoadFinished(this.mLoader, this.mData);
    }
  }
  
  public final void onLoadComplete(Loader<Object> paramLoader, Object paramObject)
  {
    if (LoaderManagerImpl.DEBUG) {
      new StringBuilder("onLoadComplete: ").append(this).toString();
    }
    boolean bool;
    if (this.mDestroyed) {
      bool = LoaderManagerImpl.DEBUG;
    }
    do
    {
      return;
      if (this.this$0.mLoaders.get(this.mId) != this)
      {
        bool = LoaderManagerImpl.DEBUG;
        return;
      }
      LoaderInfo localLoaderInfo = this.mPendingLoader;
      if (localLoaderInfo != null)
      {
        if (LoaderManagerImpl.DEBUG) {
          new StringBuilder("  Switching to pending loader: ").append(localLoaderInfo).toString();
        }
        this.mPendingLoader = null;
        this.this$0.mLoaders.put(this.mId, null);
        destroy();
        this.this$0.installLoader(localLoaderInfo);
        return;
      }
      if ((this.mData != paramObject) || (!this.mHaveData))
      {
        this.mData = paramObject;
        this.mHaveData = true;
        if (this.mStarted) {
          callOnLoadFinished(paramLoader, paramObject);
        }
      }
      paramLoader = (LoaderInfo)this.this$0.mInactiveLoaders.get(this.mId);
      if ((paramLoader != null) && (paramLoader != this))
      {
        paramLoader.mDeliveredData = false;
        paramLoader.destroy();
        this.this$0.mInactiveLoaders.remove(this.mId);
      }
    } while ((this.this$0.mActivity == null) || (this.this$0.hasRunningLoaders()));
    this.this$0.mActivity.mFragments.startPendingDeferredFragments();
  }
  
  final void reportStart()
  {
    if ((this.mStarted) && (this.mReportNextStart))
    {
      this.mReportNextStart = false;
      if (this.mHaveData) {
        callOnLoadFinished(this.mLoader, this.mData);
      }
    }
  }
  
  final void retain()
  {
    if (LoaderManagerImpl.DEBUG) {
      new StringBuilder("  Retaining: ").append(this).toString();
    }
    this.mRetaining = true;
    this.mRetainingStarted = this.mStarted;
    this.mStarted = false;
    this.mCallbacks = null;
  }
  
  final void start()
  {
    if ((this.mRetaining) && (this.mRetainingStarted)) {
      this.mStarted = true;
    }
    do
    {
      do
      {
        return;
      } while (this.mStarted);
      this.mStarted = true;
      if (LoaderManagerImpl.DEBUG) {
        new StringBuilder("  Starting: ").append(this).toString();
      }
      if ((this.mLoader == null) && (this.mCallbacks != null)) {
        this.mLoader = this.mCallbacks.onCreateLoader(this.mId, this.mArgs);
      }
    } while (this.mLoader == null);
    if ((this.mLoader.getClass().isMemberClass()) && (!Modifier.isStatic(this.mLoader.getClass().getModifiers()))) {
      throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.mLoader);
    }
    if (!this.mListenerRegistered)
    {
      this.mLoader.registerListener(this.mId, this);
      this.mListenerRegistered = true;
    }
    this.mLoader.startLoading();
  }
  
  final void stop()
  {
    if (LoaderManagerImpl.DEBUG) {
      new StringBuilder("  Stopping: ").append(this).toString();
    }
    this.mStarted = false;
    if ((!this.mRetaining) && (this.mLoader != null) && (this.mListenerRegistered))
    {
      this.mListenerRegistered = false;
      this.mLoader.unregisterListener(this);
      this.mLoader.stopLoading();
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(this.mId);
    localStringBuilder.append(" : ");
    DebugUtils.buildShortClassTag(this.mLoader, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\LoaderManagerImpl$LoaderInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */