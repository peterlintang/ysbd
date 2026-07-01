package com.umeng.newxp.view;

import android.graphics.drawable.Drawable;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.net.g.b;
import com.umeng.common.ufp.net.g.c;
import com.umeng.newxp.Promoter;
import java.util.Map;

class UMDetail$7
  implements g.c
{
  UMDetail$7(UMDetail paramUMDetail, String paramString) {}
  
  public void a(Drawable paramDrawable)
  {
    this.b.n.put(this.a, paramDrawable);
    Log.a(UMDetail.a(), "Loaded drawable[" + this.a + "]");
    if (this.b.n.size() == this.b.e.imgs.length)
    {
      this.b.o = this.b.filterBadIMG();
      this.b.showStrip(this.b.o);
    }
  }
  
  public void a(g.b paramb) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\UMDetail$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */