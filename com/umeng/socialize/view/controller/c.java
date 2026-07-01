package com.umeng.socialize.view.controller;

import android.os.Handler;
import android.text.TextUtils;
import com.umeng.socialize.a.b;
import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.bean.o;
import com.umeng.socialize.controller.listener.SocializeListeners.FetchFriendsListener;
import com.umeng.socom.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class c
  implements SocializeListeners.FetchFriendsListener
{
  c(a parama) {}
  
  public void onComplete(int paramInt, List<UMFriend> paramList)
  {
    if ((paramInt == 200) && (paramList != null)) {}
    label278:
    for (;;)
    {
      HashSet localHashSet;
      Object localObject2;
      try
      {
        Object localObject1 = a.e(this.a).a(a.c(this.a));
        localHashSet = new HashSet();
        localObject2 = paramList.iterator();
        if (!((Iterator)localObject2).hasNext())
        {
          localObject1 = ((List)localObject1).iterator();
          if (!((Iterator)localObject1).hasNext())
          {
            a.e(this.a).a(paramList);
            a.d(this.a).sendEmptyMessage(2);
          }
        }
        else
        {
          localHashSet.add(((UMFriend)((Iterator)localObject2).next()).getFid());
          continue;
        }
        localObject2 = (UMFriend)((Iterator)localObject1).next();
      }
      catch (Exception paramList)
      {
        a.d(this.a).sendEmptyMessage(3);
        Log.e(a.c(), "update friends failed " + paramList.toString());
        return;
      }
      String str = ((UMFriend)localObject2).getFid();
      if ((!TextUtils.isEmpty(str)) && (!localHashSet.contains(str))) {}
      for (paramInt = 1;; paramInt = 0)
      {
        if (paramInt == 0) {
          break label278;
        }
        ((UMFriend)localObject2).setAlive(false);
        paramList.add(localObject2);
        Log.c(a.c(), "unlive " + ((UMFriend)localObject2).getName());
        break;
        a.d(this.a).sendEmptyMessage(3);
        o.a(a.f(this.a), paramInt, null);
        return;
      }
    }
  }
  
  public void onStart()
  {
    a.d(this.a).sendEmptyMessage(1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\controller\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */