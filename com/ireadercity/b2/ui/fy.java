package com.ireadercity.b2.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.c.a;

final class fy
  implements DialogInterface.OnClickListener
{
  fy(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown, String paramString1, String paramString2) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = ShowContentScrollUpAndDown.u(this.c).j();
    a locala = a.a(this.c.getApplicationContext());
    if (this.a == null) {}
    for (paramDialogInterface = ShowContentScrollUpAndDown.v(this.c).getText() + this.b; locala.a(str, ShowContentScrollUpAndDown.d(), ShowContentScrollUpAndDown.o(this.c)); paramDialogInterface = this.a + this.b)
    {
      this.c.d("书签已经存在");
      return;
    }
    if (locala.a(paramDialogInterface, ShowContentScrollUpAndDown.o(this.c), str, ShowContentScrollUpAndDown.d()))
    {
      this.c.d("添加成功");
      return;
    }
    this.c.d("添加失败");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */