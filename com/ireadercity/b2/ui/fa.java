package com.ireadercity.b2.ui;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

final class fa
  implements View.OnClickListener
{
  fa(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new AlertDialog.Builder(this.a);
    paramView.setTitle(2131230798);
    paramView.setMessage("请把你的字库文件（*.ttf）放到你的储存卡(SDCard)上的【AIReader/fonts】目录下！");
    paramView.setPositiveButton("Ok", new fb(this));
    paramView.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */