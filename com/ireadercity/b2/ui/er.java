package com.ireadercity.b2.ui;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.ireadercity.b2.bean.i;

final class er
  implements SeekBar.OnSeekBarChangeListener
{
  er(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    SetReaderActivity.b(this.a, Math.round((paramInt + 8) * SetReaderActivity.f(this.a)));
    SetReaderActivity.c().f(SetReaderActivity.g(this.a));
    new StringBuilder("mid_fontSize+8=").append(SetReaderActivity.g(this.a) + 8).append(" fontScale=").append(SetReaderActivity.f(this.a)).append(" progress=").append(paramInt).toString();
    SetReaderActivity.a(this.a, 2);
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    this.a.a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */