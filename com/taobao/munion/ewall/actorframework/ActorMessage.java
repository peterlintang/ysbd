package com.taobao.munion.ewall.actorframework;

public abstract interface ActorMessage
{
  public abstract Object getData();
  
  public abstract Actor getSource();
  
  public abstract String getSubject();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\ActorMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */