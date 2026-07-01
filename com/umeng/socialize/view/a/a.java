package com.umeng.socialize.view.a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.controller.UMSocialService;

public abstract class a
  extends ab
{
  private String d;
  private String e;
  
  public a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public a(Context paramContext, String paramString)
  {
    super(paramContext, paramString);
  }
  
  public abstract View getErrorView();
  
  public abstract View getView();
  
  public final void onViewLoad(UMSocialService paramUMSocialService)
  {
    super.onViewLoad(paramUMSocialService);
    removeAllViews();
    if ((paramUMSocialService == null) || (!paramUMSocialService.getEntity().initialized))
    {
      addView(getErrorView());
      return;
    }
    paramUMSocialService = paramUMSocialService.getEntity();
    this.d = paramUMSocialService.entityKey;
    this.e = paramUMSocialService.sessionID;
    addView(getView());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */