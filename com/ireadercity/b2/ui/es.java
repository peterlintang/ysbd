package com.ireadercity.b2.ui;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.ireadercity.b2.bean.i;

final class es
  implements CompoundButton.OnCheckedChangeListener
{
  es(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    SetReaderActivity.a(this.a, 2);
    if (paramBoolean) {
      SetReaderActivity.c().g(1);
    }
    for (;;)
    {
      this.a.a();
      return;
      SetReaderActivity.c().g(0);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\es.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */