package com.umeng.socialize.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.ImageView;

class bp
  implements DialogInterface.OnClickListener
{
  bp(ShareActivity paramShareActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.setImageBytes(null);
    ShareActivity.a(this.a, null);
    this.a.a.setImageDrawable(null);
    this.a.a.setVisibility(8);
    ShareActivity.k(this.a).setVisibility(8);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */