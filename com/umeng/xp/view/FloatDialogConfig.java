package com.umeng.xp.view;

import com.umeng.xp.controller.XpListenersCenter.FloatDialogListener;

public class FloatDialogConfig
{
  private boolean a = false;
  private long b = 6000L;
  private long c = System.currentTimeMillis();
  private int d = 30;
  private XpListenersCenter.FloatDialogListener e;
  
  public int getDelayProgress()
  {
    return this.d;
  }
  
  public XpListenersCenter.FloatDialogListener getListener()
  {
    return this.e;
  }
  
  public long getStartTime()
  {
    return this.c;
  }
  
  public long getTimeout()
  {
    return this.b;
  }
  
  public boolean isDelay()
  {
    return this.a;
  }
  
  public boolean isTimeout()
  {
    return System.currentTimeMillis() - this.c > this.b;
  }
  
  public FloatDialogConfig setDelay(boolean paramBoolean)
  {
    this.a = paramBoolean;
    return this;
  }
  
  public FloatDialogConfig setDelayProgress(int paramInt)
  {
    this.d = paramInt;
    return this;
  }
  
  public FloatDialogConfig setListener(XpListenersCenter.FloatDialogListener paramFloatDialogListener)
  {
    this.e = paramFloatDialogListener;
    return this;
  }
  
  public FloatDialogConfig setStartTime(long paramLong)
  {
    this.c = paramLong;
    return this;
  }
  
  public FloatDialogConfig setTimeout(long paramLong)
  {
    this.b = paramLong;
    return this;
  }
  
  public String toString()
  {
    return "isDelay=" + this.a + "  timeout=" + this.b + " startTime=" + this.c;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\FloatDialogConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */