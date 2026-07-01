package com.ireadercity.b2.ui;

import com.ireadercity.b2.a.r;

final class q
  implements Runnable
{
  q(AIReaderActivity paramAIReaderActivity) {}
  
  public final void run()
  {
    new StringBuilder("notifyBookListChanged------------------------------------------------------------->").append(this.a.b).toString();
    if (this.a.b <= 0)
    {
      AIReaderActivity.p(this.a);
      this.a.a(false);
    }
    while (AIReaderActivity.j(this.a) == null) {
      return;
    }
    AIReaderActivity.f(this.a).a(AIReaderActivity.j(this.a));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */