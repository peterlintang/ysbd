package com.umeng.socialize.view.a;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;

public abstract class b
  extends t
{
  protected static final String e = b.class.getName();
  private boolean a = false;
  private Handler b;
  protected SocializeEntity f;
  protected UMSocialService g;
  protected b.a h;
  
  /* Error */
  public void fetchFormNet(b.a parama, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 32	com/umeng/socialize/view/a/b:a	Z
    //   6: istore 4
    //   8: iload 4
    //   10: ifeq +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: getstatic 26	com/umeng/socialize/view/a/b:e	Ljava/lang/String;
    //   19: astore 5
    //   21: new 41	com/umeng/socialize/view/a/d
    //   24: dup
    //   25: aload_0
    //   26: aload_1
    //   27: invokespecial 44	com/umeng/socialize/view/a/d:<init>	(Lcom/umeng/socialize/view/a/b;Lcom/umeng/socialize/view/a/b$a;)V
    //   30: astore_1
    //   31: aload_0
    //   32: getfield 46	com/umeng/socialize/view/a/b:f	Lcom/umeng/socialize/bean/SocializeEntity;
    //   35: getfield 51	com/umeng/socialize/bean/SocializeEntity:descriptor	Ljava/lang/String;
    //   38: getstatic 57	com/umeng/socialize/controller/RequestType:SOCIAL	Lcom/umeng/socialize/controller/RequestType;
    //   41: invokestatic 63	com/umeng/socialize/controller/UMServiceFactory:getUMSocialService	(Ljava/lang/String;Lcom/umeng/socialize/controller/RequestType;)Lcom/umeng/socialize/controller/UMSocialService;
    //   44: aload_0
    //   45: aload_1
    //   46: lload_2
    //   47: invokeinterface 69 5 0
    //   52: goto -39 -> 13
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	b
    //   0	60	1	parama	b.a
    //   0	60	2	paramLong	long
    //   6	3	4	bool	boolean
    //   19	1	5	str	String
    // Exception table:
    //   from	to	target	type
    //   2	8	55	finally
    //   16	52	55	finally
  }
  
  public void fetchFromDBElseNet(b.a parama)
  {
    try
    {
      String str = e;
      new Thread(new c(this, parama)).start();
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("dc");
    if (TextUtils.isEmpty(paramBundle))
    {
      String str = e;
      finish();
    }
    this.g = UMServiceFactory.getUMSocialService(paramBundle, RequestType.SOCIAL);
    this.f = this.g.getEntity();
    this.b = new Handler();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */