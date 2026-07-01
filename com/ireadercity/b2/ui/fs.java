package com.ireadercity.b2.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class fs
  implements View.OnClickListener
{
  fs(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent(this.a, SetReaderActivity.class);
    paramView.putExtra("src", 1);
    this.a.startActivityForResult(paramView, 1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */