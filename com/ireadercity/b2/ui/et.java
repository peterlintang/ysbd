package com.ireadercity.b2.ui;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.ireadercity.b2.bean.i;

final class et
  implements CompoundButton.OnCheckedChangeListener
{
  et(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      SetReaderActivity.h(this.a).setEnabled(true);
      SetReaderActivity.i(this.a).setEnabled(true);
      SetReaderActivity.c().o(1);
    }
    for (;;)
    {
      this.a.a();
      SetReaderActivity.a(this.a, 2);
      return;
      SetReaderActivity.h(this.a).setEnabled(false);
      SetReaderActivity.i(this.a).setEnabled(false);
      SetReaderActivity.c().o(0);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\et.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */