package com.taobao.munion.animationadapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.taobao.munion.utils.k;

class b$4
  implements View.OnClickListener
{
  b$4(b paramb, int paramInt) {}
  
  public void onClick(View paramView)
  {
    k.a("position =  " + this.a + "==============================");
    b.a(this.b).deleteItem(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\animationadapter\b$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */