package com.umeng.socialize.view.controller;

import android.content.Context;
import android.os.Handler;
import com.umeng.socialize.a.d;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socom.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a
{
  private static final int a = 5;
  private static final String b = a.class.getName();
  private static final int c = 1;
  private static final int d = 2;
  private static final int e = 3;
  private String f;
  private String g;
  private Context h;
  private SHARE_MEDIA i;
  private UMSocialService j;
  private com.umeng.socialize.a.b k;
  private List<UMFriend> l;
  private List<UMFriend> m;
  private Handler n;
  private a.a o;
  
  public a(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, String paramString)
  {
    this.g = paramString;
    this.h = paramContext;
    this.i = paramSHARE_MEDIA;
    this.f = d.b(this.h, paramSHARE_MEDIA);
    this.n = new b(this);
    this.j = UMServiceFactory.getUMSocialService(this.g, RequestType.SOCIAL);
    this.k = new com.umeng.socialize.a.b(this.h);
  }
  
  private List<UMFriend> a(String paramString)
  {
    paramString = this.k.a(paramString);
    if (paramString != null) {}
    try
    {
      System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
      Collections.sort(paramString, new a.b(this, null));
      return paramString;
    }
    catch (Exception paramString)
    {
      Log.b(b, "unsort friends.", paramString);
    }
    return new ArrayList();
  }
  
  private boolean a(char paramChar)
  {
    return ('@' < paramChar) && (paramChar < '[');
  }
  
  private List<UMFriend> b(String paramString)
  {
    return this.k.a(paramString, 5);
  }
  
  public void a()
  {
    this.m = b(this.f);
    if (this.o != null) {
      this.o.b(this.m);
    }
    this.l = a(this.f);
    if ((this.l == null) || (this.l.size() == 0))
    {
      this.l = null;
      b();
    }
    while (this.o == null) {
      return;
    }
    this.o.c(this.l);
  }
  
  public void a(UMFriend paramUMFriend)
  {
    if (paramUMFriend != null) {
      this.k.a(paramUMFriend);
    }
  }
  
  public void a(a.a parama)
  {
    this.o = parama;
  }
  
  public void b()
  {
    c localc = new c(this);
    this.j.getFriends(this.h, localc, this.i);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\controller\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */