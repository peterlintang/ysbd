package com.taobao.munion.ewall.actorframework;

import com.taobao.munion.utils.k;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DefaultActorManager
  implements ActorManager
{
  public static final String ACTOR_THREAD_COUNT = "threadCount";
  private static final int CORE_POOL_MAX_SIZE = 5;
  private static final int CORE_POOL_SIZE = 5;
  private static final int KEEP_ALIVE_TIME = 10;
  protected static DefaultActorManager instance;
  private boolean initialized;
  BlockingQueue<Runnable> mActorQueue = new LinkedBlockingQueue();
  private ThreadPoolExecutor mExecutor;
  protected int maxTrendValue = 10;
  protected int trendValue = 0;
  
  public static DefaultActorManager getInstance()
  {
    if (instance == null)
    {
      DefaultActorManager localDefaultActorManager = new DefaultActorManager();
      instance = localDefaultActorManager;
      localDefaultActorManager.initialize();
    }
    return instance;
  }
  
  public void detachAllActors()
  {
    Iterator localIterator = this.mActorQueue.iterator();
    while (localIterator.hasNext()) {
      stopActor((Actor)localIterator.next());
    }
    this.mActorQueue.clear();
  }
  
  public int getMaxTrendValue()
  {
    return this.maxTrendValue;
  }
  
  public int getTrendValue()
  {
    return this.trendValue;
  }
  
  public void initialize()
  {
    initialize(null);
  }
  
  public void initialize(Map<String, Object> paramMap)
  {
    if (!this.initialized)
    {
      this.initialized = true;
      this.mExecutor = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, this.mActorQueue, new PriorityThreadFactory("actor_thread", 0), new DefaultActorManager.1(this));
    }
  }
  
  public void setMaxTrendValue(int paramInt)
  {
    this.maxTrendValue = paramInt;
  }
  
  public void setTrendValue(int paramInt)
  {
    this.trendValue = paramInt;
  }
  
  public void startActor(Actor paramActor)
  {
    ((AbstractActor)paramActor).setManager(this);
    ((AbstractActor)paramActor).shutdown = false;
    paramActor.activate();
    this.mExecutor.execute(paramActor);
  }
  
  public void stopActor(Actor paramActor)
  {
    if (paramActor != null)
    {
      if (((AbstractActor)paramActor).getManager() != this) {
        throw new IllegalStateException("actor not owned by this manager");
      }
      this.mActorQueue.remove(paramActor);
      paramActor.deactivate();
      k.a("stop actor");
    }
  }
  
  public void terminate()
  {
    k.a("terminate");
    detachAllActors();
    this.mExecutor.shutdown();
    this.mActorQueue.clear();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\DefaultActorManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */