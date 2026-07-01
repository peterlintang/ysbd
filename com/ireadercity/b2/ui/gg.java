package com.ireadercity.b2.ui;

import android.provider.Settings.System;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.ireadercity.b2.h.t;

final class gg
  implements SeekBar.OnSeekBarChangeListener
{
  gg(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (t.a(this.a.getContentResolver())) {
        t.a(this.a);
      }
      Object localObject = Integer.valueOf(paramSeekBar.getProgress());
      paramSeekBar = (SeekBar)localObject;
      if (((Integer)localObject).intValue() == 0) {
        paramSeekBar = Integer.valueOf(1);
      }
      new StringBuilder("seekBar.getProgress()=").append(paramSeekBar).toString();
      Settings.System.putInt(this.a.getContentResolver(), "screen_brightness", paramSeekBar.intValue());
      paramSeekBar = Integer.valueOf(Settings.System.getInt(this.a.getContentResolver(), "screen_brightness", -1));
      new StringBuilder("Settings.System.getInt=").append(paramSeekBar).toString();
      localObject = this.a.getWindow().getAttributes();
      if ((1 <= paramSeekBar.intValue()) && (paramSeekBar.intValue() <= 255))
      {
        ((WindowManager.LayoutParams)localObject).screenBrightness = (Float.valueOf(paramSeekBar.intValue()).floatValue() / 255.0F);
        this.a.getWindow().setAttributes((WindowManager.LayoutParams)localObject);
      }
    }
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\gg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */