package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.bean.i;

final class fl
  implements View.OnClickListener
{
  fl(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    int i = 0;
    boolean bool2 = ((Boolean)paramView.getTag()).booleanValue();
    SetReaderActivity localSetReaderActivity = this.a;
    boolean bool1;
    if (!bool2)
    {
      bool1 = true;
      localSetReaderActivity.c(bool1);
      if (bool2) {
        break label75;
      }
      bool1 = true;
      label40:
      paramView.setTag(Boolean.valueOf(bool1));
      if (!bool2) {
        break label80;
      }
    }
    for (;;)
    {
      SetReaderActivity.c().m(i);
      SetReaderActivity.a(this.a, 1);
      return;
      bool1 = false;
      break;
      label75:
      bool1 = false;
      break label40;
      label80:
      i = 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */