package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class LocalBroadcastManager
{
  private static final boolean DEBUG = false;
  static final int MSG_EXEC_PENDING_BROADCASTS = 1;
  private static final String TAG = "LocalBroadcastManager";
  private static LocalBroadcastManager mInstance;
  private static final Object mLock = new Object();
  private final HashMap<String, ArrayList<LocalBroadcastManager.ReceiverRecord>> mActions = new HashMap();
  private final Context mAppContext;
  private final Handler mHandler;
  private final ArrayList<LocalBroadcastManager.BroadcastRecord> mPendingBroadcasts = new ArrayList();
  private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> mReceivers = new HashMap();
  
  private LocalBroadcastManager(Context paramContext)
  {
    this.mAppContext = paramContext;
    this.mHandler = new LocalBroadcastManager.1(this, paramContext.getMainLooper());
  }
  
  private void executePendingBroadcasts()
  {
    for (;;)
    {
      int i;
      synchronized (this.mReceivers)
      {
        i = this.mPendingBroadcasts.size();
        if (i <= 0) {
          return;
        }
        LocalBroadcastManager.BroadcastRecord[] arrayOfBroadcastRecord = new LocalBroadcastManager.BroadcastRecord[i];
        this.mPendingBroadcasts.toArray(arrayOfBroadcastRecord);
        this.mPendingBroadcasts.clear();
        i = 0;
        if (i >= arrayOfBroadcastRecord.length) {
          continue;
        }
        ??? = arrayOfBroadcastRecord[i];
        int j = 0;
        if (j < ???.receivers.size())
        {
          ((LocalBroadcastManager.ReceiverRecord)???.receivers.get(j)).receiver.onReceive(this.mAppContext, ???.intent);
          j += 1;
        }
      }
      i += 1;
    }
  }
  
  public static LocalBroadcastManager getInstance(Context paramContext)
  {
    synchronized (mLock)
    {
      if (mInstance == null) {
        mInstance = new LocalBroadcastManager(paramContext.getApplicationContext());
      }
      paramContext = mInstance;
      return paramContext;
    }
  }
  
  public void registerReceiver(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    synchronized (this.mReceivers)
    {
      LocalBroadcastManager.ReceiverRecord localReceiverRecord = new LocalBroadcastManager.ReceiverRecord(paramIntentFilter, paramBroadcastReceiver);
      Object localObject2 = (ArrayList)this.mReceivers.get(paramBroadcastReceiver);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new ArrayList(1);
        this.mReceivers.put(paramBroadcastReceiver, localObject1);
      }
      ((ArrayList)localObject1).add(paramIntentFilter);
      int i = 0;
      while (i < paramIntentFilter.countActions())
      {
        localObject2 = paramIntentFilter.getAction(i);
        localObject1 = (ArrayList)this.mActions.get(localObject2);
        paramBroadcastReceiver = (BroadcastReceiver)localObject1;
        if (localObject1 == null)
        {
          paramBroadcastReceiver = new ArrayList(1);
          this.mActions.put(localObject2, paramBroadcastReceiver);
        }
        paramBroadcastReceiver.add(localReceiverRecord);
        i += 1;
      }
      return;
    }
  }
  
  public boolean sendBroadcast(Intent paramIntent)
  {
    int i;
    label145:
    int j;
    Object localObject;
    int k;
    ArrayList localArrayList1;
    synchronized (this.mReceivers)
    {
      String str1 = paramIntent.getAction();
      String str2 = paramIntent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
      Uri localUri = paramIntent.getData();
      String str3 = paramIntent.getScheme();
      Set localSet = paramIntent.getCategories();
      if ((paramIntent.getFlags() & 0x8) == 0) {
        break label452;
      }
      i = 1;
      if (i != 0) {
        new StringBuilder("Resolving type ").append(str2).append(" scheme ").append(str3).append(" of intent ").append(paramIntent).toString();
      }
      ArrayList localArrayList2 = (ArrayList)this.mActions.get(paramIntent.getAction());
      if (localArrayList2 == null) {
        break label429;
      }
      if (i == 0) {
        break label437;
      }
      new StringBuilder("Action list: ").append(localArrayList2).toString();
      break label437;
      if (j >= localArrayList2.size()) {
        break label488;
      }
      localObject = (LocalBroadcastManager.ReceiverRecord)localArrayList2.get(j);
      if (i != 0) {
        new StringBuilder("Matching against filter ").append(((LocalBroadcastManager.ReceiverRecord)localObject).filter).toString();
      }
      if (((LocalBroadcastManager.ReceiverRecord)localObject).broadcasting)
      {
        if (i == 0) {
          break label457;
        }
      }
      else
      {
        k = ((LocalBroadcastManager.ReceiverRecord)localObject).filter.match(str1, str2, str3, localUri, localSet, "LocalBroadcastManager");
        if (k >= 0)
        {
          if (i != 0) {
            new StringBuilder("  Filter matched!  match=0x").append(Integer.toHexString(k)).toString();
          }
          if (localArrayList1 != null) {
            break label434;
          }
          localArrayList1 = new ArrayList();
          label271:
          localArrayList1.add(localObject);
          ((LocalBroadcastManager.ReceiverRecord)localObject).broadcasting = true;
        }
      }
    }
    if (i != 0) {
      switch (k)
      {
      default: 
        localObject = "unknown reason";
        label336:
        new StringBuilder("  Filter did not match: ").append((String)localObject).toString();
        break;
      }
    }
    for (;;)
    {
      if (i < localArrayList1.size())
      {
        ((LocalBroadcastManager.ReceiverRecord)localArrayList1.get(i)).broadcasting = false;
        i += 1;
      }
      else
      {
        this.mPendingBroadcasts.add(new LocalBroadcastManager.BroadcastRecord(paramIntent, localArrayList1));
        if (!this.mHandler.hasMessages(1)) {
          this.mHandler.sendEmptyMessage(1);
        }
        return true;
        label429:
        label434:
        label437:
        label452:
        label457:
        label488:
        do
        {
          return false;
          break label271;
          localArrayList1 = null;
          j = 0;
          break label145;
          for (;;)
          {
            j += 1;
            break label145;
            i = 0;
            break;
          }
          localObject = "action";
          break label336;
          localObject = "category";
          break label336;
          localObject = "data";
          break label336;
          localObject = "type";
          break label336;
        } while (localArrayList1 == null);
        i = 0;
      }
    }
  }
  
  public void sendBroadcastSync(Intent paramIntent)
  {
    if (sendBroadcast(paramIntent)) {
      executePendingBroadcasts();
    }
  }
  
  public void unregisterReceiver(BroadcastReceiver paramBroadcastReceiver)
  {
    for (;;)
    {
      int k;
      int i;
      synchronized (this.mReceivers)
      {
        ArrayList localArrayList1 = (ArrayList)this.mReceivers.remove(paramBroadcastReceiver);
        if (localArrayList1 != null) {
          break label167;
        }
        return;
        if (j < localArrayList1.size())
        {
          IntentFilter localIntentFilter = (IntentFilter)localArrayList1.get(j);
          k = 0;
          if (k >= localIntentFilter.countActions()) {
            break label188;
          }
          String str = localIntentFilter.getAction(k);
          ArrayList localArrayList2 = (ArrayList)this.mActions.get(str);
          if (localArrayList2 == null) {
            break label179;
          }
          i = 0;
          if (i < localArrayList2.size())
          {
            if (((LocalBroadcastManager.ReceiverRecord)localArrayList2.get(i)).receiver == paramBroadcastReceiver)
            {
              localArrayList2.remove(i);
              i -= 1;
              break label172;
            }
          }
          else
          {
            if (localArrayList2.size() > 0) {
              break label179;
            }
            this.mActions.remove(str);
            break label179;
          }
        }
        else
        {
          return;
        }
      }
      break label172;
      label167:
      int j = 0;
      continue;
      label172:
      i += 1;
      continue;
      label179:
      k += 1;
      continue;
      label188:
      j += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\content\LocalBroadcastManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */