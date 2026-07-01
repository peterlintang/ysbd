package com.ireadercity.b2.ui;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.ireadercity.b2.bean.g;
import com.ireadercity.b2.bean.i;

final class eq
  implements SeekBar.OnSeekBarChangeListener
{
  eq(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    SetReaderActivity.c().k(paramInt + 100);
    g.a(this.a.c, SetReaderActivity.c());
    SetReaderActivity.b(this.a).setLineSpacing(0.0F, g.i);
    SetReaderActivity.e(this.a).setText(paramInt + 100 + "%");
    SetReaderActivity.a(this.a, 2);
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\eq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */