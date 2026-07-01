package com.ireadercity.b2.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class fn
  implements View.OnClickListener
{
  fn(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown) {}
  
  public final void onClick(View paramView)
  {
    com.ireadercity.b2.a.ar = true;
    this.a.setResult(10086, new Intent().putExtra("lastSrc", ShowContentScrollUpAndDown.p(this.a)));
    this.a.finish();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */