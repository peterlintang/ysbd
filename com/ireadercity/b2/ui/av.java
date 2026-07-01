package com.ireadercity.b2.ui;

import android.os.AsyncTask;
import android.view.View;
import com.ireadercity.b2.bean.c;
import java.util.List;

final class av
  extends AsyncTask<String, c, List<c>>
{
  av(BookCommentActivity paramBookCommentActivity) {}
  
  protected final void onPreExecute()
  {
    BookCommentActivity.b(this.a).setVisibility(0);
    if ((BookCommentActivity.c(this.a) != null) && (BookCommentActivity.c(this.a).getVisibility() == 0)) {
      BookCommentActivity.c(this.a).setVisibility(8);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */