package com.taobao.munion.nineoldandroids.animation;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

class q$a
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    ArrayList localArrayList1 = (ArrayList)q.D().get();
    ArrayList localArrayList2 = (ArrayList)q.E().get();
    int i;
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      paramMessage = (ArrayList)q.F().get();
      if ((localArrayList1.size() > 0) || (localArrayList2.size() > 0)) {
        i = 0;
      }
      break;
    }
    for (;;)
    {
      int j = i;
      Object localObject;
      int k;
      q localq;
      if (paramMessage.size() > 0)
      {
        localObject = (ArrayList)paramMessage.clone();
        paramMessage.clear();
        k = ((ArrayList)localObject).size();
        j = 0;
        if (j < k)
        {
          localq = (q)((ArrayList)localObject).get(j);
          if (q.a(localq) == 0L) {
            q.b(localq);
          }
          for (;;)
          {
            j += 1;
            break;
            localArrayList2.add(localq);
          }
          j = 1;
        }
      }
      else
      {
        long l = AnimationUtils.currentAnimationTimeMillis();
        localObject = (ArrayList)q.G().get();
        paramMessage = (ArrayList)q.H().get();
        k = localArrayList2.size();
        i = 0;
        while (i < k)
        {
          localq = (q)localArrayList2.get(i);
          if (q.a(localq, l)) {
            ((ArrayList)localObject).add(localq);
          }
          i += 1;
        }
        k = ((ArrayList)localObject).size();
        if (k > 0)
        {
          i = 0;
          while (i < k)
          {
            localq = (q)((ArrayList)localObject).get(i);
            q.b(localq);
            q.a(localq, true);
            localArrayList2.remove(localq);
            i += 1;
          }
          ((ArrayList)localObject).clear();
        }
        k = localArrayList1.size();
        i = 0;
        while (i < k)
        {
          localObject = (q)localArrayList1.get(i);
          if (((q)localObject).c(l)) {
            paramMessage.add(localObject);
          }
          if (localArrayList1.size() == k)
          {
            i += 1;
          }
          else
          {
            k -= 1;
            paramMessage.remove(localObject);
          }
        }
        if (paramMessage.size() > 0)
        {
          i = 0;
          while (i < paramMessage.size())
          {
            q.c((q)paramMessage.get(i));
            i += 1;
          }
          paramMessage.clear();
        }
        if ((j == 0) || ((localArrayList1.isEmpty()) && (localArrayList2.isEmpty()))) {
          break;
        }
        sendEmptyMessageDelayed(1, Math.max(0L, q.I() - (AnimationUtils.currentAnimationTimeMillis() - l)));
        return;
        i = 1;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\q$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */