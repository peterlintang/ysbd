package com.ireadercity.b2.a;

import android.app.Activity;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.e.a;

final class t
  implements CompoundButton.OnCheckedChangeListener
{
  t(r paramr) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    paramCompoundButton = (b)paramCompoundButton.getTag();
    a.a(r.b(this.a).getApplicationContext()).a(paramCompoundButton.i(), paramBoolean);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */