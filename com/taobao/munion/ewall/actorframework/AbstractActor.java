package com.taobao.munion.ewall.actorframework;

public abstract class AbstractActor
  implements Actor
{
  protected boolean hasThread;
  protected boolean isActive;
  protected DefaultActorManager manager;
  protected String name;
  protected volatile boolean shutdown;
  protected volatile boolean suspended;
  
  public void activate()
  {
    this.isActive = true;
  }
  
  public void deactivate()
  {
    this.isActive = false;
  }
  
  public boolean getHasThread()
  {
    return this.hasThread;
  }
  
  public ActorManager getManager()
  {
    return this.manager;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public boolean isActive()
  {
    return this.isActive;
  }
  
  public boolean isShutdown()
  {
    return this.shutdown;
  }
  
  public boolean isSuspended()
  {
    return this.suspended;
  }
  
  public abstract void runBody();
  
  protected void setHasThread(boolean paramBoolean)
  {
    this.hasThread = paramBoolean;
  }
  
  public void setManager(DefaultActorManager paramDefaultActorManager)
  {
    if ((this.manager != null) && (paramDefaultActorManager != null)) {
      throw new IllegalStateException("cannot change manager of attached actor");
    }
    this.manager = paramDefaultActorManager;
  }
  
  public void setName(String paramString)
  {
    if (this.manager != null) {
      throw new IllegalStateException("cannot change name if manager set");
    }
    this.name = paramString;
  }
  
  public void setSuspended(boolean paramBoolean)
  {
    this.suspended = paramBoolean;
  }
  
  public void shutdown()
  {
    this.shutdown = true;
  }
  
  public String toString()
  {
    return getClass().getSimpleName();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\AbstractActor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */