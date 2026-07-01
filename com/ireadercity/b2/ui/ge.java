package com.ireadercity.b2.ui;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.ireadercity.b2.bean.i;

final class ge
  implements SeekBar.OnSeekBarChangeListener
{
  ge(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown, float paramFloat) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    int i = Math.round(this.a * 10.0F);
    paramSeekBar = this.b;
    float f = this.a;
    ShowContentScrollUpAndDown.a(paramSeekBar, Math.round((i + paramInt) * f));
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    ShowContentScrollUpAndDown.b().f(ShowContentScrollUpAndDown.n(this.b));
    ShowContentScrollUpAndDown.b().b(this.b.getApplicationContext());
    this.b.a();
    ShowContentScrollUpAndDown.a(this.b, ShowContentScrollUpAndDown.d / ShowContentScrollUpAndDown.c);
    ShowContentScrollUpAndDown.a(this.b, "setRead");
    this.b.a(ShowContentScrollUpAndDown.o(this.b));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */