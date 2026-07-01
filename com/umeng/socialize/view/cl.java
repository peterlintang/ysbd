package com.umeng.socialize.view;

import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.RelativeLayout;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.m;
import com.umeng.socialize.view.a.ag;
import com.umeng.socialize.view.controller.d;

public class cl
  extends Dialog
{
  private Context a;
  private View b;
  private RelativeLayout c;
  private String d;
  private int e;
  
  public cl(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, b.a(paramContext, b.a.d, "umeng_socialize_popup_dialog"));
    this.a = paramContext;
    this.d = paramString;
    this.e = paramInt;
    this.c = new RelativeLayout(paramContext);
    paramString = new ViewGroup.LayoutParams(-1, -1);
    this.c.setLayoutParams(paramString);
    setContentView(this.c);
    paramString = getWindow().getAttributes();
    if (m.d(paramContext))
    {
      paramContext = m.c(paramContext);
      paramString.width = paramContext[0];
      paramString.height = paramContext[1];
    }
    for (paramInt = b.a(getContext(), b.a.d, "umeng_socialize_dialog_anim_fade");; paramInt = b.a(getContext(), b.a.d, "umeng_socialize_dialog_animations"))
    {
      getWindow().getAttributes().windowAnimations = paramInt;
      getWindow().setAttributes(paramString);
      return;
      paramString.height = -1;
      paramString.width = -1;
    }
  }
  
  public void dismiss()
  {
    if (this.b.getVisibility() == 0) {
      return;
    }
    super.dismiss();
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (this.b.getVisibility() == 0)) {
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void show()
  {
    if (this.c.getChildCount() > 0) {
      this.c.removeAllViews();
    }
    Object localObject = new d(this.a, this.d);
    localObject = new ag(this.a, (d)localObject, this.e);
    this.b = ((ag)localObject).a;
    this.c.addView((View)localObject, new ViewGroup.LayoutParams(-1, -1));
    ((ag)localObject).a(new cm(this));
    ((ag)localObject).a();
    super.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */