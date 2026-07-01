package com.taobao.munion.ewall.actorframework;

public abstract interface Actor
  extends Runnable
{
  public abstract void activate();
  
  public abstract void deactivate();
  
  public abstract String getName();
  
  public abstract boolean isShutdown();
  
  public abstract boolean isSuspended();
  
  public abstract void setName(String paramString);
  
  public abstract void setSuspended(boolean paramBoolean);
  
  public abstract void shutdown();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\Actor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */