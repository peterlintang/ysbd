package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.h.u;

final class fk
  implements View.OnClickListener
{
  fk(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    boolean bool2 = true;
    boolean bool3 = ((Boolean)paramView.getTag()).booleanValue();
    SetReaderActivity localSetReaderActivity = this.a;
    if (!bool3)
    {
      bool1 = true;
      localSetReaderActivity.b(bool1);
      if (bool3) {
        break label85;
      }
      bool1 = true;
      label40:
      paramView.setTag(Boolean.valueOf(bool1));
      paramView = this.a.getApplicationContext();
      if (bool3) {
        break label90;
      }
      bool1 = true;
      label63:
      u.b(paramView, bool1);
      if (bool3) {
        break label95;
      }
    }
    label85:
    label90:
    label95:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      com.ireadercity.b2.a.Y = bool1;
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label40;
      bool1 = false;
      break label63;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */