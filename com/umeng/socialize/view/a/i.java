package com.umeng.socialize.view.a;

import android.view.View;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.o;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;

class i
  implements SocializeListeners.SocializeClientListener
{
  i(h paramh, SocializeListeners.SocializeClientListener[] paramArrayOfSocializeClientListener) {}
  
  public void onComplete(int paramInt, SocializeEntity paramSocializeEntity)
  {
    int i = 0;
    SocializeListeners.SocializeClientListener[] arrayOfSocializeClientListener;
    int j;
    if ((paramInt == 200) && (paramSocializeEntity != null))
    {
      this.a.onViewUpdate();
      h.c(this.a).setClickable(true);
      h.a(this.a).setVisibility(8);
      h.b(this.a).setVisibility(0);
      if (this.b != null)
      {
        arrayOfSocializeClientListener = this.b;
        j = arrayOfSocializeClientListener.length;
      }
    }
    for (;;)
    {
      if (i >= j)
      {
        return;
        o.a(this.a.getContext(), paramInt, "失败了，请重试.");
        break;
      }
      arrayOfSocializeClientListener[i].onComplete(paramInt, paramSocializeEntity);
      i += 1;
    }
  }
  
  public void onStart()
  {
    int i = 0;
    h.a(this.a).setVisibility(0);
    h.b(this.a).setVisibility(8);
    h.c(this.a).setClickable(false);
    SocializeListeners.SocializeClientListener[] arrayOfSocializeClientListener;
    int j;
    if (this.b != null)
    {
      arrayOfSocializeClientListener = this.b;
      j = arrayOfSocializeClientListener.length;
    }
    for (;;)
    {
      if (i >= j) {
        return;
      }
      arrayOfSocializeClientListener[i].onStart();
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */