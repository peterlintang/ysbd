package com.ireadercity.b2.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class ak
  implements View.OnClickListener
{
  ak(AIReaderActivity paramAIReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent(AIReaderActivity.a, SetReaderActivity.class);
    paramView.putExtra("src", 0);
    AIReaderActivity.a.startActivity(paramView);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */