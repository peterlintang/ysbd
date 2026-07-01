package com.ireadercity.b2.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.c.a;
import java.text.DecimalFormat;

final class cg
  implements DialogInterface.OnClickListener
{
  cg(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = BookReadingActivityNew.l(this.a).j();
    new DecimalFormat("0");
    BookReadingActivityNew.a(this.a, a.a(this.a.getApplicationContext()));
    new StringBuilder("chapterIndexSpine=").append(BookReadingActivityNew.l()).append(" chapterIndex=").append(BookReadingActivityNew.k()).append(" markProgress=").append(BookReadingActivityNew.s(this.a)).toString();
    if (BookReadingActivityNew.C(this.a).a(paramDialogInterface, BookReadingActivityNew.l(), BookReadingActivityNew.s(this.a)))
    {
      this.a.c("书签已经存在");
      return;
    }
    if (BookReadingActivityNew.C(this.a).a(BookReadingActivityNew.D(this.a).getText().toString(), BookReadingActivityNew.s(this.a), paramDialogInterface, BookReadingActivityNew.l()))
    {
      this.a.c("添加成功");
      return;
    }
    this.a.c("添加失败");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */