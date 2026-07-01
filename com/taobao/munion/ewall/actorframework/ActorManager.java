package com.taobao.munion.ewall.actorframework;

import java.util.Map;

public abstract interface ActorManager
{
  public abstract void initialize();
  
  public abstract void initialize(Map<String, Object> paramMap);
  
  public abstract void startActor(Actor paramActor);
  
  public abstract void stopActor(Actor paramActor);
  
  public abstract void terminate();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\ActorManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */