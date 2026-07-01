package com.taobao.munion.ewall.actorframework;

import com.taobao.munion.utils.k;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

class DefaultActorManager$1
  extends ThreadPoolExecutor.DiscardPolicy
{
  DefaultActorManager$1(DefaultActorManager paramDefaultActorManager) {}
  
  public void rejectedExecution(Runnable paramRunnable, ThreadPoolExecutor paramThreadPoolExecutor)
  {
    k.a("rejectedExecution");
    super.rejectedExecution(paramRunnable, paramThreadPoolExecutor);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\DefaultActorManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */