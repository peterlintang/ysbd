package com.umeng.newxp.view.templates;

import android.widget.ImageView;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.net.ReportResponse.STATUS;
import com.umeng.common.ufp.net.g.a;
import com.umeng.common.ufp.net.g.b;
import com.umeng.newxp.common.ExchangeConstants;

class FImageView$2
  implements g.a
{
  FImageView$2(FImageView paramFImageView, ImageView paramImageView) {}
  
  public void a(ReportResponse.STATUS paramSTATUS)
  {
    if (paramSTATUS == ReportResponse.STATUS.SUCCESS)
    {
      FImageView.a(this.b, true);
      FImageView.a(this.b, this.a.getDrawable());
      Log.c(ExchangeConstants.LOG_TAG, "FImageView readyflag=" + FImageView.c(this.b));
    }
    if (FImageView.b(this.b) != null) {
      FImageView.b(this.b).a(paramSTATUS);
    }
  }
  
  public void a(g.b paramb)
  {
    if (FImageView.b(this.b) != null) {
      FImageView.b(this.b).a(paramb);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\FImageView$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */