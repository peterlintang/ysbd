package com.umeng.socialize.view;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.umeng.socialize.bean.UMLocation;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.m;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.media.BaseMediaObject;
import com.umeng.socialize.media.UMRichMedia;
import com.umeng.socialize.media.UMediaObject.MediaType;
import com.umeng.socom.Log;

class bl
  implements View.OnClickListener
{
  bl(ShareActivity paramShareActivity) {}
  
  private void a()
  {
    UMShareMsg localUMShareMsg = new UMShareMsg();
    localUMShareMsg.text = ShareActivity.g(this.a).getText().toString();
    Object localObject = this.a.getImageBytes();
    if (localObject != null) {
      localUMShareMsg.setMediaData(new UMRichMedia((byte[])localObject, UMediaObject.MediaType.IMAGE));
    }
    for (;;)
    {
      localUMShareMsg.location = UMLocation.build(ShareActivity.r(this.a));
      ShareActivity.n(this.a).postShare(ShareActivity.m(this.a), ShareActivity.d(this.a), localUMShareMsg, ShareActivity.s(this.a));
      return;
      try
      {
        localObject = UMRichMedia.toUMRichMedia((BaseMediaObject)ShareActivity.j(this.a));
        if (localObject != null) {
          localUMShareMsg.setMediaData((UMRichMedia)localObject);
        }
      }
      catch (Exception localException)
      {
        Log.e(ShareActivity.c(), "can`t set media.", localException);
      }
    }
  }
  
  public void onClick(View paramView)
  {
    if ((com.umeng.socom.b.a(this.a, "android.permission.ACCESS_NETWORK_STATE")) && (!com.umeng.socom.b.m(this.a)))
    {
      Toast.makeText(this.a, this.a.getResources().getString(com.umeng.socialize.common.b.a(this.a, b.a.e, "umeng_socialize_network_break_alert")), 1).show();
      return;
    }
    paramView = ShareActivity.g(this.a).getText().toString();
    if ((TextUtils.isEmpty(paramView.trim())) && (ShareActivity.j(this.a) == null))
    {
      Toast.makeText(this.a, "输入内容为空...", 0).show();
      return;
    }
    if (m.c(paramView) > 140)
    {
      Toast.makeText(this.a, "输入内容超过140个字.", 0).show();
      return;
    }
    if (ShareActivity.q(this.a))
    {
      Toast.makeText(ShareActivity.m(this.a), "超出最大字数限制....", 0).show();
      return;
    }
    a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */