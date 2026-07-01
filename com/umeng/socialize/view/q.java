package com.umeng.socialize.view;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.umeng.socialize.b.a;
import com.umeng.socialize.b.d;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.bean.UMLocation;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.l;
import com.umeng.socialize.common.m;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.MulStatusListener;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;
import com.umeng.socialize.media.BaseMediaObject;
import com.umeng.socialize.media.UMRichMedia;
import com.umeng.socialize.media.UMediaObject.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class q
  extends Dialog
{
  private static final String b = q.class.getName();
  private static boolean c = true;
  protected ImageView a;
  private Button d;
  private Button e;
  private EditText f;
  private SocializeListeners.MulStatusListener g;
  private SocializeEntity h;
  private ProgressDialog i;
  private CommentActivity j;
  private int k = 0;
  private a l;
  private Location m;
  private ImageButton n;
  private View o;
  private LinearLayout p;
  private UMSocialService q;
  private SocializeConfig r;
  private Map<SHARE_MEDIA, q.a> s;
  private LayoutInflater t;
  
  public q(Context paramContext, SocializeEntity paramSocializeEntity)
  {
    super(paramContext, b.a(paramContext, b.a.d, "umeng_socialize_popup_dialog"));
    this.h = paramSocializeEntity;
    this.q = UMServiceFactory.getUMSocialService(paramSocializeEntity.descriptor, RequestType.SOCIAL);
    this.j = ((CommentActivity)paramContext);
    this.r = this.q.getConfig();
    this.t = ((LayoutInflater)getContext().getSystemService("layout_inflater"));
    d();
    c();
    a(this.r);
  }
  
  private void a(SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (this.s.containsKey(paramSHARE_MEDIA)) {
      ((q.a)this.s.get(paramSHARE_MEDIA)).c.setVisibility(0);
    }
  }
  
  private void a(SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.OauthCallbackListener paramOauthCallbackListener)
  {
    this.q.doOauthVerify(this.j, paramSHARE_MEDIA, paramOauthCallbackListener);
  }
  
  private void a(SocializeConfig paramSocializeConfig)
  {
    if (paramSocializeConfig.isDefaultShareLocation()) {
      h();
    }
    Object localObject;
    for (;;)
    {
      localObject = l.a(getContext(), paramSocializeConfig);
      this.s = new HashMap();
      localObject = ((List)localObject).iterator();
      if (((Iterator)localObject).hasNext()) {
        break;
      }
      return;
      a(false);
    }
    n localn = (n)((Iterator)localObject).next();
    SHARE_MEDIA localSHARE_MEDIA = SHARE_MEDIA.convertToEmun(localn.a);
    q.a locala = new q.a(this, getContext(), localn);
    if (localn.e)
    {
      locala.b.setImageResource(localn.c);
      locala.d = true;
      locala.e = localn.g;
      if (paramSocializeConfig.isDefaultShareComment()) {
        locala.c.setVisibility(0);
      }
    }
    for (;;)
    {
      this.p.addView(locala.f);
      this.s.put(localSHARE_MEDIA, locala);
      break;
      locala.b.setImageResource(localn.d);
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.n.setVisibility(8);
      this.o.setVisibility(0);
      return;
    }
    if (this.m == null)
    {
      this.n.setImageResource(b.a(this.j, b.a.c, "umeng_socialize_location_off"));
      this.n.setVisibility(0);
      this.o.setVisibility(8);
      return;
    }
    this.n.setImageResource(b.a(this.j, b.a.c, "umeng_socialize_location_on"));
    this.n.setVisibility(0);
    this.o.setVisibility(8);
  }
  
  private boolean a(String paramString, SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (this.s.containsKey(paramSHARE_MEDIA))
    {
      ((q.a)this.s.get(paramSHARE_MEDIA)).a(paramString);
      return true;
    }
    return false;
  }
  
  private void c()
  {
    Object localObject = b;
    this.l = new a();
    localObject = new d();
    ((d)localObject).a(this.j);
    this.l.a((d)localObject);
    this.l.a(this.j);
  }
  
  private void d()
  {
    getWindow().setSoftInputMode(16);
    setContentView(b.a(this.j, b.a.a, "umeng_socialize_post_comment"));
    WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
    if (m.d(this.j))
    {
      int[] arrayOfInt = m.c(this.j);
      localLayoutParams.width = arrayOfInt[0];
      localLayoutParams.height = arrayOfInt[1];
    }
    for (int i1 = b.a(getContext(), b.a.d, "umeng_socialize_dialog_anim_fade");; i1 = b.a(getContext(), b.a.d, "umeng_socialize_dialog_animations"))
    {
      getWindow().getAttributes().windowAnimations = i1;
      getWindow().setAttributes(localLayoutParams);
      this.f = ((EditText)findViewById(b.a(this.j, b.a.b, "umeng_socialize_post_comment_edittext")));
      this.n = ((ImageButton)findViewById(b.a(this.j, b.a.b, "umeng_socialize_location_ic")));
      this.o = findViewById(b.a(this.j, b.a.b, "umeng_socialize_location_progressbar"));
      this.n.setOnClickListener(new r(this));
      this.p = ((LinearLayout)findViewById(b.a(this.j, b.a.b, "umeng_socialize_post_ws_area")));
      this.d = ((Button)findViewById(b.a(this.j, b.a.b, "umeng_socialize_title_bar_leftBt")));
      this.d.setOnClickListener(new s(this));
      this.e = ((Button)findViewById(b.a(this.j, b.a.b, "umeng_socialize_title_bar_rightBt")));
      ((TextView)findViewById(b.a(this.j, b.a.b, "umeng_socialize_title_bar_middleTv"))).setText("评论");
      this.a = ((ImageView)findViewById(b.a(this.j, b.a.b, "umeng_socialize_post_comment_previewImg")));
      this.i = new ProgressDialog(this.j);
      this.i.setProgressStyle(0);
      this.i.setMessage("发送中...");
      this.i.setCancelable(false);
      this.g = new t(this);
      this.e.setOnClickListener(new u(this));
      findViewById(b.a(this.j, b.a.b, "umeng_socialize_post_comment_fetch_img")).setOnClickListener(this.j.getReceiveImageClick());
      return;
      localLayoutParams.height = -1;
      localLayoutParams.width = -1;
    }
  }
  
  private void e()
  {
    UMComment localUMComment = f();
    if (localUMComment == null) {
      return;
    }
    Object localObject2 = this.s.keySet();
    Object localObject1 = new ArrayList();
    Object localObject3;
    if (localObject2 != null)
    {
      localObject2 = ((Set)localObject2).iterator();
      if (((Iterator)localObject2).hasNext()) {}
    }
    else
    {
      this.k = ((List)localObject1).size();
      if (this.k > 0)
      {
        localObject2 = this.h.getShareContent();
        if (!TextUtils.isEmpty((CharSequence)localObject2)) {
          localUMComment.signature = ((String)localObject2);
        }
        localObject2 = this.j.getImageBytes();
        localObject3 = this.h.getMedia();
        if (localObject2 == null) {
          break label212;
        }
        localUMComment.setMediaData(new UMRichMedia((byte[])localObject2, UMediaObject.MediaType.IMAGE));
      }
      label121:
      if (((List)localObject1).size() <= 0) {
        break label241;
      }
    }
    label212:
    label241:
    for (localObject1 = (SHARE_MEDIA[])((List)localObject1).toArray(new SHARE_MEDIA[((List)localObject1).size()]);; localObject1 = null)
    {
      this.q.postComment(this.j, localUMComment, this.g, (SHARE_MEDIA[])localObject1);
      return;
      localObject3 = (SHARE_MEDIA)((Iterator)localObject2).next();
      if (!((q.a)this.s.get(localObject3)).a()) {
        break;
      }
      ((List)localObject1).add(localObject3);
      break;
      try
      {
        localObject2 = UMRichMedia.toUMRichMedia((BaseMediaObject)localObject3);
        if (localObject2 == null) {
          break label121;
        }
        localUMComment.setMediaData((UMRichMedia)localObject2);
      }
      catch (Exception localException)
      {
        String str = b;
      }
      break label121;
    }
  }
  
  private UMComment f()
  {
    Object localObject = null;
    String str = this.f.getText().toString();
    if (TextUtils.isEmpty(str.trim())) {
      Toast.makeText(this.j, "输入内容为空...", 0).show();
    }
    UMComment localUMComment;
    do
    {
      return (UMComment)localObject;
      if (m.c(str) > 140)
      {
        Toast.makeText(this.j, "输入内容超过140个字，无法发送。", 0).show();
        return null;
      }
      localUMComment = new UMComment();
      localUMComment.text = str;
      localObject = localUMComment;
    } while (this.m == null);
    localUMComment.location = UMLocation.build(this.m);
    return localUMComment;
  }
  
  private void g()
  {
    if (this.m != null)
    {
      new AlertDialog.Builder(this.j).setMessage("是否删除位置信息？").setCancelable(false).setPositiveButton("是", new w(this)).setNegativeButton("否", new x(this)).create().show();
      return;
    }
    h();
  }
  
  private void h()
  {
    new y(this, this.l).execute(new Void[0]);
  }
  
  public void a()
  {
    this.a.setImageDrawable(null);
    this.a.setVisibility(8);
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.a.setImageBitmap(paramBitmap);
    this.a.setVisibility(0);
  }
  
  public void dismiss()
  {
    if (this.l != null) {
      this.l.a();
    }
    super.dismiss();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */