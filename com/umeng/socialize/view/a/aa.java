package com.umeng.socialize.view.a;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;

public class aa
  extends Dialog
{
  private aa.b a;
  
  public aa(Context paramContext, View paramView)
  {
    super(paramContext, b.a(paramContext, b.a.d, "umeng_socialize_popup_dialog_anim"));
    paramContext = new RelativeLayout(paramContext);
    paramContext.setBackgroundDrawable(null);
    paramContext.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(12);
    paramView.setLayoutParams(localLayoutParams);
    paramContext.addView(paramView);
    setContentView(paramContext);
  }
  
  public aa.b a()
  {
    return this.a;
  }
  
  public void a(aa.b paramb)
  {
    this.a = paramb;
  }
  
  public void dismiss()
  {
    if (this.a != null) {
      this.a.b();
    }
    super.dismiss();
  }
  
  public void show()
  {
    if (this.a != null) {
      this.a.a();
    }
    super.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */