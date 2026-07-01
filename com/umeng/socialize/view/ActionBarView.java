package com.umeng.socialize.view;

import android.content.Context;
import com.umeng.socialize.view.a.h;

public class ActionBarView
  extends h
{
  public static final int ACTION_BAR_BUTTON_WIDTH = 80;
  public static final int ACTION_BAR_HEIGHT = 48;
  
  public ActionBarView(Context paramContext)
  {
    super(paramContext, "");
    h();
  }
  
  public ActionBarView(Context paramContext, String paramString)
  {
    super(paramContext, paramString);
    h();
  }
  
  private void h()
  {
    if (this.b == null) {
      setVisibility(8);
    }
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
  }
  
  /* Error */
  public void resetEntity(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 40	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: ifne +26 -> 32
    //   9: aload_0
    //   10: iconst_0
    //   11: invokevirtual 29	com/umeng/socialize/view/ActionBarView:setVisibility	(I)V
    //   14: aload_0
    //   15: aload_1
    //   16: getstatic 46	com/umeng/socialize/controller/RequestType:SOCIAL	Lcom/umeng/socialize/controller/RequestType;
    //   19: invokestatic 52	com/umeng/socialize/controller/UMServiceFactory:getUMSocialService	(Ljava/lang/String;Lcom/umeng/socialize/controller/RequestType;)Lcom/umeng/socialize/controller/UMSocialService;
    //   22: invokespecial 56	com/umeng/socialize/view/a/h:resetUMService	(Lcom/umeng/socialize/controller/UMSocialService;)V
    //   25: aload_0
    //   26: invokevirtual 59	com/umeng/socialize/view/ActionBarView:onViewLoad	()V
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: aload_0
    //   33: getfield 63	com/umeng/socialize/view/ActionBarView:a	Ljava/lang/String;
    //   36: astore_1
    //   37: goto -8 -> 29
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	ActionBarView
    //   0	45	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   2	29	40	finally
    //   32	37	40	finally
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ActionBarView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */