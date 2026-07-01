package com.taobao.munion.ewall.actorframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ActorBinder
{
  private Set<Actor> mActors = new HashSet();
  
  public void destroy()
  {
    Iterator localIterator = this.mActors.iterator();
    while (localIterator.hasNext())
    {
      Actor localActor = (Actor)localIterator.next();
      DefaultActorManager.getInstance().stopActor(localActor);
    }
    this.mActors.clear();
  }
  
  public void releaseActor(Actor paramActor)
  {
    this.mActors.remove(paramActor);
    DefaultActorManager.getInstance().stopActor(paramActor);
  }
  
  public void startActor(Actor paramActor)
  {
    this.mActors.add(paramActor);
    DefaultActorManager.getInstance().startActor(paramActor);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\ActorBinder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */