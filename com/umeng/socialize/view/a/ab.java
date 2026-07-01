package com.umeng.socialize.view.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.exception.SocializeException;
import com.umeng.socialize.view.b;
import com.umeng.socom.Log;

public abstract class ab
  extends g
{
  protected UMSocialService b;
  View c;
  
  public ab(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ab(Context paramContext, String paramString)
  {
    super(paramContext);
    if (!TextUtils.isEmpty(paramString)) {
      this.b = UMServiceFactory.getUMSocialService(paramString, RequestType.SOCIAL);
    }
  }
  
  protected void a(ab.a parama)
  {
    g();
    b(parama);
  }
  
  protected void b(ab.a parama)
  {
    if (this.b == null)
    {
      parama.a(new SocializeException("no entity descriptor."));
      return;
    }
    this.b.initEntity(getContext(), new ad(this, parama));
  }
  
  protected ab.a f()
  {
    return new ac(this);
  }
  
  protected void g() {}
  
  public abstract View getLoadingView();
  
  public void onViewLoad()
  {
    super.onViewLoad();
    ab.a locala = f();
    if ((this.b != null) && (this.b.getEntity().initialized))
    {
      Log.c(this.a, "entity has initialized.");
      locala.a(getActivity(), this.b);
      return;
    }
    Log.c(this.a, "entity has no initialized.");
    this.c = getLoadingView();
    if (this.c != null) {
      addView(this.c);
    }
    a(locala);
  }
  
  public void onViewLoad(UMSocialService paramUMSocialService) {}
  
  public void onViewUpdate()
  {
    super.onViewUpdate();
  }
  
  public void onViewUpdate(b paramb)
  {
    removeView(this.c);
  }
  
  public void resetUMService(UMSocialService paramUMSocialService)
  {
    this.b = paramUMSocialService;
    super.e();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */