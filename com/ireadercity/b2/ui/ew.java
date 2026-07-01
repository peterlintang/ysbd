package com.ireadercity.b2.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class ew
  implements View.OnClickListener
{
  ew(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent();
    paramView.setType("image/*");
    paramView.setAction("android.intent.action.GET_CONTENT");
    paramView.addCategory("android.intent.category.OPENABLE");
    paramView.addFlags(67108864);
    this.a.startActivityForResult(paramView, this.a.b);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */