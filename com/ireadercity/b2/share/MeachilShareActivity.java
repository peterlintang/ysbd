package com.ireadercity.b2.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.sdk.openapi.WXAppExtendObject;
import com.tencent.mm.sdk.openapi.WXMediaMessage;
import com.tencent.mm.sdk.openapi.WXTextObject;
import com.tencent.mm.sdk.openapi.f;
import com.tencent.mm.sdk.openapi.j;
import com.tencent.mm.sdk.openapi.m;
import com.tencent.mm.sdk.openapi.n;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMInfoAgent;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import java.util.ArrayList;

public class MeachilShareActivity
  extends Activity
  implements View.OnClickListener, AdapterView.OnItemClickListener, f
{
  private static String q = "wx60d975582197b3d8";
  private static String r = "我觉得《书香云集》这款阅读软件还不错，分享给你。链接地址：https://www.ireadercity.com/Default.aspx";
  String a = com.ireadercity.b2.a.l + "/.remembers/QZONE.txt";
  String b = com.ireadercity.b2.a.l + "/.remembers/SINA.txt";
  String c = com.ireadercity.b2.a.l + "/.remembers/TENCENT.txt";
  ImageButton d;
  ListView e;
  RelativeLayout f;
  TextView g;
  TextView h;
  EditText i;
  Button j;
  public com.tencent.mm.sdk.openapi.e k;
  UMSocialService l;
  SHARE_MEDIA m = SHARE_MEDIA.SINA;
  Context n;
  ArrayList<e> o;
  c p;
  
  private void a()
  {
    String str1 = com.ireadercity.b2.b.q.b(this.a);
    String str2 = com.ireadercity.b2.b.q.b(this.b);
    String str3 = com.ireadercity.b2.b.q.b(this.c);
    if ("100".equals(str1))
    {
      ((e)this.o.get(0)).a(true);
      if (!"100".equals(str2)) {
        break label133;
      }
      ((e)this.o.get(1)).a(true);
      label72:
      if (!"100".equals(str3)) {
        break label151;
      }
      ((e)this.o.get(2)).a(true);
    }
    for (;;)
    {
      if (this.e != null) {
        this.e.setAdapter(this.p);
      }
      return;
      ((e)this.o.get(0)).a(false);
      break;
      label133:
      ((e)this.o.get(1)).a(false);
      break label72;
      label151:
      ((e)this.o.get(2)).a(false);
    }
  }
  
  private void a(String paramString)
  {
    if (UMInfoAgent.isOauthed(this.n, this.m))
    {
      a(paramString, this.m);
      return;
    }
    this.l.doOauthVerify(this.n, this.m, new a(this, paramString));
  }
  
  private void a(String paramString, SHARE_MEDIA paramSHARE_MEDIA)
  {
    UMShareMsg localUMShareMsg = new UMShareMsg();
    localUMShareMsg.text = paramString;
    this.l.postShare(this.n, paramSHARE_MEDIA, localUMShareMsg, new b(this));
  }
  
  private void a(boolean paramBoolean)
  {
    int i1 = 0;
    this.k.a(q);
    if (!this.k.a())
    {
      Toast.makeText(this.n, "你还没有安装微信", 0).show();
      return;
    }
    if (!this.k.b())
    {
      Toast.makeText(this.n, "你安装的微信版本不支持当前API", 0).show();
      return;
    }
    Object localObject1 = this.k;
    Object localObject2 = r;
    Object localObject3 = new WXTextObject();
    ((WXTextObject)localObject3).text = r;
    localObject2 = new WXMediaMessage();
    ((WXMediaMessage)localObject2).mediaObject = ((com.tencent.mm.sdk.openapi.q)localObject3);
    ((WXMediaMessage)localObject2).description = r;
    localObject3 = new j();
    ((j)localObject3).a = String.valueOf(System.currentTimeMillis());
    ((j)localObject3).b = ((WXMediaMessage)localObject2);
    if (paramBoolean) {
      i1 = 1;
    }
    ((j)localObject3).c = i1;
    if (((com.tencent.mm.sdk.openapi.e)localObject1).a((com.tencent.mm.sdk.openapi.a)localObject3))
    {
      localObject1 = UMServiceFactory.getUMSocialService("umeng_activitybar", RequestType.ANALYTICS);
      localObject2 = new UMShareMsg();
      ((UMShareMsg)localObject2).text = r;
      ((UMSocialService)localObject1).postShareByCustomPlatform(this.n, null, "wxsession", (UMShareMsg)localObject2, null);
    }
    finish();
  }
  
  public final void a(com.tencent.mm.sdk.openapi.a parama)
  {
    switch (parama.a())
    {
    default: 
      return;
    case 3: 
      parama = new Intent(this, MeachilShareActivity.class);
      parama.putExtras(getIntent());
      startActivity(parama);
      finish();
      return;
    }
    parama = ((m)parama).b;
    Object localObject = (WXAppExtendObject)parama.mediaObject;
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("description: ");
    localStringBuffer.append(parama.description);
    localStringBuffer.append("\n");
    localStringBuffer.append("extInfo: ");
    localStringBuffer.append(((WXAppExtendObject)localObject).extInfo);
    localStringBuffer.append("\n");
    localStringBuffer.append("filePath: ");
    localStringBuffer.append(((WXAppExtendObject)localObject).filePath);
    localObject = new Intent(this, MeachilShareActivity.class);
    ((Intent)localObject).putExtra("showmsg_title", parama.title);
    ((Intent)localObject).putExtra("showmsg_message", localStringBuffer.toString());
    ((Intent)localObject).putExtra("showmsg_thumb_data", parama.thumbData);
    startActivity((Intent)localObject);
    finish();
  }
  
  public final void a(com.tencent.mm.sdk.openapi.b paramb)
  {
    switch (paramb.a)
    {
    case -3: 
    case -1: 
    default: 
      paramb = "errcode_unknown";
    }
    for (;;)
    {
      Toast.makeText(this, paramb, 1).show();
      return;
      paramb = "errcode_success";
      continue;
      paramb = "errcode_cancel";
      continue;
      paramb = "errcode_deny";
    }
  }
  
  public final void a(SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (paramSHARE_MEDIA == SHARE_MEDIA.QZONE) {
      com.ireadercity.b2.b.q.a(this.a, "200");
    }
    do
    {
      return;
      if (paramSHARE_MEDIA == SHARE_MEDIA.SINA)
      {
        com.ireadercity.b2.b.q.a(this.b, "200");
        return;
      }
    } while (paramSHARE_MEDIA != SHARE_MEDIA.TENCENT);
    com.ireadercity.b2.b.q.a(this.c, "200");
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131362312: 
      if ("分享".equals(this.j.getText().toString()))
      {
        r = this.i.getText() + r;
        this.h.setText("分享到");
        this.e.setVisibility(0);
        this.f.setVisibility(4);
        this.j.setText("设置");
        return;
      }
      UMServiceFactory.getUMSocialService("ireader.city", RequestType.SOCIAL).openUserCenter(this, new int[0]);
      return;
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903137);
    this.n = this;
    this.k = n.b(this.n, q);
    this.k.a(getIntent(), this);
    this.l = UMServiceFactory.getUMSocialService("ireader.city", RequestType.SOCIAL);
    if (this.o == null) {
      this.o = new ArrayList();
    }
    paramBundle = new e("QQ空间", 2130838026);
    e locale1 = new e("新浪微博", 2130838047);
    e locale2 = new e("腾讯微博", 2130838070);
    e locale3 = new e("豆瓣", 2130838001);
    e locale4 = new e("微信", 2130838192);
    e locale5 = new e("朋友圈", 2130838196);
    this.o.add(paramBundle);
    this.o.add(locale1);
    this.o.add(locale2);
    this.o.add(locale3);
    this.o.add(locale4);
    this.o.add(locale5);
    this.p = new c(this.n, this.o);
    this.d = ((ImageButton)findViewById(2131361905));
    this.d.setOnClickListener(this);
    this.e = ((ListView)findViewById(2131362313));
    this.e.setAdapter(this.p);
    this.e.setOnItemClickListener(this);
    this.f = ((RelativeLayout)findViewById(2131362197));
    this.g = ((TextView)findViewById(2131362315));
    this.h = ((TextView)findViewById(2131361822));
    this.i = ((EditText)findViewById(2131362314));
    this.j = ((Button)findViewById(2131362312));
    this.j.setOnClickListener(this);
    this.e.setVisibility(4);
    this.f.setVisibility(0);
    a();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.m = SHARE_MEDIA.QZONE;
      a(r);
      return;
    case 1: 
      this.m = SHARE_MEDIA.SINA;
      a(r);
      return;
    case 2: 
      this.m = SHARE_MEDIA.TENCENT;
      a(r);
      return;
    case 3: 
      this.m = SHARE_MEDIA.DOUBAN;
      a(r);
      return;
    case 4: 
      a(false);
      return;
    }
    a(true);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\share\MeachilShareActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */