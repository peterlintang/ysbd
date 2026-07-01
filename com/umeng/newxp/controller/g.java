package com.umeng.newxp.controller;

import android.os.Message;
import android.text.TextUtils;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.restool.a;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.common.c;
import com.umeng.newxp.common.c.b;
import com.umeng.newxp.net.i;
import com.umeng.newxp.net.j;
import com.umeng.newxp.net.k;
import com.umeng.newxp.net.n;
import com.umeng.newxp.net.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

public class g
  extends b<Void, Void, Message>
{
  static final String e = g.class.getCanonicalName();
  ExchangeDataService f;
  private final XpListenersCenter.ExchangeDataRequestListener g;
  private final int h;
  private final Map<String, Object> i;
  private final boolean j;
  
  public g(ExchangeDataService paramExchangeDataService, XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener, int paramInt, Map<String, Object> paramMap, boolean paramBoolean)
  {
    this.g = paramExchangeDataRequestListener;
    this.h = paramInt;
    this.i = paramMap;
    this.j = paramBoolean;
    this.f = paramExchangeDataService;
  }
  
  private List<Promoter> a(int[] paramArrayOfInt)
  {
    int m = new Random().nextInt(1000);
    if (this.i != null) {}
    for (Object localObject = this.i; localObject == null; localObject = this.f.getRequestInput()) {
      return null;
    }
    boolean bool;
    if (((Map)localObject).containsKey("sid")) {
      if (TextUtils.isEmpty((String)((Map)localObject).get("sid"))) {
        bool = true;
      }
    }
    for (;;)
    {
      localObject = new i().a(new n((Map)localObject));
      if (paramArrayOfInt != null) {
        if (localObject != null) {
          break label149;
        }
      }
      label149:
      for (int k = 0;; k = ((o)localObject).a)
      {
        paramArrayOfInt[0] = k;
        this.f.setupEWallMainBean(this.f, (o)localObject);
        if ((localObject != null) && (((o)localObject).q != null)) {
          break label158;
        }
        return null;
        bool = false;
        break;
      }
      label158:
      Log.c(ExchangeConstants.LOG_TAG, "   requestLive get resStr: " + ((o)localObject).q.toString());
      try
      {
        paramArrayOfInt = this.f.parseResponse((o)localObject);
        if ((paramArrayOfInt == null) || (paramArrayOfInt.size() <= 0))
        {
          if (!bool) {
            break;
          }
          this.f.removeCache();
          return null;
        }
        if ((this.j) && (((o)localObject).a == 1)) {
          this.f.saveCache(bool, ((o)localObject).q);
        }
        return paramArrayOfInt;
      }
      catch (Exception paramArrayOfInt)
      {
        Log.b(e, m + "  request from network error:", paramArrayOfInt);
        return null;
      }
      bool = true;
    }
    return null;
  }
  
  private void h()
  {
    j.b(this.f.mContext);
    if (!j.b())
    {
      new j().a(new k());
      return;
    }
    Log.a("Alimunion", "the alicookie is exist.");
  }
  
  private void i()
  {
    long l;
    if (TextUtils.isEmpty(this.f.slot_id))
    {
      String str1 = c.a(this.f.mContext, this.f);
      try
      {
        localObject1 = new h(this.f.mContext, str1);
        l = System.currentTimeMillis() - ((h)localObject1).a() - this.f.c;
        if ((this.f.b != 1) || (l <= 0L)) {
          break label237;
        }
        Object localObject2 = this.f.onUpload();
        if (localObject2 != null)
        {
          localStringBuilder = new StringBuilder();
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            String str3 = (String)((Iterator)localObject2).next();
            localStringBuilder.append(str3 + "#");
          }
        }
        return;
      }
      catch (Exception localException)
      {
        Log.b(e, "", localException);
      }
    }
    do
    {
      str2 = this.f.slot_id;
      break;
    } while (localStringBuilder.length() <= 0);
    localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    if (!TextUtils.isEmpty(str2)) {
      this.f.getClass();
    }
    ((h)localObject1).a(localStringBuilder.toString());
    ((h)localObject1).d();
    return;
    label237:
    Object localObject1 = e;
    StringBuilder localStringBuilder = new StringBuilder("no match do upload [switch=");
    if (this.f.b == 1) {}
    for (String str2 = "on";; str2 = "off        interval=")
    {
      Log.c((String)localObject1, str2 + l + "]");
      return;
    }
  }
  
  protected Message a(Void... paramVarArgs)
  {
    boolean bool2 = TextUtils.isEmpty(this.f.sessionId);
    if (bool2) {
      this.f.timeLine[0] = System.currentTimeMillis();
    }
    int[] arrayOfInt = new int[1];
    int k = this.h;
    paramVarArgs = this.f;
    boolean bool1;
    if (k == 1)
    {
      paramVarArgs = this.f;
      if (TextUtils.isEmpty(this.f.sessionId))
      {
        bool1 = true;
        paramVarArgs = paramVarArgs.requestCache(bool1, true);
        if ((paramVarArgs == null) || (paramVarArgs.size() <= 0)) {
          break label147;
        }
        arrayOfInt[0] = 1;
      }
    }
    for (;;)
    {
      if (bool2) {
        this.f.timeLine[1] = System.currentTimeMillis();
      }
      i();
      Message localMessage = new Message();
      localMessage.obj = paramVarArgs;
      localMessage.arg1 = arrayOfInt[0];
      return localMessage;
      bool1 = false;
      break;
      label147:
      arrayOfInt[0] = 0;
      continue;
      h();
      MunionConfigManager.getInstance().setContext(this.f.mContext);
      a.a(this.f.mContext);
      paramVarArgs = a(arrayOfInt);
    }
  }
  
  protected void a(Message paramMessage)
  {
    List localList;
    int k;
    int m;
    ExchangeDataService localExchangeDataService;
    if (this.g != null)
    {
      if ((paramMessage == null) || (paramMessage.obj == null)) {
        break label155;
      }
      localList = (List)paramMessage.obj;
      if (this.f.a)
      {
        k = this.f.filter(localList);
        if ((k > 0) && (this.f.newTips > 0))
        {
          m = this.f.newTips;
          k = this.f.newTips - k;
          localExchangeDataService = this.f;
          if (k <= 0) {
            break label150;
          }
        }
      }
    }
    for (;;)
    {
      localExchangeDataService.newTips = k;
      Log.c(ExchangeConstants.LOG_TAG, "new tips has changed " + m + " ===> " + this.f.newTips);
      this.g.dataReceived(paramMessage.arg1, localList);
      return;
      label150:
      k = -1;
    }
    label155:
    this.g.dataReceived(paramMessage.arg1, new ArrayList());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */