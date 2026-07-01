package com.umeng.socialize.view.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.socialize.bean.SnsAccount;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socom.net.p;

public abstract class at$a
{
  public View a;
  private Context b;
  private ImageView c;
  private TextView d;
  private TextView e;
  
  public at$a(Context paramContext, n paramn)
  {
    this.b = paramContext;
    b();
    a(paramn);
  }
  
  private void b()
  {
    this.a = View.inflate(this.b, b.a(this.b, b.a.a, "umeng_socialize_full_alert_dialog_item"), null);
    this.c = ((ImageView)this.a.findViewById(b.a(this.b, b.a.b, "umeng_socialize_full_alert_dialog_item_icon")));
    this.d = ((TextView)this.a.findViewById(b.a(this.b, b.a.b, "umeng_socialize_full_alert_dialog_item_text")));
    this.e = ((TextView)this.a.findViewById(b.a(this.b, b.a.b, "umeng_socialize_full_alert_dialog_item_status")));
    this.a.setOnClickListener(new au(this));
  }
  
  public abstract void a();
  
  public void a(n paramn)
  {
    int i = b.a(this.b, b.a.c, "umeng_socialize_default_avatar");
    if ((paramn != null) && (paramn.f))
    {
      SnsAccount localSnsAccount = paramn.h;
      if (localSnsAccount != null) {
        if (!TextUtils.isEmpty(localSnsAccount.getAccount_icon_url()))
        {
          p.a(this.b, this.c, localSnsAccount.getAccount_icon_url(), false, null, null, SocializeConstants.ROUNDER_ICON);
          this.d.setText(localSnsAccount.getUserName());
        }
      }
      for (;;)
      {
        this.e.setText(paramn.b);
        return;
        this.c.setImageResource(i);
        break;
        this.d.setText("");
        this.c.setImageResource(i);
      }
    }
    this.c.setImageResource(i);
    this.d.setText("匿名评论");
    this.e.setText("");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\at$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */