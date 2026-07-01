package com.taobao.munion.ewall.actorframework;

import android.os.Process;

class PriorityThreadFactory$1
  extends Thread
{
  PriorityThreadFactory$1(PriorityThreadFactory paramPriorityThreadFactory, Runnable paramRunnable, String paramString)
  {
    super(paramRunnable, paramString);
  }
  
  public void run()
  {
    Process.setThreadPriority(PriorityThreadFactory.access$000(this.this$0));
    super.run();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\PriorityThreadFactory$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */