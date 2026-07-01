package com.ireadercity.b2.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.ireadercity.b2.h.w;

final class n
  implements View.OnClickListener
{
  n(AIReaderActivity paramAIReaderActivity) {}
  
  public final void onClick(View paramView)
  {
    w.d();
    int i = ((Integer)paramView.getTag()).intValue();
    new StringBuilder("     clicked ").append(i).toString();
    switch (i)
    {
    default: 
      return;
    case 0: 
      paramView = new Intent(AIReaderActivity.a, SyncCloudInfoActivity.class);
      paramView.putExtra("src", 0);
      AIReaderActivity.a.startActivity(paramView);
      return;
    case 1: 
      this.a.a(null, 0);
      AIReaderActivity.c(this.a);
      return;
    case 2: 
      if (AIReaderActivity.d(this.a).getVisibility() != 0)
      {
        AIReaderActivity.d(this.a).setVisibility(0);
        return;
      }
      AIReaderActivity.d(this.a).setVisibility(8);
      return;
    case 3: 
      paramView = new Intent(AIReaderActivity.a, AboutUsActivity.class);
      AIReaderActivity.a.startActivity(paramView);
      return;
    case 4: 
      paramView = new Intent(AIReaderActivity.a, SynchronizeLocalBooksActivity.class);
      AIReaderActivity.a.startActivity(paramView);
      return;
    case 5: 
      this.a.e();
      AIReaderActivity.c(this.a);
      return;
    }
    AIReaderActivity.e(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */