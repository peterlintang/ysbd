package com.ireadercity.b2.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.ireadercity.b2.bean.b;
import java.util.ArrayList;
import java.util.HashMap;

final class bd
  implements DialogInterface.OnClickListener
{
  bd(BookInfoActivity paramBookInfoActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((paramInt < BookInfoActivity.b(this.a).size()) && (paramInt >= 0))
    {
      paramDialogInterface = (HashMap)BookInfoActivity.b(this.a).get(paramInt);
      if (BookInfoActivity.j(this.a).t().equalsIgnoreCase("epub"))
      {
        paramInt = Integer.parseInt(paramDialogInterface.get("spine_id"));
        localHashMap = (HashMap)BookInfoActivity.j(this.a).x().get(paramInt);
        this.a.a((String)localHashMap.get("src"), BookInfoActivity.j(this.a), -1, paramInt, Float.parseFloat(paramDialogInterface.get("progress")));
      }
      while (!BookInfoActivity.j(this.a).t().equalsIgnoreCase("txt"))
      {
        HashMap localHashMap;
        return;
      }
      paramInt = Integer.parseInt(paramDialogInterface.get("spine_id"));
      BookInfoActivity.j(this.a).q().get(paramInt);
      this.a.a(null, BookInfoActivity.j(this.a), paramInt, paramInt, Float.parseFloat(paramDialogInterface.get("progress")));
      return;
    }
    this.a.a("打不开书签，可能是因为版本升级引起的！");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */