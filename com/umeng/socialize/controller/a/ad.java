package com.umeng.socialize.controller.a;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.umeng.socialize.a.c;
import com.umeng.socialize.a.d;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SnsAccount;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.SocializeUser;
import com.umeng.socialize.c.l;
import com.umeng.socialize.controller.listener.SocializeListeners.FetchUserListener;
import com.umeng.socialize.exception.SocializeException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ad
  extends AsyncTask<Void, Void, l>
{
  ad(aa paramaa, SocializeListeners.FetchUserListener paramFetchUserListener, z paramz, Context paramContext) {}
  
  private void a(Context paramContext, SocializeUser paramSocializeUser)
  {
    Object localObject;
    Iterator localIterator;
    if (paramSocializeUser.accounts != null)
    {
      localObject = d.a(paramContext);
      localIterator = paramSocializeUser.accounts.iterator();
      if (localIterator.hasNext()) {
        break label133;
      }
      if (((Map)localObject).size() > 0) {
        localObject = ((Map)localObject).keySet().iterator();
      }
    }
    for (;;)
    {
      if (!((Iterator)localObject).hasNext())
      {
        if (paramSocializeUser.loginAccount != null)
        {
          paramSocializeUser = SHARE_MEDIA.convertToEmun(paramSocializeUser.loginAccount.getPlatform());
          int j = 0;
          int i;
          if (c.c(paramContext))
          {
            localObject = c.b(paramContext);
            i = j;
            if (paramSocializeUser != null)
            {
              i = j;
              if (paramSocializeUser == localObject) {}
            }
          }
          else
          {
            i = 1;
          }
          if (i != 0) {
            c.a(paramContext, paramSocializeUser.toString());
          }
        }
        return;
        label133:
        SnsAccount localSnsAccount = (SnsAccount)localIterator.next();
        try
        {
          if (TextUtils.isEmpty(localSnsAccount.getUsid())) {
            break;
          }
          SHARE_MEDIA localSHARE_MEDIA = SHARE_MEDIA.convertToEmun(localSnsAccount.getPlatform());
          if ((localSHARE_MEDIA != null) && (!d.a(paramContext, localSHARE_MEDIA))) {
            d.a(paramContext, localSHARE_MEDIA, localSnsAccount.getUsid());
          }
          if ((localSHARE_MEDIA == null) || (!((Map)localObject).containsKey(localSHARE_MEDIA))) {
            break;
          }
          ((Map)localObject).remove(localSHARE_MEDIA);
        }
        catch (Exception localException)
        {
          aa.a();
        }
        break;
      }
      d.d(paramContext, (SHARE_MEDIA)((Iterator)localObject).next());
    }
  }
  
  protected l a(Void... paramVarArgs)
  {
    try
    {
      paramVarArgs = this.c.e(this.d);
      if (paramVarArgs != null) {}
      try
      {
        if ((paramVarArgs.a != null) && (this.a.getConfig().isSyncUserInfo())) {
          a(this.d, paramVarArgs.a);
        }
        return paramVarArgs;
      }
      catch (Exception localException)
      {
        aa.a();
        return paramVarArgs;
      }
      return null;
    }
    catch (SocializeException paramVarArgs)
    {
      aa.a();
      paramVarArgs.toString();
    }
  }
  
  protected void a(l paraml)
  {
    super.onPostExecute(paraml);
    if (this.b != null)
    {
      if (paraml != null) {
        this.b.onComplete(paraml.n, paraml.a);
      }
    }
    else {
      return;
    }
    this.b.onComplete(-102, null);
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if (this.b != null) {
      this.b.onStart();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */