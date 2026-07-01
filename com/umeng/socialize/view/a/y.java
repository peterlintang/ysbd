package com.umeng.socialize.view.a;

import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;

public class y
  extends Dialog
{
  private RelativeLayout a;
  private View b;
  private y.c c;
  
  public y(Context paramContext, View paramView, int[] paramArrayOfInt)
  {
    super(paramContext, b.a(paramContext, b.a.d, "umeng_socialize_popup_dialog"));
    this.a = new RelativeLayout(paramContext);
    this.a.setBackgroundDrawable(null);
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    this.a.setLayoutParams(localLayoutParams);
    paramView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    this.a.addView(paramView);
    this.b = View.inflate(paramContext, b.a(paramContext, b.a.a, "umeng_socialize_full_curtain"), null);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    this.a.addView(this.b, paramContext);
    this.b.setClickable(false);
    this.b.setOnTouchListener(new z(this));
    setContentView(this.a);
    paramContext = getWindow().getAttributes();
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length < 2))
    {
      paramContext.height = -1;
      paramContext.width = -1;
    }
    for (int i = b.a(getContext(), b.a.d, "umeng_socialize_dialog_animations");; i = b.a(getContext(), b.a.d, "umeng_socialize_dialog_anim_fade"))
    {
      getWindow().getAttributes().windowAnimations = i;
      getWindow().setAttributes(paramContext);
      c();
      return;
      paramContext.width = paramArrayOfInt[0];
      paramContext.height = paramArrayOfInt[1];
    }
  }
  
  public y.c a()
  {
    return this.c;
  }
  
  public void a(y.c paramc)
  {
    this.c = paramc;
  }
  
  public void b()
  {
    this.b.setVisibility(0);
  }
  
  public void c()
  {
    this.b.setVisibility(4);
  }
  
  public void dismiss()
  {
    if (this.b.getVisibility() == 0) {
      return;
    }
    if (this.c != null) {
      this.c.b();
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
    if (this.c != null) {
      this.c.a();
    }
    super.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */