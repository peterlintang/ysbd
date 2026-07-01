package com.ireadercity.b2.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class br
  implements View.OnClickListener
{
  br(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onClick(View paramView)
  {
    this.a.setResult(10086, new Intent().putExtra("lastSrc", BookReadingActivityNew.m(this.a)));
    com.ireadercity.b2.a.ar = true;
    this.a.finish();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */