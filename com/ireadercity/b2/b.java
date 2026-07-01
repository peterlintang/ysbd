package com.ireadercity.b2;

final class b
  extends Thread
{
  public final void run()
  {
    System.gc();
    new StringBuilder().append(getId()).append("Macro.GC DONE").toString();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */