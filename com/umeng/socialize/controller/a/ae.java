package com.umeng.socialize.controller.a;

import android.content.Context;
import android.os.AsyncTask;
import com.umeng.socialize.bean.MultiStatus;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.bean.m;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;

class ae
  extends AsyncTask<Void, Void, Integer>
{
  ae(aa paramaa, SocializeListeners.SnsPostListener paramSnsPostListener, String paramString1, String paramString2, z paramz, Context paramContext, UMShareMsg paramUMShareMsg) {}
  
  protected Integer a(Void... paramVarArgs)
  {
    paramVarArgs = new m(this.c, this.d);
    Object localObject = this.e;
    Context localContext = this.f;
    UMShareMsg localUMShareMsg = this.g;
    paramVarArgs = ((z)localObject).a(localContext, new m[] { paramVarArgs }, localUMShareMsg);
    localObject = SHARE_MEDIA.convertToEmun(this.c);
    if (localObject != null)
    {
      int i = paramVarArgs.getPlatformStatus((SHARE_MEDIA)localObject);
      if (-102 == i) {
        return Integer.valueOf(paramVarArgs.getStCode());
      }
      return Integer.valueOf(i);
    }
    return Integer.valueOf(paramVarArgs.getStCode());
  }
  
  protected void a(Integer paramInteger)
  {
    super.onPostExecute(paramInteger);
    SHARE_MEDIA localSHARE_MEDIA = SHARE_MEDIA.convertToEmun(this.c);
    if (paramInteger.intValue() != 200) {
      aa.a(this.a, localSHARE_MEDIA, paramInteger);
    }
    if (this.b != null) {
      this.b.onComplete(localSHARE_MEDIA, paramInteger.intValue(), this.a.a);
    }
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if (this.b != null) {
      this.b.onStart();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */