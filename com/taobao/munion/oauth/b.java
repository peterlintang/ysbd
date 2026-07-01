package com.taobao.munion.oauth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.BaseFragment.OnFragmentFinishListener;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.ewall.ui.fragments.LockPatternFragment;
import com.taobao.munion.utils.k;
import com.taobao.munion.utils.l;
import java.net.MalformedURLException;
import java.net.URL;

public class b
  implements a
{
  public static final int d = 1;
  public static final int e = 2;
  public static final int f = 3;
  public static final int g = 1;
  Fragment a;
  Context b;
  BaseFragment.OnFragmentFinishListener c;
  private String h;
  
  public b(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public b(Context paramContext, Fragment paramFragment)
  {
    this.b = paramContext;
    this.a = paramFragment;
  }
  
  public b(Context paramContext, Fragment paramFragment, BaseFragment.OnFragmentFinishListener paramOnFragmentFinishListener)
  {
    this.b = paramContext;
    this.a = paramFragment;
    this.c = paramOnFragmentFinishListener;
  }
  
  public Bundle a(String paramString)
  {
    try
    {
      Bundle localBundle = new Bundle();
      paramString = new URL(paramString).getQuery();
      if (!l.b(paramString))
      {
        int i = paramString.indexOf("code=");
        if (i >= 0)
        {
          int j = paramString.indexOf("&");
          if (j > 0) {}
          for (paramString = paramString.substring(i + 5, j);; paramString = paramString.substring(i + 5))
          {
            localBundle.putString("code", paramString);
            return localBundle;
          }
        }
      }
      return null;
    }
    catch (MalformedURLException paramString) {}
    return null;
  }
  
  public String a()
  {
    String str = MunionConfigManager.getInstance().getTopOauthHost();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str);
    localStringBuilder.append("client_id=");
    localStringBuilder.append(MunionConfigManager.getInstance().getAppKey());
    localStringBuilder.append("&redirect_uri=");
    localStringBuilder.append(b());
    return localStringBuilder.toString();
  }
  
  public void a(int paramInt) {}
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    ((Activity)this.b).setResult(-1, paramIntent);
    ((Activity)this.b).finish();
  }
  
  public void a(Bundle paramBundle)
  {
    this.h = paramBundle.getString("code");
    paramBundle = new Bundle();
    paramBundle.putInt("pattern_type", 0);
    paramBundle.putString("code_type", this.h);
    FragmentPageManager.getInstance().pushPageForResult(LockPatternFragment.class.getName(), 1, this.c, paramBundle);
  }
  
  public String b()
  {
    return MunionConfigManager.getInstance().getTopOauthRedirectUrl();
  }
  
  public void b(int paramInt1, int paramInt2, Intent paramIntent)
  {
    ((BaseFragment)this.a).setResult(-1, paramIntent);
    this.a.getFragmentManager().popBackStack();
  }
  
  public void b(String paramString) {}
  
  public void c() {}
  
  public boolean c(String paramString)
  {
    try
    {
      String str = Uri.parse(b()).getHost();
      k.a("targetHost = " + str);
      paramString = Uri.parse(paramString);
      k.a("host = " + paramString.getHost());
      boolean bool = paramString.getHost().equals(str);
      return bool;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\oauth\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */