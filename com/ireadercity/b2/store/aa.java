package com.ireadercity.b2.store;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.bean.NetBookInfo;
import com.ireadercity.b2.ui.BookCommentActivity;

final class aa
  implements View.OnClickListener
{
  aa(CloudStoreBookDetailActivity paramCloudStoreBookDetailActivity, NetBookInfo paramNetBookInfo) {}
  
  public final void onClick(View paramView)
  {
    if (this.a == null) {}
    do
    {
      return;
      paramView = this.a.d();
    } while (paramView == null);
    Intent localIntent = new Intent(this.b, BookCommentActivity.class);
    localIntent.putExtra("storeBookId", paramView);
    localIntent.putExtra("storeBookName", this.a.e());
    this.b.startActivity(localIntent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */