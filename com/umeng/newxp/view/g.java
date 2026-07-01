package com.umeng.newxp.view;

import android.app.Dialog;
import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.umeng.newxp.a.d;
import com.umeng.newxp.view.widget.SwipeView;

public class g
  extends Dialog
{
  private static boolean a = false;
  View b;
  Context c;
  SwipeView d;
  e e;
  
  public g(Context paramContext, e parame)
  {
    super(paramContext, 16973840);
    Object localObject = getWindow().getAttributes();
    ((WindowManager.LayoutParams)localObject).height = -1;
    ((WindowManager.LayoutParams)localObject).width = -1;
    ((WindowManager.LayoutParams)localObject).gravity = 17;
    getWindow().setAttributes((WindowManager.LayoutParams)localObject);
    this.e = parame;
    this.c = paramContext;
    this.b = LayoutInflater.from(paramContext).inflate(d.r(this.c), null);
    this.d = ((SwipeView)this.b.findViewById(com.umeng.newxp.a.c.U(this.c)));
    paramContext = ((WindowManager)this.c.getSystemService("window")).getDefaultDisplay();
    parame = new g.1(this);
    int i = 0;
    while (i < this.e.a())
    {
      localObject = this.e.a(this.c, paramContext.getWidth(), paramContext.getHeight(), i);
      this.d.addView((View)localObject);
      ((View)localObject).setOnClickListener(parame);
      i += 1;
    }
    getWindow().setContentView(this.b, new ViewGroup.LayoutParams(-1, -1));
    getWindow().getAttributes().windowAnimations = com.umeng.common.ufp.c.a(this.c).i("umeng_xp_dialog_animations");
  }
  
  public void a(int paramInt)
  {
    if (!a)
    {
      this.d.scrollToPage(paramInt);
      a = true;
      super.show();
    }
  }
  
  public void dismiss()
  {
    super.dismiss();
    a = false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */