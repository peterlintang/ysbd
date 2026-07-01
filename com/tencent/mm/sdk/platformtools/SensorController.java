package com.tencent.mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

public class SensorController
  extends BroadcastReceiver
  implements SensorEventListener
{
  private static float a = 4.2949673E9F;
  private static float c = 0.5F;
  private float b;
  private n d;
  private boolean e;
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.HEADSET_PLUG"))
    {
      int i = paramIntent.getIntExtra("state", 0);
      if (i == 1) {
        this.e = true;
      }
      if (i == 0) {
        this.e = false;
      }
    }
  }
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (this.e) {
      return;
    }
    float f = paramSensorEvent.values[0];
    switch (paramSensorEvent.sensor.getType())
    {
    default: 
      return;
    }
    if (f < a)
    {
      a = f;
      c = 0.5F + f;
    }
    if ((this.b >= c) && (f < c)) {
      if (this.d != null) {
        c.d("MicroMsg.SensorController", "sensor event false");
      }
    }
    for (paramSensorEvent = this.d;; paramSensorEvent = this.d)
    {
      do
      {
        this.b = f;
        return;
      } while ((this.b > c) || (f <= c) || (this.d == null));
      c.d("MicroMsg.SensorController", "sensor event true");
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\SensorController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */