package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

final class dk
  implements View.OnClickListener
{
  dk(dj paramdj) {}
  
  public final void onClick(View paramView)
  {
    new StringBuilder("OnClickListener=getWidth=").append(paramView.getWidth()).toString();
    if (!BookReadingActivityNew.z(this.a.b))
    {
      BookReadingActivityNew.y(this.a.b).performLongClick();
      BookReadingActivityNew.A(this.a.b);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */