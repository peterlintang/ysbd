package com.taobao.munion.p4p.statistics.model;

import android.os.Bundle;

public class d
{
  public String a = "";
  public String b = "";
  public int c = 255;
  public int d = -1;
  public int e = -1;
  public float f = 0.0F;
  public double g = 0.0D;
  public double h = 0.0D;
  
  public void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      if (paramBundle.getString("psid") != null) {
        break label127;
      }
      str = this.a;
      this.a = str;
      if (paramBundle.getString("tab_sid") != null) {
        break label137;
      }
    }
    label127:
    label137:
    for (String str = this.b;; str = paramBundle.getString("tab_sid"))
    {
      this.b = str;
      this.c = paramBundle.getInt("view_opacity", this.c);
      this.d = paramBundle.getInt("view_width", this.d);
      this.e = paramBundle.getInt("view_height", this.e);
      this.f = paramBundle.getFloat("view_pos_z", this.f);
      this.g = paramBundle.getDouble("longitude", this.g);
      this.h = paramBundle.getDouble("latitude", this.h);
      return;
      str = paramBundle.getString("psid");
      break;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\p4p\statistics\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */