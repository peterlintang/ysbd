package com.taobao.munion.ewall.actorframework;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class PriorityThreadFactory
  implements ThreadFactory
{
  private final String mName;
  private final AtomicInteger mNumber = new AtomicInteger();
  private final int mPriority;
  
  public PriorityThreadFactory(String paramString, int paramInt)
  {
    this.mName = paramString;
    this.mPriority = paramInt;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    return new PriorityThreadFactory.1(this, paramRunnable, this.mName + '-' + this.mNumber.getAndIncrement());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\PriorityThreadFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */